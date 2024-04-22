

# EdgeTTL

TTL (Time to Live) specifies the maximum time to cache a resource in the Cloudflare edge network.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**_default** | **Integer** | The TTL (in seconds) if you choose override_origin mode. |  |
|**mode** | [**ModeEnum**](#ModeEnum) | edge ttl options |  |
|**statusCodeTtl** | [**List&lt;StatusCodeTTL&gt;**](StatusCodeTTL.md) | List of single status codes, or status code ranges to apply the selected mode |  |



## Enum: ModeEnum

| Name | Value |
|---- | -----|
| RESPECT_ORIGIN | &quot;respect_origin&quot; |
| BYPASS_BY_DEFAULT | &quot;bypass_by_default&quot; |
| OVERRIDE_ORIGIN | &quot;override_origin&quot; |



