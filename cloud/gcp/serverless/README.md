# GCP Serverless

Serverless services cover event-driven functions, serverless containers, and workflow orchestration.

### Decision Path

| Need | Start with |
| :-- | :-- |
| Orchestrate multi-step serverless workflows. | [Workflows](./workflows.md) |

### When to Use GCP Serverless

- You need to coordinate multiple APIs or Cloud Functions into a durable workflow.
- You want retries, error handling, and observability for each step.
- You want pay-per-execution pricing with no servers to manage.

### Related

- [GCP compute services](../compute/)
- [GCP messaging services](../messaging/)
- [System design: event-driven architecture](../../../system-design/architecture/event-driven.md)
