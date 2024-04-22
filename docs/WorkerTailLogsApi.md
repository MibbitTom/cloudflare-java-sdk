# WorkerTailLogsApi

All URIs are relative to *https://api.cloudflare.com/client/v4*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**workerTailLogsDeleteTail**](WorkerTailLogsApi.md#workerTailLogsDeleteTail) | **DELETE** /accounts/{account_id}/workers/scripts/{script_name}/tails/{id} | Delete Tail |
| [**workerTailLogsListTails**](WorkerTailLogsApi.md#workerTailLogsListTails) | **GET** /accounts/{account_id}/workers/scripts/{script_name}/tails | List Tails |
| [**workerTailLogsStartTail**](WorkerTailLogsApi.md#workerTailLogsStartTail) | **POST** /accounts/{account_id}/workers/scripts/{script_name}/tails | Start Tail |


<a id="workerTailLogsDeleteTail"></a>
# **workerTailLogsDeleteTail**
> WorkersApiResponseCommon workerTailLogsDeleteTail(id, scriptName, accountId)

Delete Tail

Deletes a tail from a Worker.

### Example
```java
// Import classes:
import cloudflare.ApiClient;
import cloudflare.ApiException;
import cloudflare.Configuration;
import cloudflare.auth.*;
import cloudflare.models.*;
import cloudflare.sdk.WorkerTailLogsApi;

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

    WorkerTailLogsApi apiInstance = new WorkerTailLogsApi(defaultClient);
    String id = "id_example"; // String | 
    String scriptName = "scriptName_example"; // String | 
    String accountId = "accountId_example"; // String | 
    try {
      WorkersApiResponseCommon result = apiInstance.workerTailLogsDeleteTail(id, scriptName, accountId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling WorkerTailLogsApi#workerTailLogsDeleteTail");
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
| **id** | **String**|  | |
| **scriptName** | **String**|  | |
| **accountId** | **String**|  | |

### Return type

[**WorkersApiResponseCommon**](WorkersApiResponseCommon.md)

### Authorization

[api_key](../README.md#api_key), [api_token](../README.md#api_token), [api_email](../README.md#api_email)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Delete Tail response |  -  |
| **4XX** | Delete Tail response failure |  -  |

<a id="workerTailLogsListTails"></a>
# **workerTailLogsListTails**
> WorkersTailResponse workerTailLogsListTails(scriptName, accountId)

List Tails

Get list of tails currently deployed on a Worker.

### Example
```java
// Import classes:
import cloudflare.ApiClient;
import cloudflare.ApiException;
import cloudflare.Configuration;
import cloudflare.auth.*;
import cloudflare.models.*;
import cloudflare.sdk.WorkerTailLogsApi;

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

    WorkerTailLogsApi apiInstance = new WorkerTailLogsApi(defaultClient);
    String scriptName = "scriptName_example"; // String | 
    String accountId = "accountId_example"; // String | 
    try {
      WorkersTailResponse result = apiInstance.workerTailLogsListTails(scriptName, accountId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling WorkerTailLogsApi#workerTailLogsListTails");
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
| **scriptName** | **String**|  | |
| **accountId** | **String**|  | |

### Return type

[**WorkersTailResponse**](WorkersTailResponse.md)

### Authorization

[api_key](../README.md#api_key), [api_token](../README.md#api_token), [api_email](../README.md#api_email)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | List Tails response |  -  |
| **4XX** | List Tails response failure |  -  |

<a id="workerTailLogsStartTail"></a>
# **workerTailLogsStartTail**
> WorkersTailResponse workerTailLogsStartTail(scriptName, accountId)

Start Tail

Starts a tail that receives logs and exception from a Worker.

### Example
```java
// Import classes:
import cloudflare.ApiClient;
import cloudflare.ApiException;
import cloudflare.Configuration;
import cloudflare.auth.*;
import cloudflare.models.*;
import cloudflare.sdk.WorkerTailLogsApi;

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

    WorkerTailLogsApi apiInstance = new WorkerTailLogsApi(defaultClient);
    String scriptName = "scriptName_example"; // String | 
    String accountId = "accountId_example"; // String | 
    try {
      WorkersTailResponse result = apiInstance.workerTailLogsStartTail(scriptName, accountId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling WorkerTailLogsApi#workerTailLogsStartTail");
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
| **scriptName** | **String**|  | |
| **accountId** | **String**|  | |

### Return type

[**WorkersTailResponse**](WorkersTailResponse.md)

### Authorization

[api_key](../README.md#api_key), [api_token](../README.md#api_token), [api_email](../README.md#api_email)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Start Tail response |  -  |
| **4XX** | Start Tail response failure |  -  |

