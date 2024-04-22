

# ZeroTrustGatewayLocationsCreateZeroTrustGatewayLocationRequest


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**clientDefault** | **Boolean** | True if the location is the default location. |  [optional] |
|**ecsSupport** | **Boolean** | True if the location needs to resolve EDNS queries. |  [optional] |
|**name** | **String** | The name of the location. |  |
|**networks** | [**List&lt;ZeroTrustGatewayNetwork&gt;**](ZeroTrustGatewayNetwork.md) | A list of network ranges that requests from this location would originate from. |  [optional] |



