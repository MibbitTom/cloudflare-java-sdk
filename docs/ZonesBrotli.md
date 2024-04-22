

# ZonesBrotli

When the client requesting an asset supports the Brotli compression algorithm, Cloudflare will serve a Brotli compressed version of the asset.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**editable** | **Boolean** | Whether or not this setting can be modified for this zone (based on your Cloudflare plan level). |  [optional] [readonly] |
|**id** | [**IdEnum**](#IdEnum) | ID of the zone setting. |  |
|**modifiedOn** | **OffsetDateTime** | last time this setting was modified. |  [optional] [readonly] |
|**value** | **ZonesBrotliValue** |  |  |



## Enum: IdEnum

| Name | Value |
|---- | -----|
| BROTLI | &quot;brotli&quot; |



