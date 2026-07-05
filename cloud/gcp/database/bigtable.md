# Bigtable

Bigtable is a fully managed wide-column NoSQL database for large analytical and operational workloads. It is the same database that powers Google Search, Maps, and Gmail.

### Key Features

| Feature | Description |
| :-- | :-- |
| Wide-column store | Petabyte-scale with low-latency reads and writes. |
| Single-digit ms latency | At any scale, for any read or write. |
| Replication | Multi-cluster replication across regions. |
| HBase API | Compatible with Apache HBase API. |
| Dataflow integration | Native read and write connectors for Apache Beam. |
| Change streams | Capture changes for downstream processing. |
| Workload isolation | Separate storage and compute. |

### When to Use

- You need a wide-column store for massive analytical or time-series workloads.
- You need single-digit millisecond latency at petabyte scale.
- You need high write throughput for IoT, time-series, or logging data.
- You are migrating from self-managed HBase.

### When Not to Use

- You need a relational database (use [Cloud SQL](./cloud-sql.md)).
- You need a globally distributed relational database with strong consistency (use [Spanner](./spanner.md)).
- You need a document store with realtime sync (use [Firestore](./firestore.md)).
- Your data fits comfortably in a single relational database.

### Pricing Model

- Pay per node-hour and per GB of storage.
- Replication multiplies node costs.
- No charges for storage replication within a cluster.

### Trade-offs

- Pros: petabyte-scale, low latency, high write throughput, managed HBase API.
- Cons: no SQL interface, no secondary indexes, limited query flexibility, operational complexity for small workloads.

### Practical Tips

- Design row keys carefully; they determine read/write performance.
- Use replication for high availability and read scaling.
- Use Dataflow for ETL and analytics over Bigtable data.
- Use the HBase shell and client libraries for development.

### Related

- [Cloud SQL](./cloud-sql.md) for relational workloads
- [Spanner](./spanner.md) for global relational
- [Firestore](./firestore.md) for NoSQL documents
- [Dataflow](../analytics/dataflow.md) for stream and batch processing
