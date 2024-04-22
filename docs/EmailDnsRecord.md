

# EmailDnsRecord

List of records needed to enable an Email Routing zone.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**content** | **String** | DNS record content. |  [optional] |
|**name** | **String** | DNS record name (or @ for the zone apex). |  [optional] |
|**priority** | **BigDecimal** | Required for MX, SRV and URI records. Unused by other record types. Records with lower priorities are preferred. |  [optional] |
|**ttl** | [**EmailDnsRecordTtl**](EmailDnsRecordTtl.md) |  |  [optional] |
|**type** | [**TypeEnum**](#TypeEnum) | DNS record type. |  [optional] [readonly] |



## Enum: TypeEnum

| Name | Value |
|---- | -----|
| A | &quot;A&quot; |
| AAAA | &quot;AAAA&quot; |
| CNAME | &quot;CNAME&quot; |
| HTTPS | &quot;HTTPS&quot; |
| TXT | &quot;TXT&quot; |
| SRV | &quot;SRV&quot; |
| LOC | &quot;LOC&quot; |
| MX | &quot;MX&quot; |
| NS | &quot;NS&quot; |
| CERT | &quot;CERT&quot; |
| DNSKEY | &quot;DNSKEY&quot; |
| DS | &quot;DS&quot; |
| NAPTR | &quot;NAPTR&quot; |
| SMIMEA | &quot;SMIMEA&quot; |
| SSHFP | &quot;SSHFP&quot; |
| SVCB | &quot;SVCB&quot; |
| TLSA | &quot;TLSA&quot; |
| URI | &quot;URI&quot; |



