

# MagicComponentsSchemasTunnelUpdateRequest


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**description** | **String** | An optional description of the interconnect. |  [optional] |
|**gre** | [**MagicGre**](MagicGre.md) |  |  [optional] |
|**healthCheck** | [**MagicSchemasHealthCheck**](MagicSchemasHealthCheck.md) |  |  [optional] |
|**interfaceAddress** | **String** | A 31-bit prefix (/31 in CIDR notation) supporting two hosts, one for each side of the tunnel. Select the subnet from the following private IP space: 10.0.0.0–10.255.255.255, 172.16.0.0–172.31.255.255, 192.168.0.0–192.168.255.255. |  [optional] |
|**mtu** | **Integer** | The Maximum Transmission Unit (MTU) in bytes for the interconnect. The minimum value is 576. |  [optional] |



