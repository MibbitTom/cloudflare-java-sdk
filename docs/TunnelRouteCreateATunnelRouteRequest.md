

# TunnelRouteCreateATunnelRouteRequest


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**comment** | **String** | Optional remark describing the route. |  [optional] |
|**ipNetwork** | **String** | The private IPv4 or IPv6 range connected by the route, in CIDR notation. |  |
|**tunnelId** | **String** | UUID of the tunnel. |  [readonly] |
|**virtualNetworkId** | **Object** | UUID of the Tunnel Virtual Network this route belongs to. If no virtual networks are configured, the route is assigned to the default virtual network of the account. |  [optional] |



