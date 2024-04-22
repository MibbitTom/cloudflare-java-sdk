

# TeamsDevicesDevicePostureRules


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**description** | **String** | The description of the device posture rule. |  [optional] |
|**expiration** | **String** | Sets the expiration time for a posture check result. If empty, the result remains valid until it is overwritten by new data from the WARP client. |  [optional] |
|**id** | **String** | API UUID. |  [optional] |
|**input** | [**TeamsDevicesInput**](TeamsDevicesInput.md) |  |  [optional] |
|**match** | [**List&lt;TeamsDevicesMatchItem&gt;**](TeamsDevicesMatchItem.md) | The conditions that the client must match to run the rule. |  [optional] |
|**name** | **String** | The name of the device posture rule. |  [optional] |
|**schedule** | **String** | Polling frequency for the WARP client posture check. Default: &#x60;5m&#x60; (poll every five minutes). Minimum: &#x60;1m&#x60;. |  [optional] |
|**type** | **TeamsDevicesType** |  |  [optional] |



