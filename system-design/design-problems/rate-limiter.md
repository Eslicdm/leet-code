# Rate Limiter Design

A rate limiter controls request volume per user, IP, tenant, API key, or route.

### Core Requirements

- Enforce limits accurately enough for the business case.
- Return clear errors when limits are exceeded.
- Work across multiple application instances.
- Avoid becoming the bottleneck.

### Key Decisions

| Decision | Options |
| :-- | :-- |
| Algorithm | Token bucket, leaky bucket, fixed window, sliding window. |
| Storage | In-memory, Redis, distributed counters, local plus global hybrid. |
| Scope | User, tenant, IP, API key, route, or combination. |
| Behavior | Reject, delay, degrade, or queue. |

### Related Topics

- [Rate limiting](../fault-tolerance/rate-limiting.md)
- [Load shedding](../scalability/load-shedding.md)