# App Service

Azure App Service is a managed platform for hosting web apps, REST APIs, and mobile backends. It supports .NET, Java, Node.js, Python, PHP, and Ruby, and offers built-in DevOps, scaling, and security features.

### Key Features

| Feature | Description |
| :-- | :-- |
| Hosting plans | Shared, Basic, Standard, Premium, and Isolated tiers. |
| Built-in autoscaling | Scale up or out based on metrics or schedules. |
| Deployment slots | Staging environments with zero-downtime swap. |
| Custom domains and TLS | Map your own domain with managed certificates. |
| Authentication | Built-in auth with Entra ID, Google, Facebook, and other providers. |
| VNet integration | Inject the app into a Virtual Network for private access. |
| Hybrid Connections | Access on-premises resources without VPN. |
| App Service Environment | Isolated, dedicated environment for enterprise workloads. |

### When to Use

- You need a managed PaaS for web apps or REST APIs.
- You want built-in scaling, deployment slots, and authentication.
- You are running .NET, Java, Node.js, Python, PHP, or Ruby.
- You want to focus on code, not infrastructure.

### When Not to Use

- You need full control over the OS or runtime (use [Virtual Machines](./virtual-machines.md) or [AKS](./aks.md)).
- The workload is a pure serverless function (use [Functions](./functions.md)).
- The workload is a containerized microservice that needs scale-to-zero and KEDA (use [Container Apps](./container-apps.md)).

### Pricing Model

- Pay per App Service Plan tier.
- Higher tiers support more instances, slots, and VNet integration.
- Isolated tier is for App Service Environment deployments.

### Trade-offs

- Pros: managed, simple, built-in scaling and auth, deep Azure integration.
- Cons: less control than VMs or Kubernetes, cold start for some tiers, no scale-to-zero on most plans.

### Practical Tips

- Use deployment slots for zero-downtime rollouts.
- Use managed identity instead of connection strings for Azure resources.
- Use VNet integration for private access to databases and other services.
- Use App Service Authentication for built-in auth providers.

### Related

- [Container Apps](./container-apps.md) for containerized microservices
- [Functions](./functions.md) for event-driven functions
- [AKS](./aks.md) for Kubernetes workloads
- [Virtual Network](../network/virtual-network.md) for VNet integration
- [System design: monolith vs microservices](../../../system-design/architecture/monolith-vs-microservices.md)
