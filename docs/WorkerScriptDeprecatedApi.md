# WorkerScriptDeprecatedApi

All URIs are relative to *https://api.cloudflare.com/client/v4*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**workerScriptDeprecatedDeleteWorker**](WorkerScriptDeprecatedApi.md#workerScriptDeprecatedDeleteWorker) | **DELETE** /zones/{zone_id}/workers/script | Delete Worker |
| [**workerScriptDeprecatedDownloadWorker**](WorkerScriptDeprecatedApi.md#workerScriptDeprecatedDownloadWorker) | **GET** /zones/{zone_id}/workers/script | Download Worker |
| [**workerScriptDeprecatedUploadWorker**](WorkerScriptDeprecatedApi.md#workerScriptDeprecatedUploadWorker) | **PUT** /zones/{zone_id}/workers/script | Upload Worker |


<a id="workerScriptDeprecatedDeleteWorker"></a>
# **workerScriptDeprecatedDeleteWorker**
> workerScriptDeprecatedDeleteWorker(zoneId)

Delete Worker

Delete your Worker. This call has no response body on a successful delete.

### Example
```java
// Import classes:
import cloudflare.ApiClient;
import cloudflare.ApiException;
import cloudflare.Configuration;
import cloudflare.auth.*;
import cloudflare.models.*;
import cloudflare.sdk.WorkerScriptDeprecatedApi;

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

    WorkerScriptDeprecatedApi apiInstance = new WorkerScriptDeprecatedApi(defaultClient);
    String zoneId = "zoneId_example"; // String | 
    try {
      apiInstance.workerScriptDeprecatedDeleteWorker(zoneId);
    } catch (ApiException e) {
      System.err.println("Exception when calling WorkerScriptDeprecatedApi#workerScriptDeprecatedDeleteWorker");
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

null (empty response body)

### Authorization

[api_key](../README.md#api_key), [api_token](../README.md#api_token), [api_email](../README.md#api_email)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Delete Worker response. |  -  |
| **4XX** | Delete Worker response failure. |  -  |

<a id="workerScriptDeprecatedDownloadWorker"></a>
# **workerScriptDeprecatedDownloadWorker**
> Object workerScriptDeprecatedDownloadWorker(zoneId)

Download Worker

Fetch raw script content for your worker. Note this is the original script content, not JSON encoded.

### Example
```java
// Import classes:
import cloudflare.ApiClient;
import cloudflare.ApiException;
import cloudflare.Configuration;
import cloudflare.auth.*;
import cloudflare.models.*;
import cloudflare.sdk.WorkerScriptDeprecatedApi;

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

    WorkerScriptDeprecatedApi apiInstance = new WorkerScriptDeprecatedApi(defaultClient);
    String zoneId = "zoneId_example"; // String | 
    try {
      Object result = apiInstance.workerScriptDeprecatedDownloadWorker(zoneId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling WorkerScriptDeprecatedApi#workerScriptDeprecatedDownloadWorker");
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

**Object**

### Authorization

[api_key](../README.md#api_key), [api_token](../README.md#api_token), [api_email](../README.md#api_email)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: undefined

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Download Worker response |  -  |
| **4XX** | Download Worker response failure |  -  |

<a id="workerScriptDeprecatedUploadWorker"></a>
# **workerScriptDeprecatedUploadWorker**
> WorkersSchemasScriptResponseSingle workerScriptDeprecatedUploadWorker(zoneId, body)

Upload Worker

Upload a worker, or a new version of a worker.

### Example
```java
// Import classes:
import cloudflare.ApiClient;
import cloudflare.ApiException;
import cloudflare.Configuration;
import cloudflare.auth.*;
import cloudflare.models.*;
import cloudflare.sdk.WorkerScriptDeprecatedApi;

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

    WorkerScriptDeprecatedApi apiInstance = new WorkerScriptDeprecatedApi(defaultClient);
    String zoneId = "zoneId_example"; // String | 
    Object body = null; // Object | 
    try {
      WorkersSchemasScriptResponseSingle result = apiInstance.workerScriptDeprecatedUploadWorker(zoneId, body);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling WorkerScriptDeprecatedApi#workerScriptDeprecatedUploadWorker");
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
| **body** | **Object**|  | |

### Return type

[**WorkersSchemasScriptResponseSingle**](WorkersSchemasScriptResponseSingle.md)

### Authorization

[api_key](../README.md#api_key), [api_token](../README.md#api_token), [api_email](../README.md#api_email)

### HTTP request headers

 - **Content-Type**: application/javascript
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Upload Worker response |  -  |
| **4XX** | Upload Worker response failure |  -  |

