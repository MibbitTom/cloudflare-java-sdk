

# TlsCertificatesAndHostnamesSslOneOf


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**bundleMethod** | [**BundleMethodEnum**](#BundleMethodEnum) | A ubiquitous bundle has the highest probability of being verified everywhere, even by clients using outdated or unusual trust stores. An optimal bundle uses the shortest chain and newest intermediates. And the force bundle verifies the chain, but does not otherwise modify it. |  [optional] |
|**certificateAuthority** | **TlsCertificatesAndHostnamesCertificateAuthority** |  |  [optional] |
|**customCertificate** | **String** | If a custom uploaded certificate is used. |  [optional] |
|**customCsrId** | **String** | The identifier for the Custom CSR that was used. |  [optional] |
|**customKey** | **String** | The key for a custom uploaded certificate. |  [optional] |
|**expiresOn** | **OffsetDateTime** | The time the custom certificate expires on. |  [optional] |
|**hosts** | **List&lt;Object&gt;** | A list of Hostnames on a custom uploaded certificate. |  [optional] |
|**id** | **String** | Custom hostname SSL identifier tag. |  [optional] |
|**issuer** | **String** | The issuer on a custom uploaded certificate. |  [optional] |
|**method** | [**MethodEnum**](#MethodEnum) | Domain control validation (DCV) method used for this hostname. |  [optional] |
|**serialNumber** | **String** | The serial number on a custom uploaded certificate. |  [optional] |
|**settings** | [**TlsCertificatesAndHostnamesSslsettings**](TlsCertificatesAndHostnamesSslsettings.md) |  |  [optional] |
|**signature** | **String** | The signature on a custom uploaded certificate. |  [optional] |
|**status** | [**StatusEnum**](#StatusEnum) | Status of the hostname&#39;s SSL certificates. |  [optional] [readonly] |
|**type** | [**TypeEnum**](#TypeEnum) | Level of validation to be used for this hostname. Domain validation (dv) must be used. |  [optional] [readonly] |
|**uploadedOn** | **OffsetDateTime** | The time the custom certificate was uploaded. |  [optional] |
|**validationErrors** | [**List&lt;TlsCertificatesAndHostnamesSslOneOfValidationErrorsInner&gt;**](TlsCertificatesAndHostnamesSslOneOfValidationErrorsInner.md) | Domain validation errors that have been received by the certificate authority (CA). |  [optional] |
|**validationRecords** | [**List&lt;TlsCertificatesAndHostnamesValidationRecord&gt;**](TlsCertificatesAndHostnamesValidationRecord.md) |  |  [optional] |
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



## Enum: StatusEnum

| Name | Value |
|---- | -----|
| INITIALIZING | &quot;initializing&quot; |
| PENDING_VALIDATION | &quot;pending_validation&quot; |
| DELETED | &quot;deleted&quot; |
| PENDING_ISSUANCE | &quot;pending_issuance&quot; |
| PENDING_DEPLOYMENT | &quot;pending_deployment&quot; |
| PENDING_DELETION | &quot;pending_deletion&quot; |
| PENDING_EXPIRATION | &quot;pending_expiration&quot; |
| EXPIRED | &quot;expired&quot; |
| ACTIVE | &quot;active&quot; |
| INITIALIZING_TIMED_OUT | &quot;initializing_timed_out&quot; |
| VALIDATION_TIMED_OUT | &quot;validation_timed_out&quot; |
| ISSUANCE_TIMED_OUT | &quot;issuance_timed_out&quot; |
| DEPLOYMENT_TIMED_OUT | &quot;deployment_timed_out&quot; |
| DELETION_TIMED_OUT | &quot;deletion_timed_out&quot; |
| PENDING_CLEANUP | &quot;pending_cleanup&quot; |
| STAGING_DEPLOYMENT | &quot;staging_deployment&quot; |
| STAGING_ACTIVE | &quot;staging_active&quot; |
| DEACTIVATING | &quot;deactivating&quot; |
| INACTIVE | &quot;inactive&quot; |
| BACKUP_ISSUED | &quot;backup_issued&quot; |
| HOLDING_DEPLOYMENT | &quot;holding_deployment&quot; |



## Enum: TypeEnum

| Name | Value |
|---- | -----|
| DV | &quot;dv&quot; |



