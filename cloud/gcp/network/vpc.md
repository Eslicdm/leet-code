# VPC (Virtual Private Cloud)

VPC is the GCP networking primitive. It provides a private network with global subnets, firewall rules, and routing, all integrated with Google's global network.

### Key Features

| Feature | Description |
| :-- | :-- |
| Global subnets | A single VPC can span regions with subnets in any region. |
| Custom and auto modes | Custom mode for full IP control; auto mode for fast start. |
| Firewall rules | Stateful rules based on tags, service accounts, and IP ranges. |
| Routes | System routes plus custom routes for specific paths. |
| Shared VPC | Share a VPC across projects in the same organization. |
| VPC Peering | Private connectivity between two VPCs. |
| Cloud Router | Dynamic routing with BGP for hybrid connectivity. |
| Private Service Connect | Private access to managed services without public IPs. |
| Cloud NAT | Outbound internet for VMs without public IPs. |
| Cloud Interconnect and VPN | Hybrid connectivity to on-premises. |

### When to Use

- You need private networking between GCP resources.
- You need a single VPC that spans multiple regions.
- You need hybrid connectivity to on-premises networks.
- You need fine-grained firewall rules and routing.

### When Not to Use

- You only run fully managed services that do not need a custom VPC.
- You have a very simple workload and do not need a private network.

### Pricing Model

- VPC itself is free.
- Cloud NAT, Cloud Interconnect, Cloud VPN, and cross-region data transfer are billed.
- Egress to the internet is charged by destination.

### Trade-offs

- Pros: global subnets, deep integration with Google's network, fine-grained firewall rules.
- Cons: complexity grows with hybrid and multi-project setups; some features require careful planning.

### Practical Tips

- Use Shared VPC for organization-wide networking with per-project autonomy.
- Use Private Service Connect to access managed services without traversing the public internet.
- Use VPC Flow Logs for visibility and security analysis.
- Use hierarchical firewall policies for organization-wide rules.

### Related

- [Cloud Load Balancing](./cloud-load-balancing.md) for managed load balancers
- [Cloud CDN](./cloud-cdn.md) for global caching
- [Compute Engine](../compute/compute-engine.md) and [GKE](../compute/gke.md) for compute
- [Cloud SQL](../database/cloud-sql.md) for managed databases
- [System design: load balancing](../../../system-design/communication/load-balancing.md)
