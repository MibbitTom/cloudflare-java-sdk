

# LoadBalancingLocationStrategy

Controls location-based steering for non-proxied requests. See `steering_policy` to learn how steering is affected.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**mode** | [**ModeEnum**](#ModeEnum) | Determines the authoritative location when ECS is not preferred, does not exist in the request, or its GeoIP lookup is unsuccessful. - &#x60;\&quot;pop\&quot;&#x60;: Use the Cloudflare PoP location. - &#x60;\&quot;resolver_ip\&quot;&#x60;: Use the DNS resolver GeoIP location. If the GeoIP lookup is unsuccessful, use the Cloudflare PoP location. |  [optional] |
|**preferEcs** | [**PreferEcsEnum**](#PreferEcsEnum) | Whether the EDNS Client Subnet (ECS) GeoIP should be preferred as the authoritative location. - &#x60;\&quot;always\&quot;&#x60;: Always prefer ECS. - &#x60;\&quot;never\&quot;&#x60;: Never prefer ECS. - &#x60;\&quot;proximity\&quot;&#x60;: Prefer ECS only when &#x60;steering_policy&#x3D;\&quot;proximity\&quot;&#x60;. - &#x60;\&quot;geo\&quot;&#x60;: Prefer ECS only when &#x60;steering_policy&#x3D;\&quot;geo\&quot;&#x60;. |  [optional] |



## Enum: ModeEnum

| Name | Value |
|---- | -----|
| POP | &quot;pop&quot; |
| RESOLVER_IP | &quot;resolver_ip&quot; |



## Enum: PreferEcsEnum

| Name | Value |
|---- | -----|
| ALWAYS | &quot;always&quot; |
| NEVER | &quot;never&quot; |
| PROXIMITY | &quot;proximity&quot; |
| GEO | &quot;geo&quot; |



