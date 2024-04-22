

# WafRulesUpdateAWafRuleRequest


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**mode** | [**ModeEnum**](#ModeEnum) | The mode/action of the rule when triggered. You must use a value from the &#x60;allowed_modes&#x60; array of the current rule. |  [optional] |



## Enum: ModeEnum

| Name | Value |
|---- | -----|
| DEFAULT | &quot;default&quot; |
| DISABLE | &quot;disable&quot; |
| SIMULATE | &quot;simulate&quot; |
| BLOCK | &quot;block&quot; |
| CHALLENGE | &quot;challenge&quot; |
| ON | &quot;on&quot; |
| OFF | &quot;off&quot; |



