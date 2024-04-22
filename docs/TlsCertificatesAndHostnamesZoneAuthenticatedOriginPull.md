

# TlsCertificatesAndHostnamesZoneAuthenticatedOriginPull


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**certificate** | **String** | The zone&#39;s leaf certificate. |  [optional] |
|**enabled** | **Boolean** | Indicates whether zone-level authenticated origin pulls is enabled. |  [optional] |
|**id** | **String** | Identifier |  [optional] [readonly] |
|**privateKey** | **String** | The zone&#39;s private key. |  [optional] |
|**expiresOn** | **OffsetDateTime** | When the certificate from the authority expires. |  [optional] [readonly] |
|**issuer** | **String** | The certificate authority that issued the certificate. |  [optional] [readonly] |
|**signature** | **String** | The type of hash used for the certificate. |  [optional] [readonly] |
|**status** | **TlsCertificatesAndHostnamesZoneAuthenticatedOriginPullComponentsSchemasStatus** |  |  [optional] |
|**uploadedOn** | **OffsetDateTime** | This is the time the certificate was uploaded. |  [optional] |



