

# ZonesZoneSettingsResponseCollectionAllOfResult


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**editable** | **Boolean** | Whether or not this setting can be modified for this zone (based on your Cloudflare plan level). |  [optional] [readonly] |
|**id** | [**IdEnum**](#IdEnum) | ID of the zone setting. |  |
|**modifiedOn** | **OffsetDateTime** | last time this setting was modified. |  [optional] [readonly] |
|**value** | **ZonesWebsocketsValue** |  |  |
|**timeRemaining** | **BigDecimal** | Value of the zone setting. Notes: The interval (in seconds) from when development mode expires (positive integer) or last expired (negative integer) for the domain. If development mode has never been enabled, this value is false. |  [optional] [readonly] |
|**enabled** | **Boolean** | ssl-recommender enrollment setting. |  [optional] |



## Enum: IdEnum

| Name | Value |
|---- | -----|
| WEBSOCKETS | &quot;websockets&quot; |



