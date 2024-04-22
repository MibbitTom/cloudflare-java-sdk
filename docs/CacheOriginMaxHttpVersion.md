

# CacheOriginMaxHttpVersion

Origin Max HTTP Setting Version sets the highest HTTP version Cloudflare will attempt to use with your origin. This setting allows Cloudflare to make HTTP/2 requests to your origin. (Refer to [Enable HTTP/2 to Origin](https://developers.cloudflare.com/cache/how-to/enable-http2-to-origin/), for more information.). The default value is \"2\" for all plan types except ENT where it is \"1\"

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**id** | [**IdEnum**](#IdEnum) | Value of the zone setting. |  |
|**modifiedOn** | **OffsetDateTime** | last time this setting was modified. |  [readonly] |



## Enum: IdEnum

| Name | Value |
|---- | -----|
| ORIGIN_MAX_HTTP_VERSION | &quot;origin_max_http_version&quot; |



