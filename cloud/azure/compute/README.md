# Azure Compute

Compute services cover virtual machines, managed Kubernetes, serverless containers, managed web apps, and event-driven functions.

### Decision Path

| Need | Start with |
| :-- | :-- |
| Run a virtual machine. | [Virtual Machines](./virtual-machines.md) |
| Run managed Kubernetes. | [AKS](./aks.md) |
| Run a serverless container or microservice. | [Container Apps](./container-apps.md) |
| Run a managed web app or API. | [App Service](./app-service.md) |
| Run code in response to events. | [Functions](./functions.md) |

### When to Use Azure Compute

- You are deeply invested in the Microsoft ecosystem (Windows, .NET, Entra ID).
- You need managed Kubernetes with strong hybrid support.
- You want a managed PaaS for web apps, APIs, or microservices.
- You can tolerate Azure-specific APIs, Entra ID, and pricing.

### Related

- [Azure storage services](../storage/)
- [Azure networking services](../network/)
- [System design: horizontal scaling](../../../system-design/scalability/horizontal.md)
