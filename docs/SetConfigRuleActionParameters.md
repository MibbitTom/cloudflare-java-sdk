

# SetConfigRuleActionParameters


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**automaticHttpsRewrites** | **Boolean** | Turn on or off Automatic HTTPS Rewrites. |  [optional] |
|**autominify** | [**AutoMinify**](AutoMinify.md) |  |  [optional] |
|**bic** | **Boolean** | Turn on or off Browser Integrity Check. |  [optional] |
|**disableApps** | **Boolean** | Turn off all active Cloudflare Apps. |  [optional] |
|**disableZaraz** | **Boolean** | Turn off Zaraz. |  [optional] |
|**emailObfuscation** | **Boolean** | Turn on or off Email Obfuscation. |  [optional] |
|**hotlinkProtection** | **Boolean** | Turn on or off the Hotlink Protection. |  [optional] |
|**mirage** | **Boolean** | Turn on or off Mirage. |  [optional] |
|**opportunisticEncryption** | **Boolean** | Turn on or off Opportunistic Encryption. |  [optional] |
|**polish** | [**PolishEnum**](#PolishEnum) | Configure the Polish level. |  [optional] |
|**rocketLoader** | **Boolean** | Turn on or off Rocket Loader |  [optional] |
|**securityLevel** | [**SecurityLevelEnum**](#SecurityLevelEnum) | Configure the Security Level. |  [optional] |
|**serverSideExcludes** | **Boolean** | Turn on or off Server Side Excludes. |  [optional] |
|**ssl** | [**SslEnum**](#SslEnum) | Configure the SSL level. |  [optional] |
|**sxg** | **Boolean** | Turn on or off Signed Exchanges (SXG). |  [optional] |



## Enum: PolishEnum

| Name | Value |
|---- | -----|
| OFF | &quot;off&quot; |
| LOSSLESS | &quot;lossless&quot; |
| LOSSY | &quot;lossy&quot; |



## Enum: SecurityLevelEnum

| Name | Value |
|---- | -----|
| OFF | &quot;off&quot; |
| ESSENTIALLY_OFF | &quot;essentially_off&quot; |
| LOW | &quot;low&quot; |
| MEDIUM | &quot;medium&quot; |
| HIGH | &quot;high&quot; |
| UNDER_ATTACK | &quot;under_attack&quot; |



## Enum: SslEnum

| Name | Value |
|---- | -----|
| OFF | &quot;off&quot; |
| FLEXIBLE | &quot;flexible&quot; |
| FULL | &quot;full&quot; |
| STRICT | &quot;strict&quot; |
| ORIGIN_PULL | &quot;origin_pull&quot; |



