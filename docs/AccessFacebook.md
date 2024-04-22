

# AccessFacebook


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**config** | [**AccessGenericOauthConfig**](AccessGenericOauthConfig.md) |  |  |
|**id** | **String** | UUID |  [optional] [readonly] |
|**name** | **String** | The name of the identity provider, shown to users on the login page. |  |
|**scimConfig** | [**AccessIdentityProviderScimConfig**](AccessIdentityProviderScimConfig.md) |  |  [optional] |
|**type** | [**TypeEnum**](#TypeEnum) | The type of identity provider. To determine the value for a specific provider, refer to our [developer documentation](https://developers.cloudflare.com/cloudflare-one/identity/idp-integration/). |  |



## Enum: TypeEnum

| Name | Value |
|---- | -----|
| ONETIMEPIN | &quot;onetimepin&quot; |
| AZUREAD | &quot;azureAD&quot; |
| SAML | &quot;saml&quot; |
| CENTRIFY | &quot;centrify&quot; |
| FACEBOOK | &quot;facebook&quot; |
| GITHUB | &quot;github&quot; |
| GOOGLE_APPS | &quot;google-apps&quot; |
| GOOGLE | &quot;google&quot; |
| LINKEDIN | &quot;linkedin&quot; |
| OIDC | &quot;oidc&quot; |
| OKTA | &quot;okta&quot; |
| ONELOGIN | &quot;onelogin&quot; |
| PINGONE | &quot;pingone&quot; |
| YANDEX | &quot;yandex&quot; |



