

# TlsCertificatesAndHostnamesVerificationInfo

Certificate's required verification information.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**recordName** | [**RecordNameEnum**](#RecordNameEnum) | Name of CNAME record. |  [optional] |
|**recordTarget** | [**RecordTargetEnum**](#RecordTargetEnum) | Target of CNAME record. |  [optional] |



## Enum: RecordNameEnum

| Name | Value |
|---- | -----|
| RECORD_NAME | &quot;record_name&quot; |
| HTTP_URL | &quot;http_url&quot; |
| CNAME | &quot;cname&quot; |
| TXT_NAME | &quot;txt_name&quot; |



## Enum: RecordTargetEnum

| Name | Value |
|---- | -----|
| RECORD_VALUE | &quot;record_value&quot; |
| HTTP_BODY | &quot;http_body&quot; |
| CNAME_TARGET | &quot;cname_target&quot; |
| TXT_VALUE | &quot;txt_value&quot; |



