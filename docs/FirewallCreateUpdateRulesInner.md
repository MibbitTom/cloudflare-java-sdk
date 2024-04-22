

# FirewallCreateUpdateRulesInner


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**action** | **String** | The action to perform when the rule matches. |  |
|**actionParameters** | **Object** | The parameters configuring the rule action. |  [optional] |
|**description** | **String** | An informative description of the rule. |  [optional] |
|**enabled** | **Boolean** | Whether the rule should be executed. |  [optional] |
|**expression** | **String** | The expression defining which traffic will match the rule. |  |
|**logging** | [**FirewallLogging**](FirewallLogging.md) |  |  [optional] |
|**ref** | **String** | The reference of the rule (the rule ID by default). |  [optional] |



