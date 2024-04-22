

# AccessSchemasCorsHeaders


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**allowAllHeaders** | **Boolean** | Allows all HTTP request headers. |  [optional] |
|**allowAllMethods** | **Boolean** | Allows all HTTP request methods. |  [optional] |
|**allowAllOrigins** | **Boolean** | Allows all origins. |  [optional] |
|**allowCredentials** | **Boolean** | When set to &#x60;true&#x60;, includes credentials (cookies, authorization headers, or TLS client certificates) with requests. |  [optional] |
|**allowedHeaders** | **List&lt;Object&gt;** | Allowed HTTP request headers. |  [optional] |
|**allowedMethods** | [**List&lt;AllowedMethodsEnum&gt;**](#List&lt;AllowedMethodsEnum&gt;) | Allowed HTTP request methods. |  [optional] |
|**allowedOrigins** | **List&lt;Object&gt;** | Allowed origins. |  [optional] |
|**maxAge** | **BigDecimal** | The maximum number of seconds the results of a preflight request can be cached. |  [optional] |



## Enum: List&lt;AllowedMethodsEnum&gt;

| Name | Value |
|---- | -----|
| GET | &quot;GET&quot; |
| POST | &quot;POST&quot; |
| HEAD | &quot;HEAD&quot; |
| PUT | &quot;PUT&quot; |
| DELETE | &quot;DELETE&quot; |
| CONNECT | &quot;CONNECT&quot; |
| OPTIONS | &quot;OPTIONS&quot; |
| TRACE | &quot;TRACE&quot; |
| PATCH | &quot;PATCH&quot; |



