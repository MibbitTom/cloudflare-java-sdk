

# UpdateAccountEntrypointRulesetRequest


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**description** | **String** | An informative description of the ruleset. |  [optional] |
|**id** | [**String**](String.md) |  |  |
|**kind** | **RulesetsRulesetKind** |  |  [optional] |
|**lastUpdated** | **OffsetDateTime** | The timestamp of when the ruleset was last modified. |  [readonly] |
|**name** | **String** | The human-readable name of the ruleset. |  [optional] |
|**phase** | **RulesetsRulesetPhase** |  |  [optional] |
|**version** | **String** | The version of the ruleset. |  [readonly] |
|**rules** | [**List&lt;RulesetsRequestRule&gt;**](RulesetsRequestRule.md) | The list of rules in the ruleset. |  |



