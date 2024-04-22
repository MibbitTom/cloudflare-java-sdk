

# AccessCreateResponseAllOfResult


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**clientId** | **String** | The Client ID for the service token. Access will check for this value in the &#x60;CF-Access-Client-ID&#x60; request header. |  [optional] |
|**clientSecret** | **String** | The Client Secret for the service token. Access will check for this value in the &#x60;CF-Access-Client-Secret&#x60; request header. |  [optional] |
|**createdAt** | **OffsetDateTime** |  |  [optional] [readonly] |
|**duration** | **String** | The duration for how long the service token will be valid. Must be in the format &#x60;300ms&#x60; or &#x60;2h45m&#x60;. Valid time units are: ns, us (or µs), ms, s, m, h. The default is 1 year in hours (8760h). |  [optional] |
|**id** | **String** | The ID of the service token. |  [optional] |
|**name** | **String** | The name of the service token. |  [optional] |
|**updatedAt** | **OffsetDateTime** |  |  [optional] [readonly] |



