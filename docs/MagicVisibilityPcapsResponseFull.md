

# MagicVisibilityPcapsResponseFull


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**byteLimit** | **BigDecimal** | The maximum number of bytes to capture. This field only applies to &#x60;full&#x60; packet captures. |  [optional] |
|**coloName** | **String** | The name of the data center used for the packet capture. This can be a specific colo (ord02) or a multi-colo name (ORD). This field only applies to &#x60;full&#x60; packet captures. |  [optional] |
|**destinationConf** | **String** | The full URI for the bucket. This field only applies to &#x60;full&#x60; packet captures. |  [optional] |
|**errorMessage** | **String** | An error message that describes why the packet capture failed. This field only applies to &#x60;full&#x60; packet captures. |  [optional] |
|**filterV1** | [**MagicVisibilityPcapsFilterV1**](MagicVisibilityPcapsFilterV1.md) |  |  [optional] |
|**id** | **String** | The ID for the packet capture. |  [optional] |
|**status** | **MagicVisibilityPcapsStatus** |  |  [optional] |
|**submitted** | **String** | The RFC 3339 timestamp when the packet capture was created. |  [optional] |
|**system** | **MagicVisibilityPcapsSystem** |  |  [optional] |
|**timeLimit** | **BigDecimal** | The packet capture duration in seconds. |  [optional] |
|**type** | **MagicVisibilityPcapsType** |  |  [optional] |



