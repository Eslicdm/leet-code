# Hash-Based Sharding

Hash-based sharding applies a hash function to a shard key to distribute rows or objects across shards.

### Example

`ShardID = Hash(UserID) % NumberOfShards`

### When to Use

- You need even distribution for high traffic.
- Most queries use exact key lookups.
- Hot ranges are a risk with ordered keys.

### Trade-offs

| Pros | Cons |
| :-- | :-- |
| Even data distribution. | Range queries are inefficient. |
| Simple routing formula. | Adding or removing shards can require major reshuffling. |

### Related Topics

- [Consistent hashing](./consistent-hashing.md)
- [Capacity planning](../../scalability/capacity-planning.md)