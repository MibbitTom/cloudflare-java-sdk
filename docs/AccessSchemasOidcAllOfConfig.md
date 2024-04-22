

# AccessSchemasOidcAllOfConfig


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**clientId** | **String** | Your OAuth Client ID |  [optional] |
|**clientSecret** | **String** | Your OAuth Client Secret |  [optional] |
|**authUrl** | **String** | The authorization_endpoint URL of your IdP |  [optional] |
|**certsUrl** | **String** | The jwks_uri endpoint of your IdP to allow the IdP keys to sign the tokens |  [optional] |
|**claims** | **List&lt;String&gt;** | List of custom claims that will be pulled from your id_token and added to your signed Access JWT token. |  [optional] |
|**scopes** | **List&lt;String&gt;** | OAuth scopes |  [optional] |
|**tokenUrl** | **String** | The token_endpoint URL of your IdP |  [optional] |


