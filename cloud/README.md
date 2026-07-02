# Cloud Knowledge Base

This folder is a practical reference for the most commonly used services across AWS, GCP, and Azure. Services are grouped by provider and by domain (compute, storage, database, network, security, messaging, serverless, devops, monitoring, analytics) so each service can be reviewed independently.

### Providers

| Provider | Folder | Purpose |
| :-- | :-- | :-- |
| [AWS](./aws/) | `aws/` | Amazon Web Services. Largest cloud provider by service breadth and market share. |
| [GCP](./gcp/) | `gcp/` | Google Cloud Platform. Strong in data, ML, and Kubernetes. |
| [Azure](./azure/) | `azure/` | Microsoft Azure. Strong in enterprise, hybrid, and Microsoft ecosystems. |

### Domains

Each provider folder is organized by the same domain taxonomy:

| Domain | Purpose |
| :-- | :-- |
| `compute/` | Virtual machines, managed Kubernetes, and serverless containers. |
| `storage/` | Object storage, block storage, and file storage. |
| `database/` | Managed relational, NoSQL, and data warehouse services. |
| `network/` | VPC, load balancing, CDN, DNS, and edge. |
| `security/` | IAM, secrets, key management, and threat detection. |
| `messaging/` | Queues, pub/sub, and event streaming. |
| `serverless/` | Functions, workflows, and event-driven compute. |
| `devops/` | CI/CD, infrastructure as code, and deployment. |
| `monitoring/` | Metrics, logs, traces, and alerting. |
| `analytics/` | Data warehouse, batch and stream processing. |

### Learning Path

A practical order for new readers:

1. Pick a provider: [AWS](./aws/), [GCP](./gcp/), or [Azure](./azure/).
2. Start with [compute](./aws/compute/) and [storage](./aws/storage/) to understand the base primitives.
3. Add [network](./aws/network/) and [security](./aws/security/) for connectivity and access control.
4. Add [database](./aws/database/) and [messaging](./aws/messaging/) for stateful and asynchronous workloads.
5. Add [serverless](./aws/serverless/) and [devops](./aws/devops/) for higher-level abstractions.
6. Add [monitoring](./aws/monitoring/) and [analytics](./aws/analytics/) for observability and data.

### How to Use This Folder

- Each service file follows the same content convention: purpose, features, when to use, when not to use, pricing, trade-offs, practical tips, and cross-links.
- Cross-links to `system-design/` topics are provided when a service maps to a concept in the system-design knowledge base.
- The planning document at [`cloud-decision.md`](./cloud-decision.md) lists the curated service set and the missing increments that can be added later.

### Project Documents

- [Reorganization decision](./cloud-decision.md): the planning document behind the current folder taxonomy and curated service list.
