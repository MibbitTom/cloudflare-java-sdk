

# StatusCodeTTL

Specify how long Cloudflare should cache the response based on the status code from the origin. Can be a single status code or a range or status codes

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**statusCodeRange** | [**StatusCodeRange**](StatusCodeRange.md) |  |  [optional] |
|**statusCodeValue** | **Integer** | Set the ttl for responses with this specific status code |  [optional] |
|**value** | **Integer** | Time to cache a response (in seconds). A value of 0 is equivalent to setting the Cache-Control header with the value \&quot;no-cache\&quot;. A value of -1 is equivalent to setting Cache-Control header with the value of \&quot;no-store\&quot;. |  |



