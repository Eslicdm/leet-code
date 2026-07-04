# SQL Database

Azure SQL Database is the Azure managed relational database service for SQL Server. It supports multiple deployment models and handles patching, backups, and high availability.

### Key Features

| Feature | Description |
| :-- | :-- |
| Deployment models | Single database, elastic pool, and managed instance. |
| Service tiers | General Purpose, Business Critical, Hyperscale. |
| Serverless | Auto-scaling compute with auto-pause. |
| Built-in HA | Automatic failover within a region. |
| Active geo-replication | Async replication to a secondary region. |
| Auto-failover groups | Automatic failover across regions. |
| Intelligent Performance | Automatic tuning, advisors, and Query Performance Insight. |
| Advanced security | Always Encrypted, data masking, vulnerability assessment, Defender for SQL. |

### When to Use

- You need a managed SQL Server database with predictable performance.
- You want automated backups, patching, and high availability.
- You want elastic pools to share resources across many databases.

### When Not to Use

- You need a globally distributed relational database with external consistency (use [Cosmos DB](./cosmos-db.md) with SQL API or consider Spanner).
- You need a NoSQL document store (use [Cosmos DB](./cosmos-db.md) with the appropriate API).
- You need an open-source relational engine such as PostgreSQL or MySQL (use Azure Database for PostgreSQL or MySQL).
- You need a fully serverless data warehouse (use Synapse or another warehouse).

### Pricing Model

- Pay per DTU (Database Transaction Unit) or vCore.
- Serverless billing is per vCore-second.
- Reserved capacity offers significant discounts.

### Trade-offs

- Pros: less operational work, automated backups, deep Azure integration.
- Cons: SQL Server compatibility can be limiting; some features require higher tiers.

### Practical Tips

- Use elastic pools for many small databases with variable load.
- Use auto-failover groups for cross-region disaster recovery.
- Use managed identity for authentication instead of SQL authentication.
- Enable Advanced Threat Protection for security monitoring.

### Related

- [Cosmos DB](./cosmos-db.md) for globally distributed NoSQL
- [Virtual Machines](../compute/virtual-machines.md) for full control
- [App Service](../compute/app-service.md) and [Functions](../compute/functions.md) for application compute
- [System design: SQL vs NoSQL](../../../system-design/database/sql-vs-nosql.md)
