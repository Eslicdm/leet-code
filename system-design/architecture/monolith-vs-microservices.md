# Monolith vs. Microservices

This page helps decide whether to deploy one unified application or split the system into independently deployable services.

| Option | Best fit | Main risk |
| :-- | :-- | :-- |
| Monolith | Small teams, early products, simple domains | Scaling and release coordination bottlenecks |
| Microservices | Large domains, autonomous teams, independently scaled components | Operational complexity and distributed data consistency |

### Monolithic Architecture

A monolithic architecture packages UI, business logic, and data access as one deployable unit.

```
+---------------------------------------------+
|             Monolithic App                  |
|  [User Interface]  [Business Logic]  [DBA]  |
+---------------------------------------------+
                         |
                         v
              +--------------------+
              | Single Database    |
              +--------------------+
```

#### When to use

- Early-stage startups validating product-market fit.
- Small teams, often fewer than 10-15 engineers.
- Simple applications with limited domain complexity.
- Workloads where local calls and single-database transactions are more valuable than independent deployment.

#### Trade-offs

- Benefits: simple deployment, low cognitive overhead, high local-call performance, straightforward ACID transactions.
- Costs: the whole app must scale together, build and coordination friction grows with team size, one bug can affect the full application, and technology choices are tightly coupled.

### Microservices Architecture

Microservices split an application into small, loosely coupled services. Each service owns a business capability and often owns its own database.

```
                 [ API Gateway ]
                 /      |                      v       v       v
         +---------+ +---------+ +---------+
         | Order   | | User    | | Payment |
         | Service | | Service | | Service |
         +---------+ +---------+ +---------+
             |           |           |
             v           v           v
         +---------+ +---------+ +---------+
         | OrderDB | | UserDB  | | PayDB   |
         +---------+ +---------+ +---------+
```

#### When to use

- Large, complex systems with distinct business domains.
- Engineering organizations with multiple autonomous teams.
- Systems that require granular scaling or independent release cycles.

#### Trade-offs

- Benefits: independent deployability, granular scaling, fault isolation, and polyglot implementation choices.
- Costs: orchestration, service discovery, centralized logging, tracing, network latency, data duplication, and distributed transactions.

### Related Topics

- [Saga and distributed transactions](./saga-and-distributed-transactions.md)
- [Observability](../reliability/observability.md)
