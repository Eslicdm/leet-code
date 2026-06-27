# API Protocols

API protocol decisions affect latency, payload size, browser compatibility, caching, and real-time behavior.

### Decision Table

| Protocol | Best for | Trade-off |
| :-- | :-- | :-- |
| REST | Standard stateless APIs and HTTP caching. | Can over-fetch or under-fetch data. |
| GraphQL | Client-defined queries and mobile bandwidth efficiency. | Harder server implementation and caching. |
| gRPC | Low-latency service-to-service calls. | Browser support and debugging are harder. |
| WebSockets | Bidirectional real-time communication. | Stateful connections are harder to scale. |

### When to Use

- Use `REST` for public APIs and simple resource models.
- Use `GraphQL` when clients need flexible nested data.
- Use `gRPC` for internal high-performance RPC.
- Use `WebSockets` for chat, gaming, and real-time dashboards.

### Related Topics

- [Load balancing](./load-balancing.md)
- [Chat system](../design-problems/chat-system.md)