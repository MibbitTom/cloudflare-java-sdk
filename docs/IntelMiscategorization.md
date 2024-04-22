

# IntelMiscategorization


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**contentAdds** | **Object** | Content category IDs to add. |  [optional] |
|**contentRemoves** | **Object** | Content category IDs to remove. |  [optional] |
|**indicatorType** | [**IndicatorTypeEnum**](#IndicatorTypeEnum) |  |  [optional] |
|**ip** | **Object** | Provide only if indicator_type is &#x60;ipv4&#x60; or &#x60;ipv6&#x60;. |  [optional] |
|**securityAdds** | **Object** | Security category IDs to add. |  [optional] |
|**securityRemoves** | **Object** | Security category IDs to remove. |  [optional] |
|**url** | **String** | Provide only if indicator_type is &#x60;domain&#x60; or &#x60;url&#x60;. Example if indicator_type is &#x60;domain&#x60;: &#x60;example.com&#x60;. Example if indicator_type is &#x60;url&#x60;: &#x60;https://example.com/news/&#x60;. |  [optional] |



## Enum: IndicatorTypeEnum

| Name | Value |
|---- | -----|
| DOMAIN | &quot;domain&quot; |
| IPV4 | &quot;ipv4&quot; |
| IPV6 | &quot;ipv6&quot; |
| URL | &quot;url&quot; |



