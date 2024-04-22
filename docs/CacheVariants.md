

# CacheVariants

Variant support enables caching variants of images with certain file extensions in addition to the original. This only applies when the origin server sends the 'Vary: Accept' response header. If the origin server sends 'Vary: Accept' but does not serve the variant requested, the response will not be cached. This will be indicated with BYPASS cache status in the response headers.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**id** | [**IdEnum**](#IdEnum) | ID of the zone setting. |  |
|**modifiedOn** | **OffsetDateTime** | last time this setting was modified. |  [readonly] |



## Enum: IdEnum

| Name | Value |
|---- | -----|
| VARIANTS | &quot;variants&quot; |



