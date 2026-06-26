# SQL vs NoSQL

The SQL versus NoSQL decision depends on data shape, transaction guarantees, query patterns, and scaling needs.

### Decision Table

| Choose | When |
| :-- | :-- |
| SQL | Data is structured, relationships matter, joins are common, and ACID transactions are required. |
| NoSQL | Data is semi-structured, schema evolves quickly, or the workload needs massive horizontal scale. |

### SQL

Relational databases such as PostgreSQL, MySQL, and SQL Server store data in tables with predefined schemas and relations.

### NoSQL Types

| Type | Examples | Best for |
| :-- | :-- | :-- |
| Document | MongoDB, CouchDB | JSON-like application objects. |
| Key-value | Redis, DynamoDB | Caching, sessions, simple lookups. |
| Wide-column | Cassandra, HBase | Massive write-heavy analytical workloads. |
| Graph | Neo4j, JanusGraph | Social graphs, recommendations, fraud detection. |

### Trade-offs

- SQL gives strong consistency and rich queries but can be harder to scale horizontally.
- NoSQL gives flexible models and horizontal scaling but often accepts weaker consistency or narrower query patterns.

### Related Topics

- [Replication](./replication/README.md)
- [Sharding](./sharding/README.md)
- [Consistency models](./consistency-models.md)