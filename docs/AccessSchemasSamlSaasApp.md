

# AccessSchemasSamlSaasApp


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**authType** | [**AuthTypeEnum**](#AuthTypeEnum) | Optional identifier indicating the authentication protocol used for the saas app. Required for OIDC. Default if unset is \&quot;saml\&quot; |  [optional] |
|**consumerServiceUrl** | **String** | The service provider&#39;s endpoint that is responsible for receiving and parsing a SAML assertion. |  [optional] |
|**createdAt** | **OffsetDateTime** |  |  [optional] [readonly] |
|**customAttributes** | [**AccessSamlSaasAppCustomAttributes**](AccessSamlSaasAppCustomAttributes.md) |  |  [optional] |
|**idpEntityId** | **String** | The unique identifier for your SaaS application. |  [optional] |
|**nameIdFormat** | [**NameIdFormatEnum**](#NameIdFormatEnum) | The format of the name identifier sent to the SaaS application. |  [optional] |
|**nameIdTransformJsonata** | **String** | A [JSONata](https://jsonata.org/) expression that transforms an application&#39;s user identities into a NameID value for its SAML assertion. This expression should evaluate to a singular string. The output of this expression can override the &#x60;name_id_format&#x60; setting.  |  [optional] |
|**publicKey** | **String** | The Access public certificate that will be used to verify your identity. |  [optional] |
|**spEntityId** | **String** | A globally unique name for an identity or service provider. |  [optional] |
|**ssoEndpoint** | **String** | The endpoint where your SaaS application will send login requests. |  [optional] |
|**updatedAt** | **OffsetDateTime** |  |  [optional] [readonly] |



## Enum: AuthTypeEnum

| Name | Value |
|---- | -----|
| SAML | &quot;saml&quot; |
| OIDC | &quot;oidc&quot; |



## Enum: NameIdFormatEnum

| Name | Value |
|---- | -----|
| ID | &quot;id&quot; |
| EMAIL | &quot;email&quot; |



