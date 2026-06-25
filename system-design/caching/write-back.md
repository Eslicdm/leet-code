# Write-Back Cache

Write-back, or write-behind, acknowledges writes after updating cache and persists to the database asynchronously.

### When to Use

- Write latency must be extremely low.
- The system can tolerate complex recovery and durability mechanisms.
- Writes can be buffered and flushed in batches.

### Trade-offs

| Pros | Cons |
| :-- | :-- |
| Very fast writes. | Risk of data loss if cache fails before persistence. |
| Reduces database write pressure with batching. | Requires durable queues, replication, or recovery logs. |
| Can smooth write spikes. | Harder operational model. |

### Related Topics

- [Write-through](./write-through.md)
- [Disaster recovery](../reliability/disaster-recovery.md)