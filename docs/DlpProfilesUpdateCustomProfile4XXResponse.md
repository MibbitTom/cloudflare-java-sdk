

# DlpProfilesUpdateCustomProfile4XXResponse


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**allowedMatchCount** | **BigDecimal** | Related DLP policies will trigger when the match count exceeds the number set. |  [optional] |
|**contextAwareness** | [**DlpContextAwareness**](DlpContextAwareness.md) |  |  [optional] |
|**createdAt** | **OffsetDateTime** |  |  [optional] [readonly] |
|**description** | **String** | The description of the profile. |  [optional] |
|**entries** | [**List&lt;DlpCustomEntry&gt;**](DlpCustomEntry.md) | The entries for this profile. |  [optional] |
|**id** | [**Object**](Object.md) |  |  [optional] |
|**name** | **String** | The name of the profile. |  [optional] |
|**ocrEnabled** | **Boolean** | If true, scan images via OCR to determine if any text present matches filters. |  [optional] |
|**type** | [**TypeEnum**](#TypeEnum) | The type of the profile. |  [optional] |
|**updatedAt** | **OffsetDateTime** |  |  [optional] [readonly] |
|**errors** | [**List&lt;AaaMessagesInner&gt;**](AaaMessagesInner.md) |  |  |
|**messages** | [**List&lt;AaaMessagesInner&gt;**](AaaMessagesInner.md) |  |  |
|**result** | [**ResultEnum**](#ResultEnum) |  |  |
|**success** | **Boolean** | Whether the API call was successful |  |



## Enum: TypeEnum

| Name | Value |
|---- | -----|
| CUSTOM | &quot;custom&quot; |



## Enum: ResultEnum

| Name | Value |
|---- | -----|
| NULL | &quot;null&quot; |



