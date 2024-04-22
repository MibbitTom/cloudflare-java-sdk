

# CustomIndicatorFeedsIndicatorFeedMetadata


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**createdOn** | **OffsetDateTime** | The date and time when the data entry was created |  [optional] |
|**description** | **String** | The description of the example test |  [optional] |
|**id** | **Integer** | The unique identifier for the indicator feed |  [optional] |
|**latestUploadStatus** | [**LatestUploadStatusEnum**](#LatestUploadStatusEnum) | Status of the latest snapshot uploaded |  [optional] |
|**modifiedOn** | **OffsetDateTime** | The date and time when the data entry was last modified |  [optional] |
|**name** | **String** | The name of the indicator feed |  [optional] |



## Enum: LatestUploadStatusEnum

| Name | Value |
|---- | -----|
| MIRRORING | &quot;Mirroring&quot; |
| UNIFYING | &quot;Unifying&quot; |
| LOADING | &quot;Loading&quot; |
| PROVISIONING | &quot;Provisioning&quot; |
| COMPLETE | &quot;Complete&quot; |
| ERROR | &quot;Error&quot; |



