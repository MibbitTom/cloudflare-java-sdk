

# FirewallAction


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**mode** | **FirewallMode** |  |  [optional] |
|**response** | [**FirewallCustomResponse**](FirewallCustomResponse.md) |  |  [optional] |
|**timeout** | **BigDecimal** | The time in seconds during which Cloudflare will perform the mitigation action. Must be an integer value greater than or equal to the period. Notes: If \&quot;mode\&quot; is \&quot;challenge\&quot;, \&quot;managed_challenge\&quot;, or \&quot;js_challenge\&quot;, Cloudflare will use the zone&#39;s Challenge Passage time and you should not provide this value. |  [optional] |



