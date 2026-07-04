# Secret Manager

Secret Manager is a managed service for storing API keys, passwords, certificates, and other sensitive data. It supports versioning, fine-grained access control, and CMEK encryption.

### Key Features

| Feature | Description |
| :-- | :-- |
| Secret versions | Multiple versions of a secret with a primary alias. |
| Fine-grained IAM | Per-secret access control with IAM. |
| CMEK | Customer-managed encryption keys with Cloud KMS. |
| Audit logging | Cloud Audit Logs record every secret access. |
| Regional and global | Choose regional secrets for data residency. |
| Replication | Automatic replication of regional secrets to other regions. |
| Client libraries | Java, Go, Python, Node.js, and a REST API. |

### When to Use

- You need to store and version API keys, OAuth tokens, or database credentials.
- You need a managed secret store with per-secret IAM.
- You need CMEK encryption with Cloud KMS.

### When Not to Use

- You need automatic rotation of database credentials (consider AWS Secrets Manager equivalent or a custom rotation function).
- You only need to store non-sensitive configuration values (consider environment variables or a config service).
- You need to store very large blobs (consider [Cloud Storage](../storage/cloud-storage.md) with encryption).

### Pricing Model

- Pay per active secret version per month.
- Pay per access operation.
- Pay for CMEK operations if you use customer-managed keys.

### Trade-offs

- Pros: managed, fine-grained IAM, CMEK, audit logging.
- Cons: no built-in rotation; you implement it with Cloud Functions and Pub/Sub.

### Practical Tips

- Use distinct secrets per environment and per application.
- Cache secrets in the application with TTLs to reduce API calls.
- Enable Cloud Audit Logs for secret access.
- Use CMEK for sensitive workloads.
- Replicate regional secrets for cross-region disaster recovery.

### Related

- [IAM](./iam.md) for access control
- [Cloud KMS](https://cloud.google.com/kms) for customer-managed keys
- [Cloud Run](../compute/cloud-run.md) and [GKE](../compute/gke.md) for using secrets
- [System design: auth](../../../system-design/security/auth.md)
