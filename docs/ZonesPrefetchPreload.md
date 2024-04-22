

# ZonesPrefetchPreload

Cloudflare will prefetch any URLs that are included in the response headers. This is limited to Enterprise Zones.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**editable** | **Boolean** | Whether or not this setting can be modified for this zone (based on your Cloudflare plan level). |  [optional] [readonly] |
|**id** | [**IdEnum**](#IdEnum) | ID of the zone setting. |  |
|**modifiedOn** | **OffsetDateTime** | last time this setting was modified. |  [optional] [readonly] |
|**value** | **ZonesPrefetchPreloadValue** |  |  |



## Enum: IdEnum

| Name | Value |
|---- | -----|
| PREFETCH_PRELOAD | &quot;prefetch_preload&quot; |



