

# R2EnableSippyGcsSource

GCS bucket to copy objects from

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**bucket** | **String** | Name of the GCS bucket |  [optional] |
|**clientEmail** | **String** | Client email of an IAM credential (ideally scoped to a single GCS bucket) |  [optional] |
|**privateKey** | **String** | Private Key of an IAM credential (ideally scoped to a single GCS bucket) |  [optional] |
|**provider** | [**ProviderEnum**](#ProviderEnum) |  |  [optional] |



## Enum: ProviderEnum

| Name | Value |
|---- | -----|
| GCS | &quot;gcs&quot; |



