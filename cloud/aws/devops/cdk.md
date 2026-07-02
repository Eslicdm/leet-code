# AWS CDK

CDK (Cloud Development Kit) lets you define AWS infrastructure using familiar programming languages such as TypeScript, Python, Java, and Go. CDK synthesizes your code into CloudFormation templates and deploys them.

### Key Features

| Feature | Description |
| :-- | :-- |
| Familiar languages | TypeScript, Python, Java, Go, C#, and .NET. |
| Construct library | Reusable, opinionated building blocks (`L2` and `L3` constructs). |
| CDK Pipelines | Self-mutating pipelines for CDK apps. |
| Context and lookups | Resolve values like latest AMI or VPC ID at synth time. |
| Assets | Bundle Lambda code, Docker images, and other files. |
| Day-2 operations | Import existing resources, snapshot, and restore via Drift Detection. |

### When to Use

- You want to use a real programming language for IaC.
- Your team already uses TypeScript, Python, or another supported language.
- You want to use constructs, helpers, and patterns that are higher level than raw CloudFormation.

### When Not to Use

- You want a simple declarative tool with no programming language required.
- You need to support an environment where CDK is not available.

### Pricing Model

- CDK itself is free.
- You pay for the AWS resources it provisions and for any underlying CloudFormation operations.

### Trade-offs

- Pros: familiar language, strong type checking, large construct library, integrates with normal dev workflows.
- Cons: extra synthesis step, more dependencies than raw CloudFormation, learning curve for the construct library.

### Practical Tips

- Use L2 constructs when you want AWS best practices baked in.
- Use L1 constructs when you need full control over the synthesized CloudFormation.
- Use CDK Pipelines for self-mutating CI/CD.
- Pin CDK and construct library versions in `cdk.json` for reproducible builds.

### Related

- [CloudFormation](./cloudformation.md) for the underlying engine
- [Lambda](../compute/lambda.md) for Lambda assets
- [ECS](../compute/ecs.md) and [EKS](../compute/eks.md) for container workloads
- [System design: resilience patterns](../../../system-design/reliability/resilience-patterns.md)
