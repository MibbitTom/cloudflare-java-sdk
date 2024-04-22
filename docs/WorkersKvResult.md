

# WorkersKvResult

Metrics on Workers KV requests.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**data** | [**List&lt;WorkersKvResultDataInner&gt;**](WorkersKvResultDataInner.md) |  |  |
|**dataLag** | **BigDecimal** | Number of seconds between current time and last processed event, i.e. how many seconds of data could be missing. |  |
|**max** | **Object** | Maximum results for each metric. |  |
|**min** | **Object** | Minimum results for each metric. |  |
|**query** | [**WorkersKvQuery**](WorkersKvQuery.md) |  |  |
|**rows** | **BigDecimal** | Total number of rows in the result. |  |
|**totals** | **Object** | Total results for metrics across all data. |  |



