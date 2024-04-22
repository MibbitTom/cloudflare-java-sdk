# PagesDomainsApi

All URIs are relative to *https://api.cloudflare.com/client/v4*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**pagesDomainsAddDomain**](PagesDomainsApi.md#pagesDomainsAddDomain) | **POST** /accounts/{account_id}/pages/projects/{project_name}/domains | Add domain |
| [**pagesDomainsDeleteDomain**](PagesDomainsApi.md#pagesDomainsDeleteDomain) | **DELETE** /accounts/{account_id}/pages/projects/{project_name}/domains/{domain_name} | Delete domain |
| [**pagesDomainsGetDomain**](PagesDomainsApi.md#pagesDomainsGetDomain) | **GET** /accounts/{account_id}/pages/projects/{project_name}/domains/{domain_name} | Get domain |
| [**pagesDomainsGetDomains**](PagesDomainsApi.md#pagesDomainsGetDomains) | **GET** /accounts/{account_id}/pages/projects/{project_name}/domains | Get domains |
| [**pagesDomainsPatchDomain**](PagesDomainsApi.md#pagesDomainsPatchDomain) | **PATCH** /accounts/{account_id}/pages/projects/{project_name}/domains/{domain_name} | Patch domain |


<a id="pagesDomainsAddDomain"></a>
# **pagesDomainsAddDomain**
> PagesDomainResponseSingle pagesDomainsAddDomain(projectName, accountId, body)

Add domain

Add a new domain for the Pages project.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.PagesDomainsApi;

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

    PagesDomainsApi apiInstance = new PagesDomainsApi(defaultClient);
    String projectName = "projectName_example"; // String | 
    String accountId = "accountId_example"; // String | 
    Object body = null; // Object | 
    try {
      PagesDomainResponseSingle result = apiInstance.pagesDomainsAddDomain(projectName, accountId, body);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling PagesDomainsApi#pagesDomainsAddDomain");
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

[**PagesDomainResponseSingle**](PagesDomainResponseSingle.md)

### Authorization

[api_key](../README.md#api_key), [api_email](../README.md#api_email)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Add domain response. |  -  |
| **4XX** | Add domain response failure. |  -  |

<a id="pagesDomainsDeleteDomain"></a>
# **pagesDomainsDeleteDomain**
> Object pagesDomainsDeleteDomain(domainName, projectName, accountId)

Delete domain

Delete a Pages project&#39;s domain.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.PagesDomainsApi;

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

    PagesDomainsApi apiInstance = new PagesDomainsApi(defaultClient);
    String domainName = "domainName_example"; // String | 
    String projectName = "projectName_example"; // String | 
    String accountId = "accountId_example"; // String | 
    try {
      Object result = apiInstance.pagesDomainsDeleteDomain(domainName, projectName, accountId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling PagesDomainsApi#pagesDomainsDeleteDomain");
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
| **domainName** | **String**|  | |
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
| **200** | Delete domain response. |  -  |
| **4xx** | Delete domain response failure. |  -  |

<a id="pagesDomainsGetDomain"></a>
# **pagesDomainsGetDomain**
> PagesDomainResponseSingle pagesDomainsGetDomain(domainName, projectName, accountId)

Get domain

Fetch a single domain.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.PagesDomainsApi;

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

    PagesDomainsApi apiInstance = new PagesDomainsApi(defaultClient);
    String domainName = "domainName_example"; // String | 
    String projectName = "projectName_example"; // String | 
    String accountId = "accountId_example"; // String | 
    try {
      PagesDomainResponseSingle result = apiInstance.pagesDomainsGetDomain(domainName, projectName, accountId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling PagesDomainsApi#pagesDomainsGetDomain");
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
| **domainName** | **String**|  | |
| **projectName** | **String**|  | |
| **accountId** | **String**|  | |

### Return type

[**PagesDomainResponseSingle**](PagesDomainResponseSingle.md)

### Authorization

[api_key](../README.md#api_key), [api_email](../README.md#api_email)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Get domain response. |  -  |
| **4XX** | Get domain response failure. |  -  |

<a id="pagesDomainsGetDomains"></a>
# **pagesDomainsGetDomains**
> PagesDomainResponseCollection pagesDomainsGetDomains(projectName, accountId)

Get domains

Fetch a list of all domains associated with a Pages project.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.PagesDomainsApi;

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

    PagesDomainsApi apiInstance = new PagesDomainsApi(defaultClient);
    String projectName = "projectName_example"; // String | 
    String accountId = "accountId_example"; // String | 
    try {
      PagesDomainResponseCollection result = apiInstance.pagesDomainsGetDomains(projectName, accountId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling PagesDomainsApi#pagesDomainsGetDomains");
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

[**PagesDomainResponseCollection**](PagesDomainResponseCollection.md)

### Authorization

[api_key](../README.md#api_key), [api_email](../README.md#api_email)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Get domains response. |  -  |
| **4XX** | Get domains response failure. |  -  |

<a id="pagesDomainsPatchDomain"></a>
# **pagesDomainsPatchDomain**
> PagesDomainResponseSingle pagesDomainsPatchDomain(domainName, projectName, accountId)

Patch domain

Retry the validation status of a single domain.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.PagesDomainsApi;

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

    PagesDomainsApi apiInstance = new PagesDomainsApi(defaultClient);
    String domainName = "domainName_example"; // String | 
    String projectName = "projectName_example"; // String | 
    String accountId = "accountId_example"; // String | 
    try {
      PagesDomainResponseSingle result = apiInstance.pagesDomainsPatchDomain(domainName, projectName, accountId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling PagesDomainsApi#pagesDomainsPatchDomain");
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
| **domainName** | **String**|  | |
| **projectName** | **String**|  | |
| **accountId** | **String**|  | |

### Return type

[**PagesDomainResponseSingle**](PagesDomainResponseSingle.md)

### Authorization

[api_key](../README.md#api_key), [api_email](../README.md#api_email)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Patch domain response. |  -  |
| **4XX** | Patch domain response failure. |  -  |

