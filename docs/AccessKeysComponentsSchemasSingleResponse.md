

# AccessKeysComponentsSchemasSingleResponse


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**errors** | [**List&lt;AaaMessagesInner&gt;**](AaaMessagesInner.md) |  |  |
|**messages** | [**List&lt;AaaMessagesInner&gt;**](AaaMessagesInner.md) |  |  |
|**success** | **Boolean** | Whether the API call was successful |  |
|**result** | [**AccessApiResponseSingleAllOfResult**](AccessApiResponseSingleAllOfResult.md) |  |  [optional] |
|**daysUntilNextRotation** | **BigDecimal** | The number of days until the next key rotation. |  [optional] [readonly] |
|**keyRotationIntervalDays** | **BigDecimal** | The number of days between key rotations. |  [optional] |
|**lastKeyRotationAt** | **OffsetDateTime** | The timestamp of the previous key rotation. |  [optional] |



