

# TeamsDevicesTaniumInputRequest


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**connectionId** | **String** | Posture Integration ID. |  |
|**eidLastSeen** | **String** | For more details on eid last seen, refer to the Tanium documentation. |  [optional] |
|**operator** | [**OperatorEnum**](#OperatorEnum) | Operator to evaluate risk_level or eid_last_seen. |  [optional] |
|**riskLevel** | [**RiskLevelEnum**](#RiskLevelEnum) | For more details on risk level, refer to the Tanium documentation. |  [optional] |
|**scoreOperator** | [**ScoreOperatorEnum**](#ScoreOperatorEnum) | Score Operator |  [optional] |
|**totalScore** | **BigDecimal** | For more details on total score, refer to the Tanium documentation. |  [optional] |



## Enum: OperatorEnum

| Name | Value |
|---- | -----|
| LESS_THAN | &quot;&lt;&quot; |
| LESS_THAN_OR_EQUAL_TO | &quot;&lt;&#x3D;&quot; |
| GREATER_THAN | &quot;&gt;&quot; |
| GREATER_THAN_OR_EQUAL_TO | &quot;&gt;&#x3D;&quot; |
| u | &quot;&#x3D;&#x3D;&quot; |



## Enum: RiskLevelEnum

| Name | Value |
|---- | -----|
| LOW | &quot;low&quot; |
| MEDIUM | &quot;medium&quot; |
| HIGH | &quot;high&quot; |
| CRITICAL | &quot;critical&quot; |



## Enum: ScoreOperatorEnum

| Name | Value |
|---- | -----|
| LESS_THAN | &quot;&lt;&quot; |
| LESS_THAN_OR_EQUAL_TO | &quot;&lt;&#x3D;&quot; |
| GREATER_THAN | &quot;&gt;&quot; |
| GREATER_THAN_OR_EQUAL_TO | &quot;&gt;&#x3D;&quot; |
| u | &quot;&#x3D;&#x3D;&quot; |



