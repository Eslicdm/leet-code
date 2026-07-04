# Virtual Network

Virtual Network (VNet) is the Azure networking primitive. It provides a private network with subnets, routing, and security, integrated with Entra ID, Private Link, and Azure Firewall.

### Key Features

| Feature | Description |
| :-- | :-- |
| Address space | Define private IP address ranges for the VNet. |
| Subnets | Partition a VNet across regions and zones. |
| Network Security Groups (NSGs) | Stateful rules for inbound and outbound traffic. |
| Application Security Groups (ASGs) | Group VMs by workload and apply NSG rules. |
| Service Endpoints | Optimize routing to specific Azure services. |
| Private Endpoints | Private access to Azure PaaS services. |
| VNet Peering | Private connectivity between two VNets. |
| Virtual WAN | Hub-and-spoke connectivity across regions. |
| VPN Gateway and ExpressRoute | Hybrid connectivity to on-premises. |
| Azure Firewall | Managed network firewall with threat intelligence. |

### When to Use

- You need private networking between Azure resources.
- You need to connect Azure to on-premises networks through VPN or ExpressRoute.
- You need fine-grained NSG rules, ASGs, and Private Endpoints.

### When Not to Use

- You only run fully managed services that do not need a custom VNet.
- You have a very simple workload and do not need private networking.

### Pricing Model

- VNet itself is free.
- VPN Gateway, ExpressRoute, Azure Firewall, and data transfer across regions are billed.
- Public IPv4 addresses are billed.

### Trade-offs

- Pros: deep Azure integration, NSG and ASG, Private Endpoints, ExpressRoute for hybrid.
- Cons: complexity grows with hybrid and multi-VNet setups; some features require careful planning.

### Practical Tips

- Plan IP ranges carefully to leave room for future VNets and peering.
- Use NSGs and ASGs for layered security.
- Use Private Endpoints to access PaaS services privately.
- Use Azure Firewall or a third-party NVA for centralized egress filtering.

### Related

- [Load Balancer](./load-balancer.md) for L4 traffic distribution
- [Front Door](./front-door.md) for global L7 traffic
- [Virtual Machines](../compute/virtual-machines.md) and [AKS](../compute/aks.md) for compute
- [SQL Database](../database/sql-database.md) and [Cosmos DB](../database/cosmos-db.md) for managed databases
- [System design: load balancing](../../../system-design/communication/load-balancing.md)
