

# PageShieldCreateAPageShieldPolicy4XXResponse


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**action** | **PageShieldPageshieldPolicyAction** |  |  [optional] |
|**description** | **String** | A description for the policy |  [optional] |
|**enabled** | **Boolean** | Whether the policy is enabled |  [optional] |
|**expression** | **String** | The expression which must match for the policy to be applied, using the Cloudflare Firewall rule expression syntax |  [optional] |
|**id** | **String** | The ID of the policy |  [optional] |
|**value** | **String** | The policy which will be applied |  [optional] |
|**errors** | [**List&lt;AaaMessagesInner&gt;**](AaaMessagesInner.md) |  |  |
|**messages** | [**List&lt;AaaMessagesInner&gt;**](AaaMessagesInner.md) |  |  |
|**result** | [**ResultEnum**](#ResultEnum) |  |  |
|**success** | **Boolean** | Whether the API call was successful |  |



## Enum: ResultEnum

| Name | Value |
|---- | -----|
| NULL | &quot;null&quot; |



