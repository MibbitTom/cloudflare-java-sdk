

# DlpProfilesUpdatePredefinedProfile4XXResponse


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**allowedMatchCount** | **BigDecimal** | Related DLP policies will trigger when the match count exceeds the number set. |  [optional] |
|**contextAwareness** | [**DlpContextAwareness**](DlpContextAwareness.md) |  |  [optional] |
|**entries** | [**List&lt;DlpPredefinedEntry&gt;**](DlpPredefinedEntry.md) | The entries for this profile. |  [optional] |
|**id** | [**Object**](Object.md) |  |  [optional] |
|**name** | **String** | The name of the profile. |  [optional] |
|**ocrEnabled** | **Boolean** | If true, scan images via OCR to determine if any text present matches filters. |  [optional] |
|**type** | [**TypeEnum**](#TypeEnum) | The type of the profile. |  [optional] |
|**errors** | [**List&lt;AaaMessagesInner&gt;**](AaaMessagesInner.md) |  |  |
|**messages** | [**List&lt;AaaMessagesInner&gt;**](AaaMessagesInner.md) |  |  |
|**result** | [**ResultEnum**](#ResultEnum) |  |  |
|**success** | **Boolean** | Whether the API call was successful |  |



## Enum: TypeEnum

| Name | Value |
|---- | -----|
| PREDEFINED | &quot;predefined&quot; |



## Enum: ResultEnum

| Name | Value |
|---- | -----|
| NULL | &quot;null&quot; |



