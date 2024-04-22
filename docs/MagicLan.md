

# MagicLan


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**description** | **String** |  |  [optional] |
|**haLink** | **Boolean** | mark true to use this LAN for HA probing. only works for site with HA turned on. only one LAN can be set as the ha_link. |  [optional] |
|**id** | **String** | Identifier |  [optional] [readonly] |
|**nat** | [**MagicNat**](MagicNat.md) |  |  [optional] |
|**physport** | **Integer** |  |  [optional] |
|**routedSubnets** | [**List&lt;MagicRoutedSubnet&gt;**](MagicRoutedSubnet.md) |  |  [optional] |
|**siteId** | **String** | Identifier |  [optional] [readonly] |
|**staticAddressing** | [**MagicLanStaticAddressing**](MagicLanStaticAddressing.md) |  |  [optional] |
|**vlanTag** | **Integer** | VLAN port number. |  [optional] |



