

# LoadBalancingFilterOptions

Filter options for a particular resource type (pool or origin). Use null to reset.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**disable** | **Boolean** | If set true, disable notifications for this type of resource (pool or origin). |  [optional] |
|**healthy** | **Boolean** | If present, send notifications only for this health status (e.g. false for only DOWN events). Use null to reset (all events). |  [optional] |



