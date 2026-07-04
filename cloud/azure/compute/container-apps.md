# Container Apps

Azure Container Apps is a serverless platform for running microservices and containerized applications on a Kubernetes-based runtime without managing Kubernetes.

### Key Features

| Feature | Description |
| :-- | :-- |
| Scale to zero | No cost when no traffic is served. |
| HTTP and event-driven | Built-in HTTP ingress and event-driven KEDA scaling. |
| Microservices features | Service discovery, traffic splitting, and revisions. |
| Multiple revision modes | Single, multiple, or labels. |
| Dapr integration | Built-in Dapr APIs for state, pub/sub, and service invocation. |
| Custom domains and certificates | Map your own domain with managed certificates. |
| Jobs | Run one-off or scheduled container jobs. |
| Connected environments | Share networking and Dapr across apps. |

### When to Use

- You have a stateless HTTP service or microservice packaged as a container.
- Traffic is spiky or unpredictable and you want scale-to-zero.
- You want to focus on code, not infrastructure.
- You want built-in Dapr support for state, pub/sub, and service invocation.

### When Not to Use

- You need full Kubernetes APIs and custom operators (use [AKS](./aks.md)).
- The workload is a single function triggered by an event and you want pure functions (use [Functions](./functions.md)).
- The workload is a long-running VM (use [Virtual Machines](./virtual-machines.md)).

### Pricing Model

- Pay per vCPU-second and GB-second.
- Free tier includes 180,000 vCPU-seconds and 360,000 GB-seconds per month.
- Pay per million HTTP requests.
- No charge when idle (scale to zero).

### Trade-offs

- Pros: simple, serverless, scale-to-zero, KEDA-driven event scaling, built-in Dapr.
- Cons: stateless, request time limits, no direct Kubernetes API access, cold start for scale-from-zero.

### Practical Tips

- Use KEDA scalers to scale on queues, streams, and custom metrics.
- Use revisions and traffic splitting for safe rollouts.
- Use Dapr for state, pub/sub, and service invocation to avoid building common primitives.
- Use Container Apps jobs for batch and scheduled workloads.

### Related

- [AKS](./aks.md) for full Kubernetes
- [App Service](./app-service.md) for managed web apps
- [Functions](./functions.md) for event-driven functions
- [Service Bus](../messaging/service-bus.md) and [Event Grid](../messaging/event-grid.md) for async triggers
- [System design: serverless and event-driven](../../../system-design/architecture/event-driven.md)
