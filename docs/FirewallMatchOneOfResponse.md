

# FirewallMatchOneOfResponse


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**originTraffic** | **Boolean** | When true, only the uncached traffic served from your origin servers will count towards rate limiting. In this case, any cached traffic served by Cloudflare will not count towards rate limiting. This field is optional. Notes: This field is deprecated. Instead, use response headers and set \&quot;origin_traffic\&quot; to \&quot;false\&quot; to avoid legacy behaviour interacting with the \&quot;response_headers\&quot; property. |  [optional] |



