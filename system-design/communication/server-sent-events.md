# Server-Sent Events

Server-Sent Events (SSE) is a standard allowing servers to push data to clients over HTTP using a one-way, persistent connection.

### How It Works

1. Client opens a connection via `EventSource` API (or plain HTTP).
2. Server keeps the connection open and sends events as `text/event-stream`.
3. Each event is a UTF-8 text block with optional `event`, `id`, and `data` fields.
4. Client receives events in real time without polling.
5. Connection auto-reconnects with `Last-Event-ID` header on disconnect.

### SSE vs WebSockets vs Polling

| Feature | SSE | WebSockets | Long Polling |
| :-- | :-- | :-- | :-- |
| Direction | Server → Client | Bidirectional | Client → Server → Client |
| Protocol | HTTP/1.1+ / HTTP/2 | WS:// or WSS:// | HTTP |
| Auto-reconnect | Built-in | Manual | Manual |
| Binary data | Text only | Text + Binary | Text only |
| Scalability | Stateless, HTTP-friendly | Stateful, harder to scale | Stateless, high overhead |
| Browser support | All modern browsers | All modern browsers | All browsers |

### Use Cases

- Live feeds: news, social media timelines, stock tickers.
- Notifications: email alerts, CI/CD build status, monitoring dashboards.
- Dashboards: real-time metrics, log streaming, system health.
- LLM streaming: token-by-token response delivery from AI APIs.

### When to Use

- Data flows primarily server → client (unidirectional).
- You need auto-reconnection and event IDs for resilience.
- You want to leverage existing HTTP infrastructure (proxies, CDNs, load balancers).
- You are behind strict firewalls that block WebSocket upgrades.

### When Not to Use

- You need bidirectional communication (chat, gaming) — use WebSockets.
- You need binary data transfer — use WebSockets.
- You need extremely low latency at scale — consider WebSockets or gRPC streaming.

### Trade-offs

- Pros: simple, works over HTTP, auto-reconnect, proxy/CDN friendly, no special server config.
- Cons: text only, limited to 6 concurrent connections per domain (HTTP/1.1), no client→server push.

### Related Topics

- [API Protocols](./api-protocols.md) for protocol selection
- [Chat system](../design-problems/chat-system.md) for real-time messaging
- [CDN and Edge](./cdn-and-edge.md) for content delivery
