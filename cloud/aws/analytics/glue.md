# AWS Glue

Glue is a serverless data integration and ETL service. It discovers, prepares, moves, and integrates data from various sources.

### Key Features

| Feature | Description |
| :-- | :-- |
| Data Catalog | Central metadata store for tables, schemas, and table partitions across S3, RDS, and Redshift. |
| ETL jobs | PySpark and Scala jobs that run on managed Spark clusters. |
| Job bookmarks | Track processed data to avoid reprocessing. |
| Visual ETL | Drag-and-drop ETL in the Glue Studio console. |
| crawlers | Automatically infer schemas and create catalog entries. |
| DataBrew | Visual data preparation without writing code. |
| Streaming ETL | Continuous ETL from Kinesis or Kafka. |

### When to Use

- You need to build ETL pipelines that move and transform data between S3, databases, and data warehouses.
- You want a managed data catalog that integrates with Athena, Redshift, and EMR.
- You prefer visual ETL over writing PySpark code.
- You need streaming ETL from Kinesis or Kafka without managing Flink.

### When Not to Use

- You need real-time interactive queries (use [Athena](./athena.md)).
- You need real-time stream processing (use [Kinesis](./kinesis.md) with Lambda or MSK with Flink).
- You need a fully managed Spark cluster with more control (use EMR).

### Pricing Model

- ETL jobs: pay per DPU-hour (1 DPU = 4 vCPU, 16 GB memory).
- Data Catalog: pay per table and per partition per month.
- Crawlers: pay per DPU-hour while running.
- Glue Studio visual ETL: same DPU-hour pricing.

### Trade-offs

- Pros: serverless, deep S3 and catalog integration, visual ETL option, job bookmarks.
- Cons: Spark startup overhead for short jobs, limited runtime customization compared to EMR, debugging can be harder than local Spark.

### Practical Tips

- Use job bookmarks to avoid reprocessing data in incremental loads.
- Partition data in S3 and register partitions in the catalog for Athena performance.
- Use Glue Studio for quick visual pipelines; switch to PySpark for complex logic.
- Use crawlers to keep the catalog in sync with changing S3 data.

### Related

- [Athena](./athena.md) for querying catalog data
- [Kinesis](./kinesis.md) for streaming ingestion
- [S3](../storage/s3.md) for data lake storage
- [Redshift](./redshift.md) for data warehousing
