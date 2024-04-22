

# DnsRecordsSRVRecordAllOfData

Components of a SRV record.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**name** | **String** | A valid hostname. Deprecated in favor of the regular &#39;name&#39; outside the data map. This data map field represents the remainder of the full &#39;name&#39; after the service and protocol. |  [optional] |
|**port** | **BigDecimal** | The port of the service. |  [optional] |
|**priority** | **BigDecimal** | Required for MX, SRV and URI records; unused by other record types. Records with lower priorities are preferred. |  [optional] |
|**proto** | **String** | A valid protocol, prefixed with an underscore. Deprecated in favor of the regular &#39;name&#39; outside the data map. This data map field normally represents the second label of that &#39;name&#39;. |  [optional] |
|**service** | **String** | A service type, prefixed with an underscore. Deprecated in favor of the regular &#39;name&#39; outside the data map. This data map field normally represents the first label of that &#39;name&#39;. |  [optional] |
|**target** | **String** | A valid hostname. |  [optional] |
|**weight** | **BigDecimal** | The record weight. |  [optional] |



