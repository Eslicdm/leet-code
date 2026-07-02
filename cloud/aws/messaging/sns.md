# Amazon SNS

SNS (Simple Notification Service) is a fully managed pub/sub messaging service. It fans out messages to many subscribers such as SQS, Lambda, HTTP endpoints, email, and mobile push.

### Key Features

| Feature | Description |
| :-- | :-- |
| Topics | Named channels for publishing messages. |
| Subscriptions | SQS, Lambda, HTTP/S, email, SMS, mobile push. |
| Message filtering | Filter messages at the subscription level with JSON policies. |
| FIFO topics | Strict ordering and deduplication with SQS FIFO subscribers. |
| Message attributes | Custom metadata for filtering and routing. |
| Dead-letter queues | Capture subscriptions that fail to deliver. |
| Cross-region and cross-account | Publish and subscribe across regions and accounts. |

### When to Use

- You need to fan out a single event to many independent consumers.
- You need pub/sub semantics with push delivery.
- You need SMS, email, or mobile push notifications.

### When Not to Use

- You need a durable queue with a single consumer group (use [SQS](./sqs.md)).
- You need to replay events (use [Kinesis](https://aws.amazon.com/kinesis/) or Kafka).
- You need complex event routing and transformation across AWS and SaaS services (consider [EventBridge](./eventbridge.md)).

### Pricing Model

- Pay per million publish requests.
- Pay per million delivery attempts to HTTP/S, SMS, email, and mobile push.
- Delivery to SQS and Lambda is free.

### Trade-offs

- Pros: simple, managed, many subscriber types, useful for fan-out.
- Cons: no replay; large messages must use S3 extended client.

### Practical Tips

- Use SQS subscriptions to buffer consumers that cannot keep up.
- Use message filtering to reduce noise and cost at subscribers.
- Configure dead-letter queues for failed HTTP/S subscriptions.
- Use FIFO topics only when you need strict ordering and deduplication.

### Related

- [SQS](./sqs.md) for durable queues and buffering
- [EventBridge](./eventbridge.md) for event buses and SaaS integrations
- [Lambda](../compute/lambda.md) as a subscriber
- [System design: messaging](../../../system-design/communication/messaging.md)
- [System design: event-driven architecture](../../../system-design/architecture/event-driven.md)
