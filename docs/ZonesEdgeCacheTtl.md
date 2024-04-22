

# ZonesEdgeCacheTtl

Time (in seconds) that a resource will be ensured to remain on Cloudflare's cache servers.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**editable** | **Boolean** | Whether or not this setting can be modified for this zone (based on your Cloudflare plan level). |  [optional] [readonly] |
|**id** | [**IdEnum**](#IdEnum) | ID of the zone setting. |  |
|**modifiedOn** | **OffsetDateTime** | last time this setting was modified. |  [optional] [readonly] |
|**value** | **ZonesEdgeCacheTtlValue** |  |  |



## Enum: IdEnum

| Name | Value |
|---- | -----|
| EDGE_CACHE_TTL | &quot;edge_cache_ttl&quot; |



