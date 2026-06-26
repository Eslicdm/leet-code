# Vertical Scaling

Vertical scaling, or scale-up, adds more CPU, memory, disk, or network capacity to one machine.

### When to Use

- The system is early-stage and simplicity matters more than maximum scale.
- One machine can still handle the expected workload safely.
- You need a short-term capacity increase without architecture changes.

### Trade-offs

| Pros | Cons |
| :-- | :-- |
| Simple to implement. | Hard hardware ceiling. |
| No network latency between local components. | Single point of failure if not replicated. |
| Easier data consistency. | High-end machines become expensive quickly. |

### Example

Upgrade a database host from `8 CPU / 32 GB RAM` to `32 CPU / 128 GB RAM` before introducing sharding.

### Related Topics

- [Horizontal scaling](./horizontal.md)
- [Performance metrics](../fundamentals/performance-metrics.md)