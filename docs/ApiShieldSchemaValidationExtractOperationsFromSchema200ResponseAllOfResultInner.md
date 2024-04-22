

# ApiShieldSchemaValidationExtractOperationsFromSchema200ResponseAllOfResultInner


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**endpoint** | **String** | The endpoint which can contain path parameter templates in curly braces, each will be replaced from left to right with {varN}, starting with {var1}, during insertion. This will further be Cloudflare-normalized upon insertion. See: https://developers.cloudflare.com/rules/normalization/how-it-works/. |  |
|**host** | **String** | RFC3986-compliant host. |  |
|**method** | **ApiShieldMethod** |  |  |
|**features** | [**ApiShieldOperationFeatures**](ApiShieldOperationFeatures.md) |  |  [optional] |
|**lastUpdated** | **OffsetDateTime** |  |  [readonly] |
|**operationId** | **UUID** | UUID identifier |  [readonly] |



