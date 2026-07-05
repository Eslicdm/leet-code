# Filestore

Filestore provides fully managed NFS file systems for GCP workloads. It is designed for applications that need a shared POSIX-compatible file system.

### Key Features

| Feature | Description |
| :-- | :-- |
| NFS v3 and v4.1 | POSIX-compatible shared file systems. |
| Tiers | Basic HDD, Basic SSD, Regional, and Enterprise. |
| Capacity | 1 TB to 100 TB per instance. |
| Snapshots | Point-in-time snapshots for backup. |
| Cross-zone replication | Regional instances replicate across zones. |
| Integrations | Mount from GKE, Compute Engine, and Cloud Run (shared VPC). |

### When to Use

- Your GKE or Compute Engine workloads need a shared POSIX file system.
- You need high-performance shared storage for AI/ML training.
- You have lift-and-shift workloads that expect NFS.
- You need a managed file system without running NFS servers.

### When Not to Use

- You need object storage (use [Cloud Storage](./cloud-storage.md)).
- You need a persistent disk for a single VM (use [Persistent Disk](./persistent-disk.md)).
- You need a serverless database (use [Cloud SQL](../database/cloud-sql.md)).

### Pricing Model

- Pay per GB-month of provisioned capacity.
- Tiers have different performance and pricing.
- Snapshots are charged per GB-month.

### Trade-offs

- Pros: fully managed, POSIX-compatible, deep GKE integration.
- Cons: not as scalable as object storage, capacity is provisioned not elastic, higher cost per GB than Cloud Storage.

### Practical Tips

- Use Basic SSD tier for performance-sensitive workloads.
- Use Regional tier for HA across zones.
- Use snapshots for backup and point-in-time recovery.
- Mount from GKE using the Filestore CSI driver.

### Related

- [Cloud Storage](./cloud-storage.md) for object storage
- [Persistent Disk](./persistent-disk.md) for single-VM block storage
- [GKE](../compute/gke.md) for container orchestration
