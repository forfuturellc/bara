---
layout: docs
permalink: /docs/api/transports/
---

## transports

### summary

|URI|Http Method|Resource|
|---|:---:|-----|
|/country/{countryName}/transports|GET|transport types|


__All__ the transports registered with the Service are considered with
 these endpoints.


```
GET /transports
```

Returns all the types of transports that are supported by the Service.

Example Response:

```json
{
  "transports": [
    {
      "id": 1,
      "name": "road"
    },
    {
      "id": 2,
      "name": "water"
    }
  ]
}
```


```
GET /transports/{transportName}
```

Returns all the countries supporting this kind of transport.

Example Response:

```json
{
  "countries": [
    {
      "id": 1,
      "name": "kenya"
    }
  ]
}
```


### country-specific

```
GET /country/{countryName}/transports
```

Returns all the transport types in the country.

Example Reponse:

```json
{
  "transports": [
    {
      "id": 1,
      "name": "road"
    },
    {
      "id": 2,
      "name": "railway"
    }
  ]
}
```
