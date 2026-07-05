# Trunk-Based Development

Everyone commits to main (or a short-lived branch) multiple times per day. Releases are cut from main.

```
main ──────●──●──●──●──●──●──●──●──●──────> (prod)
             │  │     │  │     │
             └──┘     └──┘     └──┘  (short-lived branches, < 1 day)
```

### How It Works

1. Developers commit to `main` or use very short-lived branches (< 1 day).
2. Feature flags control what is visible in production.
3. Releases are tagged commits on `main`.
4. CI/CD deploys every commit to a staging environment.
5. Production deployments happen on tag or on a schedule.

### When to Use

- You practice continuous delivery (deploy multiple times per day).
- Your team is experienced with feature flags.
- You want to minimize merge conflicts and integration pain.
- You have strong CI/CD and automated testing.

### When Not to Use

- Your team is not comfortable with feature flags.
- You need long-lived pre-release branches.
- You have compliance requirements that need release branches.

### Trade-offs

- Pros: fastest delivery, minimal merge conflicts, forces good CI/CD practices.
- Cons: requires feature flags, discipline, and strong automated testing.

### Related

- [GitHub Flow](./github-flow.md) for slightly more structure
- [GitFlow](./gitflow.md) for scheduled releases
- [Semantic Versioning](./semantic-versioning.md) for versioning
- [Environment Promotion](./environment-promotion.md) for pipeline design
