

# MagicVisibilityPcapsOwnershipResponse


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**destinationConf** | **String** | The full URI for the bucket. This field only applies to &#x60;full&#x60; packet captures. |  |
|**filename** | **String** | The ownership challenge filename stored in the bucket. |  |
|**id** | **String** | The bucket ID associated with the packet captures API. |  |
|**status** | [**StatusEnum**](#StatusEnum) | The status of the ownership challenge. Can be pending, success or failed. |  |
|**submitted** | **String** | The RFC 3339 timestamp when the bucket was added to packet captures API. |  |
|**validated** | **String** | The RFC 3339 timestamp when the bucket was validated. |  [optional] |



## Enum: StatusEnum

| Name | Value |
|---- | -----|
| PENDING | &quot;pending&quot; |
| SUCCESS | &quot;success&quot; |
| FAILED | &quot;failed&quot; |



