

# ZeroTrustGatewayDnsResolverSettingsV4


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**ip** | **String** | IPv4 address of upstream resolver. |  |
|**port** | **Integer** | A port number to use for upstream resolver. Defaults to 53 if unspecified. |  [optional] |
|**routeThroughPrivateNetwork** | **Boolean** | Whether to connect to this resolver over a private network. Must be set when vnet_id is set. |  [optional] |
|**vnetId** | **String** | Optionally specify a virtual network for this resolver. Uses default virtual network id if omitted. |  [optional] |



