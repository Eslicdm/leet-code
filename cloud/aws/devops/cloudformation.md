# AWS CloudFormation

CloudFormation is the AWS-native infrastructure as code service. You describe your AWS resources in a JSON or YAML template, and CloudFormation provisions and manages them as a stack.

### Key Features

| Feature | Description |
| :-- | :-- |
| Declarative templates | JSON or YAML files describe the desired state. |
| Stacks | A collection of resources managed as a unit. |
| Change sets | Preview changes before applying them. |
| Drift detection | Detect manual changes to resources. |
| Nested stacks | Compose stacks from reusable child stacks. |
| StackSets | Deploy stacks across accounts and regions. |
| Modules | Reusable template building blocks published in a registry. |
| Macros | Custom processing of template snippets. |

### When to Use

- You want a fully managed infrastructure as code service tightly integrated with AWS.
- You need to manage infrastructure across many accounts and regions with StackSets.
- You prefer declarative JSON or YAML over a programming language.

### When Not to Use

- You want to use a familiar programming language for IaC (use [CDK](./cdk.md) or Terraform).
- You need to manage non-AWS resources in the same tool.
- You want a richer module ecosystem.

### Pricing Model

- CloudFormation itself is free.
- You pay for the AWS resources it provisions.

### Trade-offs

- Pros: AWS-native, free, drift detection, cross-account and cross-region with StackSets.
- Cons: YAML/JSON verbosity, slow CFN deploys for large stacks, weaker abstraction than CDK or Terraform.

### Practical Tips

- Use nested stacks to break large templates into manageable pieces.
- Use Change Sets for any production change.
- Enable drift detection on critical stacks.
- Use StackSets to enforce baseline configuration across accounts and regions.

### Related

- [CDK](./cdk.md) for infrastructure as code in a programming language
- [IAM](../security/iam.md) for permissions CloudFormation needs
- [System design: resilience patterns](../../../system-design/reliability/resilience-patterns.md)
