# Write-Through Cache

Write-through caching writes data to the cache and database synchronously before acknowledging success.

### When to Use

- Reads after writes must usually hit fresh cache data.
- Extra write latency is acceptable.
- The system prefers consistency over write speed.

### Trade-offs

| Pros | Cons |
| :-- | :-- |
| Cache is kept fresh on writes. | Every write pays cache and database latency. |
| Read path is fast for recently written data. | Can cache data that is never read again. |
| Easier consistency story than async writes. | Cache or database issues can affect writes. |

### Related Topics

- [Write-around](./write-around.md)
- [Write-back](./write-back.md)