

# IamAccountSettings

Account settings

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**defaultNameservers** | [**DefaultNameserversEnum**](#DefaultNameserversEnum) | Specifies the default nameservers to be used for new zones added to this account.  - &#x60;cloudflare.standard&#x60; for Cloudflare-branded nameservers - &#x60;custom.account&#x60; for account custom nameservers - &#x60;custom.tenant&#x60; for tenant custom nameservers  See [Custom Nameservers](https://developers.cloudflare.com/dns/additional-options/custom-nameservers/) for more information. |  [optional] |
|**enforceTwofactor** | **Boolean** | Indicates whether membership in this account requires that Two-Factor Authentication is enabled |  [optional] |
|**useAccountCustomNsByDefault** | **Boolean** | Indicates whether new zones should use the account-level custom nameservers by default.  Deprecated in favor of &#x60;default_nameservers&#x60;. |  [optional] |



## Enum: DefaultNameserversEnum

| Name | Value |
|---- | -----|
| CLOUDFLARE_STANDARD | &quot;cloudflare.standard&quot; |
| CUSTOM_ACCOUNT | &quot;custom.account&quot; |
| CUSTOM_TENANT | &quot;custom.tenant&quot; |



