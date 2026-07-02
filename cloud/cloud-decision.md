# Cloud Knowledge Base Reorganization Decision

This document is the decision plan for the `cloud/` knowledge base. It organizes cloud products from AWS, GCP, and Azure into a per-provider, domain-based taxonomy so each service can be reviewed independently.

### Purpose

Cloud providers expose hundreds of services. The goal of this folder is to make the most important services easy to browse, compare, and reference during architecture work, study, or interview preparation. Services are grouped by domain (compute, storage, database, network, security, messaging, serverless, devops, monitoring, analytics) within each provider.

This is **only the planning document**: it defines the taxonomy, the curated service list, and the content convention. It does not yet contain every service. Additional services can be added incrementally following the same pattern.

### Organization Rules

| Use a folder when... | Use a single `.md` file when... |
| :-- | :-- |
| The domain contains multiple related services. | The service is narrow enough to explain in one focused page. |
| The reader benefits from comparing services in the same domain. | The service is standalone with no close siblings. |
| The domain is likely to grow with more services. | Adding more files would create unnecessary nesting. |

Examples of domain folders:

- `compute/` because VMs, managed Kubernetes, and serverless containers are distinct decisions.
- `database/` because managed relational, NoSQL, and data warehouse services have different trade-offs.
- `network/` because VPC, load balancing, CDN, and DNS are separate concerns.
- `security/` because IAM, secrets, and key management are different operational topics.

### Target Folder Taxonomy

```text
cloud/
  README.md                              # Root index for the cloud knowledge base.
  cloud-decision.md                      # This planning document.
  aws/
    README.md                            # AWS navigation and decision guide.
    compute/                             # EC2, ECS, EKS, Lambda, Fargate, Auto Scaling.
    storage/                             # S3, EBS, EFS, Glacier.
    database/                            # RDS, Aurora, DynamoDB, ElastiCache, Redshift.
    network/                             # VPC, CloudFront, Route 53, ALB/NLB, API Gateway.
    security/                            # IAM, Secrets Manager, KMS, WAF, Shield.
    messaging/                           # SQS, SNS, EventBridge, Kinesis, MSK.
    serverless/                          # Lambda, Step Functions, EventBridge Scheduler.
    devops/                              # CloudFormation, CDK, CodeBuild, CodePipeline.
    monitoring/                          # CloudWatch, X-Ray, CloudTrail, Config.
    analytics/                           # Athena, EMR, Glue, Kinesis Data Analytics.
  gcp/
    README.md                            # GCP navigation and decision guide.
    compute/                             # Compute Engine, GKE, Cloud Run, Cloud Functions.
    storage/                             # Cloud Storage, Persistent Disk, Filestore, Archive Storage.
    database/                            # Cloud SQL, Spanner, Firestore, Bigtable, BigQuery, Memorystore.
    network/                             # VPC, Cloud Load Balancing, Cloud CDN, Cloud DNS, Cloud Armor.
    security/                            # IAM, Secret Manager, Cloud KMS, Security Command Center.
    messaging/                           # Pub/Sub, Eventarc.
    serverless/                          # Cloud Functions, Cloud Run, Workflows.
    devops/                              # Cloud Build, Cloud Deploy, Infrastructure Manager, Artifact Registry.
    monitoring/                          # Cloud Monitoring, Cloud Logging, Cloud Trace, Error Reporting.
    analytics/                           # BigQuery, Dataflow, Dataproc, Data Fusion.
  azure/
    README.md                            # Azure navigation and decision guide.
    compute/                             # Virtual Machines, AKS, Container Apps, App Service, Functions.
    storage/                             # Blob Storage, Disk Storage, Files, Archive Storage.
    database/                            # SQL Database, Cosmos DB, Database for MySQL/PostgreSQL, Cache for Redis, Synapse.
    network/                             # Virtual Network, Load Balancer, Front Door, CDN, DNS.
    security/                            # Entra ID, Key Vault, Microsoft Defender for Cloud.
    messaging/                           # Service Bus, Event Grid, Event Hubs.
    serverless/                          # Functions, Logic Apps, Container Apps.
    devops/                              # Azure Pipelines, Bicep, Terraform on Azure, Azure DevOps.
    monitoring/                          # Azure Monitor, Application Insights, Log Analytics.
    analytics/                           # Synapse, Data Factory, Databricks, Stream Analytics.
```

### Curated Service List

This list covers the most commonly used services per domain. Additional services can be added incrementally using the same content convention.

#### AWS (Core Services)

