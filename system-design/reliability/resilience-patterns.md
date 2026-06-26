# Resilience Patterns

Resilience patterns combine timeouts, retries, circuit breakers, rate limits, bulkheads, and graceful degradation to keep systems usable during failure.

### Checklist

| Risk | Pattern |
| :-- | :-- |
| Slow dependency | [Timeouts](../fault-tolerance/timeouts.md) |
| Transient failure | [Retries, backoff, and jitter](../fault-tolerance/retries-backoff-jitter.md) |
| Repeated failure | [Circuit breaker](../fault-tolerance/circuit-breaker.md) |
| Client overload | [Rate limiting](../fault-tolerance/rate-limiting.md) |
| Shared pool exhaustion | [Bulkheads](../fault-tolerance/bulkheads.md) |
| System saturation | [Load shedding](../scalability/load-shedding.md) |

### When to Use

- Services call other services over a network.
- Dependencies can be slow, unavailable, or overloaded.
- Availability matters more than completing every optional operation.

### Trade-offs

- Resilience patterns reduce cascading failures.
- Poorly tuned patterns can hide incidents or reject too much traffic.
- Every pattern needs metrics and alerting.

### Related Topics

- [Observability](./observability.md)
- [Availability and reliability](../fundamentals/availability-reliability.md)