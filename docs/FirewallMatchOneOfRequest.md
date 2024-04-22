

# FirewallMatchOneOfRequest


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**methods** | [**List&lt;MethodsEnum&gt;**](#List&lt;MethodsEnum&gt;) | The HTTP methods to match. You can specify a subset (for example, &#x60;[&#39;POST&#39;,&#39;PUT&#39;]&#x60;) or all methods (&#x60;[&#39;_ALL_&#39;]&#x60;). This field is optional when creating a rate limit. |  [optional] |
|**schemes** | **List&lt;String&gt;** | The HTTP schemes to match. You can specify one scheme (&#x60;[&#39;HTTPS&#39;]&#x60;), both schemes (&#x60;[&#39;HTTP&#39;,&#39;HTTPS&#39;]&#x60;), or all schemes (&#x60;[&#39;_ALL_&#39;]&#x60;). This field is optional. |  [optional] |
|**url** | **String** | The URL pattern to match, composed of a host and a path such as &#x60;example.org/path*&#x60;. Normalization is applied before the pattern is matched. &#x60;*&#x60; wildcards are expanded to match applicable traffic. Query strings are not matched. Set the value to &#x60;*&#x60; to match all traffic to your zone. |  [optional] |



## Enum: List&lt;MethodsEnum&gt;

| Name | Value |
|---- | -----|
| GET | &quot;GET&quot; |
| POST | &quot;POST&quot; |
| PUT | &quot;PUT&quot; |
| DELETE | &quot;DELETE&quot; |
| PATCH | &quot;PATCH&quot; |
| HEAD | &quot;HEAD&quot; |
| _ALL_ | &quot;_ALL_&quot; |



