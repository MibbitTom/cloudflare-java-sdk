

# LegacyJhsResponseSingleOriginDnsAllOfResult


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**argoSmartRouting** | **Boolean** | Enables Argo Smart Routing for this application. Notes: Only available for TCP applications with traffic_type set to \&quot;direct\&quot;. |  [optional] |
|**createdOn** | **OffsetDateTime** | When the Application was created. |  [optional] [readonly] |
|**dns** | [**LegacyJhsDns**](LegacyJhsDns.md) |  |  [optional] |
|**edgeIps** | [**LegacyJhsEdgeIps**](LegacyJhsEdgeIps.md) |  |  [optional] |
|**id** | **String** | Application identifier. |  [optional] [readonly] |
|**ipFirewall** | **Boolean** | Enables IP Access Rules for this application. Notes: Only available for TCP applications. |  [optional] |
|**modifiedOn** | **OffsetDateTime** | When the Application was last modified. |  [optional] [readonly] |
|**originDns** | [**LegacyJhsOriginDns**](LegacyJhsOriginDns.md) |  |  [optional] |
|**originPort** | [**LegacyJhsOriginPort**](LegacyJhsOriginPort.md) |  |  [optional] |
|**protocol** | **String** | The port configuration at Cloudflare’s edge. May specify a single port, for example &#x60;\&quot;tcp/1000\&quot;&#x60;, or a range of ports, for example &#x60;\&quot;tcp/1000-2000\&quot;&#x60;. |  [optional] |
|**proxyProtocol** | **LegacyJhsProxyProtocol** |  |  [optional] |
|**tls** | **LegacyJhsTls** |  |  [optional] |
|**trafficType** | **LegacyJhsTrafficType** |  |  [optional] |



