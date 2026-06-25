# Write-Around Cache

Write-around caching sends writes directly to the database and bypasses the cache.

### When to Use

- Many written values are not read soon after writing.
- You want to avoid polluting cache with cold data.
- Cache misses for newly written values are acceptable.

### Trade-offs

| Pros | Cons |
| :-- | :-- |
| Prevents cache pollution. | Recently written data may have high read latency. |
| Keeps cache focused on frequently read data. | Requires invalidation if old cached values exist. |

### Related Topics

- [Cache-aside](./cache-aside.md)
- [Eviction policies](./eviction-policies.md)