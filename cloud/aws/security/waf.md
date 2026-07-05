# AWS WAF

AWS WAF is a managed web application firewall that lets you create rules to filter, block, or monitor HTTP/HTTPS requests to CloudFront, ALB, API Gateway, and App Runner.

### Key Features

| Feature | Description |
| :-- | :-- |
| Web ACLs | Groups of rules evaluated in order, associated with a resource. |
| Managed rule groups | Pre-built rules for SQL injection, XSS, bot control, and IP reputation. |
| Custom rules | Match on URI, query string, headers, body, HTTP method, and IP. |
| Rate-based rules | Throttle or block requests exceeding a threshold per IP. |
| Geographic restrictions | Allow or block traffic by country. |
| Label-based matching | Use labels from managed rules in custom rules. |
| Logging | Log to S3, CloudWatch, or Kinesis Data Firehose. |

### When to Use

- You want to protect web applications from common exploits (SQLi, XSS).
- You need rate limiting to prevent brute-force or application-layer DDoS.
- You need geographic restrictions for compliance or licensing.
- You want managed rules that update as new vulnerabilities are discovered.

### When Not to Use

- You need network-level DDoS protection (use [Shield](../network/cloud-armor.md)).
- Your application is not exposed to HTTP/HTTPS.
- You need deep packet inspection for non-HTTP protocols (use Network Firewall).

### Pricing Model

- Pay per Web ACL and per rule.
- Managed rule groups have a per-rule fee.
- Rate-based rules are charged per rule.
- Free tier: 1 Web ACL, 10 rules, and 1 million requests per month.

### Trade-offs

- Pros: managed rules, integrates with CloudFront and ALB, low operational overhead.
- Cons: rule tuning can produce false positives, cost scales with number of rules and requests.

### Practical Tips

- Start with managed rules and tune in count mode before blocking.
- Use rate-based rules for credential stuffing and brute-force protection.
- Use labels to build complex rule logic across managed and custom rules.
- Log to CloudWatch for monitoring and alerting.

### Related

- [CloudFront](../network/cloudfront.md) for CDN and edge delivery
- [ALB](https://aws.amazon.com/elasticloadbalancing/) for application load balancing
- [API Gateway](../network/api-gateway.md) for managed APIs
- [IAM](./iam.md) for access control
