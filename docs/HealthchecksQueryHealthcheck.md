

# HealthchecksQueryHealthcheck


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**address** | **String** | The hostname or IP address of the origin server to run health checks on. |  |
|**checkRegions** | [**List&lt;CheckRegionsEnum&gt;**](#List&lt;CheckRegionsEnum&gt;) | A list of regions from which to run health checks. Null means Cloudflare will pick a default region. |  [optional] |
|**consecutiveFails** | **Integer** | The number of consecutive fails required from a health check before changing the health to unhealthy. |  [optional] |
|**consecutiveSuccesses** | **Integer** | The number of consecutive successes required from a health check before changing the health to healthy. |  [optional] |
|**description** | **String** | A human-readable description of the health check. |  [optional] |
|**httpConfig** | [**HealthchecksHttpConfig**](HealthchecksHttpConfig.md) |  |  [optional] |
|**interval** | **Integer** | The interval between each health check. Shorter intervals may give quicker notifications if the origin status changes, but will increase load on the origin as we check from multiple locations. |  [optional] |
|**name** | **String** | A short name to identify the health check. Only alphanumeric characters, hyphens and underscores are allowed. |  |
|**retries** | **Integer** | The number of retries to attempt in case of a timeout before marking the origin as unhealthy. Retries are attempted immediately. |  [optional] |
|**suspended** | **Boolean** | If suspended, no health checks are sent to the origin. |  [optional] |
|**tcpConfig** | [**HealthchecksTcpConfig**](HealthchecksTcpConfig.md) |  |  [optional] |
|**timeout** | **Integer** | The timeout (in seconds) before marking the health check as failed. |  [optional] |
|**type** | **String** | The protocol to use for the health check. Currently supported protocols are &#39;HTTP&#39;, &#39;HTTPS&#39; and &#39;TCP&#39;. |  [optional] |



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
| IN | &quot;IN&quot; |
| SEAS | &quot;SEAS&quot; |
| NEAS | &quot;NEAS&quot; |
| ALL_REGIONS | &quot;ALL_REGIONS&quot; |



