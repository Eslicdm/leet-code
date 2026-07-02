# Azure Storage

Storage services cover object storage, managed disks for VMs, and file shares.

### Decision Path

| Need | Start with |
| :-- | :-- |
| Store objects, backups, logs, or static assets. | [Blob Storage](./blob-storage.md) |

### When to Use Azure Storage

- You need durable object storage with HTTP access.
- You need lifecycle policies, immutability, or archive tiers.
- You need to share files with on-premises Windows workloads.

### Related

- [Azure compute services](../compute/)
- [Azure database services](../database/)
- [System design: caching](../../../system-design/caching/README.md)
