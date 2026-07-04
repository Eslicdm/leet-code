# Virtual Machines

Azure Virtual Machines provides resizable virtual machines in the cloud. It supports Windows and Linux, a broad catalog of VM sizes, and integration with the Microsoft ecosystem.

### Key Features

| Feature | Description |
| :-- | :-- |
| VM sizes | General-purpose, compute-optimized, memory-optimized, GPU, and custom. |
| Azure Hybrid Benefit | Use existing Windows Server and SQL Server licenses on Azure. |
| Availability sets and zones | High-availability configurations within or across datacenters. |
| Virtual Machine Scale Sets | Group of VMs that scale automatically. |
| Spot VMs | Discounted VMs that can be evicted. |
| Confidential VMs | Encrypted VMs with AMD SEV-SNP. |
| Azure Bastion | Managed RDP/SSH access without public IPs. |
| Extensions | Install and configure agents on VMs at boot time. |

### When to Use

- You need full control over the OS and runtime.
- You are migrating an existing Windows Server or Linux workload.
- You have existing Microsoft licenses and want to use them.
- You need a specific hardware profile such as GPU or high memory.

### When Not to Use

- The workload is a stateless web app (use [App Service](./app-service.md) or [Container Apps](./container-apps.md)).
- The workload is event-driven and short-lived (use [Functions](./functions.md)).
- You need managed Kubernetes (use [AKS](./aks.md)).

### Pricing Model

- Pay per second of usage.
- Reserved Instances and Savings Plans offer significant discounts.
- Spot VMs are deeply discounted for fault-tolerant workloads.
- Azure Hybrid Benefit can reduce Windows and SQL license cost.

### Trade-offs

- Pros: deep Windows and SQL Server integration, broad VM catalog, Hybrid Benefit.
- Cons: you manage scaling and patching unless you use scale sets and update management.

### Practical Tips

- Use Managed Disks instead of unmanaged disks.
- Use Azure Bastion instead of opening RDP/SSH ports to the internet.
- Use Virtual Machine Scale Sets for stateless workloads.
- Use Update Management and Azure Monitor for patching and observability.

### Related

- [AKS](./aks.md) for managed Kubernetes
- [Container Apps](./container-apps.md) for serverless containers
- [App Service](./app-service.md) for managed web apps
- [Functions](./functions.md) for event-driven functions
- [Virtual Network](../network/virtual-network.md) for networking
- [System design: vertical scaling](../../../system-design/scalability/vertical.md)
- [System design: horizontal scaling](../../../system-design/scalability/horizontal.md)
