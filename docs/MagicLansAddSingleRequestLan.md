

# MagicLansAddSingleRequestLan


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**description** | **String** |  |  [optional] |
|**haLink** | **Boolean** | mark true to use this LAN for HA probing. only works for site with HA turned on. only one LAN can be set as the ha_link. |  [optional] |
|**nat** | [**MagicNat**](MagicNat.md) |  |  [optional] |
|**physport** | **Integer** |  |  |
|**routedSubnets** | [**List&lt;MagicRoutedSubnet&gt;**](MagicRoutedSubnet.md) |  |  [optional] |
|**staticAddressing** | [**MagicLanStaticAddressing**](MagicLanStaticAddressing.md) |  |  [optional] |
|**vlanTag** | **Integer** | VLAN port number. |  |



