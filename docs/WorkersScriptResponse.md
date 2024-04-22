

# WorkersScriptResponse


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**createdOn** | **OffsetDateTime** | When the script was created. |  [optional] [readonly] |
|**etag** | **String** | Hashed script content, can be used in a If-None-Match header when updating. |  [optional] [readonly] |
|**id** | **String** | The id of the script in the Workers system. Usually the script name. |  [optional] [readonly] |
|**logpush** | **Boolean** | Whether Logpush is turned on for the Worker. |  [optional] |
|**modifiedOn** | **OffsetDateTime** | When the script was last modified. |  [optional] [readonly] |
|**placementMode** | **String** | Specifies the placement mode for the Worker (e.g. &#39;smart&#39;). |  [optional] |
|**tailConsumers** | [**List&lt;WorkersTailConsumersScript&gt;**](WorkersTailConsumersScript.md) | List of Workers that will consume logs from the attached Worker. |  [optional] |
|**usageModel** | **String** | Specifies the usage model for the Worker (e.g. &#39;bundled&#39; or &#39;unbound&#39;). |  [optional] |



