# Amazon ElastiCache

ElastiCache is a managed in-memory caching service supporting Redis and Memcached. It provides sub-millisecond latency for read-heavy workloads.

### Key Features

| Feature | Description |
| :-- | :-- |
| Redis and Memcached | Choose the engine that fits your use case. |
| Managed service | Automated patching, backups, and failover. |
| clustering | Redis cluster mode for horizontal sharding. |
| replication | Redis replicas for read scaling and failover. |
| Serverless | Auto-scales capacity without managing nodes. |
| Global Datastore | Cross-region Redis replication. |
| Encryption | At rest and in transit with TLS. |

### When to Use

- You need sub-millisecond read latency for hot data.
- You want to cache database query results, session data, or API responses.
- You need a managed Redis or Memcached cluster without operational overhead.
- You need pub/sub messaging within Redis (ElastiCache for Redis supports Streams and pub/sub).

### When Not to Use

- Your data does not fit in memory (use [DynamoDB](./dynamodb.md) or [S3](../storage/s3.md)).
- You need a primary database with persistence (use [RDS](./rds.md) or [Aurora](./aurora.md)).
- You need a globally distributed database with strong consistency (use [DynamoDB Global Tables](./dynamodb.md) or [Spanner](../../gcp/database/spanner.md)).

### Pricing Model

- Pay per node-hour for provisioned clusters.
- Serverless mode: pay per EPU-hour (ElastiCache Processing Unit).
- Storage charges apply for snapshots.

### Trade-offs

- Pros: sub-millisecond latency, managed Redis/Memcached, easy to add to existing architectures.
- Cons: data loss on failover without persistence, memory limits, cache invalidation is hard.

### Practical Tips

- Use read replicas to scale read-heavy workloads.
- Use TTL-based expiration to keep the cache fresh.
- Use cluster mode to shard large datasets across multiple nodes.
- Monitor eviction rate and hit ratio to right-size the cluster.

### Related

- [DynamoDB](./dynamodb.md) for primary NoSQL database
- [RDS](./rds.md) for primary relational database
- [Lambda](../compute/lambda.md) for serverless compute
- [System design: caching](../../../system-design/caching/README.md)
