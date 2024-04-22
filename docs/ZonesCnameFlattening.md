

# ZonesCnameFlattening

Whether or not cname flattening is on.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**editable** | **Boolean** | Whether or not this setting can be modified for this zone (based on your Cloudflare plan level). |  [optional] [readonly] |
|**id** | [**IdEnum**](#IdEnum) | How to flatten the cname destination. |  |
|**modifiedOn** | **OffsetDateTime** | last time this setting was modified. |  [optional] [readonly] |
|**value** | **ZonesCnameFlatteningValue** |  |  |



## Enum: IdEnum

| Name | Value |
|---- | -----|
| CNAME_FLATTENING | &quot;cname_flattening&quot; |



