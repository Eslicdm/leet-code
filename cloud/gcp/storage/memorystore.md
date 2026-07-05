# Memorystore

Memorystore is a managed in-memory caching service supporting Redis and Memcached. It provides sub-millisecond latency for read-heavy workloads.

### Key Features

| Feature | Description |
| :-- | :-- |
| Redis and Memcached | Choose the engine that fits your use case. |
| Managed service | Automated patching, failover, and backups. |
| High availability | Multi-zone replication with automatic failover. |
| Scaling | Vertical scaling without downtime; clustering for Redis. |
| Authentication | Auth token and network isolation with VPC. |
| Encryption | At rest and in transit. |

### When to Use

- You need sub-millisecond read latency for hot data in GCP.
- You want to cache [Firestore](../database/firestore.md) query results, [Cloud SQL](../database/cloud-sql.md) responses, or API results.
- You need a managed Redis or Memcached without operational overhead.
- You need session storage for web applications.

### When Not to Use

- Your data does not fit in memory (use [Firestore](../database/firestore.md) or [Bigtable](../database/bigtable.md)).
- You need a primary database with persistence (use [Cloud SQL](../database/cloud-sql.md)).
- You need a globally distributed database (use [Spanner](../database/spanner.md)).

### Pricing Model

- Pay per GB-hour of provisioned memory.
- Pay per vCPU-hour for Redis instances.
- Networking charges for cross-region replication.

### Trade-offs

- Pros: sub-millisecond latency, managed Redis/Memcached, deep GCP integration.
- Cons: data loss on failover without persistence, memory limits, cache invalidation is hard.

### Practical Tips

- Use Redis for complex data structures; use Memcached for simple key-value caching.
- Set TTL-based expiration to keep the cache fresh.
- Monitor hit ratio and eviction rate to right-size instances.
- Use private services access for secure connectivity.

### Related

- [Firestore](../database/firestore.md) for document data
- [Cloud SQL](../database/cloud-sql.md) for relational data
- [Cloud Run](../compute/cloud-run.md) for serverless compute
- [System design: caching](../../../system-design/caching/README.md)
