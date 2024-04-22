

# StreamVideos


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**allowedOrigins** | **List&lt;String&gt;** | Lists the origins allowed to display the video. Enter allowed origin domains in an array and use &#x60;*&#x60; for wildcard subdomains. Empty arrays allow the video to be viewed on any origin. |  [optional] |
|**created** | **OffsetDateTime** | The date and time the media item was created. |  [optional] |
|**creator** | **String** | A user-defined identifier for the media creator. |  [optional] |
|**duration** | **BigDecimal** | The duration of the video in seconds. A value of &#x60;-1&#x60; means the duration is unknown. The duration becomes available after the upload and before the video is ready. |  [optional] |
|**input** | [**StreamInput**](StreamInput.md) |  |  [optional] |
|**liveInput** | **String** | The live input ID used to upload a video with Stream Live. |  [optional] |
|**maxDurationSeconds** | **Integer** | The maximum duration in seconds for a video upload. Can be set for a video that is not yet uploaded to limit its duration. Uploads that exceed the specified duration will fail during processing. A value of &#x60;-1&#x60; means the value is unknown. |  [optional] |
|**meta** | **Object** | A user modifiable key-value store used to reference other systems of record for managing videos. |  [optional] |
|**modified** | **OffsetDateTime** | The date and time the media item was last modified. |  [optional] |
|**playback** | [**StreamPlayback**](StreamPlayback.md) |  |  [optional] |
|**preview** | **URI** | The video&#39;s preview page URI. This field is omitted until encoding is complete. |  [optional] |
|**readyToStream** | **Boolean** | Indicates whether the video is playable. The field is empty if the video is not ready for viewing or the live stream is still in progress. |  [optional] |
|**readyToStreamAt** | **OffsetDateTime** | Indicates the time at which the video became playable. The field is empty if the video is not ready for viewing or the live stream is still in progress. |  [optional] |
|**requireSignedURLs** | **Boolean** | Indicates whether the video can be a accessed using the UID. When set to &#x60;true&#x60;, a signed token must be generated with a signing key to view the video. |  [optional] |
|**scheduledDeletion** | **OffsetDateTime** | Indicates the date and time at which the video will be deleted. Omit the field to indicate no change, or include with a &#x60;null&#x60; value to remove an existing scheduled deletion. If specified, must be at least 30 days from upload time. |  [optional] |
|**size** | **BigDecimal** | The size of the media item in bytes. |  [optional] |
|**status** | [**StreamMediaStatus**](StreamMediaStatus.md) |  |  [optional] |
|**thumbnail** | **URI** | The media item&#39;s thumbnail URI. This field is omitted until encoding is complete. |  [optional] |
|**thumbnailTimestampPct** | **BigDecimal** | The timestamp for a thumbnail image calculated as a percentage value of the video&#39;s duration. To convert from a second-wise timestamp to a percentage, divide the desired timestamp by the total duration of the video.  If this value is not set, the default thumbnail image is taken from 0s of the video. |  [optional] |
|**uid** | **String** | A Cloudflare-generated unique identifier for a media item. |  [optional] |
|**uploadExpiry** | **OffsetDateTime** | The date and time when the video upload URL is no longer valid for direct user uploads. |  [optional] |
|**uploaded** | **OffsetDateTime** | The date and time the media item was uploaded. |  [optional] |
|**watermark** | [**StreamWatermarks**](StreamWatermarks.md) |  |  [optional] |



