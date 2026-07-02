# Amazon CloudWatch

CloudWatch is the central monitoring and observability service in AWS. It collects metrics, logs, and events from AWS resources, applications, and on-premises sources.

### Key Features

| Feature | Description |
| :-- | :-- |
| Metrics | Time-series data from AWS services, custom metrics, and applications. |
| Logs | Centralized log aggregation from AWS services, EC2, Lambda, and on-premises. |
| Alarms | Threshold-based alarms tied to metrics or log patterns. |
| Dashboards | Customizable dashboards for metrics and logs. |
| Events / EventBridge | Reactive event rules for AWS resources. |
| ServiceLens | Trace visualization for X-Ray traces. |
| Logs Insights | Interactive log queries. |
| Anomaly detection | ML-based detection of unusual metric behavior. |
| Synthetics | Canary scripts to monitor endpoints and APIs. |

### When to Use

- You need metrics, logs, and alarms in a single AWS-native service.
- You want managed integration with EC2, ECS, Lambda, RDS, and other AWS services.
- You need a managed APM-style workflow with X-Ray.

### When Not to Use

- You have a strong existing observability stack such as Datadog, New Relic, or Grafana Cloud and do not want to manage two systems.
- You need very long-term retention (consider exporting to S3 and analyzing with Athena).

### Pricing Model

- Pay per metric ingested, per dashboard, per alarm, and per GB of logs stored and scanned.
- Some AWS service metrics are free; custom metrics and high-resolution metrics are billed.

### Trade-offs

- Pros: AWS-native, no agent required for AWS services, integrates with IAM.
- Cons: log queries can be slow and expensive at very large scales; less rich than third-party observability tools.

### Practical Tips

- Use structured JSON logs to make queries faster and cheaper.
- Use CloudWatch Logs Insights for ad hoc analysis; export to S3 for long-term retention.
- Use metric filters to extract custom metrics from logs.
- Use composite alarms to reduce noise from many individual alarms.

### Related

- [X-Ray](https://aws.amazon.com/xray/) for distributed tracing
- [CloudTrail](https://aws.amazon.com/cloudtrail/) for audit logs
- [Lambda](../compute/lambda.md) and [ECS](../compute/ecs.md) for application logs
- [System design: observability](../../../system-design/reliability/observability.md)
