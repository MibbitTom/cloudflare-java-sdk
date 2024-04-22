

# MagicTransitOptions


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**maxTtl** | **Integer** | Max TTL. |  [optional] |
|**packetType** | **MagicTransitPacketType** |  |  [optional] |
|**packetsPerTtl** | **Integer** | Number of packets sent at each TTL. |  [optional] |
|**port** | **Integer** | For UDP and TCP, specifies the destination port. For ICMP, specifies the initial ICMP sequence value. Default value 0 will choose the best value to use for each protocol. |  [optional] |
|**waitTime** | **Integer** | Set the time (in seconds) to wait for a response to a probe. |  [optional] |



