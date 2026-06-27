# CQRS and Event Sourcing

CQRS stands for Command Query Responsibility Segregation.

This page helps decide when to split reads from writes, and when to store state changes as immutable events.

| Pattern | Main idea | Best fit |
| :-- | :-- | :-- |
| CQRS | Separate command/write model from query/read model | Read and write workloads differ greatly |
| Event sourcing | Store the history of changes, not only current state | Audit-heavy domains and replayable business history |
| CQRS + event sourcing | Use events to update optimized read models | Complex domains with strict audit and high read needs |

### CQRS

CQRS (Command Query Responsibility Segregation) separates commands that mutate state from queries that read state.

```
                 +--------------------+
                 |    Client (UI)     |
                 +--------------------+
                   /                          Commands /                  \ Queries
                 v                    v
          +-------------+      +-------------+
          | Write Model |      | Read Model  |
          +-------------+      +-------------+
                 |                    |
                 v                    v
          +-------------+      +-------------+
          | Write DB    | ===> | Read DB     |
          +-------------+      +-------------+
```

#### When to use

- Collaborative domains with complex write rules.
- High-read, low-write systems where query performance is critical.
- Full-text search, faceted search, or denormalized views over transactional data.

#### Trade-offs

- Benefits: independently scalable read/write paths, simpler write model, and fast purpose-built queries.
- Costs: two models to maintain, synchronization logic, and stale reads while the read model catches up.

### Event Sourcing

Event sourcing stores the complete sequence of immutable state changes and reconstructs current state by replaying events.

```
[UserCreated] -> [EmailUpdated] -> [AddressAdded] -> [PremiumSubscribed]
Initial state + replayed events = current state
```

#### When to use

- Auditing, compliance, banking, ledger, or medical-history systems.
- Undo/redo, temporal queries, or replaying historical events with new logic.

#### Trade-offs

- Benefits: perfect audit trail, fast append-only writes, and powerful historical analysis.
- Costs: steep learning curve, event schema evolution, snapshot management, and difficult ad hoc querying unless paired with CQRS.

### Related Topics

- [Event-driven architecture](./event-driven.md)
- [Messaging](../communication/messaging.md)
- [Consistency models](../database/consistency-models.md)
