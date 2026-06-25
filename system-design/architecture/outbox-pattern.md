# Outbox Pattern

The outbox pattern reliably publishes events when a service must update its database and notify other systems.

### Problem

Writing to a database and publishing to a message broker are two separate operations. If one succeeds and the other fails, systems can become inconsistent.

### How It Works

1. Write business data and an outbox record in the same database transaction.
2. A relay process reads unpublished outbox records.
3. The relay publishes events to the broker.
4. Consumers process events idempotently.

### When to Use

- Database writes must produce integration events.
- You need reliable event publishing without distributed transactions.
- Downstream consumers can tolerate eventual consistency.

### Trade-offs

- Avoids dual-write inconsistency.
- Adds relay infrastructure and duplicate-delivery handling.
- Requires cleanup or archival of outbox records.

### Related Topics

- [Event-driven architecture](./event-driven.md)
- [Messaging](../communication/messaging.md)