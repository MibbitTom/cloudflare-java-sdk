

# ZonesTrueClientIpHeader

Allows customer to continue to use True Client IP (Akamai feature) in the headers we send to the origin. This is limited to Enterprise Zones.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**editable** | **Boolean** | Whether or not this setting can be modified for this zone (based on your Cloudflare plan level). |  [optional] [readonly] |
|**id** | [**IdEnum**](#IdEnum) | ID of the zone setting. |  |
|**modifiedOn** | **OffsetDateTime** | last time this setting was modified. |  [optional] [readonly] |
|**value** | **ZonesTrueClientIpHeaderValue** |  |  |



## Enum: IdEnum

| Name | Value |
|---- | -----|
| TRUE_CLIENT_IP_HEADER | &quot;true_client_ip_header&quot; |



