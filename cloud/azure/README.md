# Azure

Azure is Microsoft's cloud platform. It is strong in enterprise environments, hybrid scenarios, and the Microsoft ecosystem (Windows, Active Directory, .NET, Office 365).

### Domains

| Domain | Purpose |
| :-- | :-- |
| [compute/](./compute/) | Virtual Machines, AKS, Container Apps, App Service, Functions. |
| [storage/](./storage/) | Blob Storage, Disk Storage, Files, Archive Storage. |
| [database/](./database/) | SQL Database, Cosmos DB, Database for MySQL/PostgreSQL, Cache for Redis, Synapse. |
| [network/](./network/) | Virtual Network, Load Balancer, Front Door, CDN, DNS. |
| [security/](./security/) | Entra ID, Key Vault, Microsoft Defender for Cloud. |
| [messaging/](./messaging/) | Service Bus, Event Grid, Event Hubs. |
| [serverless/](./serverless/) | Functions, Logic Apps, Container Apps. |
| [devops/](./devops/) | Azure Pipelines, Bicep, Terraform on Azure, Azure DevOps. |
| [monitoring/](./monitoring/) | Azure Monitor, Application Insights, Log Analytics. |
| [analytics/](./analytics/) | Synapse, Data Factory, Databricks, Stream Analytics. |

### Decision Path

| Need | Start with |
| :-- | :-- |
| Run a virtual machine. | [Virtual Machines](./compute/virtual-machines.md) |
| Run managed Kubernetes. | [AKS](./compute/aks.md) |
| Run a serverless container or service. | [Container Apps](./compute/container-apps.md) |
| Run a managed web app. | [App Service](./compute/app-service.md) |
| Run code in response to events. | [Functions](./compute/functions.md) |
| Store objects or backups. | [Blob Storage](./storage/blob-storage.md) |
| Run a managed relational database. | [SQL Database](./database/sql-database.md) |
| Run a globally distributed NoSQL store. | [Cosmos DB](./database/cosmos-db.md) |
| Build a private network. | [Virtual Network](./network/virtual-network.md) |
| Manage identities and access. | [Entra ID](./security/entra-id.md) |
| Manage secrets and keys. | [Key Vault](./security/key-vault.md) |
| Coordinate services with events. | [Event Grid](./messaging/event-grid.md) |

### Related

- [System design knowledge base](../../system-design/README.md)
- [AWS equivalent services](../aws/README.md)
- [GCP equivalent services](../gcp/README.md)
