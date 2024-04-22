

# ZonesSortQueryStringForCache

Cloudflare will treat files with the same query strings as the same file in cache, regardless of the order of the query strings. This is limited to Enterprise Zones.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**editable** | **Boolean** | Whether or not this setting can be modified for this zone (based on your Cloudflare plan level). |  [optional] [readonly] |
|**id** | [**IdEnum**](#IdEnum) | ID of the zone setting. |  |
|**modifiedOn** | **OffsetDateTime** | last time this setting was modified. |  [optional] [readonly] |
|**value** | **ZonesSortQueryStringForCacheValue** |  |  |



## Enum: IdEnum

| Name | Value |
|---- | -----|
| SORT_QUERY_STRING_FOR_CACHE | &quot;sort_query_string_for_cache&quot; |



