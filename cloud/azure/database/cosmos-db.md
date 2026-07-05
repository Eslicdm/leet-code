# Cosmos DB

Azure Cosmos DB is a globally distributed, multi-model NoSQL database. It offers turnkey global distribution, multiple consistency models, and predictable single-digit millisecond performance.

### Key Features

| Feature | Description |
| :-- | :-- |
| Global distribution | Multi-region writes and automatic replication. |
| Multi-model | SQL API, MongoDB API, Cassandra API, Gremlin API, and Table API. |
| Five consistency models | Strong, bounded staleness, session, consistent prefix, eventual. |
| Single-digit ms latency | Predictable performance at any scale. |
| Automatic and manual scaling | Provisioned throughput (RU/s) or autoscale. |
| Serverless | Pay per request for low-traffic workloads. |
| Change feed | Stream of changes for event-driven architectures. |
| Integrated cache | Built-in cache for read-heavy workloads. |
| Analytical store | Columnar store for HTAP scenarios with Synapse. |

### When to Use

- You need a globally distributed database with low latency at any scale.
- You want multiple consistency models to choose from per workload.
- You need a multi-model API to match existing skills or schemas.
- You need a change feed for event-driven architectures.

### When Not to Use

- You need a strong SQL Server with relational features (use [SQL Database](./sql-database.md)).
- You need an open-source relational engine such as PostgreSQL or MySQL.
- You need a simple key-value cache (use [Azure Cache for Redis](./azure-cache-for-redis.md)).
- You do not need global distribution and want a cheaper regional option.

### Pricing Model

- Pay per Request Unit (RU) consumed, or per million operations in serverless.
- Multi-region writes multiply write cost.
- Reserved capacity offers discounts.

### Trade-offs

- Pros: global distribution, multiple consistency models, single-digit ms latency, multi-model APIs.
- Cons: RU model can be hard to size; cross-region writes are expensive; query features vary by API.

### Practical Tips

- Use the SQL API for new applications unless you have a specific reason to use another API.
- Use session consistency for most workloads; use strong consistency only when required.
- Use change feed with Functions or Stream Analytics for event-driven designs.
- Use autoscale provisioned throughput for variable workloads.

### Related

- [SQL Database](./sql-database.md) for SQL Server workloads
- [Functions](../compute/functions.md) and [Container Apps](../compute/container-apps.md) for event handlers
- [Blob Storage](../storage/blob-storage.md) for large blobs
- [Azure Cache for Redis](./azure-cache-for-redis.md) for in-memory caching
- [System design: SQL vs NoSQL](../../../system-design/database/sql-vs-nosql.md)
- [System design: consistency models](../../../system-design/database/consistency-models.md)
