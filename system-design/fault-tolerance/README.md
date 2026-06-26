# Fault Tolerance

Fault tolerance decisions define how a system continues operating when dependencies are slow, overloaded, or unavailable.

Use this folder to choose resilience patterns that prevent local failures from becoming system-wide outages.

### Decision Path

| Problem | Start with |
| :-- | :-- |
| A dependency is repeatedly failing or timing out. | [Circuit breaker](./circuit-breaker.md) |
| Clients or tenants can overload a service. | [Rate limiting](./rate-limiting.md) |
| Transient failures need safe retry behavior. | [Retries, backoff, and jitter](./retries-backoff-jitter.md) |
| Calls can hang too long and consume resources. | [Timeouts](./timeouts.md) |
| One dependency can exhaust shared pools. | [Bulkheads](./bulkheads.md) |

### Related Topics

- [Resilience patterns](../reliability/resilience-patterns.md)
- [Rate limiter design problem](../design-problems/rate-limiter.md)
- [Load shedding](../scalability/load-shedding.md)