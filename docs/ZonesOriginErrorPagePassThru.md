

# ZonesOriginErrorPagePassThru

Cloudflare will proxy customer error pages on any 502,504 errors on origin server instead of showing a default Cloudflare error page. This does not apply to 522 errors and is limited to Enterprise Zones.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**editable** | **Boolean** | Whether or not this setting can be modified for this zone (based on your Cloudflare plan level). |  [optional] [readonly] |
|**id** | [**IdEnum**](#IdEnum) | ID of the zone setting. |  |
|**modifiedOn** | **OffsetDateTime** | last time this setting was modified. |  [optional] [readonly] |
|**value** | **ZonesOriginErrorPagePassThruValue** |  |  |



## Enum: IdEnum

| Name | Value |
|---- | -----|
| ORIGIN_ERROR_PAGE_PASS_THRU | &quot;origin_error_page_pass_thru&quot; |



