# Event Hubs

Azure Event Hubs is a fully managed real-time data ingestion service. It is a Kafka-compatible event streaming platform for big data pipelines.

### Key Features

| Feature | Description |
| :-- | :-- |
| Kafka compatible | Run Kafka workloads without a self-managed cluster. |
| Capture | Automatically persist events to Blob Storage or Data Lake Storage. |
| Event Hubs Streams | Real-time stream processing with low latency. |
| Event Hubs Spark | Direct integration with Apache Spark. |
| Partitioned consumers | Ordered consumption within partitions. |
| Auto inflow scaling | Throughput units auto-scale to handle traffic spikes. |
| Geo-disaster recovery | Pair namespaces for failover. |

### When to Use

- You need a Kafka-compatible managed service without managing brokers.
- You need real-time ingestion of millions of events per second.
- You want automatic capture to Blob Storage or Data Lake.
- You are building a big data pipeline with Spark or Analytics.

### When Not to Use

- You need a simple message queue (use [Service Bus](./service-bus.md)).
- You need lightweight event routing (use [Event Grid](./event-grid.md)).
- You need exactly-once processing with complex event processing (use Stream Analytics).

### Pricing Model

- Pay per throughput unit (TU) per hour.
- Pay per GB of ingress and egress.
- Capture: pay for the underlying storage.

### Trade-offs

- Pros: Kafka compatible, high throughput, automatic capture, deep Azure integration.
- Cons: partition management complexity, cost at high throughput, not a replacement for full Kafka features.

### Practical Tips

- Use Capture to avoid writing custom ingestion code.
- Use partition keys for ordered processing.
- Use auto-inflow scaling for unpredictable traffic.
- Use Event Hubs with Stream Analytics for real-time analytics.

### Related

- [Service Bus](./service-bus.md) for enterprise messaging
- [Event Grid](./event-grid.md) for lightweight event routing
- [Synapse Analytics](../analytics/synapse-analytics.md) for data warehousing
- [System design: event-driven](../../../system-design/architecture/event-driven.md)
