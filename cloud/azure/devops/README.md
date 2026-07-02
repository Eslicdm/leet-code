# Azure DevOps

DevOps services cover CI/CD, infrastructure as code, and deployment automation.

### Decision Path

| Need | Start with |
| :-- | :-- |
| Build, test, and deploy with managed CI/CD. | [Azure Pipelines](./azure-pipelines.md) |
| Define infrastructure as code with an Azure-native DSL. | [Bicep](./bicep.md) |

### When to Use Azure DevOps

- You want CI/CD that integrates deeply with Azure and Entra ID.
- You want a declarative DSL that is purpose-built for Azure Resource Manager.
- You need to manage multi-environment promotions and approvals.

### Related

- [Azure compute services](../compute/)
- [Azure monitoring services](../monitoring/)
- [System design: resilience patterns](../../../system-design/reliability/resilience-patterns.md)
