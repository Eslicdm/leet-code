# Consistent Hashing

Consistent hashing maps keys and nodes onto a logical ring so adding or removing nodes moves fewer keys.

### When to Use

- Nodes are added or removed frequently.
- You want lower remapping cost than `Hash(key) % N`.
- You are designing distributed caches, storage, or routing rings.

### Trade-offs

| Pros | Cons |
| :-- | :-- |
| Only a fraction of keys move when nodes change. | More complex than modulo hashing. |
| Works well for elastic clusters. | Needs virtual nodes for smoother distribution. |

### Related Topics

- [Hash-based sharding](./hash-based.md)
- [Cache-aside](../../caching/cache-aside.md)