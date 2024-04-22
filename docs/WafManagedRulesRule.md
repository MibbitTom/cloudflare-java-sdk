

# WafManagedRulesRule


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**description** | **String** | The public description of the WAF rule. |  [readonly] |
|**group** | [**WafManagedRulesBaseGroup**](WafManagedRulesBaseGroup.md) |  |  |
|**id** | **String** | The unique identifier of the WAF rule. |  [readonly] |
|**packageId** | **String** | The unique identifier of a WAF package. |  [readonly] |
|**priority** | **String** | The order in which the individual WAF rule is executed within its rule group. |  [readonly] |
|**allowedModes** | **List&lt;WafManagedRulesModeAllowTraditional&gt;** | Defines the available modes for the current WAF rule. |  [readonly] |
|**mode** | **WafManagedRulesModeAllowTraditional** |  |  |
|**defaultMode** | **WafManagedRulesDefaultMode** |  |  |



