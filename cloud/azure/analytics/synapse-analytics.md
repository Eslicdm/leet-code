# Synapse Analytics

Synapse Analytics is an integrated analytics service that combines data warehousing, big data analytics, and data integration. It provides a unified experience for querying relational and unstructured data.

### Key Features

| Feature | Description |
| :-- | :-- |
| Dedicated SQL pool | Massively parallel processing (MPP) data warehouse. |
| Serverless SQL pool | Query data in Data Lake Storage with SQL. |
| Spark pools | Apache Spark for big data processing. |
| Data integration | Pipelines for ETL and ELT. |
| Synapse Link | Near-real-time analytics over operational data. |
| Power BI integration | DirectQuery and import from Synapse. |
| Studio | Unified management portal. |

### When to Use

- You need a managed data warehouse with MPP for large SQL queries.
- You want to query Data Lake Storage directly with SQL or Spark.
- You need integrated ETL pipelines alongside your warehouse.
- You want near-real-time analytics over Cosmos DB or SQL Database.

### When Not to Use

- You need a serverless query engine without a warehouse (use [Data Factory](./data-factory.md)).
- You need real-time stream processing (use [Event Hubs](../messaging/event-grid.md)).
- You want a fully open-source Spark platform (consider Databricks).

### Pricing Model

- Dedicated SQL pool: pay per DWU-hour.
- Serverless SQL pool: pay per TB of data processed.
- Spark pools: per vCPU-hour and GB-hour.
- Data integration: per activity run.

### Trade-offs

- Pros: integrated warehouse, Spark, and ETL; serverless SQL; Power BI integration.
- Cons: MPP has a learning curve, dedicated pools have a fixed cost, some features are Azure-only.

### Practical Tips

- Use serverless SQL for ad hoc queries over the data lake.
- Use dedicated SQL pools for production data warehousing.
- Use Synapse Link for near-real-time analytics without ETL.
- Use Power BI DirectQuery for live dashboards.

### Related

- [Data Factory](./data-factory.md) for ETL orchestration
- [Cosmos DB](../database/cosmos-db.md) as a source for Synapse Link
- [SQL Database](../database/sql-database.md) for transactional workloads
