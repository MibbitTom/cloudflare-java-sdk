

# WorkersKvStoredDataAnalyticsQueryStoredDataAnalyticsQueryParameter


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**dimensions** | [**List&lt;DimensionsEnum&gt;**](#List&lt;DimensionsEnum&gt;) |  |  [optional] |
|**filters** | **Object** |  |  [optional] |
|**limit** | **Integer** | Limit number of returned metrics. |  [optional] |
|**metrics** | [**List&lt;MetricsEnum&gt;**](#List&lt;MetricsEnum&gt;) |  |  [optional] |
|**since** | **OffsetDateTime** | Start of time interval to query, defaults to 6 hours before request received. |  [optional] |
|**sort** | **Object** |  |  [optional] |
|**until** | **OffsetDateTime** | End of time interval to query, defaults to current time. |  [optional] |



## Enum: List&lt;DimensionsEnum&gt;

| Name | Value |
|---- | -----|
| NAMESPACEID | &quot;namespaceId&quot; |



## Enum: List&lt;MetricsEnum&gt;

| Name | Value |
|---- | -----|
| STOREDBYTES | &quot;storedBytes&quot; |
| STOREDKEYS | &quot;storedKeys&quot; |



