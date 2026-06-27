# Bulkheads

Bulkheads isolate resources so one failing dependency, tenant, or workload cannot consume all system capacity.

### When to Use

- One dependency can exhaust shared thread pools or connection pools.
- Tenants have different traffic profiles or priorities.
- Background jobs can interfere with user-facing requests.

### Common Bulkheads

| Bulkhead | Protects |
| :-- | :-- |
| Separate thread pools | CPU and request execution capacity. |
| Separate connection pools | Database, cache, and downstream connections. |
| Separate queues | Worker capacity and retry backlogs. |
| Tenant quotas | Fairness across customers. |

### Trade-offs

- Improves fault isolation.
- Can reduce overall utilization because capacity is partitioned.
- Requires monitoring each isolated pool.

### Related Topics

- [Rate limiter design](../design-problems/rate-limiter.md)
- [Resilience patterns](../reliability/resilience-patterns.md)