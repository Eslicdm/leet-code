# AWS Compute

Compute services cover virtual machines, managed Kubernetes, serverless containers, and event-driven functions.

### Decision Path

| Need | Start with |
| :-- | :-- |
| Run a virtual machine. | [EC2](./ec2.md) |
| Run Docker containers on managed instances. | [ECS](./ecs.md) |
| Run managed Kubernetes. | [EKS](./eks.md) |
| Run code in response to events without managing servers. | [Lambda](./lambda.md) |

### When to Use AWS Compute

- You need full control over an operating system and runtime.
- You are migrating an existing application with predictable capacity.
- You want managed containers, managed Kubernetes, or pure serverless.
- You can tolerate AWS-specific APIs, IAM, and pricing.

### Related

- [AWS storage services](../storage/)
- [AWS networking services](../network/)
- [System design: horizontal scaling](../../../system-design/scalability/horizontal.md)
