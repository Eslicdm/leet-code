# Cloud Load Balancing

Cloud Load Balancing is a managed service for global and regional load balancers at L4 and L7. It uses a single anycast IP that routes to the nearest healthy backend.

### Key Features

| Feature | Description |
| :-- | :-- |
| Global anycast IP | A single IP that routes to the nearest healthy backend. |
| HTTP(S) Load Balancing | L7 load balancing with SSL offload, routing rules, and CDN integration. |
| TCP/UDP Load Balancing | L4 passthrough for non-HTTP protocols. |
| Internal Load Balancing | L4 or L7 inside a VPC. |
| Traffic management | Weighted traffic splitting for canary or blue-green deployments. |
| Cloud Armor integration | WAF and DDoS protection. |
| Cloud CDN integration | Built-in CDN for HTTP(S) load balancers. |
| Backend types | Instance groups, NEGs (Network Endpoint Groups), buckets, serverless NEGs. |

### When to Use

- You need a managed L4 or L7 load balancer with global scale.
- You need a single anycast IP that routes to the nearest healthy region.
- You need weighted traffic splitting for safe rollouts.
- You want tight integration with Cloud Armor and Cloud CDN.

### When Not to Use

- The traffic is internal-only and you want to avoid a managed load balancer (consider Internal Load Balancing only when you need managed HA).
- You need a Layer 4 load balancer on a non-GCP network.

### Pricing Model

- Pay per forwarding rule hour and per GB of processed data.
- HTTP(S) Load Balancing and global load balancers have higher pricing than regional ones.

### Trade-offs

- Pros: global scale, managed HA, deep integration with Cloud CDN and Cloud Armor.
- Cons: pricing can grow with traffic; more concepts than a simple regional LB.

### Practical Tips

- Use HTTP(S) Load Balancing with Cloud CDN for global web applications.
- Use traffic splitting for canary releases.
- Use backend services with custom health checks.
- Pair with Cloud Armor for WAF and DDoS protection.

### Related

- [VPC](./vpc.md) for networking
- [Cloud CDN](./cloud-cdn.md) for caching
- [Compute Engine](../compute/compute-engine.md) and [GKE](../compute/gke.md) as backends
- [Cloud Run](../compute/cloud-run.md) via serverless NEGs
- [System design: load balancing](../../../system-design/communication/load-balancing.md)
