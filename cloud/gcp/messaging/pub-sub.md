# Pub/Sub

Pub/Sub is a fully managed, real-time messaging service. It provides at-least-once delivery, ordering, and replay for asynchronous communication between independent applications.

### Key Features

| Feature | Description |
| :-- | :-- |
| Topics and subscriptions | Publishers send to topics; subscribers receive from subscriptions. |
| Push and pull delivery | Subscribers can pull messages or have Pub/Sub push to a webhook. |
| Ordering keys | Guarantee ordered delivery per key. |
| Dead-letter topics | Capture messages that fail to be processed. |
| Replay | Replay messages from a snapshot or from a specific timestamp. |
| Filtering | Filter messages at the subscription level. |
| Schema enforcement | Enforce message schemas with Avro or Protocol Buffers. |
| Global and regional | Use regional topics for low latency or global for cross-region. |

### When to Use

- You need a globally available event bus.
- You need at-least-once delivery with ordering, replay, or dead-lettering.
- You need to integrate with many independent consumers.

### When Not to Use

- You need a simple in-memory queue for a single application.
- You need high-throughput stream processing with stateful transformations (consider [Dataflow](https://cloud.google.com/dataflow) with Pub/Sub as a source).
- You need exactly-once delivery to a single consumer with strict ordering (Pub/Sub ordering is per-key).

### Pricing Model

- Pay per GB of message data and per operation.
- Free tier includes 10 GB of messages per month.
- Snapshot storage is billed separately.

### Trade-offs

- Pros: globally available, at-least-once delivery, ordering, replay, dead-letter topics.
- Cons: at-least-once delivery means consumers must be idempotent; ordering is per-key, not global.

### Practical Tips

- Use dead-letter topics for poison messages.
- Use ordering keys when you need per-key ordering.
- Use schema enforcement to catch producer-side breaking changes.
- Use filters at the subscription to reduce noise and cost.
- Snapshot and replay during testing or after a regression.

### Related

- [Cloud Run](../compute/cloud-run.md) and [Cloud Functions](../compute/cloud-functions.md) as subscribers
- [BigQuery](../database/bigquery.md) for analytics over Pub/Sub streams
- [Dataflow](https://cloud.google.com/dataflow) for stream processing
- [System design: messaging](../../../system-design/communication/messaging.md)
- [System design: dead letter queue](../../../system-design/communication/dead-letter-queue.md)
