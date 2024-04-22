

# AddressingBgpOnDemand


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**advertised** | **Boolean** | Prefix advertisement status to the Internet. This field is only not &#39;null&#39; if on demand is enabled. |  [optional] |
|**advertisedModifiedAt** | **OffsetDateTime** | Last time the advertisement status was changed. This field is only not &#39;null&#39; if on demand is enabled. |  [optional] |
|**onDemandEnabled** | **Boolean** | Whether advertisement of the prefix to the Internet may be dynamically enabled or disabled. |  [optional] |
|**onDemandLocked** | **Boolean** | Whether advertisement status of the prefix is locked, meaning it cannot be changed. |  [optional] |



