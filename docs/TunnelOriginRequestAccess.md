

# TunnelOriginRequestAccess

For all L7 requests to this hostname, cloudflared will validate each request's Cf-Access-Jwt-Assertion request header.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**audTag** | **List&lt;String&gt;** | Access applications that are allowed to reach this hostname for this Tunnel. Audience tags can be identified in the dashboard or via the List Access policies API. |  |
|**required** | **Boolean** | Deny traffic that has not fulfilled Access authorization. |  [optional] |
|**teamName** | **String** |  |  |



