

# ZonesZone


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**account** | [**ZonesZoneAccount**](ZonesZoneAccount.md) |  |  |
|**activatedOn** | **OffsetDateTime** | The last time proof of ownership was detected and the zone was made active |  [readonly] |
|**createdOn** | **OffsetDateTime** | When the zone was created |  [readonly] |
|**developmentMode** | **BigDecimal** | The interval (in seconds) from when development mode expires (positive integer) or last expired (negative integer) for the domain. If development mode has never been enabled, this value is 0. |  [readonly] |
|**id** | **String** | Identifier |  |
|**meta** | [**ZonesZoneMeta**](ZonesZoneMeta.md) |  |  |
|**modifiedOn** | **OffsetDateTime** | When the zone was last modified |  [readonly] |
|**name** | **String** | The domain name |  |
|**originalDnshost** | **String** | DNS host at the time of switching to Cloudflare |  [readonly] |
|**originalNameServers** | **List&lt;String&gt;** | Original name servers before moving to Cloudflare Notes: Is this only available for full zones? |  [readonly] |
|**originalRegistrar** | **String** | Registrar for the domain at the time of switching to Cloudflare |  [readonly] |
|**owner** | [**ZonesZoneOwner**](ZonesZoneOwner.md) |  |  |
|**vanityNameServers** | **List&lt;String&gt;** | An array of domains used for custom name servers. This is only available for Business and Enterprise plans. |  [optional] |



