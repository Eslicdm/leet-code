# Amazon Aurora

Aurora is a cloud-native relational database that is compatible with MySQL and PostgreSQL. It separates compute and storage and replicates data across three AZs for high durability.

### Key Features

| Feature | Description |
| :-- | :-- |
| MySQL and PostgreSQL compatible | Drop-in for existing MySQL and PostgreSQL applications. |
| 6-way replication | Data replicated across 3 AZs with quorum write and read. |
| Storage auto scaling | Storage grows in 10 GB increments up to 128 TB. |
| Aurora Serverless | On-demand, auto-scaling configuration for variable workloads. |
| Aurora Global Database | Cross-region replication with sub-second replica lag. |
| Read replicas | Up to 15 replicas with sub-10 ms replica lag. |
| Backtrack | Rewind a database to a previous point in time without a restore. |

### When to Use

- You want MySQL or PostgreSQL compatibility with much better performance and durability.
- You need a managed relational database that scales storage automatically.
- You want read replicas with very low lag for read-heavy workloads.
- You want a multi-region relational database with predictable replication lag.

### When Not to Use

- You need Oracle or SQL Server compatibility (use [RDS](./rds.md) for those engines).
- You need a NoSQL key-value store (use [DynamoDB](./dynamodb.md)).
- You do not need relational features (DynamoDB or another NoSQL is simpler).

### Pricing Model

- Pay per instance hour, storage consumed, and I/O requests.
- Aurora Serverless v2 charges per ACU (Aurora Capacity Unit).
- Reserved Instances offer significant discounts.
- Storage is billed only for what is used; you do not pay for pre-allocated unused space.

### Trade-offs

- Pros: MySQL and PostgreSQL compatibility, cloud-native performance, global database, serverless option.
- Cons: AWS lock-in, more expensive than RDS for small workloads, fewer engine features than Oracle or SQL Server.

### Practical Tips

- Use Aurora Serverless v2 for variable or unpredictable workloads.
- Use Global Database for cross-region disaster recovery and read scaling.
- Use Performance Insights to identify slow queries.
- Use Proxy between the application and Aurora for connection pooling and failover.

### Related

- [RDS](./rds.md) for the broader RDS service
- [DynamoDB](./dynamodb.md) for NoSQL workloads
- [S3](../storage/s3.md) for backups and exports
- [System design: SQL vs NoSQL](../../../system-design/database/sql-vs-nosql.md)
- [System design: leader-follower replication](../../../system-design/database/replication/leader-follower.md)
