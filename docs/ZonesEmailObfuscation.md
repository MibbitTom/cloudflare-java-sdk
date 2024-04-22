

# ZonesEmailObfuscation

Encrypt email adresses on your web page from bots, while keeping them visible to humans. (https://support.cloudflare.com/hc/en-us/articles/200170016).

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**editable** | **Boolean** | Whether or not this setting can be modified for this zone (based on your Cloudflare plan level). |  [optional] [readonly] |
|**id** | [**IdEnum**](#IdEnum) | ID of the zone setting. |  |
|**modifiedOn** | **OffsetDateTime** | last time this setting was modified. |  [optional] [readonly] |
|**value** | **ZonesEmailObfuscationValue** |  |  |



## Enum: IdEnum

| Name | Value |
|---- | -----|
| EMAIL_OBFUSCATION | &quot;email_obfuscation&quot; |



