# Cloud Armor

Cloud Armor protects applications and websites from DDoS attacks and web exploits. It works with external HTTP(S) load balancers and provides WAF capabilities.

### Key Features

| Feature | Description |
| :-- | :-- |
| DDoS protection | Automatic L3/L4 DDoS mitigation for all load-balanced traffic. |
| WAF rules | Managed rules for SQL injection, XSS, and protocol attacks. |
| Custom rules | Match on IP, URI, headers, regions, and rate. |
| Rate limiting | Throttle or block excessive requests per IP. |
| Adaptive protection | ML-based detection of layer 7 attacks. |
| Bot management | Detect and manage automated traffic. |
| Preconfigured rules | OWASP ModSecurity Core Rule Set. |

### When to Use

- You need WAF protection for web applications behind an external load balancer.
- You want to mitigate DDoS attacks at the network edge.
- You need rate limiting to prevent brute-force or credential stuffing.
- You need bot detection and management.

### When Not to Use

- Your application is not behind an HTTP(S) load balancer.
- You need network-level firewall rules (use [VPC firewall rules](./vpc.md)).
- You need to protect non-HTTP traffic.

### Pricing Model

- Pay per policy and per rule.
- DDoS protection is included with load balancers.
- Adaptive Protection has a per-rule fee.

### Trade-offs

- Pros: integrated with Cloud Load Balancing, managed WAF rules, adaptive protection.
- Cons: requires HTTP(S) load balancer, rule tuning can be complex, cost scales with number of rules.

### Practical Tips

- Start with preconfigured WAF rules and tune from count mode.
- Use rate limiting as a first defense against floods.
- Use adaptive protection to detect new attack patterns.
- Monitor with Cloud Logging and Cloud Monitoring.

### Related

- [Cloud Load Balancing](./cloud-load-balancing.md) for traffic distribution
- [Cloud CDN](./cloud-cdn.md) for edge caching
- [Identity-Aware Proxy](../security/identity-aware-proxy.md) for application-level access control
