# Observability

Observability helps operators understand system behavior from outputs such as logs, metrics, traces, and alerts.

### Signals

| Signal | Answers |
| :-- | :-- |
| Logs | What happened in one component? |
| Metrics | Is the system healthy over time? |
| Traces | Where did one request spend time across services? |
| Alerts | Does a human need to act now? |

### When to Use

- Any production system with user-facing reliability requirements.
- Distributed systems where requests cross service boundaries.
- Systems with SLOs, incident response, or on-call ownership.

### Trade-offs

- More telemetry improves debugging but increases cost and noise.
- Alerts should be tied to user impact, not every internal fluctuation.
- Trace and log context must include correlation IDs.

### Related Topics

- [Availability and reliability](../fundamentals/availability-reliability.md)
- [Microservices](../architecture/monolith-vs-microservices.md)