

# AaaWebhooks


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**createdAt** | **OffsetDateTime** | Timestamp of when the webhook destination was created. |  [optional] [readonly] |
|**id** | **String** | The unique identifier of a webhook |  [optional] [readonly] |
|**lastFailure** | **OffsetDateTime** | Timestamp of the last time an attempt to dispatch a notification to this webhook failed. |  [optional] [readonly] |
|**lastSuccess** | **OffsetDateTime** | Timestamp of the last time Cloudflare was able to successfully dispatch a notification using this webhook. |  [optional] [readonly] |
|**name** | **String** | The name of the webhook destination. This will be included in the request body when you receive a webhook notification. |  [optional] |
|**secret** | **String** | Optional secret that will be passed in the &#x60;cf-webhook-auth&#x60; header when dispatching generic webhook notifications or formatted for supported destinations. Secrets are not returned in any API response body. |  [optional] |
|**type** | **AaaComponentsSchemasType** |  |  [optional] |
|**url** | **String** | The POST endpoint to call when dispatching a notification. |  [optional] |



