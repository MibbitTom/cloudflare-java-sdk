

# AddressingIpamPrefixes


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**accountId** | **String** | Identifier |  [optional] [readonly] |
|**advertised** | **Boolean** | Prefix advertisement status to the Internet. This field is only not &#39;null&#39; if on demand is enabled. |  [optional] |
|**advertisedModifiedAt** | **OffsetDateTime** | Last time the advertisement status was changed. This field is only not &#39;null&#39; if on demand is enabled. |  [optional] |
|**approved** | **String** | Approval state of the prefix (P &#x3D; pending, V &#x3D; active). |  [optional] |
|**asn** | **Integer** | Autonomous System Number (ASN) the prefix will be advertised under. |  [optional] |
|**cidr** | **String** | IP Prefix in Classless Inter-Domain Routing format. |  [optional] |
|**createdAt** | **OffsetDateTime** |  |  [optional] [readonly] |
|**description** | **String** | Description of the prefix. |  [optional] |
|**id** | **String** | Identifier |  [optional] [readonly] |
|**loaDocumentId** | **String** | Identifier for the uploaded LOA document. |  [optional] |
|**modifiedAt** | **OffsetDateTime** |  |  [optional] [readonly] |
|**onDemandEnabled** | **Boolean** | Whether advertisement of the prefix to the Internet may be dynamically enabled or disabled. |  [optional] |
|**onDemandLocked** | **Boolean** | Whether advertisement status of the prefix is locked, meaning it cannot be changed. |  [optional] |



