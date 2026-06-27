# Caching

Caching decisions define where to store frequently used data so reads become faster and origin systems receive less load.

Use this folder to choose a cache write strategy, understand invalidation risk, and select eviction behavior.

### Decision Path

| Requirement | Start with |
| :-- | :-- |
| Optimize read-heavy workloads with application-controlled loading. | [Cache-aside](./cache-aside.md) |
| Keep cache and database updated synchronously on writes. | [Write-through](./write-through.md) |
| Avoid filling cache with data that may never be read again. | [Write-around](./write-around.md) |
| Prioritize write latency and tolerate recovery complexity. | [Write-back](./write-back.md) |
| Decide what leaves the cache under pressure. | [Eviction policies](./eviction-policies.md) |

### Related Topics

- [SQL vs NoSQL](../database/sql-vs-nosql.md)
- [Consistency models](../database/consistency-models.md)
- [CDN and edge](../communication/cdn-and-edge.md)