# Logic Apps

Logic Apps is a serverless workflow service for automating and orchestrating tasks across cloud and on-premises services. It provides a visual designer and hundreds of connectors.

### Key Features

| Feature | Description |
| :-- | :-- |
| Visual designer | Drag-and-drop workflow construction. |
| 400+ connectors | Connect to Azure, Microsoft 365, Salesforce, SAP, and more. |
| Built-in actions | Conditions, loops, parallel branches, and error handling. |
| Managed connectors | Pre-built connectors with authentication handled. |
| Integration accounts | B2B messaging (EDI, AS2) and XML operations. |
| Enterprise integration | Map transforms, schemas, and agreements. |

### When to Use

- You need to automate workflows across SaaS and enterprise systems.
- You want a visual, no-code/low-code workflow builder.
- You need B2B messaging with EDI or AS2.
- You want to connect to Microsoft 365, Dynamics, or other Microsoft services.

### When Not to Use

- You need complex orchestration with branching and error handling in code (use [Durable Functions](./durable-functions.md)).
- You need real-time stream processing (use Stream Analytics).
- You want full control over the runtime (use [Functions](../compute/functions.md)).

### Pricing Model

- Consumption plan: pay per action execution.
- Standard plan: pay per vCPU and memory.
- Enterprise Integration Plan: additional B2B features.

### Trade-offs

- Pros: visual designer, 400+ connectors, B2B support, Microsoft integration.
- Cons: limited customization in visual mode, debugging can be slow, vendor lock-in.

### Practical Tips

- Start with the consumption plan for low-volume workflows.
- Use managed connectors to avoid handling authentication.
- Use integration accounts for B2B messaging.
- Use recurrence triggers for scheduled workflows.

### Related

- [Functions](../compute/functions.md) for serverless compute
- [Durable Functions](./durable-functions.md) for code-based orchestration
- [Event Grid](../messaging/event-grid.md) for event-driven triggers
