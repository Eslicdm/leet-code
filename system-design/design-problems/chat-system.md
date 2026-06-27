# Chat System Design

A chat system provides real-time messaging, delivery state, ordering, and presence across devices.

### Core Requirements

- Send and receive messages in near real time.
- Persist message history.
- Track online presence and delivery/read receipts.
- Support one-to-one and group conversations.

### Key Decisions

| Decision | Options |
| :-- | :-- |
| Realtime protocol | WebSockets, long polling, push notifications. |
| Ordering | Per-conversation sequence numbers or timestamps. |
| Storage | Message table, wide-column store, or log-based storage. |
| Delivery | At-most-once, at-least-once with idempotency, or exactly-once-like UX. |

### Related Topics

- [API protocols](../communication/api-protocols.md)
- [Messaging](../communication/messaging.md)
- [Consistency models](../database/consistency-models.md)