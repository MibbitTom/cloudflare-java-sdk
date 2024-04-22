

# DataZoneAnalyticsApiQueryResponse

The exact parameters/timestamps the analytics service used to return data.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**since** | [**DataZoneAnalyticsApiSince**](DataZoneAnalyticsApiSince.md) |  |  [optional] |
|**timeDelta** | **Integer** | The amount of time (in minutes) that each data point in the timeseries represents. The granularity of the time-series returned (e.g. each bucket in the time series representing 1-minute vs 1-day) is calculated by the API based on the time-range provided to the API. |  [optional] |
|**until** | [**DataZoneAnalyticsApiUntil**](DataZoneAnalyticsApiUntil.md) |  |  [optional] |



