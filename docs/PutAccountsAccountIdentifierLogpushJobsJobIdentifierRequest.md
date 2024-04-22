

# PutAccountsAccountIdentifierLogpushJobsJobIdentifierRequest


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**destinationConf** | **URI** | Uniquely identifies a resource (such as an s3 bucket) where data will be pushed. Additional configuration parameters supported by the destination may be included. |  [optional] |
|**enabled** | **Boolean** | Flag that indicates if the job is enabled. |  [optional] |
|**frequency** | **LogpushFrequency** |  |  [optional] |
|**logpullOptions** | **String** | This field is deprecated. Use &#x60;output_options&#x60; instead. Configuration string. It specifies things like requested fields and timestamp formats. If migrating from the logpull api, copy the url (full url or just the query string) of your call here, and logpush will keep on making this call for you, setting start and end times appropriately. |  [optional] |
|**outputOptions** | [**LogpushOutputOptions**](LogpushOutputOptions.md) |  |  [optional] |
|**ownershipChallenge** | **String** | Ownership challenge token to prove destination ownership. |  [optional] |



