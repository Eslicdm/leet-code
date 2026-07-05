# Azure Cache for Redis

Azure Cache for Redis is a managed in-memory caching service based on Redis. It provides sub-millisecond latency for read-heavy workloads.

### Key Features

| Feature | Description |
| :-- | :-- |
| Redis protocol | Full Redis 6.x and 7.x compatibility. |
| Managed service | Automated patching, failover, and backups. |
| High availability | Active geo-replication across regions. |
| Clustering | Shard data across multiple nodes. |
| Persistence | RDB and AOF persistence options. |
| Enterprise tier | Flash storage, active geo-replication, and Redis modules. |
| Private endpoints | Connect over private IP without public internet. |

### When to Use

- You need sub-millisecond latency for cache or session data in Azure.
- You want to cache [Cosmos DB](../database/cosmos-db.md) or [SQL Database](../database/sql-database.md) query results.
- You need a managed Redis without operational overhead.
- You need pub/sub, Lua scripting, or Streams within Redis.

### When Not to Use

- Your data does not fit in memory (use [Cosmos DB](../database/cosmos-db.md) or [Blob Storage](../storage/blob-storage.md)).
- You need a primary database with persistence (use [SQL Database](../database/sql-database.md)).
- You need a globally distributed database (use [Cosmos DB](../database/cosmos-db.md)).

### Pricing Model

- Pay per tier and per vCPU/memory allocation.
- Basic, Standard, Premium, Enterprise, and Enterprise Flash tiers.
- Data transfer charges for geo-replication.

### Trade-offs

- Pros: sub-millisecond latency, fully managed Redis, deep Azure integration.
- Cons: data loss on failover without persistence, memory limits, cache invalidation is hard.

### Practical Tips

- Use Standard or Premium for production workloads with replication.
- Use Enterprise for active geo-replication and Flash storage.
- Set TTL-based expiration to keep the cache fresh.
- Monitor hit ratio and eviction rate to right-size instances.

### Related

- [Cosmos DB](../database/cosmos-db.md) for globally distributed NoSQL
- [SQL Database](../database/sql-database.md) for relational data
- [Functions](../compute/functions.md) for serverless compute
- [System design: caching](../../../system-design/caching/README.md)
