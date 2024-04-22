

# ZeroTrustGatewayRuleSettings

Additional settings that modify the rule's action.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**addHeaders** | **Object** | Add custom headers to allowed requests, in the form of key-value pairs. Keys are header names, pointing to an array with its header value(s). |  [optional] |
|**allowChildBypass** | **Boolean** | Set by parent MSP accounts to enable their children to bypass this rule. |  [optional] |
|**auditSsh** | [**ZeroTrustGatewayRuleSettingsAuditSsh**](ZeroTrustGatewayRuleSettingsAuditSsh.md) |  |  [optional] |
|**bisoAdminControls** | [**ZeroTrustGatewayRuleSettingsBisoAdminControls**](ZeroTrustGatewayRuleSettingsBisoAdminControls.md) |  |  [optional] |
|**blockPageEnabled** | **Boolean** | Enable the custom block page. |  [optional] |
|**blockReason** | **String** | The text describing why this block occurred, displayed on the custom block page (if enabled). |  [optional] |
|**bypassParentRule** | **Boolean** | Set by children MSP accounts to bypass their parent&#39;s rules. |  [optional] |
|**checkSession** | [**ZeroTrustGatewayRuleSettingsCheckSession**](ZeroTrustGatewayRuleSettingsCheckSession.md) |  |  [optional] |
|**dnsResolvers** | [**ZeroTrustGatewayRuleSettingsDnsResolvers**](ZeroTrustGatewayRuleSettingsDnsResolvers.md) |  |  [optional] |
|**egress** | [**ZeroTrustGatewayRuleSettingsEgress**](ZeroTrustGatewayRuleSettingsEgress.md) |  |  [optional] |
|**insecureDisableDnssecValidation** | **Boolean** | INSECURE - disable DNSSEC validation (for Allow actions). |  [optional] |
|**ipCategories** | **Boolean** | Set to true to enable IPs in DNS resolver category blocks. By default categories only block based on domain names. |  [optional] |
|**ipIndicatorFeeds** | **Boolean** | Set to true to include IPs in DNS resolver indicator feed blocks. By default indicator feeds only block based on domain names. |  [optional] |
|**l4override** | [**ZeroTrustGatewayRuleSettingsL4override**](ZeroTrustGatewayRuleSettingsL4override.md) |  |  [optional] |
|**notificationSettings** | [**ZeroTrustGatewayRuleSettingsNotificationSettings**](ZeroTrustGatewayRuleSettingsNotificationSettings.md) |  |  [optional] |
|**overrideHost** | **String** | Override matching DNS queries with a hostname. |  [optional] |
|**overrideIps** | **List&lt;String&gt;** | Override matching DNS queries with an IP or set of IPs. |  [optional] |
|**payloadLog** | [**ZeroTrustGatewayRuleSettingsPayloadLog**](ZeroTrustGatewayRuleSettingsPayloadLog.md) |  |  [optional] |
|**resolveDnsThroughCloudflare** | **Boolean** | Enable to send queries that match the policy to Cloudflare&#39;s default 1.1.1.1 DNS resolver. Cannot be set when dns_resolvers are specified. Only valid when a rule&#39;s action is set to &#39;resolve&#39;. |  [optional] |
|**untrustedCert** | [**ZeroTrustGatewayRuleSettingsUntrustedCert**](ZeroTrustGatewayRuleSettingsUntrustedCert.md) |  |  [optional] |



