# Eventarc

Eventarc is a managed event routing service for GCP. It delivers events from GCP services and SaaS sources to Cloud Run, GKE, and Cloud Functions.

### Key Features

| Feature | Description |
| :-- | :-- |
| Event routing | Route events from GCP services to targets. |
| Audit logs | Trigger on administrative actions and data changes. |
| Pub/Sub events | Deliver events from Pub/Sub topics. |
| Cloud Storage events | Trigger on object create, delete, and archive. |
| Cloud Audit Logs | Route audit events to Cloud Run or other targets. |
| SaaS events | Route events from third-party SaaS providers. |
| Event bus | Global event bus with filtering. |

### When to Use

- You need to route GCP service events (audit logs, storage changes) to Cloud Run or GKE.
- You want event-driven architectures without writing custom event routing code.
- You need to trigger serverless functions on administrative actions.
- You want to integrate SaaS events into GCP serverless workloads.

### When Not to Use

- You need simple pub/sub messaging (use [Pub/Sub](./pub-sub.md)).
- You need scheduled or deferred task execution (use [Cloud Tasks](./cloud-tasks.md)).
- You need cron-like scheduling (use [Cloud Scheduler](./cloud-scheduler.md)).

### Pricing Model

- Pay per event delivered.
- No charge for event routing configuration.

### Trade-offs

- Pros: managed event routing, deep GCP integration, serverless targets.
- Cons: limited to GCP-supported event sources, event delivery is async, filtering is limited.

### Practical Tips

- Use Eventarc to trigger Cloud Run services on storage or audit events.
- Use Pub/Sub as an intermediary for custom event sources.
- Use event filters to route only specific events.
- Monitor with Cloud Logging.

### Related

- [Cloud Tasks](./cloud-tasks.md) for deferred and rate-limited tasks
- [Cloud Scheduler](./cloud-scheduler.md) for cron-based scheduling
- [Pub/Sub](./pub-sub.md) for messaging
- [Cloud Run](../compute/cloud-run.md) as a target
- [System design: event-driven](../../../system-design/architecture/event-driven.md)
