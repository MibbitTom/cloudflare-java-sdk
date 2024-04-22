

# ExcludedQueryStringParameters

build the cache key using all query string parameters EXCECPT these excluded parameters

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**all** | **Boolean** | Exclude all query string parameters from use in building the cache key. |  [optional] |
|**_list** | **List&lt;String&gt;** | A list of query string parameters NOT used to build the cache key. All parameters present in the request but missing in this list will be used to build the cache key. |  [optional] |



