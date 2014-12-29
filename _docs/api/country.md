---
layout: docs
permalink: /docs/api/country/
---

# country

__Only__ the country registered with the Service are considered with these
 endpoints.

__NOTE__:

* `{countryName}` is a placeholder variable for name of the country. E.g. kenya
* `{transportName}` is a placeholder variable for a transport type. E.g. road


## summary

|URI|Http Method|Resource|
|---|:---:|-----|
|/country/{countryName}/notifications|GET|notifications|
|/country/{countryName}/{transportName}/notifications|GET|notifications|
|/country/{countryName}/routes|GET|routes information|
|/country/{countryName}/{transportName}/routes|GET|routes information|
|/country/{countryName}/transports|GET|transport types|


## specifics

### notifications

```
GET /country/{countryName}/notifications
```

Returns all notifications about the country.

<a name="res-1"></a>
Example Reponse:

```json
{
  "notifications": [
    {
      "id": 7439,
      "transport": "road",
      "route": 125,
      "type": "accident",
      "message": "Accident near Strathmore"
      "userId": 345,
      "username": "gocho",
      "userProfilePicture": "3=24k3y?2",
      "votes": 45
    }
  ]
}
```

<hr/>

```
GET /country/{countryName}/{transportName}/notifications
```

Returns all the notifications regarding the transport type in the country.

Reponse is almost similar as to the [example response](#res-1) above for
 `GET /country/{countryName}/notifications`. However, the notification
 objects will have no `"transport"` key and that __all__ will be regarding
 the specific transport, as specified in API call.

### routes

```
GET /country/{countryName}/routes
```

Returns all the routes and their information in the country.

<a name="res-2"></a>
Example Response:

```json
{
  "routes": [
    {
      "id": 1,
      "code": "125",
      "orgin": "nairobi cbd",
      "destination": "ongata rongai"
    },
    {
      "id": 2,
      "code": "1008",
      "orgin": "nairobi cbd",
      "destination": "juja"
    }
  ]
}
```

<hr/>

```
GET /country/{countryName}/{transportName}/routes
```

Returns all the routes of the transport type in the country.

Reponse is almost similar as to the [example response](#res-2) above for
 `GET /country/{countryName}/routes`. However, the routes
 objects will have no `"transport"` key and that __all__ will be regarding
 the specific transport, as specified in API call.


### transports

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
