# Service Discovery and Consensus

Service discovery locates healthy instances in dynamic environments. Consensus lets distributed nodes agree on a single value or ordering even when some nodes crash or messages are lost.

### Why These Exist

In a microservices deployment, instances come and go. IPs change, containers restart, autoscaling adds and removes capacity. Two problems follow:

- How does a caller find a healthy instance of a service right now?
- How do nodes agree on shared state, like who is the leader, what is the current configuration, or which nodes are alive?

Service discovery solves the first. Consensus solves the second.

### Service Discovery

A service registry stores the current set of healthy instances. Instances register themselves or are registered by an external process. Callers consult the registry to know where to send traffic.

```
+--------------------+        +---------------------+
|  Service Instance  |  --->  |  Service Registry   |
|   (registers)      |        |  (Eureka, Consul,   |
+--------------------+        |   etcd, Zookeeper)   |
                              +---------------------+
                                        ^
                                        |  query
+--------------------+                  |
|     Caller         |  ----------------+
| (client or proxy)  |
+--------------------+
```

#### Client-Side Discovery

```
[Service A] ---> [Client library: look up instances] ---> [Registry]
                                   |
                                   v
                          Picks one instance
                          (round robin, random, latency)
                                   |
                                   v
                            [Service B instance]
```

- The caller (or its client library) queries the registry directly.
- The client chooses an instance using a load-balancing strategy.
- Common with `Eureka` plus `Spring Cloud`, `Consul` plus smart clients, or `Kubernetes` plus client-side DNS or service mesh sidecars.

**Trade-offs**

- Pros: removes a network hop, gives the client fine-grained control over balancing and retries, works well with service meshes.
- Cons: every language or runtime needs a registry client, and balancing logic is duplicated in every service.

#### Server-Side Discovery

```
[Service A] ---> [Load Balancer / Proxy] ---> [Registry] ---> picks instance ---> [Service B instance]
```

- The caller sends traffic to a stable endpoint, like a load balancer or sidecar proxy.
- The proxy or load balancer queries the registry and routes the request.
- Common with `AWS ALB`, `NGINX` plus `Consul Template`, `Kubernetes Services`, and `Envoy`.

**Trade-offs**

- Pros: clients stay simple, registry lookups and balancing logic live in one infrastructure component, polyglot services all work the same way.
- Cons: adds a hop, the proxy or load balancer must be highly available and scaled.

#### When to Use

| Situation | Pick |
| :-- | :-- |
| Homogeneous runtime, smart clients, service mesh sidecars. | Client-side discovery. |
| Polyglot services, minimal client logic, cloud-native ingress. | Server-side discovery. |
| Dynamic environments with frequent restarts. | Either, paired with health checks and short TTLs. |
| Stable, long-lived instances with rare change. | Static configuration or DNS can replace a registry. |

### Distributed Coordination

Some state must be shared across nodes: who is the leader, what is the current configuration value, which nodes are members. Coordination services store that state with strong consistency, even when nodes fail.

Tools commonly used:

| Tool | Notes |
| :-- | :-- |
| `ZooKeeper` | Mature coordination service using Zab, its own consensus protocol. |
| `etcd` | Coordination store used as the backing store for Kubernetes; uses Raft. |
| `Consul` | Service discovery plus health checks plus a Raft-based key-value store. |
| `Chubby` | Google's lock service; inspiration for ZooKeeper. |

These tools are not just databases. They expose primitives like leader election, distributed locks, watches, and ephemeral nodes that change the design of a system.

### What Consensus Means

Consensus is the problem of getting several independent nodes to agree on a single value or a single ordering of values, even when some nodes fail or messages are dropped or reordered.

Formally, a consensus protocol must satisfy:

- Agreement: no two correct nodes decide different values.
- Validity: the decided value was proposed by some node.
- Termination: every correct node eventually decides.
- Integrity: each node decides at most one value.

In practice this means: even if a few nodes crash or the network partitions, the surviving nodes still converge on a single answer, and they do not lose data they already accepted.

This matters because many distributed features cannot work without it:

- Leader election: only one node is leader at a time.
- Replicated logs: every replica applies writes in the same order.
- Distributed locks: only one client holds the lock.
- Cluster membership: every node sees the same set of alive members.

### Consensus Algorithms

| Algorithm | Notes |
| :-- | :-- |
| Paxos | The classic consensus family, very general, famously hard to understand and to implement correctly. |
| Raft | Designed to be understandable. Splits consensus into leader election, log replication, and safety. Used by `etcd`, `Consul`, and `CockroachDB`. |
| Zab | Used by `ZooKeeper`. Similar goals to Raft with a focus on primary-backup ordering. |
| Viewstamped Replication | Another understandable alternative; influenced Raft. |

#### How Raft Works

Raft keeps one leader at any time. The leader replicates a log of commands to the followers. If the leader disappears, the remaining nodes run a new election.

```
         Leader (term 5)
        /      |      \
       v       v       v
   Follower Follower Follower
       ^       |
       |---- election timeout ----> Candidate
```

- Each node has a current term, like a logical clock that increases on every election.
- Followers become candidates if they do not hear from the leader within a timeout.
- A candidate wins an election by receiving votes from a majority of the cluster.
- The new leader appends commands to its log and replicates them. A command is committed once it is stored on a majority of nodes.
- If two candidates split the vote, a new election starts after a randomized timeout.

Raft is not magic. It still requires a majority of nodes to be reachable. If a majority is lost, the cluster stops accepting writes. That is the cost of strong consistency.

### When to Use Consensus

- You need a single leader for a partition of work.
- You need a strongly consistent key-value store across multiple nodes.
- You need distributed locks or barriers.
- You need cluster membership with a stable view.

### When Not to Use Consensus

- The system can tolerate weak or eventual consistency. A gossip-based or last-writer-wins store is simpler.
- The cluster is small and rarely changes. A single coordinator may be enough.
- The use case is best served by an eventually consistent database like DynamoDB or Cassandra.

### Trade-offs

- Strong consistency costs latency and availability during partitions.
- Consensus systems are operationally complex: deploy odd-numbered clusters, monitor leader health, plan for rebalancing.
- Many use cases only need lightweight coordination: a Redis lock, a database row with a unique index, or a Kubernetes lease can replace a full consensus round.

### Related Topics

- [Load balancing](./load-balancing.md)
- [Horizontal scaling](../scalability/horizontal.md)
- [CAP and PACELC](../fundamentals/cap-pacelc.md)
- [Consistency models](../database/consistency-models.md)
