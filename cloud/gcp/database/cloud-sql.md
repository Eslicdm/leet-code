# Cloud SQL

Cloud SQL is the GCP managed relational database service for PostgreSQL, MySQL, and SQL Server. It handles patching, backups, replication, and high availability.

### Key Features

| Feature | Description |
| :-- | :-- |
| Engines | PostgreSQL, MySQL, SQL Server. |
| High availability | Regional persistent disks with automatic failover. |
| Read replicas | Cross-region read replicas for read scaling. |
| Automated backups and PITR | Point-in-time recovery within the retention window. |
| Automated patching | Minor version patching during maintenance windows. |
| Encryption | At-rest and in-transit with Google-managed or CMEK keys. |
| Cloud SQL Auth Proxy | Encrypted connections without configuring SSL. |
| Cloud SQL connector for Cloud Run | Authenticated connections from serverless workloads. |

### When to Use

- You need a managed relational database with PostgreSQL, MySQL, or SQL Server.
- You want automated backups, patching, and high availability.
- You need a managed database that integrates with Cloud Run, GKE, and BigQuery.

### When Not to Use

- You need a globally distributed relational database with external consistency (use [Spanner](./spanner.md)).
- You need a NoSQL document store with realtime sync (use [Firestore](./firestore.md)).
- You need a fully serverless data warehouse (use [BigQuery](./bigquery.md)).
- You need a wide-column store for huge analytical workloads (consider [Bigtable](./bigtable.md)).

### Pricing Model

- Pay per vCPU, memory, storage, and network egress.
- Sustained use discounts apply automatically.
- HA and read replicas add compute and storage cost.

### Trade-offs

- Pros: less operational work, managed HA, deep GCP integration.
- Cons: not globally distributed; can be expensive at high scale; some advanced engine features are not available.

### Practical Tips

- Enable high availability for production workloads.
- Use the Cloud SQL Auth Proxy or Cloud SQL connector for secure connections.
- Set a sensible backup retention and test restores.
- Use Query Insights for performance tuning.

### Related

- [Spanner](./spanner.md) for global relational
- [Firestore](./firestore.md) for NoSQL
- [BigQuery](./bigquery.md) for analytics
- [Bigtable](./bigtable.md) for wide-column NoSQL
- [Memorystore](./memorystore.md) for in-memory caching
- [Cloud Run](../compute/cloud-run.md) and [GKE](../compute/gke.md) for application compute
- [System design: SQL vs NoSQL](../../../system-design/database/sql-vs-nosql.md)
