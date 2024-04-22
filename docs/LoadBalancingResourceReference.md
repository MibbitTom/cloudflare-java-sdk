

# LoadBalancingResourceReference

A reference to a load balancer resource.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**referenceType** | [**ReferenceTypeEnum**](#ReferenceTypeEnum) | When listed as a reference, the type (direction) of the reference. |  [optional] |
|**references** | **List&lt;Object&gt;** | A list of references to (referrer) or from (referral) this resource. |  [optional] |
|**resourceId** | **Object** |  |  [optional] |
|**resourceName** | **String** | The human-identifiable name of the resource. |  [optional] |
|**resourceType** | [**ResourceTypeEnum**](#ResourceTypeEnum) | The type of the resource. |  [optional] |



## Enum: ReferenceTypeEnum

| Name | Value |
|---- | -----|
| REFERRAL | &quot;referral&quot; |
| REFERRER | &quot;referrer&quot; |



## Enum: ResourceTypeEnum

| Name | Value |
|---- | -----|
| LOAD_BALANCER | &quot;load_balancer&quot; |
| MONITOR | &quot;monitor&quot; |
| POOL | &quot;pool&quot; |



