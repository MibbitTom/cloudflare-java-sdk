

# VectorizeIndexQueryRequest


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**filter** | **Object** | A metadata filter expression used to limit nearest neighbor results. |  [optional] |
|**returnMetadata** | **Boolean** | Whether to return the metadata associated with the closest vectors. |  [optional] |
|**returnValues** | **Boolean** | Whether to return the values associated with the closest vectors. |  [optional] |
|**topK** | **BigDecimal** | The number of nearest neighbors to find. |  [optional] |
|**vector** | **List&lt;BigDecimal&gt;** | The search vector that will be used to find the nearest neighbors. |  |



