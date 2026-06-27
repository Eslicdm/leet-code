# Load Balancing

Load balancing distributes traffic across backend instances to improve throughput, availability, and fault tolerance.

### L4 vs L7

| Layer | Routes by | Best for |
| :-- | :-- | :-- |
| `L4` transport | IP address and TCP/UDP ports. | Very fast generic routing. |
| `L7` application | HTTP headers, cookies, paths, and content. | Smart routing and SSL termination. |

### Algorithms

| Algorithm | Use when |
| :-- | :-- |
| Round robin | Servers have similar capacity. |
| Weighted round robin | Some servers are stronger than others. |
| Least connections | Requests have variable duration or long-lived connections. |
| IP hash | Session stickiness is required. |

### Related Topics

- [Horizontal scaling](../scalability/horizontal.md)
- [Service discovery and consensus](./service-discovery-consensus.md)