

# DnsAnalyticsReportBytime


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**data** | [**List&lt;DnsAnalyticsReportBytimeAllOfData&gt;**](DnsAnalyticsReportBytimeAllOfData.md) |  |  |
|**dataLag** | **BigDecimal** | Number of seconds between current time and last processed event, in another words how many seconds of data could be missing. |  |
|**max** | **Object** | Maximum results for each metric (object mapping metric names to values). Currently always an empty object. |  |
|**min** | **Object** | Minimum results for each metric (object mapping metric names to values). Currently always an empty object. |  |
|**query** | [**DnsAnalyticsReportBytimeAllOfQuery**](DnsAnalyticsReportBytimeAllOfQuery.md) |  |  |
|**rows** | **BigDecimal** | Total number of rows in the result. |  |
|**totals** | **Object** | Total results for metrics across all data (object mapping metric names to values). |  |
|**timeIntervals** | **List&lt;List&lt;OffsetDateTime&gt;&gt;** | Array of time intervals in the response data. Each interval is represented as an array containing two values: the start time, and the end time.  |  |



