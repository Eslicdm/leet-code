# Rate Limiter Design

A rate limiter controls request volume per user, IP, tenant, API key, or route. It protects shared resources, enforces fairness, and keeps abusive or runaway clients from taking a system down.

### Core Requirements

- Enforce limits accurately enough for the business case.
- Return clear errors when limits are exceeded.
- Work across multiple application instances.
- Avoid becoming the bottleneck.
- Survive its own dependency failures without taking down the service.

### Key Decisions

| Decision | Options |
| :-- | :-- |
| Algorithm | Token bucket, leaky bucket, fixed window, sliding window. |
| Storage | In-memory, Redis, distributed counters, local plus global hybrid. |
| Scope | User, tenant, IP, API key, route, or combination. |
| Behavior | Reject, delay, degrade, or queue. |

### Algorithms

#### Token Bucket

A bucket holds tokens up to a capacity. Tokens are added at a fixed refill rate. Each request consumes one token. If the bucket is empty, the request is rejected.

```
Bucket capacity: 10
Refill rate:     1 token / second

Time 0s:  bucket = 10  -> 10 requests allowed at full burst
Time 9s:  bucket =  1  -> burst spent
Time 10s: bucket = 2   -> steady state, ~1 req/s
```

- Best for: APIs that should allow controlled bursts, then settle at a steady rate.
- Pros: smooth steady-state with graceful bursts; simple state per key.
- Cons: needs refill logic, must store last refill timestamp and current token count.

#### Leaky Bucket

Requests enter a queue. The queue is drained at a constant rate. The bucket has a fixed capacity. When full, requests are rejected.

```
Requests --> [ Queue (capacity N) ] --> Worker drains at rate R
```

- Best for: smoothing bursty traffic into a steady output rate, such as a downstream API that cannot tolerate spikes.
- Pros: very smooth output rate, simple to reason about.
- Cons: queueing adds latency; bursts above capacity are dropped, not delayed.

#### Fixed Window Counter

Time is divided into fixed windows, such as one minute. Each window has a counter per key. When the counter reaches the limit, requests are rejected until the next window.

```
Window 12:00:00 - 12:01:00   limit 100/min
   request -> counter +1
   counter == 100 -> reject
Window 12:01:00 - 12:02:00   counter resets to 0
```

- Best for: simple global limits, dashboards, very high scale where approximate is fine.
- Pros: trivial to implement, cheap storage, easy to reason about.
- Cons: boundary spikes. A client can send `limit` requests in the last second of one window and `limit` more in the first second of the next, doubling the intended rate.

#### Sliding Window Counter

Two flavors solve the boundary problem:

- Sliding window log: store the timestamp of every request in a sorted set, count those in the last `N` seconds.
- Sliding window approximation: weight the current window counter and the previous window counter by how much of the sliding window they cover.

```
   Window N-1     Window N
   [==========]   [====    ]

Sliding count ~= prev_count * (1 - elapsed_in_current / window_size) + current_count
```

- Best for: smooth enforcement at the boundary, billing or abuse prevention.
- Pros: accurate, no boundary spikes.
- Cons: more expensive. Logs need timestamp storage; approximations still need both windows' counters.

#### Algorithm Comparison

| Algorithm | Burst behavior | Boundary spikes | Storage cost | Best for |
| :-- | :-- | :-- | :-- | :-- |
| Token bucket | Allows controlled bursts. | No. | Tokens and timestamp per key. | Public APIs with bursty clients. |
| Leaky bucket | Smooths to a steady rate. | Drops excess. | Queue size and rate. | Protecting a fixed-rate downstream. |
| Fixed window | Allows bursts within window. | Yes, at boundaries. | One counter per key per window. | Cheap global limits. |
| Sliding window | Smooth near boundaries. | No. | Log of timestamps or two counters per key. | Accurate enforcement, billing. |

### Storage

Storage is the most operationally important decision. The algorithm only works if the counters are visible to every instance that handles traffic.

