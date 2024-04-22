

# ApiShieldOperationFeatureThresholdsThresholds


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**authIdTokens** | **Integer** | The total number of auth-ids seen across this calculation. |  [optional] [readonly] |
|**dataPoints** | **Integer** | The number of data points used for the threshold suggestion calculation. |  [optional] [readonly] |
|**lastUpdated** | **OffsetDateTime** |  |  [optional] [readonly] |
|**p50** | **Integer** | The p50 quantile of requests (in period_seconds). |  [optional] [readonly] |
|**p90** | **Integer** | The p90 quantile of requests (in period_seconds). |  [optional] [readonly] |
|**p99** | **Integer** | The p99 quantile of requests (in period_seconds). |  [optional] [readonly] |
|**periodSeconds** | **Integer** | The period over which this threshold is suggested. |  [optional] [readonly] |
|**requests** | **Integer** | The estimated number of requests covered by these calculations. |  [optional] [readonly] |
|**suggestedThreshold** | **Integer** | The suggested threshold in requests done by the same auth_id or period_seconds. |  [optional] [readonly] |



