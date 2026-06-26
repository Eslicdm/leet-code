# Rate Limiting

Rate limiting protects shared resources by controlling how many requests a client, user, tenant, or IP can make in a time window.

### Algorithms

| Algorithm | Best for | Trade-off |
| :-- | :-- | :-- |
| Token bucket | Allowing controlled bursts. | Needs token storage and refill logic. |
| Leaky bucket | Smoothing traffic to a steady rate. | Adds queueing latency. |
| Fixed window | Simple limits per period. | Boundary spikes can exceed intended rate. |
| Sliding window | Smoother limits near boundaries. | More expensive counters or timestamp tracking. |

### When to Use

- Prevent abuse or accidental overload.
- Enforce tenant fairness.
- Protect expensive APIs, databases, or downstream services.

### Related Topics

- [Rate limiter design problem](../design-problems/rate-limiter.md)
- [Load shedding](../scalability/load-shedding.md)