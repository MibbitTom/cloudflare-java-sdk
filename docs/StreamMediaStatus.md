

# StreamMediaStatus

Specifies a detailed status for a video. If the `state` is `inprogress` or `error`, the `step` field returns `encoding` or `manifest`. If the `state` is `inprogress`, `pctComplete` returns a number between 0 and 100 to indicate the approximate percent of completion. If the `state` is `error`, `errorReasonCode` and `errorReasonText` provide additional details.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**errorReasonCode** | **String** | Specifies why the video failed to encode. This field is empty if the video is not in an &#x60;error&#x60; state. Preferred for programmatic use. |  [optional] |
|**errorReasonText** | **String** | Specifies why the video failed to encode using a human readable error message in English. This field is empty if the video is not in an &#x60;error&#x60; state. |  [optional] |
|**pctComplete** | **String** | Indicates the size of the entire upload in bytes. The value must be a non-negative integer. |  [optional] |
|**state** | **StreamMediaState** |  |  [optional] |



