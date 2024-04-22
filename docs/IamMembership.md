

# IamMembership


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**account** | [**IamSchemasAccount**](IamSchemasAccount.md) |  |  [optional] |
|**apiAccessEnabled** | **Boolean** | Enterprise only. Indicates whether or not API access is enabled specifically for this user on a given account. |  [optional] |
|**code** | **String** | The unique activation code for the account membership. |  [optional] [readonly] |
|**id** | **String** | Membership identifier tag. |  [optional] [readonly] |
|**permissions** | [**IamMembershipPermissions**](IamMembershipPermissions.md) |  |  [optional] |
|**roles** | **List&lt;String&gt;** | List of role names for the user at the account. |  [optional] [readonly] |
|**status** | **IamSchemasStatus** |  |  [optional] |



