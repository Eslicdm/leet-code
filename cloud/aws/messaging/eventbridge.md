# Amazon EventBridge

EventBridge is a serverless event bus that connects applications using events. It integrates with AWS services, SaaS applications, and custom applications, and supports content-based filtering and routing.

### Key Features

| Feature | Description |
| :-- | :-- |
| Event buses | Default bus, custom buses, and partner event buses from SaaS providers. |
| Event patterns | Content-based rules that filter and route events. |
| Targets | Lambda, SQS, SNS, Step Functions, Kinesis, API Gateway, and more. |
| Schema registry | Discover and version event schemas. |
| Archive and replay | Archive events for replay during testing or recovery. |
| Cross-region and cross-account | Route events across regions and accounts. |
| EventBridge Pipes | Point-to-point integrations between sources and targets with optional enrichment and filtering. |

### When to Use

- You need to route events between AWS services, SaaS providers, and your own applications.
- You need content-based filtering and transformation.
- You need schema discovery and version management.

### When Not to Use

- You need a simple queue with one consumer (use [SQS](./sqs.md)).
- You need to replay many days of historical events (consider [Kinesis](https://aws.amazon.com/kinesis/) or Kafka).
- You need to fan out to many subscribers without routing logic (consider [SNS](./sns.md)).

### Pricing Model

- Pay per million events put on the bus.
- Pay per million rule matches.
- Some AWS service events are free.

### Trade-offs

- Pros: deep AWS and SaaS integration, schema discovery, content-based filtering, archive and replay.
- Cons: more concepts than SNS or SQS; rules can become complex.

### Practical Tips

- Use Schema Registry to version and validate event schemas.
- Use Archive and Replay for safe rollouts and disaster recovery.
- Use EventBridge Pipes for point-to-point integrations without writing a Lambda.
- Use cross-account event buses to decouple producers and consumers across accounts.

### Related

- [SQS](./sqs.md) and [SNS](./sns.md) for simpler messaging patterns
- [Lambda](../compute/lambda.md) for event handlers
- [API Gateway](../network/api-gateway.md) for webhook ingestion
- [System design: event-driven architecture](../../../system-design/architecture/event-driven.md)
- [System design: dead letter queue](../../../system-design/communication/dead-letter-queue.md)
