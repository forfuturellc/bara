---
layout: docs
permalink: /docs/api/countries/
---

## countries

### summary

|URI|Http Method|Resource|
|---|:---:|-----|
|/country/{countryName}/notifications|GET|notifications|
|/country/{countryName}/{transportName}/notifications|GET|notifications|

__All__ the routes registered with the Service are considered with these
 endpoints.

```
GET /countries
```

Returns all the countries observed by the Service.


```
POST /countries
```

Allows adding of countries observed by the Service.
