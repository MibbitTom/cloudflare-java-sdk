

# ZoneLevelZeroTrustOrganizationCreateYourZeroTrustOrganizationRequest


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**authDomain** | **String** | The unique subdomain assigned to your Zero Trust organization. |  |
|**isUiReadOnly** | **Boolean** | Lock all settings as Read-Only in the Dashboard, regardless of user permission. Updates may only be made via the API or Terraform for this account when enabled. |  [optional] |
|**loginDesign** | [**AccessLoginDesign**](AccessLoginDesign.md) |  |  [optional] |
|**name** | **String** | The name of your Zero Trust organization. |  |
|**uiReadOnlyToggleReason** | **String** | A description of the reason why the UI read only field is being toggled. |  [optional] |
|**userSeatExpirationInactiveTime** | **String** | The amount of time a user seat is inactive before it expires. When the user seat exceeds the set time of inactivity, the user is removed as an active seat and no longer counts against your Teams seat count. Must be in the format &#x60;300ms&#x60; or &#x60;2h45m&#x60;. Valid time units are: &#x60;ns&#x60;, &#x60;us&#x60; (or &#x60;µs&#x60;), &#x60;ms&#x60;, &#x60;s&#x60;, &#x60;m&#x60;, &#x60;h&#x60;. |  [optional] |



