

# TeamsDevicesCrowdstrikeInputRequest


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**connectionId** | **String** | Posture Integration ID. |  |
|**lastSeen** | **String** | For more details on last seen, please refer to the Crowdstrike documentation. |  [optional] |
|**operator** | [**OperatorEnum**](#OperatorEnum) | Operator |  [optional] |
|**os** | **String** | Os Version |  [optional] |
|**overall** | **String** | overall |  [optional] |
|**sensorConfig** | **String** | SensorConfig |  [optional] |
|**state** | [**StateEnum**](#StateEnum) | For more details on state, please refer to the Crowdstrike documentation. |  [optional] |
|**version** | **String** | Version |  [optional] |
|**versionOperator** | [**VersionOperatorEnum**](#VersionOperatorEnum) | Version Operator |  [optional] |



## Enum: OperatorEnum

| Name | Value |
|---- | -----|
| LESS_THAN | &quot;&lt;&quot; |
| LESS_THAN_OR_EQUAL_TO | &quot;&lt;&#x3D;&quot; |
| GREATER_THAN | &quot;&gt;&quot; |
| GREATER_THAN_OR_EQUAL_TO | &quot;&gt;&#x3D;&quot; |
| u | &quot;&#x3D;&#x3D;&quot; |



## Enum: StateEnum

| Name | Value |
|---- | -----|
| ONLINE | &quot;online&quot; |
| OFFLINE | &quot;offline&quot; |
| UNKNOWN | &quot;unknown&quot; |



## Enum: VersionOperatorEnum

| Name | Value |
|---- | -----|
| LESS_THAN | &quot;&lt;&quot; |
| LESS_THAN_OR_EQUAL_TO | &quot;&lt;&#x3D;&quot; |
| GREATER_THAN | &quot;&gt;&quot; |
| GREATER_THAN_OR_EQUAL_TO | &quot;&gt;&#x3D;&quot; |
| u | &quot;&#x3D;&#x3D;&quot; |



