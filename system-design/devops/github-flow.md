# GitHub Flow

GitHub Flow is the simplest branching strategy. One main branch, feature branches, and PRs.

```
main ───────────────────────────────────────> (prod)
  │
  ├── feature/login  ──PR──> main
  ├── feature/search ──PR──> main
  └── feature/pay    ──PR──> main
```

### How It Works

1. Create a feature branch from `main`.
2. Commit changes and open a PR.
3. Code review and CI checks run on the PR.
4. Merge to `main` after approval.
5. Deploy `main` to staging, then to production.

### When to Use

- Small teams with continuous deployment.
- You deploy `main` directly to production.
- You want minimal branch management overhead.
- Your release cycle is fast (multiple deploys per day).

### When Not to Use

- You need long-lived release branches or pre-release versions.
- You have compliance requirements that need release branches.
- You need hotfix workflows that don't disrupt ongoing development.

### Trade-offs

- Pros: simple, minimal overhead, fast iterations, easy to understand.
- Cons: limited release management, no dedicated hotfix branch, no pre-release versioning.

### Related

- [GitFlow](./gitflow.md) for structured releases
- [Trunk-Based Development](./trunk-based.md) for CI/CD-first teams
- [Environment Promotion](./environment-promotion.md) for pipeline design
- [Semantic Versioning](./semantic-versioning.md) for versioning
