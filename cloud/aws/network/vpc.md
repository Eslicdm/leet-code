# Amazon VPC

VPC (Virtual Private Cloud) is a logically isolated virtual network dedicated to your AWS account. It is the foundation for private networking, subnets, routing, and security groups in AWS.

### Key Features

| Feature | Description |
| :-- | :-- |
| Subnets | Partition a VPC into public and private subnets across AZs. |
| Route tables | Control traffic between subnets, the internet, and on-premises. |
| Internet Gateway | Allow public internet ingress and egress. |
| NAT Gateway | Allow private subnet instances to reach the internet without being reachable. |
| Security groups | Stateful instance-level firewall. |
| Network ACLs | Stateless subnet-level firewall. |
| VPC Peering | Private connectivity between two VPCs. |
| Transit Gateway | Hub-and-spoke connectivity across many VPCs and on-premises. |
| PrivateLink | Private connectivity to AWS services or your own services over the VPC network. |

### When to Use

- You need isolation between workloads (public, private, internal services).
- You need to control routing, IP ranges, and traffic flow.
- You need to connect AWS to on-premises networks through VPN or Direct Connect.

### When Not to Use

- You are running only fully managed services that abstract the network (some PaaS services do not need a custom VPC).
- The workload is a single public website with no internal services and no compliance boundary.

### Pricing Model

- VPC itself is free.
- NAT Gateway, VPC Endpoints, PrivateLink, Transit Gateway, and data transfer across AZs are billed.
- Public IPv4 addresses are billed even when attached to a running instance.

### Trade-offs

- Pros: full control over IP space, routing, and security; deep AWS integration.
- Cons: complexity grows quickly; NAT and data transfer can become significant costs.

### Practical Tips

- Plan IP ranges carefully to leave room for future VPCs and peering.
- Use multiple AZs for high availability.
- Use VPC Flow Logs for visibility and security analysis.
- Use VPC Endpoints (Gateway and Interface) to keep traffic on the AWS network and reduce data transfer costs.
- Avoid large numbers of NAT Gateways in a single AZ; consider NAT instance replacements or VPC Endpoints.

### Related

- [CloudFront](./cloudfront.md) for global content delivery
- [API Gateway](./api-gateway.md) for managed public API endpoints
- [EC2](../compute/ec2.md) and [ECS](../compute/ecs.md) for compute that lives in a VPC
- [RDS](../database/rds.md) and [Aurora](../database/aurora.md) for managed databases that live in a VPC
- [System design: load balancing](../../../system-design/communication/load-balancing.md)
