# Front Door

Azure Front Door is a global L7 load balancer with WAF, CDN, and SSL offload. It uses anycast IPs to route traffic to the nearest healthy backend.

### Key Features

| Feature | Description |
| :-- | :-- |
| Global anycast | Single anycast IP routes to the nearest healthy backend. |
| L7 routing | Path-based, header-based, and priority-based routing. |
| WAF integration | Managed WAF rules for OWASP top 10 and bot protection. |
| SSL offload | TLS termination at the edge with managed certificates. |
| CDN caching | Built-in CDN with cache rules and purge. |
| Traffic Manager integration | DNS-based routing and failover. |
| Health probes | HTTP, HTTPS, and TCP probes for backend health. |
| Origin types | App Service, AKS, Storage, VM, and custom origins. |

### When to Use

- You need a global L7 entry point with WAF and CDN.
- You need path-based or header-based routing across regions.
- You want anycast routing for global low latency.
- You want built-in WAF and bot protection.

### When Not to Use

- You only need a regional L4 load balancer (use [Load Balancer](./load-balancer.md)).
- You do not need WAF or CDN (use [Load Balancer](./load-balancer.md) or Application Gateway).
- The traffic is purely internal inside a VNet.

### Pricing Model

- Pay per routing rule, per WAF rule, per GB of data transfer, and per HTTPS request.
- Higher tiers include more features and routing rules.

### Trade-offs

- Pros: global scale, WAF, CDN, deep Azure integration.
- Cons: pricing can grow with traffic; complex routing rules can be hard to debug.

### Practical Tips

- Use WAF in prevention mode for production.
- Use path-based routing to fan out to different backends.
- Use managed certificates for custom domains.
- Use caching rules to maximize cache hit rate.

### Related

- [Load Balancer](./load-balancer.md) for L4 traffic
- [Virtual Network](./virtual-network.md) for private origins
- [App Service](../compute/app-service.md) and [AKS](../compute/aks.md) as backends
- [Blob Storage](../storage/blob-storage.md) as a static origin
- [System design: CDN and edge](../../../system-design/communication/cdn-and-edge.md)
- [System design: load balancing](../../../system-design/communication/load-balancing.md)
