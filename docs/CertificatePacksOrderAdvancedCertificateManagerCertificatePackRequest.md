

# CertificatePacksOrderAdvancedCertificateManagerCertificatePackRequest


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**certificateAuthority** | **TlsCertificatesAndHostnamesSchemasCertificateAuthority** |  |  |
|**cloudflareBranding** | **Boolean** | Whether or not to add Cloudflare Branding for the order.  This will add sni.cloudflaressl.com as the Common Name if set true. |  [optional] |
|**hosts** | **List&lt;String&gt;** | Comma separated list of valid host names for the certificate packs. Must contain the zone apex, may not contain more than 50 hosts, and may not be empty. |  |
|**type** | **TlsCertificatesAndHostnamesAdvancedType** |  |  |
|**validationMethod** | **TlsCertificatesAndHostnamesValidationMethod** |  |  |
|**validityDays** | **TlsCertificatesAndHostnamesValidityDays** |  |  |



