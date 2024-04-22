

# TunnelConnection


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**coloName** | **String** | The Cloudflare data center used for this connection. |  [optional] |
|**isPendingReconnect** | **Boolean** | Cloudflare continues to track connections for several minutes after they disconnect. This is an optimization to improve latency and reliability of reconnecting.  If &#x60;true&#x60;, the connection has disconnected but is still being tracked. If &#x60;false&#x60;, the connection is actively serving traffic. |  [optional] |
|**uuid** | **String** | UUID of the Cloudflare Tunnel connection. |  [optional] [readonly] |



