# Release Flow

Release Flow is a hybrid approach used by teams that need release cadence with compliance.

```
main ───────────────────────────────────────> (prod)
  │
  ├── release/2024.01 ──tag──> v2024.01.0
  ├── release/2024.02 ──tag──> v2024.02.0
  └── release/2024.03 ──tag──> v2024.03.0
```

### How It Works

1. Feature branches merge into `main` continuously.
2. At release time, create a release branch from `main`.
3. Only bug fixes and security patches go into the release branch.
4. Tag the release and deploy.
5. Cherry-pick critical fixes back to `main` if needed.

### When to Use

- You release on a fixed schedule (sprints, quarters).
- You need audit trails and compliance for each release.
- You need to support multiple versions simultaneously.
- You have long-lived products with SLA obligations.

### When Not to Use

- You deploy continuously (multiple times per day).
- Your team is small and doesn't need release branches.
- You want the simplest possible workflow.

### Trade-offs

- Pros: compliance-friendly, supports multiple versions, clear release history.
- Cons: branch maintenance overhead, cherry-pick complexity, slower delivery.

### Related

- [GitFlow](./gitflow.md) for more structured workflows
- [GitHub Flow](./github-flow.md) for simpler workflows
- [Semantic Versioning](./semantic-versioning.md) for versioning
- [Environment Promotion](./environment-promotion.md) for pipeline design
