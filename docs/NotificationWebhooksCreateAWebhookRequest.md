

# NotificationWebhooksCreateAWebhookRequest


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**name** | **String** | The name of the webhook destination. This will be included in the request body when you receive a webhook notification. |  |
|**secret** | **String** | Optional secret that will be passed in the &#x60;cf-webhook-auth&#x60; header when dispatching generic webhook notifications or formatted for supported destinations. Secrets are not returned in any API response body. |  [optional] |
|**url** | **String** | The POST endpoint to call when dispatching a notification. |  |



