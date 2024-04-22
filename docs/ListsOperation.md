

# ListsOperation


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**completed** | **String** | The RFC 3339 timestamp of when the operation was completed. |  [optional] [readonly] |
|**error** | **String** | A message describing the error when the status is &#x60;failed&#x60;. |  [optional] [readonly] |
|**id** | **String** | The unique operation ID of the asynchronous action. |  [readonly] |
|**status** | [**StatusEnum**](#StatusEnum) | The current status of the asynchronous operation. |  [readonly] |



## Enum: StatusEnum

| Name | Value |
|---- | -----|
| PENDING | &quot;pending&quot; |
| RUNNING | &quot;running&quot; |
| COMPLETED | &quot;completed&quot; |
| FAILED | &quot;failed&quot; |



