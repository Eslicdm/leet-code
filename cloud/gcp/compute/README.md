# GCP Compute

Compute services cover virtual machines, managed Kubernetes, serverless containers, and event-driven functions.

### Decision Path

| Need | Start with |
| :-- | :-- |
| Run a virtual machine. | [Compute Engine](./compute-engine.md) |
| Run managed Kubernetes. | [GKE](./gke.md) |
| Run a serverless container or HTTP service. | [Cloud Run](./cloud-run.md) |
| Run code in response to events. | [Cloud Functions](./cloud-functions.md) |

### When to Use GCP Compute

- You need full control over a VM and its operating system.
- You want managed Kubernetes with strong integration into Google's networking.
- You want a serverless container platform with scale-to-zero.
- You can tolerate GCP-specific APIs, IAM, and pricing.

### Related

- [GCP storage services](../storage/)
- [GCP networking services](../network/)
- [System design: horizontal scaling](../../../system-design/scalability/horizontal.md)
