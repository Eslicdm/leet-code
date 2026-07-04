# Dataflow

Dataflow is a managed stream and batch processing service based on Apache Beam. It runs pipelines that process unbounded and bounded datasets with exactly-once semantics.

### Key Features

| Feature | Description |
| :-- | :-- |
| Unified model | Same pipeline code for batch and streaming. |
| Apache Beam | Java, Python, and Go SDKs. |
| Auto scaling | Dynamically adjusts workers based on throughput. |
| Exactly-once | Guaranteed processing semantics with checkpointing. |
| Windowing | Fixed, sliding, session, and custom windows. |
| Streaming engine | Reduced latency by separating streaming state from workers. |
| Flex templates | Package pipelines as templates for reuse. |

### When to Use

- You need to process unbounded streaming data with exactly-once semantics.
- You have existing Apache Beam pipelines and want a managed runner.
- You need both batch and streaming in the same pipeline logic.
- You need windowing, triggers, or watermarks for event-time processing.

### When Not to Use

- You need simple ETL without streaming (use [Dataproc](./dataproc.md) or [Looker](./looker.md)).
- You want a SQL-only streaming interface (use BigQuery streaming).
- You need real-time ML inference on streams (use Vertex AI endpoints).

### Pricing Model

- Pay per vCPU-hour and GB-hour of worker resources.
- Streaming: per vCPU-hour, per GB-hour of memory, and per GB of Shuffle.
- Batch: per vCPU-hour and per GB-hour.

### Trade-offs

- Pros: unified batch and streaming, exactly-once, auto scaling, deep GCP integration.
- Cons: Beam SDK learning curve, debugging streaming pipelines is hard, cost can grow with high-throughput streams.

### Practical Tips

- Use streaming engine to reduce latency and cost for stateful pipelines.
- Use Flex templates for reusable, parameterized pipelines.
- Use windowing to control how data is grouped over time.
- Monitor with Dataflow monitoring dashboards and Cloud Logging.

### Related

- [Dataproc](./dataproc.md) for Spark and Hadoop workloads
- [Pub/Sub](../messaging/pub-sub.md) as the source for streaming pipelines
- [BigQuery](../database/bigquery.md) as a sink for analytics
