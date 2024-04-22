# WorkerSubdomainApi

All URIs are relative to *https://api.cloudflare.com/client/v4*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**workerSubdomainCreateSubdomain**](WorkerSubdomainApi.md#workerSubdomainCreateSubdomain) | **PUT** /accounts/{account_id}/workers/subdomain | Create Subdomain |
| [**workerSubdomainGetSubdomain**](WorkerSubdomainApi.md#workerSubdomainGetSubdomain) | **GET** /accounts/{account_id}/workers/subdomain | Get Subdomain |


<a id="workerSubdomainCreateSubdomain"></a>
# **workerSubdomainCreateSubdomain**
> WorkersSubdomainResponse workerSubdomainCreateSubdomain(accountId, body)

Create Subdomain

Creates a Workers subdomain for an account.

### Example
```java
// Import classes:
import cloudflare.ApiClient;
import cloudflare.ApiException;
import cloudflare.Configuration;
import cloudflare.auth.*;
import cloudflare.models.*;
import cloudflare.sdk.WorkerSubdomainApi;

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

    WorkerSubdomainApi apiInstance = new WorkerSubdomainApi(defaultClient);
    String accountId = "accountId_example"; // String | 
    Object body = null; // Object | 
    try {
      WorkersSubdomainResponse result = apiInstance.workerSubdomainCreateSubdomain(accountId, body);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling WorkerSubdomainApi#workerSubdomainCreateSubdomain");
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

[**WorkersSubdomainResponse**](WorkersSubdomainResponse.md)

### Authorization

[api_key](../README.md#api_key), [api_token](../README.md#api_token), [api_email](../README.md#api_email)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Create Subdomain response |  -  |
| **4XX** | Create Subdomain response failure |  -  |

<a id="workerSubdomainGetSubdomain"></a>
# **workerSubdomainGetSubdomain**
> WorkersSubdomainResponse workerSubdomainGetSubdomain(accountId)

Get Subdomain

Returns a Workers subdomain for an account.

### Example
```java
// Import classes:
import cloudflare.ApiClient;
import cloudflare.ApiException;
import cloudflare.Configuration;
import cloudflare.auth.*;
import cloudflare.models.*;
import cloudflare.sdk.WorkerSubdomainApi;

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

    WorkerSubdomainApi apiInstance = new WorkerSubdomainApi(defaultClient);
    String accountId = "accountId_example"; // String | 
    try {
      WorkersSubdomainResponse result = apiInstance.workerSubdomainGetSubdomain(accountId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling WorkerSubdomainApi#workerSubdomainGetSubdomain");
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

[**WorkersSubdomainResponse**](WorkersSubdomainResponse.md)

### Authorization

[api_key](../README.md#api_key), [api_token](../README.md#api_token), [api_email](../README.md#api_email)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Get Subdomain response |  -  |
| **4XX** | Get Subdomain response failure |  -  |

