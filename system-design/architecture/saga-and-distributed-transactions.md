# Saga and Distributed Transactions

Distributed transaction decisions define how multiple services coordinate writes when one local database transaction is not enough.

In a microservices system, every service usually owns its own database. There is no shared transaction manager, so classical ACID transactions across services do not apply. The saga pattern is the standard way to keep multi-service writes coordinated without giving up service autonomy.

### Why Local Transactions Are Not Enough

A single ACID transaction works inside one database. Across services, the distributed transaction problem appears:

- The `Order` service must reserve stock.
- The `Payment` service must charge the card.
- The `Shipping` service must reserve a slot.

If `Payment` succeeds and `Shipping` fails, the user is charged but the order cannot be fulfilled. A two-phase commit (`2PC`) would coordinate all three, but it is blocking, fragile, and hard to scale, so production systems prefer sagas.

### Decision Table

| Pattern | Use when | Trade-off |
| :-- | :-- | :-- |
| Two-phase commit | Strong atomicity is required across participants and the network is reliable. | Blocking, single coordinator, and operationally fragile at scale. |
| Saga | Each service can commit locally and compensate on failure. | Requires compensation logic and accepts eventual consistency. |
| Idempotency keys | Clients or orchestrators may retry the same write safely. | Requires request identity storage and dedup logic. |
| Idempotent services | The same operation can be replayed without side effects. | Service design must avoid non-idempotent side effects. |

### Saga Pattern

A saga breaks a distributed transaction into a sequence of local transactions, one per service. Each step has a forward action and, when needed, a compensating action that semantically undoes it.

#### Example: Order Placement

```
[Order] -> [Payment] -> [Stock] -> [Shipping] -- success
                |              |
                v              v
           [Refund]      [ReleaseStock]      -- compensations on failure
```

| Step | Forward action | Compensation on failure |
| :-- | :-- | :-- |
| Order | Create pending order. | Mark order as cancelled. |
| Payment | Charge the card. | Refund the charge. |
| Stock | Reserve inventory. | Release reserved stock. |
| Shipping | Reserve a delivery slot. | Release the slot. |

Compensations are not perfect rollbacks. Refunding a card is a real, visible, asynchronous operation. This is why sagas are eventual consistency: the system converges to a consistent state, but only after every step or every compensation finishes.

#### Saga Styles

| Style | Who decides the next step | Best fit |
| :-- | :-- | :-- |
| Orchestration | A central coordinator tells each service what to do next. | Many steps, clear workflow, easier observability and retries. |
| Choreography | Services react to each other's events; no central coordinator. | Loose coupling, fewer components, but flow is harder to follow. |

#### Orchestration

```
Coordinator
    |  command: ReserveOrder
    v
[Order] --- OrderReserved ---> Coordinator
    |  command: Charge
    v
[Payment] --- PaymentCompleted ---> Coordinator
    |  command: ReserveStock
    v
[Stock] --- StockReserved ---> Coordinator
    |  command: ReserveShipping
    v
[Shipping] --- ShippingReserved ---> Coordinator
```

The coordinator tracks state, decides the next step, and triggers compensations on failure. The standard pattern uses a state machine plus a persistence layer such as a workflow engine, a database row, or an event-sourced log.

**Trade-offs**

- Pros: explicit flow, easy to add steps, easy to monitor, retries are centralized.
- Cons: the coordinator becomes a critical component, has its own state, and can grow into a smart service that knows too much.

#### Choreography

```
[Order] --- OrderCreated ---> [Payment]
[Payment] --- PaymentCompleted ---> [Stock]
[Stock] --- StockReserved ---> [Shipping]
[Shipping] --- ShippingReserved ---> [Order]   (final confirmation)
```

There is no central brain. Each service subscribes to events from upstream services and publishes its own events. Compensations are triggered by the same event chain when a step reports a failure event.

**Trade-offs**

- Pros: low coupling, no central coordinator, services stay small.
- Cons: the business flow is implicit and spread across services, debugging is harder, and cyclic dependencies are easy to introduce accidentally.

### When to Use

- A business transaction spans two or more services with their own databases.
- No shared lock manager or distributed transaction coordinator is available or desired.
- The workflow can tolerate a window of partial state visible to clients.
- Compensations are feasible: every forward step has a meaningful undo.

### When Not to Use

- The operation must be strongly atomic, such as moving money between two ledgers with no allowed inconsistency window.
- There is no way to define safe compensations.
- The system has only one service and one database. In that case, use a local ACID transaction.

### Operational Concerns

| Concern | Practical approach |
| :-- | :-- |
| Idempotency | Every step uses an idempotency key. Replays of the same step do not double-charge or double-reserve. |
| Retries | Transient failures are retried with exponential backoff and jitter; permanent failures trigger compensations. |
| Timeouts | Each step has a deadline; long steps are aborted and compensated. |
| Observability | Trace IDs and saga IDs correlate all steps. Logs and metrics should expose saga state. |
| State persistence | Orchestrators persist saga state so the workflow can resume after a crash. |
| Versioning | Saga definitions change over time; old in-flight sagas should still complete or compensate safely. |

### Trade-offs

- Benefits: services stay autonomous, no two-phase commit, no global locks, scales linearly with service count.
- Costs: eventual consistency window, compensation logic is real code, harder debugging, requires idempotency, observability, and timeouts everywhere.

### Related Topics

- [Event-driven architecture](./event-driven.md)
- [Messaging](../communication/messaging.md)
- [Consistency models](../database/consistency-models.md)
- [Idempotency and retry patterns](../fault-tolerance/retries-backoff-jitter.md)
