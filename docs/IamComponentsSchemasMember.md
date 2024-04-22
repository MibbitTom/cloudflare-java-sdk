

# IamComponentsSchemasMember


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**email** | **String** | The contact email address of the user. |  |
|**id** | **String** | Identifier |  [readonly] |
|**name** | **String** | Member Name. |  |
|**roles** | [**List&lt;IamSchemasRole&gt;**](IamSchemasRole.md) | Roles assigned to this Member. |  |
|**status** | [**StatusEnum**](#StatusEnum) | A member&#39;s status in the organization. |  |



## Enum: StatusEnum

| Name | Value |
|---- | -----|
| ACCEPTED | &quot;accepted&quot; |
| INVITED | &quot;invited&quot; |



