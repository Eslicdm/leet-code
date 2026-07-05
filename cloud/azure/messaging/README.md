# Azure Messaging

Messaging services cover queues, topics, and event buses that connect distributed systems.

### Decision Path

| Need | Start with |
| :-- | :-- |
| Reliable enterprise messaging with queues, topics, and transactions. | [Service Bus](./service-bus.md) |
| Lightweight event routing with reactive pub/sub. | [Event Grid](./event-grid.md) |
| Ingest millions of events per second (Kafka compatible). | [Event Hubs](./event-hubs.md) |

### When to Use Azure Messaging

- You need enterprise messaging with sessions, transactions, and dead-lettering.
- You need lightweight reactive event routing for serverless and microservices.
- You need a managed event bus for Azure resources and SaaS providers.

### Related

- [Azure compute services](../compute/)
- [System design: messaging](../../../system-design/communication/messaging.md)
- [System design: event-driven architecture](../../../system-design/architecture/event-driven.md)
- [System design: dead letter queue](../../../system-design/communication/dead-letter-queue.md)
