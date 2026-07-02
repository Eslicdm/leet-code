# Azure Pipelines

Azure Pipelines is a managed CI/CD service that builds, tests, and deploys your code to any platform. It supports any language, any platform, and any cloud.

### Key Features

| Feature | Description |
| :-- | :-- |
| YAML and classic pipelines | Declarative YAML or visual classic editor. |
| Multi-platform agents | Microsoft-hosted agents for Linux, macOS, and Windows. |
| Self-hosted agents | Run agents on your own infrastructure for security or networking. |
| Stages, jobs, and steps | Compose complex pipelines with parallel and sequential stages. |
| Approvals and gates | Manual approvals and automated gates before deployment. |
| Environments | Group targets with specific access and history. |
| Service connections | Reusable auth to Azure, GitHub, Docker, Kubernetes, and more. |
| Test integration | Built-in support for unit, integration, and UI tests. |
| Release pipelines | Separate release definitions with stages and approvals. |

### When to Use

- You need managed CI/CD that integrates with Azure DevOps, GitHub, and Azure.
- You need multi-platform agents (Linux, macOS, Windows) without managing infrastructure.
- You need complex multi-stage deployments with approvals and gates.

### When Not to Use

- You have a strong existing CI/CD platform such as GitHub Actions, Jenkins, or CircleCI and do not want to manage two systems.
- You need a self-hosted build environment (use self-hosted agents in Azure Pipelines if you need that).

### Pricing Model

- Free tier includes 1,800 build minutes per month for Microsoft-hosted CI/CD.
- Pay per additional parallel job and per build minute beyond the free tier.
- Self-hosted agents are free (you pay for the underlying infrastructure).

### Trade-offs

- Pros: managed, multi-platform, deep Azure integration, supports complex pipelines.
- Cons: best suited to organizations already using Azure DevOps; less popular than GitHub Actions for new projects.

### Practical Tips

- Use YAML pipelines for version control and code review.
- Use self-hosted agents for builds that need VPC access or specialized hardware.
- Use environments with approvals and gates for production deployments.
- Use service connections with managed identity instead of stored secrets.

### Related

- [Bicep](./bicep.md) for infrastructure as code
- [AKS](../compute/aks.md) and [Container Apps](../compute/container-apps.md) for deployment targets
- [Functions](../compute/functions.md) and [App Service](../compute/app-service.md) for serverless and PaaS targets
- [System design: resilience patterns](../../../system-design/reliability/resilience-patterns.md)
