# GCP Storage

Storage services cover object storage, persistent disks for VMs, and managed file systems.

### Decision Path

| Need | Start with |
| :-- | :-- |
| Store objects, backups, logs, or static assets. | [Cloud Storage](./cloud-storage.md) |

### When to Use GCP Storage

- You need durable object storage with HTTP access and strong consistency.
- You need cross-region replication, lifecycle rules, or archival classes.
- You need a managed equivalent of S3 with a different pricing model.

### Related

- [GCP compute services](../compute/)
- [GCP database services](../database/)
- [System design: caching](../../../system-design/caching/README.md)
