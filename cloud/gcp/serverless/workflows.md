# Workflows

Workflows is a managed orchestration service for executing serverless workflows. It connects Google Cloud services, HTTP APIs, and Cloud Functions into durable, observable workflows.

### Key Features

| Feature | Description |
| :-- | :-- |
| YAML or JSON workflows | Declarative workflow definitions with steps and conditionals. |
| Connectors | First-class connectors for Cloud Pub/Sub, Cloud Storage, BigQuery, Firestore, and more. |
| HTTP calls | Call any HTTP endpoint with retries and exponential backoff. |
| Durable execution | Workflow state is persisted; workflows can pause and resume. |
| Error handling | Built-in retry, exponential backoff, and custom error handlers. |
| Parallel branches | Run multiple steps in parallel and join results. |
| Observability | Cloud Logging, Cloud Monitoring, and execution history. |

### When to Use

- You need to coordinate multiple services, APIs, or functions into a multi-step workflow.
- You want durable execution with retries and error handling.
- You want to model business processes as a series of steps without managing infrastructure.

### When Not to Use

- You need low-latency function orchestration (use direct function calls or [Eventarc](https://cloud.google.com/eventarc)).
- You need a complex stateful application (consider a stateful service or a database).
- You need a BPMN or workflow engine with human tasks (consider a dedicated BPMS).

### Pricing Model

- Pay per workflow step executed.
- Pay for external API calls and connector usage.

### Trade-offs

- Pros: managed, durable, observable, integrates with most GCP services.
- Cons: step execution has overhead; complex workflows can be hard to test locally.

### Practical Tips

- Use retries with exponential backoff for transient failures.
- Use parallel branches to fan out independent work.
- Use connectors to avoid boilerplate client code.
- Monitor executions with Cloud Logging and Cloud Monitoring.

### Related

- [Cloud Functions](../compute/cloud-functions.md) and [Cloud Run](../compute/cloud-run.md) as workflow steps
- [Pub/Sub](../messaging/pub-sub.md) for event-driven triggers
- [BigQuery](../database/bigquery.md) for workflow results
- [System design: saga and distributed transactions](../../../system-design/architecture/saga-and-distributed-transactions.md)
