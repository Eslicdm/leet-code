# Availability and Reliability

Availability and reliability describe different dimensions of system health: whether the system is reachable and whether it behaves correctly.

### Decision Table

| Concept | Meaning | Key metric |
| :-- | :-- | :-- |
| Reliability | The system performs its required function correctly over time. | `MTBF` |
| Availability | The system is operational and able to handle requests. | `MTTR`, uptime percentage |

### Availability Formula

`Availability = MTBF / (MTBF + MTTR)`

### The Nines

| Availability | Downtime per year | Downtime per day |
| :-- | :-- | :-- |
| `99%` | 3.65 days | 14.4 minutes |
| `99.9%` | 8.77 hours | 1.44 minutes |
| `99.99%` | 52.6 minutes | 8.6 seconds |
| `99.999%` | 5.26 minutes | 0.86 seconds |

### SLIs, SLOs, and SLAs

- `SLI`: a measured indicator, such as `p95 latency < 200ms`.
- `SLO`: the internal target for an SLI over a window.
- `SLA`: the external promise and consequences if the promise is broken.

### When to Use

- Prioritize reliability for data correctness, financial operations, and compliance.
- Prioritize availability for user-facing services where partial failure is better than downtime.

### Related Topics

- [Fault tolerance](../fault-tolerance/README.md)
- [Disaster recovery](../reliability/disaster-recovery.md)