

# TlsCertificatesAndHostnamesCertificates


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**certificate** | **String** | The Origin CA certificate. Will be newline-encoded. |  [optional] [readonly] |
|**csr** | **String** | The Certificate Signing Request (CSR). Must be newline-encoded. |  |
|**expiresOn** | **OffsetDateTime** | When the certificate will expire. |  [optional] [readonly] |
|**hostnames** | **List&lt;Object&gt;** | Array of hostnames or wildcard names (e.g., *.example.com) bound to the certificate. |  |
|**id** | **String** | Identifier |  [optional] [readonly] |
|**requestType** | **TlsCertificatesAndHostnamesRequestType** |  |  |
|**requestedValidity** | **TlsCertificatesAndHostnamesRequestedValidity** |  |  |



