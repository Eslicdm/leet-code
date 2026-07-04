# IAM (Identity and Access Management)

GCP IAM controls who is authenticated and authorized to use GCP resources. It is the foundation of every GCP security design.

### Key Features

| Feature | Description |
| :-- | :-- |
| Roles | Primitive, predefined, and custom roles for fine-grained access. |
| Policies | Bind a principal to a role for a specific resource. |
| Workload Identity | Bind a Kubernetes service account to a Google service account. |
| Service account impersonation | Short-lived credentials instead of long-lived keys. |
| Conditional access | Time-bound, IP-based, or device-based access. |
| Organization policies | Constraints on how resources can be configured. |
| Access Context Manager | Define access levels based on user, device, and context. |
| IAM Deny | Explicit deny policies that override allow. |
| Policy Intelligence | Analyze who has what access and find over-privileged identities. |

### When to Use

- Any GCP workload needs IAM; it is mandatory, not optional.
- You need to grant different permissions to humans, applications, and GCP services.
- You need to enforce least privilege across projects and folders.

### When Not to Use

- There is no scenario where IAM is not used in GCP. The question is how to organize it (single project, multi-project with folders, or organization-wide policies).

### Pricing Model

- IAM is free.
- Access Context Manager charges per user or per policy.

### Trade-offs

- Pros: fine-grained, integrates with every GCP service, supports Workload Identity and conditional access.
- Cons: complex policies can be hard to reason about; over-privileged roles are a common security finding.

### Practical Tips

- Prefer service account impersonation over long-lived keys.
- Use Workload Identity for GKE workloads.
- Use predefined roles when possible, custom roles when needed.
- Use Policy Intelligence to find unused and over-privileged roles.
- Use Organization Policy to enforce guardrails.

### Related

- [Secret Manager](./secret-manager.md) for secret storage
- [Workload Identity](https://cloud.google.com/kubernetes-engine/docs/concepts/workload-identity) for GKE IAM
- [Cloud Run](../compute/cloud-run.md) and [Cloud Functions](../compute/cloud-functions.md) for using service accounts
- [System design: auth](../../../system-design/security/auth.md)
