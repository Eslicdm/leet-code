# Amazon EC2

EC2 (Elastic Compute Cloud) provides resizable virtual servers in the cloud. It is the foundational compute service in AWS and the most flexible option for running custom workloads.

### Key Features

| Feature | Description |
| :-- | :-- |
| Instance types | Hundreds of instance types optimized for compute, memory, storage, GPU, or burstable workloads. |
| AMIs | Pre-built images (Amazon Linux, Ubuntu, Windows, custom) used to launch instances. |
| Auto Scaling | Add or remove instances based on metrics or schedules. |
| Elastic IPs | Static public IPv4 addresses that can be remapped between instances. |
| Placement groups | Cluster, spread, or partition placement for latency or fault isolation. |
| Spot and Savings Plans | Discounted capacity for fault-tolerant or predictable workloads. |

### When to Use

- You need full control over the operating system, runtime, and installed software.
- You are migrating an existing application that expects a VM.
- You need a specific instance type such as GPU, high memory, or bare metal.
- You want to combine EC2 with Auto Scaling Groups and Elastic Load Balancers for horizontal scaling.

### When Not to Use

- The workload is a stateless HTTP API that can run in a serverless container (use [Lambda](./lambda.md), [ECS](./ecs.md), or [EKS](./eks.md)).
- The workload is event-driven and short-lived (use [Lambda](./lambda.md)).
- You do not want to manage patching, capacity, or scaling (use a managed service like [RDS](../database/rds.md) or [Aurora](../database/aurora.md)).

### Pricing Model

| Model | Use when |
| :-- | :-- |
| On-Demand | Short-term, unpredictable workloads. |
| Reserved Instances / Savings Plans | Steady-state workloads with a 1 or 3 year commitment. |
| Spot Instances | Fault-tolerant, interruption-tolerant batch or stateless workloads. |
| Dedicated Hosts | Compliance or licensing requirements for dedicated physical servers. |
| Capacity Blocks | Reserved GPU capacity for short-term ML or rendering jobs. |

### Trade-offs

- Pros: maximum flexibility, broadest instance catalog, deep AWS integration.
- Cons: you manage patching, scaling, and high availability yourself unless you pair it with Auto Scaling and load balancing.

### Practical Tips

- Use Auto Scaling Groups and an Elastic Load Balancer for high availability and horizontal scaling.
- Use launch templates instead of launch configurations.
- Use SSM Session Manager instead of opening SSH ports to the internet.
- Use IMDSv2 to mitigate SSRF-based credential theft.
- Tag instances consistently for cost allocation and automation.

### Related

- [AWS compute services overview](./README.md)
- [ECS](./ecs.md) and [EKS](./eks.md) for managed containers
- [Lambda](./lambda.md) for serverless functions
- [AWS storage services](../storage/)
- [System design: vertical scaling](../../../system-design/scalability/vertical.md)
- [System design: horizontal scaling](../../../system-design/scalability/horizontal.md)
