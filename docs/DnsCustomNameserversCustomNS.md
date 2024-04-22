

# DnsCustomNameserversCustomNS

A single account custom nameserver.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**dnsRecords** | [**List&lt;DnsCustomNameserversCustomNSDnsRecordsInner&gt;**](DnsCustomNameserversCustomNSDnsRecordsInner.md) | A and AAAA records associated with the nameserver. |  |
|**nsName** | **String** | The FQDN of the name server. |  |
|**nsSet** | **BigDecimal** | The number of the set that this name server belongs to. |  [optional] |
|**status** | [**StatusEnum**](#StatusEnum) | Verification status of the nameserver. |  |
|**zoneTag** | **String** | Identifier |  [readonly] |



## Enum: StatusEnum

| Name | Value |
|---- | -----|
| MOVED | &quot;moved&quot; |
| PENDING | &quot;pending&quot; |
| VERIFIED | &quot;verified&quot; |



