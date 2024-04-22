

# CacheKey

Define which components of the request are included or excluded from the cache key Cloudflare uses to store the response in cache.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**cacheByDeviceType** | **Boolean** | Separate cached content based on the visitor’s device type |  [optional] |
|**cacheDeceptionArmor** | **Boolean** | Protect from web cache deception attacks while allowing static assets to be cached |  [optional] |
|**customKey** | [**CustomKey**](CustomKey.md) |  |  [optional] |
|**ignoreQueryStringsOrder** | **Boolean** | Treat requests with the same query parameters the same, regardless of the order those query parameters are in. A value of true ignores the query strings&#39; order. |  [optional] |



