# Artifact Registry

Artifact Registry is a managed service for storing, managing, and securing container images and language packages. It is the recommended evolution of Container Registry.

### Key Features

| Feature | Description |
| :-- | :-- |
| Multi-format support | Docker, OCI, Maven, npm, Python, Go, and generic artifacts. |
| Repositories | Organize artifacts by team, environment, or purpose. |
| IAM and VPC-SC | Fine-grained access control and VPC Service Controls. |
| Vulnerability scanning | Automatic scanning with Container Analysis. |
| Regional and multi-region | Choose a region close to consumers for low latency. |
| Upstream and remote repositories | Pull from public registries and cache artifacts. |
| Cleanup policies | Automatically delete old or untagged artifacts. |

### When to Use

- You need a managed registry for container images and language packages.
- You want fine-grained IAM and VPC Service Controls.
- You want automatic vulnerability scanning.
- You want to cache upstream packages and images.

### When Not to Use

- You have a strong existing private registry such as JFrog Artifactory or Sonatype Nexus and do not want to manage two systems.
- You only need a small number of public images with no access control.

### Pricing Model

- Pay per GB-month of storage and per GB of egress.
- Vulnerability scanning and remote repository pulls are free for standard tiers.

### Trade-offs

- Pros: managed, multi-format, fine-grained IAM, vulnerability scanning.
- Cons: more features than Container Registry but also more concepts to learn.

### Practical Tips

- Use separate repositories for production and non-production images.
- Use cleanup policies to delete old or untagged images and control cost.
- Use remote repositories to cache public packages and images.
- Pair with Binary Authorization to enforce signed image policies.

### Related

- [Cloud Build](./google-cloud-build.md) for CI/CD
- [GKE](../compute/gke.md) and [Cloud Run](../compute/cloud-run.md) for deployment targets
- [Container Analysis](https://cloud.google.com/container-analysis) for vulnerability scanning
- [System design: resilience patterns](../../../system-design/reliability/resilience-patterns.md)
