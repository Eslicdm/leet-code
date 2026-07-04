# Dataproc

Dataproc is a managed Apache Spark and Hadoop service. It runs Spark, PySpark, Spark SQL, and Hive jobs on managed clusters or serverless.

### Key Features

| Feature | Description |
| :-- | :-- |
| Managed clusters | Spin up Spark or Hadoop clusters in minutes. |
| Serverless | Run Spark jobs without managing a cluster. |
| Autoscaling | Add or remove workers based on job load. |
| preemptible VMs | Lower cost with short-lived workers. |
| Connector to BigQuery | Direct read and write between Spark and BigQuery. |
| Jupyter and JupyterLab | Built-in notebook integration. |
| Job history server | Browse completed job metrics. |

### When to Use

- You run Spark, PySpark, or Hive workloads and want managed infrastructure.
- You want serverless Spark for ad hoc queries or ETL jobs.
- You are migrating from self-managed Hadoop to a managed service.
- You need to process data in GCS or BigQuery using Spark.

### When Not to Use

- You need streaming with exactly-once semantics (use [Dataflow](./dataflow.md)).
- You want a serverless analytics query engine without Spark (use [BigQuery](../database/bigquery.md)).
- You need interactive BI dashboards (use [Looker](./looker.md)).

### Pricing Model

- Pay per vCPU-hour, GB-hour of memory, and GB of disk for cluster nodes.
- Serverless: pay per vCPU-second and GB-second of memory.
- Preemptible VMs reduce cost significantly.

### Trade-offs

- Pros: managed Spark, serverless option, autoscaling, deep GCP integration.
- Cons: cluster startup time for non-serverless, Spark version management, not ideal for low-latency streaming.

### Practical Tips

- Use serverless for ad hoc or short-lived jobs.
- Use preemptible VMs for batch workloads to cut costs.
- Use the BigQuery connector to avoid shuffling data through intermediate storage.
- Use initialization actions to customize cluster software.

### Related

- [Dataflow](./dataflow.md) for managed Apache Beam streaming
- [BigQuery](../database/bigquery.md) for serverless analytics
- [Cloud Storage](../storage/cloud-storage.md) for data lake storage
