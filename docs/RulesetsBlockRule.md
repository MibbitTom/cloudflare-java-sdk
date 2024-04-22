

# RulesetsBlockRule


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**action** | [**ActionEnum**](#ActionEnum) |  |  [optional] |
|**actionParameters** | [**BlockRuleActionParameters**](BlockRuleActionParameters.md) |  |  [optional] |
|**categories** | **Set&lt;String&gt;** | The categories of the rule. |  [optional] [readonly] |
|**description** | **Object** |  |  [optional] |
|**enabled** | [**Boolean**](Boolean.md) |  |  [optional] |
|**expression** | **String** | The expression defining which traffic will match the rule. |  [optional] |
|**id** | **String** | The unique ID of the rule. |  [optional] |
|**lastUpdated** | **OffsetDateTime** | The timestamp of when the rule was last modified. |  [readonly] |
|**logging** | [**Logging**](Logging.md) |  |  [optional] |
|**ref** | **String** | The reference of the rule (the rule ID by default). |  [optional] |
|**version** | **String** | The version of the rule. |  [readonly] |



## Enum: ActionEnum

| Name | Value |
|---- | -----|
| BLOCK | &quot;block&quot; |



