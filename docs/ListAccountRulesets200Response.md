

# ListAccountRulesets200Response


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**errors** | [**ErrorsEnum**](#ErrorsEnum) |  |  |
|**messages** | [**List&lt;RulesetsMessage&gt;**](RulesetsMessage.md) | A list of warning messages. |  |
|**result** | [**List&lt;RulesetsInner&gt;**](RulesetsInner.md) | A list of rulesets. The returned information will not include the rules in each ruleset. |  |
|**success** | [**SuccessEnum**](#SuccessEnum) |  |  |



## Enum: ErrorsEnum

| Name | Value |
|---- | -----|
| u | &quot;[]&quot; |



## Enum: SuccessEnum

| Name | Value |
|---- | -----|
| TRUE | &quot;true&quot; |



