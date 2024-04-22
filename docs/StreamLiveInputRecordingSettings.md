

# StreamLiveInputRecordingSettings

Records the input to a Cloudflare Stream video. Behavior depends on the mode. In most cases, the video will initially be viewable as a live video and transition to on-demand after a condition is satisfied.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**allowedOrigins** | **List&lt;String&gt;** | Lists the origins allowed to display videos created with this input. Enter allowed origin domains in an array and use &#x60;*&#x60; for wildcard subdomains. An empty array allows videos to be viewed on any origin. |  [optional] |
|**mode** | **StreamLiveInputRecordingMode** |  |  [optional] |
|**requireSignedURLs** | **Boolean** | Indicates if a video using the live input has the &#x60;requireSignedURLs&#x60; property set. Also enforces access controls on any video recording of the livestream with the live input. |  [optional] |
|**timeoutSeconds** | **Integer** | Determines the amount of time a live input configured in &#x60;automatic&#x60; mode should wait before a recording transitions from live to on-demand. &#x60;0&#x60; is recommended for most use cases and indicates the platform default should be used. |  [optional] |



