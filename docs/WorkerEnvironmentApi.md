# WorkerEnvironmentApi

All URIs are relative to *https://api.cloudflare.com/client/v4*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**workerEnvironmentGetScriptContent**](WorkerEnvironmentApi.md#workerEnvironmentGetScriptContent) | **GET** /accounts/{account_id}/workers/services/{service_name}/environments/{environment_name}/content | Get script content |
| [**workerEnvironmentPutScriptContent**](WorkerEnvironmentApi.md#workerEnvironmentPutScriptContent) | **PUT** /accounts/{account_id}/workers/services/{service_name}/environments/{environment_name}/content | Put script content |
| [**workerScriptEnvironmentGetSettings**](WorkerEnvironmentApi.md#workerScriptEnvironmentGetSettings) | **GET** /accounts/{account_id}/workers/services/{service_name}/environments/{environment_name}/settings | Get Script Settings |
| [**workerScriptEnvironmentPatchSettings**](WorkerEnvironmentApi.md#workerScriptEnvironmentPatchSettings) | **PATCH** /accounts/{account_id}/workers/services/{service_name}/environments/{environment_name}/settings | Patch Script Settings |


<a id="workerEnvironmentGetScriptContent"></a>
# **workerEnvironmentGetScriptContent**
> Object workerEnvironmentGetScriptContent(accountId, serviceName, environmentName)

Get script content

Get script content from a worker with an environment

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.WorkerEnvironmentApi;

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

    WorkerEnvironmentApi apiInstance = new WorkerEnvironmentApi(defaultClient);
    String accountId = "accountId_example"; // String | 
    String serviceName = "serviceName_example"; // String | 
    String environmentName = "environmentName_example"; // String | 
    try {
      Object result = apiInstance.workerEnvironmentGetScriptContent(accountId, serviceName, environmentName);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling WorkerEnvironmentApi#workerEnvironmentGetScriptContent");
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
| **serviceName** | **String**|  | |
| **environmentName** | **String**|  | |

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

<a id="workerEnvironmentPutScriptContent"></a>
# **workerEnvironmentPutScriptContent**
> WorkersScriptResponseSingle workerEnvironmentPutScriptContent(accountId, serviceName, environmentName, CF_WORKER_BODY_PART, CF_WORKER_MAIN_MODULE_PART, lessThanAnyPartNameGreaterThan, metadata)

Put script content

Put script content from a worker with an environment

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.WorkerEnvironmentApi;

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

    WorkerEnvironmentApi apiInstance = new WorkerEnvironmentApi(defaultClient);
    String accountId = "accountId_example"; // String | 
    String serviceName = "serviceName_example"; // String | 
    String environmentName = "environmentName_example"; // String | 
    String CF_WORKER_BODY_PART = "CF_WORKER_BODY_PART_example"; // String | The multipart name of a script upload part containing script content in service worker format. Alternative to including in a metadata part.
    String CF_WORKER_MAIN_MODULE_PART = "CF_WORKER_MAIN_MODULE_PART_example"; // String | The multipart name of a script upload part containing script content in es module format. Alternative to including in a metadata part.
    List<File> lessThanAnyPartNameGreaterThan = Arrays.asList(); // List<File> | A module comprising a Worker script, often a javascript file. Multiple modules may be provided as separate named parts, but at least one module must be present. This should be referenced either in the metadata as `main_module` (esm)/`body_part` (service worker) or as a header `CF-WORKER-MAIN-MODULE-PART` (esm) /`CF-WORKER-BODY-PART` (service worker) by part name. Source maps may also be included using the `application/source-map` content type.
    NamespaceWorkerPutScriptContentRequestMetadata metadata = new NamespaceWorkerPutScriptContentRequestMetadata(); // NamespaceWorkerPutScriptContentRequestMetadata | 
    try {
      WorkersScriptResponseSingle result = apiInstance.workerEnvironmentPutScriptContent(accountId, serviceName, environmentName, CF_WORKER_BODY_PART, CF_WORKER_MAIN_MODULE_PART, lessThanAnyPartNameGreaterThan, metadata);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling WorkerEnvironmentApi#workerEnvironmentPutScriptContent");
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
| **serviceName** | **String**|  | |
| **environmentName** | **String**|  | |
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
| **200** | Put script content |  -  |
| **4XX** | Put script content failure |  -  |

<a id="workerScriptEnvironmentGetSettings"></a>
# **workerScriptEnvironmentGetSettings**
> WorkersScriptSettingsResponse workerScriptEnvironmentGetSettings(accountId, serviceName, environmentName)

Get Script Settings

Get script settings from a worker with an environment

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.WorkerEnvironmentApi;

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

    WorkerEnvironmentApi apiInstance = new WorkerEnvironmentApi(defaultClient);
    String accountId = "accountId_example"; // String | 
    String serviceName = "serviceName_example"; // String | 
    String environmentName = "environmentName_example"; // String | 
    try {
      WorkersScriptSettingsResponse result = apiInstance.workerScriptEnvironmentGetSettings(accountId, serviceName, environmentName);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling WorkerEnvironmentApi#workerScriptEnvironmentGetSettings");
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
| **serviceName** | **String**|  | |
| **environmentName** | **String**|  | |

### Return type

[**WorkersScriptSettingsResponse**](WorkersScriptSettingsResponse.md)

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

<a id="workerScriptEnvironmentPatchSettings"></a>
# **workerScriptEnvironmentPatchSettings**
> WorkersScriptSettingsResponse workerScriptEnvironmentPatchSettings(accountId, serviceName, environmentName, workersScriptSettingsResponse)

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
import org.openapitools.client.api.WorkerEnvironmentApi;

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

    WorkerEnvironmentApi apiInstance = new WorkerEnvironmentApi(defaultClient);
    String accountId = "accountId_example"; // String | 
    String serviceName = "serviceName_example"; // String | 
    String environmentName = "environmentName_example"; // String | 
    WorkersScriptSettingsResponse workersScriptSettingsResponse = new WorkersScriptSettingsResponse(); // WorkersScriptSettingsResponse | 
    try {
      WorkersScriptSettingsResponse result = apiInstance.workerScriptEnvironmentPatchSettings(accountId, serviceName, environmentName, workersScriptSettingsResponse);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling WorkerEnvironmentApi#workerScriptEnvironmentPatchSettings");
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
| **serviceName** | **String**|  | |
| **environmentName** | **String**|  | |
| **workersScriptSettingsResponse** | [**WorkersScriptSettingsResponse**](WorkersScriptSettingsResponse.md)|  | |

### Return type

[**WorkersScriptSettingsResponse**](WorkersScriptSettingsResponse.md)

### Authorization

[api_key](../README.md#api_key), [api_token](../README.md#api_token), [api_email](../README.md#api_email)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Patch script settings |  -  |
| **4XX** | Patch script settings failure |  -  |

