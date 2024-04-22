

# CustomSslForAZoneEditSslConfigurationRequest


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**bundleMethod** | **TlsCertificatesAndHostnamesBundleMethod** |  |  [optional] |
|**certificate** | **String** | The zone&#39;s SSL certificate or certificate and the intermediate(s). |  [optional] |
|**geoRestrictions** | [**TlsCertificatesAndHostnamesGeoRestrictions**](TlsCertificatesAndHostnamesGeoRestrictions.md) |  |  [optional] |
|**policy** | **String** | Specify the policy that determines the region where your private key will be held locally. HTTPS connections to any excluded data center will still be fully encrypted, but will incur some latency while Keyless SSL is used to complete the handshake with the nearest allowed data center. Any combination of countries, specified by their two letter country code (https://en.wikipedia.org/wiki/ISO_3166-1_alpha-2#Officially_assigned_code_elements) can be chosen, such as &#39;country: IN&#39;, as well as &#39;region: EU&#39; which refers to the EU region. If there are too few data centers satisfying the policy, it will be rejected. |  [optional] |
|**privateKey** | **String** | The zone&#39;s private key. |  [optional] |



