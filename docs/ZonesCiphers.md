

# ZonesCiphers

An allowlist of ciphers for TLS termination. These ciphers must be in the BoringSSL format.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**editable** | **Boolean** | Whether or not this setting can be modified for this zone (based on your Cloudflare plan level). |  [optional] [readonly] |
|**id** | [**IdEnum**](#IdEnum) | ID of the zone setting. |  |
|**modifiedOn** | **OffsetDateTime** | last time this setting was modified. |  [optional] [readonly] |
|**value** | **Set&lt;String&gt;** | Value of the zone setting. |  |



## Enum: IdEnum

| Name | Value |
|---- | -----|
| CIPHERS | &quot;ciphers&quot; |



