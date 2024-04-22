# WorkerFiltersDeprecatedApi

All URIs are relative to *https://api.cloudflare.com/client/v4*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**workerFiltersDeprecatedCreateFilter**](WorkerFiltersDeprecatedApi.md#workerFiltersDeprecatedCreateFilter) | **POST** /zones/{zone_id}/workers/filters | Create Filter |
| [**workerFiltersDeprecatedDeleteFilter**](WorkerFiltersDeprecatedApi.md#workerFiltersDeprecatedDeleteFilter) | **DELETE** /zones/{zone_id}/workers/filters/{filter_id} | Delete Filter |
| [**workerFiltersDeprecatedListFilters**](WorkerFiltersDeprecatedApi.md#workerFiltersDeprecatedListFilters) | **GET** /zones/{zone_id}/workers/filters | List Filters |
| [**workerFiltersDeprecatedUpdateFilter**](WorkerFiltersDeprecatedApi.md#workerFiltersDeprecatedUpdateFilter) | **PUT** /zones/{zone_id}/workers/filters/{filter_id} | Update Filter |


<a id="workerFiltersDeprecatedCreateFilter"></a>
# **workerFiltersDeprecatedCreateFilter**
> WorkersApiResponseSingleId workerFiltersDeprecatedCreateFilter(zoneId, workersFilterNoId)

Create Filter

### Example
```java
// Import classes:
import cloudflare.ApiClient;
import cloudflare.ApiException;
import cloudflare.Configuration;
import cloudflare.auth.*;
import cloudflare.models.*;
import cloudflare.sdk.WorkerFiltersDeprecatedApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.cloudflare.com/client/v4");
    
    // Configure API key authorization: api_key
    ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
    api_key.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //api_key.setApiKeyPrefix("Token");

    // Configure HTTP bearer authorization: api_token
    HttpBearerAuth api_token = (HttpBearerAuth) defaultClient.getAuthentication("api_token");
    api_token.setBearerToken("BEARER TOKEN");

    // Configure API key authorization: api_email
    ApiKeyAuth api_email = (ApiKeyAuth) defaultClient.getAuthentication("api_email");
    api_email.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //api_email.setApiKeyPrefix("Token");

    WorkerFiltersDeprecatedApi apiInstance = new WorkerFiltersDeprecatedApi(defaultClient);
    String zoneId = "zoneId_example"; // String | 
    WorkersFilterNoId workersFilterNoId = new WorkersFilterNoId(); // WorkersFilterNoId | 
    try {
      WorkersApiResponseSingleId result = apiInstance.workerFiltersDeprecatedCreateFilter(zoneId, workersFilterNoId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling WorkerFiltersDeprecatedApi#workerFiltersDeprecatedCreateFilter");
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
| **workersFilterNoId** | [**WorkersFilterNoId**](WorkersFilterNoId.md)|  | |

### Return type

[**WorkersApiResponseSingleId**](WorkersApiResponseSingleId.md)

### Authorization

[api_key](../README.md#api_key), [api_token](../README.md#api_token), [api_email](../README.md#api_email)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Create Filter response |  -  |
| **4XX** | Create Filter response failure |  -  |

<a id="workerFiltersDeprecatedDeleteFilter"></a>
# **workerFiltersDeprecatedDeleteFilter**
> WorkersApiResponseSingleId workerFiltersDeprecatedDeleteFilter(filterId, zoneId)

Delete Filter

### Example
```java
// Import classes:
import cloudflare.ApiClient;
import cloudflare.ApiException;
import cloudflare.Configuration;
import cloudflare.auth.*;
import cloudflare.models.*;
import cloudflare.sdk.WorkerFiltersDeprecatedApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.cloudflare.com/client/v4");
    
    // Configure API key authorization: api_key
    ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
    api_key.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //api_key.setApiKeyPrefix("Token");

    // Configure HTTP bearer authorization: api_token
    HttpBearerAuth api_token = (HttpBearerAuth) defaultClient.getAuthentication("api_token");
    api_token.setBearerToken("BEARER TOKEN");

    // Configure API key authorization: api_email
    ApiKeyAuth api_email = (ApiKeyAuth) defaultClient.getAuthentication("api_email");
    api_email.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //api_email.setApiKeyPrefix("Token");

    WorkerFiltersDeprecatedApi apiInstance = new WorkerFiltersDeprecatedApi(defaultClient);
    String filterId = "filterId_example"; // String | 
    String zoneId = "zoneId_example"; // String | 
    try {
      WorkersApiResponseSingleId result = apiInstance.workerFiltersDeprecatedDeleteFilter(filterId, zoneId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling WorkerFiltersDeprecatedApi#workerFiltersDeprecatedDeleteFilter");
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
| **filterId** | **String**|  | |
| **zoneId** | **String**|  | |

### Return type

[**WorkersApiResponseSingleId**](WorkersApiResponseSingleId.md)

### Authorization

[api_key](../README.md#api_key), [api_token](../README.md#api_token), [api_email](../README.md#api_email)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Delete Filter response |  -  |
| **4XX** | Delete Filter response failure |  -  |

<a id="workerFiltersDeprecatedListFilters"></a>
# **workerFiltersDeprecatedListFilters**
> WorkersFilterResponseCollection workerFiltersDeprecatedListFilters(zoneId)

List Filters

### Example
```java
// Import classes:
import cloudflare.ApiClient;
import cloudflare.ApiException;
import cloudflare.Configuration;
import cloudflare.auth.*;
import cloudflare.models.*;
import cloudflare.sdk.WorkerFiltersDeprecatedApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.cloudflare.com/client/v4");
    
    // Configure API key authorization: api_key
    ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
    api_key.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //api_key.setApiKeyPrefix("Token");

    // Configure HTTP bearer authorization: api_token
    HttpBearerAuth api_token = (HttpBearerAuth) defaultClient.getAuthentication("api_token");
    api_token.setBearerToken("BEARER TOKEN");

    // Configure API key authorization: api_email
    ApiKeyAuth api_email = (ApiKeyAuth) defaultClient.getAuthentication("api_email");
    api_email.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //api_email.setApiKeyPrefix("Token");

    WorkerFiltersDeprecatedApi apiInstance = new WorkerFiltersDeprecatedApi(defaultClient);
    String zoneId = "zoneId_example"; // String | 
    try {
      WorkersFilterResponseCollection result = apiInstance.workerFiltersDeprecatedListFilters(zoneId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling WorkerFiltersDeprecatedApi#workerFiltersDeprecatedListFilters");
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

[**WorkersFilterResponseCollection**](WorkersFilterResponseCollection.md)

### Authorization

[api_key](../README.md#api_key), [api_token](../README.md#api_token), [api_email](../README.md#api_email)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | List Filters response |  -  |
| **4XX** | List Filters response failure |  -  |

<a id="workerFiltersDeprecatedUpdateFilter"></a>
# **workerFiltersDeprecatedUpdateFilter**
> WorkersFilterResponseSingle workerFiltersDeprecatedUpdateFilter(filterId, zoneId, workersFilterNoId)

Update Filter

### Example
```java
// Import classes:
import cloudflare.ApiClient;
import cloudflare.ApiException;
import cloudflare.Configuration;
import cloudflare.auth.*;
import cloudflare.models.*;
import cloudflare.sdk.WorkerFiltersDeprecatedApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.cloudflare.com/client/v4");
    
    // Configure API key authorization: api_key
    ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
    api_key.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //api_key.setApiKeyPrefix("Token");

    // Configure HTTP bearer authorization: api_token
    HttpBearerAuth api_token = (HttpBearerAuth) defaultClient.getAuthentication("api_token");
    api_token.setBearerToken("BEARER TOKEN");

    // Configure API key authorization: api_email
    ApiKeyAuth api_email = (ApiKeyAuth) defaultClient.getAuthentication("api_email");
    api_email.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //api_email.setApiKeyPrefix("Token");

    WorkerFiltersDeprecatedApi apiInstance = new WorkerFiltersDeprecatedApi(defaultClient);
    String filterId = "filterId_example"; // String | 
    String zoneId = "zoneId_example"; // String | 
    WorkersFilterNoId workersFilterNoId = new WorkersFilterNoId(); // WorkersFilterNoId | 
    try {
      WorkersFilterResponseSingle result = apiInstance.workerFiltersDeprecatedUpdateFilter(filterId, zoneId, workersFilterNoId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling WorkerFiltersDeprecatedApi#workerFiltersDeprecatedUpdateFilter");
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
| **filterId** | **String**|  | |
| **zoneId** | **String**|  | |
| **workersFilterNoId** | [**WorkersFilterNoId**](WorkersFilterNoId.md)|  | |

### Return type

[**WorkersFilterResponseSingle**](WorkersFilterResponseSingle.md)

### Authorization

[api_key](../README.md#api_key), [api_token](../README.md#api_token), [api_email](../README.md#api_email)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Update Filter response |  -  |
| **4XX** | Update Filter response failure |  -  |

