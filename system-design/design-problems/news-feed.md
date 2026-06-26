# News Feed Design

A news feed ranks and delivers posts from followed users or sources with low latency and acceptable freshness.

### Core Requirements

- Publish posts.
- Generate feed timelines.
- Rank and paginate results.
- Handle celebrity users and high fan-out.

### Key Decisions

| Decision | Options |
| :-- | :-- |
| Fan-out | Fan-out on write, fan-out on read, or hybrid. |
| Ranking | Chronological, engagement-based, ML-ranked. |
| Storage | Post store plus timeline store. |
| Consistency | Usually eventual consistency for feed freshness. |

### Related Topics

- [Event-driven architecture](../architecture/event-driven.md)
- [Caching](../caching/README.md)
- [Consistency models](../database/consistency-models.md)