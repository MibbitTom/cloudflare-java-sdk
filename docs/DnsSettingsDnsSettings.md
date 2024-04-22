

# DnsSettingsDnsSettings


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**foundationDns** | **Boolean** | Whether to enable Foundation DNS Advanced Nameservers on the zone. |  [optional] |
|**multiProvider** | **Boolean** | Whether to enable multi-provider DNS, which causes Cloudflare to activate the zone even when non-Cloudflare NS records exist, and to respect NS records at the zone apex during outbound zone transfers. |  [optional] |
|**nameservers** | [**DnsSettingsNameservers**](DnsSettingsNameservers.md) |  |  [optional] |
|**secondaryOverrides** | **Boolean** | Allows a Secondary DNS zone to use (proxied) override records and CNAME flattening at the zone apex. |  [optional] |



