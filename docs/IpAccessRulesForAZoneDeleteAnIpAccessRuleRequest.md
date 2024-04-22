

# IpAccessRulesForAZoneDeleteAnIpAccessRuleRequest


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**cascade** | [**CascadeEnum**](#CascadeEnum) | The level to attempt to delete similar rules defined for other zones with the same owner. The default value is &#x60;none&#x60;, which will only delete the current rule. Using &#x60;basic&#x60; will delete rules that match the same action (mode) and configuration, while using &#x60;aggressive&#x60; will delete rules that match the same configuration. |  [optional] |



## Enum: CascadeEnum

| Name | Value |
|---- | -----|
| NONE | &quot;none&quot; |
| BASIC | &quot;basic&quot; |
| AGGRESSIVE | &quot;aggressive&quot; |



