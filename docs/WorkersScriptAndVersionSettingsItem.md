

# WorkersScriptAndVersionSettingsItem


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**bindings** | [**List&lt;WorkersBinding&gt;**](WorkersBinding.md) | List of bindings attached to this Worker |  [optional] |
|**compatibilityDate** | **String** | Opt your Worker into changes after this date |  [optional] |
|**compatibilityFlags** | **List&lt;String&gt;** | Opt your Worker into specific changes |  [optional] |
|**limits** | [**WorkersLimits**](WorkersLimits.md) |  |  [optional] |
|**logpush** | **Boolean** | Whether Logpush is turned on for the Worker. |  [optional] |
|**migrations** | [**WorkersScriptAndVersionSettingsItemMigrations**](WorkersScriptAndVersionSettingsItemMigrations.md) |  |  [optional] |
|**placement** | [**WorkersPlacementConfig**](WorkersPlacementConfig.md) |  |  [optional] |
|**tags** | **List&lt;String&gt;** | Tags to help you manage your Workers |  [optional] |
|**tailConsumers** | [**List&lt;WorkersTailConsumersScript&gt;**](WorkersTailConsumersScript.md) | List of Workers that will consume logs from the attached Worker. |  [optional] |
|**usageModel** | **String** | Specifies the usage model for the Worker (e.g. &#39;bundled&#39; or &#39;unbound&#39;). |  [optional] |



