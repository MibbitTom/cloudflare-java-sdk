

# MagicGreTunnel


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**cloudflareGreEndpoint** | **String** | The IP address assigned to the Cloudflare side of the GRE tunnel. |  |
|**createdOn** | **OffsetDateTime** | The date and time the tunnel was created. |  [optional] [readonly] |
|**customerGreEndpoint** | **String** | The IP address assigned to the customer side of the GRE tunnel. |  |
|**description** | **String** | An optional description of the GRE tunnel. |  [optional] |
|**healthCheck** | [**MagicHealthCheck**](MagicHealthCheck.md) |  |  [optional] |
|**id** | **String** | Tunnel identifier tag. |  [optional] [readonly] |
|**interfaceAddress** | **String** | A 31-bit prefix (/31 in CIDR notation) supporting two hosts, one for each side of the tunnel. Select the subnet from the following private IP space: 10.0.0.0–10.255.255.255, 172.16.0.0–172.31.255.255, 192.168.0.0–192.168.255.255. |  |
|**modifiedOn** | **OffsetDateTime** | The date and time the tunnel was last modified. |  [optional] [readonly] |
|**mtu** | **Integer** | Maximum Transmission Unit (MTU) in bytes for the GRE tunnel. The minimum value is 576. |  [optional] |
|**name** | **String** | The name of the tunnel. The name cannot contain spaces or special characters, must be 15 characters or less, and cannot share a name with another GRE tunnel. |  |
|**ttl** | **Integer** | Time To Live (TTL) in number of hops of the GRE tunnel. |  [optional] |



