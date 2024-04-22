

# UrlscannerCreateScan409ResponseResultTasksInner


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**clientLocation** | **String** | Submitter location |  |
|**clientType** | [**ClientTypeEnum**](#ClientTypeEnum) |  |  |
|**effectiveUrl** | **String** | URL of the primary request, after all HTTP redirects |  |
|**errors** | [**List&lt;UrlscannerSearchScans400ResponseMessagesInner&gt;**](UrlscannerSearchScans400ResponseMessagesInner.md) |  |  |
|**scannedFrom** | [**UrlscannerCreateScan409ResponseResultTasksInnerScannedFrom**](UrlscannerCreateScan409ResponseResultTasksInnerScannedFrom.md) |  |  |
|**status** | [**StatusEnum**](#StatusEnum) |  |  |
|**success** | **Boolean** |  |  |
|**time** | **String** |  |  |
|**timeEnd** | **String** |  |  |
|**url** | **String** | Submitted URL |  |
|**uuid** | **String** | Scan ID |  |
|**visibility** | [**VisibilityEnum**](#VisibilityEnum) |  |  |



## Enum: ClientTypeEnum

| Name | Value |
|---- | -----|
| SITE | &quot;Site&quot; |
| AUTOMATIC | &quot;Automatic&quot; |
| API | &quot;Api&quot; |



## Enum: StatusEnum

| Name | Value |
|---- | -----|
| QUEUED | &quot;Queued&quot; |
| INPROGRESS | &quot;InProgress&quot; |
| INPOSTPROCESSING | &quot;InPostProcessing&quot; |
| FINISHED | &quot;Finished&quot; |



## Enum: VisibilityEnum

| Name | Value |
|---- | -----|
| PUBLIC | &quot;Public&quot; |
| UNLISTED | &quot;Unlisted&quot; |



