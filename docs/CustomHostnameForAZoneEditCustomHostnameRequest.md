

# CustomHostnameForAZoneEditCustomHostnameRequest


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**customMetadata** | [**TlsCertificatesAndHostnamesCustomMetadata**](TlsCertificatesAndHostnamesCustomMetadata.md) |  |  [optional] |
|**customOriginServer** | **String** | a valid hostname that’s been added to your DNS zone as an A, AAAA, or CNAME record. |  [optional] |
|**customOriginSni** | **String** | A hostname that will be sent to your custom origin server as SNI for TLS handshake. This can be a valid subdomain of the zone or custom origin server name or the string &#39;:request_host_header:&#39; which will cause the host header in the request to be used as SNI. Not configurable with default/fallback origin server. |  [optional] |
|**ssl** | [**TlsCertificatesAndHostnamesSslpost**](TlsCertificatesAndHostnamesSslpost.md) |  |  [optional] |



