# Circuit Breaker

The circuit breaker pattern prevents a service from repeatedly calling an unhealthy dependency and causing cascading failures.

### States

| State | Behavior |
| :-- | :-- |
| Closed | Requests flow normally while failures stay below threshold. |
| Open | Requests fail fast without calling the dependency. |
| Half-open | A limited number of trial requests test recovery. |

### When to Use

- A dependency has repeated failures or high timeout rates.
- Failed calls consume threads, connections, or queue capacity.
- The caller can return a fallback, cached response, or clear error.

### Trade-offs

- Prevents resource exhaustion and cascading outages.
- Requires good thresholds, cooldowns, and observability.
- Can reject valid traffic while the dependency is recovering.

### Related Topics

- [Timeouts](./timeouts.md)
- [Retries, backoff, and jitter](./retries-backoff-jitter.md)