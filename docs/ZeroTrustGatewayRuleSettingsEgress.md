

# ZeroTrustGatewayRuleSettingsEgress

Configure how Gateway Proxy traffic egresses. You can enable this setting for rules with Egress actions and filters, or omit it to indicate local egress via WARP IPs.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**ipv4** | **String** | The IPv4 address to be used for egress. |  [optional] |
|**ipv4Fallback** | **String** | The fallback IPv4 address to be used for egress in the event of an error egressing with the primary IPv4. Can be &#39;0.0.0.0&#39; to indicate local egress via WARP IPs. |  [optional] |
|**ipv6** | **String** | The IPv6 range to be used for egress. |  [optional] |



