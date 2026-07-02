# Amazon SQS

SQS (Simple Queue Service) is a fully managed message queue. It decouples producers and consumers and absorbs traffic spikes without managing brokers.

### Key Features

| Feature | Description |
| :-- | :-- |
| Standard queues | At-least-once delivery, nearly unlimited throughput, best-effort ordering. |
| FIFO queues | Exactly-once processing, strict ordering, limited throughput. |
| Visibility timeout | Hide a message from other consumers for a configurable period. |
| Dead-letter queues | Move poison messages to a separate queue for inspection. |
| Long polling | Reduce empty receives and API costs. |
| Message timers | Delay delivery of individual messages. |

### When to Use

- You need to decouple producers and consumers.
- You need to absorb traffic spikes with backpressure.
- You need at-least-once delivery with retries and dead-lettering.

### When Not to Use

- You need pub/sub fan-out to many independent consumers (use [SNS](./sns.md) or [EventBridge](./eventbridge.md)).
- You need to replay historical events (use [Kinesis](https://aws.amazon.com/kinesis/) or Kafka).
- You need exactly-once delivery with strict ordering and high throughput (FIFO queues are limited).

### Pricing Model

- Pay per million requests after the free tier.
- FIFO queues are priced the same as standard queues.

### Trade-offs

- Pros: simple, fully managed, no servers to operate, integrates with Lambda and most AWS services.
- Cons: at-least-once delivery means consumers must be idempotent; FIFO queues have lower throughput than standard queues.

### Practical Tips

- Use long polling to reduce empty receives and cost.
- Set the visibility timeout high enough to cover worst-case processing time.
- Always configure a dead-letter queue for poison messages.
- Make consumers idempotent using message IDs or business keys.
- Use the `MessageDeduplicationId` on FIFO queues when possible to reduce duplicates.

### Related

- [SNS](./sns.md) for pub/sub fan-out
- [EventBridge](./eventbridge.md) for event buses and SaaS integrations
- [Lambda](../compute/lambda.md) as a consumer
- [System design: messaging](../../../system-design/communication/messaging.md)
- [System design: dead letter queue](../../../system-design/communication/dead-letter-queue.md)
