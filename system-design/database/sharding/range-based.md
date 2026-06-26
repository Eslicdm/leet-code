# Range-Based Sharding

Range-based sharding partitions data by ordered value ranges, such as user ID, timestamp, or region.

### Example

- Shard 1: user IDs `1-10000`
- Shard 2: user IDs `10001-20000`

### When to Use

- Range queries are common.
- Data naturally groups by time, geography, or ordered ID.
- Operational teams need understandable shard boundaries.

### Trade-offs

| Pros | Cons |
| :-- | :-- |
| Efficient range scans. | Can create hot shards. |
| Easy to understand and operate. | Requires careful split and rebalance strategy. |

### Related Topics

- [Hash-based sharding](./hash-based.md)
- [Indexing](../indexing.md)