

# RequestTracerTraceInner

List of steps acting on request/response

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**action** | **String** | If step type is rule, then action performed by this rule |  [optional] |
|**actionParameters** | **Object** | If step type is rule, then action parameters of this rule as JSON |  [optional] |
|**description** | **String** | If step type is rule or ruleset, the description of this entity |  [optional] |
|**expression** | **String** | If step type is rule, then expression used to match for this rule |  [optional] |
|**kind** | **String** | If step type is ruleset, then kind of this ruleset |  [optional] |
|**matched** | **Boolean** | Whether tracing step affected tracing request/response |  [optional] |
|**name** | **String** | If step type is ruleset, then name of this ruleset |  [optional] |
|**stepName** | **String** | Tracing step identifying name |  [optional] |
|**trace** | [**List&lt;RequestTracerTraceInner&gt;**](RequestTracerTraceInner.md) |  |  [optional] |
|**type** | **String** | Tracing step type |  [optional] |



