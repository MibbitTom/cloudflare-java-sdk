

# ListsItem


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**asn** | **Integer** | A non-negative 32 bit integer |  [optional] |
|**comment** | **String** | An informative summary of the list item. |  [optional] |
|**createdOn** | **String** | The RFC 3339 timestamp of when the item was created. |  [optional] [readonly] |
|**hostname** | [**ListsItemHostname**](ListsItemHostname.md) |  |  [optional] |
|**id** | **String** | The unique ID of the list. |  [optional] [readonly] |
|**ip** | **String** | An IPv4 address, an IPv4 CIDR, or an IPv6 CIDR. IPv6 CIDRs are limited to a maximum of /64. |  [optional] |
|**modifiedOn** | **String** | The RFC 3339 timestamp of when the item was last modified. |  [optional] [readonly] |
|**redirect** | [**ListsItemRedirect**](ListsItemRedirect.md) |  |  [optional] |
|**includeSubdomains** | **Boolean** |  |  [optional] |
|**preservePathSuffix** | **Boolean** |  |  [optional] |
|**preserveQueryString** | **Boolean** |  |  [optional] |
|**sourceUrl** | **String** |  |  |
|**statusCode** | [**StatusCodeEnum**](#StatusCodeEnum) |  |  [optional] |
|**subpathMatching** | **Boolean** |  |  [optional] |
|**targetUrl** | **String** |  |  |
|**urlHostname** | **String** |  |  |



## Enum: StatusCodeEnum

| Name | Value |
|---- | -----|
| NUMBER_301 | 301 |
| NUMBER_302 | 302 |
| NUMBER_307 | 307 |
| NUMBER_308 | 308 |



