# Horizontal Scaling

Horizontal scaling, or scale-out, adds more machines to distribute traffic and failure risk.

### When to Use

- One server cannot safely handle traffic or data volume.
- You need high availability across machines or regions.
- Different services or partitions need independent scaling.

### Trade-offs

| Pros | Cons |
| :-- | :-- |
| Virtually limitless scale with commodity servers. | Requires load balancing and service discovery. |
| Better availability when instances fail. | Adds network latency and distributed failure modes. |
| Cost-effective at high scale. | Data consistency becomes more complex. |

### Common Requirements

- Stateless application servers.
- Load balancers.
- Health checks and autoscaling.
- Distributed data strategies such as replication and sharding.

### Related Topics

- [Load balancing](../communication/load-balancing.md)
- [Sharding](../database/sharding/README.md)