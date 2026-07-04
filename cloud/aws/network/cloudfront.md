# Amazon CloudFront

CloudFront is the AWS content delivery network (CDN). It caches content at edge locations and delivers it with low latency to users around the world.

### Key Features

| Feature | Description |
| :-- | :-- |
| Edge locations | Hundreds of points of presence worldwide. |
| Origin types | S3 buckets, MediaStore, MediaPackage, ALB, EC2, custom origins. |
| HTTPS and TLS | Managed certificates via ACM; TLS 1.3 supported. |
| Lambda@Edge and CloudFront Functions | Run code at the edge for personalization, redirects, or auth. |
| Signed URLs and cookies | Restrict access to authorized users. |
| Origin Shield | An additional caching layer to reduce origin load. |
| Real-time logs | Stream request logs to Kinesis Data Streams. |

### When to Use

- You serve static or dynamic content to a global audience.
- You want to reduce latency and origin load.
- You need TLS termination, HTTP/2 or HTTP/3, and edge logic.
- You want to protect origins with WAF and Shield.

### When Not to Use

- The audience is in a single region close to the origin and traffic is low (CloudFront adds an extra hop).
- The workload is purely private within a VPC and does not need public delivery.

### Pricing Model

- Pay per GB of data transfer out and per HTTP/HTTPS request.
- Price varies by region and edge location.
- Free origin fetches from S3 and from AWS origins in some cases.

### Trade-offs

- Pros: global scale, deep AWS integration, edge compute, strong security.
- Cons: more complex cache invalidation, regional pricing differences.

### Practical Tips

- Use cache-control headers and versioned file names to maximize cache hit rate.
- Use Origin Shield when many CloudFront regions hit the same origin.
- Use Lambda@Edge or CloudFront Functions for cheap per-request logic at the edge.
- Use signed URLs or cookies for restricted content.

### Related

- [S3](../storage/s3.md) as a common origin
- [API Gateway](./api-gateway.md) for managed public APIs
- [VPC](./vpc.md) for private origins
- [System design: CDN and edge](../../../system-design/communication/cdn-and-edge.md)
