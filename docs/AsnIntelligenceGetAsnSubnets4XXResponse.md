

# AsnIntelligenceGetAsnSubnets4XXResponse


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**errors** | [**List&lt;AaaMessagesInner&gt;**](AaaMessagesInner.md) |  |  |
|**messages** | [**List&lt;AaaMessagesInner&gt;**](AaaMessagesInner.md) |  |  |
|**result** | [**ResultEnum**](#ResultEnum) |  |  |
|**success** | **Boolean** | Whether the API call was successful |  |
|**asn** | **Integer** |  |  [optional] |
|**count** | **BigDecimal** | Total results returned based on your search parameters. |  [optional] |
|**ipCountTotal** | **Integer** |  |  [optional] |
|**page** | **BigDecimal** | Current page within paginated list of results. |  [optional] |
|**perPage** | **BigDecimal** | Number of results per page of results. |  [optional] |
|**subnets** | **List&lt;String&gt;** |  |  [optional] |



## Enum: ResultEnum

| Name | Value |
|---- | -----|
| NULL | &quot;null&quot; |



