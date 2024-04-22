# WorkerAccountSettingsApi

All URIs are relative to *https://api.cloudflare.com/client/v4*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**workerAccountSettingsCreateWorkerAccountSettings**](WorkerAccountSettingsApi.md#workerAccountSettingsCreateWorkerAccountSettings) | **PUT** /accounts/{account_id}/workers/account-settings | Create Worker Account Settings |
| [**workerAccountSettingsFetchWorkerAccountSettings**](WorkerAccountSettingsApi.md#workerAccountSettingsFetchWorkerAccountSettings) | **GET** /accounts/{account_id}/workers/account-settings | Fetch Worker Account Settings |


<a id="workerAccountSettingsCreateWorkerAccountSettings"></a>
# **workerAccountSettingsCreateWorkerAccountSettings**
> WorkersAccountSettingsResponse workerAccountSettingsCreateWorkerAccountSettings(accountId, body)

Create Worker Account Settings

Creates Worker account settings for an account.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.WorkerAccountSettingsApi;

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

    WorkerAccountSettingsApi apiInstance = new WorkerAccountSettingsApi(defaultClient);
    String accountId = "accountId_example"; // String | 
    Object body = null; // Object | 
    try {
      WorkersAccountSettingsResponse result = apiInstance.workerAccountSettingsCreateWorkerAccountSettings(accountId, body);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling WorkerAccountSettingsApi#workerAccountSettingsCreateWorkerAccountSettings");
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
| **accountId** | **String**|  | |
| **body** | **Object**|  | |

### Return type

[**WorkersAccountSettingsResponse**](WorkersAccountSettingsResponse.md)

### Authorization

[api_key](../README.md#api_key), [api_token](../README.md#api_token), [api_email](../README.md#api_email)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Create Worker Account Settings response |  -  |
| **4XX** | Create Worker Account Settings response failure |  -  |

<a id="workerAccountSettingsFetchWorkerAccountSettings"></a>
# **workerAccountSettingsFetchWorkerAccountSettings**
> WorkersAccountSettingsResponse workerAccountSettingsFetchWorkerAccountSettings(accountId)

Fetch Worker Account Settings

Fetches Worker account settings for an account.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.WorkerAccountSettingsApi;

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

    WorkerAccountSettingsApi apiInstance = new WorkerAccountSettingsApi(defaultClient);
    String accountId = "accountId_example"; // String | 
    try {
      WorkersAccountSettingsResponse result = apiInstance.workerAccountSettingsFetchWorkerAccountSettings(accountId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling WorkerAccountSettingsApi#workerAccountSettingsFetchWorkerAccountSettings");
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
| **accountId** | **String**|  | |

### Return type

[**WorkersAccountSettingsResponse**](WorkersAccountSettingsResponse.md)

### Authorization

[api_key](../README.md#api_key), [api_token](../README.md#api_token), [api_email](../README.md#api_email)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Fetch Worker Account Settings response |  -  |
| **4XX** | Fetch Worker Account Settings response failure |  -  |

