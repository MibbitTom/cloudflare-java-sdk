

# EmailRuleProperties


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**actions** | [**List&lt;EmailRuleAction&gt;**](EmailRuleAction.md) | List actions patterns. |  [optional] |
|**enabled** | **Boolean** | Routing rule status. |  [optional] |
|**id** | **String** | Routing rule identifier. |  [optional] [readonly] |
|**matchers** | [**List&lt;EmailRuleMatcher&gt;**](EmailRuleMatcher.md) | Matching patterns to forward to your actions. |  [optional] |
|**name** | **String** | Routing rule name. |  [optional] |
|**priority** | **BigDecimal** | Priority of the routing rule. |  [optional] |
|**tag** | **String** | Routing rule tag. (Deprecated, replaced by routing rule identifier) |  [optional] [readonly] |



