# WorkerDeploymentsDeprecatedApi

All URIs are relative to *https://api.cloudflare.com/client/v4*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**workerDeploymentsDeprecatedGetDeploymentDetail**](WorkerDeploymentsDeprecatedApi.md#workerDeploymentsDeprecatedGetDeploymentDetail) | **GET** /accounts/{account_id}/workers/deployments/by-script/{script_id}/detail/{deployment_id} | Get Deployment Detail |
| [**workerDeploymentsDeprecatedListDeployments**](WorkerDeploymentsDeprecatedApi.md#workerDeploymentsDeprecatedListDeployments) | **GET** /accounts/{account_id}/workers/deployments/by-script/{script_id} | List Deployments |


<a id="workerDeploymentsDeprecatedGetDeploymentDetail"></a>
# **workerDeploymentsDeprecatedGetDeploymentDetail**
> WorkersDeploymentsSingleResponse workerDeploymentsDeprecatedGetDeploymentDetail(deploymentId, scriptId, accountId)

Get Deployment Detail

### Example
```java
// Import classes:
import cloudflare.ApiClient;
import cloudflare.ApiException;
import cloudflare.Configuration;
import cloudflare.auth.*;
import cloudflare.models.*;
import cloudflare.sdk.WorkerDeploymentsDeprecatedApi;

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

    WorkerDeploymentsDeprecatedApi apiInstance = new WorkerDeploymentsDeprecatedApi(defaultClient);
    String deploymentId = "deploymentId_example"; // String | 
    String scriptId = "scriptId_example"; // String | 
    String accountId = "accountId_example"; // String | 
    try {
      WorkersDeploymentsSingleResponse result = apiInstance.workerDeploymentsDeprecatedGetDeploymentDetail(deploymentId, scriptId, accountId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling WorkerDeploymentsDeprecatedApi#workerDeploymentsDeprecatedGetDeploymentDetail");
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
| **deploymentId** | **String**|  | |
| **scriptId** | **String**|  | |
| **accountId** | **String**|  | |

### Return type

[**WorkersDeploymentsSingleResponse**](WorkersDeploymentsSingleResponse.md)

### Authorization

[api_key](../README.md#api_key), [api_token](../README.md#api_token), [api_email](../README.md#api_email)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Get Deployment Detail response |  -  |
| **4XX** | Get Deployment Detail response failure |  -  |

<a id="workerDeploymentsDeprecatedListDeployments"></a>
# **workerDeploymentsDeprecatedListDeployments**
> WorkersDeploymentsListResponse workerDeploymentsDeprecatedListDeployments(scriptId, accountId)

List Deployments

### Example
```java
// Import classes:
import cloudflare.ApiClient;
import cloudflare.ApiException;
import cloudflare.Configuration;
import cloudflare.auth.*;
import cloudflare.models.*;
import cloudflare.sdk.WorkerDeploymentsDeprecatedApi;

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

    WorkerDeploymentsDeprecatedApi apiInstance = new WorkerDeploymentsDeprecatedApi(defaultClient);
    String scriptId = "scriptId_example"; // String | 
    String accountId = "accountId_example"; // String | 
    try {
      WorkersDeploymentsListResponse result = apiInstance.workerDeploymentsDeprecatedListDeployments(scriptId, accountId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling WorkerDeploymentsDeprecatedApi#workerDeploymentsDeprecatedListDeployments");
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
| **scriptId** | **String**|  | |
| **accountId** | **String**|  | |

### Return type

[**WorkersDeploymentsListResponse**](WorkersDeploymentsListResponse.md)

### Authorization

[api_key](../README.md#api_key), [api_token](../README.md#api_token), [api_email](../README.md#api_email)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | List Deployments response |  -  |
| **4XX** | List Deployments response failure |  -  |

