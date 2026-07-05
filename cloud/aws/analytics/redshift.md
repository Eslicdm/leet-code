# Amazon Redshift

Redshift is a fully managed data warehouse service. It uses columnar storage and massively parallel processing (MPP) to query petabytes of data with SQL.

### Key Features

| Feature | Description |
| :-- | :-- |
| Columnar storage | Optimized for analytics queries over large datasets. |
| MPP | Distribute queries across nodes for parallel execution. |
| Redshift Serverless | Run queries without provisioning clusters. |
| Concurrency Scaling | Handle burst read traffic automatically. |
| Spectrum | Query S3 data directly without loading into Redshift. |
| Federated Query | Query data in RDS PostgreSQL and Aurora. |
| ML integration | Create and invoke ML models from SQL. |
| Data sharing | Share live data across Redshift clusters. |

### When to Use

- You need a managed data warehouse for business intelligence and analytics.
- You want to run complex SQL queries over petabytes of data.
- You want serverless analytics without managing clusters.
- You need to query data in S3 directly (Spectrum) or combine it with warehouse data.

### When Not to Use

- You need ad hoc queries over raw S3 data without a warehouse (use [Athena](./athena.md)).
- You need real-time streaming analytics (use [Kinesis](./kinesis.md)).
- You need a NoSQL data store (use [DynamoDB](../database/dynamodb.md)).

### Pricing Model

- Provisioned: pay per node-hour and per GB of storage.
- Serverless: pay per RPU-hour (Redshift Processing Unit) and per GB of storage.
- Spectrum: pay per TB of data scanned.

### Trade-offs

- Pros: columnar storage, MPP performance, serverless option, deep S3 integration.
- Cons: not suited for OLTP, cold start for serverless, some features are Redshift-only.

### Practical Tips

- Use sort keys and distribution keys to optimize query performance.
- Use Spectrum to query S3 data without loading it.
- Use Redshift Serverless for variable or ad hoc workloads.
- Use materialized views for repeated complex queries.

### Related

- [Athena](./athena.md) for serverless ad hoc SQL
- [Glue](./glue.md) for ETL and data catalog
- [S3](../storage/s3.md) for data lake storage
- [DynamoDB](../database/dynamodb.md) for operational data
