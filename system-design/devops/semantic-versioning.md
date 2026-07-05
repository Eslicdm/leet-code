# Semantic Versioning

Semantic Versioning (SemVer) is a versioning standard that communicates the nature of changes through version numbers.

### Version Format

```
MAJOR.MINOR.PATCH
  2   .  1   .  3
```

| Part | When to increment | Example |
| :-- | :-- | :-- |
| MAJOR | Breaking changes (incompatible API changes). | 1.x.x → 2.0.0 |
| MINOR | New features (backward-compatible). | 1.1.x → 1.2.0 |
| PATCH | Bug fixes (backward-compatible). | 1.2.0 → 1.2.1 |

### Pre-Release Versions

```
1.0.0-alpha.1    ← earliest, may be unstable
1.0.0-beta.1     ← feature-complete, may have bugs
1.0.0-rc.1       ← release candidate, last chance to find issues
1.0.0             ← stable release
```

| Version | Meaning | Stability |
| :-- | :-- | :-- |
| `alpha.1` | Early development, incomplete features. | Unstable, may break. |
| `beta.1` | Feature-complete, known issues may exist. | Mostly stable, testing. |
| `rc.1` | Release candidate, ready for production. | Stable, last validation. |
| `latest` | The most recent stable release. | Stable. |

### When to Use

- You publish libraries or APIs consumed by other teams.
- You want to communicate stability and breaking changes.
- You want automated tools to detect version compatibility.
- You run alpha/beta programs for new features.

### When Not to Use

- You deploy a single application with no external consumers.
- Your team doesn't use version tags for releases.
- You use date-based versioning (v2024.01.0) instead of SemVer.

### Trade-offs

- Pros: clear communication of changes, automated compatibility checks, industry standard.
- Cons: requires discipline to increment correctly, can be noisy for rapid iteration.

### Practical Tips

- Use `MAJOR` for breaking API changes that require consumer updates.
- Use `MINOR` for new features that don't break existing behavior.
- Use `PATCH` for bug fixes and security updates.
- Use pre-release tags for alpha, beta, and RC versions.
- Automate version bumping with tools like `semantic-release` or `standard-version`.

### Related

- [GitHub Flow](./github-flow.md) for simple release workflows
- [GitFlow](./gitflow.md) for structured release management
- [Environment Promotion](./environment-promotion.md) for deployment pipelines
