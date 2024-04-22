

# Zones0PatchRequest


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**paused** | **Boolean** | Indicates whether the zone is only using Cloudflare DNS services. A true value means the zone will not receive security or performance benefits.  |  [optional] [readonly] |
|**plan** | [**Zones0PatchRequestPlan**](Zones0PatchRequestPlan.md) |  |  [optional] |
|**type** | [**TypeEnum**](#TypeEnum) | A full zone implies that DNS is hosted with Cloudflare. A partial zone is typically a partner-hosted zone or a CNAME setup. This parameter is only available to Enterprise customers or if it has been explicitly enabled on a zone.  |  [optional] |
|**vanityNameServers** | **List&lt;String&gt;** | An array of domains used for custom name servers. This is only available for Business and Enterprise plans. |  [optional] |



## Enum: TypeEnum

| Name | Value |
|---- | -----|
| FULL | &quot;full&quot; |
| PARTIAL | &quot;partial&quot; |
| SECONDARY | &quot;secondary&quot; |



