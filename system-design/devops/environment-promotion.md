# Environment Promotion

Environment promotion defines how code moves through deployment stages from development to production.

### Standard Promotion Pipeline

```
Feature Branch → Dev → Staging → Production
```

| Environment | Purpose | Trigger | Typical URL |
| :-- | :-- | :-- | :-- |
| Dev | Active development, integration testing. | Push to dev branch. | `dev.example.com` |
| Staging | Pre-production validation, QA, UAT. | Merge to main. | `staging.example.com` |
| Production | Live traffic, real users. | Create a tag or merge to prod. | `example.com` |

### Common Patterns

**Branch-based promotion:**
- `dev` branch → deploys to dev.
- `main` branch → deploys to staging.
- Tag on `main` → deploys to production.

**PR-based promotion:**
- PR to `dev` → runs CI, deploys to dev.
- PR to `main` → runs CI, deploys to staging.
- Tag on `main` → deploys to production.

**Feature branch preview:**
- Every PR gets its own preview environment.
- Merged code goes to dev, then staging, then prod.

### Your Workflow

1. Push to `dev` branch → deploys to dev environment.
2. Open PR and merge to `main` → deploys to staging.
3. Create a tag on `main` → deploys to production.

This is a simplified GitFlow variant: `dev` is the integration branch, `main` is the release branch, and tags trigger production deployments.

### Environment Best Practices

- **Mirror production** in staging as closely as possible.
- **Use infrastructure-as-code** to keep environments consistent.
- **Run automated tests** at each promotion gate.
- **Use feature flags** to decouple deployment from release.
- **Monitor each environment** independently with alerts.
- **Use secrets management** (not hardcoded config) per environment.

### When to Use

- You have multiple environments (dev, staging, prod).
- You want controlled rollouts with validation at each stage.
- You need to test in production-like environments before releasing.

### When Not to Use

- You deploy directly to production (use trunk-based with feature flags).
- You have a single environment (use simpler workflows).
- You want to skip staging for speed (use continuous deployment).

### Trade-offs

- Pros: controlled releases, validation at each stage, reduced risk.
- Cons: slower delivery, more infrastructure to maintain, environment drift risk.

### Related

- [GitHub Flow](./github-flow.md) for simple promotion
- [GitFlow](./gitflow.md) for structured promotion
- [Trunk-Based Development](./trunk-based.md) for CI/CD-first promotion
- [Semantic Versioning](./semantic-versioning.md) for version tagging
- [Disaster recovery](../reliability/disaster-recovery.md) for rollback strategies
