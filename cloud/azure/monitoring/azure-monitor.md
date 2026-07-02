# Azure Monitor

Azure Monitor is the central monitoring and observability service in Azure. It collects metrics, logs, and traces from Azure resources, applications, and on-premises sources.

### Key Features

| Feature | Description |
| :-- | :-- |
| Metrics | Time-series data from Azure resources, custom metrics, and applications. |
| Logs | Centralized log aggregation with KQL-based queries. |
| Alerts | Threshold-based and metric-absence alerts with Action Groups. |
| Dashboards | Customizable dashboards with charts, grids, and tiles. |
| Log Analytics workspaces | Centralized log storage and query. |
| Application Insights | APM for web apps, including distributed tracing. |
| VM insights | Performance and connection monitoring for VMs. |
| Container insights | Performance and log monitoring for AKS and Container Apps. |
| Network insights | Topology and health for virtual networks. |
| Workbooks | Interactive reports combining metrics, logs, and parameters. |

### When to Use

- You need metrics, logs, and alerts in a single Azure-native service.
- You want managed integration with VMs, AKS, App Service, Functions, and other Azure services.
- You need APM for web applications with distributed tracing.
- You want KQL-based log queries.

### When Not to Use

- You have a strong existing observability stack such as Datadog, New Relic, or Grafana Cloud.
- You need very long-term retention (export to Blob Storage and analyze with Synapse or another tool).

### Pricing Model

- Pay per GB of log ingestion, per GB of log retention, per metric ingested, and per alert.
- Application Insights has its own pricing based on data ingested.
- Some Azure resource metrics are free.

### Trade-offs

- Pros: Azure-native, deep integration, KQL, Application Insights.
- Cons: log queries can be slow and expensive at very large scales; less rich than third-party observability tools for some use cases.

### Practical Tips

- Use structured logs to make queries faster and cheaper.
- Use Log Analytics workspaces for centralized log queries.
- Use Application Insights for web application APM.
- Use Workbooks for shared dashboards across teams.
- Use action groups for unified notification and remediation.

### Related

- [Application Insights](https://learn.microsoft.com/en-us/azure/azure-monitor/app/app-insights-overview) for APM
- [Log Analytics](https://learn.microsoft.com/en-us/azure/azure-monitor/logs/log-analytics-overview) for log queries
- [AKS](../compute/aks.md) and [Container Apps](../compute/container-apps.md) for container workloads
- [System design: observability](../../../system-design/reliability/observability.md)
