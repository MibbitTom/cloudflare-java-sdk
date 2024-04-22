

# RegistrarApiDomains


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**available** | **Boolean** | Shows if a domain is available for transferring into Cloudflare Registrar. |  [optional] |
|**canRegister** | **Boolean** | Indicates if the domain can be registered as a new domain. |  [optional] |
|**createdAt** | **OffsetDateTime** | Shows time of creation. |  [optional] |
|**currentRegistrar** | **String** | Shows name of current registrar. |  [optional] |
|**expiresAt** | **OffsetDateTime** | Shows when domain name registration expires. |  [optional] |
|**id** | **String** | Domain identifier. |  [optional] [readonly] |
|**locked** | **Boolean** | Shows whether a registrar lock is in place for a domain. |  [optional] |
|**registrantContact** | [**RegistrarApiRegistrantContact**](RegistrarApiRegistrantContact.md) |  |  [optional] |
|**registryStatuses** | **String** | A comma-separated list of registry status codes. A full list of status codes can be found at [EPP Status Codes](https://www.icann.org/resources/pages/epp-status-codes-2014-06-16-en). |  [optional] |
|**supportedTld** | **Boolean** | Whether a particular TLD is currently supported by Cloudflare Registrar. Refer to [TLD Policies](https://www.cloudflare.com/tld-policies/) for a list of supported TLDs. |  [optional] |
|**transferIn** | [**RegistrarApiTransferIn**](RegistrarApiTransferIn.md) |  |  [optional] |
|**updatedAt** | **OffsetDateTime** | Last updated. |  [optional] |



