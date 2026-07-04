# Amazon RDS

RDS (Relational Database Service) is a managed service for running relational databases in the cloud. It supports multiple engines and handles routine operational tasks.

### Key Features

| Feature | Description |
| :-- | :-- |
| Engines | MySQL, PostgreSQL, MariaDB, Oracle, SQL Server, and Amazon Aurora. |
| Multi-AZ | Synchronous standby in another AZ for high availability. |
| Read replicas | Asynchronous read replicas for read scaling. |
| Automated backups | Point-in-time recovery within the retention window. |
| Automated patching | Minor version patching during maintenance windows. |
| Performance Insights | Built-in database performance monitoring. |
| Encryption | At-rest and in-transit with KMS keys. |

### When to Use

- You need a managed relational database with predictable performance.
- You are running MySQL, PostgreSQL, MariaDB, Oracle, or SQL Server.
- You want automated backups, patching, and high availability.

### When Not to Use

- You need a globally distributed relational database with external consistency (consider [Spanner](../../gcp/database/spanner.md) or [CockroachDB](https://www.cockroachlabs.com/)).
- You need a key-value or document store with single-digit millisecond latency (use [DynamoDB](./dynamodb.md)).
- You need a fully serverless data warehouse (consider [BigQuery](../../gcp/database/bigquery.md)).
- You need AWS-native performance and storage with PostgreSQL or MySQL compatibility (use [Aurora](./aurora.md)).

### Pricing Model

- Pay per instance hour, storage, and data transfer.
- Reserved Instances offer significant discounts for 1 or 3 year commitments.
- Multi-AZ and read replicas double the storage and compute cost roughly.

### Trade-offs

- Pros: less operational work, automated backups, high availability, multiple engines.
- Cons: vendor lock-in to RDS APIs, scaling is not as elastic as serverless databases, costs grow with capacity.

### Practical Tips

- Use Multi-AZ for production workloads.
- Use read replicas for read-heavy workloads, but understand the eventual consistency.
- Set a sensible backup retention and test restores.
- Use Performance Insights to find slow queries.
- Use IAM database authentication to avoid static passwords in application config.

### Related

- [Aurora](./aurora.md) for AWS-native performance with MySQL or PostgreSQL
- [DynamoDB](./dynamodb.md) for managed NoSQL
- [EC2](../compute/ec2.md) if you need full control
- [System design: SQL vs NoSQL](../../../system-design/database/sql-vs-nosql.md)
- [System design: leader-follower replication](../../../system-design/database/replication/leader-follower.md)
