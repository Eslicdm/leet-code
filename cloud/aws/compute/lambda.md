# AWS Lambda

Lambda runs your code in response to events without provisioning or managing servers. You pay only for the compute time consumed.

### Key Features

| Feature | Description |
| :-- | :-- |
| Event-driven | Triggered by API Gateway, S3, SQS, EventBridge, DynamoDB Streams, and more. |
| Per-millisecond billing | Charged by GB-second of memory and invocations. |
| Auto scaling | Scales from zero to thousands of concurrent executions. |
| Integrated IAM | Execution role controls access to AWS APIs. |
| Layers and container images | Reusable code through layers or as container images up to 10 GB. |
| SnapStart | Faster cold starts for Java and Python functions. |

### When to Use

- The workload is event-driven, short-lived, and can start and stop quickly.
- Traffic is spiky or unpredictable and you want pay-per-execution.
- You want to glue AWS services together without managing infrastructure.
- You want HTTP APIs with API Gateway or ALB.

### When Not to Use

- The workload is long-running (over 15 minutes) or stateful.
- You need a long-lived process, custom OS, or specific runtime.
- The cold start latency is unacceptable for the use case.
- You need full control over the runtime environment (use [EC2](./ec2.md) or containers on [ECS](./ecs.md) or [EKS](./eks.md)).

### Pricing Model

- Pay per request and per GB-second of compute.
- Free tier includes 1 million requests and 400,000 GB-seconds per month.
- Provisioned Concurrency charges apply for keeping functions warm.

### Trade-offs

- Pros: zero administration, pay-per-execution, native AWS integration, fast scale-out.
- Cons: cold start latency, execution time and payload limits, harder local debugging, vendor lock-in.

### Practical Tips

- Right-size memory: more memory means more CPU and sometimes lower cost.
- Use Provisioned Concurrency for latency-sensitive APIs.
- Use Lambda Extensions or layers for shared dependencies.
- Monitor with CloudWatch and AWS X-Ray.

### Related

- [API Gateway](../network/api-gateway.md) for HTTP triggers
- [SQS](../messaging/sqs.md) and [EventBridge](../messaging/eventbridge.md) for async triggers
- [Step Functions](../serverless/step-functions.md) for orchestration
- [System design: serverless and event-driven](../../../system-design/architecture/event-driven.md)
