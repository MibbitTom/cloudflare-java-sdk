

# HealthchecksHttpConfig

Parameters specific to an HTTP or HTTPS health check.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**allowInsecure** | **Boolean** | Do not validate the certificate when the health check uses HTTPS. |  [optional] |
|**expectedBody** | **String** | A case-insensitive sub-string to look for in the response body. If this string is not found, the origin will be marked as unhealthy. |  [optional] |
|**expectedCodes** | **List&lt;String&gt;** | The expected HTTP response codes (e.g. \&quot;200\&quot;) or code ranges (e.g. \&quot;2xx\&quot; for all codes starting with 2) of the health check. |  [optional] |
|**followRedirects** | **Boolean** | Follow redirects if the origin returns a 3xx status code. |  [optional] |
|**header** | **Object** | The HTTP request headers to send in the health check. It is recommended you set a Host header by default. The User-Agent header cannot be overridden. |  [optional] |
|**method** | [**MethodEnum**](#MethodEnum) | The HTTP method to use for the health check. |  [optional] |
|**path** | **String** | The endpoint path to health check against. |  [optional] |
|**port** | **Integer** | Port number to connect to for the health check. Defaults to 80 if type is HTTP or 443 if type is HTTPS. |  [optional] |



## Enum: MethodEnum

| Name | Value |
|---- | -----|
| GET | &quot;GET&quot; |
| HEAD | &quot;HEAD&quot; |



