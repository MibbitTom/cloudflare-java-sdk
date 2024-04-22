

# MagicRoute


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**createdOn** | **OffsetDateTime** | When the route was created. |  [optional] [readonly] |
|**description** | **String** | An optional human provided description of the static route. |  [optional] |
|**id** | **String** | Identifier |  [optional] [readonly] |
|**modifiedOn** | **OffsetDateTime** | When the route was last modified. |  [optional] [readonly] |
|**nexthop** | **String** | The next-hop IP Address for the static route. |  |
|**prefix** | **String** | IP Prefix in Classless Inter-Domain Routing format. |  |
|**priority** | **Integer** | Priority of the static route. |  |
|**scope** | [**MagicScope**](MagicScope.md) |  |  [optional] |
|**weight** | **Integer** | Optional weight of the ECMP scope - if provided. |  [optional] |



