# Performance Metrics

Performance metrics help you decide whether a system is fast enough for users and efficient enough for infrastructure.

### Core Metrics

| Metric | Meaning | Optimize for |
| :-- | :-- | :-- |
| Latency | Time for one unit of work to complete, such as one API round trip. | Low p95 and p99 latency. |
| Throughput | Units of work completed per time window, such as QPS or TPS. | Maximum safe work per second. |
| Bandwidth | Maximum data transferred over a network path per time window. | Enough network capacity for payload volume. |

### Highway Analogy

- `Bandwidth` is the number of lanes on the highway.
- `Latency` is the time one car takes to travel from point A to point B.
- `Throughput` is the number of cars passing a point per second.

### When to Use

- Use latency percentiles when user experience matters.
- Use throughput when sizing services, queues, workers, and databases.
- Use bandwidth when large payloads, media, replication, or cross-region traffic dominate cost and delay.

### Trade-offs

- Lower latency often requires more replicas, caching, or regional deployment.
- Higher throughput often requires batching, async processing, or horizontal scaling.
- More bandwidth reduces transfer bottlenecks but can increase infrastructure cost.

### Related Topics

- [Vertical scaling](../scalability/vertical.md)
- [Horizontal scaling](../scalability/horizontal.md)
- [Capacity planning](../scalability/capacity-planning.md)