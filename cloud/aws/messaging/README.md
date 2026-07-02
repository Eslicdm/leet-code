# AWS Messaging

Messaging services cover queues, pub/sub topics, and event buses that connect distributed systems.

### Decision Path

| Need | Start with |
| :-- | :-- |
| Decouple producers and consumers with a simple queue. | [SQS](./sqs.md) |
| Fan out notifications to many subscribers. | [SNS](./sns.md) |
| Route events between AWS services and SaaS applications. | [EventBridge](./eventbridge.md) |

### When to Use AWS Messaging

- You need to decouple services and absorb traffic spikes.
- You need fan-out to many independent consumers.
- You need event-driven workflows across AWS services and external systems.

### Related

- [AWS compute services](../compute/)
- [System design: messaging](../../../system-design/communication/messaging.md)
- [System design: event-driven architecture](../../../system-design/architecture/event-driven.md)
- [System design: dead letter queue](../../../system-design/communication/dead-letter-queue.md)
