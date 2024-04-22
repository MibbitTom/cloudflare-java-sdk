

# MagicSchemasHealthCheck


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**enabled** | **Boolean** | Determines whether to run healthchecks for a tunnel. |  [optional] |
|**rate** | [**RateEnum**](#RateEnum) | How frequent the health check is run. The default value is &#x60;mid&#x60;. |  [optional] |
|**target** | **String** | The destination address in a request type health check. After the healthcheck is decapsulated at the customer end of the tunnel, the ICMP echo will be forwarded to this address. This field defaults to &#x60;customer_gre_endpoint address&#x60;. |  [optional] |
|**type** | [**TypeEnum**](#TypeEnum) | The type of healthcheck to run, reply or request. The default value is &#x60;reply&#x60;. |  [optional] |



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



