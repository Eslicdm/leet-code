# Firestore

Firestore is a serverless, document-oriented NoSQL database. It offers realtime sync, strong offline support, and a simple client SDK across web and mobile platforms.

### Key Features

| Feature | Description |
| :-- | :-- |
| Document model | Hierarchical collections and subcollections with documents. |
| Realtime sync | Listen to document changes from web and mobile clients. |
| Offline support | Local cache and sync when the device comes back online. |
| Strong consistency | Strong consistency for queries within a document or transaction. |
| Two modes | Native mode (Firestore) and Datastore mode for App Engine compatibility. |
| Security rules | Attribute-based and identity-aware access control. |
| Multi-region | Strongly consistent multi-region replication. |
| BigQuery integration | Export Firestore data to BigQuery for analytics. |

### When to Use

- You build web or mobile apps that need realtime sync and offline support.
- You want a managed NoSQL document store with simple client SDKs.
- You want strong per-document consistency with flexible schema.

### When Not to Use

- You need a relational database with joins and SQL (use [Cloud SQL](./cloud-sql.md) or [Spanner](./spanner.md)).
- You need a key-value store with single-digit millisecond latency at high scale (use [Memorystore](https://cloud.google.com/memorystore) for Redis).
- You need a wide-column store for huge analytical workloads (consider [Bigtable](https://cloud.google.com/bigtable)).
- You need cross-document transactional queries over many entities (Firestore transactions are limited to 500 documents).

### Pricing Model

- Pay per document read, write, and delete.
- Pay per GB-month of storage.
- Free tier includes 1 GB storage and small daily quotas.

### Trade-offs

- Pros: serverless, realtime sync, offline support, simple SDKs, deep mobile integration.
- Cons: limited query expressiveness, costs grow with document reads, transactional limits.

### Practical Tips

- Model data for the queries you need; avoid cross-collection queries.
- Use subcollections for related data that is always read with the parent.
- Use security rules to enforce access control close to the data.
- Use the BigQuery export for analytics to avoid scanning production collections.

### Related

- [Cloud SQL](./cloud-sql.md) for relational
- [Spanner](./spanner.md) for global relational
- [BigQuery](./bigquery.md) for analytics over Firestore data
- [Cloud Storage](../storage/cloud-storage.md) for large blobs
- [System design: SQL vs NoSQL](../../../system-design/database/sql-vs-nosql.md)
