

# SetCacheSettingsRuleActionParameters


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**additionalCacheablePorts** | **List&lt;Integer&gt;** | List of additional ports that caching can be enabled on. |  [optional] |
|**browserTtl** | [**BrowserTTL**](BrowserTTL.md) |  |  [optional] |
|**cache** | **Boolean** | Mark whether the request’s response from origin is eligible for caching. Caching itself will still depend on the cache-control header and your other caching configurations. |  [optional] |
|**cacheKey** | [**CacheKey**](CacheKey.md) |  |  [optional] |
|**cacheReserve** | [**CacheReserve**](CacheReserve.md) |  |  [optional] |
|**edgeTtl** | [**EdgeTTL**](EdgeTTL.md) |  |  [optional] |
|**originCacheControl** | **Boolean** | When enabled, Cloudflare will aim to strictly adhere to RFC 7234. |  [optional] |
|**originErrorPagePassthru** | **Boolean** | Generate Cloudflare error pages from issues sent from the origin server. When on, error pages will trigger for issues from the origin |  [optional] |
|**readTimeout** | **Integer** | Define a timeout value between two successive read operations to your origin server. Historically, the timeout value between two read options from Cloudflare to an origin server is 100 seconds. If you are attempting to reduce HTTP 524 errors because of timeouts from an origin server, try increasing this timeout value. |  [optional] |
|**respectStrongEtags** | **Boolean** | Specify whether or not Cloudflare should respect strong ETag (entity tag) headers. When off, Cloudflare converts strong ETag headers to weak ETag headers. |  [optional] |
|**serveStale** | [**ServeStale**](ServeStale.md) |  |  [optional] |



