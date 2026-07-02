# Bicep

Bicep is a domain-specific language (DSL) for deploying Azure resources. It is a transparent abstraction over Azure Resource Manager (ARM) templates with simpler syntax and better tooling.

### Key Features

| Feature | Description |
| :-- | :-- |
| Declarative syntax | Describe the desired state in a simple, readable DSL. |
| Modular | Compose deployments from reusable modules. |
| Strong typing | IntelliSense, type checking, and validation in VS Code. |
| Transpiles to ARM | Compiles to standard ARM JSON for full compatibility. |
| What-if | Preview changes before deploying. |
| Linting | Built-in linter to catch common errors. |
| Integration | Works with Azure CLI, PowerShell, and Azure Pipelines. |

### When to Use

- You want a purpose-built DSL for Azure that is simpler than raw ARM JSON.
- You want strong typing and tooling for IaC in VS Code.
- You need to deploy Azure resources as part of CI/CD with Azure Pipelines or GitHub Actions.

### When Not to Use

- You want to use a general-purpose programming language for IaC (use Pulumi, CDK, or Terraform).
- You need to manage non-Azure resources from the same tool.
- You prefer the maturity and ecosystem of Terraform.

### Pricing Model

- Bicep itself is free.
- You pay for the Azure resources it deploys.

### Trade-offs

- Pros: simple, purpose-built for Azure, strong typing, modular.
- Cons: Azure-only; smaller ecosystem than Terraform; no remote state management built in.

### Practical Tips

- Use modules to organize large deployments.
- Use What-if before any production deployment.
- Use Bicep linter in CI to catch errors early.
- Use Bicep registries to share modules across teams.

### Related

- [Azure Pipelines](./azure-pipelines.md) for CI/CD
- [AKS](../compute/aks.md) and [Container Apps](../compute/container-apps.md) for deployment targets
- [Virtual Network](../network/virtual-network.md) for networking
- [SQL Database](../database/sql-database.md) for managed databases
- [System design: resilience patterns](../../../system-design/reliability/resilience-patterns.md)
