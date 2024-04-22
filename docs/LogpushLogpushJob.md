

# LogpushLogpushJob


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**dataset** | **String** | Name of the dataset. |  [optional] |
|**destinationConf** | **URI** | Uniquely identifies a resource (such as an s3 bucket) where data will be pushed. Additional configuration parameters supported by the destination may be included. |  [optional] |
|**enabled** | **Boolean** | Flag that indicates if the job is enabled. |  [optional] |
|**errorMessage** | **OffsetDateTime** | If not null, the job is currently failing. Failures are usually repetitive (example: no permissions to write to destination bucket). Only the last failure is recorded. On successful execution of a job the error_message and last_error are set to null. |  [optional] |
|**frequency** | **LogpushFrequency** |  |  [optional] |
|**id** | **Integer** | Unique id of the job. |  [optional] |
|**lastComplete** | **OffsetDateTime** | Records the last time for which logs have been successfully pushed. If the last successful push was for logs range 2018-07-23T10:00:00Z to 2018-07-23T10:01:00Z then the value of this field will be 2018-07-23T10:01:00Z. If the job has never run or has just been enabled and hasn&#39;t run yet then the field will be empty. |  [optional] |
|**lastError** | **OffsetDateTime** | Records the last time the job failed. If not null, the job is currently failing. If null, the job has either never failed or has run successfully at least once since last failure. See also the error_message field. |  [optional] |
|**logpullOptions** | **String** | This field is deprecated. Use &#x60;output_options&#x60; instead. Configuration string. It specifies things like requested fields and timestamp formats. If migrating from the logpull api, copy the url (full url or just the query string) of your call here, and logpush will keep on making this call for you, setting start and end times appropriately. |  [optional] |
|**name** | **String** | Optional human readable job name. Not unique. Cloudflare suggests that you set this to a meaningful string, like the domain name, to make it easier to identify your job. |  [optional] |
|**outputOptions** | [**LogpushOutputOptions**](LogpushOutputOptions.md) |  |  [optional] |



