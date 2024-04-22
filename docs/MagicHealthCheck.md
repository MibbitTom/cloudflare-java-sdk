

# MagicHealthCheck


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**direction** | [**DirectionEnum**](#DirectionEnum) | The direction of the flow of the healthcheck. Either unidirectional, where the probe comes to you via the tunnel and the result comes back to Cloudflare via the open Internet, or bidirectional where both the probe and result come and go via the tunnel. Note in the case of bidirecitonal healthchecks, the target field in health_check is ignored as the interface_address is used to send traffic into the tunnel. |  [optional] |
|**enabled** | **Boolean** | Determines whether to run healthchecks for a tunnel. |  [optional] |
|**rate** | [**RateEnum**](#RateEnum) | How frequent the health check is run. The default value is &#x60;mid&#x60;. |  [optional] |
|**target** | **String** | The destination address in a request type health check. After the healthcheck is decapsulated at the customer end of the tunnel, the ICMP echo will be forwarded to this address. This field defaults to &#x60;customer_gre_endpoint address&#x60;. This field is ignored for bidirectional healthchecks as the interface_address (not assigned to the Cloudflare side of the tunnel) is used as the target. |  [optional] |
|**type** | [**TypeEnum**](#TypeEnum) | The type of healthcheck to run, reply or request. The default value is &#x60;reply&#x60;. |  [optional] |



## Enum: DirectionEnum

| Name | Value |
|---- | -----|
| UNIDIRECTIONAL | &quot;unidirectional&quot; |
| BIDIRECTIONAL | &quot;bidirectional&quot; |



## Enum: RateEnum

| Name | Value |
|---- | -----|
| LOW | &quot;low&quot; |
| MID | &quot;mid&quot; |
| HIGH | &quot;high&quot; |



## Enum: TypeEnum

| Name | Value |
|---- | -----|
| REPLY | &quot;reply&quot; |
| REQUEST | &quot;request&quot; |



