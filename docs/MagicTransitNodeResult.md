

# MagicTransitNodeResult


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**asn** | **String** | AS number associated with the node object. |  [optional] |
|**ip** | **String** | IP address of the node. |  [optional] |
|**labels** | **List&lt;String&gt;** | Field appears if there is an additional annotation printed when the probe returns. Field also appears when running a GRE+ICMP traceroute to denote which traceroute a node comes from. |  [optional] |
|**maxRttMs** | **BigDecimal** | Maximum RTT in ms. |  [optional] |
|**meanRttMs** | **BigDecimal** | Mean RTT in ms. |  [optional] |
|**minRttMs** | **BigDecimal** | Minimum RTT in ms. |  [optional] |
|**name** | **String** | Host name of the address, this may be the same as the IP address. |  [optional] |
|**packetCount** | **Integer** | Number of packets with a response from this node. |  [optional] |
|**stdDevRttMs** | **BigDecimal** | Standard deviation of the RTTs in ms. |  [optional] |



