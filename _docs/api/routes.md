---
layout: docs
permalink: /docs/api/routes/
---

## routes

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


```
GET /{countryName}/routes
```

Returns all the routes in country with name, `countryName`


```
POST /{countryName}/routes
```

Adds new routes. See [similar endpoints][add-route]


```
PATCH /{countryName}/routes
```

Updates the route in that country.


```
DELETE /{countryName}/routes
```

Removes a route from the country
