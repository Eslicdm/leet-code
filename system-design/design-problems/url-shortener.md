# URL Shortener Design

A URL shortener maps compact aliases to long URLs and redirects users with low latency.

### Core Requirements

- Create short links.
- Redirect short links to long URLs.
- Track optional analytics.
- Handle high read traffic.

### Key Decisions

| Decision | Common choice |
| :-- | :-- |
| ID generation | Base62 encoded counter, Snowflake-style ID, or random token. |
| Storage | Key-value or relational table keyed by short code. |
| Caching | Cache hot redirects with cache-aside. |
| Expiration | Optional TTL for temporary links. |

### Related Topics

- [Cache-aside](../caching/cache-aside.md)
- [SQL vs NoSQL](../database/sql-vs-nosql.md)
- [Capacity planning](../scalability/capacity-planning.md)