

# CacheReserve

Mark whether the request's response from origin is eligible for  Cache Reserve (requires a Cache Reserve add-on plan).

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**eligible** | **Boolean** | Determines whether cache reserve is enabled. If this is true and a request meets eligibility criteria, Cloudflare will write the resource to cache reserve. |  |
|**minFileSize** | **Integer** | The minimum file size eligible for store in cache reserve. |  |



