

# TunnelOriginRequest

Configuration parameters of connection between cloudflared and origin server.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**access** | [**TunnelOriginRequestAccess**](TunnelOriginRequestAccess.md) |  |  [optional] |
|**caPool** | **String** | Path to the certificate authority (CA) for the certificate of your origin. This option should be used only if your certificate is not signed by Cloudflare. |  [optional] |
|**connectTimeout** | **Integer** | Timeout for establishing a new TCP connection to your origin server. This excludes the time taken to establish TLS, which is controlled by tlsTimeout. |  [optional] |
|**disableChunkedEncoding** | **Boolean** | Disables chunked transfer encoding. Useful if you are running a WSGI server. |  [optional] |
|**http2Origin** | **Boolean** | Attempt to connect to origin using HTTP2. Origin must be configured as https. |  [optional] |
|**httpHostHeader** | **String** | Sets the HTTP Host header on requests sent to the local service. |  [optional] |
|**keepAliveConnections** | **Integer** | Maximum number of idle keepalive connections between Tunnel and your origin. This does not restrict the total number of concurrent connections. |  [optional] |
|**keepAliveTimeout** | **Integer** | Timeout after which an idle keepalive connection can be discarded. |  [optional] |
|**noHappyEyeballs** | **Boolean** | Disable the “happy eyeballs” algorithm for IPv4/IPv6 fallback if your local network has misconfigured one of the protocols. |  [optional] |
|**noTLSVerify** | **Boolean** | Disables TLS verification of the certificate presented by your origin. Will allow any certificate from the origin to be accepted. |  [optional] |
|**originServerName** | **String** | Hostname that cloudflared should expect from your origin server certificate. |  [optional] |
|**proxyType** | **String** | cloudflared starts a proxy server to translate HTTP traffic into TCP when proxying, for example, SSH or RDP. This configures what type of proxy will be started. Valid options are: \&quot;\&quot; for the regular proxy and \&quot;socks\&quot; for a SOCKS5 proxy.  |  [optional] |
|**tcpKeepAlive** | **Integer** | The timeout after which a TCP keepalive packet is sent on a connection between Tunnel and the origin server. |  [optional] |
|**tlsTimeout** | **Integer** | Timeout for completing a TLS handshake to your origin server, if you have chosen to connect Tunnel to an HTTPS server. |  [optional] |



