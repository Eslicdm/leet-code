# Authentication and Authorization

Authentication verifies who a user or service is. Authorization decides what that identity can do.

### Decision Table

| Concept | Purpose |
| :-- | :-- |
| Authentication | Prove identity with passwords, sessions, tokens, SSO, or certificates. |
| Authorization | Enforce permissions with roles, policies, scopes, or ACLs. |
| OAuth2 | Delegate access without sharing user credentials. |
| JWT | Carry signed claims in a compact token. |
| Session | Store server-side login state referenced by a cookie. |

### When to Use

- Any user-facing system.
- Service-to-service calls need identity and permissions.
- APIs expose sensitive data or actions.

### Trade-offs

- Sessions are easy to revoke but require server-side state.
- JWTs scale well but are harder to revoke before expiration.
- Authorization should be enforced server-side, close to protected resources.

### Related Topics

- [API gateway](../communication/proxies-api-gateway.md)
- [Rate limiter design](../design-problems/rate-limiter.md)