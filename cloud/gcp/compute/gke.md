# Google Kubernetes Engine (GKE)

GKE is a managed Kubernetes service. It supports standard Kubernetes APIs with options for Autopilot (fully managed) and Standard modes, and integrates deeply with Google's networking and IAM.

### Key Features

| Feature | Description |
| :-- | :-- |
| Autopilot mode | Google manages nodes, scaling, and security; you manage pods. |
| Standard mode | You manage node pools; Google manages the control plane. |
| Regional and zonal clusters | Control plane HA and pod anti-affinity. |
| Auto-scaling | Cluster autoscaler, node auto-provisioning, and vertical pod autoscaling. |
| Workload Identity | Bind Kubernetes service accounts to Google IAM service accounts. |
| GKE Enterprise | Multi-cluster management, service mesh, and policy control. |
| Spot VMs | Run nodes on Spot VMs for cost savings. |
| Confidential nodes | Encrypted nodes for sensitive workloads. |

### When to Use

- You need Kubernetes APIs, custom operators, or portability across clouds.
- You want a managed control plane with Google's networking and security.
- You want strong integration with Cloud Logging, Cloud Monitoring, and Cloud Build.

### When Not to Use

- You do not need Kubernetes features (use [Cloud Run](./cloud-run.md) or [Compute Engine](./compute-engine.md)).
- Your team has no Kubernetes experience and the workload is simple.
- You want the simplest path to run a container with scale-to-zero.

### Pricing Model

- Pay per cluster management fee (Standard mode) or per pod resources (Autopilot).
- Pay for the underlying compute (vCPU and memory) and any attached storage.
- Spot VMs reduce compute cost.

### Trade-offs

- Pros: managed control plane, Autopilot, deep Google networking, strong integrations.
- Cons: Kubernetes operational complexity; standard mode still requires node management.

### Practical Tips

- Start with Autopilot for most new workloads.
- Use Workload Identity instead of node-level service account keys.
- Use the GKE Gateway Controller for managed ingress.
- Use Vertical Pod Autoscaling to right-size requests and limits.

### Related

- [Compute Engine](./compute-engine.md) for the underlying nodes
- [Cloud Run](./cloud-run.md) for a simpler serverless container platform
- [Cloud Build](../devops/google-cloud-build.md) for CI/CD
- [VPC](../network/vpc.md) for networking
- [System design: monolith vs microservices](../../../system-design/architecture/monolith-vs-microservices.md)
