

# LoadBalancerPoolsCreatePoolRequest


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**checkRegions** | [**List&lt;CheckRegionsEnum&gt;**](#List&lt;CheckRegionsEnum&gt;) | A list of regions from which to run health checks. Null means every Cloudflare data center. |  [optional] |
|**description** | **String** | A human-readable description of the pool. |  [optional] |
|**enabled** | **Boolean** | Whether to enable (the default) or disable this pool. Disabled pools will not receive traffic and are excluded from health checks. Disabling a pool will cause any load balancers using it to failover to the next pool (if any). |  [optional] |
|**latitude** | **BigDecimal** | The latitude of the data center containing the origins used in this pool in decimal degrees. If this is set, longitude must also be set. |  [optional] |
|**loadShedding** | [**LoadBalancingLoadShedding**](LoadBalancingLoadShedding.md) |  |  [optional] |
|**longitude** | **BigDecimal** | The longitude of the data center containing the origins used in this pool in decimal degrees. If this is set, latitude must also be set. |  [optional] |
|**minimumOrigins** | **Integer** | The minimum number of origins that must be healthy for this pool to serve traffic. If the number of healthy origins falls below this number, the pool will be marked unhealthy and will failover to the next available pool. |  [optional] |
|**monitor** | **Object** | The ID of the Monitor to use for checking the health of origins within this pool. |  [optional] |
|**name** | **String** | A short name (tag) for the pool. Only alphanumeric characters, hyphens, and underscores are allowed. |  |
|**notificationEmail** | **String** | This field is now deprecated. It has been moved to Cloudflare&#39;s Centralized Notification service https://developers.cloudflare.com/fundamentals/notifications/. The email address to send health status notifications to. This can be an individual mailbox or a mailing list. Multiple emails can be supplied as a comma delimited list. |  [optional] |
|**notificationFilter** | [**LoadBalancingNotificationFilter**](LoadBalancingNotificationFilter.md) |  |  [optional] |
|**originSteering** | [**LoadBalancingOriginSteering**](LoadBalancingOriginSteering.md) |  |  [optional] |
|**origins** | [**List&lt;LoadBalancingOrigin&gt;**](LoadBalancingOrigin.md) | The list of origins within this pool. Traffic directed at this pool is balanced across all currently healthy origins, provided the pool itself is healthy. |  |



## Enum: List&lt;CheckRegionsEnum&gt;

| Name | Value |
|---- | -----|
| WNAM | &quot;WNAM&quot; |
| ENAM | &quot;ENAM&quot; |
| WEU | &quot;WEU&quot; |
| EEU | &quot;EEU&quot; |
| NSAM | &quot;NSAM&quot; |
| SSAM | &quot;SSAM&quot; |
| OC | &quot;OC&quot; |
| ME | &quot;ME&quot; |
| NAF | &quot;NAF&quot; |
| SAF | &quot;SAF&quot; |
| SAS | &quot;SAS&quot; |
| SEAS | &quot;SEAS&quot; |
| NEAS | &quot;NEAS&quot; |
| ALL_REGIONS | &quot;ALL_REGIONS&quot; |



