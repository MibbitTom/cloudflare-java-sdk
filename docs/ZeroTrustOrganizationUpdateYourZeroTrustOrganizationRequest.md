

# ZeroTrustOrganizationUpdateYourZeroTrustOrganizationRequest


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**allowAuthenticateViaWarp** | **Boolean** | When set to true, users can authenticate via WARP for any application in your organization. Application settings will take precedence over this value. |  [optional] |
|**authDomain** | **String** | The unique subdomain assigned to your Zero Trust organization. |  [optional] |
|**autoRedirectToIdentity** | **Boolean** | When set to &#x60;true&#x60;, users skip the identity provider selection step during login. |  [optional] |
|**customPages** | [**AccessCustomPages**](AccessCustomPages.md) |  |  [optional] |
|**isUiReadOnly** | **Boolean** | Lock all settings as Read-Only in the Dashboard, regardless of user permission. Updates may only be made via the API or Terraform for this account when enabled. |  [optional] |
|**loginDesign** | [**AccessLoginDesign**](AccessLoginDesign.md) |  |  [optional] |
|**name** | **String** | The name of your Zero Trust organization. |  [optional] |
|**sessionDuration** | **String** | The amount of time that tokens issued for applications will be valid. Must be in the format &#x60;300ms&#x60; or &#x60;2h45m&#x60;. Valid time units are: ns, us (or µs), ms, s, m, h. |  [optional] |
|**uiReadOnlyToggleReason** | **String** | A description of the reason why the UI read only field is being toggled. |  [optional] |
|**userSeatExpirationInactiveTime** | **String** | The amount of time a user seat is inactive before it expires. When the user seat exceeds the set time of inactivity, the user is removed as an active seat and no longer counts against your Teams seat count. Must be in the format &#x60;300ms&#x60; or &#x60;2h45m&#x60;. Valid time units are: &#x60;ns&#x60;, &#x60;us&#x60; (or &#x60;µs&#x60;), &#x60;ms&#x60;, &#x60;s&#x60;, &#x60;m&#x60;, &#x60;h&#x60;. |  [optional] |
|**warpAuthSessionDuration** | **String** | The amount of time that tokens issued for applications will be valid. Must be in the format &#x60;30m&#x60; or &#x60;2h45m&#x60;. Valid time units are: m, h. |  [optional] |