| Domain | Service | File |
| :-- | :-- | :-- |
| Compute | EC2 | `aws/compute/ec2.md` |
| Compute | ECS | `aws/compute/ecs.md` |
| Compute | EKS | `aws/compute/eks.md` |
| Compute | Lambda | `aws/compute/lambda.md` |
| Storage | S3 | `aws/storage/s3.md` |
| Storage | EBS | `aws/storage/ebs.md` |
| Database | RDS | `aws/database/rds.md` |
| Database | DynamoDB | `aws/database/dynamodb.md` |
| Database | Aurora | `aws/database/aurora.md` |
| Network | VPC | `aws/network/vpc.md` |
| Network | CloudFront | `aws/network/cloudfront.md` |
| Network | API Gateway | `aws/network/api-gateway.md` |
| Security | IAM | `aws/security/iam.md` |
| Security | Secrets Manager | `aws/security/secrets-manager.md` |
| Messaging | SQS | `aws/messaging/sqs.md` |
| Messaging | SNS | `aws/messaging/sns.md` |
| Messaging | EventBridge | `aws/messaging/eventbridge.md` |
| DevOps | CloudFormation | `aws/devops/cloudformation.md` |
| DevOps | CDK | `aws/devops/cdk.md` |
| Monitoring | CloudWatch | `aws/monitoring/cloudwatch.md` |

#### GCP (Core Services)

| Domain | Service | File |
| :-- | :-- | :-- |
| Compute | Compute Engine | `gcp/compute/compute-engine.md` |
| Compute | GKE | `gcp/compute/gke.md` |
| Compute | Cloud Run | `gcp/compute/cloud-run.md` |
| Compute | Cloud Functions | `gcp/compute/cloud-functions.md` |
| Storage | Cloud Storage | `gcp/storage/cloud-storage.md` |
| Database | Cloud SQL | `gcp/database/cloud-sql.md` |
| Database | Firestore | `gcp/database/firestore.md` |
| Database | Spanner | `gcp/database/spanner.md` |
| Database | BigQuery | `gcp/database/bigquery.md` |
| Network | VPC | `gcp/network/vpc.md` |
| Network | Cloud Load Balancing | `gcp/network/cloud-load-balancing.md` |
| Network | Cloud CDN | `gcp/network/cloud-cdn.md` |
| Security | IAM | `gcp/security/iam.md` |
| Security | Secret Manager | `gcp/security/secret-manager.md` |
| Messaging | Pub/Sub | `gcp/messaging/pub-sub.md` |
| Serverless | Workflows | `gcp/serverless/workflows.md` |
| DevOps | Cloud Build | `gcp/devops/google-cloud-build.md` |
| DevOps | Infrastructure Manager | `gcp/devops/infra-manager.md` |
| DevOps | Artifact Registry | `gcp/devops/artifact-registry.md` |
| Monitoring | Cloud Monitoring | `gcp/monitoring/cloud-monitoring.md` |

#### Azure (Core Services)

| Domain | Service | File |
| :-- | :-- | :-- |
| Compute | Virtual Machines | `azure/compute/virtual-machines.md` |
| Compute | AKS | `azure/compute/aks.md` |
| Compute | Container Apps | `azure/compute/container-apps.md` |
| Compute | App Service | `azure/compute/app-service.md` |
| Compute | Functions | `azure/compute/functions.md` |
| Storage | Blob Storage | `azure/storage/blob-storage.md` |
| Database | SQL Database | `azure/database/sql-database.md` |
| Database | Cosmos DB | `azure/database/cosmos-db.md` |
| Network | Virtual Network | `azure/network/virtual-network.md` |
| Network | Load Balancer | `azure/network/load-balancer.md` |
| Network | Front Door | `azure/network/front-door.md` |
| Security | Entra ID | `azure/security/entra-id.md` |
| Security | Key Vault | `azure/security/key-vault.md` |
| Messaging | Service Bus | `azure/messaging/service-bus.md` |
| Messaging | Event Grid | `azure/messaging/event-grid.md` |
| DevOps | Azure Pipelines | `azure/devops/azure-pipelines.md` |
| DevOps | Bicep | `azure/devops/bicep.md` |
| Monitoring | Azure Monitor | `azure/monitoring/azure-monitor.md` |

### Missing Important Increments

Services that are useful but not yet in the curated list. They can be added later following the same content convention.

#### AWS — To Add

