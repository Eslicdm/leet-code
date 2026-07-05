# Application Gateway WAF

Application Gateway WAF is a web application firewall that protects against common web exploits and attacks. It runs on top of Application Gateway and can also protect App Service.

### Key Features

| Feature | Description |
| :-- | :-- |
| OWASP rules | Pre-configured rules based on OWASP ModSecurity Core Rule Set. |
| Custom rules | Create rules matching on IP, URI, headers, and body. |
| Anomaly scoring | Rate requests based on rule matches and block when threshold is exceeded. |
| Exclusion sets | Exclude specific requests from rule evaluation. |
| Prevention and detection | Block or log malicious requests. |
| Bot protection | Detect and manage automated traffic. |

### When to Use

- You need to protect web applications from SQL injection, XSS, and other OWASP Top 10 threats.
- You need WAF for applications behind Application Gateway or App Service.
- You need custom rules for application-specific protection.
- You want anomaly-based detection that aggregates risk across rules.

### When Not to Use

- You need network-level DDoS protection (use [DDoS Protection](./ddos-protection.md)).
- Your application is not behind Application Gateway.
- You need to protect non-HTTP traffic.

### Pricing Model

- Pay per policy per month.
- Additional per-rule fee for custom rules.
- Included with WAF_v2 SKU of Application Gateway.

### Trade-offs

- Pros: integrated with Application Gateway, OWASP rules, custom rules, anomaly scoring.
- Cons: requires Application Gateway, rule tuning can be complex, cost scales with number of rules.

### Practical Tips

- Start with OWASP rules in detection mode before switching to prevention.
- Use anomaly scoring to reduce false positives.
- Use exclusion sets for known-safe traffic patterns.
- Monitor with Azure Monitor and Log Analytics.

### Related

- [Application Gateway](../network/application-gateway.md) for L7 load balancing
- [DDoS Protection](./ddos-protection.md) for network-level protection
- [Front Door](../network/front-door.md) for global entry point
