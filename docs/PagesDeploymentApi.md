# PagesDeploymentApi

All URIs are relative to *https://api.cloudflare.com/client/v4*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**pagesDeploymentCreateDeployment**](PagesDeploymentApi.md#pagesDeploymentCreateDeployment) | **POST** /accounts/{account_id}/pages/projects/{project_name}/deployments | Create deployment |
| [**pagesDeploymentDeleteDeployment**](PagesDeploymentApi.md#pagesDeploymentDeleteDeployment) | **DELETE** /accounts/{account_id}/pages/projects/{project_name}/deployments/{deployment_id} | Delete deployment |
| [**pagesDeploymentGetDeploymentInfo**](PagesDeploymentApi.md#pagesDeploymentGetDeploymentInfo) | **GET** /accounts/{account_id}/pages/projects/{project_name}/deployments/{deployment_id} | Get deployment info |
| [**pagesDeploymentGetDeploymentLogs**](PagesDeploymentApi.md#pagesDeploymentGetDeploymentLogs) | **GET** /accounts/{account_id}/pages/projects/{project_name}/deployments/{deployment_id}/history/logs | Get deployment logs |
| [**pagesDeploymentGetDeployments**](PagesDeploymentApi.md#pagesDeploymentGetDeployments) | **GET** /accounts/{account_id}/pages/projects/{project_name}/deployments | Get deployments |
| [**pagesDeploymentRetryDeployment**](PagesDeploymentApi.md#pagesDeploymentRetryDeployment) | **POST** /accounts/{account_id}/pages/projects/{project_name}/deployments/{deployment_id}/retry | Retry deployment |
| [**pagesDeploymentRollbackDeployment**](PagesDeploymentApi.md#pagesDeploymentRollbackDeployment) | **POST** /accounts/{account_id}/pages/projects/{project_name}/deployments/{deployment_id}/rollback | Rollback deployment |


<a id="pagesDeploymentCreateDeployment"></a>
# **pagesDeploymentCreateDeployment**
> PagesDeploymentNewDeployment pagesDeploymentCreateDeployment(projectName, accountId, branch)

Create deployment

Start a new deployment from production. The repository and account must have already been authorized on the Cloudflare Pages dashboard.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.PagesDeploymentApi;

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

    PagesDeploymentApi apiInstance = new PagesDeploymentApi(defaultClient);
    String projectName = "projectName_example"; // String | 
    String accountId = "accountId_example"; // String | 
    String branch = "branch_example"; // String | The branch to build the new deployment from. The `HEAD` of the branch will be used. If omitted, the production branch will be used by default.
    try {
      PagesDeploymentNewDeployment result = apiInstance.pagesDeploymentCreateDeployment(projectName, accountId, branch);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling PagesDeploymentApi#pagesDeploymentCreateDeployment");
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
| **projectName** | **String**|  | |
| **accountId** | **String**|  | |
| **branch** | **String**| The branch to build the new deployment from. The &#x60;HEAD&#x60; of the branch will be used. If omitted, the production branch will be used by default. | [optional] |

### Return type

[**PagesDeploymentNewDeployment**](PagesDeploymentNewDeployment.md)

### Authorization

[api_key](../README.md#api_key), [api_email](../README.md#api_email)

### HTTP request headers

 - **Content-Type**: multipart/form-data
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Create deployment response. |  -  |
| **4XX** | Create deployment response failure. |  -  |

<a id="pagesDeploymentDeleteDeployment"></a>
# **pagesDeploymentDeleteDeployment**
> Object pagesDeploymentDeleteDeployment(deploymentId, projectName, accountId)

Delete deployment

Delete a deployment.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.PagesDeploymentApi;

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

    PagesDeploymentApi apiInstance = new PagesDeploymentApi(defaultClient);
    String deploymentId = "deploymentId_example"; // String | 
    String projectName = "projectName_example"; // String | 
    String accountId = "accountId_example"; // String | 
    try {
      Object result = apiInstance.pagesDeploymentDeleteDeployment(deploymentId, projectName, accountId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling PagesDeploymentApi#pagesDeploymentDeleteDeployment");
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
| **projectName** | **String**|  | |
| **accountId** | **String**|  | |

### Return type

**Object**

### Authorization

[api_key](../README.md#api_key), [api_email](../README.md#api_email)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Delete deployment response. |  -  |
| **4XX** | Delete deployment response failure. |  -  |

<a id="pagesDeploymentGetDeploymentInfo"></a>
# **pagesDeploymentGetDeploymentInfo**
> PagesDeploymentResponseDetails pagesDeploymentGetDeploymentInfo(deploymentId, projectName, accountId)

Get deployment info

Fetch information about a deployment.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.PagesDeploymentApi;

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

    PagesDeploymentApi apiInstance = new PagesDeploymentApi(defaultClient);
    String deploymentId = "deploymentId_example"; // String | 
    String projectName = "projectName_example"; // String | 
    String accountId = "accountId_example"; // String | 
    try {
      PagesDeploymentResponseDetails result = apiInstance.pagesDeploymentGetDeploymentInfo(deploymentId, projectName, accountId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling PagesDeploymentApi#pagesDeploymentGetDeploymentInfo");
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
| **projectName** | **String**|  | |
| **accountId** | **String**|  | |

### Return type

[**PagesDeploymentResponseDetails**](PagesDeploymentResponseDetails.md)

### Authorization

[api_key](../README.md#api_key), [api_email](../README.md#api_email)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Get deployment info response. |  -  |
| **4XX** | Get deployment info response failure. |  -  |

<a id="pagesDeploymentGetDeploymentLogs"></a>
# **pagesDeploymentGetDeploymentLogs**
> PagesDeploymentResponseLogs pagesDeploymentGetDeploymentLogs(deploymentId, projectName, accountId)

Get deployment logs

Fetch deployment logs for a project.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.PagesDeploymentApi;

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

    PagesDeploymentApi apiInstance = new PagesDeploymentApi(defaultClient);
    String deploymentId = "deploymentId_example"; // String | 
    String projectName = "projectName_example"; // String | 
    String accountId = "accountId_example"; // String | 
    try {
      PagesDeploymentResponseLogs result = apiInstance.pagesDeploymentGetDeploymentLogs(deploymentId, projectName, accountId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling PagesDeploymentApi#pagesDeploymentGetDeploymentLogs");
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
| **projectName** | **String**|  | |
| **accountId** | **String**|  | |

### Return type

[**PagesDeploymentResponseLogs**](PagesDeploymentResponseLogs.md)

### Authorization

[api_key](../README.md#api_key), [api_email](../README.md#api_email)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Get deployment logs response. |  -  |
| **4XX** | Get deployment logs response failure. |  -  |

<a id="pagesDeploymentGetDeployments"></a>
# **pagesDeploymentGetDeployments**
> PagesDeploymentListResponse pagesDeploymentGetDeployments(projectName, accountId, env)

Get deployments

Fetch a list of project deployments.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.PagesDeploymentApi;

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

    PagesDeploymentApi apiInstance = new PagesDeploymentApi(defaultClient);
    String projectName = "projectName_example"; // String | 
    String accountId = "accountId_example"; // String | 
    String env = "production"; // String | 
    try {
      PagesDeploymentListResponse result = apiInstance.pagesDeploymentGetDeployments(projectName, accountId, env);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling PagesDeploymentApi#pagesDeploymentGetDeployments");
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
| **projectName** | **String**|  | |
| **accountId** | **String**|  | |
| **env** | **String**|  | [optional] [enum: production, preview] |

### Return type

[**PagesDeploymentListResponse**](PagesDeploymentListResponse.md)

### Authorization

[api_key](../README.md#api_key), [api_email](../README.md#api_email)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Get deployments response. |  -  |
| **4XX** | Get deployments response failure. |  -  |

<a id="pagesDeploymentRetryDeployment"></a>
# **pagesDeploymentRetryDeployment**
> PagesDeploymentNewDeployment pagesDeploymentRetryDeployment(deploymentId, projectName, accountId)

Retry deployment

Retry a previous deployment.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.PagesDeploymentApi;

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

    PagesDeploymentApi apiInstance = new PagesDeploymentApi(defaultClient);
    String deploymentId = "deploymentId_example"; // String | 
    String projectName = "projectName_example"; // String | 
    String accountId = "accountId_example"; // String | 
    try {
      PagesDeploymentNewDeployment result = apiInstance.pagesDeploymentRetryDeployment(deploymentId, projectName, accountId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling PagesDeploymentApi#pagesDeploymentRetryDeployment");
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
| **projectName** | **String**|  | |
| **accountId** | **String**|  | |

### Return type

[**PagesDeploymentNewDeployment**](PagesDeploymentNewDeployment.md)

### Authorization

[api_key](../README.md#api_key), [api_email](../README.md#api_email)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Retry deployment response. |  -  |
| **4XX** | Retry deployment response failure. |  -  |

<a id="pagesDeploymentRollbackDeployment"></a>
# **pagesDeploymentRollbackDeployment**
> PagesDeploymentResponseDetails pagesDeploymentRollbackDeployment(deploymentId, projectName, accountId)

Rollback deployment

Rollback the production deployment to a previous deployment. You can only rollback to succesful builds on production.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.PagesDeploymentApi;

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

    PagesDeploymentApi apiInstance = new PagesDeploymentApi(defaultClient);
    String deploymentId = "deploymentId_example"; // String | 
    String projectName = "projectName_example"; // String | 
    String accountId = "accountId_example"; // String | 
    try {
      PagesDeploymentResponseDetails result = apiInstance.pagesDeploymentRollbackDeployment(deploymentId, projectName, accountId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling PagesDeploymentApi#pagesDeploymentRollbackDeployment");
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
| **projectName** | **String**|  | |
| **accountId** | **String**|  | |

### Return type

[**PagesDeploymentResponseDetails**](PagesDeploymentResponseDetails.md)

### Authorization

[api_key](../README.md#api_key), [api_email](../README.md#api_email)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Rollback deployment response. |  -  |
| **4XX** | Rollback deployment response failure. |  -  |

