

# R2EnableSippyAwsDestination

R2 bucket to copy objects to

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**accessKeyId** | **String** | ID of a Cloudflare API token. This is the value labelled \&quot;Access Key ID\&quot; when creating an API token from the [R2 dashboard](https://dash.cloudflare.com/?to&#x3D;/:account/r2/api-tokens).  Sippy will use this token when writing objects to R2, so it is best to scope this token to the bucket you&#39;re enabling Sippy for.  |  [optional] |
|**provider** | [**ProviderEnum**](#ProviderEnum) |  |  [optional] |
|**secretAccessKey** | **String** | Value of a Cloudflare API token. This is the value labelled \&quot;Secret Access Key\&quot; when creating an API token from the [R2 dashboard](https://dash.cloudflare.com/?to&#x3D;/:account/r2/api-tokens).  Sippy will use this token when writing objects to R2, so it is best to scope this token to the bucket you&#39;re enabling Sippy for.  |  [optional] |



## Enum: ProviderEnum

| Name | Value |
|---- | -----|
| R2 | &quot;r2&quot; |



