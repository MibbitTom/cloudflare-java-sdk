

# DnsFirewallCreateDnsFirewallClusterRequest


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**attackMitigation** | [**DnsFirewallAttackMitigation**](DnsFirewallAttackMitigation.md) |  |  [optional] |
|**deprecateAnyRequests** | **Boolean** | Deprecate the response to ANY requests. |  [optional] |
|**ecsFallback** | **Boolean** | Forward client IP (resolver) subnet if no EDNS Client Subnet is sent. |  [optional] |
|**maximumCacheTtl** | **BigDecimal** | Maximum DNS Cache TTL. |  [optional] |
|**minimumCacheTtl** | **BigDecimal** | Minimum DNS Cache TTL. |  [optional] |
|**name** | **String** | DNS Firewall Cluster Name. |  |
|**negativeCacheTtl** | **BigDecimal** | Negative DNS Cache TTL. |  [optional] |
|**ratelimit** | **BigDecimal** | Ratelimit in queries per second per datacenter (applies to DNS queries sent to the upstream nameservers configured on the cluster). |  [optional] |
|**retries** | **BigDecimal** | Number of retries for fetching DNS responses from upstream nameservers (not counting the initial attempt). |  [optional] |
|**upstreamIps** | [**List&lt;DnsFirewallUpstreamIpsInner&gt;**](DnsFirewallUpstreamIpsInner.md) |  |  |



