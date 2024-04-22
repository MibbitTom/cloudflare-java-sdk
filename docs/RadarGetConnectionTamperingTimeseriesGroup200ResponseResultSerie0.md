

# RadarGetConnectionTamperingTimeseriesGroup200ResponseResultSerie0


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**laterInFlow** | **List&lt;String&gt;** | Connections matching signatures for tampering later in the connection, after the transfer of multiple data packets. |  |
|**noMatch** | **List&lt;String&gt;** | Connections that do not match any tampering signatures. |  |
|**postAck** | **List&lt;String&gt;** | Connections matching signatures for tampering after the receipt of a SYN packet and ACK packet, meaning the TCP connection was successfully established but the server did not receive any subsequent packets. |  |
|**postPsh** | **List&lt;String&gt;** | Connections matching signatures for tampering after the receipt of a packet with PSH flag set, following connection establishment. |  |
|**postSyn** | **List&lt;String&gt;** | Connections matching signatures for tampering after the receipt of only a single SYN packet, and before the handshake completes. |  |
|**timestamps** | **List&lt;OffsetDateTime&gt;** |  |  |



