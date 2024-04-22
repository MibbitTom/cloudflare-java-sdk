

# SecondaryDnsPeer


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**id** | **Object** |  |  [readonly] |
|**ip** | **String** | IPv4/IPv6 address of primary or secondary nameserver, depending on what zone this peer is linked to. For primary zones this IP defines the IP of the secondary nameserver Cloudflare will NOTIFY upon zone changes. For secondary zones this IP defines the IP of the primary nameserver Cloudflare will send AXFR/IXFR requests to. |  [optional] |
|**ixfrEnable** | **Boolean** | Enable IXFR transfer protocol, default is AXFR. Only applicable to secondary zones. |  [optional] |
|**name** | **String** | The name of the peer. |  |
|**port** | **BigDecimal** | DNS port of primary or secondary nameserver, depending on what zone this peer is linked to. |  [optional] |
|**tsigId** | **String** | TSIG authentication will be used for zone transfer if configured. |  [optional] |



