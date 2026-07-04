# Cloud Run

Cloud Run is a serverless platform for running stateless containers. It scales automatically from zero to thousands of instances and bills only for the compute used during requests.

### Key Features

| Feature | Description |
| :-- | :-- |
| Source-based or container-based | Deploy from source code or any container image. |
| Scale to zero | No cost when no traffic is served. |
| Automatic HTTPS | Each service gets a stable HTTPS endpoint. |
| Custom domains | Map your own domain with managed certificates. |
| Request-based billing | Pay per request and per CPU/memory time. |
| Concurrency tuning | Set max concurrent requests per instance. |
| VPC connectivity | Egress to a VPC for private resources. |
| Cloud SQL and Memorystore connectors | Authenticated connections without extra config. |
| Jobs | Run one-off or scheduled container jobs. |

### When to Use

- You have a stateless HTTP service or API packaged as a container.
- Traffic is spiky or unpredictable and you want scale-to-zero.
- You want to focus on code, not infrastructure.
- You want built-in HTTPS without managing certificates or load balancers.

### When Not to Use

- The workload is long-running or stateful.
- You need full Kubernetes APIs (use [GKE](./gke.md)).
- The workload is a single function triggered by an event and you want pure functions (use [Cloud Functions](./cloud-functions.md)).
- You need GPUs or specialized hardware (use [Compute Engine](./compute-engine.md) or GKE with GPU node pools).

### Pricing Model

- Pay per vCPU-second, GB-second, and per million requests.
- Free tier includes 2 million requests per month.
- No charge when idle.

### Trade-offs

- Pros: simple, serverless, fast scale-out, pay per use, built-in HTTPS.
- Cons: stateless only, request time limits, cold start for scale-from-zero.

### Practical Tips

- Keep container images small to reduce cold start time.
- Set concurrency to balance throughput and per-instance memory.
- Use minimum instances to keep some warm capacity for low-latency APIs.
- Use Cloud SQL or Memorystore connectors to avoid manual connection management.

### Related

- [Cloud Functions](./cloud-functions.md) for event-driven functions
- [GKE](./gke.md) when you need Kubernetes
- [Cloud SQL](../database/cloud-sql.md) for managed databases
- [Pub/Sub](../messaging/pub-sub.md) for async event sources
- [System design: serverless and event-driven](../../../system-design/architecture/event-driven.md)
