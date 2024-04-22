

# ZonesMinify

Automatically minify certain assets for your website. Refer to [Using Cloudflare Auto Minify](https://support.cloudflare.com/hc/en-us/articles/200168196) for more information.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**editable** | **Boolean** | Whether or not this setting can be modified for this zone (based on your Cloudflare plan level). |  [optional] [readonly] |
|**id** | [**IdEnum**](#IdEnum) | Zone setting identifier. |  |
|**modifiedOn** | **OffsetDateTime** | last time this setting was modified. |  [optional] [readonly] |
|**value** | [**ZonesMinifyValue**](ZonesMinifyValue.md) |  |  |



## Enum: IdEnum

| Name | Value |
|---- | -----|
| MINIFY | &quot;minify&quot; |



