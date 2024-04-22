

# FirewallSchemasRule


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**allowedModes** | **List&lt;FirewallSchemasMode&gt;** | The available actions that a rule can apply to a matched request. |  [readonly] |
|**_configuration** | [**FirewallConfiguration**](FirewallConfiguration.md) |  |  |
|**createdOn** | **OffsetDateTime** | The timestamp of when the rule was created. |  [optional] [readonly] |
|**id** | **String** | The unique identifier of the IP Access rule. |  [readonly] |
|**mode** | **FirewallSchemasMode** |  |  |
|**modifiedOn** | **OffsetDateTime** | The timestamp of when the rule was last modified. |  [optional] [readonly] |
|**notes** | **String** | An informative summary of the rule, typically used as a reminder or explanation. |  [optional] |
|**scope** | [**FirewallSchemasRuleAllOfScope**](FirewallSchemasRuleAllOfScope.md) |  |  |



