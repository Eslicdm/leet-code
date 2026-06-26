# Disaster Recovery

Disaster recovery defines how a system restores service and data after major failures.

### Core Metrics

| Metric | Meaning |
| :-- | :-- |
| `RPO` | Recovery point objective: how much data loss is acceptable. |
| `RTO` | Recovery time objective: how long restoration may take. |

### When to Use

- Data loss or long outages would be unacceptable.
- Systems require backups, multi-region failover, or compliance evidence.
- You need to choose between active-passive and active-active designs.

### Strategies

- Regular backups and restore drills.
- Cross-region replication.
- Automated failover for critical paths.
- Runbooks for manual recovery.

### Trade-offs

- Lower `RPO` and `RTO` increase cost and complexity.
- Backups are only useful if restore is tested.
- Multi-region systems introduce consistency and operational trade-offs.

### Related Topics

- [Leader-follower replication](../database/replication/leader-follower.md)
- [CDN and edge](../communication/cdn-and-edge.md)