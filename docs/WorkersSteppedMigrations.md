

# WorkersSteppedMigrations


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**newTag** | **String** | Tag to set as the latest migration tag. |  [optional] |
|**oldTag** | **String** | Tag used to verify against the latest migration tag for this Worker. If they don&#39;t match, the upload is rejected. |  [optional] |
|**steps** | [**List&lt;WorkersMigrationStep&gt;**](WorkersMigrationStep.md) | Migrations to apply in order. |  [optional] |



