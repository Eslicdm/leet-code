# Amazon EKS

EKS (Elastic Kubernetes Service) is a managed Kubernetes control plane. You run worker nodes on EC2, Fargate, or AWS-managed node pools and integrate with the AWS ecosystem through standard Kubernetes primitives and AWS controllers.

### Key Features

| Feature | Description |
| :-- | :-- |
| Managed control plane | Highly available Kubernetes API across multiple AZs. |
| Managed node groups | EC2 instances provisioned and lifecycle-managed by EKS. |
| Fargate profiles | Run pods on Fargate with no node management. |
| EKS add-ons | Managed versions of CoreDNS, kube-proxy, VPC CNI, and more. |
| IAM Roles for Service Accounts (IRSA) | Per-pod IAM credentials. |
| EKS Anywhere | Run EKS on your own infrastructure for hybrid deployments. |

### When to Use

- You need Kubernetes APIs, custom operators, or portability across clouds.
- Your team already operates Kubernetes and wants a managed control plane.
- You need a rich ecosystem of operators, ingress controllers, and CRDs.

### When Not to Use

- You do not need Kubernetes-specific features (use [ECS](./ecs.md) or [Lambda](./lambda.md)).
- Your team has no Kubernetes operational experience and the workload is simple.
- You want the lowest possible control plane cost (EKS charges per cluster hour).

### Pricing Model

- Per-cluster control plane charge (hourly).
- You pay for the worker compute: EC2, Fargate, or managed node groups.
- Optional: EKS Anywhere, extended support, and data plane add-ons.

### Trade-offs

- Pros: standard Kubernetes APIs, portability, large ecosystem, strong AWS integration via controllers.
- Cons: Kubernetes operational complexity, control plane fee, more concepts than ECS.

### Practical Tips

- Use IRSA for pod-level AWS access.
- Use the AWS Load Balancer Controller for managed L4 and L7 ingress.
- Use Karpenter for just-in-time node provisioning.
- Enable control plane logging to CloudWatch Logs.

### Related

- [ECS](./ecs.md) for a simpler AWS-native orchestrator
- [EC2](./ec2.md) for the underlying VM
- [Lambda](./lambda.md) for event-driven functions
- [System design: monolith vs microservices](../../../system-design/architecture/monolith-vs-microservices.md)
