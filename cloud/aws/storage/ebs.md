# Amazon EBS

EBS (Elastic Block Store) provides persistent block storage volumes for use with EC2 instances. It behaves like a network-attached disk.

### Key Features

| Feature | Description |
| :-- | :-- |
| Volume types | gp3, gp2 (general SSD), io1/io2 (provisioned IOPS SSD), st1 (throughput HDD), sc1 (cold HDD). |
| Snapshots | Point-in-time backups stored in S3, copyable across regions. |
| Encryption | At-rest encryption with KMS keys. |
| Elastic volumes | Modify volume type, size, and IOPS without detaching. |
| Multi-Attach | Attach a single io1/io2 volume to multiple instances in the same AZ. |

### When to Use

- You need persistent block storage for an EC2 instance.
- You need predictable IOPS or throughput for a database or boot volume.
- You need snapshots for backup and disaster recovery.

### When Not to Use

- You need shared file system access from many instances (use [EFS](https://aws.amazon.com/efs/) or FSx).
- You need object storage with HTTP access (use [S3](./s3.md)).
- You do not need an EC2 instance at all (consider RDS, DynamoDB, or another managed service).

### Pricing Model

- Pay per GB-month of provisioned storage.
- Provisioned IOPS volumes (io1/io2) charge separately for IOPS and sometimes throughput.
- gp3 includes a baseline of 3,000 IOPS and 125 MB/s free; additional performance is billed.

### Trade-offs

- Pros: low-latency block storage, snapshots, encryption, easy to resize.
- Cons: tied to a single AZ; cross-AZ access requires snapshots or a copy.

### Practical Tips

- Use gp3 for most workloads; it is cheaper than gp2 and decouples size from performance.
- Use io2 Block Express for high-IOPS, latency-sensitive databases.
- Take snapshots before risky changes; copy them to another region for disaster recovery.
- Monitor `BurstBalance` on gp2 to avoid performance throttling.

### Related

- [S3](./s3.md) for object storage and snapshot storage
- [EC2](../compute/ec2.md) for the instance that attaches the volume
- [RDS](../database/rds.md) for managed databases that use EBS under the hood
