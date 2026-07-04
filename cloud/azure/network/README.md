# Azure Network

Network services cover private networks, load balancing, content delivery, and DNS.

### Decision Path

| Need | Start with |
| :-- | :-- |
| Build a private network with subnets, routing, and NSGs. | [Virtual Network](./virtual-network.md) |
| Distribute traffic with a managed L4 load balancer. | [Load Balancer](./load-balancer.md) |
| Route global traffic with a managed L7 entry point and WAF. | [Front Door](./front-door.md) |

### When to Use Azure Network

- You need isolation between workloads in different regions.
- You need a global anycast entry point with WAF and bot protection.
- You want tight integration with Entra ID and private endpoints.

### Related

- [Azure compute services](../compute/)
- [Azure security services](../security/)
- [System design: load balancing](../../../system-design/communication/load-balancing.md)
