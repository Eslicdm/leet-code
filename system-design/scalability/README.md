# Scalability

Scalability decisions define how a system handles growth in traffic, data, users, and operational complexity.

Use this folder to decide whether to scale up, scale out, shed load, or plan capacity before growth becomes an incident.

### Decision Path

| Question | Start with |
| :-- | :-- |
| Can one stronger machine handle the workload safely and cheaply? | [Vertical scaling](./vertical.md) |
| Do you need more instances, regional distribution, or independent failure domains? | [Horizontal scaling](./horizontal.md) |
| Is the system overloaded right now? | [Load shedding](./load-shedding.md) |
| Are you estimating future traffic, storage, or cost? | [Capacity planning](./capacity-planning.md) |

### Related Topics

- [Performance metrics](../fundamentals/performance-metrics.md)
- [Availability and reliability](../fundamentals/availability-reliability.md)
- [Load balancing](../communication/load-balancing.md)