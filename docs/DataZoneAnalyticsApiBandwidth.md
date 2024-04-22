

# DataZoneAnalyticsApiBandwidth

Breakdown of totals for bandwidth in the form of bytes.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**all** | **Integer** | The total number of bytes served within the time frame. |  [optional] |
|**cached** | **Integer** | The number of bytes that were cached (and served) by Cloudflare. |  [optional] |
|**contentType** | **Object** | A variable list of key/value pairs where the key represents the type of content served, and the value is the number in bytes served. |  [optional] |
|**country** | **Object** | A variable list of key/value pairs where the key is a two-digit country code and the value is the number of bytes served to that country. |  [optional] |
|**ssl** | [**DataZoneAnalyticsApiBandwidthSsl**](DataZoneAnalyticsApiBandwidthSsl.md) |  |  [optional] |
|**sslProtocols** | [**DataZoneAnalyticsApiBandwidthSslProtocols**](DataZoneAnalyticsApiBandwidthSslProtocols.md) |  |  [optional] |
|**uncached** | **Integer** | The number of bytes that were fetched and served from the origin server. |  [optional] |



