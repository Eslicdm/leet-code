# AWS

AWS is Amazon's cloud platform. It has the broadest service catalog of the three major providers and is the default reference for most public cloud architecture.

### Domains

| Domain | Purpose |
| :-- | :-- |
| [compute/](./compute/) | EC2, ECS, EKS, Lambda, Fargate, Auto Scaling. |
| [storage/](./storage/) | S3, EBS, EFS, Glacier. |
| [database/](./database/) | RDS, Aurora, DynamoDB, ElastiCache, Redshift. |
| [network/](./network/) | VPC, CloudFront, Route 53, ALB/NLB, API Gateway. |
| [security/](./security/) | IAM, Secrets Manager, KMS, WAF, Shield. |
| [messaging/](./messaging/) | SQS, SNS, EventBridge, Kinesis, MSK. |
| [serverless/](./serverless/) | Lambda, Step Functions, App Runner. |
| [devops/](./devops/) | CloudFormation, CDK, CodeBuild, CodePipeline. |
| [monitoring/](./monitoring/) | CloudWatch, X-Ray, CloudTrail, Config. |
| [analytics/](./analytics/) | Athena, EMR, Glue, Kinesis Data Analytics. |

### Decision Path

| Need | Start with |
| :-- | :-- |
| Run a virtual machine. | [EC2](./compute/ec2.md) |
| Run containers without managing servers. | [ECS](./compute/ecs.md) or [EKS](./compute/eks.md) |
| Run code in response to events. | [Lambda](./compute/lambda.md) |
| Store objects, backups, or static assets. | [S3](./storage/s3.md) |
| Run a managed relational database. | [RDS](./database/rds.md) or [Aurora](./database/aurora.md) |
| Run a managed NoSQL key-value store. | [DynamoDB](./database/dynamodb.md) |
| Build a private network. | [VPC](./network/vpc.md) |
| Manage secrets and credentials. | [Secrets Manager](./security/secrets-manager.md) |
| Coordinate services with events. | [EventBridge](./messaging/eventbridge.md) |

### Related

- [System design knowledge base](../../system-design/README.md)
- [GCP equivalent services](../gcp/README.md)
- [Azure equivalent services](../azure/README.md)
