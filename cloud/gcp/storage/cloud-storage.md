# Cloud Storage

Cloud Storage is the GCP equivalent of S3: object storage built for durability, scale, and HTTP access. It is the default choice for backups, logs, static assets, and data lakes on GCP.

### Key Features

| Feature | Description |
| :-- | :-- |
| Buckets and objects | Store any number of objects up to 5 TB each. |
| Storage classes | Standard, Nearline, Coldline, Archive. |
| Lifecycle rules | Transition objects to colder tiers or delete them automatically. |
| Versioning | Keep multiple versions of an object. |
| Object hold and retention | Object holds and bucket retention policies. |
| Signed URLs | Time-limited URLs for temporary access. |
| Strong consistency | Read-after-write consistency for all operations. |
| IAM and ACLs | Fine-grained access control with IAM and uniform or fine-grained ACLs. |
| Event notifications | Trigger Pub/Sub or Cloud Functions on object events. |

### When to Use

- You need durable object storage with HTTP access.
- You store backups, logs, static assets, or media files.
- You build a data lake for analytics with BigQuery.
- You need a target for cross-region replication.

### When Not to Use

- You need a POSIX file system mounted to many clients (use [Filestore](https://cloud.google.com/filestore)).
- You need block storage attached to a single VM (use [Persistent Disk](https://cloud.google.com/compute/docs/disks)).
- You need sub-millisecond key-value lookups (consider [Firestore](../database/firestore.md) or [Memorystore](https://cloud.google.com/memorystore)).

### Pricing Model

- Pay per GB-month of storage, per operation, and per GB of egress.
- Storage class strongly affects cost: Archive is much cheaper than Standard.

### Trade-offs

- Pros: 11 nines of durability, strong consistency, deep BigQuery integration, simple IAM.
- Cons: lifecycle and retention design matters; archival retrieval has latency and cost.

### Practical Tips

- Choose the right storage class from the start; transition later.
- Use uniform bucket-level access for simpler IAM.
- Use Object Versioning for important data; combine with lifecycle rules to expire old versions.
- Use VPC Service Controls to protect sensitive buckets.

### Related

- [BigQuery](../database/bigquery.md) for analytics over Cloud Storage
- [Pub/Sub](../messaging/pub-sub.md) for event notifications
- [Cloud Functions](../compute/cloud-functions.md) as a notification handler
- [System design: caching](../../../system-design/caching/README.md)
- [System design: CDN and edge](../../../system-design/communication/cdn-and-edge.md)
