

# DnsAnalyticsReport


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**data** | [**List&lt;DnsAnalyticsReportAllOfData&gt;**](DnsAnalyticsReportAllOfData.md) |  |  |
|**dataLag** | **BigDecimal** | Number of seconds between current time and last processed event, in another words how many seconds of data could be missing. |  |
|**max** | **Object** | Maximum results for each metric (object mapping metric names to values). Currently always an empty object. |  |
|**min** | **Object** | Minimum results for each metric (object mapping metric names to values). Currently always an empty object. |  |
|**query** | [**DnsAnalyticsQuery**](DnsAnalyticsQuery.md) |  |  |
|**rows** | **BigDecimal** | Total number of rows in the result. |  |
|**totals** | **Object** | Total results for metrics across all data (object mapping metric names to values). |  |



