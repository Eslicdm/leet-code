# GCP DevOps

DevOps services cover CI/CD, infrastructure as code, and artifact management.

### Decision Path

| Need | Start with |
| :-- | :-- |
| Build, test, and deploy with managed CI/CD. | [Cloud Build](./google-cloud-build.md) |
| Provision infrastructure with a Google-managed Terraform service. | [Infrastructure Manager](./infra-manager.md) |
| Store and manage container images and language packages. | [Artifact Registry](./artifact-registry.md) |

### When to Use GCP DevOps

- You want CI/CD that runs on Google's infrastructure with no servers to manage.
- You want managed Terraform with state stored in GCP.
- You want a single registry for Docker images, language packages, and build artifacts.

### Related

- [GCP compute services](../compute/)
- [GCP monitoring services](../monitoring/)
- [System design: resilience patterns](../../../system-design/reliability/resilience-patterns.md)
