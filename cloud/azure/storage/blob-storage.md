# Blob Storage

Azure Blob Storage is the Azure equivalent of S3: object storage built for durability, scale, and HTTP access. It is the default choice for backups, logs, static assets, and data lakes on Azure.

### Key Features

| Feature | Description |
| :-- | :-- |
| Containers and blobs | Store any number of blobs up to 4.77 TB each. |
| Access tiers | Hot, Cool, Cold, and Archive. |
| Lifecycle management | Move blobs to colder tiers or delete them automatically. |
| Versioning | Keep multiple versions of a blob. |
| Immutable storage | Time-based retention policies for compliance. |
| Soft delete | Recover blobs and containers after deletion. |
| Signed URLs | Time-limited URLs for temporary access. |
| Strong consistency | Strong consistency for all operations. |
| Event Grid integration | Trigger Functions or Logic Apps on blob events. |
| ADLS Gen2 | Hierarchical namespace for big data and analytics workloads. |

### When to Use

- You need durable object storage with HTTP access.
- You store backups, logs, static assets, or media files.
- You build a data lake for analytics with Synapse or Databricks.
- You need to expose blobs to a CDN or to web clients.

### When Not to Use

- You need a POSIX file system mounted to many clients (use [Azure Files](https://azure.microsoft.com/en-us/products/storage/files/)).
- You need block storage attached to a single VM (use [Azure Disk Storage](https://azure.microsoft.com/en-us/products/storage/disks)).
- You need sub-millisecond key-value lookups (consider [Cosmos DB](../database/cosmos-db.md) or Azure Cache for Redis).

### Pricing Model

- Pay per GB-month of storage, per operation, and per GB of egress.
- Access tier strongly affects cost: Archive is much cheaper than Hot.

### Trade-offs

- Pros: 11 nines of durability, deep Azure integration, strong consistency, ADLS Gen2.
- Cons: archive retrieval has latency and cost; lifecycle policy design matters.

### Practical Tips

- Choose the right access tier from the start.
- Use lifecycle management to move data to colder tiers automatically.
- Use immutable storage for compliance and audit requirements.
- Use Azure AD authentication with managed identity instead of shared keys.

### Related

- [Azure Files](https://azure.microsoft.com/en-us/products/storage/files/) for SMB file shares
- [Azure Disk Storage](https://azure.microsoft.com/en-us/products/storage/disks) for VM disks
- [Front Door](../network/front-door.md) for global caching
- [Functions](../compute/functions.md) as a blob event handler
- [System design: caching](../../../system-design/caching/README.md)
- [System design: CDN and edge](../../../system-design/communication/cdn-and-edge.md)
