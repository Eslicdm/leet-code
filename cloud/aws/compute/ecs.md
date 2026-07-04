# Amazon ECS

ECS (Elastic Container Service) is a fully managed container orchestration service that runs Docker containers on EC2 instances or on AWS-managed serverless infrastructure (Fargate).

### Key Features

| Feature | Description |
| :-- | :-- |
| Tasks and services | Long-running or one-off containers managed as ECS services. |
| Fargate launch type | Serverless compute for containers with no EC2 management. |
| EC2 launch type | Containers on EC2 instances you manage. |
| Service discovery | Integrated with Route 53 and AWS Cloud Map. |
| IAM task roles | Per-task IAM credentials for accessing AWS APIs. |
| Capacity providers | Mix Fargate and EC2 capacity with cost and availability rules. |

### When to Use

- You are running Docker containers and want deep AWS integration.
- You want a managed orchestrator without the operational cost of Kubernetes.
- You want a simple path to scale from a few services to thousands of tasks.

### When Not to Use

- You need Kubernetes APIs, custom operators, or portability across clouds (use [EKS](./eks.md)).
- Your workload is a single function triggered by an event (use [Lambda](./lambda.md)).
- You want a fully serverless container platform with scale-to-zero and built-in HTTPS (consider [GCP Cloud Run](../../gcp/compute/cloud-run.md) or [Azure Container Apps](../../azure/compute/container-apps.md)).

### Pricing Model

- ECS itself has no control plane charge.
- You pay for the underlying compute: EC2 instances (EC2 launch type) or Fargate vCPU and GB-hour (Fargate launch type).
- You pay for related AWS resources such as load balancers, logs, and EBS volumes.

### Trade-offs

- Pros: simple, AWS-native, deep IAM integration, no control plane fee.
- Cons: AWS-specific, fewer ecosystem tools than Kubernetes.

### Practical Tips

- Use Fargate for most new workloads to avoid managing EC2 capacity.
- Use ECS Exec for debugging running containers without opening ports.
- Use task IAM roles instead of baking credentials into images.
- Use image scanning in ECR to catch vulnerabilities at build time.

### Related

- [EC2](./ec2.md) for the underlying VM
- [EKS](./eks.md) if you need Kubernetes APIs
- [Lambda](./lambda.md) for event-driven functions
- [System design: monolith vs microservices](../../../system-design/architecture/monolith-vs-microservices.md)
