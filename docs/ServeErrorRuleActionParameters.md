

# ServeErrorRuleActionParameters


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**content** | **String** | Error response content. |  [optional] |
|**contentType** | [**ContentTypeEnum**](#ContentTypeEnum) | Content-type header to set with the response. |  [optional] |
|**statusCode** | **BigDecimal** | The status code to use for the error. |  [optional] |



## Enum: ContentTypeEnum

| Name | Value |
|---- | -----|
| APPLICATION_JSON | &quot;application/json&quot; |
| TEXT_XML | &quot;text/xml&quot; |
| TEXT_PLAIN | &quot;text/plain&quot; |
| TEXT_HTML | &quot;text/html&quot; |



