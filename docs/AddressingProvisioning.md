

# AddressingProvisioning

Status of a Service Binding's deployment to the Cloudflare network

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**state** | [**StateEnum**](#StateEnum) | When a binding has been deployed to a majority of Cloudflare datacenters, the binding will become active and can be used with its associated service.  |  [optional] |



## Enum: StateEnum

| Name | Value |
|---- | -----|
| PROVISIONING | &quot;provisioning&quot; |
| ACTIVE | &quot;active&quot; |



