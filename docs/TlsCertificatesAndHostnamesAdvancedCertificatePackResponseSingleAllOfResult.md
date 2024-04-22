

# TlsCertificatesAndHostnamesAdvancedCertificatePackResponseSingleAllOfResult


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**certificateAuthority** | **TlsCertificatesAndHostnamesSchemasCertificateAuthority** |  |  [optional] |
|**cloudflareBranding** | **Boolean** | Whether or not to add Cloudflare Branding for the order.  This will add sni.cloudflaressl.com as the Common Name if set true. |  [optional] |
|**hosts** | **List&lt;String&gt;** | Comma separated list of valid host names for the certificate packs. Must contain the zone apex, may not contain more than 50 hosts, and may not be empty. |  [optional] |
|**id** | **String** | Identifier |  [optional] [readonly] |
|**status** | **TlsCertificatesAndHostnamesCertificatePacksComponentsSchemasStatus** |  |  [optional] |
|**type** | **TlsCertificatesAndHostnamesAdvancedType** |  |  [optional] |
|**validationMethod** | **TlsCertificatesAndHostnamesValidationMethod** |  |  [optional] |
|**validityDays** | **TlsCertificatesAndHostnamesValidityDays** |  |  [optional] |



