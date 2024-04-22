

# FirewallCountryConfiguration


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**target** | [**TargetEnum**](#TargetEnum) | The configuration target. You must set the target to &#x60;country&#x60; when specifying a country code in the rule. |  [optional] |
|**value** | **String** | The two-letter ISO-3166-1 alpha-2 code to match. For more information, refer to [IP Access rules: Parameters](https://developers.cloudflare.com/waf/tools/ip-access-rules/parameters/#country). |  [optional] |



## Enum: TargetEnum

| Name | Value |
|---- | -----|
| COUNTRY | &quot;country&quot; |



