

# StreamCreateOutputRequest


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**enabled** | **Boolean** | When enabled, live video streamed to the associated live input will be sent to the output URL. When disabled, live video will not be sent to the output URL, even when streaming to the associated live input. Use this to control precisely when you start and stop simulcasting to specific destinations like YouTube and Twitch. |  [optional] |
|**streamKey** | **String** | The streamKey used to authenticate against an output&#39;s target. |  |
|**url** | **String** | The URL an output uses to restream. |  |



