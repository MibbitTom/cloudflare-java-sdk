

# DigitalExperienceMonitoringTracerouteDetailsResponse


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**host** | **String** | The host of the Traceroute synthetic application test |  |
|**interval** | **String** | The interval at which the Traceroute synthetic application test is set to run. |  |
|**kind** | [**KindEnum**](#KindEnum) |  |  |
|**name** | **String** | The name of the Traceroute synthetic application test |  |
|**targetPolicies** | [**List&lt;DigitalExperienceMonitoringHttpDetailsResponseTargetPoliciesInner&gt;**](DigitalExperienceMonitoringHttpDetailsResponseTargetPoliciesInner.md) |  |  [optional] |
|**targeted** | **Boolean** |  |  [optional] |
|**tracerouteStats** | [**DigitalExperienceMonitoringTracerouteDetailsResponseTracerouteStats**](DigitalExperienceMonitoringTracerouteDetailsResponseTracerouteStats.md) |  |  [optional] |
|**tracerouteStatsByColo** | [**List&lt;DigitalExperienceMonitoringTracerouteDetailsResponseTracerouteStatsByColoInner&gt;**](DigitalExperienceMonitoringTracerouteDetailsResponseTracerouteStatsByColoInner.md) |  |  [optional] |



## Enum: KindEnum

| Name | Value |
|---- | -----|
| TRACEROUTE | &quot;traceroute&quot; |



