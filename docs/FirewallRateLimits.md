

# FirewallRateLimits


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**action** | [**FirewallAction**](FirewallAction.md) |  |  [optional] |
|**bypass** | [**List&lt;FirewallBypassInner&gt;**](FirewallBypassInner.md) | Criteria specifying when the current rate limit should be bypassed. You can specify that the rate limit should not apply to one or more URLs. |  [optional] |
|**description** | **String** | An informative summary of the rate limit. This value is sanitized and any tags will be removed. |  [optional] |
|**disabled** | **Boolean** | When true, indicates that the rate limit is currently disabled. |  [optional] |
|**id** | **String** | The unique identifier of the rate limit. |  [optional] [readonly] |
|**match** | [**FirewallMatch**](FirewallMatch.md) |  |  [optional] |
|**period** | **BigDecimal** | The time in seconds (an integer value) to count matching traffic. If the count exceeds the configured threshold within this period, Cloudflare will perform the configured action. |  [optional] |
|**threshold** | **BigDecimal** | The threshold that will trigger the configured mitigation action. Configure this value along with the &#x60;period&#x60; property to establish a threshold per period. |  [optional] |



