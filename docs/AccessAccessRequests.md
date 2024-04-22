

# AccessAccessRequests


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**action** | **String** | The event that occurred, such as a login attempt. |  [optional] |
|**allowed** | **Boolean** | The result of the authentication event. |  [optional] |
|**appDomain** | **String** | The URL of the Access application. |  [optional] |
|**appUid** | **String** | The unique identifier for the Access application. |  [optional] |
|**connection** | **String** | The IdP used to authenticate. |  [optional] |
|**createdAt** | **OffsetDateTime** |  |  [optional] [readonly] |
|**ipAddress** | **String** | The IP address of the authenticating user. |  [optional] |
|**rayId** | **String** | The unique identifier for the request to Cloudflare. |  [optional] |
|**userEmail** | **String** | The email address of the authenticating user. |  [optional] |



