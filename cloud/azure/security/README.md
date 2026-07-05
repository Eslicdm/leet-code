# Azure Security

Security services cover identity, secrets, key management, and threat protection.

### Decision Path

| Need | Start with |
| :-- | :-- |
| Manage identities, roles, and conditional access. | [Entra ID](./entra-id.md) |
| Store and manage secrets, keys, and certificates. | [Key Vault](./key-vault.md) |
| Protect against advanced DDoS attacks with cost protection. | [DDoS Protection](./ddos-protection.md) |
| Protect web applications from web exploits. | [Application Gateway WAF](./application-gateway-waf.md) |

### When to Use Azure Security

- You need an identity provider integrated with the Microsoft ecosystem.
- You need a managed HSM or key store with FIPS 140-2 Level 3 validation.
- You need to enforce conditional access and identity protection.

### Related

- [Azure compute services](../compute/)
- [Azure database services](../database/)
- [System design: auth](../../../system-design/security/auth.md)
