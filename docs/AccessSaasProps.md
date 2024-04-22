

# AccessSaasProps


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**allowedIdps** | **List&lt;String&gt;** | The identity providers your users can select when connecting to this application. Defaults to all IdPs configured in your account. |  [optional] |
|**appLauncherVisible** | **Boolean** | Displays the application in the App Launcher. |  [optional] |
|**autoRedirectToIdentity** | **Boolean** | When set to &#x60;true&#x60;, users skip the identity provider selection step during login. You must specify only one identity provider in allowed_idps. |  [optional] |
|**customPages** | **List&lt;String&gt;** | The custom pages that will be displayed when applicable for this application |  [optional] |
|**logoUrl** | **String** | The image URL for the logo shown in the App Launcher dashboard. |  [optional] |
|**name** | **String** | The name of the application. |  [optional] |
|**saasApp** | [**AccessSaasPropsSaasApp**](AccessSaasPropsSaasApp.md) |  |  [optional] |
|**tags** | **List&lt;String&gt;** | The tags you want assigned to an application. Tags are used to filter applications in the App Launcher dashboard. |  [optional] |
|**type** | **String** | The application type. |  [optional] |



