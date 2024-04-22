

# TeamsDevicesTlsConfigRequest


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**sha256** | **String** | The SHA-256 hash of the TLS certificate presented by the host found at tls_sockaddr. If absent, regular certificate verification (trusted roots, valid timestamp, etc) will be used to validate the certificate. |  [optional] |
|**tlsSockaddr** | **String** | A network address of the form \&quot;host:port\&quot; that the WARP client will use to detect the presence of a TLS host. |  |



