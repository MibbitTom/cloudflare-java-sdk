

# LoadBalancingMonitor


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**allowInsecure** | **Boolean** | Do not validate the certificate when monitor use HTTPS. This parameter is currently only valid for HTTP and HTTPS monitors. |  [optional] |
|**consecutiveDown** | **Integer** | To be marked unhealthy the monitored origin must fail this healthcheck N consecutive times. |  [optional] |
|**consecutiveUp** | **Integer** | To be marked healthy the monitored origin must pass this healthcheck N consecutive times. |  [optional] |
|**description** | **String** | Object description. |  [optional] |
|**expectedBody** | **String** | A case-insensitive sub-string to look for in the response body. If this string is not found, the origin will be marked as unhealthy. This parameter is only valid for HTTP and HTTPS monitors. |  [optional] |
|**expectedCodes** | **String** | The expected HTTP response code or code range of the health check. This parameter is only valid for HTTP and HTTPS monitors. |  [optional] |
|**followRedirects** | **Boolean** | Follow redirects if returned by the origin. This parameter is only valid for HTTP and HTTPS monitors. |  [optional] |
|**header** | **Object** | The HTTP request headers to send in the health check. It is recommended you set a Host header by default. The User-Agent header cannot be overridden. This parameter is only valid for HTTP and HTTPS monitors. |  [optional] |
|**interval** | **Integer** | The interval between each health check. Shorter intervals may improve failover time, but will increase load on the origins as we check from multiple locations. |  [optional] |
|**method** | **String** | The method to use for the health check. This defaults to &#39;GET&#39; for HTTP/HTTPS based checks and &#39;connection_established&#39; for TCP based health checks. |  [optional] |
|**path** | **String** | The endpoint path you want to conduct a health check against. This parameter is only valid for HTTP and HTTPS monitors. |  [optional] |
|**port** | **Integer** | The port number to connect to for the health check. Required for TCP, UDP, and SMTP checks. HTTP and HTTPS checks should only define the port when using a non-standard port (HTTP: default 80, HTTPS: default 443). |  [optional] |
|**probeZone** | **String** | Assign this monitor to emulate the specified zone while probing. This parameter is only valid for HTTP and HTTPS monitors. |  [optional] |
|**retries** | **Integer** | The number of retries to attempt in case of a timeout before marking the origin as unhealthy. Retries are attempted immediately. |  [optional] |
|**timeout** | **Integer** | The timeout (in seconds) before marking the health check as failed. |  [optional] |
|**type** | **LoadBalancingType** |  |  [optional] |
|**createdOn** | **OffsetDateTime** |  |  [optional] [readonly] |
|**id** | **String** |  |  [optional] |
|**modifiedOn** | **OffsetDateTime** |  |  [optional] [readonly] |



