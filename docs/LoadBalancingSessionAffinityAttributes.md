

# LoadBalancingSessionAffinityAttributes

Configures attributes for session affinity.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**drainDuration** | **BigDecimal** | Configures the drain duration in seconds. This field is only used when session affinity is enabled on the load balancer. |  [optional] |
|**headers** | **Set&lt;String&gt;** | Configures the names of HTTP headers to base session affinity on when header &#x60;session_affinity&#x60; is enabled. At least one HTTP header name must be provided. To specify the exact cookies to be used, include an item in the following format: &#x60;\&quot;cookie:&lt;cookie-name-1&gt;,&lt;cookie-name-2&gt;\&quot;&#x60; (example) where everything after the colon is a comma-separated list of cookie names. Providing only &#x60;\&quot;cookie\&quot;&#x60; will result in all cookies being used. The default max number of HTTP header names that can be provided depends on your plan: 5 for Enterprise, 1 for all other plans. |  [optional] |
|**requireAllHeaders** | **Boolean** | When header &#x60;session_affinity&#x60; is enabled, this option can be used to specify how HTTP headers on load balancing requests will be used. The supported values are: - &#x60;\&quot;true\&quot;&#x60;: Load balancing requests must contain *all* of the HTTP headers specified by the &#x60;headers&#x60; session affinity attribute, otherwise sessions aren&#39;t created. - &#x60;\&quot;false\&quot;&#x60;: Load balancing requests must contain *at least one* of the HTTP headers specified by the &#x60;headers&#x60; session affinity attribute, otherwise sessions aren&#39;t created. |  [optional] |
|**samesite** | [**SamesiteEnum**](#SamesiteEnum) | Configures the SameSite attribute on session affinity cookie. Value \&quot;Auto\&quot; will be translated to \&quot;Lax\&quot; or \&quot;None\&quot; depending if Always Use HTTPS is enabled. Note: when using value \&quot;None\&quot;, the secure attribute can not be set to \&quot;Never\&quot;. |  [optional] |
|**secure** | [**SecureEnum**](#SecureEnum) | Configures the Secure attribute on session affinity cookie. Value \&quot;Always\&quot; indicates the Secure attribute will be set in the Set-Cookie header, \&quot;Never\&quot; indicates the Secure attribute will not be set, and \&quot;Auto\&quot; will set the Secure attribute depending if Always Use HTTPS is enabled. |  [optional] |
|**zeroDowntimeFailover** | [**ZeroDowntimeFailoverEnum**](#ZeroDowntimeFailoverEnum) | Configures the zero-downtime failover between origins within a pool when session affinity is enabled. This feature is currently incompatible with Argo, Tiered Cache, and Bandwidth Alliance. The supported values are: - &#x60;\&quot;none\&quot;&#x60;: No failover takes place for sessions pinned to the origin (default). - &#x60;\&quot;temporary\&quot;&#x60;: Traffic will be sent to another other healthy origin until the originally pinned origin is available; note that this can potentially result in heavy origin flapping. - &#x60;\&quot;sticky\&quot;&#x60;: The session affinity cookie is updated and subsequent requests are sent to the new origin. Note: Zero-downtime failover with sticky sessions is currently not supported for session affinity by header. |  [optional] |



## Enum: SamesiteEnum

| Name | Value |
|---- | -----|
| AUTO | &quot;Auto&quot; |
| LAX | &quot;Lax&quot; |
| NONE | &quot;None&quot; |
| STRICT | &quot;Strict&quot; |



## Enum: SecureEnum

| Name | Value |
|---- | -----|
| AUTO | &quot;Auto&quot; |
| ALWAYS | &quot;Always&quot; |
| NEVER | &quot;Never&quot; |



## Enum: ZeroDowntimeFailoverEnum

| Name | Value |
|---- | -----|
| NONE | &quot;none&quot; |
| TEMPORARY | &quot;temporary&quot; |
| STICKY | &quot;sticky&quot; |



