# Identity-Aware Proxy (IAP)

Identity-Aware Proxy provides identity-based access control for applications running on GCP. It sits in front of your application and enforces authentication and authorization.

### Key Features

| Feature | Description |
| :-- | :-- |
| Identity-based access | Enforce who can access which app based on identity. |
| Context-aware | Evaluate device, location, and IP context. |
| OAuth 2.0 | Integrates with Google Workspace and Cloud Identity. |
| HTTPS and TCP | Protect web apps and TCP services (SSH, RDP). |
| Session management | Configurable session duration and cookie settings. |
| Branding | Custom login page branding. |

### When to Use

- You want to protect internal web apps without a VPN.
- You need identity-based access control for GCP-hosted applications.
- You want to enforce device policies and context-aware access.
- You want to replace VPN-based access for internal tools.

### When Not to Use

- You need a network-level firewall (use [VPC firewall rules](../network/vpc.md)).
- You need a full WAF for web exploits (use [Cloud Armor](../network/cloud-armor.md)).
- Your app already has built-in authentication and you don't want to add a proxy.

### Pricing Model

- Protect web apps: free for all GCP users.
- Protect TCP services: pay per user per month for BeyondCorp Enterprise features.

### Trade-offs

- Pros: zero-trust access, no VPN needed, context-aware policies, free for web apps.
- Cons: adds a proxy hop, OAuth flow can affect UX, limited to GCP-hosted apps.

### Practical Tips

- Use IAP for internal tools like admin dashboards and monitoring UIs.
- Combine with Cloud Armor for WAF + identity-based access.
- Use brand customization for a seamless login experience.
- Use TCP forwarding for SSH and RDP access without a bastion host.

### Related

- [IAM](./iam.md) for GCP resource-level access control
- [Secret Manager](./secret-manager.md) for secrets
- [Cloud Armor](../network/cloud-armor.md) for WAF and DDoS protection
