

# AaaPolicies


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**alertType** | **AaaAlertType** |  |  [optional] |
|**created** | **OffsetDateTime** |  |  [optional] [readonly] |
|**description** | **String** | Optional description for the Notification policy. |  [optional] |
|**enabled** | **Boolean** | Whether or not the Notification policy is enabled. |  [optional] |
|**filters** | [**AaaFilters**](AaaFilters.md) |  |  [optional] |
|**id** | **String** | The unique identifier of a notification policy |  [optional] [readonly] |
|**mechanisms** | **Map&lt;String, List&lt;AaaMechanismsValueInner&gt;&gt;** | List of IDs that will be used when dispatching a notification. IDs for email type will be the email address. |  [optional] |
|**modified** | **OffsetDateTime** |  |  [optional] [readonly] |
|**name** | **String** | Name of the policy. |  [optional] |



