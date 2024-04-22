

# MagicAclsAddSingleRequestAcl


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**description** | **String** | Description for the ACL. |  [optional] |
|**forwardLocally** | **Boolean** | The desired forwarding action for this ACL policy. If set to \&quot;false\&quot;, the policy will forward traffic to Cloudflare. If set to \&quot;true\&quot;, the policy will forward traffic locally on the Magic WAN Connector. If not included in request, will default to false. |  [optional] |
|**lan1** | [**MagicLanAclConfiguration**](MagicLanAclConfiguration.md) |  |  |
|**lan2** | [**MagicLanAclConfiguration**](MagicLanAclConfiguration.md) |  |  |
|**name** | **String** | The name of the ACL. |  |
|**protocols** | [**List&lt;ProtocolsEnum&gt;**](#List&lt;ProtocolsEnum&gt;) |  |  [optional] |



## Enum: List&lt;ProtocolsEnum&gt;

| Name | Value |
|---- | -----|
| TCP | &quot;tcp&quot; |
| UDP | &quot;udp&quot; |
| ICMP | &quot;icmp&quot; |



