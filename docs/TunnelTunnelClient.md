

# TunnelTunnelClient

A client (typically cloudflared) that maintains connections to a Cloudflare data center.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**arch** | **String** | The cloudflared OS architecture used to establish this connection. |  [optional] |
|**configVersion** | **Integer** | The version of the remote tunnel configuration. Used internally to sync cloudflared with the Zero Trust dashboard. |  [optional] |
|**conns** | [**List&lt;TunnelSchemasConnection&gt;**](TunnelSchemasConnection.md) | The Cloudflare Tunnel connections between your origin and Cloudflare&#39;s edge. |  [optional] |
|**features** | **List&lt;String&gt;** | Features enabled for the Cloudflare Tunnel. |  [optional] |
|**id** | **String** | UUID of the Cloudflare Tunnel connection. |  [optional] [readonly] |
|**runAt** | **OffsetDateTime** | Timestamp of when the tunnel connection was started. |  [optional] |
|**version** | **String** | The cloudflared version used to establish this connection. |  [optional] |



