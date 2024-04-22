

# LoadBalancingRandomSteering

Configures pool weights. - `steering_policy=\"random\"`: A random pool is selected with probability proportional to pool weights. - `steering_policy=\"least_outstanding_requests\"`: Use pool weights to scale each pool's outstanding requests. - `steering_policy=\"least_connections\"`: Use pool weights to scale each pool's open connections.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**defaultWeight** | **BigDecimal** | The default weight for pools in the load balancer that are not specified in the pool_weights map. |  [optional] |
|**poolWeights** | **Object** | A mapping of pool IDs to custom weights. The weight is relative to other pools in the load balancer. |  [optional] |



