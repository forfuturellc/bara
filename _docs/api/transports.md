---
layout: docs
permalink: /docs/api/transports/
---

## transports

__All__ the transports registered with the Service are considered with
 these endpoints.


```
GET /transports
```

Returns all the types of transports that are supported by the Service.


```
POST /transports
```

Allows adding of new types of transports to be supported by the Service.


```
DELETE /transports
```

Allows removal of types of transports the Service can no longer support.


```
GET /{transportName}
```

Returns all the countries supporting this kind of transport.
