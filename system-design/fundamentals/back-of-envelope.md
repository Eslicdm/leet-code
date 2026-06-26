# Back-of-the-Envelope Estimation

Back-of-the-envelope estimation turns product assumptions into rough traffic, storage, bandwidth, and compute requirements.

### When to Use

- At the start of a system design interview.
- Before choosing databases, caches, queues, and shard counts.
- When comparing build options by cost and capacity.

### Estimation Flow

| Step | Example question |
| :-- | :-- |
| Traffic | How many daily active users and requests per second? |
| Storage | How much data is created per user action? |
| Bandwidth | How much data is read and written over the network? |
| Compute | How many workers or instances are needed for peak load? |

### Useful Formulas

- `Average QPS = requests per day / 86,400`
- `Peak QPS = average QPS * peak multiplier`
- `Storage per day = writes per day * average object size`
- `Bandwidth = QPS * average response size`

### Trade-offs

- Estimates should be simple and explicit, not perfectly precise.
- Always state assumptions and round numbers.
- Peak traffic matters more than average traffic for capacity planning.

### Related Topics

- [Capacity planning](../scalability/capacity-planning.md)
- [Performance metrics](./performance-metrics.md)