# Saga and Distributed Transactions

Distributed transaction decisions define how multiple services coordinate writes when one local database transaction is not enough.

### Decision Table

| Pattern | Use when | Trade-off |
| :-- | :-- | :-- |
| Two-phase commit | Strong atomicity is required across participants. | Blocking and operationally fragile at scale. |
| Saga | Each service can commit locally and compensate on failure. | Requires compensation logic and eventual consistency. |
| Idempotency keys | Clients or orchestrators may retry writes. | Requires request identity storage. |

### Saga Styles

- `Orchestration`: one coordinator tells services what to do next.
- `Choreography`: services react to each other's events.

### Related Topics

- [Outbox pattern](./outbox-pattern.md)
- [Event-driven architecture](./event-driven.md)