| Storage | Pros | Cons | Best for |
| :-- | :-- | :-- | :-- |
| In-memory (per instance) | Fast, no network. | Each instance counts separately, so effective limit is `N * limit`. | Single-instance apps, soft caps. |
| Redis | Shared across instances, low latency, atomic counters and Lua scripts. | Extra dependency, hot key risk on a single Redis node. | Most multi-instance services. |
| Distributed counter service | Scales for very high QPS, regional. | More moving parts, higher latency. | Very large platforms. |
| Local plus global hybrid | Local fast limit plus shared global limit. | More complex, two-tier logic. | Protecting Redis from being the bottleneck. |

#### Practical Storage Tips

- Use Redis atomic operations such as `INCR` and `EXPIRE` for fixed windows.
- Use a Lua script for token bucket to make the read-modify-write atomic.
- Avoid serializing a hot counter through application code; let the storage do the increment.
- For very hot keys, shard counters across keys (`{prefix}:{hash}:{window}`) and aggregate on read.
- Always set an expiration so old counters do not leak memory.

### Scope

The limit key decides who is being limited. Multiple scopes are usually stacked.

| Scope | Use for |
| :-- | :-- |
| IP | Stopping unauthenticated abuse and scrapers. |
| API key | Public API tiers and partner quotas. |
| User | Logged-in customer fairness. |
| Tenant | Multi-tenant SaaS plans. |
| Route or endpoint | Protecting expensive or risky operations. |
| Global | Guarding total system capacity. |

A common order: cheap per-IP limit first, then per-user or per-key limit after authentication, then per-route limit, then a global safety limit.

### Behavior on Limit

| Behavior | When to use |
| :-- | :-- |
| Reject with `429` and `Retry-After` | Most public APIs. Fast and unambiguous. |
| Queue or delay | Internal callers, batch jobs, low-priority traffic. |
| Degrade the response | Return a smaller or cheaper response, like a cached or partial result. |
| Charge overage | Paid tiers with a metered plan. |

Always return rate-limit headers so clients can self-regulate:

| Header | Meaning |
| :-- | :-- |
| `X-RateLimit-Limit` | Allowed requests in the current window. |
| `X-RateLimit-Remaining` | Requests still available. |
| `X-RateLimit-Reset` | When the window resets, in seconds or a timestamp. |
| `Retry-After` | Seconds the client should wait before retrying. |

### When to Use

- Any public API where abuse, scraping, or runaway clients are possible.
- Multi-tenant systems where one tenant must not starve others.
- Internal services that protect shared resources like databases, queues, or expensive models.
- A gateway or load balancer needs to enforce tier-based quotas.

### When Not to Use

- A simple per-user quota is enough and can live in the database.
- The traffic is internal, trusted, and well below capacity.
- Limits are loose and approximate; in that case, a coarse global throttle is simpler.

### Trade-offs

- A good rate limiter reduces incidents and improves fairness.
- A bad rate limiter causes false rejections, hot keys, or new bottlenecks.
- Adding a centralized limiter store makes that store a critical dependency: design for failure mode.

### Failure Modes

| Failure | Recommendation |
| :-- | :-- |
| Limiter store is slow | Add a local pre-limit so slow calls do not pile up. |
| Limiter store is down | Prefer fail open with degraded limits on user-facing APIs; prefer fail closed on abuse-prone endpoints. |
| Clock skew across instances | Use server-side time, such as Redis `TIME`, instead of local clocks. |
| Sudden traffic spike | Combine the limiter with circuit breakers, bulkheads, and load shedding. |

### Related Topics

- [Load shedding](../scalability/load-shedding.md)
- [Bulkheads](../fault-tolerance/bulkheads.md)
- [Circuit breaker](../fault-tolerance/circuit-breaker.md)
- [Proxies and API gateway](../communication/proxies-api-gateway.md)
- [Auth](../security/auth.md)
