# Dead Letter Queue

A dead letter queue (DLQ) is a separate destination where a messaging system routes messages that cannot be processed successfully. It isolates poison messages, prevents retry storms, and preserves evidence for later analysis or replay.

### Why a DLQ Exists

In any consumer, some messages will fail permanently:

- A malformed payload that no consumer can parse.
- A business rule violation that no retry will fix, like a closed account or an invalid order.
- A dependency that is gone forever, such as a deleted user or a removed resource.
- A poison message that crashes the consumer on every attempt.

Without a DLQ, these messages either block the queue head, get requeued forever, or get silently dropped. All three outcomes cause incidents: stuck workers, retry storms, or invisible data loss.

A DLQ turns permanent failure into a first-class outcome. The consumer can move the message aside, free the worker, and let an operator decide what to do.

### How It Works

```
[Producer] --> [Main Queue] --> [Consumer]
                    |
                    |  on permanent failure
                    v
              [Dead Letter Queue] ---> [Operator / Replay tool]
```

Typical triggers that move a message to the DLQ:

| Trigger | Meaning |
| :-- | :-- |
| Negative acknowledgment (`nack` with no requeue). | Consumer rejected the message on purpose. |
| Retry limit exhausted. | All retries failed, the message is declared poison. |
| Message TTL expired. | The message sat in the queue longer than allowed. |
| Queue length limit exceeded. | The main queue is full; oldest messages are dead-lettered. |
| Routing or schema mismatch. | The message does not match the consumer's contract. |

The DLQ itself is just another queue, but with different expectations: low throughput, long retention, and human or tool inspection.

### Decision Table

| Decision | Options | Trade-off |
| :-- | :-- | :-- |
| Destination | Same broker, separate topic, or external storage. | External storage survives broker outages but needs a separate access path. |
| Retention | Short, like hours, or long, like weeks. | Short retention loses evidence. Long retention costs storage and may hide real bugs. |
| Schema | Keep original envelope, strip payload, or attach failure metadata. | Keeping the full envelope is best for replay. |
| Replay strategy | Manual, scheduled, or automatic after a fix. | Automatic replay can re-trigger the same incident. |
| Alerting | On any message, on rate, or on a budget. | Too noisy if every message alerts; too quiet if rate is missed. |

### When to Use

- A consumer can encounter messages it will never be able to process.
- Retries have a clear limit and you need a terminal endpoint for failures.
- Operators or replay tools need access to the original payload plus failure context.
- The system must preserve evidence for debugging, audit, or compliance.

### When Not to Use

- Every failure is transient and already handled by retries.
- A consumer is idempotent and the message can simply be discarded after the retry budget.
- The failure mode is best handled by a circuit breaker that drops work entirely.
- The volume of failures is so low that a database table of failed rows is enough.

### Design Practices

| Practice | Why it matters |
| :-- | :-- |
| Include failure metadata. | Add the error class, message, attempt count, and timestamp. Replay is impossible without context. |
| Preserve the original payload. | Stripping or transforming the message during dead-lettering breaks replay. |
| Use a separate consumer group or topic. | A normal consumer must not subscribe to the DLQ, or it can become a feedback loop. |
| Alert on rate, not just count. | A spike in DLQ rate usually means a real regression in a producer or schema. |
| Make replay safe and explicit. | Replays must be idempotent. Replaying into the main queue is an operator action, not a default. |
| Cap DLQ size. | Unbounded DLQs hide real incidents and cost money. Quarantine, archive, or alert when the cap is hit. |
| Tag the original routing key or topic. | A single DLQ shared by many topics needs a way to know where a message came from. |

### Anti-Patterns

| Anti-pattern | Why it is bad |
| :-- | :-- |
| Silent drop after retries. | Hides real failures and breaks audit and debugging. |
| Requeue the same message forever. | Blocks the queue head, burns worker capacity, and creates a retry storm. |
| Auto-replay from the DLQ to the main queue. | Can re-trigger the same incident at full speed. |
| No alerts on DLQ growth. | A growing DLQ is a clear signal that something is broken upstream. |
| Mixing DLQ and live traffic on the same consumer. | Pollutes the live path and can cause feedback loops. |

### Operational Concerns

| Concern | Approach |
| :-- | :-- |
| Observability | Metrics for DLQ depth, DLQ rate, top failure reasons, and oldest message age. |
| Playbooks | A documented flow for triage, root cause, fix, replay, and archive. |
| Retention policy | A clear age and size limit, with archiving to cold storage when needed. |
| Replay tool | A small utility or platform feature to drain the DLQ back to the main queue after a fix. |
| Multi-region | DLQs may need to follow the same replication rules as the main queue for compliance. |

### Example: Payment Processing

```
[Order Service] ---> [payments.process] ---> [Payment Consumer]
                              |
                              |  card declined permanently
                              v
                       [payments.dlq]
                              |
                              v
                    Operator reviews, fixes, replays
```

- Retries handle transient processor timeouts.
- After the retry budget, permanent declines go to the DLQ.
- The DLQ preserves the original payment intent, the processor response, and the failure metadata.
- Once the bug or policy is fixed, an operator replays the relevant messages back to the main queue.

### Related Topics

- [Messaging](./messaging.md)
- [Retries, backoff, and jitter](../fault-tolerance/retries-backoff-jitter.md)
- [Event-driven architecture](../architecture/event-driven.md)
- [Resilience patterns](../reliability/resilience-patterns.md)
