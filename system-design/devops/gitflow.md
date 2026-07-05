# GitFlow

GitFlow is a structured branching strategy with dedicated branches for features, releases, and hotfixes.

```
main ───────────────────────────────────────> (prod)
  │                                    │
  └── release/v1.2 ──tag──> v1.2.0 ───┘
        │
  develop ────────────────────────────────> (staging)
    │         │         │
    ├── feat/ ├── feat/ ├── feat/
    │         │         │
    └── hotfix/v1.2.1 ──tag──> v1.2.1 ──> main
```

### Branches

| Branch | Purpose | Lifetime |
| :-- | :-- | :-- |
| `main` | Production code. Only receives release merges and hotfixes. | Permanent |
| `develop` | Integration branch. Staging environment. | Permanent |
| `feature/*` | New work. Created from `develop`, merged back via PR. | Short-lived |
| `release/*` | Stabilization for a release. Freeze features, bug fixes only. | Weeks |
| `hotfix/*` | Emergency fixes for production. Branch from `main`. | Days |

### How It Works

1. Feature branches are created from `develop`.
2. Features merge back into `develop` via PR.
3. When ready for release, create `release/v1.2` from `develop`.
4. Stabilize on the release branch, then merge to `main` and tag.
5. Hotfixes branch from `main`, fix, tag, and merge back to both `main` and `develop`.

### When to Use

- You have scheduled releases (monthly, quarterly).
- You need pre-release versions (alpha, beta, RC) on release branches.
- You need hotfix workflows that don't disrupt ongoing development.
- Multiple teams work on different features simultaneously.

### When Not to Use

- You deploy continuously (multiple times per day).
- Your team finds the branch overhead too heavy.
- You want the simplest possible workflow.

### Trade-offs

- Pros: structured, supports pre-release and hotfix, clear separation of concerns.
- Cons: heavy branch management, slower delivery, merge conflicts between develop and main.

### Related

- [GitHub Flow](./github-flow.md) for simpler workflows
- [Release Flow](./release-flow.md) for enterprise compliance
- [Semantic Versioning](./semantic-versioning.md) for versioning
- [Environment Promotion](./environment-promotion.md) for pipeline design
