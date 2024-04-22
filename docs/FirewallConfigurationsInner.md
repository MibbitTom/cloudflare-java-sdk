

# FirewallConfigurationsInner


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**target** | [**TargetEnum**](#TargetEnum) | The configuration target. You must set the target to &#x60;ip_range&#x60; when specifying an IP address range in the Zone Lockdown rule. |  [optional] |
|**value** | **String** | The IP address range to match. You can only use prefix lengths &#x60;/16&#x60; and &#x60;/24&#x60;. |  [optional] |



## Enum: TargetEnum

| Name | Value |
|---- | -----|
| IP_RANGE | &quot;ip_range&quot; |



