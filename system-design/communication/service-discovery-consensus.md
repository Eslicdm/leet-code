# Service Discovery and Consensus

Service discovery locates healthy instances in dynamic environments. Consensus lets nodes agree on shared state.

### Service Discovery Patterns

| Pattern | How it works |
| :-- | :-- |
| Client-side discovery | The client queries a service registry and chooses an instance. |
| Server-side discovery | A router or proxy queries the registry and routes the request. |

### Distributed Coordination

Tools such as `ZooKeeper`, `etcd`, and `Consul` help nodes agree on leader election, configuration, and membership.

### Consensus Algorithms

| Algorithm | Notes |
| :-- | :-- |
| Paxos | Powerful but difficult to understand and implement. |
| Raft | Designed to be easier to understand; uses leader election, log replication, and safety rules. |

### Related Topics

- [Load balancing](./load-balancing.md)
- [Horizontal scaling](../scalability/horizontal.md)