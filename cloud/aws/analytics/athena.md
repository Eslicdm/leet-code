# Amazon Athena

Athena is a serverless interactive query service that lets you analyze data in S3 using standard SQL. You pay only for the queries you run.

### Key Features

| Feature | Description |
| :-- | :-- |
| Serverless | No infrastructure to manage; query directly over S3. |
| Standard SQL | ANSI SQL with support for complex joins, arrays, and functions. |
| Multiple formats | Parquet, ORC, JSON, CSV, and Avro with optional compression. |
| Federated queries | Query data in DynamoDB, Redshift, and other JDBC sources. |
| Workgroups | Separate teams, track costs, and enforce query limits. |
| CTAS / INSERT INTO | Create tables from query results or insert into existing tables. |

### When to Use

- You want to run ad hoc SQL queries over data stored in S3.
- You are building a data lake and want interactive analytics without provisioning clusters.
- Your analysts know SQL and you want a familiar interface.
- You need to query data in DynamoDB or Redshift without moving it (federated queries).

### When Not to Use

- You need sub-second query latency on large datasets (use [Redshift](https://aws.amazon.com/redshift/) or a dedicated warehouse).
- You need to run continuous streaming analytics (use [Kinesis](./kinesis.md)).
- You need to run very large ETL jobs regularly (use [Glue](./glue.md) or EMR).

### Pricing Model

- Pay per TB of data scanned per query.
- Use columnar formats (Parquet, ORC) and compression to reduce costs by up to 90%.
- Athena Workgroups let you set per-query data scanned limits.

### Trade-offs

- Pros: zero administration, pay-per-query, native S3 integration, familiar SQL.
- Cons: not suited for high-concurrency low-latency dashboards; cold starts for first queries; limited DML compared to a full warehouse.

### Practical Tips

- Use Parquet or ORC with partitioning to reduce scanned data and cost.
- Use CTAS to create materialized results for repeated queries.
- Use Workgroups to separate teams and control spend.
- Integrate with Lake Formation for fine-grained access control.

### Related

- [Kinesis](./kinesis.md) for streaming analytics
- [Glue](./glue.md) for ETL and data catalog
- [S3](../storage/s3.md) for data lake storage
- [DynamoDB](../database/dynamodb.md) for source data
