

# ZonesNel

Enable Network Error Logging reporting on your zone. (Beta) 

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**editable** | **Boolean** | Whether or not this setting can be modified for this zone (based on your Cloudflare plan level). |  [optional] [readonly] |
|**id** | [**IdEnum**](#IdEnum) | Zone setting identifier. |  |
|**modifiedOn** | **OffsetDateTime** | last time this setting was modified. |  [optional] [readonly] |
|**value** | [**ZonesNelValue**](ZonesNelValue.md) |  |  |



## Enum: IdEnum

| Name | Value |
|---- | -----|
| NEL | &quot;nel&quot; |



