# Leader-Follower Replication

Leader-follower replication sends all writes to one primary node and replicates changes to follower replicas.

### How It Works

- Clients send writes to the leader.
- The leader replicates changes to followers synchronously or asynchronously.
- Clients can read from followers to scale read traffic.

### When to Use

- Read traffic is much higher than write traffic.
- A single write leader is acceptable.
- You need a simple high-availability pattern with failover.

### Trade-offs

| Pros | Cons |
| :-- | :-- |
| Simple write ordering. | Leader can become a write bottleneck. |
| Read replicas scale reads. | Async followers can serve stale reads. |
| Failover improves availability. | Failover can cause brief downtime or split-brain risk. |

### Related Topics

- [Consistency models](../consistency-models.md)
- [Disaster recovery](../../reliability/disaster-recovery.md)