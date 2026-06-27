# Database Replication

Replication decisions define how database copies stay available, how reads scale, and what consistency guarantees users observe.

### Decision Path

| Requirement | Start with |
| :-- | :-- |
| You need one primary writer and read replicas. | [Leader-follower replication](./leader-follower.md) |
| You need higher write availability with quorum reads/writes. | [Leaderless replication](./leaderless.md) |

### Related Topics

- [Consistency models](../consistency-models.md)
- [SQL vs NoSQL](../sql-vs-nosql.md)
- [Disaster recovery](../../reliability/disaster-recovery.md)