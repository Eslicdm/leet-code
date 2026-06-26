# Timeouts

Timeouts bound how long callers wait for a dependency so slow calls do not exhaust resources.

### When to Use

- Calling databases, external APIs, queues, caches, or internal services.
- Requests have user-facing latency budgets.
- Hanging calls can consume threads, sockets, or connection pools.

### Decision Table

| Timeout | Purpose |
| :-- | :-- |
| Connection timeout | Bound time spent establishing a connection. |
| Read timeout | Bound time waiting for a response. |
| Request deadline | Bound the full operation across retries and dependencies. |
| Idle timeout | Close unused long-lived connections. |

### Trade-offs

- Too short creates false failures.
- Too long causes resource exhaustion and poor user experience.
- Timeouts should align with retry budgets and upstream deadlines.

### Related Topics

- [Retries, backoff, and jitter](./retries-backoff-jitter.md)
- [Circuit breaker](./circuit-breaker.md)