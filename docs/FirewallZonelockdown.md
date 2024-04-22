

# FirewallZonelockdown


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**configurations** | [**List&lt;FirewallConfigurationsInner&gt;**](FirewallConfigurationsInner.md) | A list of IP addresses or CIDR ranges that will be allowed to access the URLs specified in the Zone Lockdown rule. You can include any number of &#x60;ip&#x60; or &#x60;ip_range&#x60; configurations. |  |
|**createdOn** | **OffsetDateTime** | The timestamp of when the rule was created. |  [readonly] |
|**description** | **String** | An informative summary of the rule. |  |
|**id** | **String** | The unique identifier of the Zone Lockdown rule. |  [readonly] |
|**modifiedOn** | **OffsetDateTime** | The timestamp of when the rule was last modified. |  [readonly] |
|**paused** | **Boolean** | When true, indicates that the rule is currently paused. |  |
|**urls** | **List&lt;String&gt;** | The URLs to include in the rule definition. You can use wildcards. Each entered URL will be escaped before use, which means you can only use simple wildcard patterns. |  |



