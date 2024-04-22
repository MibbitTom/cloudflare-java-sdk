

# IamOrganizationInvite


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**expiresOn** | **OffsetDateTime** | When the invite is no longer active. |  [optional] [readonly] |
|**id** | **String** | Invite identifier tag. |  [optional] [readonly] |
|**invitedBy** | **String** | The email address of the user who created the invite. |  [optional] |
|**invitedMemberEmail** | **String** | Email address of the user to add to the organization. |  [optional] |
|**invitedMemberId** | **String** | ID of the user to add to the organization. |  [readonly] |
|**invitedOn** | **OffsetDateTime** | When the invite was sent. |  [optional] [readonly] |
|**organizationId** | **String** | ID of the organization the user will be added to. |  [readonly] |
|**organizationName** | **String** | Organization name. |  [optional] [readonly] |
|**roles** | [**List&lt;IamSchemasRole&gt;**](IamSchemasRole.md) | Roles to be assigned to this user. |  [optional] |
|**organizationIsEnforcingTwofactor** | **Boolean** | Current status of two-factor enforcement on the organization. |  [optional] |
|**status** | [**StatusEnum**](#StatusEnum) | Current status of the invitation. |  [optional] |



## Enum: StatusEnum

| Name | Value |
|---- | -----|
| PENDING | &quot;pending&quot; |
| ACCEPTED | &quot;accepted&quot; |
| REJECTED | &quot;rejected&quot; |
| CANCELED | &quot;canceled&quot; |
| LEFT | &quot;left&quot; |
| EXPIRED | &quot;expired&quot; |



