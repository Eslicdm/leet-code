# Amazon MSK

Amazon MSK is a fully managed Apache Kafka service. It makes it easy to set up, scale, and manage Kafka clusters for streaming data.

### Key Features

| Feature | Description |
| :-- | :-- |
| Apache Kafka | Fully managed Kafka brokers (2.x and 3.x). |
| MSK Serverless | Auto-scales capacity without managing brokers. |
| MSK Connect | Managed Kafka Connect for source and sink connectors. |
| MSK Replicator | Cross-cluster replication. |
| Encryption | At rest and in transit with TLS. |
| Private access | Connect over VPC without public internet. |
| Multi-AZ | Replicate across availability zones. |

### When to Use

- You need a fully managed Kafka cluster for streaming data.
- You want Kafka-compatible APIs and tooling without operational overhead.
- You need exactly-once processing with Kafka consumers.
- You are migrating from self-managed Kafka to a managed service.

### When Not to Use

- You need a simpler managed stream (use [Kinesis](../analytics/kinesis.md)).
- You need a managed message queue for decoupled services (use [SQS](./sqs.md)).
- You need event-driven routing across AWS services (use [EventBridge](./eventbridge.md)).

### Pricing Model

- Pay per MSK broker-hour and per GB of storage.
- MSK Serverless: pay per VPU-hour and per GB of storage.
- MSK Connect: pay per KCPU-hour.

### Trade-offs

- Pros: fully managed Kafka, Kafka-compatible APIs, MSK Serverless for easy scaling.
- Cons: Kafka has a learning curve, broker management in provisioned mode, cost at scale.

### Practical Tips

- Use MSK Serverless for variable workloads without capacity planning.
- Use MSK Connect for managed source/sink connectors.
- Use multi-AZ for production durability.
- Monitor with CloudWatch and MSK dashboards.

### Related

- [Kinesis](../analytics/kinesis.md) for simpler managed streaming
- [SQS](./sqs.md) for decoupled messaging
- [EventBridge](./eventbridge.md) for event routing
- [Lambda](../compute/lambda.md) for stream processing
- [System design: event-driven](../../../system-design/architecture/event-driven.md)
