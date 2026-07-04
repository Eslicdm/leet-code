# AWS IAM

IAM (Identity and Access Management) controls who is authenticated and authorized to use AWS resources. It is the foundation of every AWS security design.

### Key Features

| Feature | Description |
| :-- | :-- |
| Users, groups, and roles | Identities for people, applications, and AWS services. |
| Policies | JSON documents that allow or deny actions on resources. |
| Least privilege | Fine-grained permissions on specific actions and resources. |
| Cross-account access | Roles assumed by users or services in other accounts. |
| Federation | Identity providers like SAML, OIDC, or AWS IAM Identity Center (SSO). |
| Permissions boundaries | Maximum permissions a role or user can have. |
| Service Control Policies (SCPs) | Organization-wide guardrails applied to accounts. |
| Access Analyzer | Static and dynamic analysis of resource access. |

### When to Use

- Any AWS workload needs IAM; it is mandatory, not optional.
- You need to grant different permissions to humans, applications, and AWS services.
- You need to enforce least privilege across accounts and regions.

### When Not to Use

- There is no scenario where IAM is not used in AWS. The question is how to organize it (single account, multi-account with AWS Organizations, or hybrid).

### Pricing Model

- IAM is free.
- IAM Identity Center (SSO) is free.
- Access Analyzer has a small free tier and per-evaluated-resource pricing beyond that.

### Trade-offs

- Pros: fine-grained, integrates with every AWS service, supports federation and cross-account access.
- Cons: policy sprawl is common; complex policies can be hard to reason about; over-privileged roles are a frequent security finding.

### Practical Tips

- Prefer roles and temporary credentials over long-lived access keys.
- Use AWS Organizations with SCPs to enforce guardrails across accounts.
- Use IAM Access Analyzer to find unused and over-privileged permissions.
- Use customer-managed policies for shared permissions, not inline policies.
- Rotate access keys and use IAM Roles Anywhere for non-AWS workloads.

### Related

- [Secrets Manager](./secrets-manager.md) for secret storage
- [Lambda](../compute/lambda.md) for using IAM execution roles
- [ECS](../compute/ecs.md) and [EKS](../compute/eks.md) for task and pod-level IAM
- [System design: auth](../../../system-design/security/auth.md)
