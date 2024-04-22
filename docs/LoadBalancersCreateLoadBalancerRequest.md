

# LoadBalancersCreateLoadBalancerRequest


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**adaptiveRouting** | [**LoadBalancingAdaptiveRouting**](LoadBalancingAdaptiveRouting.md) |  |  [optional] |
|**countryPools** | **Object** | A mapping of country codes to a list of pool IDs (ordered by their failover priority) for the given country. Any country not explicitly defined will fall back to using the corresponding region_pool mapping if it exists else to default_pools. |  [optional] |
|**defaultPools** | **List&lt;String&gt;** | A list of pool IDs ordered by their failover priority. Pools defined here are used by default, or when region_pools are not configured for a given region. |  |
|**description** | **String** | Object description. |  [optional] |
|**fallbackPool** | **Object** | The pool ID to use when all other pools are detected as unhealthy. |  |
|**locationStrategy** | [**LoadBalancingLocationStrategy**](LoadBalancingLocationStrategy.md) |  |  [optional] |
|**name** | **String** | The DNS hostname to associate with your Load Balancer. If this hostname already exists as a DNS record in Cloudflare&#39;s DNS, the Load Balancer will take precedence and the DNS record will not be used. |  |
|**popPools** | **Object** | (Enterprise only): A mapping of Cloudflare PoP identifiers to a list of pool IDs (ordered by their failover priority) for the PoP (datacenter). Any PoPs not explicitly defined will fall back to using the corresponding country_pool, then region_pool mapping if it exists else to default_pools. |  [optional] |
|**proxied** | **Boolean** | Whether the hostname should be gray clouded (false) or orange clouded (true). |  [optional] |
|**randomSteering** | [**LoadBalancingRandomSteering**](LoadBalancingRandomSteering.md) |  |  [optional] |
|**regionPools** | **Object** | A mapping of region codes to a list of pool IDs (ordered by their failover priority) for the given region. Any regions not explicitly defined will fall back to using default_pools. |  [optional] |
|**rules** | [**List&lt;LoadBalancingRulesInner&gt;**](LoadBalancingRulesInner.md) | BETA Field Not General Access: A list of rules for this load balancer to execute. |  [optional] |
|**sessionAffinity** | **LoadBalancingSessionAffinity** |  |  [optional] |
|**sessionAffinityAttributes** | [**LoadBalancingSessionAffinityAttributes**](LoadBalancingSessionAffinityAttributes.md) |  |  [optional] |
|**sessionAffinityTtl** | **BigDecimal** | Time, in seconds, until a client&#39;s session expires after being created. Once the expiry time has been reached, subsequent requests may get sent to a different origin server. The accepted ranges per &#x60;session_affinity&#x60; policy are: - &#x60;\&quot;cookie\&quot;&#x60; / &#x60;\&quot;ip_cookie\&quot;&#x60;: The current default of 23 hours will be used unless explicitly set. The accepted range of values is between [1800, 604800]. - &#x60;\&quot;header\&quot;&#x60;: The current default of 1800 seconds will be used unless explicitly set. The accepted range of values is between [30, 3600]. Note: With session affinity by header, sessions only expire after they haven&#39;t been used for the number of seconds specified. |  [optional] |
|**steeringPolicy** | **LoadBalancingSteeringPolicy** |  |  [optional] |
|**ttl** | **BigDecimal** | Time to live (TTL) of the DNS entry for the IP address returned by this load balancer. This only applies to gray-clouded (unproxied) load balancers. |  [optional] |



