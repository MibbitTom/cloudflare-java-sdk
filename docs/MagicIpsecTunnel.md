

# MagicIpsecTunnel


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**allowNullCipher** | **Boolean** | When &#x60;true&#x60;, the tunnel can use a null-cipher (&#x60;ENCR_NULL&#x60;) in the ESP tunnel (Phase 2). |  [optional] |
|**cloudflareEndpoint** | **String** | The IP address assigned to the Cloudflare side of the IPsec tunnel. |  |
|**createdOn** | **OffsetDateTime** | The date and time the tunnel was created. |  [optional] [readonly] |
|**customerEndpoint** | **String** | The IP address assigned to the customer side of the IPsec tunnel. Not required, but must be set for proactive traceroutes to work. |  [optional] |
|**description** | **String** | An optional description forthe IPsec tunnel. |  [optional] |
|**id** | **String** | Tunnel identifier tag. |  [optional] [readonly] |
|**interfaceAddress** | **String** | A 31-bit prefix (/31 in CIDR notation) supporting two hosts, one for each side of the tunnel. Select the subnet from the following private IP space: 10.0.0.0–10.255.255.255, 172.16.0.0–172.31.255.255, 192.168.0.0–192.168.255.255. |  |
|**modifiedOn** | **OffsetDateTime** | The date and time the tunnel was last modified. |  [optional] [readonly] |
|**name** | **String** | The name of the IPsec tunnel. The name cannot share a name with other tunnels. |  |
|**pskMetadata** | [**MagicPskMetadata**](MagicPskMetadata.md) |  |  [optional] |
|**replayProtection** | **Boolean** | If &#x60;true&#x60;, then IPsec replay protection will be supported in the Cloudflare-to-customer direction. |  [optional] |
|**tunnelHealthCheck** | [**MagicTunnelHealthCheck**](MagicTunnelHealthCheck.md) |  |  [optional] |



