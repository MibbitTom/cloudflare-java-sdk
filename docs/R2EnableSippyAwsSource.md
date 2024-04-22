

# R2EnableSippyAwsSource

AWS S3 bucket to copy objects from

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**accessKeyId** | **String** | Access Key ID of an IAM credential (ideally scoped to a single S3 bucket) |  [optional] |
|**bucket** | **String** | Name of the AWS S3 bucket |  [optional] |
|**provider** | [**ProviderEnum**](#ProviderEnum) |  |  [optional] |
|**region** | **String** | Name of the AWS availability zone |  [optional] |
|**secretAccessKey** | **String** | Secret Access Key of an IAM credential (ideally scoped to a single S3 bucket) |  [optional] |



## Enum: ProviderEnum

| Name | Value |
|---- | -----|
| AWS | &quot;aws&quot; |



