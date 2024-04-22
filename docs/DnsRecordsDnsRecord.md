

# DnsRecordsDnsRecord


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**content** | **String** | Formatted URI content. See &#39;data&#39; to set URI properties. |  [readonly] |
|**name** | **String** | DNS record name (or @ for the zone apex) in Punycode. |  |
|**proxied** | **Boolean** | Whether the record is receiving the performance and security benefits of Cloudflare. |  [optional] |
|**type** | [**TypeEnum**](#TypeEnum) | Record type. |  |
|**comment** | **String** | Comments or notes about the DNS record. This field has no effect on DNS responses. |  [optional] |
|**createdOn** | **OffsetDateTime** | When the record was created. |  [readonly] |
|**id** | **String** | Identifier |  [readonly] |
|**locked** | **Boolean** | Whether this record can be modified/deleted (true means it&#39;s managed by Cloudflare). |  [readonly] |
|**meta** | [**DnsRecordsBaseMeta**](DnsRecordsBaseMeta.md) |  |  [optional] |
|**modifiedOn** | **OffsetDateTime** | When the record was last modified. |  [readonly] |
|**proxiable** | **Boolean** | Whether the record can be proxied by Cloudflare or not. |  [readonly] |
|**tags** | **List&lt;String&gt;** | Custom tags for the DNS record. This field has no effect on DNS responses. |  [optional] |
|**ttl** | [**DnsRecordsTtl**](DnsRecordsTtl.md) |  |  [optional] |
|**zoneId** | **String** | Identifier |  [optional] [readonly] |
|**zoneName** | **String** | The domain of the record. |  [readonly] |
|**data** | [**DnsRecordsURIRecordAllOfData**](DnsRecordsURIRecordAllOfData.md) |  |  |
|**priority** | **BigDecimal** | Required for MX, SRV and URI records; unused by other record types. Records with lower priorities are preferred. |  |



## Enum: TypeEnum

| Name | Value |
|---- | -----|
| A | &quot;A&quot; |
| AAAA | &quot;AAAA&quot; |
| CAA | &quot;CAA&quot; |
| CERT | &quot;CERT&quot; |
| CNAME | &quot;CNAME&quot; |
| DNSKEY | &quot;DNSKEY&quot; |
| DS | &quot;DS&quot; |
| HTTPS | &quot;HTTPS&quot; |
| LOC | &quot;LOC&quot; |
| MX | &quot;MX&quot; |
| NAPTR | &quot;NAPTR&quot; |
| NS | &quot;NS&quot; |
| PTR | &quot;PTR&quot; |
| SMIMEA | &quot;SMIMEA&quot; |
| SRV | &quot;SRV&quot; |
| SSHFP | &quot;SSHFP&quot; |
| SVCB | &quot;SVCB&quot; |
| TLSA | &quot;TLSA&quot; |
| TXT | &quot;TXT&quot; |
| URI | &quot;URI&quot; |



