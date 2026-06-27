# Load Shedding

Load shedding intentionally rejects, delays, or degrades work when a system is overloaded so critical paths can survive.

### When to Use

- Queues, CPU, memory, threads, or database connections are near exhaustion.
- Serving all traffic would cause a full outage.
- Some requests are less important than others.

### Strategies

| Strategy | Use when |
| :-- | :-- |
| Reject early | The system is saturated and must fail fast. |
| Prioritize traffic | Premium, internal, or critical operations matter most. |
| Degrade features | Optional expensive work can be skipped. |
| Queue with limits | Short bursts can be absorbed safely. |

### Trade-offs

- Protects core availability during spikes.
- Requires clear prioritization rules.
- Users may see errors, degraded results, or delayed work.

### Related Topics

- [Rate limiter design](../design-problems/rate-limiter.md)
- [Capacity planning](./capacity-planning.md)