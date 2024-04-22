

# StreamUpdateInputRequest


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**defaultCreator** | **String** | Sets the creator ID asssociated with this live input. |  [optional] |
|**deleteRecordingAfterDays** | **BigDecimal** | Indicates the number of days after which the live inputs recordings will be deleted. When a stream completes and the recording is ready, the value is used to calculate a scheduled deletion date for that recording. Omit the field to indicate no change, or include with a &#x60;null&#x60; value to remove an existing scheduled deletion. |  [optional] |
|**meta** | **Object** | A user modifiable key-value store used to reference other systems of record for managing live inputs. |  [optional] |
|**recording** | [**StreamLiveInputRecordingSettings**](StreamLiveInputRecordingSettings.md) |  |  [optional] |



