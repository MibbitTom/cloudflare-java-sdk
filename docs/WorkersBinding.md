

# WorkersBinding

A binding to allow the Worker to communicate with resources

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**name** | **String** | A JavaScript variable name for the binding. |  [readonly] |
|**namespaceId** | **String** | Namespace identifier tag. |  [readonly] |
|**type** | [**TypeEnum**](#TypeEnum) | The class of resource that the binding provides. |  |
|**environment** | **String** | The environment of the script_name to bind to |  |
|**service** | **String** | Name of Worker to bind to |  |
|**className** | **String** | The exported class name of the Durable Object |  |
|**scriptName** | **String** | The script where the Durable Object is defined, if it is external to this Worker |  [optional] |
|**bucketName** | **String** | R2 bucket to bind to |  |
|**queueName** | **String** | Name of the Queue to bind to |  |
|**binding** | **String** | A JavaScript variable name for the binding. |  [readonly] |
|**id** | **String** | ID of the D1 database to bind to |  |
|**namespace** | **String** | Namespace to bind to |  |
|**outbound** | [**WorkersDispatchNamespaceBindingOutbound**](WorkersDispatchNamespaceBindingOutbound.md) |  |  [optional] |
|**certificateId** | **String** | ID of the certificate to bind to |  [optional] |



## Enum: TypeEnum

| Name | Value |
|---- | -----|
| KV_NAMESPACE | &quot;kv_namespace&quot; |
| SERVICE | &quot;service&quot; |
| DURABLE_OBJECT_NAMESPACE | &quot;durable_object_namespace&quot; |
| R2_BUCKET | &quot;r2_bucket&quot; |
| QUEUE | &quot;queue&quot; |
| D1 | &quot;d1&quot; |
| DISPATCH_NAMESPACE | &quot;dispatch_namespace&quot; |
| MTLS_CERTIFICATE | &quot;mtls_certificate&quot; |



