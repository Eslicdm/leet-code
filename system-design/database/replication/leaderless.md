# Leaderless Replication

Leaderless replication allows multiple nodes to accept reads and writes, often using quorum rules to decide success.

### Quorum Rule

For `N` replicas, choose read quorum `R` and write quorum `W` so `R + W > N` when you need overlap between reads and writes.

### When to Use

- Write availability is more important than a single global write order.
- The system can resolve conflicts or expose eventual consistency.
- Multi-region availability matters.

### Trade-offs

| Pros | Cons |
| :-- | :-- |
| High write availability. | Conflict resolution is required. |
| No single write leader bottleneck. | Reads may need quorum coordination. |
| Works well for distributed key-value systems. | Operational behavior is harder to reason about. |

### Related Topics

- [CAP and PACELC](../../fundamentals/cap-pacelc.md)
- [Consistency models](../consistency-models.md)