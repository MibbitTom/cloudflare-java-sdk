

# AppLauncherApplication


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**aud** | **String** | Audience tag. |  [optional] [readonly] |
|**createdAt** | **OffsetDateTime** |  |  [optional] [readonly] |
|**id** | **String** | UUID |  [optional] [readonly] |
|**updatedAt** | **OffsetDateTime** |  |  [optional] [readonly] |
|**allowedIdps** | **List&lt;String&gt;** | The identity providers your users can select when connecting to this application. Defaults to all IdPs configured in your account. |  [optional] |
|**autoRedirectToIdentity** | **Boolean** | When set to &#x60;true&#x60;, users skip the identity provider selection step during login. You must specify only one identity provider in allowed_idps. |  [optional] |
|**domain** | **Object** |  |  [optional] [readonly] |
|**name** | **Object** |  |  [optional] [readonly] |
|**sessionDuration** | **String** | The amount of time that tokens issued for this application will be valid. Must be in the format &#x60;300ms&#x60; or &#x60;2h45m&#x60;. Valid time units are: ns, us (or µs), ms, s, m, h. |  [optional] |
|**type** | **String** | The application type. |  |



