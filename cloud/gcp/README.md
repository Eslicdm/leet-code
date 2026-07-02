# GCP

GCP is Google Cloud Platform. It is strong in data analytics, machine learning, and managed Kubernetes, and it uses the same global private network that backs Google's own products.

### Domains

| Domain | Purpose |
| :-- | :-- |
| [compute/](./compute/) | Compute Engine, GKE, Cloud Run, Cloud Functions. |
| [storage/](./storage/) | Cloud Storage, Persistent Disk, Filestore, Archive Storage. |
| [database/](./database/) | Cloud SQL, Spanner, Firestore, Bigtable, BigQuery, Memorystore. |
| [network/](./network/) | VPC, Cloud Load Balancing, Cloud CDN, Cloud DNS, Cloud Armor. |
| [security/](./security/) | IAM, Secret Manager, Cloud KMS, Security Command Center. |
| [messaging/](./messaging/) | Pub/Sub, Eventarc. |
| [serverless/](./serverless/) | Cloud Functions, Cloud Run, Workflows. |
| [devops/](./devops/) | Cloud Build, Cloud Deploy, Infrastructure Manager, Artifact Registry. |
| [monitoring/](./monitoring/) | Cloud Monitoring, Cloud Logging, Cloud Trace, Error Reporting. |
| [analytics/](./analytics/) | BigQuery, Dataflow, Dataproc, Data Fusion. |

### Decision Path

| Need | Start with |
| :-- | :-- |
| Run a virtual machine. | [Compute Engine](./compute/compute-engine.md) |
| Run managed Kubernetes. | [GKE](./compute/gke.md) |
| Run a serverless container or service. | [Cloud Run](./compute/cloud-run.md) |
| Run code in response to events. | [Cloud Functions](./compute/cloud-functions.md) |
| Store objects or backups. | [Cloud Storage](./storage/cloud-storage.md) |
| Run a managed relational database. | [Cloud SQL](./database/cloud-sql.md) |
| Run a globally distributed relational database. | [Spanner](./database/spanner.md) |
| Run a managed NoSQL document store. | [Firestore](./database/firestore.md) |
| Run a serverless data warehouse. | [BigQuery](./database/bigquery.md) |
| Build a private network. | [VPC](./network/vpc.md) |
| Manage secrets and credentials. | [Secret Manager](./security/secret-manager.md) |
| Coordinate services with events. | [Pub/Sub](./messaging/pub-sub.md) |

### Related

- [System design knowledge base](../../system-design/README.md)
- [AWS equivalent services](../aws/README.md)
- [Azure equivalent services](../azure/README.md)
