# TieredCachingApi

All URIs are relative to *https://api.cloudflare.com/client/v4*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**tieredCachingGetTieredCachingSetting**](TieredCachingApi.md#tieredCachingGetTieredCachingSetting) | **GET** /zones/{zone_id}/argo/tiered_caching | Get Tiered Caching setting |
| [**tieredCachingPatchTieredCachingSetting**](TieredCachingApi.md#tieredCachingPatchTieredCachingSetting) | **PATCH** /zones/{zone_id}/argo/tiered_caching | Patch Tiered Caching setting |


<a id="tieredCachingGetTieredCachingSetting"></a>
# **tieredCachingGetTieredCachingSetting**
> CacheResponseSingle tieredCachingGetTieredCachingSetting(zoneId)

Get Tiered Caching setting

### Example
```java
// Import classes:
import cloudflare.ApiClient;
import cloudflare.ApiException;
import cloudflare.Configuration;
import cloudflare.auth.*;
import cloudflare.models.*;
import cloudflare.sdk.TieredCachingApi;

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

    TieredCachingApi apiInstance = new TieredCachingApi(defaultClient);
    String zoneId = "zoneId_example"; // String | 
    try {
      CacheResponseSingle result = apiInstance.tieredCachingGetTieredCachingSetting(zoneId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling TieredCachingApi#tieredCachingGetTieredCachingSetting");
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
| **200** | Get Tiered Caching setting response |  -  |
| **4XX** | Get Tiered Caching setting response failure |  -  |

<a id="tieredCachingPatchTieredCachingSetting"></a>
# **tieredCachingPatchTieredCachingSetting**
> CacheResponseSingle tieredCachingPatchTieredCachingSetting(zoneId, cachePatch)

Patch Tiered Caching setting

Updates enablement of Tiered Caching

### Example
```java
// Import classes:
import cloudflare.ApiClient;
import cloudflare.ApiException;
import cloudflare.Configuration;
import cloudflare.auth.*;
import cloudflare.models.*;
import cloudflare.sdk.TieredCachingApi;

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

    TieredCachingApi apiInstance = new TieredCachingApi(defaultClient);
    String zoneId = "zoneId_example"; // String | 
    CachePatch cachePatch = new CachePatch(); // CachePatch | 
    try {
      CacheResponseSingle result = apiInstance.tieredCachingPatchTieredCachingSetting(zoneId, cachePatch);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling TieredCachingApi#tieredCachingPatchTieredCachingSetting");
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
| **cachePatch** | [**CachePatch**](CachePatch.md)|  | |

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
| **200** | Patch Tiered Caching setting response |  -  |
| **4XX** | Patch Tiered Caching setting response failure |  -  |

