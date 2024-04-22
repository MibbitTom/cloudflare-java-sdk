

# AccessSshProps


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**allowAuthenticateViaWarp** | **Boolean** | When set to true, users can authenticate to this application using their WARP session.  When set to false this application will always require direct IdP authentication. This setting always overrides the organization setting for WARP authentication. |  [optional] |
|**allowedIdps** | **List&lt;String&gt;** | The identity providers your users can select when connecting to this application. Defaults to all IdPs configured in your account. |  [optional] |
|**appLauncherVisible** | **Boolean** | Displays the application in the App Launcher. |  [optional] |
|**autoRedirectToIdentity** | **Boolean** | When set to &#x60;true&#x60;, users skip the identity provider selection step during login. You must specify only one identity provider in allowed_idps. |  [optional] |
|**corsHeaders** | [**AccessCorsHeaders**](AccessCorsHeaders.md) |  |  [optional] |
|**customDenyMessage** | **String** | The custom error message shown to a user when they are denied access to the application. |  [optional] |
|**customDenyUrl** | **String** | The custom URL a user is redirected to when they are denied access to the application when failing identity-based rules. |  [optional] |
|**customNonIdentityDenyUrl** | **String** | The custom URL a user is redirected to when they are denied access to the application when failing non-identity rules. |  [optional] |
|**customPages** | **List&lt;String&gt;** | The custom pages that will be displayed when applicable for this application |  [optional] |
|**domain** | **String** | The primary hostname and path that Access will secure. If the app is visible in the App Launcher dashboard, this is the domain that will be displayed. |  |
|**enableBindingCookie** | **Boolean** | Enables the binding cookie, which increases security against compromised authorization tokens and CSRF attacks. |  [optional] |
|**httpOnlyCookieAttribute** | **Boolean** | Enables the HttpOnly cookie attribute, which increases security against XSS attacks. |  [optional] |
|**logoUrl** | **String** | The image URL for the logo shown in the App Launcher dashboard. |  [optional] |
|**name** | **String** | The name of the application. |  [optional] |
|**optionsPreflightBypass** | **Boolean** | Allows options preflight requests to bypass Access authentication and go directly to the origin. Cannot turn on if cors_headers is set. |  [optional] |
|**pathCookieAttribute** | **Boolean** | Enables cookie paths to scope an application&#39;s JWT to the application path. If disabled, the JWT will scope to the hostname by default |  [optional] |
|**sameSiteCookieAttribute** | **String** | Sets the SameSite cookie setting, which provides increased security against CSRF attacks. |  [optional] |
|**selfHostedDomains** | **List&lt;String&gt;** | List of domains that Access will secure. |  [optional] |
|**serviceAuth401Redirect** | **Boolean** | Returns a 401 status code when the request is blocked by a Service Auth policy. |  [optional] |
|**sessionDuration** | **String** | The amount of time that tokens issued for this application will be valid. Must be in the format &#x60;300ms&#x60; or &#x60;2h45m&#x60;. Valid time units are: ns, us (or µs), ms, s, m, h. |  [optional] |
|**skipInterstitial** | **Boolean** | Enables automatic authentication through cloudflared. |  [optional] |
|**tags** | **List&lt;String&gt;** | The tags you want assigned to an application. Tags are used to filter applications in the App Launcher dashboard. |  [optional] |
|**type** | **String** | The application type. |  |



