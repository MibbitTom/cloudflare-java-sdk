

# ZonesTlsClientAuth

TLS Client Auth requires Cloudflare to connect to your origin server using a client certificate (Enterprise Only).

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**editable** | **Boolean** | Whether or not this setting can be modified for this zone (based on your Cloudflare plan level). |  [optional] [readonly] |
|**id** | [**IdEnum**](#IdEnum) | ID of the zone setting. |  |
|**modifiedOn** | **OffsetDateTime** | last time this setting was modified. |  [optional] [readonly] |
|**value** | **ZonesTlsClientAuthValue** |  |  |



## Enum: IdEnum

| Name | Value |
|---- | -----|
| TLS_CLIENT_AUTH | &quot;tls_client_auth&quot; |



