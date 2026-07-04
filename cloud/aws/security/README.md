# AWS Security

Security services cover identity, secrets, encryption, and threat protection.

### Decision Path

| Need | Start with |
| :-- | :-- |
| Manage identities, roles, and policies. | [IAM](./iam.md) |
| Store and rotate database credentials, API keys, and other secrets. | [Secrets Manager](./secrets-manager.md) |

### When to Use AWS Security

- You need fine-grained access control for users, roles, and services.
- You need to centralize and rotate secrets for applications and CI/CD.
- You need to encrypt data at rest and in transit with managed keys.

### Related

- [AWS compute services](../compute/)
- [AWS database services](../database/)
- [System design: auth](../../../system-design/security/auth.md)
