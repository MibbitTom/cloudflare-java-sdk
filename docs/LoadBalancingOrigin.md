

# LoadBalancingOrigin


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**address** | **String** | The IP address (IPv4 or IPv6) of the origin, or its publicly addressable hostname. Hostnames entered here should resolve directly to the origin, and not be a hostname proxied by Cloudflare. To set an internal/reserved address, virtual_network_id must also be set. |  [optional] |
|**disabledAt** | **OffsetDateTime** | This field shows up only if the origin is disabled. This field is set with the time the origin was disabled. |  [optional] [readonly] |
|**enabled** | **Boolean** | Whether to enable (the default) this origin within the pool. Disabled origins will not receive traffic and are excluded from health checks. The origin will only be disabled for the current pool. |  [optional] |
|**header** | [**LoadBalancingSchemasHeader**](LoadBalancingSchemasHeader.md) |  |  [optional] |
|**name** | **String** | A human-identifiable name for the origin. |  [optional] |
|**virtualNetworkId** | **String** | The virtual network subnet ID the origin belongs in. Virtual network must also belong to the account. |  [optional] |
|**weight** | **BigDecimal** | The weight of this origin relative to other origins in the pool. Based on the configured weight the total traffic is distributed among origins within the pool. - &#x60;origin_steering.policy&#x3D;\&quot;least_outstanding_requests\&quot;&#x60;: Use weight to scale the origin&#39;s outstanding requests. - &#x60;origin_steering.policy&#x3D;\&quot;least_connections\&quot;&#x60;: Use weight to scale the origin&#39;s open connections. |  [optional] |



