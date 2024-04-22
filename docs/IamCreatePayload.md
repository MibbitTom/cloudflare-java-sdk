

# IamCreatePayload


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**condition** | [**IamCondition**](IamCondition.md) |  |  [optional] |
|**expiresOn** | **OffsetDateTime** | The expiration time on or after which the JWT MUST NOT be accepted for processing. |  [optional] |
|**name** | **String** | Token name. |  |
|**notBefore** | **OffsetDateTime** | The time before which the token MUST NOT be accepted for processing. |  [optional] |
|**policies** | [**List&lt;IamAccessPolicy&gt;**](IamAccessPolicy.md) | List of access policies assigned to the token. |  |



