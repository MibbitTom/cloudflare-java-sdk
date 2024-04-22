

# MagicVisibilityPcapsRequestFull


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**byteLimit** | **BigDecimal** | The maximum number of bytes to capture. This field only applies to &#x60;full&#x60; packet captures. |  [optional] |
|**coloName** | **String** | The name of the data center used for the packet capture. This can be a specific colo (ord02) or a multi-colo name (ORD). This field only applies to &#x60;full&#x60; packet captures. |  |
|**destinationConf** | **String** | The full URI for the bucket. This field only applies to &#x60;full&#x60; packet captures. |  |
|**filterV1** | [**MagicVisibilityPcapsFilterV1**](MagicVisibilityPcapsFilterV1.md) |  |  [optional] |
|**packetLimit** | **BigDecimal** | The limit of packets contained in a packet capture. |  [optional] |
|**system** | **MagicVisibilityPcapsSystem** |  |  |
|**timeLimit** | **BigDecimal** | The packet capture duration in seconds. |  |
|**type** | **MagicVisibilityPcapsType** |  |  |



