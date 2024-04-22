

# SpectrumApplicationsCreateSpectrumApplicationUsingANameForTheOriginRequest


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**argoSmartRouting** | **Boolean** | Enables Argo Smart Routing for this application. Notes: Only available for TCP applications with traffic_type set to \&quot;direct\&quot;. |  [optional] |
|**dns** | [**LegacyJhsDns**](LegacyJhsDns.md) |  |  |
|**edgeIps** | [**LegacyJhsEdgeIps**](LegacyJhsEdgeIps.md) |  |  [optional] |
|**ipFirewall** | **Boolean** | Enables IP Access Rules for this application. Notes: Only available for TCP applications. |  [optional] |
|**originDns** | [**LegacyJhsOriginDns**](LegacyJhsOriginDns.md) |  |  |
|**originPort** | [**LegacyJhsOriginPort**](LegacyJhsOriginPort.md) |  |  |
|**protocol** | **String** | The port configuration at Cloudflare’s edge. May specify a single port, for example &#x60;\&quot;tcp/1000\&quot;&#x60;, or a range of ports, for example &#x60;\&quot;tcp/1000-2000\&quot;&#x60;. |  |
|**proxyProtocol** | **LegacyJhsProxyProtocol** |  |  [optional] |
|**tls** | **LegacyJhsTls** |  |  [optional] |
|**trafficType** | **LegacyJhsTrafficType** |  |  [optional] |



