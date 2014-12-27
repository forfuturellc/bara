---
layout: docs
permalink: /docs/api/routes/
---

## routes

### general

__All__ the routes registered with the Service are considered with these
 endpoints.


```
GET /routes
```

Returns all the routes observed by the Service.


```
POST /routes
```

Allows adding of new routes to the Service.


```
PATCH /routes
```

Allows updating of existing routes.


```
DELETE /routes
```

Allows deleting of routes.


### country-specific

These endpoints are concerned with data specific to one country. The
 country is specificied as part of the URL. It is denoted with `countryName`
 hereon.


```
GET /{countryName}/routes
```

Returns all the routes in the country.


```
POST /{countryName}/routes
```

Adds new routes to the country.


```
PATCH /{countryName}/routes
```

Updates the route in that country.


```
DELETE /{countryName}/routes
```

Removes a route from the country.
