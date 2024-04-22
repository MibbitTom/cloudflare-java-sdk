# WorkerDeploymentsApi

All URIs are relative to *https://api.cloudflare.com/client/v4*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**workerDeploymentsCreateDeployment**](WorkerDeploymentsApi.md#workerDeploymentsCreateDeployment) | **POST** /accounts/{account_id}/workers/scripts/{script_name}/deployments | Create Deployment |
| [**workerDeploymentsListDeployments**](WorkerDeploymentsApi.md#workerDeploymentsListDeployments) | **GET** /accounts/{account_id}/workers/scripts/{script_name}/deployments | List Deployments |


<a id="workerDeploymentsCreateDeployment"></a>
# **workerDeploymentsCreateDeployment**
> WorkersSchemasDeploymentsSingleResponse workerDeploymentsCreateDeployment(scriptName, accountId, workersDeploymentsCreateBody)

Create Deployment

Deployments configure how [Worker Versions](https://developers.cloudflare.com/api/operations/worker-versions-list-versions) are deployed to traffic. A deployment can consist of one or two versions of a Worker.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.WorkerDeploymentsApi;

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

    WorkerDeploymentsApi apiInstance = new WorkerDeploymentsApi(defaultClient);
    String scriptName = "scriptName_example"; // String | 
    String accountId = "accountId_example"; // String | 
    WorkersDeploymentsCreateBody workersDeploymentsCreateBody = new WorkersDeploymentsCreateBody(); // WorkersDeploymentsCreateBody | 
    try {
      WorkersSchemasDeploymentsSingleResponse result = apiInstance.workerDeploymentsCreateDeployment(scriptName, accountId, workersDeploymentsCreateBody);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling WorkerDeploymentsApi#workerDeploymentsCreateDeployment");
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
| **workersDeploymentsCreateBody** | [**WorkersDeploymentsCreateBody**](WorkersDeploymentsCreateBody.md)|  | |

### Return type

[**WorkersSchemasDeploymentsSingleResponse**](WorkersSchemasDeploymentsSingleResponse.md)

### Authorization

[api_key](../README.md#api_key), [api_token](../README.md#api_token), [api_email](../README.md#api_email)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Create Deployment response |  -  |
| **4XX** | Create Deployment response failure |  -  |

<a id="workerDeploymentsListDeployments"></a>
# **workerDeploymentsListDeployments**
> WorkersSchemasDeploymentsListResponse workerDeploymentsListDeployments(scriptName, accountId)

List Deployments

List of Worker Deployments. The first deployment in the list is the latest deployment actively serving traffic.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.WorkerDeploymentsApi;

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

    WorkerDeploymentsApi apiInstance = new WorkerDeploymentsApi(defaultClient);
    String scriptName = "scriptName_example"; // String | 
    String accountId = "accountId_example"; // String | 
    try {
      WorkersSchemasDeploymentsListResponse result = apiInstance.workerDeploymentsListDeployments(scriptName, accountId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling WorkerDeploymentsApi#workerDeploymentsListDeployments");
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

[**WorkersSchemasDeploymentsListResponse**](WorkersSchemasDeploymentsListResponse.md)

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

