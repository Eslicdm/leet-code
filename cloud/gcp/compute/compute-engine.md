# Compute Engine

Compute Engine is the GCP equivalent of EC2: resizable virtual machines with a broad catalog of machine types. It supports custom machine types, sustained use discounts, and preemptible VMs.

### Key Features

| Feature | Description |
| :-- | :-- |
| Machine types | General-purpose, compute-optimized, memory-optimized, and custom machine types. |
| Live migration | VMs are migrated during host maintenance without downtime. |
| Preemptible and Spot VMs | Discounted VMs that can be reclaimed at any time. |
| Sole-tenant nodes | Dedicated physical servers for compliance and licensing. |
| Confidential VMs | VMs with memory encryption using AMD SEV. |
| GPU and TPU | Attach GPUs for ML, graphics, or HPC. |
| Instance groups | Managed (MIG) and unmanaged groups for autoscaling. |

### When to Use

- You need full control over the OS and runtime.
- You are migrating an existing application that expects a VM.
- You need a specific hardware profile, GPU, or confidential compute.
- You want the network performance of Google's global network.

### When Not to Use

- The workload is a stateless HTTP service that fits a serverless container (use [Cloud Run](./cloud-run.md)).
- The workload is event-driven and short-lived (use [Cloud Functions](./cloud-functions.md)).
- You need managed Kubernetes (use [GKE](./gke.md)).

### Pricing Model

- Pay per second of usage after the first minute.
- Sustained use discounts apply automatically.
- Committed use discounts give bigger discounts for 1 or 3 year commitments.
- Spot and preemptible VMs offer deep discounts for fault-tolerant workloads.

### Trade-offs

- Pros: live migration, strong network, custom machine types, deep IAM integration.
- Cons: GCP-specific APIs and pricing; you manage scaling and patching unless using MIGs.

### Practical Tips

- Use Managed Instance Groups (MIGs) for autoscaling and rolling updates.
- Use custom machine types to avoid paying for unused vCPU or memory.
- Use Spot VMs for batch, stateless, or interruption-tolerant workloads.
- Use OS Login and IAM instead of static SSH keys.

### Related

- [GKE](./gke.md) for managed Kubernetes
- [Cloud Run](./cloud-run.md) for serverless containers
- [Cloud Functions](./cloud-functions.md) for event-driven functions
- [VPC](../network/vpc.md) for networking
- [System design: vertical scaling](../../../system-design/scalability/vertical.md)
- [System design: horizontal scaling](../../../system-design/scalability/horizontal.md)
