

# AaaAuditLogsActor


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**email** | **String** | The email of the user that performed the action. |  [optional] |
|**id** | **String** | The ID of the actor that performed the action. If a user performed the action, this will be their User ID. |  [optional] |
|**ip** | **String** | The IP address of the request that performed the action. |  [optional] |
|**type** | [**TypeEnum**](#TypeEnum) | The type of actor, whether a User, Cloudflare Admin, or an Automated System. |  [optional] |



## Enum: TypeEnum

| Name | Value |
|---- | -----|
| USER | &quot;user&quot; |
| ADMIN | &quot;admin&quot; |
| CLOUDFLARE | &quot;Cloudflare&quot; |



