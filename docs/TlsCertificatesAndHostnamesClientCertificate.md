

# TlsCertificatesAndHostnamesClientCertificate


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**certificate** | **String** | The Client Certificate PEM |  [optional] [readonly] |
|**certificateAuthority** | [**TlsCertificatesAndHostnamesClientCertificatesComponentsSchemasCertificateAuthority**](TlsCertificatesAndHostnamesClientCertificatesComponentsSchemasCertificateAuthority.md) |  |  [optional] |
|**commonName** | **String** | Common Name of the Client Certificate |  [optional] [readonly] |
|**country** | **String** | Country, provided by the CSR |  [optional] [readonly] |
|**csr** | **String** | The Certificate Signing Request (CSR). Must be newline-encoded. |  [optional] |
|**expiresOn** | **String** | Date that the Client Certificate expires |  [optional] [readonly] |
|**fingerprintSha256** | **String** | Unique identifier of the Client Certificate |  [optional] [readonly] |
|**id** | **String** | Identifier |  [optional] [readonly] |
|**issuedOn** | **String** | Date that the Client Certificate was issued by the Certificate Authority |  [optional] [readonly] |
|**location** | **String** | Location, provided by the CSR |  [optional] [readonly] |
|**organization** | **String** | Organization, provided by the CSR |  [optional] [readonly] |
|**organizationalUnit** | **String** | Organizational Unit, provided by the CSR |  [optional] [readonly] |
|**serialNumber** | **String** | The serial number on the created Client Certificate. |  [optional] [readonly] |
|**signature** | **String** | The type of hash used for the Client Certificate.. |  [optional] [readonly] |
|**ski** | **String** | Subject Key Identifier |  [optional] [readonly] |
|**state** | **String** | State, provided by the CSR |  [optional] [readonly] |
|**status** | **TlsCertificatesAndHostnamesClientCertificatesComponentsSchemasStatus** |  |  [optional] |
|**validityDays** | **Integer** | The number of days the Client Certificate will be valid after the issued_on date |  [optional] |



