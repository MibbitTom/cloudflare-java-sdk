

# PagesDeployments


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**aliases** | **List&lt;Object&gt;** | A list of alias URLs pointing to this deployment. |  [optional] [readonly] |
|**buildConfig** | **Object** |  |  [optional] [readonly] |
|**createdOn** | **OffsetDateTime** | When the deployment was created. |  [optional] [readonly] |
|**deploymentTrigger** | [**PagesDeploymentsDeploymentTrigger**](PagesDeploymentsDeploymentTrigger.md) |  |  [optional] |
|**envVars** | **Object** | A dict of env variables to build this deploy. |  [optional] [readonly] |
|**environment** | **String** | Type of deploy. |  [optional] [readonly] |
|**id** | **String** | Id of the deployment. |  [optional] [readonly] |
|**isSkipped** | **Boolean** | If the deployment has been skipped. |  [optional] [readonly] |
|**latestStage** | **Object** |  |  [optional] [readonly] |
|**modifiedOn** | **OffsetDateTime** | When the deployment was last modified. |  [optional] [readonly] |
|**projectId** | **String** | Id of the project. |  [optional] [readonly] |
|**projectName** | **String** | Name of the project. |  [optional] [readonly] |
|**shortId** | **String** | Short Id (8 character) of the deployment. |  [optional] [readonly] |
|**source** | **Object** |  |  [optional] [readonly] |
|**stages** | [**List&lt;PagesStage&gt;**](PagesStage.md) | List of past stages. |  [optional] [readonly] |
|**url** | **String** | The live URL to view this deployment. |  [optional] [readonly] |



