# BigQuery

BigQuery is a serverless, highly scalable data warehouse with a separated storage and compute architecture. It supports standard SQL and integrates with the rest of the GCP data and ML ecosystem.

### Key Features

| Feature | Description |
| :-- | :-- |
| Serverless | No infrastructure to manage for storage or query. |
| Standard SQL | ANSI SQL with support for complex types, joins, and window functions. |
| Separated storage and compute | Scale storage and query independently. |
| Columnar storage | Optimized for analytical scans. |
| Slot-based and on-demand pricing | Choose on-demand or flat-rate slots. |
| BigQuery ML | Train and use machine learning models with SQL. |
| BI Engine | In-memory analysis service for sub-second queries. |
| Omni | Run BigQuery queries on data in other clouds. |
| Materialized views | Pre-computed query results that are kept up to date. |

### When to Use

- You need a serverless data warehouse for analytics.
- You have a columnar analytical workload with large scans and aggregations.
- You want built-in ML and BI integrations.
- You want pay-per-query or flat-rate pricing.

### When Not to Use

- You need low-latency single-row lookups (use [Firestore](./firestore.md), [Spanner](./spanner.md), or [Cloud SQL](./cloud-sql.md)).
- You need a transactional OLTP system with high write rates (use [Cloud SQL](./cloud-sql.md) or [Spanner](./spanner.md)).
- You need a streaming-first system (use [Dataflow](https://cloud.google.com/dataflow) with BigQuery as a sink).

### Pricing Model

- On-demand: pay per TB scanned.
- Flat-rate: pay for reserved slots.
- Storage: pay per GB-month for active and long-term storage.
- Streaming inserts have a separate pricing model.

### Trade-offs

- Pros: serverless, scalable, fast for analytical queries, deep ML and BI integration.
- Cons: not designed for low-latency OLTP, costs can grow with query size, streaming inserts are not free.

### Practical Tips

- Use partitioned and clustered tables to reduce the bytes scanned per query.
- Use materialized views for repeated aggregations.
- Use BI Engine for sub-second dashboards.
- Export or stream data into BigQuery from Pub/Sub, Cloud Storage, or other sources.

### Related

- [Firestore](./firestore.md) and [Cloud SQL](./cloud-sql.md) as operational sources
- [Cloud Storage](../storage/cloud-storage.md) as a data lake
- [Pub/Sub](../messaging/pub-sub.md) for streaming ingest
- [System design: SQL vs NoSQL](../../../system-design/database/sql-vs-nosql.md)
- [System design: consistency models](../../../system-design/database/consistency-models.md)
