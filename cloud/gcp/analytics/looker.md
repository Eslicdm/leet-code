# Looker

Looker is a cloud-native BI and analytics platform. It provides a unified semantic model, interactive dashboards, and embedded analytics.

### Key Features

| Feature | Description |
| :-- | :-- |
| LookML | Declarative modeling language for metrics and dimensions. |
| Unified semantic layer | Single source of truth for business metrics. |
| Interactive dashboards | Drag-and-drop dashboard builder with filters. |
| Embedded analytics | Embed reports and dashboards into your own apps. |
| Scheduling | Email and Slack delivery of reports and alerts. |
| BigQuery integration | Native integration with BigQuery for fast analytics. |
| Git version control | LookML models versioned in Git. |

### When to Use

- You need a self-service BI tool for business users.
- You want a single semantic layer across all analytics.
- You need to embed analytics in your product.
- You need governed metrics with version-controlled definitions.

### When Not to Use

- You need a serverless query engine (use [BigQuery](../database/bigquery.md)).
- You need stream processing or ETL (use [Dataflow](./dataflow.md) or [Dataproc](./dataproc.md)).
- You want an open-source BI tool (consider Apache Superset or Metabase).

### Pricing Model

- Looker Standard: per user per month.
- Looker Embedded: additional licensing for embedded use cases.
- BigQuery integration is separate.

### Trade-offs

- Pros: governed metrics, embedded analytics, Git version control, deep BigQuery integration.
- Cons: LookML learning curve, per-user cost can grow, not open source.

### Practical Tips

- Define core business metrics in LookML models first.
- Use Git branches for LookML development and code review.
- Use embedded analytics to add dashboards to your product without rebuilding BI.
- Start with a small set of dashboards and iterate with business users.

### Related

- [BigQuery](../database/bigquery.md) as the analytics backend
- [Dataflow](./dataflow.md) for streaming ETL
- [Dataproc](./dataproc.md) for Spark-based analytics
