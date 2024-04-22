

# PagesProjects


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**buildConfig** | [**PagesBuildConfig**](PagesBuildConfig.md) |  |  [optional] |
|**canonicalDeployment** | [**PagesDeployments**](PagesDeployments.md) |  |  [optional] |
|**createdOn** | **OffsetDateTime** | When the project was created. |  [optional] [readonly] |
|**deploymentConfigs** | [**PagesDeploymentConfigs**](PagesDeploymentConfigs.md) |  |  [optional] |
|**domains** | **List&lt;Object&gt;** | A list of associated custom domains for the project. |  [optional] [readonly] |
|**id** | **String** | Id of the project. |  [optional] [readonly] |
|**latestDeployment** | [**PagesDeployments**](PagesDeployments.md) |  |  [optional] |
|**name** | **String** | Name of the project. |  [optional] |
|**productionBranch** | **String** | Production branch of the project. Used to identify production deployments. |  [optional] |
|**source** | **Object** |  |  [optional] [readonly] |
|**subdomain** | **String** | The Cloudflare subdomain associated with the project. |  [optional] [readonly] |



