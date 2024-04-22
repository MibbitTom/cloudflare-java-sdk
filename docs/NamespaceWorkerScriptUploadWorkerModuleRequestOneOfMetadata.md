

# NamespaceWorkerScriptUploadWorkerModuleRequestOneOfMetadata

JSON encoded metadata about the uploaded parts and Worker configuration.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**bindings** | **List&lt;Object&gt;** | List of bindings available to the worker. |  [optional] |
|**bodyPart** | **String** | Name of the part in the multipart request that contains the script (e.g. the file adding a listener to the &#x60;fetch&#x60; event). Indicates a &#x60;service worker syntax&#x60; Worker. |  [optional] |
|**compatibilityDate** | **String** | Date indicating targeted support in the Workers runtime. Backwards incompatible fixes to the runtime following this date will not affect this Worker. |  [optional] |
|**compatibilityFlags** | **List&lt;String&gt;** | Flags that enable or disable certain features in the Workers runtime. Used to enable upcoming features or opt in or out of specific changes not included in a &#x60;compatibility_date&#x60;. |  [optional] |
|**keepBindings** | **List&lt;String&gt;** | List of binding types to keep from previous_upload. |  [optional] |
|**logpush** | **Boolean** | Whether Logpush is turned on for the Worker. |  [optional] |
|**mainModule** | **String** | Name of the part in the multipart request that contains the main module (e.g. the file exporting a &#x60;fetch&#x60; handler). Indicates a &#x60;module syntax&#x60; Worker. |  [optional] |
|**migrations** | [**NamespaceWorkerScriptUploadWorkerModuleRequestOneOfMetadataMigrations**](NamespaceWorkerScriptUploadWorkerModuleRequestOneOfMetadataMigrations.md) |  |  [optional] |
|**placement** | [**WorkersPlacementConfig**](WorkersPlacementConfig.md) |  |  [optional] |
|**tags** | **List&lt;String&gt;** | List of strings to use as tags for this Worker |  [optional] |
|**tailConsumers** | [**List&lt;WorkersTailConsumersScript&gt;**](WorkersTailConsumersScript.md) | List of Workers that will consume logs from the attached Worker. |  [optional] |
|**usageModel** | [**UsageModelEnum**](#UsageModelEnum) | Usage model to apply to invocations. |  [optional] |
|**versionTags** | **Object** | Key-value pairs to use as tags for this version of this Worker |  [optional] |



## Enum: UsageModelEnum

| Name | Value |
|---- | -----|
| BUNDLED | &quot;bundled&quot; |
| UNBOUND | &quot;unbound&quot; |



