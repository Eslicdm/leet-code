# Event Grid

Azure Event Grid is a fully managed event routing service. It uses a pub/sub model to deliver events from Azure resources, custom applications, and partners to subscribers such as Functions, Logic Apps, and webhooks.

### Key Features

| Feature | Description |
| :-- | :-- |
| Topics and event subscriptions | Publishers send events to topics; subscribers receive filtered events. |
| Event schema | Standard event envelope with subject, event type, and data. |
| CloudEvents support | Native support for CloudEvents 1.0 schema. |
| Filtering | Filter events at the subscription level by subject, event type, or data. |
| Push delivery | Push events to HTTP webhooks, Functions, Logic Apps, and Service Bus. |
| Pull delivery | Pull events on demand with Event Grid Namespaces. |
| Dead-letter destinations | Capture events that fail to be delivered. |
| Partner events | Receive events from SaaS partners through Event Grid. |

### When to Use

- You need lightweight event routing from Azure resources to handlers.
- You need to react to events from many sources with simple filtering.
- You need SaaS partner events delivered to your handlers.
- You need a managed pub/sub for serverless applications.

### When Not to Use

- You need a durable enterprise queue with sessions and transactions (use [Service Bus](./service-bus.md)).
- You need high-throughput event streaming with replay (use Event Hubs).
- You need a simple in-memory queue for a single application.

### Pricing Model

- Pay per million operations.
- Free tier includes 100,000 operations per month.
- Some Azure resource events are free.

### Trade-offs

- Pros: simple, managed, deep Azure integration, CloudEvents support.
- Cons: lightweight semantics; no sessions, transactions, or long-term retention.

### Practical Tips

- Use dead-letter destinations for failed deliveries.
- Use filtering to reduce noise and cost at subscribers.
- Use pull delivery for scenarios that need at-least-once with explicit consumption.
- Pair with Functions or Logic Apps for serverless event handlers.

### Related

- [Service Bus](./service-bus.md) for enterprise messaging
- [Event Hubs](https://azure.microsoft.com/en-us/products/event-hubs/) for streaming
- [Functions](../compute/functions.md) and [Logic Apps](https://azure.microsoft.com/en-us/products/logic-apps/) as subscribers
- [System design: messaging](../../../system-design/communication/messaging.md)
- [System design: event-driven architecture](../../../system-design/architecture/event-driven.md)
