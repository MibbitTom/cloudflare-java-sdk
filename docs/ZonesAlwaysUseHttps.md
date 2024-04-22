

# ZonesAlwaysUseHttps

Reply to all requests for URLs that use \"http\" with a 301 redirect to the equivalent \"https\" URL. If you only want to redirect for a subset of requests, consider creating an \"Always use HTTPS\" page rule.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**editable** | **Boolean** | Whether or not this setting can be modified for this zone (based on your Cloudflare plan level). |  [optional] [readonly] |
|**id** | [**IdEnum**](#IdEnum) | ID of the zone setting. |  |
|**modifiedOn** | **OffsetDateTime** | last time this setting was modified. |  [optional] [readonly] |
|**value** | **ZonesAlwaysUseHttpsValue** |  |  |



## Enum: IdEnum

| Name | Value |
|---- | -----|
| ALWAYS_USE_HTTPS | &quot;always_use_https&quot; |



