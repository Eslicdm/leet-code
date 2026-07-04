# AWS AppSync

AppSync is a managed GraphQL and real-time subscription service. It simplifies building applications that need to query and update data from multiple sources through a single GraphQL endpoint.

### Key Features

| Feature | Description |
| :-- | :-- |
| GraphQL API | Schema-first, managed GraphQL endpoint. |
| Real-time subscriptions | WebSocket-based subscriptions for live updates. |
| Multiple data sources | DynamoDB, RDS, Elasticsearch, Lambda, and HTTP resolvers. |
| Resolver pipeline | Request and response mapping templates or VTL/JS resolvers. |
| Offline sync | Client-side offline data with conflict detection and resolution. |
| Fine-grained auth | API key, IAM, Amazon Cognito, and OpenID Connect. |

### When to Use

- Your app needs a single GraphQL endpoint that aggregates data from multiple backends.
- You need real-time subscriptions for chat, notifications, or live dashboards.
- You have mobile clients that need offline sync with conflict resolution.
- You want a managed alternative to running your own GraphQL server.

### When Not to Use

- You need a REST API (use [API Gateway](../network/api-gateway.md)).
- Your data source is simple and a direct DynamoDB or RDS connection is sufficient.
- You need fine-grained control over the GraphQL runtime (self-host with Lambda or containers).

### Pricing Model

- Pay per query, mutation, and subscription message.
- Real-time subscriptions: pay per million subscription messages.
- Free tier includes 25 million query and mutation requests per month.

### Trade-offs

- Pros: managed GraphQL, real-time subscriptions, offline sync, multiple data sources.
- Cons: VTL mapping templates have a learning curve, vendor lock-in, cost at high query volume.

### Practical Tips

- Use schema-first design and iterate with the AppSync console.
- Use pipeline resolvers to compose logic across multiple data sources.
- Use direct Lambda resolvers for complex business logic.
- Use conflict detection for multi-device offline sync scenarios.

### Related

- [API Gateway](../network/api-gateway.md) for REST APIs
- [Lambda](../compute/lambda.md) for resolver logic
- [DynamoDB](../database/dynamodb.md) as a primary data source
- [Cognito](https://aws.amazon.com/cognito/) for user authentication
