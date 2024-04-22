

# LoadBalancingOriginSteering

Configures origin steering for the pool. Controls how origins are selected for new sessions and traffic without session affinity.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**policy** | [**PolicyEnum**](#PolicyEnum) | The type of origin steering policy to use. - &#x60;\&quot;random\&quot;&#x60;: Select an origin randomly. - &#x60;\&quot;hash\&quot;&#x60;: Select an origin by computing a hash over the CF-Connecting-IP address. - &#x60;\&quot;least_outstanding_requests\&quot;&#x60;: Select an origin by taking into consideration origin weights, as well as each origin&#39;s number of outstanding requests. Origins with more pending requests are weighted proportionately less relative to others. - &#x60;\&quot;least_connections\&quot;&#x60;: Select an origin by taking into consideration origin weights, as well as each origin&#39;s number of open connections. Origins with more open connections are weighted proportionately less relative to others. Supported for HTTP/1 and HTTP/2 connections. |  [optional] |



## Enum: PolicyEnum

| Name | Value |
|---- | -----|
| RANDOM | &quot;random&quot; |
| HASH | &quot;hash&quot; |
| LEAST_OUTSTANDING_REQUESTS | &quot;least_outstanding_requests&quot; |
| LEAST_CONNECTIONS | &quot;least_connections&quot; |



