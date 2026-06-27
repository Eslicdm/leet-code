# CAP and PACELC

Distributed systems force explicit trade-offs between consistency, availability, partition tolerance, and latency.

### CAP Theorem

In a distributed data store, you can provide at most two of these guarantees during a network partition:

| Guarantee | Meaning |
| :-- | :-- |
| Consistency | Every read receives the most recent write or an error. |
| Availability | Every non-failing node returns a non-error response. |
| Partition tolerance | The system continues operating despite dropped or delayed network messages. |

In real networks, partitions happen, so practical designs choose between `CP` and `AP` during partitions.

### CP vs AP

| Choice | Behavior | Good for |
| :-- | :-- | :-- |
| `CP` | Reject or delay operations to preserve correctness. | Banking, inventory, ledgers. |
| `AP` | Accept operations and reconcile later. | Feeds, likes, metrics, collaborative content. |

### PACELC Theorem

`PACELC` extends `CAP`:

- If there is a partition, choose between availability and consistency.
- Else, choose between latency and consistency.

### Examples

- `PC/EC`: chooses consistency during partitions and consistency in normal operation, paying latency cost.
- `PA/EL`: chooses availability during partitions and latency in normal operation, accepting temporary inconsistency.

### Related Topics

- [Consistency models](../database/consistency-models.md)
- [Leaderless replication](../database/replication/leaderless.md)