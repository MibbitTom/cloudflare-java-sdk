

# IpAddressManagementAddressMapsUpdateAddressMapRequest


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**defaultSni** | **String** | If you have legacy TLS clients which do not send the TLS server name indicator, then you can specify one default SNI on the map. If Cloudflare receives a TLS handshake from a client without an SNI, it will respond with the default SNI on those IPs. The default SNI can be any valid zone or subdomain owned by the account. |  [optional] |
|**description** | **String** | An optional description field which may be used to describe the types of IPs or zones on the map. |  [optional] |
|**enabled** | **Boolean** | Whether the Address Map is enabled or not. Cloudflare&#39;s DNS will not respond with IP addresses on an Address Map until the map is enabled. |  [optional] |



