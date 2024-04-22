

# MagicInterconnect


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**coloName** | **String** | The name of the interconnect. The name cannot share a name with other tunnels. |  [optional] |
|**createdOn** | **OffsetDateTime** | The date and time the tunnel was created. |  [optional] [readonly] |
|**description** | **String** | An optional description of the interconnect. |  [optional] |
|**gre** | [**MagicGre**](MagicGre.md) |  |  [optional] |
|**healthCheck** | [**MagicSchemasHealthCheck**](MagicSchemasHealthCheck.md) |  |  [optional] |
|**id** | **String** | Tunnel identifier tag. |  [optional] [readonly] |
|**interfaceAddress** | **String** | A 31-bit prefix (/31 in CIDR notation) supporting two hosts, one for each side of the tunnel. Select the subnet from the following private IP space: 10.0.0.0–10.255.255.255, 172.16.0.0–172.31.255.255, 192.168.0.0–192.168.255.255. |  [optional] |
|**modifiedOn** | **OffsetDateTime** | The date and time the tunnel was last modified. |  [optional] [readonly] |
|**mtu** | **Integer** | The Maximum Transmission Unit (MTU) in bytes for the interconnect. The minimum value is 576. |  [optional] |
|**name** | **String** | The name of the interconnect. The name cannot share a name with other tunnels. |  [optional] |



