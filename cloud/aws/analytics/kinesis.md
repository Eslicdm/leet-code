# Amazon Kinesis

Kinesis makes it easy to collect, process, and analyze real-time streaming data at scale. It covers data streams, video streams, data firehose, and the analytics engine.

### Key Features

| Feature | Description |
| :-- | :-- |
| Kinesis Data Streams | Real-time streaming with shard-based throughput and KCL consumers. |
| Kinesis Data Firehose | Near-real-time delivery to S3, Redshift, OpenSearch, or HTTP endpoints. |
| Kinesis Data Analytics | SQL or Apache Flink applications over streaming data. |
| Kinesis Video Streams | Ingest, store, and process video from cameras and devices. |
| On-demand mode | Auto-scales shards to match traffic without manual shard management. |
| Enhanced fan-out | Dedicated throughput per consumer. |

### When to Use

- You need to ingest and process millions of events per second in real time.
- You want to deliver streaming data to S3, Redshift, or OpenSearch with minimal code.
- You want to run continuous SQL or Flink queries over streams.
- You are building real-time dashboards, alerting systems, or IoT pipelines.

### When Not to Use

- The workload is batch-oriented (use [Athena](./athena.md) or [Glue](./glue.md)).
- You want a managed message queue for decoupled services (use [SQS](../messaging/sqs.md)).
- You need guaranteed ordering with exactly-once processing and complex routing (consider [MSK](../messaging/msk.md) for managed Kafka).

### Pricing Model

- Data Streams: pay per shard-hour and per million PUT records.
- Firehose: pay per GB ingested.
- Data Analytics: pay per processing unit-hour.
- On-demand mode charges per stream-hour with no shard management.

### Trade-offs

- Pros: real-time ingestion at scale, managed infrastructure, deep integration with S3 and Lambda.
- Cons: shard management in provisioned mode, at-least-once delivery, ordering within a shard only, cost at high throughput.

### Practical Tips

- Use on-demand mode for unpredictable traffic; switch to provisioned when patterns stabilize.
- Use Firehose to avoid writing consumer code for delivery to S3 or Redshift.
- Use enhanced fan-out when multiple consumers need dedicated throughput.
- Use KCL (Kinesis Client Library) for checkpointing and load balancing.

### Related

- [Athena](./athena.md) for interactive SQL over stored data
- [Glue](./glue.md) for ETL
- [Lambda](../compute/lambda.md) for stream processing
- [SQS](../messaging/sqs.md) for decoupled messaging
- [MSK](../messaging/msk.md) for managed Kafka
- [System design: event-driven](../../../system-design/architecture/event-driven.md)
