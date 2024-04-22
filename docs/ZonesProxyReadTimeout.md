

# ZonesProxyReadTimeout

Maximum time between two read operations from origin.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**editable** | **Boolean** | Whether or not this setting can be modified for this zone (based on your Cloudflare plan level). |  [optional] [readonly] |
|**id** | [**IdEnum**](#IdEnum) | ID of the zone setting. |  |
|**modifiedOn** | **OffsetDateTime** | last time this setting was modified. |  [optional] [readonly] |
|**value** | **BigDecimal** | Value of the zone setting. Notes: Value must be between 1 and 6000 |  |



## Enum: IdEnum

| Name | Value |
|---- | -----|
| PROXY_READ_TIMEOUT | &quot;proxy_read_timeout&quot; |



