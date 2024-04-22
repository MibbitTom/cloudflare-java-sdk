

# AccessSchemasSaasProps


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**allowedIdps** | **List&lt;String&gt;** | The identity providers your users can select when connecting to this application. Defaults to all IdPs configured in your account. |  [optional] |
|**appLauncherVisible** | **Boolean** | Displays the application in the App Launcher. |  [optional] |
|**autoRedirectToIdentity** | **Boolean** | When set to &#x60;true&#x60;, users skip the identity provider selection step during login. You must specify only one identity provider in allowed_idps. |  [optional] |
|**logoUrl** | **String** | The image URL for the logo shown in the App Launcher dashboard. |  [optional] |
|**name** | **String** | The name of the application. |  [optional] |
|**saasApp** | [**AccessSchemasSaasPropsSaasApp**](AccessSchemasSaasPropsSaasApp.md) |  |  [optional] |
|**type** | **String** | The application type. |  [optional] |



