# Entra ID (Azure Active Directory)

Entra ID is the Azure identity and access management service. It is the Azure equivalent of AWS IAM plus a full identity provider, with deep integration across the Microsoft ecosystem.

### Key Features

| Feature | Description |
| :-- | :-- |
| Users and groups | Identities for people and groups, with Entra ID Connect for hybrid sync. |
| Applications | Register applications and configure single sign-on. |
| Conditional Access | Policies based on user, device, location, and risk. |
| Multi-factor authentication | Built-in MFA with multiple verification methods. |
| Managed identities | Identities for Azure resources that need to authenticate to other services. |
| Roles | Built-in and custom roles for Azure resource access. |
| External Identities | B2B collaboration and B2C customer identity. |
| Identity Protection | Risk-based detection and remediation. |
| Privileged Identity Management | Just-in-time elevation for privileged roles. |
| Workload identities | Identities for apps, services, and automation. |

### When to Use

- You need an identity provider for users, applications, and services in Azure.
- You are deeply integrated with the Microsoft ecosystem (Office 365, Windows, .NET).
- You need conditional access, MFA, and identity protection.
- You need B2B collaboration or B2C customer identity.

### When Not to Use

- You are on AWS or GCP and do not need Microsoft-specific features (use Cognito, IAM Identity Center, or Google IAM).
- You need a simple internal user store with no external identity requirements.

### Pricing Model

- Free tier with basic features.
- Premium tiers add Conditional Access, Identity Protection, and PIM.
- Pay per user per month for premium features.

### Trade-offs

- Pros: deep Microsoft integration, strong identity features, hybrid support.
- Cons: complex for small organizations; some features require premium licensing.

### Practical Tips

- Use managed identities for Azure resources to avoid storing secrets.
- Use Conditional Access for any user with administrative roles.
- Use PIM for just-in-time elevation instead of standing admin access.
- Use Entra ID groups for role assignments instead of assigning roles to individual users.

### Related

- [Key Vault](./key-vault.md) for secret storage with Entra ID auth
- [App Service](../compute/app-service.md) and [Functions](../compute/functions.md) for application auth
- [AKS](../compute/aks.md) for Entra ID-backed cluster access
- [System design: auth](../../../system-design/security/auth.md)
