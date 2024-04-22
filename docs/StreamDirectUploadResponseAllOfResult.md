

# StreamDirectUploadResponseAllOfResult


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**scheduledDeletion** | **OffsetDateTime** | Indicates the date and time at which the video will be deleted. Omit the field to indicate no change, or include with a &#x60;null&#x60; value to remove an existing scheduled deletion. If specified, must be at least 30 days from upload time. |  [optional] |
|**uid** | **String** | A Cloudflare-generated unique identifier for a media item. |  [optional] |
|**uploadURL** | **String** | The URL an unauthenticated upload can use for a single &#x60;HTTP POST multipart/form-data&#x60; request. |  [optional] |
|**watermark** | [**StreamWatermarks**](StreamWatermarks.md) |  |  [optional] |



