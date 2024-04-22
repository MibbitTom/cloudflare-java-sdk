

# ZonesUrlTargetConstraint

The constraint of a target.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**operator** | [**OperatorEnum**](#OperatorEnum) | The matches operator can use asterisks and pipes as wildcard and &#39;or&#39; operators. |  |
|**value** | **String** | The URL pattern to match against the current request. The pattern may contain up to four asterisks (&#39;*&#39;) as placeholders. |  |



## Enum: OperatorEnum

| Name | Value |
|---- | -----|
| MATCHES | &quot;matches&quot; |
| CONTAINS | &quot;contains&quot; |
| EQUALS | &quot;equals&quot; |
| NOT_EQUAL | &quot;not_equal&quot; |
| NOT_CONTAIN | &quot;not_contain&quot; |



