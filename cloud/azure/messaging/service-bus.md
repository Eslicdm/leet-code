# Service Bus

Azure Service Bus is a fully managed enterprise messaging broker. It supports queues and topics with advanced features such as sessions, transactions, and dead-lettering.

### Key Features

| Feature | Description |
| :-- | :-- |
| Queues and topics | Point-to-point or pub/sub messaging. |
| Sessions | FIFO order per session for related messages. |
| Transactions | Atomic operations across multiple messages. |
| Dead-letter queues | Capture messages that cannot be processed. |
| Scheduled delivery | Delay delivery of a message to a future time. |
| Duplicate detection | Avoid duplicate processing within a configurable window. |
| Auto-forwarding | Chain queues or topics for fan-out patterns. |
| Geo-disaster recovery | Pair namespaces across regions for DR. |
| Premium tier | Dedicated resources, predictable performance, and VNet integration. |

### When to Use

- You need enterprise messaging with queues and topics.
- You need sessions for ordered processing of related messages.
- You need transactions across multiple messages.
- You need duplicate detection and scheduled delivery.

### When Not to Use

- You only need simple pub/sub for event-driven architectures (use [Event Grid](./event-grid.md)).
- You need high-throughput event streaming with replay (use Event Hubs).
- You need a simple in-memory queue for a single application.

### Pricing Model

- Pay per million operations and per broker connection.
- Premium tier has a fixed hourly cost and unlimited operations.

### Trade-offs

- Pros: enterprise features, sessions, transactions, dead-lettering, geo-DR.
- Cons: more concepts than simple queues; Premium tier is more expensive than Standard.

### Practical Tips

- Use sessions when you need per-entity ordering.
- Use dead-letter queues for poison messages.
- Use duplicate detection when producers may retry.
- Use Premium tier for production workloads that need predictable performance.

### Related

- [Event Grid](./event-grid.md) for lightweight event routing
- [Event Hubs](https://azure.microsoft.com/en-us/products/event-hubs/) for high-throughput streaming
- [Functions](../compute/functions.md) and [Logic Apps](https://azure.microsoft.com/en-us/products/logic-apps/) as consumers
- [System design: messaging](../../../system-design/communication/messaging.md)
- [System design: dead letter queue](../../../system-design/communication/dead-letter-queue.md)
