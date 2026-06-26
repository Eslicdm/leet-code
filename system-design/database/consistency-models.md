# Consistency Models

Consistency models define what values reads are allowed to return after writes in distributed systems.

### Decision Table

| Model | Guarantee | Cost |
| :-- | :-- | :-- |
| Strong consistency | Reads return the most recent write. | Higher latency and coordination. |
| Eventual consistency | Replicas converge if no new writes occur. | Temporary stale reads. |
| Read-your-writes | A client sees its own updates on later reads. | Session affinity or metadata tracking. |

### When to Use

- Use strong consistency for money, inventory, permissions, and unique constraints.
- Use eventual consistency for feeds, counters, analytics, and denormalized views.
- Use read-your-writes for user profile changes and UX-sensitive updates.

### Related Topics

- [CAP and PACELC](../fundamentals/cap-pacelc.md)
- [Leaderless replication](./replication/leaderless.md)