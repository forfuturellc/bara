---
layout: docs
permalink: /docs/api/routes/
---

## routes


### summary

|URI|Http Method|Resource|
|---|:---:|-----|
|/country/{countryName}/routes|GET|routes information|
|/country/{countryName}/{transportName}/routes|GET|routes information|


### general

```
GET /routes
```

Returns all the routes observed by the Service.

<a name="res-2"></a>
Example Response:

```json
{
  "routes": [
    {
      "id": 1,
      "code": "125",
      "pointA": "nairobi cbd",
      "pointB": "ongata rongai"
    },
    {
      "id": 2,
      "code": "1008",
      "pointA": "nairobi cbd",
      "pointB": "juja"
    }
  ]
}
```


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


### routes

```
GET /country/{countryName}/routes
```

Returns all the routes and their information in the country.



<hr/>

```
GET /country/{countryName}/{transportName}/routes
```

Returns all the routes of the transport type in the country.

Reponse is almost similar as to the [example response](#res-2) above for
 `GET /country/{countryName}/routes`. However, the routes
 objects will have no `"transport"` key and that __all__ will be regarding
 the specific transport, as specified in API call.

