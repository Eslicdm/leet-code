# Indexing

Indexes speed up reads by maintaining lookup structures, but they add write cost and storage overhead.

### Decision Table

| Index type | Best for | Trade-off |
| :-- | :-- | :-- |
| B-tree | Range queries and ordered scans. | Extra write and storage overhead. |
| Hash index | Equality lookups. | Poor range-query support. |
| LSM-tree | Write-heavy workloads. | Read amplification and compaction cost. |
| Composite index | Queries filtering by multiple columns. | Must match query order and selectivity. |

### When to Use

- Queries frequently filter, sort, or join by specific fields.
- The indexed field has enough selectivity.
- Read latency matters more than extra write overhead.

### Trade-offs

- Too few indexes cause table scans.
- Too many indexes slow writes and increase storage.
- Index design must follow actual query patterns.

### Related Topics

- [SQL vs NoSQL](./sql-vs-nosql.md)
- [Range-based sharding](./sharding/range-based.md)