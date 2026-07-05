# Azure Database

Database services cover managed relational, NoSQL, and analytics engines.

### Decision Path

| Need | Start with |
| :-- | :-- |
| Run a managed SQL Server database. | [SQL Database](./sql-database.md) |
| Run a globally distributed multi-model NoSQL store. | [Cosmos DB](./cosmos-db.md) |
| Cache data in memory for sub-millisecond reads. | [Azure Cache for Redis](./azure-cache-for-redis.md) |

### When to Use Azure Database

- You want Microsoft to handle patching, backups, and high availability.
- You need a globally distributed database with multiple consistency models.
- You can accept Azure-specific APIs, Entra ID, and pricing.

### Related

- [Azure compute services](../compute/)
- [Azure storage services](../storage/)
- [System design: SQL vs NoSQL](../../../system-design/database/sql-vs-nosql.md)
- [System design: consistency models](../../../system-design/database/consistency-models.md)
