

# LegacyJhsEdgeIpsOneOf


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**connectivity** | [**ConnectivityEnum**](#ConnectivityEnum) | The IP versions supported for inbound connections on Spectrum anycast IPs. |  [optional] |
|**type** | [**TypeEnum**](#TypeEnum) | The type of edge IP configuration specified. Dynamically allocated edge IPs use Spectrum anycast IPs in accordance with the connectivity you specify. Only valid with CNAME DNS names. |  [optional] |



## Enum: ConnectivityEnum

| Name | Value |
|---- | -----|
| ALL | &quot;all&quot; |
| IPV4 | &quot;ipv4&quot; |
| IPV6 | &quot;ipv6&quot; |



## Enum: TypeEnum

| Name | Value |
|---- | -----|
| DYNAMIC | &quot;dynamic&quot; |



