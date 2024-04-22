

# UrlscannerCreateScanRequest


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**customHeaders** | **Map&lt;String, String&gt;** | Set custom headers |  [optional] |
|**screenshotsResolutions** | [**List&lt;ScreenshotsResolutionsEnum&gt;**](#List&lt;ScreenshotsResolutionsEnum&gt;) | Take multiple screenshots targeting different device types |  [optional] |
|**url** | **String** |  |  |
|**visibility** | [**VisibilityEnum**](#VisibilityEnum) | The option &#x60;Public&#x60; means it will be included in listings like recent scans and search results. &#x60;Unlisted&#x60; means it will not be included in the aforementioned listings, users will need to have the scan&#39;s ID to access it. A a scan will be automatically marked as unlisted if it fails, if it contains potential PII or other sensitive material. |  [optional] |



## Enum: List&lt;ScreenshotsResolutionsEnum&gt;

| Name | Value |
|---- | -----|
| DESKTOP | &quot;desktop&quot; |
| MOBILE | &quot;mobile&quot; |
| TABLET | &quot;tablet&quot; |



## Enum: VisibilityEnum

| Name | Value |
|---- | -----|
| PUBLIC | &quot;Public&quot; |
| UNLISTED | &quot;Unlisted&quot; |



