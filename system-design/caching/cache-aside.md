# Cache-Aside

Cache-aside, or lazy loading, lets the application read from cache first and load from the database only on a cache miss.

### Flow

1. The application queries the cache.
2. On cache hit, it returns cached data.
3. On cache miss, it queries the database.
4. The application writes the result into cache and returns it.

### When to Use

- The workload is read-heavy.
- Missing cache data can be fetched from the source of truth.
- Cache failure should not make the full system unavailable.

### Trade-offs

| Pros | Cons |
| :-- | :-- |
| Only requested data is cached. | Cache misses add latency. |
| Cache failures can fall back to the database. | Data can become stale without invalidation. |
| Simple and widely used. | Repeated misses can stampede the database. |

### Related Topics

- [Eviction policies](./eviction-policies.md)
- [Consistency models](../database/consistency-models.md)