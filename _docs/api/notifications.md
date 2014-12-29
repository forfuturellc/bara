---
layout: docs
permalink: /docs/api/notifications/
---

## Notifications


## summary of APIs

|URI|Http Method|Resource|
|---|:---:|-----|
|/country/{countryName}/notifications|GET|notifications|
|/country/{countryName}/{transportName}/notifications|GET|notifications|

### general

```
GET /notifications
```

Returns all the notifications saved by the Service.

<a name="res-1"></a>
Example Reponse:

```json
{
  "notifications": [
    {
      "id": 7439,
      "country": "kenya",
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


### country-specific

```
GET /country/{countryName}/notifications
```

Returns all notifications about the country.

Reponse is almost similar as to the [example response](#res-1) above for
 `GET /country/{countryName}/notifications`. However, the notification
 objects will have no `"country"` key and that __all__ will be regarding
 the specific country, as specified in API call.


### country and transport specific

```
GET /country/{countryName}/{transportName}/notifications
```

Returns all the notifications regarding the transport type in the country.

Reponse is almost similar as to the [example response](#res-1) above for
 `GET /country/{countryName}/notifications`. However, the notification
 objects will have no `"transport"` key and that __all__ will be regarding
 the specific transport, as specified in API call.
