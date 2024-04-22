

# AccessPolicies


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**approvalGroups** | [**List&lt;AccessApprovalGroup&gt;**](AccessApprovalGroup.md) | Administrators who can approve a temporary authentication request. |  [optional] |
|**approvalRequired** | **Boolean** | Requires the user to request access from an administrator at the start of each session. |  [optional] |
|**createdAt** | **OffsetDateTime** |  |  [optional] [readonly] |
|**decision** | **AccessDecision** |  |  [optional] |
|**exclude** | [**List&lt;AccessRule&gt;**](AccessRule.md) | Rules evaluated with a NOT logical operator. To match the policy, a user cannot meet any of the Exclude rules. |  [optional] |
|**id** | **String** | UUID |  [optional] [readonly] |
|**include** | [**List&lt;AccessRule&gt;**](AccessRule.md) | Rules evaluated with an OR logical operator. A user needs to meet only one of the Include rules. |  [optional] |
|**isolationRequired** | **Boolean** | Require this application to be served in an isolated browser for users matching this policy. &#39;Client Web Isolation&#39; must be on for the account in order to use this feature. |  [optional] |
|**name** | **String** | The name of the Access policy. |  [optional] |
|**precedence** | **Integer** | The order of execution for this policy. Must be unique for each policy. |  [optional] |
|**purposeJustificationPrompt** | **String** | A custom message that will appear on the purpose justification screen. |  [optional] |
|**purposeJustificationRequired** | **Boolean** | Require users to enter a justification when they log in to the application. |  [optional] |
|**require** | [**List&lt;AccessRule&gt;**](AccessRule.md) | Rules evaluated with an AND logical operator. To match the policy, a user must meet all of the Require rules. |  [optional] |
|**sessionDuration** | **String** | The amount of time that tokens issued for the application will be valid. Must be in the format &#x60;300ms&#x60; or &#x60;2h45m&#x60;. Valid time units are: ns, us (or µs), ms, s, m, h. |  [optional] |
|**updatedAt** | **OffsetDateTime** |  |  [optional] [readonly] |



