# Amazon API Gateway

API Gateway is a managed service for creating, publishing, and securing HTTP, REST, and WebSocket APIs. It sits in front of your backend and handles routing, authentication, throttling, and monitoring.

### Key Features

| Feature | Description |
| :-- | :-- |
| REST APIs | Full-featured API Gateway with request validation, API keys, and usage plans. |
| HTTP APIs | Lightweight, low-latency alternative for REST APIs. |
| WebSocket APIs | Real-time bidirectional APIs. |
| Authorization | IAM, Cognito user pools, Lambda authorizers. |
| Throttling | Per-method and per-client rate limits. |
| Usage plans and API keys | Monetization and partner access controls. |
| Custom domains | Host the API on your own domain with a managed certificate. |

### When to Use

- You need a managed public entry point for REST, HTTP, or WebSocket APIs.
- You want built-in authentication, throttling, and monitoring.
- You are integrating with Lambda or other AWS services.

### When Not to Use

- The API is purely internal to a VPC and you prefer a VPC-native gateway or service mesh.
- You need a full API management platform with developer portals and monetization (consider third-party tools).

### Pricing Model

- Pay per million API calls.
- HTTP APIs are significantly cheaper than REST APIs.
- Data transfer out is billed separately.

### Trade-offs

- Pros: managed, integrated with IAM and Lambda, supports throttling and API keys.
- Cons: REST API has a higher latency overhead than HTTP API; complex request/response mappings can be hard to debug.

### Practical Tips

- Prefer HTTP APIs for new public REST APIs when you do not need REST features.
- Use Lambda authorizers for custom auth or Cognito for managed user pools.
- Use usage plans and API keys to monetize partner access.
- Combine with CloudFront for global low-latency access.

### Related

- [Lambda](../compute/lambda.md) as a backend
- [CloudFront](./cloudfront.md) for global edge caching
- [VPC](./vpc.md) for private integrations
- [System design: proxies and API gateway](../../../system-design/communication/proxies-api-gateway.md)
- [System design: API protocols](../../../system-design/communication/api-protocols.md)
