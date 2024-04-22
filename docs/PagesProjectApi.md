# PagesProjectApi

All URIs are relative to *https://api.cloudflare.com/client/v4*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**pagesProjectCreateProject**](PagesProjectApi.md#pagesProjectCreateProject) | **POST** /accounts/{account_id}/pages/projects | Create project |
| [**pagesProjectDeleteProject**](PagesProjectApi.md#pagesProjectDeleteProject) | **DELETE** /accounts/{account_id}/pages/projects/{project_name} | Delete project |
| [**pagesProjectGetProject**](PagesProjectApi.md#pagesProjectGetProject) | **GET** /accounts/{account_id}/pages/projects/{project_name} | Get project |
| [**pagesProjectGetProjects**](PagesProjectApi.md#pagesProjectGetProjects) | **GET** /accounts/{account_id}/pages/projects | Get projects |
| [**pagesProjectUpdateProject**](PagesProjectApi.md#pagesProjectUpdateProject) | **PATCH** /accounts/{account_id}/pages/projects/{project_name} | Update project |


<a id="pagesProjectCreateProject"></a>
# **pagesProjectCreateProject**
> PagesNewProjectResponse pagesProjectCreateProject(accountId, pagesProjects)

Create project

Create a new project.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.PagesProjectApi;

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

    PagesProjectApi apiInstance = new PagesProjectApi(defaultClient);
    String accountId = "accountId_example"; // String | 
    PagesProjects pagesProjects = new PagesProjects(); // PagesProjects | 
    try {
      PagesNewProjectResponse result = apiInstance.pagesProjectCreateProject(accountId, pagesProjects);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling PagesProjectApi#pagesProjectCreateProject");
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
| **pagesProjects** | [**PagesProjects**](PagesProjects.md)|  | |

### Return type

[**PagesNewProjectResponse**](PagesNewProjectResponse.md)

### Authorization

[api_key](../README.md#api_key), [api_email](../README.md#api_email)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Create project response. |  -  |
| **4XX** | Create project response failure. |  -  |

<a id="pagesProjectDeleteProject"></a>
# **pagesProjectDeleteProject**
> Object pagesProjectDeleteProject(projectName, accountId)

Delete project

Delete a project by name.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.PagesProjectApi;

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

    PagesProjectApi apiInstance = new PagesProjectApi(defaultClient);
    String projectName = "projectName_example"; // String | 
    String accountId = "accountId_example"; // String | 
    try {
      Object result = apiInstance.pagesProjectDeleteProject(projectName, accountId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling PagesProjectApi#pagesProjectDeleteProject");
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
| **200** | Delete project response. |  -  |
| **4XX** | Delete project response failure. |  -  |

<a id="pagesProjectGetProject"></a>
# **pagesProjectGetProject**
> PagesProjectResponse pagesProjectGetProject(projectName, accountId)

Get project

Fetch a project by name.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.PagesProjectApi;

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

    PagesProjectApi apiInstance = new PagesProjectApi(defaultClient);
    String projectName = "projectName_example"; // String | 
    String accountId = "accountId_example"; // String | 
    try {
      PagesProjectResponse result = apiInstance.pagesProjectGetProject(projectName, accountId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling PagesProjectApi#pagesProjectGetProject");
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

### Return type

[**PagesProjectResponse**](PagesProjectResponse.md)

### Authorization

[api_key](../README.md#api_key), [api_email](../README.md#api_email)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Get project response. |  -  |
| **4XX** | Get project response failure. |  -  |

<a id="pagesProjectGetProjects"></a>
# **pagesProjectGetProjects**
> PagesProjectsResponse pagesProjectGetProjects(accountId)

Get projects

Fetch a list of all user projects.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.PagesProjectApi;

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

    PagesProjectApi apiInstance = new PagesProjectApi(defaultClient);
    String accountId = "accountId_example"; // String | 
    try {
      PagesProjectsResponse result = apiInstance.pagesProjectGetProjects(accountId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling PagesProjectApi#pagesProjectGetProjects");
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

[**PagesProjectsResponse**](PagesProjectsResponse.md)

### Authorization

[api_key](../README.md#api_key), [api_email](../README.md#api_email)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Get projects response. |  -  |
| **4XX** | Get projects response failure. |  -  |

<a id="pagesProjectUpdateProject"></a>
# **pagesProjectUpdateProject**
> PagesNewProjectResponse pagesProjectUpdateProject(projectName, accountId, body)

Update project

Set new attributes for an existing project. Modify environment variables. To delete an environment variable, set the key to null.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.PagesProjectApi;

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

    PagesProjectApi apiInstance = new PagesProjectApi(defaultClient);
    String projectName = "projectName_example"; // String | 
    String accountId = "accountId_example"; // String | 
    Object body = null; // Object | 
    try {
      PagesNewProjectResponse result = apiInstance.pagesProjectUpdateProject(projectName, accountId, body);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling PagesProjectApi#pagesProjectUpdateProject");
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
| **body** | **Object**|  | |

### Return type

[**PagesNewProjectResponse**](PagesNewProjectResponse.md)

### Authorization

[api_key](../README.md#api_key), [api_email](../README.md#api_email)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Update project response. |  -  |
| **4XX** | Update project response failure. |  -  |

