

# ZeroTrustGatewayRules


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**action** | **ZeroTrustGatewayAction** |  |  [optional] |
|**createdAt** | **OffsetDateTime** |  |  [optional] [readonly] |
|**deletedAt** | **OffsetDateTime** | Date of deletion, if any. |  [optional] [readonly] |
|**description** | **String** | The description of the rule. |  [optional] |
|**devicePosture** | **String** | The wirefilter expression used for device posture check matching. |  [optional] |
|**enabled** | **Boolean** | True if the rule is enabled. |  [optional] |
|**filters** | [**List&lt;FiltersEnum&gt;**](#List&lt;FiltersEnum&gt;) | The protocol or layer to evaluate the traffic, identity, and device posture expressions. |  [optional] |
|**id** | **String** | The API resource UUID. |  [optional] |
|**identity** | **String** | The wirefilter expression used for identity matching. |  [optional] |
|**name** | **String** | The name of the rule. |  [optional] |
|**precedence** | **Integer** | Precedence sets the order of your rules. Lower values indicate higher precedence. At each processing phase, applicable rules are evaluated in ascending order of this value. |  [optional] |
|**ruleSettings** | [**ZeroTrustGatewayRuleSettings**](ZeroTrustGatewayRuleSettings.md) |  |  [optional] |
|**schedule** | [**ZeroTrustGatewaySchedule**](ZeroTrustGatewaySchedule.md) |  |  [optional] |
|**traffic** | **String** | The wirefilter expression used for traffic matching. |  [optional] |
|**updatedAt** | **OffsetDateTime** |  |  [optional] [readonly] |



## Enum: List&lt;FiltersEnum&gt;

| Name | Value |
|---- | -----|
| HTTP | &quot;http&quot; |
| DNS | &quot;dns&quot; |
| L4 | &quot;l4&quot; |
| EGRESS | &quot;egress&quot; |



