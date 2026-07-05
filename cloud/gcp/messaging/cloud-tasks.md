# Cloud Tasks

Cloud Tasks is a managed task queue for deferring work to be done asynchronously. It dispatches tasks at a controlled rate to target services.

### Key Features

| Feature | Description |
| :-- | :-- |
| HTTP targets | Dispatch tasks as HTTP requests to any service. |
| Rate limiting | Control task dispatch rate per queue. |
| Retries | Automatic retry with exponential backoff. |
| scheduling | Schedule tasks for future execution. |
| Pull queues | Workers poll for tasks (App Engine). |
| Task names | Idempotent task deduplication. |

### When to Use

- You need to defer work that can tolerate delays (emails, reports, image processing).
- You want to control the rate of requests to a downstream service.
- You need to schedule tasks for future execution.
- You want to decouple task submission from task execution.

### When Not to Use

- You need real-time event routing (use [Eventarc](./eventarc.md)).
- You need cron-based scheduling (use [Cloud Scheduler](./cloud-scheduler.md)).
- You need pub/sub messaging (use [Pub/Sub](./pub-sub.md)).

### Pricing Model

- Pay per task dispatched.
- Free tier includes 1 million tasks per month.

### Trade-offs

- Pros: rate limiting, retries, simple HTTP targets, free tier.
- Cons: HTTP-only targets, not suited for real-time processing, limited task payload size.

### Practical Tips

- Use rate limiting to protect downstream services from traffic spikes.
- Use task names for idempotent retries.
- Use scheduling for delayed execution.
- Use Cloud Tasks with Cloud Run or App Engine targets.

### Related

- [Eventarc](./eventarc.md) for event routing
- [Cloud Scheduler](./cloud-scheduler.md) for cron scheduling
- [Pub/Sub](./pub-sub.md) for messaging
- [Cloud Run](../compute/cloud-run.md) as a target
- [System design: message queues](../../../system-design/communication/messaging.md)
