# WorkerCronTriggerApi

All URIs are relative to *https://api.cloudflare.com/client/v4*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**workerCronTriggerGetCronTriggers**](WorkerCronTriggerApi.md#workerCronTriggerGetCronTriggers) | **GET** /accounts/{account_id}/workers/scripts/{script_name}/schedules | Get Cron Triggers |
| [**workerCronTriggerUpdateCronTriggers**](WorkerCronTriggerApi.md#workerCronTriggerUpdateCronTriggers) | **PUT** /accounts/{account_id}/workers/scripts/{script_name}/schedules | Update Cron Triggers |


<a id="workerCronTriggerGetCronTriggers"></a>
# **workerCronTriggerGetCronTriggers**
> WorkersCronTriggerResponseCollection workerCronTriggerGetCronTriggers(scriptName, accountId)

Get Cron Triggers

Fetches Cron Triggers for a Worker.

### Example
```java
// Import classes:
import cloudflare.ApiClient;
import cloudflare.ApiException;
import cloudflare.Configuration;
import cloudflare.auth.*;
import cloudflare.models.*;
import cloudflare.sdk.WorkerCronTriggerApi;

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

    WorkerCronTriggerApi apiInstance = new WorkerCronTriggerApi(defaultClient);
    String scriptName = "scriptName_example"; // String | 
    String accountId = "accountId_example"; // String | 
    try {
      WorkersCronTriggerResponseCollection result = apiInstance.workerCronTriggerGetCronTriggers(scriptName, accountId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling WorkerCronTriggerApi#workerCronTriggerGetCronTriggers");
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

[**WorkersCronTriggerResponseCollection**](WorkersCronTriggerResponseCollection.md)

### Authorization

[api_key](../README.md#api_key), [api_token](../README.md#api_token), [api_email](../README.md#api_email)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Get Cron Triggers response |  -  |
| **4XX** | Get Cron Triggers response failure |  -  |

<a id="workerCronTriggerUpdateCronTriggers"></a>
# **workerCronTriggerUpdateCronTriggers**
> WorkersCronTriggerResponseCollection workerCronTriggerUpdateCronTriggers(scriptName, accountId, body)

Update Cron Triggers

Updates Cron Triggers for a Worker.

### Example
```java
// Import classes:
import cloudflare.ApiClient;
import cloudflare.ApiException;
import cloudflare.Configuration;
import cloudflare.auth.*;
import cloudflare.models.*;
import cloudflare.sdk.WorkerCronTriggerApi;

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

    WorkerCronTriggerApi apiInstance = new WorkerCronTriggerApi(defaultClient);
    String scriptName = "scriptName_example"; // String | 
    String accountId = "accountId_example"; // String | 
    Object body = null; // Object | 
    try {
      WorkersCronTriggerResponseCollection result = apiInstance.workerCronTriggerUpdateCronTriggers(scriptName, accountId, body);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling WorkerCronTriggerApi#workerCronTriggerUpdateCronTriggers");
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
| **body** | **Object**|  | |

### Return type

[**WorkersCronTriggerResponseCollection**](WorkersCronTriggerResponseCollection.md)

### Authorization

[api_key](../README.md#api_key), [api_token](../README.md#api_token), [api_email](../README.md#api_email)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Update Cron Triggers response |  -  |
| **4XX** | Update Cron Triggers response failure |  -  |

