

# ZonesTls13

Enables Crypto TLS 1.3 feature for a zone.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**editable** | **Boolean** | Whether or not this setting can be modified for this zone (based on your Cloudflare plan level). |  [optional] [readonly] |
|**id** | [**IdEnum**](#IdEnum) | ID of the zone setting. |  |
|**modifiedOn** | **OffsetDateTime** | last time this setting was modified. |  [optional] [readonly] |
|**value** | **ZonesTls13Value** |  |  |



## Enum: IdEnum

| Name | Value |
|---- | -----|
| TLS_1_3 | &quot;tls_1_3&quot; |



