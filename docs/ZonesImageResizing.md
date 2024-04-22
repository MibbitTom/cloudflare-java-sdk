

# ZonesImageResizing

Image Resizing provides on-demand resizing, conversion and optimisation for images served through Cloudflare's network. Refer to the [Image Resizing documentation](https://developers.cloudflare.com/images/) for more information.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**editable** | **Boolean** | Whether or not this setting can be modified for this zone (based on your Cloudflare plan level). |  [optional] [readonly] |
|**id** | [**IdEnum**](#IdEnum) | ID of the zone setting. |  |
|**modifiedOn** | **OffsetDateTime** | last time this setting was modified. |  [optional] [readonly] |
|**value** | **ZonesImageResizingValue** |  |  |



## Enum: IdEnum

| Name | Value |
|---- | -----|
| IMAGE_RESIZING | &quot;image_resizing&quot; |



