---
layout: docs
permalink: /docs/api/
---

## Design Considerations:

* __easy to use__: to make the API easy to use, several endpoints have
 been made available to access resources. Some of these endpoints
 may be used similarly with minimal change. For example,
 `GET /notifications` may be used to access notifications recorded in a
 certain country the same way `GET /{countryName}/notifications` may
 have been used.

* __cost__. Accessing "low-level" endpoints such as `GET /notifications`
 may be more expensive than `GET /{countryName}/notifications`. Cost
 incurred in retrieving and computing the data from such endpoints may
 be circumvented by using "high-level" endpoints.

* __location-specific__. For consumers, the data useful to them would be
 that in or near their geographical location. For now `countryName` is
 as specific as it can get. For example, `GET /kenya/routes` would be
 useful to people living in Kenya.

* __data readability__. The response bodies are returned in JSON format
 to allow the data to be easily read by both machines and humans. The
 data may be used in client applications such as [naijav][naijav].


## conventions


* `{countryName}` is a placeholder variable for name of the country. E.g. 
 kenya
* `{transportName}` is a placeholder variable for a transport type. E.g. road


## conclusion

Please note that the API is under disussion and heavy development. It is
 best to assume that anything and everything will change.


[naijav]:https://github.com/forfuture-dev/naijav
