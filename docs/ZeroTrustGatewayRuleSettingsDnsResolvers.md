

# ZeroTrustGatewayRuleSettingsDnsResolvers

Add your own custom resolvers to route queries that match the resolver policy. Cannot be used when resolve_dns_through_cloudflare is set. DNS queries will route to the address closest to their origin. Only valid when a rule's action is set to 'resolve'.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**ipv4** | [**List&lt;ZeroTrustGatewayDnsResolverSettingsV4&gt;**](ZeroTrustGatewayDnsResolverSettingsV4.md) |  |  [optional] |
|**ipv6** | [**List&lt;ZeroTrustGatewayDnsResolverSettingsV6&gt;**](ZeroTrustGatewayDnsResolverSettingsV6.md) |  |  [optional] |



