# Key Vault

Azure Key Vault is a managed service for storing and accessing secrets, keys, and certificates. It supports HSM-backed keys, automatic rotation, and fine-grained access control with Entra ID.

### Key Features

| Feature | Description |
| :-- | :-- |
| Vaults and managed HSM | Choose standard vaults or managed HSM pools. |
| Secrets, keys, and certificates | One service for all sensitive data. |
| FIPS 140-2 Level 3 | Managed HSM is validated at the highest level. |
| Soft delete and purge protection | Recover vaults and objects after deletion. |
| Private Endpoints | Access Key Vault privately from a VNet. |
| RBAC and access policies | Fine-grained access control with Entra ID. |
| Automatic rotation | Built-in rotation for some secrets and keys. |
| Audit logging | Log every secret, key, and certificate access. |

### When to Use

- You need a managed secret, key, and certificate store.
- You need FIPS 140-2 Level 3 validation for keys.
- You need fine-grained access control with Entra ID.
- You need private access to secrets from a VNet.

### When Not to Use

- You only need to store non-sensitive configuration values (use App Configuration or environment variables).
- You need a secret store outside of Azure (use a third-party vault).
- You need very large blobs (use [Blob Storage](../storage/blob-storage.md) with encryption).

### Pricing Model

- Pay per operation and per key or secret version stored.
- Managed HSM is billed per hour per HSM cluster.
- Premium SKUs include HSM-backed keys.

### Trade-offs

- Pros: managed, FIPS 140-2 Level 3 option, deep Entra ID integration, Private Endpoints.
- Cons: more expensive than App Configuration for non-sensitive values; some features require premium SKUs.

### Practical Tips

- Use RBAC instead of access policies for new vaults.
- Use Private Endpoints to keep traffic inside the VNet.
- Use managed identities for application access to Key Vault.
- Enable soft delete and purge protection for production vaults.
- Use managed HSM for FIPS 140-2 Level 3 requirements.

### Related

- [Entra ID](./entra-id.md) for identity and access control
- [App Service](../compute/app-service.md) and [Functions](../compute/functions.md) for application access
- [AKS](../compute/aks.md) for cluster access
- [System design: auth](../../../system-design/security/auth.md)
