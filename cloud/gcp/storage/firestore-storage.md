# Cloud Storage for Firestore

Cloud Storage for Firestore provides managed object storage tightly integrated with Firestore. It stores blobs alongside Firestore documents and is accessed through the Firebase SDKs.

### Key Features

| Feature | Description |
| :-- | :-- |
| Firebase SDK integration | Upload and download directly from web and mobile clients. |
| Security rules | Control access with the same rules as Firestore. |
| Automatic CDN | Public content served through Google's edge network. |
| File metadata | Content type, size, and custom metadata. |
| Resumable uploads | Resume interrupted uploads. |

### When to Use

- You store user-uploaded files (images, videos, documents) in a Firebase or Firestore app.
- You want to control file access with security rules alongside Firestore data.
- You need a simple blob store for mobile and web clients.

### When Not to Use

- You need a general-purpose object store for GCP workloads (use [Cloud Storage](./cloud-storage.md)).
- You need POSIX-compatible file systems (use [Filestore](./filestore.md)).
- You need long-term archival storage (use Cloud Storage with Archive class).

### Pricing Model

- Pay per GB of storage and per GB of download.
- Bandwidth to Firebase SDKs is free.

### Trade-offs

- Pros: Firebase SDK integration, security rules, simple for mobile/web.
- Cons: not suitable for backend-to-backend storage, limited features compared to full Cloud Storage.

### Practical Tips

- Use for user-generated content in Firebase apps.
- Set security rules to control uploads and downloads.
- Use resumable uploads for large files on unreliable connections.

### Related

- [Cloud Storage](./cloud-storage.md) for general-purpose object storage
- [Firestore](../database/firestore.md) for document data
