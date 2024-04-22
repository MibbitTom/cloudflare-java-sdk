

# WorkersSingleStepMigrations

A single set of migrations to apply.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**newTag** | **String** | Tag to set as the latest migration tag. |  [optional] |
|**oldTag** | **String** | Tag used to verify against the latest migration tag for this Worker. If they don&#39;t match, the upload is rejected. |  [optional] |
|**deletedClasses** | **List&lt;String&gt;** | A list of classes to delete Durable Object namespaces from. |  [optional] |
|**newClasses** | **List&lt;String&gt;** | A list of classes to create Durable Object namespaces from. |  [optional] |
|**renamedClasses** | [**List&lt;WorkersMigrationStepRenamedClassesInner&gt;**](WorkersMigrationStepRenamedClassesInner.md) | A list of classes with Durable Object namespaces that were renamed. |  [optional] |
|**transferredClasses** | [**List&lt;WorkersMigrationStepTransferredClassesInner&gt;**](WorkersMigrationStepTransferredClassesInner.md) | A list of transfers for Durable Object namespaces from a different Worker and class to a class defined in this Worker. |  [optional] |



