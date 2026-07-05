# Amazon Route 53

Route 53 is a highly available DNS web service. It routes end users to internet applications by translating domain names to IP addresses.

### Key Features

| Feature | Description |
| :-- | :-- |
| DNS hosting | Manage DNS records for any domain. |
| Routing policies | Simple, weighted, latency, failover, and geolocation. |
| Health checks | Monitor endpoint health and stop routing to unhealthy targets. |
| Domain registration | Buy and manage domain names directly. |
| Traffic flow | Visual traffic routing with versioning. |
| DNSSEC | DNS Security Extensions to prevent spoofing. |
| Resolver | Inbound and outbound DNS resolution for hybrid VPCs. |

### When to Use

- You need to manage DNS for domains hosted on AWS.
- You want weighted, latency-based, or geolocation routing across regions.
- You need DNS-level failover with health checks.
- You need private DNS for VPC resources or hybrid DNS with on-premises.

### When Not to Use

- You need a global anycast CDN with DDoS protection (use [CloudFront](./cloudfront.md) with [Cloud Armor](https://aws.amazon.com/waf/)).
- You need application-level load balancing (use [ALB/NLB](https://aws.amazon.com/elasticloadbalancing/)).
- Your DNS provider is already integrated with your domain registrar and works fine.

### Pricing Model

- Pay per hosted zone per month.
- Pay per million queries for standard queries.
- Health checks: pay per health check per month.
- Domain registration: standard TLD pricing.

### Trade-offs

- Pros: deeply integrated with AWS services, health-check-based failover, DNSSEC support, hybrid DNS.
- Cons: advanced routing policies have a learning curve, DNS propagation delays, limited third-party integrations compared to dedicated DNS providers.

### Practical Tips

- Use weighted routing for canary deployments.
- Use latency routing for multi-region active-active.
- Use failover routing with health checks for disaster recovery.
- Use Route 53 Resolver for hybrid DNS between VPCs and on-premises.

### Related

- [CloudFront](./cloudfront.md) for CDN and edge delivery
- [API Gateway](./api-gateway.md) for managed API endpoints
- [VPC](./vpc.md) for private networking
