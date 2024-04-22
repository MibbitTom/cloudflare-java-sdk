

# WafManagedRulesTraditionalDenyRule

When triggered, traditional WAF rules cause the firewall to immediately act upon the request based on the configuration of the rule. A 'deny' rule will immediately respond to the request based on the configured rule action/mode (for example, 'block') and no other rules will be processed.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**description** | **String** | The public description of the WAF rule. |  [readonly] |
|**group** | [**WafManagedRulesBaseGroup**](WafManagedRulesBaseGroup.md) |  |  |
|**id** | **String** | The unique identifier of the WAF rule. |  [readonly] |
|**packageId** | **String** | The unique identifier of a WAF package. |  [readonly] |
|**priority** | **String** | The order in which the individual WAF rule is executed within its rule group. |  [readonly] |
|**allowedModes** | **List&lt;WafManagedRulesModeDenyTraditional&gt;** | The list of possible actions of the WAF rule when it is triggered. |  [readonly] |
|**defaultMode** | **WafManagedRulesDefaultMode** |  |  |
|**mode** | **WafManagedRulesModeDenyTraditional** |  |  |



