

# AccessSchemasPolicies


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**approvalGroups** | [**List&lt;AccessSchemasApprovalGroup&gt;**](AccessSchemasApprovalGroup.md) | Administrators who can approve a temporary authentication request. |  [optional] |
|**approvalRequired** | **Boolean** | Requires the user to request access from an administrator at the start of each session. |  [optional] |
|**createdAt** | **OffsetDateTime** |  |  [optional] [readonly] |
|**decision** | **AccessDecision** |  |  [optional] |
|**exclude** | [**List&lt;AccessRule&gt;**](AccessRule.md) | Rules evaluated with a NOT logical operator. To match the policy, a user cannot meet any of the Exclude rules. |  [optional] |
|**id** | **String** | UUID |  [optional] [readonly] |
|**include** | [**List&lt;AccessRule&gt;**](AccessRule.md) | Rules evaluated with an OR logical operator. A user needs to meet only one of the Include rules. |  [optional] |
|**isolationRequired** | **Boolean** | Require this application to be served in an isolated browser for users matching this policy. |  [optional] |
|**name** | **String** | The name of the Access policy. |  [optional] |
|**precedence** | **Integer** | The order of execution for this policy. Must be unique for each policy. |  [optional] |
|**purposeJustificationPrompt** | **String** | A custom message that will appear on the purpose justification screen. |  [optional] |
|**purposeJustificationRequired** | **Boolean** | Require users to enter a justification when they log in to the application. |  [optional] |
|**require** | [**List&lt;AccessRule&gt;**](AccessRule.md) | Rules evaluated with an AND logical operator. To match the policy, a user must meet all of the Require rules. |  [optional] |
|**updatedAt** | **OffsetDateTime** |  |  [optional] [readonly] |



