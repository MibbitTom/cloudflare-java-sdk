

# LoadBalancingRulesInnerFixedResponse

A collection of fields used to directly respond to the eyeball instead of routing to a pool. If a fixed_response is supplied the rule will be marked as terminates.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**contentType** | **String** | The http &#39;Content-Type&#39; header to include in the response. |  [optional] |
|**location** | **String** | The http &#39;Location&#39; header to include in the response. |  [optional] |
|**messageBody** | **String** | Text to include as the http body. |  [optional] |
|**statusCode** | **Integer** | The http status code to respond with. |  [optional] |



