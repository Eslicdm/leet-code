# CDN and Edge

CDN and edge decisions move content or compute closer to users to reduce latency and origin load.

### When to Use

- Static assets, images, videos, or downloads are served globally.
- Users are geographically far from the origin.
- Origin servers need protection from traffic spikes.

### Decision Table

| Pattern | Best for | Trade-off |
| :-- | :-- | :-- |
| CDN caching | Static or cacheable content. | Invalidation can be hard. |
| Edge compute | Lightweight logic near users. | Runtime limits and deployment complexity. |
| Geo-routing | Sending users to nearby regions. | Data consistency and failover complexity. |

### Trade-offs

- Lower latency and lower origin traffic.
- Better global availability when paired with regional failover.
- Cache invalidation and stale content need explicit strategy.

### Related Topics

- [Cache eviction policies](../caching/eviction-policies.md)
- [Disaster recovery](../reliability/disaster-recovery.md)