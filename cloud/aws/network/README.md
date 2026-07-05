# AWS Network

Network services cover private networks, content delivery, DNS, and public-facing API endpoints.

### Decision Path

| Need | Start with |
| :-- | :-- |
| Build a private network with subnets, routing, and NAT. | [VPC](./vpc.md) |
| Cache and deliver content at the edge. | [CloudFront](./cloudfront.md) |
| Expose a managed HTTP API or WebSocket endpoint. | [API Gateway](./api-gateway.md) |
| Manage DNS for domains and route traffic globally. | [Route 53](./route-53.md) |
| Protect web applications from exploits and DDoS. | [WAF and Shield](./waf.md) |

### When to Use AWS Network

- You need isolation between workloads (public and private subnets).
- You need global low-latency delivery for static or dynamic content.
- You want a managed public entry point for REST or WebSocket APIs.

### Related

- [AWS compute services](../compute/)
- [AWS security services](../security/)
- [System design: load balancing](../../../system-design/communication/load-balancing.md)
