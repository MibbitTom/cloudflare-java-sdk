

# TlsCertificatesAndHostnamesHostnameAuthenticatedOriginPull


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**certId** | **String** | Identifier |  [optional] [readonly] |
|**certificate** | **String** | The hostname certificate. |  [optional] |
|**enabled** | **Boolean** | Indicates whether hostname-level authenticated origin pulls is enabled. A null value voids the association. |  [optional] |
|**hostname** | **String** | The hostname on the origin for which the client certificate uploaded will be used. |  [optional] |
|**id** | **String** | Identifier |  [optional] [readonly] |
|**privateKey** | **String** | The hostname certificate&#39;s private key. |  [optional] |
|**certStatus** | **TlsCertificatesAndHostnamesHostnameAuthenticatedOriginPullComponentsSchemasStatus** |  |  [optional] |
|**certUpdatedAt** | **OffsetDateTime** | The time when the certificate was updated. |  [optional] [readonly] |
|**certUploadedOn** | **OffsetDateTime** | The time when the certificate was uploaded. |  [optional] |
|**createdAt** | **OffsetDateTime** | The time when the certificate was created. |  [optional] [readonly] |
|**expiresOn** | **OffsetDateTime** | The date when the certificate expires. |  [optional] [readonly] |
|**issuer** | **String** | The certificate authority that issued the certificate. |  [optional] [readonly] |
|**serialNumber** | **String** | The serial number on the uploaded certificate. |  [optional] |
|**signature** | **String** | The type of hash used for the certificate. |  [optional] [readonly] |
|**status** | **TlsCertificatesAndHostnamesHostnameAuthenticatedOriginPullComponentsSchemasStatus** |  |  [optional] |
|**updatedAt** | **OffsetDateTime** | The time when the certificate was updated. |  [optional] [readonly] |



