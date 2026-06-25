# Proxies and API Gateway

Proxies and API gateways manage traffic between clients, services, and networks.

### Decision Table

| Pattern | Purpose |
| :-- | :-- |
| Forward proxy | Acts on behalf of clients reaching external services. |
| Reverse proxy | Acts on behalf of servers receiving client traffic. |
| API gateway | Central entry point for routing, auth, rate limits, and protocol translation. |

### When to Use

- Multiple backend services need one public entry point.
- Cross-cutting concerns such as authentication, rate limiting, TLS, or routing should be centralized.
- Clients should not know internal service topology.

### Trade-offs

- Simplifies clients and centralizes policy.
- Can become a bottleneck or single failure point if not scaled.
- Too much business logic in the gateway creates coupling.

### Related Topics

- [Load balancing](./load-balancing.md)
- [Auth](../security/auth.md)