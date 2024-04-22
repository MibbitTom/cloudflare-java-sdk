

# FirewallSchemasConfiguration

The configuration object for the current rule.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**target** | **String** | The configuration target for this rule. You must set the target to &#x60;ua&#x60; for User Agent Blocking rules. |  [optional] |
|**value** | **String** | The exact user agent string to match. This value will be compared to the received &#x60;User-Agent&#x60; HTTP header value. |  [optional] |



