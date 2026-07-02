# Infrastructure Manager

Infrastructure Manager is a Google-managed Terraform service. You describe your infrastructure in Terraform, and Infrastructure Manager provisions and manages it on Google Cloud.

### Key Features

| Feature | Description |
| :-- | :-- |
| Terraform as code | Use standard Terraform syntax and providers. |
| Managed state | Terraform state is stored and managed by Google. |
| Preview changes | Preview plans before applying them. |
| Drift detection | Detect manual changes to managed resources. |
| IAM integration | Per-deployment IAM with least-privilege service accounts. |
| Source control | Pull Terraform configurations from Cloud Source Repositories or GitHub. |
| Versions and rollbacks | Maintain history of deployments and roll back when needed. |

### When to Use

- You want a Google-managed Terraform service with built-in state management.
- You already use Terraform and want to centralize deployments on GCP.
- You want IAM, drift detection, and version history without running your own Terraform Cloud or self-hosted runners.

### When Not to Use

- You want to use a different IaC tool such as Pulumi or CDK.
- You already have a self-hosted Terraform Cloud or Atlantis deployment.
- You need to manage non-GCP resources from the same tool.

### Pricing Model

- Pay per deployment operation.
- Pay for the GCP resources provisioned by Terraform.

### Trade-offs

- Pros: managed state, IAM integration, drift detection, version history.
- Cons: GCP-only; not as feature-rich as Terraform Cloud for multi-cloud or self-service.

### Practical Tips

- Store Terraform modules in version control.
- Use preview plans for any production change.
- Use per-deployment service accounts with least-privilege IAM.
- Use drift detection to catch manual changes.

### Related

- [Cloud Build](./google-cloud-build.md) for CI/CD
- [Artifact Registry](./artifact-registry.md) for image and package storage
- [GKE](../compute/gke.md) and [Cloud Run](../compute/cloud-run.md) for deployment targets
- [System design: resilience patterns](../../../system-design/reliability/resilience-patterns.md)
