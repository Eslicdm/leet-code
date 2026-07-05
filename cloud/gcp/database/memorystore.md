# Memorystore for Redis

Memorystore for Redis is a fully managed in-memory Redis service. It provides sub-millisecond latency for caching, session storage, and real-time analytics.

### Key Features

| Feature | Description |
| :-- | :-- |
| Redis protocol | Full Redis 7.x compatibility. |
| Managed service | Automated patching, failover, and backups. |
| High availability | Multi-zone replication with automatic failover. |
| Clustering | Shard data across multiple Redis instances. |
| Persistence | RDB and AOF persistence options. |
| Memorystore for Redis Cluster | Auto-scaling Redis with online resharding. |
| Private services access | Connect over private IP without public internet. |

### When to Use

- You need sub-millisecond latency for cache or session data in GCP.
- You want to cache [Firestore](../database/firestore.md) query results or [Cloud SQL](../database/cloud-sql.md) responses.
- You need a managed Redis without operational overhead.
- You need pub/sub, Lua scripting, or streams within Redis.

### When Not to Use

- Your data does not fit in memory (use [Bigtable](./bigtable.md)).
- You need a primary database with persistence (use [Cloud SQL](./cloud-sql.md)).
- You need a globally distributed database (use [Spanner](./spanner.md)).

### Pricing Model

- Pay per GB-hour of provisioned memory.
- Pay per vCPU-hour for Redis instances.
- Network charges for cross-region replication.

### Trade-offs

- Pros: sub-millisecond latency, fully managed Redis, deep GCP integration.
- Cons: data loss on failover without persistence, memory limits, cache invalidation is hard.

### Practical Tips

- Use AOF persistence for durability.
- Use clustering for horizontal scaling.
- Set TTL-based expiration to keep the cache fresh.
- Monitor hit ratio and eviction rate to right-size instances.

### Related

- [Firestore](../database/firestore.md) for document data
- [Cloud SQL](../database/cloud-sql.md) for relational data
- [Cloud Run](../compute/cloud-run.md) for serverless compute
- [System design: caching](../../../system-design/caching/README.md)
