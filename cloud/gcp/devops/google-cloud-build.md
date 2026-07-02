# Cloud Build

Cloud Build is a managed CI/CD service that builds, tests, and deploys your code on Google Cloud infrastructure. It supports Docker, Bazel, Maven, Gradle, npm, and custom build steps.

### Key Features

| Feature | Description |
| :-- | :-- |
| Build steps | Containerized build steps defined in a `cloudbuild.yaml` file. |
| Build triggers | Triggers on Git commits, tags, pull requests, or manual invocations. |
| Private pools | Run builds in a private VPC for security or networking needs. |
| Container builds | Native Docker support, including multi-stage builds. |
| Artifact Registry integration | Push images to Artifact Registry or Container Registry. |
| Cloud Deploy integration | Continuous delivery to GKE, Cloud Run, and GKE Enterprise. |
| Build insights | Build history, logs, and timing in Cloud Console. |
| Substitution variables | Dynamic values in build steps. |

### When to Use

- You need managed CI/CD that runs on Google infrastructure.
- You build container images and deploy to GKE, Cloud Run, or GKE Enterprise.
- You want deep integration with Artifact Registry, Cloud Deploy, and Cloud Source Repositories.
- You want private build pools inside a VPC for security.

### When Not to Use

- You have a strong existing CI/CD platform such as GitHub Actions, GitLab CI, or Jenkins and do not want to manage two systems.
- You need a self-hosted build environment (use private pools in Cloud Build if you need VPC access).

### Pricing Model

- Free tier includes 120 build-minutes per day.
- Pay per build-minute beyond the free tier.
- Pay for network egress and storage.

### Trade-offs

- Pros: managed, fast, deep GCP integration, private pools for VPC builds.
- Cons: GCP-specific; some advanced build patterns are easier in Jenkins or GitHub Actions.

### Practical Tips

- Use build steps as small, reusable container images.
- Use private pools for builds that need VPC access.
- Use Cloud Build + Cloud Deploy for end-to-end CI/CD to GKE and Cloud Run.
- Store build artifacts in Artifact Registry for traceability and security.

### Related

- [Artifact Registry](./artifact-registry.md) for image and package storage
- [Infrastructure Manager](./infra-manager.md) for infrastructure as code
- [GKE](../compute/gke.md) and [Cloud Run](../compute/cloud-run.md) for deployment targets
- [System design: resilience patterns](../../../system-design/reliability/resilience-patterns.md)
