# Proxies and API Gateway

Proxies and API gateways manage traffic between clients, services, and networks. An API gateway is the most common place to enforce cross-cutting policies such as authentication, rate limiting, and request shaping.

### Decision Table

| Pattern | Purpose |
| :-- | :-- |
| Forward proxy | Acts on behalf of clients reaching external services. |
| Reverse proxy | Acts on behalf of servers receiving client traffic. |
| API gateway | Central entry point for routing, auth, rate limits, and protocol translation. |

### Forward vs Reverse Proxy

```
[Client] ---> [Forward Proxy] ---> [Internet] ---> [Server]
                                              ^
[Client] ---> [Reverse Proxy / API Gateway] ---+
                       |
                       v
              [Service A] [Service B] [Service C]
```

- `Forward proxy`: clients route through it to reach the outside world. Common in corporate networks, scraping setups, and egress filtering.
- `Reverse proxy`: clients send traffic to a single public endpoint that forwards to internal services. Common as a TLS terminator, load balancer, or gateway.

### Why an API Gateway

A gateway collapses cross-cutting concerns into one place:

- Routing and path rewriting.
- Authentication and authorization.
- Rate limiting and quotas.
- Request and response transformation.
- TLS termination, retries, and circuit breaking.
- Protocol translation, for example HTTP to gRPC.
- Centralized logging, metrics, and tracing.

Without a gateway, every service reimplements the same concerns in slightly different ways.

### When to Use

- Multiple backend services need one public entry point.
- Cross-cutting concerns such as authentication, rate limiting, TLS, or routing should be centralized.
- Clients should not know internal service topology.
- Different clients (mobile, web, partners) need different shapes of the same API.

### Rate Limiting at the Gateway

Rate limiting is one of the highest-leverage reasons to use a gateway. Every request already passes through it, so limits are enforced in one place instead of inside every service.

#### Why rate limit at the gateway

- Single enforcement point: limits are consistent across services and clients.
- Protects the whole backend at once, not just one service.
- Lets you expose different limits per client tier, route, or API key.
- Avoids duplicating limiter code in every service.

#### What the gateway needs to know

| Input | Why it matters |
| :-- | :-- |
| Client identity | User, tenant, API key, IP, or JWT claim used as the limit key. |
| Route or endpoint | Different routes can have different limits. |
| Algorithm | Token bucket, leaky bucket, fixed window, or sliding window. |
| Storage | In-process counters, Redis, or distributed counter service. |
| Behavior on limit | Reject, queue, delay, or degrade. |
| Headers returned | `X-RateLimit-Limit`, `X-RateLimit-Remaining`, `X-RateLimit-Reset`, and `Retry-After`. |

#### Algorithm choice at the gateway

| Algorithm | Best for at the gateway | Trade-off |
| :-- | :-- | :-- |
| Token bucket | Public APIs that allow controlled bursts. | Needs refill state per key. |
| Leaky bucket | Smoothing traffic to a steady rate. | Adds queueing latency. |
| Fixed window | Simple global limits. | Boundary spikes can exceed the intended rate. |
| Sliding window | Smoother enforcement near boundaries. | More expensive counters or timestamp tracking. |

#### Tiered limits

Most gateways enforce limits at several layers:

```
Client identity (per API key or user)
    -> Route limit (per endpoint)
        -> Tenant limit (per organization)
            -> Global gateway limit (total throughput)
```

When a request fails any layer, it is rejected with `429 Too Many Requests` plus `Retry-After`.

#### Practical concerns

| Concern | Approach |
| :-- | :-- |
| Distributed state | Use Redis or another shared store so limits apply across gateway instances. |
| Hot keys | One noisy client should not pin a Redis node. Use sharded counters or local pre-limits plus a global limit. |
| Auth dependency | Rate limit before expensive auth work when possible, or use cheap pre-limits on IP and then per-user limits after auth. |
| Observability | Emit metrics for allowed, throttled, and queued requests, broken down by tier. |
| Failure mode | If the limiter store is unavailable, prefer fail open with degraded limits over a full outage, or fail closed for abuse-prone endpoints. |

### Trade-offs

- Simplifies clients and centralizes policy.
- Becomes a single entry point: must be scaled, monitored, and made highly available.
- Too much business logic in the gateway creates coupling and bloat.
- Centralized rate limiting depends on a shared store; that store is itself a critical dependency.

### Common Implementations

| Tool | Notes |
| :-- | :-- |
| `NGINX` | Reverse proxy, TLS termination, basic rate limiting. |
| `Envoy` | Service proxy with rich rate limit, retry, and circuit breaker filters. |
| `Kong` | API gateway built on NGINX with plugins for auth, rate limits, and observability. |
| `AWS API Gateway`, `GCP API Gateway`, `Azure API Management` | Managed gateways with built-in limits, auth, and metrics. |
| `Traefik` | Cloud-native reverse proxy and gateway. |

### Related Topics

- [Load balancing](./load-balancing.md)
- [Auth](../security/auth.md)
- [Rate limiter design](../design-problems/rate-limiter.md)
- [Service discovery and consensus](./service-discovery-consensus.md)
