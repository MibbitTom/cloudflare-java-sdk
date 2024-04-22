

# ZonesMobileRedirect

Automatically redirect visitors on mobile devices to a mobile-optimized subdomain. Refer to [Understanding Cloudflare Mobile Redirect](https://support.cloudflare.com/hc/articles/200168336) for more information.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**editable** | **Boolean** | Whether or not this setting can be modified for this zone (based on your Cloudflare plan level). |  [optional] [readonly] |
|**id** | [**IdEnum**](#IdEnum) | Identifier of the zone setting. |  |
|**modifiedOn** | **OffsetDateTime** | last time this setting was modified. |  [optional] [readonly] |
|**value** | [**ZonesMobileRedirectValue**](ZonesMobileRedirectValue.md) |  |  |



## Enum: IdEnum

| Name | Value |
|---- | -----|
| MOBILE_REDIRECT | &quot;mobile_redirect&quot; |



