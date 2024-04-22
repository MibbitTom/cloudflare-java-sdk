

# CloudforceOneRequestList


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**completedAfter** | [**OffsetDateTime**](OffsetDateTime.md) |  |  [optional] |
|**completedBefore** | [**OffsetDateTime**](OffsetDateTime.md) |  |  [optional] |
|**createdAfter** | [**OffsetDateTime**](OffsetDateTime.md) |  |  [optional] |
|**createdBefore** | [**OffsetDateTime**](OffsetDateTime.md) |  |  [optional] |
|**page** | **Integer** | Page number of results |  |
|**perPage** | **Integer** | Number of results per page |  |
|**requestType** | **String** | Requested information from request |  [optional] |
|**sortBy** | **String** | Field to sort results by |  [optional] |
|**sortOrder** | [**SortOrderEnum**](#SortOrderEnum) | Sort order (asc or desc) |  [optional] |
|**status** | **CloudforceOneRequestStatus** |  |  [optional] |



## Enum: SortOrderEnum

| Name | Value |
|---- | -----|
| ASC | &quot;asc&quot; |
| DESC | &quot;desc&quot; |



