

# AccessSchemasApps


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**aud** | **String** | Audience tag. |  [optional] [readonly] |
|**createdAt** | **OffsetDateTime** |  |  [optional] [readonly] |
|**id** | **String** | UUID |  [optional] [readonly] |
|**updatedAt** | **OffsetDateTime** |  |  [optional] [readonly] |
|**allowedIdps** | **List&lt;String&gt;** | The identity providers your users can select when connecting to this application. Defaults to all IdPs configured in your account. |  [optional] |
|**appLauncherVisible** | **Object** |  |  [optional] |
|**autoRedirectToIdentity** | **Boolean** | When set to &#x60;true&#x60;, users skip the identity provider selection step during login. You must specify only one identity provider in allowed_idps. |  [optional] |
|**corsHeaders** | [**AccessSchemasCorsHeaders**](AccessSchemasCorsHeaders.md) |  |  [optional] |
|**customDenyMessage** | **String** | The custom error message shown to a user when they are denied access to the application. |  [optional] |
|**customDenyUrl** | **String** | The custom URL a user is redirected to when they are denied access to the application. |  [optional] |
|**domain** | **Object** | The URL or domain of the bookmark. |  |
|**enableBindingCookie** | **Boolean** | Enables the binding cookie, which increases security against compromised authorization tokens and CSRF attacks. |  [optional] |
|**httpOnlyCookieAttribute** | **Boolean** | Enables the HttpOnly cookie attribute, which increases security against XSS attacks. |  [optional] |
|**logoUrl** | **String** | The image URL for the logo shown in the App Launcher dashboard. |  [optional] |
|**name** | **String** | The name of the application. |  [optional] |
|**optionsPreflightBypass** | **Boolean** | Allows options preflight requests to bypass Access authentication and go directly to the origin. Cannot turn on if cors_headers is set. |  [optional] |
|**sameSiteCookieAttribute** | **String** | Sets the SameSite cookie setting, which provides increased security against CSRF attacks. |  [optional] |
|**serviceAuth401Redirect** | **Boolean** | Returns a 401 status code when the request is blocked by a Service Auth policy. |  [optional] |
|**sessionDuration** | **String** | The amount of time that tokens issued for this application will be valid. Must be in the format &#x60;300ms&#x60; or &#x60;2h45m&#x60;. Valid time units are: ns, us (or µs), ms, s, m, h. |  [optional] |
|**skipInterstitial** | **Boolean** | Enables automatic authentication through cloudflared. |  [optional] |
|**type** | **String** | The application type. |  |
|**saasApp** | [**AccessSchemasSaasPropsSaasApp**](AccessSchemasSaasPropsSaasApp.md) |  |  [optional] |



