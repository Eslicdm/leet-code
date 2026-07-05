# Cloud DNS

Cloud DNS is a high-performance, resilient, global DNS service. It publishes your domain names to the global DNS.

### Key Features

| Feature | Description |
| :-- | :-- |
| Managed DNS | Host zones and manage records with Google infrastructure. |
| DNSSEC | DNS Security Extensions to prevent DNS spoofing. |
| Private zones | Resolve internal names within VPC networks. |
| Peering zones | Share private DNS with other projects. |
| Split-horizon | Serve different records for internal vs external queries. |
| Logging | DNS query logging to Cloud Logging. |

### When to Use

- You need to manage DNS for domains hosted on GCP.
- You want a highly available, low-latency DNS service with global anycast.
- You need private DNS for internal VPC resources.
- You need split-horizon DNS for hybrid architectures.

### When Not to Use

- You need application-level load balancing (use [Cloud Load Balancing](./cloud-load-balancing.md)).
- You need CDN and edge caching (use [Cloud CDN](./cloud-cdn.md)).
- Your DNS provider is already integrated with your registrar and works fine.

### Pricing Model

- Pay per managed zone per month.
- Pay per million queries for public zones.
- Private zones: flat rate per zone per month.
- DNSSEC: included.

### Trade-offs

- Pros: global anycast, managed infrastructure, private zones, DNSSEC.
- Cons: DNS propagation delays, limited advanced routing compared to dedicated providers.

### Practical Tips

- Use private zones for internal service discovery.
- Use split-horizon for hybrid cloud architectures.
- Enable DNSSEC for public zones.
- Use logging to monitor query patterns.

### Related

- [Cloud Load Balancing](./cloud-load-balancing.md) for traffic distribution
- [Cloud CDN](./cloud-cdn.md) for edge caching
- [VPC](./vpc.md) for private networking
