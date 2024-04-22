

# MagicVisibilityMnmRule


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**automaticAdvertisement** | **Boolean** | Toggle on if you would like Cloudflare to automatically advertise the IP Prefixes within the rule via Magic Transit when the rule is triggered. Only available for users of Magic Transit. |  |
|**bandwidthThreshold** | **BigDecimal** | The number of bits per second for the rule. When this value is exceeded for the set duration, an alert notification is sent. Minimum of 1 and no maximum. |  [optional] |
|**duration** | **String** | The amount of time that the rule threshold must be exceeded to send an alert notification. The final value must be equivalent to one of the following 8 values [\&quot;1m\&quot;,\&quot;5m\&quot;,\&quot;10m\&quot;,\&quot;15m\&quot;,\&quot;20m\&quot;,\&quot;30m\&quot;,\&quot;45m\&quot;,\&quot;60m\&quot;]. The format is AhBmCsDmsEusFns where A, B, C, D, E and F durations are optional; however at least one unit must be provided. |  |
|**id** | **String** | The id of the rule. Must be unique. |  [optional] |
|**name** | **String** | The name of the rule. Must be unique. Supports characters A-Z, a-z, 0-9, underscore (_), dash (-), period (.), and tilde (~). You can’t have a space in the rule name. Max 256 characters. |  |
|**packetThreshold** | **BigDecimal** | The number of packets per second for the rule. When this value is exceeded for the set duration, an alert notification is sent. Minimum of 1 and no maximum. |  [optional] |
|**prefixes** | **List&lt;String&gt;** |  |  |



