# Capacity Planning

Capacity planning forecasts traffic, storage, compute, and network needs before growth causes bottlenecks.

### Planning Inputs

| Input | Why it matters |
| :-- | :-- |
| Users and traffic | Determines QPS and concurrency. |
| Payload sizes | Determines bandwidth and storage. |
| Read/write ratio | Determines database and cache design. |
| Peak multiplier | Determines safety margin. |
| Retention period | Determines long-term storage. |

### When to Use

- Before launching a new system.
- Before a traffic event or product launch.
- Before choosing vertical scaling, horizontal scaling, sharding, or caching.

### Trade-offs

- Over-provisioning wastes money.
- Under-provisioning causes throttling, high latency, or outages.
- Capacity plans must be revisited as real metrics replace assumptions.

### Related Topics

- [Back-of-the-envelope estimation](../fundamentals/back-of-envelope.md)
- [Horizontal scaling](./horizontal.md)