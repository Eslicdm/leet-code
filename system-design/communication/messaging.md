# Messaging

Messaging systems decouple producers and consumers with queues, brokers, or event logs.

### Queue vs Stream

| Model | Examples | Best for |
| :-- | :-- | :-- |
| Message queue | RabbitMQ, ActiveMQ | Task distribution and transactional work queues. |
| Event stream | Kafka, Kinesis | High-throughput event ingestion, replay, and stream processing. |

### Message Queues

Queues use a smart broker that tracks consumed messages and deletes them after acknowledgment.

### Event Streams

Streams use an append-only log. Consumers track offsets and can replay historical events.

### Trade-offs

- Queues are simpler for individual jobs and work distribution.
- Streams are stronger for analytics, replay, fan-out, and event sourcing.

### Related Topics

- [Event-driven architecture](../architecture/event-driven.md)
- [CQRS and event sourcing](../architecture/cqrs-event-sourcing.md)
- [Dead letter queue](./dead-letter-queue.md)