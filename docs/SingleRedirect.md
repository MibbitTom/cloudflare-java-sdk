

# SingleRedirect

Serve a redirect based on the request properties.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**preserveQueryString** | **Boolean** | Keep the query string of the original request. |  [optional] |
|**statusCode** | [**StatusCodeEnum**](#StatusCodeEnum) | The status code to be used for the redirect. |  [optional] |
|**targetUrl** | [**SingleRedirectTargetUrl**](SingleRedirectTargetUrl.md) |  |  [optional] |



## Enum: StatusCodeEnum

| Name | Value |
|---- | -----|
| NUMBER_301 | new BigDecimal(&quot;301&quot;) |
| NUMBER_302 | new BigDecimal(&quot;302&quot;) |
| NUMBER_303 | new BigDecimal(&quot;303&quot;) |
| NUMBER_307 | new BigDecimal(&quot;307&quot;) |
| NUMBER_308 | new BigDecimal(&quot;308&quot;) |



