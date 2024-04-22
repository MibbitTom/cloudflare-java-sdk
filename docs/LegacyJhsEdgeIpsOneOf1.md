

# LegacyJhsEdgeIpsOneOf1


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**ips** | **List&lt;String&gt;** | The array of customer owned IPs we broadcast via anycast for this hostname and application. |  [optional] |
|**type** | [**TypeEnum**](#TypeEnum) | The type of edge IP configuration specified. Statically allocated edge IPs use customer IPs in accordance with the ips array you specify. Only valid with ADDRESS DNS names. |  [optional] |



## Enum: TypeEnum

| Name | Value |
|---- | -----|
| STATIC | &quot;static&quot; |



