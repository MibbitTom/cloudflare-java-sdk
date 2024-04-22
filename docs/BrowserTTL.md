

# BrowserTTL

Specify how long client browsers should cache the response. Cloudflare cache purge will not purge content cached on client browsers, so high browser TTLs may lead to stale content.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**_default** | **Integer** | The TTL (in seconds) if you choose override_origin mode. |  [optional] |
|**mode** | [**ModeEnum**](#ModeEnum) | Determines which browser ttl mode to use. |  |



## Enum: ModeEnum

| Name | Value |
|---- | -----|
| RESPECT_ORIGIN | &quot;respect_origin&quot; |
| BYPASS_BY_DEFAULT | &quot;bypass_by_default&quot; |
| OVERRIDE_ORIGIN | &quot;override_origin&quot; |



