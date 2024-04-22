

# MagicLanStaticAddressing

If the site is not configured in high availability mode, this configuration is optional (if omitted, use DHCP). However, if in high availability mode, static_address is required along with secondary and virtual address.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**address** | **String** | A valid CIDR notation representing an IP range. |  |
|**dhcpRelay** | [**MagicLanDhcpRelay**](MagicLanDhcpRelay.md) |  |  [optional] |
|**dhcpServer** | [**MagicLanDhcpServer**](MagicLanDhcpServer.md) |  |  [optional] |
|**secondaryAddress** | **String** | A valid CIDR notation representing an IP range. |  [optional] |
|**virtualAddress** | **String** | A valid CIDR notation representing an IP range. |  [optional] |



