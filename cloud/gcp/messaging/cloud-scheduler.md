# Cloud Scheduler

Cloud Scheduler is a fully managed cron job service. It schedules HTTP requests, Pub/Sub messages, and App Engine commands on a recurring basis.

### Key Features

| Feature | Description |
| :-- | :-- |
| HTTP targets | Send HTTP requests to any endpoint. |
| Pub/Sub targets | Publish messages to Pub/Sub topics. |
| App Engine targets | Run App Engine commands. |
| Cron syntax | Standard cron expression scheduling. |
| Time zones | Specify time zone for schedules. |
| Retries | Automatic retry on failure. |
| Authentication | OIDC tokens for authenticated endpoints. |

### When to Use

- You need cron-based scheduling for recurring tasks (reports, backups, cleanup).
- You want to trigger HTTP endpoints on a schedule.
- You want to publish Pub/Sub messages on a schedule.
- You need time-zone-aware scheduling.

### When Not to Use

- You need deferred task execution with rate limiting (use [Cloud Tasks](./cloud-tasks.md)).
- You need event-driven routing (use [Eventarc](./eventarc.md)).
- You need simple pub/sub messaging (use [Pub/Sub](./pub-sub.md)).

### Pricing Model

- Pay per job per month.
- Pay per execution.

### Trade-offs

- Pros: fully managed, cron syntax, multiple target types, time zones.
- Cons: not suited for high-frequency scheduling, limited to cron intervals, no sub-minute scheduling.

### Practical Tips

- Use Cloud Scheduler to trigger Cloud Functions or Cloud Run on a schedule.
- Use Pub/Sub targets for event-driven architectures triggered by cron.
- Use OIDC tokens for authenticated endpoints.
- Monitor with Cloud Logging.

### Related

- [Cloud Tasks](./cloud-tasks.md) for deferred task execution
- [Eventarc](./eventarc.md) for event routing
- [Pub/Sub](./pub-sub.md) for messaging
- [Cloud Functions](../compute/cloud-functions.md) as a target
