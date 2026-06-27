# Database Sharding

Sharding decisions define how data is partitioned across nodes so storage and traffic can grow beyond one database instance.

### Decision Path

| Requirement | Start with |
| :-- | :-- |
| You need even distribution across many shards. | [Hash-based sharding](./hash-based.md) |
| You need efficient ordered or range queries. | [Range-based sharding](./range-based.md) |
| You need to add or remove nodes with less key movement. | [Consistent hashing](./consistent-hashing.md) |

### Related Topics

- [Capacity planning](../../scalability/capacity-planning.md)
- [Indexing](../indexing.md)
- [Consistency models](../consistency-models.md)