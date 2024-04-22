

# AccessOidcSaasApp


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**appLauncherUrl** | **String** | The URL where this applications tile redirects users |  [optional] |
|**authType** | [**AuthTypeEnum**](#AuthTypeEnum) | Identifier of the authentication protocol used for the saas app. Required for OIDC. |  [optional] |
|**clientId** | **String** | The application client id |  [optional] |
|**clientSecret** | **String** | The application client secret, only returned on POST request. |  [optional] |
|**createdAt** | **OffsetDateTime** |  |  [optional] [readonly] |
|**grantTypes** | [**List&lt;GrantTypesEnum&gt;**](#List&lt;GrantTypesEnum&gt;) | The OIDC flows supported by this application |  [optional] |
|**groupFilterRegex** | **String** | A regex to filter Cloudflare groups returned in ID token and userinfo endpoint |  [optional] |
|**publicKey** | **String** | The Access public certificate that will be used to verify your identity. |  [optional] |
|**redirectUris** | **List&lt;String&gt;** | The permitted URL&#39;s for Cloudflare to return Authorization codes and Access/ID tokens |  [optional] |
|**scopes** | [**List&lt;ScopesEnum&gt;**](#List&lt;ScopesEnum&gt;) | Define the user information shared with access |  [optional] |
|**updatedAt** | **OffsetDateTime** |  |  [optional] [readonly] |



## Enum: AuthTypeEnum

| Name | Value |
|---- | -----|
| SAML | &quot;saml&quot; |
| OIDC | &quot;oidc&quot; |



## Enum: List&lt;GrantTypesEnum&gt;

| Name | Value |
|---- | -----|
| CODE | &quot;authorization_code&quot; |
| CODE_WITH_PKCE | &quot;authorization_code_with_pkce&quot; |



## Enum: List&lt;ScopesEnum&gt;

| Name | Value |
|---- | -----|
| OPENID | &quot;openid&quot; |
| GROUPS | &quot;groups&quot; |
| EMAIL | &quot;email&quot; |
| PROFILE | &quot;profile&quot; |



