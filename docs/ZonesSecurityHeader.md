

# ZonesSecurityHeader

Cloudflare security header for a zone.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**editable** | **Boolean** | Whether or not this setting can be modified for this zone (based on your Cloudflare plan level). |  [optional] [readonly] |
|**id** | [**IdEnum**](#IdEnum) | ID of the zone&#39;s security header. |  |
|**modifiedOn** | **OffsetDateTime** | last time this setting was modified. |  [optional] [readonly] |
|**value** | [**ZonesSecurityHeaderValue**](ZonesSecurityHeaderValue.md) |  |  |



## Enum: IdEnum

| Name | Value |
|---- | -----|
| SECURITY_HEADER | &quot;security_header&quot; |



