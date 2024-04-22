

# FirewallFilterRulesSingleResponseDeleteAllOfResult


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**action** | **FirewallSchemasAction** |  |  [optional] |
|**description** | **String** | An informative summary of the firewall rule. |  [optional] |
|**id** | **String** | The unique identifier of the firewall rule. |  [readonly] |
|**paused** | **Boolean** | When true, indicates that the firewall rule is currently paused. |  [optional] |
|**priority** | **BigDecimal** | The priority of the rule. Optional value used to define the processing order. A lower number indicates a higher priority. If not provided, rules with a defined priority will be processed before rules without a priority. |  [optional] |
|**products** | [**List&lt;ProductsEnum&gt;**](#List&lt;ProductsEnum&gt;) |  |  [optional] |
|**ref** | **String** | A short reference tag. Allows you to select related firewall rules. |  [optional] |
|**filter** | [**FirewallFilterRuleResponseAllOfFilter**](FirewallFilterRuleResponseAllOfFilter.md) |  |  [optional] |



## Enum: List&lt;ProductsEnum&gt;

| Name | Value |
|---- | -----|
| ZONELOCKDOWN | &quot;zoneLockdown&quot; |
| UABLOCK | &quot;uaBlock&quot; |
| BIC | &quot;bic&quot; |
| HOT | &quot;hot&quot; |
| SECURITYLEVEL | &quot;securityLevel&quot; |
| RATELIMIT | &quot;rateLimit&quot; |
| WAF | &quot;waf&quot; |



