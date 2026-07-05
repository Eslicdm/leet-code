# GCP Network

Network services cover private networks, load balancing, content delivery, and DNS.

### Decision Path

| Need | Start with |
| :-- | :-- |
| Build a private network with subnets, routing, and firewall rules. | [VPC](./vpc.md) |
| Distribute traffic across regions with managed L4 and L7 load balancers. | [Cloud Load Balancing](./cloud-load-balancing.md) |
| Cache and deliver content at the edge. | [Cloud CDN](./cloud-cdn.md) |
| Manage DNS for domains and route traffic globally. | [Cloud DNS](./cloud-dns.md) |
| Protect web applications from exploits and DDoS. | [Cloud Armor](./cloud-armor.md) |

### When to Use GCP Network

- You need isolation between workloads in different regions.
- You need a single global anycast IP that routes to the nearest healthy backend.
- You want CDN integration with HTTP(S) load balancing.

### Related

- [GCP compute services](../compute/)
- [GCP security services](../security/)
- [System design: load balancing](../../../system-design/communication/load-balancing.md)
