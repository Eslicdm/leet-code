# Data Factory

Data Factory is a serverless data integration service for building ETL and ELT pipelines. It orchestrates data movement and transformation across cloud and on-premises sources.

### Key Features

| Feature | Description |
| :-- | :-- |
| Pipelines | Visual and code-based pipeline construction. |
| 100+ connectors | Connect to databases, SaaS, files, and APIs. |
| Mapping data flows | Visual ETL without writing code. |
| Trigger schedules | Time-based, event-based, and tumbling window triggers. |
| Mapping flows | Spark-based transformation in a visual editor. |
| Debug and monitor | Pipeline run history, logging, and alerting. |
| CI/CD | Git integration and Azure DevOps pipelines. |

### When to Use

- You need to move and transform data between many different sources and sinks.
- You want visual ETL without writing Spark or SQL code.
- You need scheduled and event-driven data pipelines.
- You need to orchestrate data workflows across hybrid environments.

### When Not to Use

- You need interactive SQL analytics (use [Synapse Analytics](./synapse-analytics.md)).
- You need real-time streaming (use Event Hubs or Stream Analytics).
- You need a data warehouse (use Synapse dedicated SQL pool).

### Pricing Model

- Pay per activity run and per pipeline activity execution.
- Mapping data flows: per vCore-hour.
- Linked services: per connection per month.

### Trade-offs

- Pros: 100+ connectors, visual ETL, serverless, deep Azure integration.
- Cons: pipeline debugging can be slow, mapping data flows have Spark overhead, cost at scale.

### Practical Tips

- Start with copy and lookup activities; add transformations as needed.
- Use integration runtimes for on-premises data access.
- Use triggers to schedule pipelines based on events or time.
- Monitor with Azure Monitor and Log Analytics.

### Related

- [Synapse Analytics](./synapse-analytics.md) for warehousing and SQL analytics
- [Blob Storage](../storage/blob-storage.md) as a common sink
- [Event Grid](../messaging/event-grid.md) for event-driven triggers
