---
layout: docs
permalink: /docs/api/notifications/
---

## Notifications

### general

__All__ notifications saved by the Service are considered with these
 endpoints.

```
GET /notifications
```

Returns all the notifications saved by the Service.


### country-specific

These endpoints are concerned with notifications specific to one country.
 The country is specificied as part of the URL. It is denoted with `countryName` hereon.

```
GET /{coutryName}/notifications
```

Returns all the notifications recorded from the country


```
POST /{countryName}/notifications
```

Adds new notifications.
