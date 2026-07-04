# Cloud Spanner

Spanner is a globally distributed, strongly consistent, relational database service. It combines the horizontal scale of NoSQL with the SQL, ACID transactions, and schema of a relational database.

### Key Features

| Feature | Description |
| :-- | :-- |
| Global strong consistency | External consistency across regions with TrueTime. |
| Horizontal scaling | Scale to thousands of nodes with automatic sharding. |
| SQL with ACID transactions | Standard ANSI SQL with serializable isolation. |
| Multi-region and regional | Choose regional for low latency, multi-region for global HA. |
| Schemas and DDL | Schema management with online DDL. |
| Interleaved tables | Co-locate parent and child rows for performance. |
| Client libraries | Java, Go, Python, Node.js, C#, Ruby, PHP, and a REST API. |

### When to Use

- You need a relational database that scales globally with strong consistency.
- You need serializable transactions across regions.
- You need a managed database with no operational sharding work.

### When Not to Use

- You do not need global scale or external consistency (use [Cloud SQL](./cloud-sql.md)).
- You need a NoSQL document store (use [Firestore](./firestore.md)).
- You need a fully serverless data warehouse (use [BigQuery](./bigquery.md)).
- You cannot tolerate the cost of running a globally distributed system.

### Pricing Model

- Pay per node hour, storage, and network egress.
- Multi-region configurations cost more than regional.
- Sustained use discounts are not available; committed use discounts are limited.

### Trade-offs

- Pros: globally distributed, strong consistency, horizontal scale, SQL.
- Cons: expensive; not as cheap as a regional relational database; schema design and interleaving require care.

### Practical Tips

- Use the PostgreSQL interface for new applications if you do not need GoogleSQL-specific features.
- Design schemas with primary key locality to avoid hot spots.
- Use interleaved tables for parent-child relationships that need to be co-located.
- Monitor with Cloud Monitoring and Spanner query statistics.

### Related

- [Cloud SQL](./cloud-sql.md) for regional relational
- [Firestore](./firestore.md) for NoSQL
- [BigQuery](./bigquery.md) for analytics
- [System design: SQL vs NoSQL](../../../system-design/database/sql-vs-nosql.md)
- [System design: consistency models](../../../system-design/database/consistency-models.md)
