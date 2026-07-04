# AWS Secrets Manager

Secrets Manager helps you protect secrets such as database credentials, API keys, and other sensitive data. It supports automatic rotation, fine-grained access control, and audit logging.

### Key Features

| Feature | Description |
| :-- | :-- |
| Encrypted storage | Secrets are encrypted at rest with KMS keys. |
| Automatic rotation | Rotate secrets on a schedule using Lambda. |
| Fine-grained access | IAM policies and resource-based policies control who can read each secret. |
| Versioning | Multiple versions of a secret with a staging label. |
| Audit logging | CloudTrail records every secret access. |
| Cross-region replication | Replicate secrets to other regions for DR. |
| Native integrations | Built-in rotation support for RDS, Aurora, Redshift, DocumentDB. |

### When to Use

- You need to store and rotate database credentials, API keys, OAuth tokens, or other secrets.
- You need a managed rotation flow with audit logging.
- You need fine-grained per-secret access control.

### When Not to Use

- You only need to store a small number of configuration values and do not need rotation.
- You can use a different store such as AWS Systems Manager Parameter Store (cheaper, less rich) or a third-party vault.
- You need to store very large blobs (consider S3 with encryption instead).

### Pricing Model

- Pay per secret per month.
- Pay per API call.
- Rotation through Lambda is free, but you pay for the Lambda invocations.

### Trade-offs

- Pros: managed rotation, audit logging, fine-grained access, native RDS integration.
- Cons: more expensive than SSM Parameter Store for very high secret counts.

### Practical Tips

- Always enable automatic rotation for database credentials.
- Use distinct secrets per environment (dev, staging, prod) and per application.
- Cache secrets in the application with TTLs to reduce API calls and improve performance.
- Combine with IAM and CloudTrail for least-privilege access and audit.

### Related

- [IAM](./iam.md) for access control
- [RDS](../database/rds.md) and [Aurora](../database/aurora.md) for native rotation support
- [Lambda](../compute/lambda.md) for rotation Lambdas
- [System design: auth](../../../system-design/security/auth.md)
