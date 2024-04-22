

# FirewallOverrideResponseCollectionAllOfResult


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**description** | **String** | An informative summary of the current URI-based WAF override. |  [optional] |
|**groups** | **Map&lt;String, Object&gt;** | An object that allows you to enable or disable WAF rule groups for the current WAF override. Each key of this object must be the ID of a WAF rule group, and each value must be a valid WAF action (usually &#x60;default&#x60; or &#x60;disable&#x60;). When creating a new URI-based WAF override, you must provide a &#x60;groups&#x60; object or a &#x60;rules&#x60; object. |  [optional] |
|**id** | **String** | The unique identifier of the WAF override. |  [readonly] |
|**paused** | **Boolean** | When true, indicates that the WAF package is currently paused. |  |
|**priority** | **BigDecimal** | The relative priority of the current URI-based WAF override when multiple overrides match a single URL. A lower number indicates higher priority. Higher priority overrides may overwrite values set by lower priority overrides. |  |
|**rewriteAction** | [**FirewallRewriteAction**](FirewallRewriteAction.md) |  |  [optional] |
|**rules** | **Map&lt;String, FirewallWafAction&gt;** | An object that allows you to override the action of specific WAF rules. Each key of this object must be the ID of a WAF rule, and each value must be a valid WAF action. Unless you are disabling a rule, ensure that you also enable the rule group that this WAF rule belongs to. When creating a new URI-based WAF override, you must provide a &#x60;groups&#x60; object or a &#x60;rules&#x60; object. |  [optional] |
|**urls** | **List&lt;String&gt;** | The URLs to include in the current WAF override. You can use wildcards. Each entered URL will be escaped before use, which means you can only use simple wildcard patterns. |  |



