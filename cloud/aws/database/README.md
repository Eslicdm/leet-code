# AWS Database

Database services cover managed relational, NoSQL, and data warehouse engines.

### Decision Path

| Need | Start with |
| :-- | :-- |
| Run a managed relational database (MySQL, PostgreSQL, SQL Server, Oracle). | [RDS](./rds.md) |
| Run a high-performance AWS-native relational engine. | [Aurora](./aurora.md) |
| Run a managed NoSQL key-value store with single-digit millisecond latency. | [DynamoDB](./dynamodb.md) |

### When to Use AWS Database

- You want AWS to handle patching, backups, and high availability.
- You need predictable performance with managed scaling.
- You can accept a managed-service trade-off in exchange for less operational work.

### Related

- [AWS compute services](../compute/)
- [AWS storage services](../storage/)
- [System design: SQL vs NoSQL](../../../system-design/database/sql-vs-nosql.md)
