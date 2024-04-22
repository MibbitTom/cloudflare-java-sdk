

# TunnelIngressRule

Public hostname

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**hostname** | **String** | Public hostname for this service. |  |
|**originRequest** | [**TunnelOriginRequest**](TunnelOriginRequest.md) |  |  [optional] |
|**path** | **String** | Requests with this path route to this public hostname. |  [optional] |
|**service** | **String** | Protocol and address of destination server. Supported protocols: http://, https://, unix://, tcp://, ssh://, rdp://, unix+tls://, smb://. Alternatively can return a HTTP status code http_status:[code] e.g. &#39;http_status:404&#39;.  |  |



