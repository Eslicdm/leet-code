# Cloud CDN

Cloud CDN caches content at Google's edge locations to reduce latency and origin load. It integrates directly with HTTP(S) Load Balancing.

### Key Features

| Feature | Description |
| :-- | :-- |
| Edge caching | Cache at Google edge locations worldwide. |
| HTTP(S) Load Balancing integration | Turn on with a single setting on a backend service. |
| Cache modes | Use origin cache-control headers, or override with custom TTLs. |
| Cache invalidation | Invalidate individual URLs or all cached content. |
| Signed URLs | Restrict access to authorized users. |
| Tiered caching | Use a parent cache hierarchy to reduce origin load. |
| Negative caching | Cache error responses for short periods to absorb spikes. |

### When to Use

- You serve static or cacheable dynamic content to a global audience.
- You want to reduce latency and origin load.
- You already use HTTP(S) Load Balancing and want one-click CDN.

### When Not to Use

- The audience is in a single region close to the origin and traffic is low.
- The content is highly dynamic and never cacheable.

### Pricing Model

- Pay per GB of cache egress and per HTTP/HTTPS request.
- Pricing varies by region and edge location.
- No charge for cache fills from GCP origins in some cases.

### Trade-offs

- Pros: simple, integrated with HTTP(S) Load Balancing, global scale.
- Cons: cache invalidation is manual; regional pricing differences.

### Practical Tips

- Use cache-control headers and versioned file names to maximize cache hit rate.
- Use negative caching to absorb error responses.
- Use signed URLs for restricted content.
- Combine with Cloud Armor for WAF and DDoS protection.

### Related

- [Cloud Load Balancing](./cloud-load-balancing.md) for the L7 entry point
- [Cloud Storage](../storage/cloud-storage.md) as a common origin
- [VPC](./vpc.md) for private origins
- [System design: CDN and edge](../../../system-design/communication/cdn-and-edge.md)
