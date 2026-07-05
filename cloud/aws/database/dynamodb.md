# Amazon DynamoDB

DynamoDB is a fully managed NoSQL key-value and document database that delivers single-digit millisecond performance at any scale.

### Key Features

| Feature | Description |
| :-- | :-- |
| Key-value and document | Flexible JSON-like items with secondary indexes. |
| Single-digit ms latency | Predictable performance at any scale. |
| On-demand and provisioned | Pay per request or provision capacity with auto scaling. |
| Global tables | Multi-region replication with multi-master writes. |
| DynamoDB Streams | Change data capture for event-driven architectures. |
| TTL | Automatic item expiration. |
| PartiQL | SQL-compatible query language. |
| ACID transactions | Cross-item and cross-table transactions. |

### When to Use

- You need single-digit millisecond latency at any scale.
- The access pattern is key-based or simple range queries.
- You want a fully managed, multi-AZ, multi-region database with no servers to manage.
- You need a change data capture stream (DynamoDB Streams) for event-driven designs.

### When Not to Use

- The workload is highly relational with many joins and complex queries.
- You need ad hoc SQL analytics over large datasets.
- You need a strongly consistent multi-region database with serializable transactions (consider [Spanner](../../gcp/database/spanner.md)).
- The access pattern is a simple cache; consider [ElastiCache](./elasticache.md) or another cache.

### Pricing Model

- Pay per read and write request unit, or per GB-hour of storage.
- On-demand mode charges per request; provisioned mode charges for reserved capacity.
- Global tables multiply write costs because writes replicate to every region.
- DynamoDB Standard-IA offers lower storage cost for infrequently accessed data.

### Trade-offs

- Pros: predictable latency, fully managed, deep AWS integration, strong streaming story.
- Cons: NoSQL access patterns, no joins, hot partitions can hurt performance, costs can grow fast under heavy writes.

### Practical Tips

- Design partition keys to avoid hot partitions; use high-cardinality keys.
- Use Global Tables only when multi-region active-active is a real requirement.
- Use DynamoDB Streams with Lambda for event-driven processing.
- Use TTL to expire stale items automatically.
- Use DAX (DynamoDB Accelerator) for microsecond latency on hot reads.

### Related

- [RDS](./rds.md) for managed relational
- [Aurora](./aurora.md) for managed relational with better performance
- [S3](../storage/s3.md) for object storage and data lakes
- [ElastiCache](./elasticache.md) for in-memory caching
- [System design: leaderless replication](../../../system-design/database/replication/leaderless.md)
- [System design: SQL vs NoSQL](../../../system-design/database/sql-vs-nosql.md)
