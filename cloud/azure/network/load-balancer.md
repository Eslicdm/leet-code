# Load Balancer

Azure Load Balancer is a managed L4 load balancer for distributing traffic across VMs and services. It supports both public and internal load balancing with high throughput.

### Key Features

| Feature | Description |
| :-- | :-- |
| L4 load balancing | TCP, UDP, and ports-based load balancing. |
| Public and internal | Internet-facing or private load balancing. |
| Health probes | TCP, HTTP, and HTTPS probes for backend health. |
| HA ports | Load balance all ports simultaneously for network virtual appliances. |
| Outbound rules | Explicit outbound connectivity for backend instances. |
| Cross-region | Global load balancing with Global Standard tier. |
| Integration | Works with VM scale sets, AKS, and any reachable backend. |

### When to Use

- You need an L4 load balancer for non-HTTP traffic.
- You need high throughput and low latency for TCP or UDP workloads.
- You need internal load balancing inside a VNet.

### When Not to Use

- The traffic is HTTP or HTTPS and you need L7 features such as path-based routing or WAF (use [Front Door](./front-door.md) or Application Gateway).
- You need global anycast with a single IP (use [Front Door](./front-door.md)).

### Pricing Model

- Pay per load balancer hour and per GB of processed data.
- Standard tier is the production tier; Basic tier has fewer features.

### Trade-offs

- Pros: high throughput, low latency, integrates with VM scale sets and AKS.
- Cons: L4 only; no HTTP-aware features such as path-based routing or WAF.

### Practical Tips

- Use Standard tier for production.
- Use health probes that match the application protocol.
- Use HA ports for network virtual appliances.
- Combine with [Front Door](./front-door.md) or Application Gateway for L7 features.

### Related

- [Virtual Network](./virtual-network.md) for networking
- [Front Door](./front-door.md) for global L7 traffic
- [Virtual Machines](../compute/virtual-machines.md) and [AKS](../compute/aks.md) as backends
- [System design: load balancing](../../../system-design/communication/load-balancing.md)
