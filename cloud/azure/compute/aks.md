# AKS (Azure Kubernetes Service)

AKS is a managed Kubernetes service in Azure. It supports standard Kubernetes APIs, integrates with Entra ID, and offers options for production-grade cluster management.

### Key Features

| Feature | Description |
| :-- | :-- |
| Managed control plane | Microsoft manages the Kubernetes API and etcd. |
| Node pools | Linux or Windows node pools with VM scale sets. |
| Entra ID integration | Cluster access tied to Entra ID users, groups, and service accounts. |
| Azure CNI and Kubenet | Choose network plugin based on IP and feature needs. |
| Automatic upgrades | Optional automatic Kubernetes version upgrades. |
| Confidential containers | Encrypted nodes and pods. |
| AKS Automatic | Fully managed nodes, scaling, and security. |
| Azure Container Storage | Managed storage for stateful workloads. |
| AKS Add-ons | Managed versions of Ingress, Monitoring, and Policy. |

### When to Use

- You need Kubernetes APIs, custom operators, or portability across clouds.
- You want a managed control plane integrated with Entra ID and Azure networking.
- You have a team experienced in Kubernetes operations.

### When Not to Use

- You do not need Kubernetes features (use [Container Apps](./container-apps.md) or [App Service](./app-service.md)).
- Your team has no Kubernetes experience and the workload is simple.
- You want the simplest path to run a container with scale-to-zero (use [Container Apps](./container-apps.md)).

### Pricing Model

- Pay per node (vCPU and memory).
- Control plane is free (you only pay for the nodes).
- Pay for attached storage and load balancers.

### Trade-offs

- Pros: managed control plane, Entra ID integration, AKS Automatic option, deep Azure networking.
- Cons: Kubernetes operational complexity; some advanced features require careful planning.

### Practical Tips

- Use Entra ID integration for cluster access instead of local accounts.
- Use AKS Automatic for most new workloads.
- Use Azure CNI Overlay for simpler IP planning.
- Use Azure Policy for Kubernetes to enforce guardrails.

### Related

- [Virtual Machines](./virtual-machines.md) for the underlying nodes
- [Container Apps](./container-apps.md) for a simpler container platform
- [App Service](./app-service.md) for managed web apps
- [Virtual Network](../network/virtual-network.md) for networking
- [System design: monolith vs microservices](../../../system-design/architecture/monolith-vs-microservices.md)
