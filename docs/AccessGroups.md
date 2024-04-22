

# AccessGroups


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**createdAt** | **OffsetDateTime** |  |  [optional] [readonly] |
|**exclude** | [**List&lt;AccessRule&gt;**](AccessRule.md) | Rules evaluated with a NOT logical operator. To match a policy, a user cannot meet any of the Exclude rules. |  [optional] |
|**id** | **String** | UUID |  [optional] [readonly] |
|**include** | [**List&lt;AccessRule&gt;**](AccessRule.md) | Rules evaluated with an OR logical operator. A user needs to meet only one of the Include rules. |  [optional] |
|**isDefault** | [**List&lt;AccessRule&gt;**](AccessRule.md) | Rules evaluated with an AND logical operator. To match a policy, a user must meet all of the Require rules. |  [optional] |
|**name** | **String** | The name of the Access group. |  [optional] |
|**require** | [**List&lt;AccessRule&gt;**](AccessRule.md) | Rules evaluated with an AND logical operator. To match a policy, a user must meet all of the Require rules. |  [optional] |
|**updatedAt** | **OffsetDateTime** |  |  [optional] [readonly] |



