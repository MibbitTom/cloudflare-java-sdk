

# TlsCertificatesAndHostnamesCertificateObjectPost


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**ca** | **Boolean** | Indicates whether the certificate is a CA or leaf certificate. |  [optional] |
|**certificates** | **String** | The uploaded root CA certificate. |  [optional] |
|**expiresOn** | **OffsetDateTime** | When the certificate expires. |  [optional] [readonly] |
|**id** | **String** | Identifier |  [optional] [readonly] |
|**issuer** | **String** | The certificate authority that issued the certificate. |  [optional] [readonly] |
|**name** | **String** | Optional unique name for the certificate. Only used for human readability. |  [optional] |
|**serialNumber** | **String** | The certificate serial number. |  [optional] [readonly] |
|**signature** | **String** | The type of hash used for the certificate. |  [optional] [readonly] |
|**updatedAt** | **OffsetDateTime** | This is the time the certificate was updated. |  [optional] |
|**uploadedOn** | **OffsetDateTime** | This is the time the certificate was uploaded. |  [optional] |



