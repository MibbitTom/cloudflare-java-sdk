

# AddressingFullResponseAllOfResult


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**canDelete** | **Boolean** | If set to false, then the Address Map cannot be deleted via API. This is true for Cloudflare-managed maps. |  [optional] [readonly] |
|**canModifyIps** | **Boolean** | If set to false, then the IPs on the Address Map cannot be modified via the API. This is true for Cloudflare-managed maps. |  [optional] [readonly] |
|**createdAt** | **OffsetDateTime** |  |  [optional] [readonly] |
|**defaultSni** | **String** | If you have legacy TLS clients which do not send the TLS server name indicator, then you can specify one default SNI on the map. If Cloudflare receives a TLS handshake from a client without an SNI, it will respond with the default SNI on those IPs. The default SNI can be any valid zone or subdomain owned by the account. |  [optional] |
|**description** | **String** | An optional description field which may be used to describe the types of IPs or zones on the map. |  [optional] |
|**enabled** | **Boolean** | Whether the Address Map is enabled or not. Cloudflare&#39;s DNS will not respond with IP addresses on an Address Map until the map is enabled. |  [optional] |
|**id** | **String** | Identifier |  [optional] [readonly] |
|**modifiedAt** | **OffsetDateTime** |  |  [optional] [readonly] |
|**ips** | [**List&lt;AddressingAddressMapsIp&gt;**](AddressingAddressMapsIp.md) | The set of IPs on the Address Map. |  [optional] |
|**memberships** | [**List&lt;AddressingAddressMapsMembership&gt;**](AddressingAddressMapsMembership.md) | Zones and Accounts which will be assigned IPs on this Address Map. A zone membership will take priority over an account membership. |  [optional] |



