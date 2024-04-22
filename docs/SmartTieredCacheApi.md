# SmartTieredCacheApi

All URIs are relative to *https://api.cloudflare.com/client/v4*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**smartTieredCacheDeleteSmartTieredCacheSetting**](SmartTieredCacheApi.md#smartTieredCacheDeleteSmartTieredCacheSetting) | **DELETE** /zones/{zone_id}/cache/tiered_cache_smart_topology_enable | Delete Smart Tiered Cache setting |
| [**smartTieredCacheGetSmartTieredCacheSetting**](SmartTieredCacheApi.md#smartTieredCacheGetSmartTieredCacheSetting) | **GET** /zones/{zone_id}/cache/tiered_cache_smart_topology_enable | Get Smart Tiered Cache setting |
| [**smartTieredCachePatchSmartTieredCacheSetting**](SmartTieredCacheApi.md#smartTieredCachePatchSmartTieredCacheSetting) | **PATCH** /zones/{zone_id}/cache/tiered_cache_smart_topology_enable | Patch Smart Tiered Cache setting |


<a id="smartTieredCacheDeleteSmartTieredCacheSetting"></a>
# **smartTieredCacheDeleteSmartTieredCacheSetting**
> CacheResponseSingle smartTieredCacheDeleteSmartTieredCacheSetting(zoneId)

Delete Smart Tiered Cache setting

Remvoves enablement of Smart Tiered Cache

### Example
```java
// Import classes:
import cloudflare.ApiClient;
import cloudflare.ApiException;
import cloudflare.Configuration;
import cloudflare.auth.*;
import cloudflare.models.*;
import cloudflare.sdk.SmartTieredCacheApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.cloudflare.com/client/v4");
    
    // Configure API key authorization: api_key
    ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
    api_key.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //api_key.setApiKeyPrefix("Token");

    // Configure API key authorization: api_email
    ApiKeyAuth api_email = (ApiKeyAuth) defaultClient.getAuthentication("api_email");
    api_email.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //api_email.setApiKeyPrefix("Token");

    SmartTieredCacheApi apiInstance = new SmartTieredCacheApi(defaultClient);
    String zoneId = "zoneId_example"; // String | 
    try {
      CacheResponseSingle result = apiInstance.smartTieredCacheDeleteSmartTieredCacheSetting(zoneId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling SmartTieredCacheApi#smartTieredCacheDeleteSmartTieredCacheSetting");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **zoneId** | **String**|  | |

### Return type

[**CacheResponseSingle**](CacheResponseSingle.md)

### Authorization

[api_key](../README.md#api_key), [api_email](../README.md#api_email)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Delete Smart Tiered Cache setting response |  -  |
| **4XX** | Delete Smart Tiered Cache setting response failure |  -  |

<a id="smartTieredCacheGetSmartTieredCacheSetting"></a>
# **smartTieredCacheGetSmartTieredCacheSetting**
> CacheResponseSingle smartTieredCacheGetSmartTieredCacheSetting(zoneId)

Get Smart Tiered Cache setting

### Example
```java
// Import classes:
import cloudflare.ApiClient;
import cloudflare.ApiException;
import cloudflare.Configuration;
import cloudflare.auth.*;
import cloudflare.models.*;
import cloudflare.sdk.SmartTieredCacheApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.cloudflare.com/client/v4");
    
    // Configure API key authorization: api_key
    ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
    api_key.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //api_key.setApiKeyPrefix("Token");

    // Configure API key authorization: api_email
    ApiKeyAuth api_email = (ApiKeyAuth) defaultClient.getAuthentication("api_email");
    api_email.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //api_email.setApiKeyPrefix("Token");

    SmartTieredCacheApi apiInstance = new SmartTieredCacheApi(defaultClient);
    String zoneId = "zoneId_example"; // String | 
    try {
      CacheResponseSingle result = apiInstance.smartTieredCacheGetSmartTieredCacheSetting(zoneId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling SmartTieredCacheApi#smartTieredCacheGetSmartTieredCacheSetting");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **zoneId** | **String**|  | |

### Return type

[**CacheResponseSingle**](CacheResponseSingle.md)

### Authorization

[api_key](../README.md#api_key), [api_email](../README.md#api_email)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Get Smart Tiered Cache setting response |  -  |
| **4XX** | Get Smart Tiered Cache setting response failure |  -  |

<a id="smartTieredCachePatchSmartTieredCacheSetting"></a>
# **smartTieredCachePatchSmartTieredCacheSetting**
> CacheResponseSingle smartTieredCachePatchSmartTieredCacheSetting(zoneId, cacheSchemasPatch)

Patch Smart Tiered Cache setting

Updates enablement of Tiered Cache

### Example
```java
// Import classes:
import cloudflare.ApiClient;
import cloudflare.ApiException;
import cloudflare.Configuration;
import cloudflare.auth.*;
import cloudflare.models.*;
import cloudflare.sdk.SmartTieredCacheApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.cloudflare.com/client/v4");
    
    // Configure API key authorization: api_key
    ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
    api_key.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //api_key.setApiKeyPrefix("Token");

    // Configure API key authorization: api_email
    ApiKeyAuth api_email = (ApiKeyAuth) defaultClient.getAuthentication("api_email");
    api_email.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //api_email.setApiKeyPrefix("Token");

    SmartTieredCacheApi apiInstance = new SmartTieredCacheApi(defaultClient);
    String zoneId = "zoneId_example"; // String | 
    CacheSchemasPatch cacheSchemasPatch = new CacheSchemasPatch(); // CacheSchemasPatch | 
    try {
      CacheResponseSingle result = apiInstance.smartTieredCachePatchSmartTieredCacheSetting(zoneId, cacheSchemasPatch);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling SmartTieredCacheApi#smartTieredCachePatchSmartTieredCacheSetting");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **zoneId** | **String**|  | |
| **cacheSchemasPatch** | [**CacheSchemasPatch**](CacheSchemasPatch.md)|  | |

### Return type

[**CacheResponseSingle**](CacheResponseSingle.md)

### Authorization

[api_key](../README.md#api_key), [api_email](../README.md#api_email)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Patch Smart Tiered Cache setting response |  -  |
| **4XX** | Patch Smart Tiered Cache setting response failure |  -  |

