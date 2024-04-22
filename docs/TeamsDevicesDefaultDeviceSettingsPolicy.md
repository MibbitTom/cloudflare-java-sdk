

# TeamsDevicesDefaultDeviceSettingsPolicy


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**allowModeSwitch** | **Boolean** | Whether to allow the user to switch WARP between modes. |  [optional] |
|**allowUpdates** | **Boolean** | Whether to receive update notifications when a new version of the client is available. |  [optional] |
|**allowedToLeave** | **Boolean** | Whether to allow devices to leave the organization. |  [optional] |
|**autoConnect** | **BigDecimal** | The amount of time in minutes to reconnect after having been disabled. |  [optional] |
|**captivePortal** | **BigDecimal** | Turn on the captive portal after the specified amount of time. |  [optional] |
|**_default** | **Boolean** | Whether the policy will be applied to matching devices. |  [optional] |
|**disableAutoFallback** | **Boolean** | If the &#x60;dns_server&#x60; field of a fallback domain is not present, the client will fall back to a best guess of the default/system DNS resolvers unless this policy option is set to &#x60;true&#x60;. |  [optional] |
|**enabled** | **Boolean** | Whether the policy will be applied to matching devices. |  [optional] |
|**exclude** | [**List&lt;TeamsDevicesSplitTunnel&gt;**](TeamsDevicesSplitTunnel.md) |  |  [optional] |
|**excludeOfficeIps** | **Boolean** | Whether to add Microsoft IPs to Split Tunnel exclusions. |  [optional] |
|**fallbackDomains** | [**List&lt;TeamsDevicesFallbackDomain&gt;**](TeamsDevicesFallbackDomain.md) |  |  [optional] |
|**gatewayUniqueId** | **String** |  |  [optional] |
|**include** | [**List&lt;TeamsDevicesSplitTunnelInclude&gt;**](TeamsDevicesSplitTunnelInclude.md) |  |  [optional] |
|**serviceModeV2** | [**TeamsDevicesServiceModeV2**](TeamsDevicesServiceModeV2.md) |  |  [optional] |
|**supportUrl** | **String** | The URL to launch when the Send Feedback button is clicked. |  [optional] |
|**switchLocked** | **Boolean** | Whether to allow the user to turn off the WARP switch and disconnect the client. |  [optional] |



