# Persistent Disk

Persistent Disk provides durable block storage for Compute Engine VMs and GKE nodes. It behaves like a raw, unformatted block device that you mount and format.

### Key Features

| Feature | Description |
| :-- | :-- |
| Types | Standard (HDD), Balanced (SSD-backed), Extreme (SSD), and Hyperdisk. |
| Snapshots | Incremental, space-efficient point-in-time snapshots. |
| Resize online | Increase disk size without detaching. |
| Regional replication | Replicate disks across zones. |
| Source image boot | Create from public images or custom snapshots. |
| Hyperdisk | High-performance storage for compute-intensive workloads. |

### When to Use

- You need durable block storage for a Compute Engine VM.
- You need boot disks for VMs or GKE nodes.
- You need high IOPS or throughput for database workloads.
- You want snapshot-based backup for VM disks.

### When Not to Use

- You need a shared POSIX file system (use [Filestore](./filestore.md)).
- You need object storage (use [Cloud Storage](./cloud-storage.md)).
- You need a managed database (use [Cloud SQL](../database/cloud-sql.md)).

### Pricing Model

- Pay per GB-month based on disk type and size.
- Snapshots: pay per GB-month of stored snapshot data.
- Hyperdisk: pay for provisioned IOPS and throughput.

### Trade-offs

- Pros: durable, snapshot-based backup, online resize, deep Compute Engine integration.
- Cons: single-VM attachment (multi-attach with Hyperdisk), IOPS limits on lower tiers, snapshot restore is not instant.

### Practical Tips

- Use Balanced or Extreme for database workloads.
- Use Hyperdisk for high-performance computing or large databases.
- Use snapshots for backup; automate with snapshot schedules.
- Resize disks online when you need more capacity.

### Related

- [Cloud Storage](./cloud-storage.md) for object storage
- [Filestore](./filestore.md) for shared file systems
- [Compute Engine](../compute/compute-engine.md) for VMs
