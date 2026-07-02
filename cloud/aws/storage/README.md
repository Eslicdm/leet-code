# AWS Storage

Storage services cover object storage, block storage for EC2, file systems, and cold archives.

### Decision Path

| Need | Start with |
| :-- | :-- |
| Store objects, backups, logs, or static assets. | [S3](./s3.md) |
| Attach block storage to an EC2 instance. | [EBS](./ebs.md) |

### When to Use AWS Storage

- You need durable object storage with HTTP access.
- You need persistent block storage for a single EC2 instance.
- You need cross-region replication or a long-term archive tier.

### Related

- [AWS compute services](../compute/)
- [AWS database services](../database/)
- [System design: caching](../../../system-design/caching/README.md)
