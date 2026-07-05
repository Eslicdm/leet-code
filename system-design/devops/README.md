# Git Branching, Versioning, and Release Management

This folder covers how teams structure Git workflows, manage versions, and promote code through environments. It is a decision-oriented reference for release management patterns.

### Decision Path

| Need | Start with |
| :-- | :-- |
| Small team, continuous delivery, simple releases. | [GitHub Flow](./github-flow.md) |
| Multiple environments with scheduled releases and hotfixes. | [GitFlow](./gitflow.md) |
| High-frequency releases, CI/CD-first, minimal branching. | [Trunk-Based Development](./trunk-based.md) |
| Enterprise with release cadence and compliance requirements. | [Release Flow](./release-flow.md) |
| How to version releases and pre-releases. | [Semantic Versioning](./semantic-versioning.md) |
| How to structure dev → staging → prod pipelines. | [Environment Promotion](./environment-promotion.md) |

### Core Concepts

```
Feature branch  ──PR──>  Main  ──tag──>  v1.2.0
                          │
                          ├── deploy ──> Staging
                          │
                          └── deploy ──> Production (on tag)
```

- **Main branch**: the single source of truth; always deployable.
- **Feature branch**: short-lived branch for a single change.
- **Environment branch**: a branch that maps to a deployed environment (dev, staging, prod).
- **Tag**: an immutable pointer to a specific commit, used for releases.
- **PR/MR**: a review gate before merging into main.

### Strategy Comparison

| Strategy | Best for | Release cadence | Complexity |
| :-- | :-- | :-- | :-- |
| [GitHub Flow](./github-flow.md) | Small teams, continuous deploy. | On every merge. | Low |
| [GitFlow](./gitflow.md) | Scheduled releases, pre-release versions. | Monthly/quarterly. | High |
| [Trunk-Based](./trunk-based.md) | CI/CD-first, feature flags. | On every commit. | Medium |
| [Release Flow](./release-flow.md) | Compliance, multi-version support. | Scheduled. | Medium |

### Practical Tips

- **Keep feature branches short-lived** (hours or days, not weeks).
- **Protect main** with branch protection rules (require PR reviews, CI checks).
- **Tag every release** with semantic version tags (`v1.2.3`).
- **Automate deployment** from branches or tags using CI/CD.
- **Use feature flags** instead of long-lived branches for incomplete work.
- **Never commit directly to main** in team environments.
- **Delete merged branches** to keep the repository clean.
- **Use CHANGELOG.md** to document what changed in each version.

### Related

- [Architecture patterns](../architecture/) for system design decisions
- [Observability](../reliability/observability.md) for monitoring deployments
- [Disaster recovery](../reliability/disaster-recovery.md) for rollback strategies
