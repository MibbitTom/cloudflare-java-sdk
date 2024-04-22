

# StreamLiveInput

Details about a live input.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**created** | **OffsetDateTime** | The date and time the live input was created. |  [optional] |
|**deleteRecordingAfterDays** | **BigDecimal** | Indicates the number of days after which the live inputs recordings will be deleted. When a stream completes and the recording is ready, the value is used to calculate a scheduled deletion date for that recording. Omit the field to indicate no change, or include with a &#x60;null&#x60; value to remove an existing scheduled deletion. |  [optional] |
|**meta** | **Object** | A user modifiable key-value store used to reference other systems of record for managing live inputs. |  [optional] |
|**modified** | **OffsetDateTime** | The date and time the live input was last modified. |  [optional] |
|**recording** | [**StreamLiveInputRecordingSettings**](StreamLiveInputRecordingSettings.md) |  |  [optional] |
|**rtmps** | [**StreamInputRtmps**](StreamInputRtmps.md) |  |  [optional] |
|**rtmpsPlayback** | [**StreamPlaybackRtmps**](StreamPlaybackRtmps.md) |  |  [optional] |
|**srt** | [**StreamInputSrt**](StreamInputSrt.md) |  |  [optional] |
|**srtPlayback** | [**StreamPlaybackSrt**](StreamPlaybackSrt.md) |  |  [optional] |
|**status** | **StreamLiveInputStatus** |  |  [optional] |
|**uid** | **String** | A unique identifier for a live input. |  [optional] |
|**webRTC** | [**StreamInputWebrtc**](StreamInputWebrtc.md) |  |  [optional] |
|**webRTCPlayback** | [**StreamPlaybackWebrtc**](StreamPlaybackWebrtc.md) |  |  [optional] |



