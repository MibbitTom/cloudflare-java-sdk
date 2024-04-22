

# DigitalExperienceMonitoringTestsResponseTestsInner


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**created** | **String** | date the test was created. |  |
|**description** | **String** | the test description defined during configuration |  |
|**enabled** | **Boolean** | if true, then the test will run on targeted devices. Else, the test will not run. |  |
|**host** | **String** |  |  |
|**httpResults** | [**DigitalExperienceMonitoringTestsResponseTestsInnerHttpResults**](DigitalExperienceMonitoringTestsResponseTestsInnerHttpResults.md) |  |  [optional] |
|**httpResultsByColo** | [**List&lt;DigitalExperienceMonitoringTestsResponseTestsInnerHttpResultsByColoInner&gt;**](DigitalExperienceMonitoringTestsResponseTestsInnerHttpResultsByColoInner.md) |  |  [optional] |
|**id** | **String** | API Resource UUID tag. |  |
|**interval** | **String** | The interval at which the synthetic application test is set to run. |  |
|**kind** | [**KindEnum**](#KindEnum) | test type, http or traceroute |  |
|**method** | **String** | for HTTP, the method to use when running the test |  [optional] |
|**name** | **String** | name given to this test |  |
|**targetPolicies** | [**List&lt;DigitalExperienceMonitoringHttpDetailsResponseTargetPoliciesInner&gt;**](DigitalExperienceMonitoringHttpDetailsResponseTargetPoliciesInner.md) |  |  [optional] |
|**targeted** | **Boolean** |  |  [optional] |
|**tracerouteResults** | [**DigitalExperienceMonitoringTestsResponseTestsInnerTracerouteResults**](DigitalExperienceMonitoringTestsResponseTestsInnerTracerouteResults.md) |  |  [optional] |
|**tracerouteResultsByColo** | [**List&lt;DigitalExperienceMonitoringTestsResponseTestsInnerTracerouteResultsByColoInner&gt;**](DigitalExperienceMonitoringTestsResponseTestsInnerTracerouteResultsByColoInner.md) |  |  [optional] |
|**updated** | **String** |  |  |



## Enum: KindEnum

| Name | Value |
|---- | -----|
| HTTP | &quot;http&quot; |
| TRACEROUTE | &quot;traceroute&quot; |



