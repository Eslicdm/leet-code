# Azure Functions

Azure Functions is the Azure serverless, event-driven functions platform. You write single-purpose functions that respond to events without managing servers, and pay only for the compute time consumed.

### Key Features

| Feature | Description |
| :-- | :-- |
| Hosting plans | Consumption, Premium, and Dedicated (App Service) plans. |
| Triggers | HTTP, Timer, Queue, Blob, Event Grid, Service Bus, Cosmos DB, and more. |
| Bindings | Declarative connections to inputs and outputs. |
| Durable Functions | Stateful workflows for fan-out, fan-in, and human interaction. |
| Identity-based connections | Use managed identity for connections to other Azure services. |
| VNet integration | Connect to private resources through a Virtual Network. |
| Languages | C#, JavaScript, TypeScript, Python, Java, PowerShell, and custom handlers. |

### When to Use

- The workload is event-driven, short-lived, and stateless.
- You want pay-per-execution pricing.
- You want to glue Azure services together without managing infrastructure.
- You need Durable Functions for stateful workflows.

### When Not to Use

- The workload is long-running or stateful (use [Container Apps](./container-apps.md) or [AKS](./aks.md)).
- You need full control over the OS or runtime (use [Virtual Machines](./virtual-machines.md)).
- You need Kubernetes APIs (use [AKS](./aks.md)).
- You need a long-running web app (use [App Service](./app-service.md)).

### Pricing Model

- Consumption plan: pay per execution and per GB-second.
- Premium plan: pay per vCPU-second and GB-second with always-warm instances.
- Dedicated plan: pay per App Service Plan instance.
- Free grants on the Consumption plan.

### Trade-offs

- Pros: simple, serverless, pay per execution, native Azure integration, Durable Functions.
- Cons: cold start latency, execution time and payload limits, vendor lock-in.

### Practical Tips

- Use the Premium plan for latency-sensitive or long-running functions.
- Use Durable Functions for stateful workflows.
- Use managed identity for connections to Azure services.
- Monitor with Application Insights.

### Related

- [Container Apps](./container-apps.md) for container-based serverless
- [App Service](./app-service.md) for managed web apps
- [AKS](./aks.md) for Kubernetes workloads
- [Service Bus](../messaging/service-bus.md) and [Event Grid](../messaging/event-grid.md) for async triggers
- [System design: event-driven architecture](../../../system-design/architecture/event-driven.md)
