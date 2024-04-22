

# WafManagedRulesTraditionalAllowRule

When triggered, traditional WAF rules cause the firewall to immediately act on the request based on the rule configuration. An 'allow' rule will immediately allow the request and no other rules will be processed.

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


