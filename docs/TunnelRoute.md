

# TunnelRoute


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**comment** | **String** | Optional remark describing the route. |  [optional] |
|**createdAt** | **Object** | Timestamp of when the route was created. |  [optional] |
|**deletedAt** | **OffsetDateTime** | Timestamp of when the route was deleted. If &#x60;null&#x60;, the route has not been deleted. |  [optional] [readonly] |
|**id** | **String** | UUID of the route. |  [optional] [readonly] |
|**network** | **String** | The private IPv4 or IPv6 range connected by the route, in CIDR notation. |  [optional] |
|**tunnelId** | **Object** | UUID of the Cloudflare Tunnel serving the route. |  [optional] |
|**virtualNetworkId** | **Object** | UUID of the Tunnel Virtual Network this route belongs to. If no virtual networks are configured, the route is assigned to the default virtual network of the account. |  [optional] |



