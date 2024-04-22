

# StreamVideoCopyRequest


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**allowedOrigins** | **List&lt;String&gt;** | Lists the origins allowed to display the video. Enter allowed origin domains in an array and use &#x60;*&#x60; for wildcard subdomains. Empty arrays allow the video to be viewed on any origin. |  [optional] |
|**creator** | **String** | A user-defined identifier for the media creator. |  [optional] |
|**meta** | **Object** | A user modifiable key-value store used to reference other systems of record for managing videos. |  [optional] |
|**requireSignedURLs** | **Boolean** | Indicates whether the video can be a accessed using the UID. When set to &#x60;true&#x60;, a signed token must be generated with a signing key to view the video. |  [optional] |
|**scheduledDeletion** | **OffsetDateTime** | Indicates the date and time at which the video will be deleted. Omit the field to indicate no change, or include with a &#x60;null&#x60; value to remove an existing scheduled deletion. If specified, must be at least 30 days from upload time. |  [optional] |
|**thumbnailTimestampPct** | **BigDecimal** | The timestamp for a thumbnail image calculated as a percentage value of the video&#39;s duration. To convert from a second-wise timestamp to a percentage, divide the desired timestamp by the total duration of the video.  If this value is not set, the default thumbnail image is taken from 0s of the video. |  [optional] |
|**url** | **URI** | A video&#39;s URL. The server must be publicly routable and support &#x60;HTTP HEAD&#x60; requests and &#x60;HTTP GET&#x60; range requests. The server should respond to &#x60;HTTP HEAD&#x60; requests with a &#x60;content-range&#x60; header that includes the size of the file. |  |
|**watermark** | [**StreamWatermarkAtUpload**](StreamWatermarkAtUpload.md) |  |  [optional] |



