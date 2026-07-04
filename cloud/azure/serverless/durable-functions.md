# Durable Functions

Durable Functions is an extension of Azure Functions that lets you write stateful workflows in code. It handles checkpointing, replay, and coordination automatically.

### Key Features

| Feature | Description |
| :-- | :-- |
| Orchestration functions | Define workflows in C# or JavaScript. |
| Activity functions | Individual steps in the workflow. |
| Entity functions | Stateful singleton entities. |
| Fan-out/fan-in | Parallel execution and aggregation. |
| Sub-orchestrations | Compose complex workflows from smaller ones. |
| Durable timers | Wait for external events or timeouts. |
| Monitoring | Monitor long-running processes. |

### When to Use

- You need reliable, stateful workflows without managing infrastructure.
- You want to orchestrate multiple functions or services in code.
- You need fan-out/fan-in, chaining, or human interaction patterns.
- You want durable execution with automatic checkpointing.

### When Not to Use

- You need a visual workflow designer (use [Logic Apps](./logic-apps.md)).
- You need a simple, stateless function (use regular [Functions](../compute/functions.md)).
- You need real-time stream processing (use Stream Analytics).

### Pricing Model

- Same as Azure Functions: pay per execution and per GB-second.
- Durable orchestration adds history storage costs.

### Trade-offs

- Pros: stateful workflows in code, automatic checkpointing, sub-second replay, Azure Functions ecosystem.
- Cons: debugging stateful functions can be complex, replay semantics have a learning curve, vendor lock-in.

### Practical Tips

- Use orchestration functions for workflow logic and activity functions for side effects.
- Use fan-out/fan-in for parallel processing.
- Use durable timers for timeouts and scheduled actions.
- Use entities for singleton state management.

### Related

- [Functions](../compute/functions.md) for serverless compute
- [Logic Apps](./logic-apps.md) for visual workflows
- [Event Grid](../messaging/event-grid.md) for event triggers
