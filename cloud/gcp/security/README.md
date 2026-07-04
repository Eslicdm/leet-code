# GCP Security

Security services cover identity, secrets, encryption, and threat detection.

### Decision Path

| Need | Start with |
| :-- | :-- |
| Manage identities, roles, and policies. | [IAM](./iam.md) |
| Store and version secrets with fine-grained access. | [Secret Manager](./secret-manager.md) |

### When to Use GCP Security

- You need fine-grained IAM with resource-level policies.
- You need a managed secret store with per-secret IAM and versioning.
- You need encryption keys managed by Google or by you (CMEK, EKM).

### Related

- [GCP compute services](../compute/)
- [GCP database services](../database/)
- [System design: auth](../../../system-design/security/auth.md)
