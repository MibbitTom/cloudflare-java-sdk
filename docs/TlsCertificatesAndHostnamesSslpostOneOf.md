

# TlsCertificatesAndHostnamesSslpostOneOf


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**bundleMethod** | [**BundleMethodEnum**](#BundleMethodEnum) | A ubiquitous bundle has the highest probability of being verified everywhere, even by clients using outdated or unusual trust stores. An optimal bundle uses the shortest chain and newest intermediates. And the force bundle verifies the chain, but does not otherwise modify it. |  [optional] |
|**certificateAuthority** | **TlsCertificatesAndHostnamesCertificateAuthority** |  |  [optional] |
|**customCertificate** | **String** | If a custom uploaded certificate is used. |  [optional] |
|**customKey** | **String** | The key for a custom uploaded certificate. |  [optional] |
|**method** | [**MethodEnum**](#MethodEnum) | Domain control validation (DCV) method used for this hostname. |  [optional] |
|**settings** | [**TlsCertificatesAndHostnamesSslsettings**](TlsCertificatesAndHostnamesSslsettings.md) |  |  [optional] |
|**type** | [**TypeEnum**](#TypeEnum) | Level of validation to be used for this hostname. Domain validation (dv) must be used. |  [optional] |
|**wildcard** | **Boolean** | Indicates whether the certificate covers a wildcard. |  [optional] |



## Enum: BundleMethodEnum

| Name | Value |
|---- | -----|
| UBIQUITOUS | &quot;ubiquitous&quot; |
| OPTIMAL | &quot;optimal&quot; |
| FORCE | &quot;force&quot; |



## Enum: MethodEnum

| Name | Value |
|---- | -----|
| HTTP | &quot;http&quot; |
| TXT | &quot;txt&quot; |
| EMAIL | &quot;email&quot; |



## Enum: TypeEnum

| Name | Value |
|---- | -----|
| DV | &quot;dv&quot; |



