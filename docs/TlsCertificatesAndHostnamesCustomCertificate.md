

# TlsCertificatesAndHostnamesCustomCertificate


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**bundleMethod** | **TlsCertificatesAndHostnamesBundleMethod** |  |  |
|**expiresOn** | **OffsetDateTime** | When the certificate from the authority expires. |  [readonly] |
|**geoRestrictions** | [**TlsCertificatesAndHostnamesGeoRestrictions**](TlsCertificatesAndHostnamesGeoRestrictions.md) |  |  [optional] |
|**hosts** | **List&lt;String&gt;** |  |  |
|**id** | **String** | Identifier |  [readonly] |
|**issuer** | **String** | The certificate authority that issued the certificate. |  [readonly] |
|**keylessServer** | [**TlsCertificatesAndHostnamesKeylessCertificate**](TlsCertificatesAndHostnamesKeylessCertificate.md) |  |  [optional] |
|**modifiedOn** | **OffsetDateTime** | When the certificate was last modified. |  [readonly] |
|**policy** | **String** | Specify the policy that determines the region where your private key will be held locally. HTTPS connections to any excluded data center will still be fully encrypted, but will incur some latency while Keyless SSL is used to complete the handshake with the nearest allowed data center. Any combination of countries, specified by their two letter country code (https://en.wikipedia.org/wiki/ISO_3166-1_alpha-2#Officially_assigned_code_elements) can be chosen, such as &#39;country: IN&#39;, as well as &#39;region: EU&#39; which refers to the EU region. If there are too few data centers satisfying the policy, it will be rejected. |  [optional] |
|**priority** | **BigDecimal** | The order/priority in which the certificate will be used in a request. The higher priority will break ties across overlapping &#39;legacy_custom&#39; certificates, but &#39;legacy_custom&#39; certificates will always supercede &#39;sni_custom&#39; certificates. |  |
|**signature** | **String** | The type of hash used for the certificate. |  [readonly] |
|**status** | **TlsCertificatesAndHostnamesStatus** |  |  |
|**uploadedOn** | **OffsetDateTime** | When the certificate was uploaded to Cloudflare. |  [readonly] |
|**zoneId** | **String** | Identifier |  [readonly] |



