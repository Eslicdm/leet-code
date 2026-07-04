# GCP Database

Database services cover managed relational, NoSQL, globally distributed, and data warehouse engines.

### Decision Path

| Need | Start with |
| :-- | :-- |
| Run a managed relational database (PostgreSQL, MySQL, SQL Server). | [Cloud SQL](./cloud-sql.md) |
| Run a globally distributed relational database with strong external consistency. | [Spanner](./spanner.md) |
| Run a managed NoSQL document store with realtime sync. | [Firestore](./firestore.md) |
| Run a serverless data warehouse. | [BigQuery](./bigquery.md) |

### When to Use GCP Database

- You want a managed service with automated backups and patching.
- You need a globally distributed database (Spanner) or realtime document sync (Firestore).
- You want a serverless analytics engine that separates storage and compute (BigQuery).

### Related

- [GCP compute services](../compute/)
- [GCP storage services](../storage/)
- [System design: SQL vs NoSQL](../../../system-design/database/sql-vs-nosql.md)
- [System design: consistency models](../../../system-design/database/consistency-models.md)
