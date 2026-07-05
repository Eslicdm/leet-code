# Application Gateway

Application Gateway is a managed L7 load balancer for web traffic. It provides SSL termination, cookie-based session affinity, URL path-based routing, and integrated WAF.

### Key Features

| Feature | Description |
| :-- | :-- |
| L7 load balancing | HTTP/HTTPS traffic routing. |
| URL path routing | Route traffic based on URL path. |
| SSL termination | Offload TLS from backend servers. |
| Cookie affinity | Sticky sessions via cookies. |
| WAF integration | Built-in web application firewall with OWASP rules. |
| Health probes | Monitor backend health. |
| Multiple backends | Route to VMs, containers, App Service, or IP addresses. |

### When to Use

- You need L7 load balancing with URL-based routing.
- You need SSL termination for backend services.
- You need WAF protection for web applications.
- You need cookie-based session affinity.

### When Not to Use

- You need L4 load balancing (use [Load Balancer](./load-balancer.md)).
- You need global traffic routing (use [Front Door](./front-door.md)).
- You need simple health-check-based failover (use [Traffic Manager](https://learn.microsoft.com/en-us/azure/traffic-manager/)).

### Pricing Model

- Pay per gateway-hour and per data processed.
- WAF: additional per-policy fee.
- SKUs: Standard, Standard_v2, and WAF_v2.

### Trade-offs

- Pros: L7 routing, integrated WAF, SSL offloading, URL-based routing.
- Cons: regional service only, not global, SKUs have different feature sets, cost at high throughput.

### Practical Tips

- Use URL path routing to split traffic between services.
- Use WAF_v2 for the latest WAF features.
- Use health probes to avoid routing to unhealthy backends.
- Use SSL offloading to simplify backend certificate management.

### Related

- [Load Balancer](./load-balancer.md) for L4 load balancing
- [Front Door](./front-door.md) for global L7 with WAF
- [Azure DNS](./azure-dns.md) for DNS hosting
- [System design: load balancing](../../../system-design/communication/load-balancing.md)
