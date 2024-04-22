

# DnsRecordsSRVRecord


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**comment** | **String** | Comments or notes about the DNS record. This field has no effect on DNS responses. |  [optional] |
|**createdOn** | **OffsetDateTime** | When the record was created. |  [optional] [readonly] |
|**id** | **String** | Identifier |  [optional] [readonly] |
|**locked** | **Boolean** | Whether this record can be modified/deleted (true means it&#39;s managed by Cloudflare). |  [optional] [readonly] |
|**meta** | [**DnsRecordsBaseMeta**](DnsRecordsBaseMeta.md) |  |  [optional] |
|**modifiedOn** | **OffsetDateTime** | When the record was last modified. |  [optional] [readonly] |
|**proxiable** | **Boolean** | Whether the record can be proxied by Cloudflare or not. |  [optional] [readonly] |
|**tags** | **List&lt;String&gt;** | Custom tags for the DNS record. This field has no effect on DNS responses. |  [optional] |
|**ttl** | [**DnsRecordsTtl**](DnsRecordsTtl.md) |  |  [optional] |
|**zoneId** | **String** | Identifier |  [optional] [readonly] |
|**zoneName** | **String** | The domain of the record. |  [optional] [readonly] |
|**content** | **String** | Priority, weight, port, and SRV target. See &#39;data&#39; for setting the individual component values. |  [optional] [readonly] |
|**data** | [**DnsRecordsSRVRecordAllOfData**](DnsRecordsSRVRecordAllOfData.md) |  |  |
|**name** | **String** | DNS record name (or @ for the zone apex) in Punycode. For SRV records, the first label is normally a service and the second a protocol name, each starting with an underscore. |  |
|**type** | [**TypeEnum**](#TypeEnum) | Record type. |  |



## Enum: TypeEnum

| Name | Value |
|---- | -----|
| SRV | &quot;SRV&quot; |



