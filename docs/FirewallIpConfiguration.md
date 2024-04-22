

# FirewallIpConfiguration


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**target** | [**TargetEnum**](#TargetEnum) | The configuration target. You must set the target to &#x60;ip&#x60; when specifying an IP address in the rule. |  [optional] |
|**value** | **String** | The IP address to match. This address will be compared to the IP address of incoming requests. |  [optional] |



## Enum: TargetEnum

| Name | Value |
|---- | -----|
| IP | &quot;ip&quot; |



