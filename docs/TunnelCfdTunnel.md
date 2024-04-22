

# TunnelCfdTunnel

A Cloudflare Tunnel that connects your origin to Cloudflare's edge.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**accountTag** | **String** | Cloudflare account ID |  [optional] |
|**connections** | [**List&lt;TunnelSchemasConnection&gt;**](TunnelSchemasConnection.md) | The Cloudflare Tunnel connections between your origin and Cloudflare&#39;s edge. |  [optional] |
|**connsActiveAt** | **OffsetDateTime** | Timestamp of when the tunnel established at least one connection to Cloudflare&#39;s edge. If &#x60;null&#x60;, the tunnel is inactive. |  [optional] |
|**connsInactiveAt** | **OffsetDateTime** | Timestamp of when the tunnel became inactive (no connections to Cloudflare&#39;s edge). If &#x60;null&#x60;, the tunnel is active. |  [optional] |
|**createdAt** | **OffsetDateTime** | Timestamp of when the tunnel was created. |  [optional] |
|**deletedAt** | **OffsetDateTime** | Timestamp of when the tunnel was deleted. If &#x60;null&#x60;, the tunnel has not been deleted. |  [optional] |
|**id** | **String** | UUID of the tunnel. |  [optional] [readonly] |
|**metadata** | **Object** | Metadata associated with the tunnel. |  [optional] |
|**name** | **String** | A user-friendly name for the tunnel. |  [optional] |
|**remoteConfig** | **Boolean** | If &#x60;true&#x60;, the tunnel can be configured remotely from the Zero Trust dashboard. If &#x60;false&#x60;, the tunnel must be configured locally on the origin machine. |  [optional] |
|**status** | **String** | The status of the tunnel. Valid values are &#x60;inactive&#x60; (tunnel has never been run), &#x60;degraded&#x60; (tunnel is active and able to serve traffic but in an unhealthy state), &#x60;healthy&#x60; (tunnel is active and able to serve traffic), or &#x60;down&#x60; (tunnel can not serve traffic as it has no connections to the Cloudflare Edge). |  [optional] |
|**tunType** | **TunnelTunnelType** |  |  [optional] |



