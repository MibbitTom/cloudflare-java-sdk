

# ZonesDevelopmentMode

Development Mode temporarily allows you to enter development mode for your websites if you need to make changes to your site. This will bypass Cloudflare's accelerated cache and slow down your site, but is useful if you are making changes to cacheable content (like images, css, or JavaScript) and would like to see those changes right away. Once entered, development mode will last for 3 hours and then automatically toggle off.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**editable** | **Boolean** | Whether or not this setting can be modified for this zone (based on your Cloudflare plan level). |  [optional] [readonly] |
|**id** | [**IdEnum**](#IdEnum) | ID of the zone setting. |  |
|**modifiedOn** | **OffsetDateTime** | last time this setting was modified. |  [optional] [readonly] |
|**value** | **ZonesDevelopmentModeValue** |  |  |
|**timeRemaining** | **BigDecimal** | Value of the zone setting. Notes: The interval (in seconds) from when development mode expires (positive integer) or last expired (negative integer) for the domain. If development mode has never been enabled, this value is false. |  [optional] [readonly] |



## Enum: IdEnum

| Name | Value |
|---- | -----|
| DEVELOPMENT_MODE | &quot;development_mode&quot; |



