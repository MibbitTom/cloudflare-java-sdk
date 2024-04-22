

# WorkersDoBinding


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**className** | **String** | The exported class name of the Durable Object |  |
|**environment** | **String** | The environment of the script_name to bind to |  [optional] |
|**name** | **String** | A JavaScript variable name for the binding. |  [readonly] |
|**namespaceId** | **String** | Namespace identifier tag. |  [optional] [readonly] |
|**scriptName** | **String** | The script where the Durable Object is defined, if it is external to this Worker |  [optional] |
|**type** | [**TypeEnum**](#TypeEnum) | The class of resource that the binding provides. |  |



## Enum: TypeEnum

| Name | Value |
|---- | -----|
| DURABLE_OBJECT_NAMESPACE | &quot;durable_object_namespace&quot; |



