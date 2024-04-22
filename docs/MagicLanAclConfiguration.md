

# MagicLanAclConfiguration


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**lanId** | **String** | The identifier for the LAN you want to create an ACL policy with. |  |
|**lanName** | **String** | The name of the LAN based on the provided lan_id. |  [optional] |
|**ports** | **List&lt;Integer&gt;** | Array of ports on the provided LAN that will be included in the ACL. If no ports are provided, communication on any port on this LAN is allowed. |  [optional] |
|**subnets** | [**List&lt;MagicAclSubnet&gt;**](MagicAclSubnet.md) | Array of subnet IPs within the LAN that will be included in the ACL. If no subnets are provided, communication on any subnets on this LAN are allowed. |  [optional] |



