# Cache Eviction Policies

Eviction policies decide what data leaves cache when memory is full or data is expired.

### Decision Table

| Policy | Evicts | Best for |
| :-- | :-- | :-- |
| `LRU` | Least recently used items. | General-purpose caches with temporal locality. |
| `LFU` | Least frequently used items. | Stable hot-key workloads. |
| `FIFO` | Oldest inserted items. | Simple queues or predictable insertion patterns. |
| `TTL` | Items older than a configured age. | Data with known freshness windows. |

### When to Use

- Use `LRU` as a common default.
- Use `LFU` when old but frequently used data should stay hot.
- Use `TTL` when stale data is dangerous or freshness is time-based.

### Trade-offs

- Aggressive eviction increases cache misses.
- Long retention improves hit rate but increases staleness risk.
- Eviction policy should match access pattern, not just cache size.

### Related Topics

- [Cache-aside](./cache-aside.md)
- [Capacity planning](../scalability/capacity-planning.md)