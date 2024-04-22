

# DlpUpdateCustomProfile


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**allowedMatchCount** | **BigDecimal** | Related DLP policies will trigger when the match count exceeds the number set. |  [optional] |
|**contextAwareness** | [**DlpContextAwareness**](DlpContextAwareness.md) |  |  [optional] |
|**description** | **String** | The description of the profile. |  [optional] |
|**entries** | [**List&lt;DlpCustomEntry&gt;**](DlpCustomEntry.md) | The custom entries for this profile. Array elements with IDs are modifying the existing entry with that ID. Elements without ID will create new entries. Any entry not in the list will be deleted. |  [optional] |
|**name** | **String** | The name of the profile. |  [optional] |
|**ocrEnabled** | **Boolean** | If true, scan images via OCR to determine if any text present matches filters. |  [optional] |
|**sharedEntries** | [**List&lt;DlpUpdateCustomProfileSharedEntriesInner&gt;**](DlpUpdateCustomProfileSharedEntriesInner.md) | Entries from other profiles (e.g. pre-defined Cloudflare profiles, or your Microsoft Information Protection profiles). |  [optional] |



