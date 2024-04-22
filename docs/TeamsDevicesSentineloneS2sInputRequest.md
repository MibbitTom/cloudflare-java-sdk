

# TeamsDevicesSentineloneS2sInputRequest


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**activeThreats** | **BigDecimal** | The Number of active threats. |  [optional] |
|**connectionId** | **String** | Posture Integration ID. |  |
|**infected** | **Boolean** | Whether device is infected. |  [optional] |
|**isActive** | **Boolean** | Whether device is active. |  [optional] |
|**networkStatus** | [**NetworkStatusEnum**](#NetworkStatusEnum) | Network status of device. |  [optional] |
|**operator** | [**OperatorEnum**](#OperatorEnum) | operator |  [optional] |



## Enum: NetworkStatusEnum

| Name | Value |
|---- | -----|
| CONNECTED | &quot;connected&quot; |
| DISCONNECTED | &quot;disconnected&quot; |
| DISCONNECTING | &quot;disconnecting&quot; |
| CONNECTING | &quot;connecting&quot; |



## Enum: OperatorEnum

| Name | Value |
|---- | -----|
| LESS_THAN | &quot;&lt;&quot; |
| LESS_THAN_OR_EQUAL_TO | &quot;&lt;&#x3D;&quot; |
| GREATER_THAN | &quot;&gt;&quot; |
| GREATER_THAN_OR_EQUAL_TO | &quot;&gt;&#x3D;&quot; |
| u | &quot;&#x3D;&#x3D;&quot; |



