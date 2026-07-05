# System Design Knowledge Base

This folder is a practical, topic-focused reference for designing distributed systems at scale. It is organized as small, navigable modules so each decision can be reviewed independently.

### Folders

| Folder | Purpose |
| :-- | :-- |
| [fundamentals/](./fundamentals/) | Core concepts: performance metrics, availability, CAP/PACELC, back-of-the-envelope estimation. |
| [scalability/](./scalability/) | Vertical and horizontal scaling, load shedding, and capacity planning. |
| [fault-tolerance/](./fault-tolerance/) | Resilience patterns: circuit breaker, retries, timeouts, bulkheads. |
| [architecture/](./architecture/) | Monolith vs microservices, event-driven, CQRS, event sourcing, saga. |
| [database/](./database/) | SQL vs NoSQL, replication, sharding, indexing, consistency models. |
| [caching/](./caching/) | Cache-aside, write-through, write-around, write-back, eviction policies. |
| [communication/](./communication/) | API protocols, load balancing, messaging, service discovery, CDN, proxies. |
| [reliability/](./reliability/) | Observability, disaster recovery, and resilience checklists. |
| [security/](./security/) | Authentication, authorization, OAuth2, JWT, sessions. |
| [design-problems/](./design-problems/) | End-to-end applied designs: URL shortener, rate limiter, news feed, chat. |
| [devops/](./devops/) | Git branching strategies, semantic versioning, environment promotion. |

### Learning Path

A practical order for new readers:

1. [Performance metrics](./fundamentals/performance-metrics.md) and [availability and reliability](./fundamentals/availability-reliability.md).
2. [Back-of-the-envelope estimation](./fundamentals/back-of-envelope.md) and [capacity planning](./scalability/capacity-planning.md).
3. [Vertical](./scalability/vertical.md) and [horizontal](./scalability/horizontal.md) scaling.
4. [SQL vs NoSQL](./database/sql-vs-nosql.md), [replication](./database/replication/README.md), and [sharding](./database/sharding/README.md).
5. [Caching strategies](./caching/README.md) and [cache eviction policies](./caching/eviction-policies.md).
6. [Fault tolerance](./fault-tolerance/README.md) and [resilience patterns](./reliability/resilience-patterns.md).
7. [Architecture patterns](./architecture/) and [communication](./communication/).
8. [Observability](./reliability/observability.md) and [disaster recovery](./reliability/disaster-recovery.md).
9. [Design problems](./design-problems/) to apply the patterns end-to-end.

### Fastest Path by Decision

| Decision | Start with |
| :-- | :-- |
| Estimate traffic, storage, and cost. | [Back-of-the-envelope estimation](./fundamentals/back-of-envelope.md) |
| Scale the system. | [Scalability decision guide](./scalability/README.md) |
| Choose a database and replication. | [SQL vs NoSQL](./database/sql-vs-nosql.md), [Replication](./database/replication/README.md) |
| Partition data. | [Sharding](./database/sharding/README.md) |
| Cache reads. | [Caching decision guide](./caching/README.md) |
| Protect against failures. | [Fault tolerance decision guide](./fault-tolerance/README.md) |
| Choose a service architecture. | [Monolith vs microservices](./architecture/monolith-vs-microservices.md) |
| Structure Git workflows and releases. | [Git branching strategies](./devops/README.md) |
| Coordinate multiple services. | [Saga and distributed transactions](./architecture/saga-and-distributed-transactions.md) |
| Operate a distributed system. | [Observability](./reliability/observability.md), [Disaster recovery](./reliability/disaster-recovery.md) |
