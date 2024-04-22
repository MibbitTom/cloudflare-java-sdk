

# StreamWatermarks


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**created** | **OffsetDateTime** | The date and a time a watermark profile was created. |  [optional] |
|**downloadedFrom** | **String** | The source URL for a downloaded image. If the watermark profile was created via direct upload, this field is null. |  [optional] |
|**height** | **Integer** | The height of the image in pixels. |  [optional] |
|**name** | **String** | A short description of the watermark profile. |  [optional] |
|**opacity** | **BigDecimal** | The translucency of the image. A value of &#x60;0.0&#x60; makes the image completely transparent, and &#x60;1.0&#x60; makes the image completely opaque. Note that if the image is already semi-transparent, setting this to &#x60;1.0&#x60; will not make the image completely opaque. |  [optional] |
|**padding** | **BigDecimal** | The whitespace between the adjacent edges (determined by position) of the video and the image. &#x60;0.0&#x60; indicates no padding, and &#x60;1.0&#x60; indicates a fully padded video width or length, as determined by the algorithm. |  [optional] |
|**position** | **String** | The location of the image. Valid positions are: &#x60;upperRight&#x60;, &#x60;upperLeft&#x60;, &#x60;lowerLeft&#x60;, &#x60;lowerRight&#x60;, and &#x60;center&#x60;. Note that &#x60;center&#x60; ignores the &#x60;padding&#x60; parameter. |  [optional] |
|**scale** | **BigDecimal** | The size of the image relative to the overall size of the video. This parameter will adapt to horizontal and vertical videos automatically. &#x60;0.0&#x60; indicates no scaling (use the size of the image as-is), and &#x60;1.0 &#x60;fills the entire video. |  [optional] |
|**size** | **BigDecimal** | The size of the image in bytes. |  [optional] |
|**uid** | **String** | The unique identifier for a watermark profile. |  [optional] |
|**width** | **Integer** | The width of the image in pixels. |  [optional] |



