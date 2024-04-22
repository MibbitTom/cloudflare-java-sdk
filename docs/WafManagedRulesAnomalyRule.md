

# WafManagedRulesAnomalyRule

When triggered, anomaly detection WAF rules contribute to an overall threat score that will determine if a request is considered malicious. You can configure the total scoring threshold through the 'sensitivity' property of the WAF package.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**description** | **String** | The public description of the WAF rule. |  [readonly] |
|**group** | [**WafManagedRulesBaseGroup**](WafManagedRulesBaseGroup.md) |  |  |
|**id** | **String** | The unique identifier of the WAF rule. |  [readonly] |
|**packageId** | **String** | The unique identifier of a WAF package. |  [readonly] |
|**priority** | **String** | The order in which the individual WAF rule is executed within its rule group. |  [readonly] |
|**allowedModes** | **List&lt;WafManagedRulesModeAnomaly&gt;** | Defines the available modes for the current WAF rule. Applies to anomaly detection WAF rules. |  [readonly] |
|**mode** | **WafManagedRulesModeAnomaly** |  |  |