| Domain | Service | File |
| :-- | :-- | :-- |
| Compute | Fargate, Auto Scaling, Batch, Lightsail | `aws/compute/` |
| Storage | EFS, FSx, Glacier | `aws/storage/` |
| Database | ElastiCache, Redshift, Neptune, DocumentDB, Timestream, QLDB | `aws/database/` |
| Network | Route 53, ALB/NLB, Direct Connect, Transit Gateway, PrivateLink, Global Accelerator | `aws/network/` |
| Security | KMS, WAF, Shield, GuardDuty, Macie, Security Hub, Cognito | `aws/security/` |
| Messaging | Kinesis, MSK, Step Functions | `aws/messaging/` |
| Serverless | Step Functions, App Runner | `aws/serverless/` |
| DevOps | CodeBuild, CodePipeline, CodeDeploy, OpsWorks, Proton | `aws/devops/` |
| Monitoring | X-Ray, CloudTrail, Config, Trusted Advisor | `aws/monitoring/` |
| Analytics | Athena, EMR, Glue, Kinesis Data Analytics, QuickSight | `aws/analytics/` |

#### GCP — To Add

| Domain | Service | File |
| :-- | :-- | :-- |
| Compute | MIG (Managed Instance Groups), Batch, GKE Autopilot | `gcp/compute/` |
| Storage | Filestore, Archive Storage, Persistent Disk | `gcp/storage/` |
| Database | Bigtable, AlloyDB, Memorystore, Datastream, Database Migration Service | `gcp/database/` |
| Network | Cloud DNS, Cloud Armor, Private Service Connect, Cloud NAT, Hybrid Connectivity | `gcp/network/` |
| Security | Cloud KMS, Security Command Center, Cloud DLP, Chronicle | `gcp/security/` |
| Messaging | Eventarc, Scheduler | `gcp/messaging/` |
| Serverless | Eventarc, Scheduler, Cloud Run jobs | `gcp/serverless/` |
| DevOps | Cloud Deploy, Cloud Deploy, Terraform on GCP, GKE Enterprise | `gcp/devops/` |
| Monitoring | Cloud Logging, Cloud Trace, Error Reporting, Cloud Profiler | `gcp/monitoring/` |
| Analytics | Dataflow, Dataproc, Data Fusion, Looker | `gcp/analytics/` |

#### Azure — To Add

| Domain | Service | File |
| :-- | :-- | :-- |
| Compute | Virtual Machine Scale Sets, Batch, Service Fabric | `azure/compute/` |
| Storage | Files, Queue Storage, Table Storage, Archive Storage | `azure/storage/` |
| Database | Database for MySQL, Database for PostgreSQL, Cache for Redis, Synapse, Database Migration Service | `azure/database/` |
| Network | Application Gateway, CDN, Virtual WAN, ExpressRoute, Private Link, Traffic Manager | `azure/network/` |
| Security | Microsoft Defender for Cloud, Entra ID Governance, Managed Identity, App Configuration | `azure/security/` |
| Messaging | Event Hubs, Storage Queues, Relay | `azure/messaging/` |
| Serverless | Logic Apps, API Management | `azure/serverless/` |
| DevOps | Azure DevOps, GitHub Actions on Azure, Terraform on Azure | `azure/devops/` |
| Monitoring | Application Insights, Log Analytics, Sentinel | `azure/monitoring/` |
| Analytics | Synapse, Data Factory, Databricks, Stream Analytics, Power BI | `azure/analytics/` |

### Naming and Documentation Conventions

#### Naming conventions

- Use lowercase folder names.
- Use kebab-case file names, such as `cloud-run.md`, `virtual-machines.md`, `secrets-manager.md`.
- Prefer the canonical product name as the file name. For AWS, common abbreviations are accepted (e.g., `ec2.md`, `s3.md`, `rds.md`).
- Use `README.md` as a folder landing page only.
- Group services that are closely related under a domain folder (e.g., `database/`, `network/`).

#### Content conventions

Each service file should follow a consistent practical format:

1. H1 title matching the service name.
2. Short purpose paragraph explaining what the service is, who manages it, and what problem it solves.
3. Key features or capabilities table.
4. `When to use` section with concrete signals.
5. `When not to use` section pointing to alternatives when relevant.
6. Pricing model summary (pay-as-you-go, reservations, committed use, free tier).
7. `Trade-offs` section covering lock-in, operational complexity, security, and integration.
8. Practical tips: limits, common gotchas, integration notes.
9. Cross-links to related services in the same provider and to system-design topics when relevant.

### Verification Notes

- Every service file must follow the same content convention.
- Cross-links between services in the same provider should be relative.
- Cross-links to `system-design/` topics should use `../system-design/...` paths.
- Domain folders with a single service are still useful for future expansion.
- The curated service list is a starting point, not a complete catalog. New services can be added incrementally.
