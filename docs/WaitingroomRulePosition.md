

# WaitingroomRulePosition

Reorder the position of a rule

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**index** | **Integer** |  Places the rule in the exact position specified by the integer number &lt;POSITION_NUMBER&gt;. Position numbers start with 1. Existing rules in the ruleset from the specified position number onward are shifted one position (no rule is overwritten). |  [optional] |
|**before** | **String** |  Places the rule before rule &lt;RULE_ID&gt;. Use this argument with an empty rule ID value (\&quot;\&quot;) to set the rule as the first rule in the ruleset. |  [optional] |
|**after** | **String** | Places the rule after rule &lt;RULE_ID&gt;. Use this argument with an empty rule ID value (\&quot;\&quot;) to set the rule as the last rule in the ruleset. |  [optional] |



