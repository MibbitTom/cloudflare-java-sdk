

# TunnelSchemasConnection


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**clientId** | **Object** | UUID of the cloudflared instance. |  [optional] |
|**clientVersion** | **String** | The cloudflared version used to establish this connection. |  [optional] |
|**coloName** | **String** | The Cloudflare data center used for this connection. |  [optional] |
|**id** | **String** | UUID of the Cloudflare Tunnel connection. |  [optional] [readonly] |
|**isPendingReconnect** | **Boolean** | Cloudflare continues to track connections for several minutes after they disconnect. This is an optimization to improve latency and reliability of reconnecting.  If &#x60;true&#x60;, the connection has disconnected but is still being tracked. If &#x60;false&#x60;, the connection is actively serving traffic. |  [optional] |
|**openedAt** | **OffsetDateTime** | Timestamp of when the connection was established. |  [optional] |
|**originIp** | **String** | The public IP address of the host running cloudflared. |  [optional] |
|**uuid** | **String** | UUID of the Cloudflare Tunnel connection. |  [optional] [readonly] |



