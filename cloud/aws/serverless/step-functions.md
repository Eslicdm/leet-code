# AWS Step Functions

Step Functions orchestrates workflows by chaining AWS services and custom code into state machines. It supports standard (long-running) and express (high-volume) workflows.

### Key Features

| Feature | Description |
| :-- | :-- |
| Standard workflows | Exactly-once execution, up to one year, visual workflow in console. |
| Express workflows | At-least-once, up to five minutes, high throughput (100K/sec). |
| Task states | Call Lambda, ECS, DynamoDB, SQS, SNS, and many other services. |
| Parallel and map | Fan out or iterate over collections. |
| Choice and wait | branching logic and time delays. |
| Error handling | Catch, retry, and fallback built into the workflow language. |
| Audit and logging | Execution history in CloudWatch and CloudTrail. |

### When to Use

- You need to orchestrate multiple AWS services into a reliable workflow.
- You want visual workflow monitoring and step-by-step debugging.
- You need built-in error handling, retries, and fallback logic without custom code.
- You are replacing a third-party orchestration tool or reducing glue code.

### When Not to Use

- The workflow is a simple linear sequence with one Lambda (call Lambda directly).
- You need sub-second latency between steps (express workflows add overhead).
- The orchestration logic is complex and benefits from a general-purpose language (use [Athena](../analytics/athena.md) pipelines or custom code).

### Pricing Model

- Standard workflows: pay per state transition.
- Express workflows: pay per request and duration.
- Free tier: 4,000 state transitions per month.

### Trade-offs

- Pros: visual workflows, managed orchestration, built-in error handling, deep AWS integration.
- Cons: state machine language has a learning curve, express workflows are at-least-once, long-running standards workflows can be expensive.

### Practical Tips

- Use express workflows for high-volume, short-duration tasks (IoT, streaming).
- Use standard workflows for long-running, auditable business processes.
- Use map states to fan out over large collections.
- Use IAM execution roles for each task to follow least-privilege.

### Related

- [Lambda](../compute/lambda.md) for compute tasks
- [SQS](../messaging/sqs.md) and [SNS](../messaging/sns.md) for decoupled steps
- [EventBridge](../messaging/eventbridge.md) for event triggers
