# Event-Driven Architecture

This page helps decide when asynchronous events, pub/sub, and message brokers should connect system components.

Event-driven architecture makes components communicate by producing and consuming events: immutable records of something that happened.

```
+------------+       Event       +---------------+       Event       +------------+
| Producer   | --------------->  | Event Broker  | --------------->  | Consumer   |
+------------+                   +---------------+                   +------------+
```

| Choice | Use when | Watch out for |
| :-- | :-- | :-- |
| Synchronous request | Caller needs an immediate answer | Tight coupling and cascading latency |
| Event-driven workflow | Work can happen asynchronously | Eventual consistency and harder debugging |
| Pub/sub fan-out | Many consumers react independently | Duplicate processing and idempotency |

### Core Concepts

- Event: an immutable record of a past fact, such as `OrderPlaced` or `UserRegistered`.
- Message broker or event log: middleware that routes or stores events, such as Kafka or RabbitMQ.
- Publish/subscribe: one producer publishes an event and multiple consumers react independently.

### When to use

- Highly decoupled asynchronous systems.
- Real-time data pipelines, clickstream analysis, telemetry, and stream processing.
- Multi-step workflows that can run in parallel or tolerate delayed completion.

### Trade-offs

- Benefits: strong decoupling, high throughput, resilience through buffering, and real-time responsiveness.
- Costs: eventual consistency, duplicate event handling, idempotent consumers, schema evolution, and distributed tracing requirements.

### Related Topics

- [Messaging](../communication/messaging.md)
- [CQRS and event sourcing](./cqrs-event-sourcing.md)
