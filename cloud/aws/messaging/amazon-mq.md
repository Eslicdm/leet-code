# Amazon MQ

Amazon MQ is a managed message broker service for Apache ActiveMQ and RabbitMQ. It provides a managed broker for existing messaging workloads.

### Key Features

| Feature | Description |
| :-- | :-- |
| ActiveMQ and RabbitMQ | Choose the broker that fits your existing workloads. |
| Single-instance and standby | Simple deployment for development. |
| ActiveMQ and RabbitMQ clusters | Multi-AZ deployment for production. |
| JMS and AMQP | Standard messaging protocols. |
| Network of brokers | Federation for ActiveMQ across regions. |
| Message persistence | Durable messages with storage. |
| CloudWatch integration | Monitor broker metrics. |

### When to Use

- You have existing ActiveMQ or RabbitMQ workloads and want a managed broker.
- You need JMS or AMQP protocol support.
- You are migrating from self-managed brokers to AWS.
- You need durable, ordered messaging with standard protocols.

### When Not to Use

- You want a fully managed AWS-native queue (use [SQS](./sqs.md)).
- You need pub/sub fan-out (use [SNS](./sns.md)).
- You need event routing across AWS services (use [EventBridge](./eventbridge.md)).

### Pricing Model

- Pay per broker instance per hour.
- Pay for storage and data transfer.
- Single-instance brokers are cheaper for development.

### Trade-offs

- Pros: managed ActiveMQ/RabbitMQ, standard protocols, easy migration.
- Cons: more expensive than SQS for simple queues, broker management in cluster mode, limited to ActiveMQ and RabbitMQ.

### Practical Tips

- Use single-instance brokers for development and testing.
- Use multi-AZ brokers for production durability.
- Use network of brokers for cross-region federation.
- Monitor with CloudWatch and broker-specific dashboards.

### Related

- [SQS](./sqs.md) for AWS-native queues
- [SNS](./sns.md) for pub/sub
- [EventBridge](./eventbridge.md) for event routing
- [MSK](./msk.md) for Apache Kafka
- [System design: message queues](../../../system-design/communication/messaging.md)
