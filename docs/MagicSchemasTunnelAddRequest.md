

# MagicSchemasTunnelAddRequest


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**cloudflareEndpoint** | **String** | The IP address assigned to the Cloudflare side of the IPsec tunnel. |  |
|**customerEndpoint** | **String** | The IP address assigned to the customer side of the IPsec tunnel. Not required, but must be set for proactive traceroutes to work. |  [optional] |
|**description** | **String** | An optional description forthe IPsec tunnel. |  [optional] |
|**healthCheck** | [**MagicHealthCheck**](MagicHealthCheck.md) |  |  [optional] |
|**interfaceAddress** | **String** | A 31-bit prefix (/31 in CIDR notation) supporting two hosts, one for each side of the tunnel. Select the subnet from the following private IP space: 10.0.0.0–10.255.255.255, 172.16.0.0–172.31.255.255, 192.168.0.0–192.168.255.255. |  |
|**name** | **String** | The name of the IPsec tunnel. The name cannot share a name with other tunnels. |  |
|**psk** | **String** | A randomly generated or provided string for use in the IPsec tunnel. |  [optional] |
|**replayProtection** | **Boolean** | If &#x60;true&#x60;, then IPsec replay protection will be supported in the Cloudflare-to-customer direction. |  [optional] |



