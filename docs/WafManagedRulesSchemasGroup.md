

# WafManagedRulesSchemasGroup


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**description** | **String** | An informative summary of what the rule group does. |  [readonly] |
|**id** | **String** | The unique identifier of the rule group. |  [readonly] |
|**modifiedRulesCount** | **BigDecimal** | The number of rules within the group that have been modified from their default configuration. |  [optional] [readonly] |
|**name** | **String** | The name of the rule group. |  [readonly] |
|**packageId** | **String** | The unique identifier of a WAF package. |  [optional] [readonly] |
|**rulesCount** | **BigDecimal** | The number of rules in the current rule group. |  [readonly] |
|**allowedModes** | **List&lt;WafManagedRulesMode&gt;** | The available states for the rule group. |  [optional] [readonly] |
|**mode** | **WafManagedRulesMode** |  |  |


