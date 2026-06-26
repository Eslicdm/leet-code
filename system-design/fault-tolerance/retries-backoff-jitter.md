# Retries, Backoff, and Jitter

Retries can recover from transient failures, but unsafe retries can amplify overload.

### Decision Table

| Technique | Purpose |
| :-- | :-- |
| Retry | Try again after a transient failure. |
| Exponential backoff | Increase delay between attempts, such as `1s`, `2s`, `4s`. |
| Jitter | Add randomness so clients do not retry at the same time. |

### When to Use

- The operation is idempotent or has an idempotency key.
- Failures are likely transient, such as network blips or temporary throttling.
- The caller has a strict retry budget and timeout.

### Trade-offs

- Improves success rate for temporary failures.
- Can create retry storms without backoff and jitter.
- Must not retry non-idempotent writes blindly.

### Formula

`Sleep = min(MaxSleep, Base * 2^Attempt + RandomJitter)`

### Related Topics

- [Timeouts](./timeouts.md)
- [Circuit breaker](./circuit-breaker.md)