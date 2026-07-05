# AWS WAF and Shield

AWS WAF is a web application firewall that protects against common web exploits and bots. AWS Shield provides DDoS protection for applications running on AWS.

### Key Features

| Feature | Description |
| :-- | :-- |
| AWS WAF | Layer 7 firewall with managed rule groups and custom rules. |
| Managed rule groups | SQL injection, XSS, known bad IPs, bot control, and rate limiting. |
| Custom rules | Match on headers, URI, query strings, body, and IP addresses. |
| AWS Shield Standard | Automatic DDoS protection for all AWS customers. |
| AWS Shield Advanced | Enhanced DDoS protection with 24/7 DDoS Response Team (DRT). |
| Rate-based rules | Block or throttle requests exceeding a threshold per IP. |
| Web ACL | Associate with CloudFront, ALB, API Gateway, or App Runner. |

### When to Use

- You want to protect web applications from SQL injection, XSS, and other OWASP Top 10 threats.
- You need rate limiting to protect against brute-force or DDoS attacks.
- You need managed rules that update automatically as new threats emerge.
- You need advanced DDoS protection with cost protection and rapid support.

### When Not to Use

- You only need network-level DDoS protection (Shield Standard is automatic).
- Your application is not exposed to the internet.
- You need to protect non-HTTP traffic (use Security Groups or Network Firewall).

### Pricing Model

- WAF: pay per Web ACL and per rule.
- Managed rule groups: additional per-rule fee.
- Shield Advanced: flat monthly fee plus data transfer charges.
- Shield Standard: free for all AWS customers.

### Trade-offs

- Pros: managed rules, low operational overhead, integrates with CloudFront and ALB, DDoS protection.
- Cons: rule tuning can be complex, false positives require testing, Shield Advanced has a fixed monthly cost.

### Practical Tips

- Start with managed rule groups and add custom rules as needed.
- Use rate-based rules as a first line of defense against floods.
- Test rules in count mode before switching to block mode.
- Use Shield Advanced with Route 53 and CloudFront for full coverage.

### Related

- [CloudFront](./cloudfront.md) for CDN and edge protection
- [API Gateway](./api-gateway.md) for managed API endpoints
- [VPC](./vpc.md) for network-level security
- [IAM](../security/iam.md) for access control
