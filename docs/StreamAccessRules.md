

# StreamAccessRules

Defines rules for fine-grained control over content than signed URL tokens alone. Access rules primarily make tokens conditionally valid based on user information. Access Rules are specified on token payloads as the `accessRules` property containing an array of Rule objects.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**action** | [**ActionEnum**](#ActionEnum) | The action to take when a request matches a rule. If the action is &#x60;block&#x60;, the signed token blocks views for viewers matching the rule. |  [optional] |
|**country** | **List&lt;String&gt;** | An array of 2-letter country codes in ISO 3166-1 Alpha-2 format used to match requests. |  [optional] |
|**ip** | **List&lt;String&gt;** | An array of IPv4 or IPV6 addresses or CIDRs used to match requests. |  [optional] |
|**type** | [**TypeEnum**](#TypeEnum) | Lists available rule types to match for requests. An &#x60;any&#x60; type matches all requests and can be used as a wildcard to apply default actions after other rules. |  [optional] |



## Enum: ActionEnum

| Name | Value |
|---- | -----|
| ALLOW | &quot;allow&quot; |
| BLOCK | &quot;block&quot; |



## Enum: TypeEnum

| Name | Value |
|---- | -----|
| ANY | &quot;any&quot; |
| IP_SRC | &quot;ip.src&quot; |
| IP_GEOIP_COUNTRY | &quot;ip.geoip.country&quot; |



