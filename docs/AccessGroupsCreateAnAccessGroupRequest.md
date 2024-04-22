

# AccessGroupsCreateAnAccessGroupRequest


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**exclude** | [**List&lt;AccessRule&gt;**](AccessRule.md) | Rules evaluated with a NOT logical operator. To match a policy, a user cannot meet any of the Exclude rules. |  [optional] |
|**include** | [**List&lt;AccessRule&gt;**](AccessRule.md) | Rules evaluated with an OR logical operator. A user needs to meet only one of the Include rules. |  |
|**isDefault** | **Boolean** | Whether this is the default group |  [optional] |
|**name** | **String** | The name of the Access group. |  |
|**require** | [**List&lt;AccessRule&gt;**](AccessRule.md) | Rules evaluated with an AND logical operator. To match a policy, a user must meet all of the Require rules. |  [optional] |



