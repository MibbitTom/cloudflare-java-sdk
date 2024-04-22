

# NotificationPoliciesUpdateANotificationPolicyRequest


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**alertType** | **AaaAlertType** |  |  [optional] |
|**description** | **String** | Optional description for the Notification policy. |  [optional] |
|**enabled** | **Boolean** | Whether or not the Notification policy is enabled. |  [optional] |
|**filters** | [**AaaFilters**](AaaFilters.md) |  |  [optional] |
|**mechanisms** | **Map&lt;String, List&lt;AaaMechanismsValueInner&gt;&gt;** | List of IDs that will be used when dispatching a notification. IDs for email type will be the email address. |  [optional] |
|**name** | **String** | Name of the policy. |  [optional] |



