

# DataZoneAnalyticsApiRequests

Breakdown of totals for requests.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**all** | **Integer** | Total number of requests served. |  [optional] |
|**cached** | **Integer** | Total number of cached requests served. |  [optional] |
|**contentType** | **Object** | A variable list of key/value pairs where the key represents the type of content served, and the value is the number of requests. |  [optional] |
|**country** | **Object** | A variable list of key/value pairs where the key is a two-digit country code and the value is the number of requests served to that country. |  [optional] |
|**httpStatus** | **Map&lt;String, Object&gt;** | Key/value pairs where the key is a HTTP status code and the value is the number of requests served with that code. |  [optional] |
|**ssl** | [**DataZoneAnalyticsApiRequestsSsl**](DataZoneAnalyticsApiRequestsSsl.md) |  |  [optional] |
|**sslProtocols** | [**DataZoneAnalyticsApiBandwidthSslProtocols**](DataZoneAnalyticsApiBandwidthSslProtocols.md) |  |  [optional] |
|**uncached** | **Integer** | Total number of requests served from the origin. |  [optional] |



