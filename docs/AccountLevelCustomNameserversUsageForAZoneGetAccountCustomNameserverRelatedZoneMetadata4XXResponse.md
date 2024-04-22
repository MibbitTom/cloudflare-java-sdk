

# AccountLevelCustomNameserversUsageForAZoneGetAccountCustomNameserverRelatedZoneMetadata4XXResponse


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**errors** | [**List&lt;AaaMessagesInner&gt;**](AaaMessagesInner.md) |  |  |
|**messages** | [**List&lt;AaaMessagesInner&gt;**](AaaMessagesInner.md) |  |  |
|**result** | [**ResultEnum**](#ResultEnum) |  |  |
|**success** | **Boolean** | Whether the API call was successful |  |
|**resultInfo** | [**DnsCustomNameserversResultInfo**](DnsCustomNameserversResultInfo.md) |  |  [optional] |
|**enabled** | **Boolean** | Whether zone uses account-level custom nameservers. |  [optional] |
|**nsSet** | **BigDecimal** | The number of the name server set to assign to the zone. |  [optional] |



## Enum: ResultEnum

| Name | Value |
|---- | -----|
| NULL | &quot;null&quot; |



