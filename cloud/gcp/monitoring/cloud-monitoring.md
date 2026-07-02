# Cloud Monitoring

Cloud Monitoring is the central metrics, dashboards, and alerting service in GCP. It collects metrics from GCP services, custom sources, and AWS accounts, and integrates with Cloud Logging and Cloud Trace.

### Key Features

| Feature | Description |
| :-- | :-- |
| Metrics | Time-series data from GCP, custom metrics, and AWS. |
| Dashboards | Customizable dashboards with charts, tables, and alerts. |
| Alerting | Threshold-based and metric-absence alerts with notification channels. |
| SLO monitoring | Service Level Objective monitoring with burn-rate alerts. |
| Uptime checks | Synthetic checks for HTTP(S), TCP, and UDP endpoints. |
| Multi-cloud | Ingest metrics from AWS accounts. |
| Managed Service for Prometheus | Compatible with Prometheus query language. |
| Cloud Operations Explorer | Ad hoc investigation of metrics, logs, and traces. |

### When to Use

- You need metrics, dashboards, and alerts in a single GCP-native service.
- You want managed integration with Compute Engine, GKE, Cloud Run, and other GCP services.
- You want SLO-based alerting.
- You have multi-cloud metrics and want a single pane of glass.

### When Not to Use

- You have a strong existing observability stack such as Datadog, New Relic, or Grafana Cloud.
- You need very long-term retention (export to BigQuery or Cloud Storage for archival).

### Pricing Model

- Pay per metric ingested, per alert, and per dashboard.
- Free tier includes a small number of metrics and alerts.
- AWS metric ingestion is billed separately.

### Trade-offs

- Pros: GCP-native, SLO support, multi-cloud, Prometheus compatibility.
- Cons: costs grow with metric volume; less rich than third-party observability tools for some use cases.

### Practical Tips

- Use SLO-based alerting for user-facing services.
- Use custom metrics for application-specific signals.
- Use uptime checks for global availability monitoring.
- Use Cloud Operations Explorer to pivot from a metric to related logs and traces.

### Related

- [Cloud Logging](https://cloud.google.com/logging) for logs
- [Cloud Trace](https://cloud.google.com/trace) for distributed tracing
- [Error Reporting](https://cloud.google.com/error-reporting) for exception tracking
- [System design: observability](../../../system-design/reliability/observability.md)
