

# ZonesMobileRedirectValue

Value of the zone setting.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**mobileSubdomain** | **String** | Which subdomain prefix you wish to redirect visitors on mobile devices to (subdomain must already exist). |  [optional] |
|**status** | [**StatusEnum**](#StatusEnum) | Whether or not mobile redirect is enabled. |  [optional] |
|**stripUri** | **Boolean** | Whether to drop the current page path and redirect to the mobile subdomain URL root, or keep the path and redirect to the same page on the mobile subdomain. |  [optional] |



## Enum: StatusEnum

| Name | Value |
|---- | -----|
| ON | &quot;on&quot; |
| OFF | &quot;off&quot; |



