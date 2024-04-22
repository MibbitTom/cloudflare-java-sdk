# WorkersForPlatformsApi

All URIs are relative to *https://api.cloudflare.com/client/v4*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**namespaceWorkerCreate**](WorkersForPlatformsApi.md#namespaceWorkerCreate) | **POST** /accounts/{account_id}/workers/dispatch/namespaces | Create dispatch namespace |
| [**namespaceWorkerDeleteNamespace**](WorkersForPlatformsApi.md#namespaceWorkerDeleteNamespace) | **DELETE** /accounts/{account_id}/workers/dispatch/namespaces/{dispatch_namespace} | Delete dispatch namespace |
| [**namespaceWorkerDeleteScriptTag**](WorkersForPlatformsApi.md#namespaceWorkerDeleteScriptTag) | **DELETE** /accounts/{account_id}/workers/dispatch/namespaces/{dispatch_namespace}/scripts/{script_name}/tags/{tag} | Delete Script Tag |
| [**namespaceWorkerGetNamespace**](WorkersForPlatformsApi.md#namespaceWorkerGetNamespace) | **GET** /accounts/{account_id}/workers/dispatch/namespaces/{dispatch_namespace} | Get dispatch namespace |
| [**namespaceWorkerGetScriptBindings**](WorkersForPlatformsApi.md#namespaceWorkerGetScriptBindings) | **GET** /accounts/{account_id}/workers/dispatch/namespaces/{dispatch_namespace}/scripts/{script_name}/bindings | Get Script Bindings |
| [**namespaceWorkerGetScriptContent**](WorkersForPlatformsApi.md#namespaceWorkerGetScriptContent) | **GET** /accounts/{account_id}/workers/dispatch/namespaces/{dispatch_namespace}/scripts/{script_name}/content | Get Script Content |
| [**namespaceWorkerGetScriptSecrets**](WorkersForPlatformsApi.md#namespaceWorkerGetScriptSecrets) | **GET** /accounts/{account_id}/workers/dispatch/namespaces/{dispatch_namespace}/scripts/{script_name}/secrets | Get Script Secrets |
| [**namespaceWorkerGetScriptSettings**](WorkersForPlatformsApi.md#namespaceWorkerGetScriptSettings) | **GET** /accounts/{account_id}/workers/dispatch/namespaces/{dispatch_namespace}/scripts/{script_name}/settings | Get Script Settings |
| [**namespaceWorkerGetScriptTags**](WorkersForPlatformsApi.md#namespaceWorkerGetScriptTags) | **GET** /accounts/{account_id}/workers/dispatch/namespaces/{dispatch_namespace}/scripts/{script_name}/tags | Get Script Tags |
| [**namespaceWorkerList**](WorkersForPlatformsApi.md#namespaceWorkerList) | **GET** /accounts/{account_id}/workers/dispatch/namespaces | List dispatch namespaces |
| [**namespaceWorkerPatchScriptSettings**](WorkersForPlatformsApi.md#namespaceWorkerPatchScriptSettings) | **PATCH** /accounts/{account_id}/workers/dispatch/namespaces/{dispatch_namespace}/scripts/{script_name}/settings | Patch Script Settings |
| [**namespaceWorkerPutScriptContent**](WorkersForPlatformsApi.md#namespaceWorkerPutScriptContent) | **PUT** /accounts/{account_id}/workers/dispatch/namespaces/{dispatch_namespace}/scripts/{script_name}/content | Put Script Content |
| [**namespaceWorkerPutScriptSecrets**](WorkersForPlatformsApi.md#namespaceWorkerPutScriptSecrets) | **PUT** /accounts/{account_id}/workers/dispatch/namespaces/{dispatch_namespace}/scripts/{script_name}/secrets | Put Script Secrets |
| [**namespaceWorkerPutScriptTag**](WorkersForPlatformsApi.md#namespaceWorkerPutScriptTag) | **PUT** /accounts/{account_id}/workers/dispatch/namespaces/{dispatch_namespace}/scripts/{script_name}/tags/{tag} | Put Script Tag |
| [**namespaceWorkerPutScriptTags**](WorkersForPlatformsApi.md#namespaceWorkerPutScriptTags) | **PUT** /accounts/{account_id}/workers/dispatch/namespaces/{dispatch_namespace}/scripts/{script_name}/tags | Put Script Tags |
| [**namespaceWorkerScriptDeleteWorker**](WorkersForPlatformsApi.md#namespaceWorkerScriptDeleteWorker) | **DELETE** /accounts/{account_id}/workers/dispatch/namespaces/{dispatch_namespace}/scripts/{script_name} | Delete Worker |
| [**namespaceWorkerScriptUploadWorkerModule**](WorkersForPlatformsApi.md#namespaceWorkerScriptUploadWorkerModule) | **PUT** /accounts/{account_id}/workers/dispatch/namespaces/{dispatch_namespace}/scripts/{script_name} | Upload Worker Module |
| [**namespaceWorkerScriptWorkerDetails**](WorkersForPlatformsApi.md#namespaceWorkerScriptWorkerDetails) | **GET** /accounts/{account_id}/workers/dispatch/namespaces/{dispatch_namespace}/scripts/{script_name} | Worker Details |


<a id="namespaceWorkerCreate"></a>
# **namespaceWorkerCreate**
> WorkersNamespaceSingleResponse namespaceWorkerCreate(accountId, namespaceWorkerCreateRequest)

Create dispatch namespace

Create a new Workers for Platforms namespace.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.WorkersForPlatformsApi;

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

    WorkersForPlatformsApi apiInstance = new WorkersForPlatformsApi(defaultClient);
    String accountId = "accountId_example"; // String | 
    NamespaceWorkerCreateRequest namespaceWorkerCreateRequest = new NamespaceWorkerCreateRequest(); // NamespaceWorkerCreateRequest | 
    try {
      WorkersNamespaceSingleResponse result = apiInstance.namespaceWorkerCreate(accountId, namespaceWorkerCreateRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling WorkersForPlatformsApi#namespaceWorkerCreate");
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
| **namespaceWorkerCreateRequest** | [**NamespaceWorkerCreateRequest**](NamespaceWorkerCreateRequest.md)|  | |

### Return type

[**WorkersNamespaceSingleResponse**](WorkersNamespaceSingleResponse.md)

### Authorization

[api_key](../README.md#api_key), [api_token](../README.md#api_token), [api_email](../README.md#api_email)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Fetch a list of Workers for Platforms namespaces. |  -  |
| **4XX** | Failure to get list of Workers for Platforms namespaces. |  -  |

<a id="namespaceWorkerDeleteNamespace"></a>
# **namespaceWorkerDeleteNamespace**
> WorkersNamespaceDeleteResponse namespaceWorkerDeleteNamespace(accountId, dispatchNamespace)

Delete dispatch namespace

Delete a Workers for Platforms namespace.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.WorkersForPlatformsApi;

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

    WorkersForPlatformsApi apiInstance = new WorkersForPlatformsApi(defaultClient);
    String accountId = "accountId_example"; // String | 
    String dispatchNamespace = "dispatchNamespace_example"; // String | 
    try {
      WorkersNamespaceDeleteResponse result = apiInstance.namespaceWorkerDeleteNamespace(accountId, dispatchNamespace);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling WorkersForPlatformsApi#namespaceWorkerDeleteNamespace");
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
| **dispatchNamespace** | **String**|  | |

### Return type

[**WorkersNamespaceDeleteResponse**](WorkersNamespaceDeleteResponse.md)

### Authorization

[api_key](../README.md#api_key), [api_token](../README.md#api_token), [api_email](../README.md#api_email)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Delete a Workers for Platforms namespace. |  -  |
| **4XX** | Failure to delete Workers for Platforms namespace. |  -  |

<a id="namespaceWorkerDeleteScriptTag"></a>
# **namespaceWorkerDeleteScriptTag**
> NamespaceWorkerPutScriptTag200Response namespaceWorkerDeleteScriptTag(accountId, dispatchNamespace, scriptName, tag)

Delete Script Tag

Delete script tag for a script uploaded to a Workers for Platforms namespace.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.WorkersForPlatformsApi;

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

    WorkersForPlatformsApi apiInstance = new WorkersForPlatformsApi(defaultClient);
    String accountId = "accountId_example"; // String | 
    String dispatchNamespace = "dispatchNamespace_example"; // String | 
    String scriptName = "scriptName_example"; // String | 
    String tag = "tag_example"; // String | 
    try {
      NamespaceWorkerPutScriptTag200Response result = apiInstance.namespaceWorkerDeleteScriptTag(accountId, dispatchNamespace, scriptName, tag);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling WorkersForPlatformsApi#namespaceWorkerDeleteScriptTag");
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
| **dispatchNamespace** | **String**|  | |
| **scriptName** | **String**|  | |
| **tag** | **String**|  | |

### Return type

[**NamespaceWorkerPutScriptTag200Response**](NamespaceWorkerPutScriptTag200Response.md)

### Authorization

[api_key](../README.md#api_key), [api_token](../README.md#api_token), [api_email](../README.md#api_email)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Delete script tag |  -  |
| **4XX** | Delete script tag failure |  -  |

<a id="namespaceWorkerGetNamespace"></a>
# **namespaceWorkerGetNamespace**
> WorkersNamespaceSingleResponse namespaceWorkerGetNamespace(accountId, dispatchNamespace)

Get dispatch namespace

Get a Workers for Platforms namespace.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.WorkersForPlatformsApi;

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

    WorkersForPlatformsApi apiInstance = new WorkersForPlatformsApi(defaultClient);
    String accountId = "accountId_example"; // String | 
    String dispatchNamespace = "dispatchNamespace_example"; // String | 
    try {
      WorkersNamespaceSingleResponse result = apiInstance.namespaceWorkerGetNamespace(accountId, dispatchNamespace);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling WorkersForPlatformsApi#namespaceWorkerGetNamespace");
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
| **dispatchNamespace** | **String**|  | |

### Return type

[**WorkersNamespaceSingleResponse**](WorkersNamespaceSingleResponse.md)

### Authorization

[api_key](../README.md#api_key), [api_token](../README.md#api_token), [api_email](../README.md#api_email)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Get a Workers for Platforms namespace. |  -  |
| **4XX** | Failure to get Workers for Platforms namespace. |  -  |

<a id="namespaceWorkerGetScriptBindings"></a>
# **namespaceWorkerGetScriptBindings**
> NamespaceWorkerGetScriptBindings200Response namespaceWorkerGetScriptBindings(accountId, dispatchNamespace, scriptName)

Get Script Bindings

Fetch script bindings from a script uploaded to a Workers for Platforms namespace.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.WorkersForPlatformsApi;

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

    WorkersForPlatformsApi apiInstance = new WorkersForPlatformsApi(defaultClient);
    String accountId = "accountId_example"; // String | 
    String dispatchNamespace = "dispatchNamespace_example"; // String | 
    String scriptName = "scriptName_example"; // String | 
    try {
      NamespaceWorkerGetScriptBindings200Response result = apiInstance.namespaceWorkerGetScriptBindings(accountId, dispatchNamespace, scriptName);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling WorkersForPlatformsApi#namespaceWorkerGetScriptBindings");
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
| **dispatchNamespace** | **String**|  | |
| **scriptName** | **String**|  | |

### Return type

[**NamespaceWorkerGetScriptBindings200Response**](NamespaceWorkerGetScriptBindings200Response.md)

### Authorization

[api_key](../README.md#api_key), [api_token](../README.md#api_token), [api_email](../README.md#api_email)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Fetch script bindings (Workers for Platforms) |  -  |
| **4XX** | Fetch script bindings failure (Workers for Platforms) |  -  |

<a id="namespaceWorkerGetScriptContent"></a>
# **namespaceWorkerGetScriptContent**
> Object namespaceWorkerGetScriptContent(accountId, dispatchNamespace, scriptName)

Get Script Content

Fetch script content from a script uploaded to a Workers for Platforms namespace.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.WorkersForPlatformsApi;

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

    WorkersForPlatformsApi apiInstance = new WorkersForPlatformsApi(defaultClient);
    String accountId = "accountId_example"; // String | 
    String dispatchNamespace = "dispatchNamespace_example"; // String | 
    String scriptName = "scriptName_example"; // String | 
    try {
      Object result = apiInstance.namespaceWorkerGetScriptContent(accountId, dispatchNamespace, scriptName);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling WorkersForPlatformsApi#namespaceWorkerGetScriptContent");
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
| **dispatchNamespace** | **String**|  | |
| **scriptName** | **String**|  | |

### Return type

**Object**

### Authorization

[api_key](../README.md#api_key), [api_token](../README.md#api_token), [api_email](../README.md#api_email)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: string, application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Get script content |  -  |
| **4XX** | Get script content failure |  -  |

<a id="namespaceWorkerGetScriptSecrets"></a>
# **namespaceWorkerGetScriptSecrets**
> NamespaceWorkerGetScriptSecrets200Response namespaceWorkerGetScriptSecrets(accountId, dispatchNamespace, scriptName)

Get Script Secrets

Fetch secrets from a script uploaded to a Workers for Platforms namespace.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.WorkersForPlatformsApi;

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

    WorkersForPlatformsApi apiInstance = new WorkersForPlatformsApi(defaultClient);
    String accountId = "accountId_example"; // String | 
    String dispatchNamespace = "dispatchNamespace_example"; // String | 
    String scriptName = "scriptName_example"; // String | 
    try {
      NamespaceWorkerGetScriptSecrets200Response result = apiInstance.namespaceWorkerGetScriptSecrets(accountId, dispatchNamespace, scriptName);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling WorkersForPlatformsApi#namespaceWorkerGetScriptSecrets");
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
| **dispatchNamespace** | **String**|  | |
| **scriptName** | **String**|  | |

### Return type

[**NamespaceWorkerGetScriptSecrets200Response**](NamespaceWorkerGetScriptSecrets200Response.md)

### Authorization

[api_key](../README.md#api_key), [api_token](../README.md#api_token), [api_email](../README.md#api_email)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Fetch script secrets |  -  |
| **4XX** | Fetch script secrets failure |  -  |

<a id="namespaceWorkerGetScriptSettings"></a>
# **namespaceWorkerGetScriptSettings**
> NamespaceWorkerGetScriptSettings200Response namespaceWorkerGetScriptSettings(accountId, dispatchNamespace, scriptName)

Get Script Settings

Get script settings from a script uploaded to a Workers for Platforms namespace.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.WorkersForPlatformsApi;

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

    WorkersForPlatformsApi apiInstance = new WorkersForPlatformsApi(defaultClient);
    String accountId = "accountId_example"; // String | 
    String dispatchNamespace = "dispatchNamespace_example"; // String | 
    String scriptName = "scriptName_example"; // String | 
    try {
      NamespaceWorkerGetScriptSettings200Response result = apiInstance.namespaceWorkerGetScriptSettings(accountId, dispatchNamespace, scriptName);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling WorkersForPlatformsApi#namespaceWorkerGetScriptSettings");
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
| **dispatchNamespace** | **String**|  | |
| **scriptName** | **String**|  | |

### Return type

[**NamespaceWorkerGetScriptSettings200Response**](NamespaceWorkerGetScriptSettings200Response.md)

### Authorization

[api_key](../README.md#api_key), [api_token](../README.md#api_token), [api_email](../README.md#api_email)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Fetch script settings |  -  |
| **4XX** | Fetch script settings failure |  -  |

<a id="namespaceWorkerGetScriptTags"></a>
# **namespaceWorkerGetScriptTags**
> NamespaceWorkerGetScriptTags200Response namespaceWorkerGetScriptTags(accountId, dispatchNamespace, scriptName)

Get Script Tags

Fetch tags from a script uploaded to a Workers for Platforms namespace.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.WorkersForPlatformsApi;

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

    WorkersForPlatformsApi apiInstance = new WorkersForPlatformsApi(defaultClient);
    String accountId = "accountId_example"; // String | 
    String dispatchNamespace = "dispatchNamespace_example"; // String | 
    String scriptName = "scriptName_example"; // String | 
    try {
      NamespaceWorkerGetScriptTags200Response result = apiInstance.namespaceWorkerGetScriptTags(accountId, dispatchNamespace, scriptName);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling WorkersForPlatformsApi#namespaceWorkerGetScriptTags");
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
| **dispatchNamespace** | **String**|  | |
| **scriptName** | **String**|  | |

### Return type

[**NamespaceWorkerGetScriptTags200Response**](NamespaceWorkerGetScriptTags200Response.md)

### Authorization

[api_key](../README.md#api_key), [api_token](../README.md#api_token), [api_email](../README.md#api_email)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Fetch script tags |  -  |
| **4XX** | Fetch script tags failure |  -  |

<a id="namespaceWorkerList"></a>
# **namespaceWorkerList**
> WorkersNamespaceListResponse namespaceWorkerList(accountId)

List dispatch namespaces

Fetch a list of Workers for Platforms namespaces.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.WorkersForPlatformsApi;

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

    WorkersForPlatformsApi apiInstance = new WorkersForPlatformsApi(defaultClient);
    String accountId = "accountId_example"; // String | 
    try {
      WorkersNamespaceListResponse result = apiInstance.namespaceWorkerList(accountId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling WorkersForPlatformsApi#namespaceWorkerList");
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

[**WorkersNamespaceListResponse**](WorkersNamespaceListResponse.md)

### Authorization

[api_key](../README.md#api_key), [api_token](../README.md#api_token), [api_email](../README.md#api_email)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Fetch a list of Workers for Platforms namespaces. |  -  |
| **4XX** | Failure to get list of Workers for Platforms namespaces. |  -  |

<a id="namespaceWorkerPatchScriptSettings"></a>
# **namespaceWorkerPatchScriptSettings**
> NamespaceWorkerGetScriptSettings200Response namespaceWorkerPatchScriptSettings(accountId, dispatchNamespace, scriptName, settings)

Patch Script Settings

Patch script metadata, such as bindings

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.WorkersForPlatformsApi;

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

    WorkersForPlatformsApi apiInstance = new WorkersForPlatformsApi(defaultClient);
    String accountId = "accountId_example"; // String | 
    String dispatchNamespace = "dispatchNamespace_example"; // String | 
    String scriptName = "scriptName_example"; // String | 
    WorkersScriptAndVersionSettingsItem settings = new WorkersScriptAndVersionSettingsItem(); // WorkersScriptAndVersionSettingsItem | 
    try {
      NamespaceWorkerGetScriptSettings200Response result = apiInstance.namespaceWorkerPatchScriptSettings(accountId, dispatchNamespace, scriptName, settings);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling WorkersForPlatformsApi#namespaceWorkerPatchScriptSettings");
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
| **dispatchNamespace** | **String**|  | |
| **scriptName** | **String**|  | |
| **settings** | [**WorkersScriptAndVersionSettingsItem**](WorkersScriptAndVersionSettingsItem.md)|  | [optional] |

### Return type

[**NamespaceWorkerGetScriptSettings200Response**](NamespaceWorkerGetScriptSettings200Response.md)

### Authorization

[api_key](../README.md#api_key), [api_token](../README.md#api_token), [api_email](../README.md#api_email)

### HTTP request headers

 - **Content-Type**: multipart/form-data
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Patch script settings |  -  |
| **4XX** | Patch script settings failure |  -  |

<a id="namespaceWorkerPutScriptContent"></a>
# **namespaceWorkerPutScriptContent**
> WorkersScriptResponseSingle namespaceWorkerPutScriptContent(accountId, dispatchNamespace, scriptName, CF_WORKER_BODY_PART, CF_WORKER_MAIN_MODULE_PART, lessThanAnyPartNameGreaterThan, metadata)

Put Script Content

Put script content for a script uploaded to a Workers for Platforms namespace.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.WorkersForPlatformsApi;

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

    WorkersForPlatformsApi apiInstance = new WorkersForPlatformsApi(defaultClient);
    String accountId = "accountId_example"; // String | 
    String dispatchNamespace = "dispatchNamespace_example"; // String | 
    String scriptName = "scriptName_example"; // String | 
    String CF_WORKER_BODY_PART = "CF_WORKER_BODY_PART_example"; // String | The multipart name of a script upload part containing script content in service worker format. Alternative to including in a metadata part.
    String CF_WORKER_MAIN_MODULE_PART = "CF_WORKER_MAIN_MODULE_PART_example"; // String | The multipart name of a script upload part containing script content in es module format. Alternative to including in a metadata part.
    List<File> lessThanAnyPartNameGreaterThan = Arrays.asList(); // List<File> | A module comprising a Worker script, often a javascript file. Multiple modules may be provided as separate named parts, but at least one module must be present. This should be referenced either in the metadata as `main_module` (esm)/`body_part` (service worker) or as a header `CF-WORKER-MAIN-MODULE-PART` (esm) /`CF-WORKER-BODY-PART` (service worker) by part name. Source maps may also be included using the `application/source-map` content type.
    NamespaceWorkerPutScriptContentRequestMetadata metadata = new NamespaceWorkerPutScriptContentRequestMetadata(); // NamespaceWorkerPutScriptContentRequestMetadata | 
    try {
      WorkersScriptResponseSingle result = apiInstance.namespaceWorkerPutScriptContent(accountId, dispatchNamespace, scriptName, CF_WORKER_BODY_PART, CF_WORKER_MAIN_MODULE_PART, lessThanAnyPartNameGreaterThan, metadata);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling WorkersForPlatformsApi#namespaceWorkerPutScriptContent");
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
| **dispatchNamespace** | **String**|  | |
| **scriptName** | **String**|  | |
| **CF_WORKER_BODY_PART** | **String**| The multipart name of a script upload part containing script content in service worker format. Alternative to including in a metadata part. | [optional] |
| **CF_WORKER_MAIN_MODULE_PART** | **String**| The multipart name of a script upload part containing script content in es module format. Alternative to including in a metadata part. | [optional] |
| **lessThanAnyPartNameGreaterThan** | **List&lt;File&gt;**| A module comprising a Worker script, often a javascript file. Multiple modules may be provided as separate named parts, but at least one module must be present. This should be referenced either in the metadata as &#x60;main_module&#x60; (esm)/&#x60;body_part&#x60; (service worker) or as a header &#x60;CF-WORKER-MAIN-MODULE-PART&#x60; (esm) /&#x60;CF-WORKER-BODY-PART&#x60; (service worker) by part name. Source maps may also be included using the &#x60;application/source-map&#x60; content type. | [optional] |
| **metadata** | [**NamespaceWorkerPutScriptContentRequestMetadata**](NamespaceWorkerPutScriptContentRequestMetadata.md)|  | [optional] |

### Return type

[**WorkersScriptResponseSingle**](WorkersScriptResponseSingle.md)

### Authorization

[api_key](../README.md#api_key), [api_token](../README.md#api_token), [api_email](../README.md#api_email)

### HTTP request headers

 - **Content-Type**: multipart/form-data
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Put script content (Workers for Platforms) |  -  |
| **4XX** | Put script content failure (Workers for Platforms) |  -  |

<a id="namespaceWorkerPutScriptSecrets"></a>
# **namespaceWorkerPutScriptSecrets**
> NamespaceWorkerPutScriptSecrets200Response namespaceWorkerPutScriptSecrets(accountId, dispatchNamespace, scriptName, workersSecret)

Put Script Secrets

Put secrets to a script uploaded to a Workers for Platforms namespace.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.WorkersForPlatformsApi;

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

    WorkersForPlatformsApi apiInstance = new WorkersForPlatformsApi(defaultClient);
    String accountId = "accountId_example"; // String | 
    String dispatchNamespace = "dispatchNamespace_example"; // String | 
    String scriptName = "scriptName_example"; // String | 
    WorkersSecret workersSecret = new WorkersSecret(); // WorkersSecret | 
    try {
      NamespaceWorkerPutScriptSecrets200Response result = apiInstance.namespaceWorkerPutScriptSecrets(accountId, dispatchNamespace, scriptName, workersSecret);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling WorkersForPlatformsApi#namespaceWorkerPutScriptSecrets");
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
| **dispatchNamespace** | **String**|  | |
| **scriptName** | **String**|  | |
| **workersSecret** | [**WorkersSecret**](WorkersSecret.md)|  | |

### Return type

[**NamespaceWorkerPutScriptSecrets200Response**](NamespaceWorkerPutScriptSecrets200Response.md)

### Authorization

[api_key](../README.md#api_key), [api_token](../README.md#api_token), [api_email](../README.md#api_email)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Fetch script bindings (Workers for Platforms) |  -  |
| **4XX** | Fetch script bindings failure (Workers for Platforms) |  -  |

<a id="namespaceWorkerPutScriptTag"></a>
# **namespaceWorkerPutScriptTag**
> NamespaceWorkerPutScriptTag200Response namespaceWorkerPutScriptTag(accountId, dispatchNamespace, scriptName, tag)

Put Script Tag

Put a single tag on a script uploaded to a Workers for Platforms namespace.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.WorkersForPlatformsApi;

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

    WorkersForPlatformsApi apiInstance = new WorkersForPlatformsApi(defaultClient);
    String accountId = "accountId_example"; // String | 
    String dispatchNamespace = "dispatchNamespace_example"; // String | 
    String scriptName = "scriptName_example"; // String | 
    String tag = "tag_example"; // String | 
    try {
      NamespaceWorkerPutScriptTag200Response result = apiInstance.namespaceWorkerPutScriptTag(accountId, dispatchNamespace, scriptName, tag);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling WorkersForPlatformsApi#namespaceWorkerPutScriptTag");
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
| **dispatchNamespace** | **String**|  | |
| **scriptName** | **String**|  | |
| **tag** | **String**|  | |

### Return type

[**NamespaceWorkerPutScriptTag200Response**](NamespaceWorkerPutScriptTag200Response.md)

### Authorization

[api_key](../README.md#api_key), [api_token](../README.md#api_token), [api_email](../README.md#api_email)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Put script tag |  -  |
| **4XX** | Put script tag failure |  -  |

<a id="namespaceWorkerPutScriptTags"></a>
# **namespaceWorkerPutScriptTags**
> NamespaceWorkerPutScriptTags200Response namespaceWorkerPutScriptTags(accountId, dispatchNamespace, scriptName, requestBody)

Put Script Tags

Put script tags for a script uploaded to a Workers for Platforms namespace.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.WorkersForPlatformsApi;

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

    WorkersForPlatformsApi apiInstance = new WorkersForPlatformsApi(defaultClient);
    String accountId = "accountId_example"; // String | 
    String dispatchNamespace = "dispatchNamespace_example"; // String | 
    String scriptName = "scriptName_example"; // String | 
    List<String> requestBody = Arrays.asList(); // List<String> | 
    try {
      NamespaceWorkerPutScriptTags200Response result = apiInstance.namespaceWorkerPutScriptTags(accountId, dispatchNamespace, scriptName, requestBody);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling WorkersForPlatformsApi#namespaceWorkerPutScriptTags");
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
| **dispatchNamespace** | **String**|  | |
| **scriptName** | **String**|  | |
| **requestBody** | [**List&lt;String&gt;**](String.md)|  | |

### Return type

[**NamespaceWorkerPutScriptTags200Response**](NamespaceWorkerPutScriptTags200Response.md)

### Authorization

[api_key](../README.md#api_key), [api_token](../README.md#api_token), [api_email](../README.md#api_email)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Fetch script tags |  -  |
| **4XX** | Fetch script tags failure |  -  |

<a id="namespaceWorkerScriptDeleteWorker"></a>
# **namespaceWorkerScriptDeleteWorker**
> namespaceWorkerScriptDeleteWorker(accountId, dispatchNamespace, scriptName, force)

Delete Worker

Delete a worker from a Workers for Platforms namespace. This call has no response body on a successful delete.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.WorkersForPlatformsApi;

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

    WorkersForPlatformsApi apiInstance = new WorkersForPlatformsApi(defaultClient);
    String accountId = "accountId_example"; // String | 
    String dispatchNamespace = "dispatchNamespace_example"; // String | 
    String scriptName = "scriptName_example"; // String | 
    Boolean force = true; // Boolean | If set to true, delete will not be stopped by associated service binding, durable object, or other binding. Any of these associated bindings/durable objects will be deleted along with the script.
    try {
      apiInstance.namespaceWorkerScriptDeleteWorker(accountId, dispatchNamespace, scriptName, force);
    } catch (ApiException e) {
      System.err.println("Exception when calling WorkersForPlatformsApi#namespaceWorkerScriptDeleteWorker");
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
| **dispatchNamespace** | **String**|  | |
| **scriptName** | **String**|  | |
| **force** | **Boolean**| If set to true, delete will not be stopped by associated service binding, durable object, or other binding. Any of these associated bindings/durable objects will be deleted along with the script. | [optional] |

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
| **200** | Delete Worker response |  -  |
| **4XX** | Delete Worker response failure |  -  |

<a id="namespaceWorkerScriptUploadWorkerModule"></a>
# **namespaceWorkerScriptUploadWorkerModule**
> NamespaceWorkerScriptUploadWorkerModule200Response namespaceWorkerScriptUploadWorkerModule(accountId, dispatchNamespace, scriptName, body)

Upload Worker Module

Upload a worker module to a Workers for Platforms namespace. You can find an example of the metadata on our docs: https://developers.cloudflare.com/cloudflare-for-platforms/workers-for-platforms/reference/metadata/

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.WorkersForPlatformsApi;

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

    WorkersForPlatformsApi apiInstance = new WorkersForPlatformsApi(defaultClient);
    String accountId = "accountId_example"; // String | 
    String dispatchNamespace = "dispatchNamespace_example"; // String | 
    String scriptName = "scriptName_example"; // String | 
    String body = "body_example"; // String | 
    try {
      NamespaceWorkerScriptUploadWorkerModule200Response result = apiInstance.namespaceWorkerScriptUploadWorkerModule(accountId, dispatchNamespace, scriptName, body);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling WorkersForPlatformsApi#namespaceWorkerScriptUploadWorkerModule");
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
| **dispatchNamespace** | **String**|  | |
| **scriptName** | **String**|  | |
| **body** | **String**|  | |

### Return type

[**NamespaceWorkerScriptUploadWorkerModule200Response**](NamespaceWorkerScriptUploadWorkerModule200Response.md)

### Authorization

[api_key](../README.md#api_key), [api_token](../README.md#api_token), [api_email](../README.md#api_email)

### HTTP request headers

 - **Content-Type**: application/javascript, multipart/form-data, text/javascript
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Upload Worker Module response |  -  |
| **4XX** | Upload Worker Module response failure |  -  |

<a id="namespaceWorkerScriptWorkerDetails"></a>
# **namespaceWorkerScriptWorkerDetails**
> WorkersNamespaceScriptResponseSingle namespaceWorkerScriptWorkerDetails(accountId, dispatchNamespace, scriptName)

Worker Details

Fetch information about a script uploaded to a Workers for Platforms namespace.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.WorkersForPlatformsApi;

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

    WorkersForPlatformsApi apiInstance = new WorkersForPlatformsApi(defaultClient);
    String accountId = "accountId_example"; // String | 
    String dispatchNamespace = "dispatchNamespace_example"; // String | 
    String scriptName = "scriptName_example"; // String | 
    try {
      WorkersNamespaceScriptResponseSingle result = apiInstance.namespaceWorkerScriptWorkerDetails(accountId, dispatchNamespace, scriptName);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling WorkersForPlatformsApi#namespaceWorkerScriptWorkerDetails");
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
| **dispatchNamespace** | **String**|  | |
| **scriptName** | **String**|  | |

### Return type

[**WorkersNamespaceScriptResponseSingle**](WorkersNamespaceScriptResponseSingle.md)

### Authorization

[api_key](../README.md#api_key), [api_token](../README.md#api_token), [api_email](../README.md#api_email)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Worker Details Response (Workers for Platforms) |  -  |
| **4XX** | Worker Details Failure (Workers for Platforms) |  -  |

