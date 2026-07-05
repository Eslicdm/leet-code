# Azure DNS

Azure DNS is a hosting service for DNS domains. It provides name resolution using Microsoft's global network of DNS servers.

### Key Features

| Feature | Description |
| :-- | :-- |
| Managed DNS | Host zones and manage records with Azure infrastructure. |
| DNSSEC | DNS Security Extensions for zone signing. |
| Private DNS | Resolve internal names within virtual networks. |
| Alias records | Point records to Azure resources (Traffic Manager, CDN, public IPs). |
| Record types | A, AAAA, CAA, CNAME, MX, NS, PTR, SRV, TXT. |
| Logging | Query logging to Azure Monitor. |

### When to Use

- You need to manage DNS for domains hosted on Azure.
- You want alias records that automatically update when Azure resources change.
- You need private DNS for internal service discovery in virtual networks.
- You want a highly available, anycast DNS service.

### When Not to Use

- You need application-level load balancing (use [Application Gateway](./application-gateway.md)).
- You need CDN and edge caching (use [Front Door](./front-door.md)).
- Your DNS provider is already integrated with your registrar and works fine.

### Pricing Model

- Pay per hosted zone per month.
- Pay per million queries.

### Trade-offs

- Pros: managed infrastructure, alias records, private DNS, deep Azure integration.
- Cons: DNS propagation delays, limited advanced routing compared to dedicated providers.

### Practical Tips

- Use alias records for Azure resources to avoid manual DNS updates.
- Use Private DNS zones for internal service discovery.
- Enable DNSSEC for public zones.
- Use Azure Monitor to log and audit DNS queries.

### Related

- [Application Gateway](./application-gateway.md) for L7 load balancing
- [Front Door](./front-door.md) for global entry point
- [Virtual Network](./virtual-network.md) for private networking
