

# ZeroTrustGatewayRuleSettingsUntrustedCert

Configure behavior when an upstream cert is invalid or an SSL error occurs.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**action** | [**ActionEnum**](#ActionEnum) | The action performed when an untrusted certificate is seen. The default action is an error with HTTP code 526. |  [optional] |



## Enum: ActionEnum

| Name | Value |
|---- | -----|
| PASS_THROUGH | &quot;pass_through&quot; |
| BLOCK | &quot;block&quot; |
| ERROR | &quot;error&quot; |



