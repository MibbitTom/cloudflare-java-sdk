

# DigitalExperienceMonitoringHttpDetailsResponse


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**host** | **String** | The url of the HTTP synthetic application test |  [optional] |
|**httpStats** | [**DigitalExperienceMonitoringHttpDetailsResponseHttpStats**](DigitalExperienceMonitoringHttpDetailsResponseHttpStats.md) |  |  [optional] |
|**httpStatsByColo** | [**List&lt;DigitalExperienceMonitoringHttpDetailsResponseHttpStatsByColoInner&gt;**](DigitalExperienceMonitoringHttpDetailsResponseHttpStatsByColoInner.md) |  |  [optional] |
|**interval** | **String** | The interval at which the HTTP synthetic application test is set to run. |  [optional] |
|**kind** | [**KindEnum**](#KindEnum) |  |  [optional] |
|**method** | **String** | The HTTP method to use when running the test |  [optional] |
|**name** | **String** | The name of the HTTP synthetic application test |  [optional] |
|**targetPolicies** | [**List&lt;DigitalExperienceMonitoringHttpDetailsResponseTargetPoliciesInner&gt;**](DigitalExperienceMonitoringHttpDetailsResponseTargetPoliciesInner.md) |  |  [optional] |
|**targeted** | **Boolean** |  |  [optional] |



## Enum: KindEnum

| Name | Value |
|---- | -----|
| HTTP | &quot;http&quot; |



