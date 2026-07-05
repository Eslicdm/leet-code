# DDoS Protection

Azure DDoS Protection provides enhanced mitigation for DDoS attacks against Azure resources. It is available in two tiers: Basic (automatic) and Standard (advanced).

### Key Features

| Feature | Description |
| :-- | :-- |
| DDoS Basic | Automatic network-level DDoS mitigation for all Azure resources. |
| DDoS Standard | Advanced mitigation with ML-based profiling and cost protection. |
| Adaptive tuning | ML-based automatic tuning of mitigation thresholds. |
| Attack analytics | Detailed reports and telemetry during attacks. |
| Cost protection | Credits for scale-out costs during attacks. |
| Integration | Works with Front Door, Application Gateway, and public IPs. |

### When to Use

- You need advanced DDoS protection beyond the automatic Basic tier.
- You want cost protection against scale-out charges during attacks.
- You need detailed attack analytics and telemetry.
- You need adaptive tuning based on your application's traffic patterns.

### When Not to Use

- You only need basic DDoS protection (Basic is automatic for all Azure resources).
- You need WAF protection for web exploits (use [Application Gateway WAF](./application-gateway-waf.md)).
- Your application is not exposed to the internet.

### Pricing Model

- DDoS Basic: free for all Azure resources.
- DDoS Standard: flat monthly fee per virtual network.

### Trade-offs

- Pros: automatic mitigation, cost protection, attack analytics, ML-based tuning.
- Cons: Standard has a monthly fee, not a substitute for application-level WAF.

### Practical Tips

- Enable DDoS Standard for production virtual networks.
- Combine with WAF for layered protection.
- Use attack analytics to understand and respond to incidents.
- Review cost protection terms before an attack occurs.

### Related

- [Application Gateway WAF](./application-gateway-waf.md) for web application firewall
- [Application Gateway](../network/application-gateway.md) for L7 load balancing
- [Front Door](../network/front-door.md) for global entry point
