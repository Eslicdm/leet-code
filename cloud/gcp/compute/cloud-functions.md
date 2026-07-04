# Cloud Functions

Cloud Functions is the GCP equivalent of AWS Lambda: a serverless, event-driven functions platform. You write single-purpose functions that respond to cloud events without managing servers.

### Key Features

| Feature | Description |
| :-- | :-- |
| Event-driven triggers | Pub/Sub, Cloud Storage, Firestore, HTTP, Eventarc, and more. |
| Two product lines | Cloud Functions (1st gen) and Cloud Functions (2nd gen) on Cloud Run. |
| Per-invocation billing | Pay only for compute time during invocations. |
| Automatic scaling | Scales from zero to thousands of concurrent invocations. |
| IAM integration | Per-function service accounts and Cloud Run IAM. |
| VPC connector | Egress to a VPC for private resources. |

### When to Use

- The workload is event-driven, short-lived, and stateless.
- You want pay-per-execution pricing.
- You want to glue GCP services together without managing infrastructure.
- You want HTTP endpoints without managing certificates.

### When Not to Use

- The workload is long-running or requires a custom container (use [Cloud Run](./cloud-run.md)).
- You need Kubernetes APIs (use [GKE](./gke.md)).
- The workload is a long-running VM (use [Compute Engine](./compute-engine.md)).
- You need full control over the runtime (use a container platform).

### Pricing Model

- Pay per invocation, GB-second, and CPU-second (2nd gen).
- Free tier includes 2 million invocations per month.
- Pay for outbound networking and any connected services.

### Trade-offs

- Pros: simple, serverless, pay per execution, native GCP integration.
- Cons: cold start latency, execution time and payload limits, vendor lock-in.

### Practical Tips

- Use 2nd gen Cloud Functions for new workloads: longer timeouts, concurrency, and richer triggers.
- Use Pub/Sub or Eventarc for asynchronous triggers.
- Set the function region close to your data.
- Use minimum instances to reduce cold start for latency-sensitive workloads.

### Related

- [Cloud Run](./cloud-run.md) for container-based serverless
- [Pub/Sub](../messaging/pub-sub.md) for async triggers
- [Eventarc](../messaging/pub-sub.md) for event-driven triggers
- [GKE](./gke.md) for Kubernetes workloads
- [System design: event-driven architecture](../../../system-design/architecture/event-driven.md)
