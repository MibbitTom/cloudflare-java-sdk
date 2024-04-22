

# CustomSslForAZoneRePrioritizeSslCertificatesRequestCertificatesInner


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**id** | **String** | Identifier |  [optional] [readonly] |
|**priority** | **BigDecimal** | The order/priority in which the certificate will be used in a request. The higher priority will break ties across overlapping &#39;legacy_custom&#39; certificates, but &#39;legacy_custom&#39; certificates will always supercede &#39;sni_custom&#39; certificates. |  [optional] |



