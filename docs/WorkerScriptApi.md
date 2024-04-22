# WorkerScriptApi

All URIs are relative to *https://api.cloudflare.com/client/v4*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**workerScriptDeleteWorker**](WorkerScriptApi.md#workerScriptDeleteWorker) | **DELETE** /accounts/{account_id}/workers/scripts/{script_name} | Delete Worker |
| [**workerScriptDownloadWorker**](WorkerScriptApi.md#workerScriptDownloadWorker) | **GET** /accounts/{account_id}/workers/scripts/{script_name} | Download Worker |
| [**workerScriptFetchUsageModel**](WorkerScriptApi.md#workerScriptFetchUsageModel) | **GET** /accounts/{account_id}/workers/scripts/{script_name}/usage-model | Fetch Usage Model |
| [**workerScriptGetContent**](WorkerScriptApi.md#workerScriptGetContent) | **GET** /accounts/{account_id}/workers/scripts/{script_name}/content/v2 | Get script content |
| [**workerScriptGetSettings**](WorkerScriptApi.md#workerScriptGetSettings) | **GET** /accounts/{account_id}/workers/scripts/{script_name}/settings | Get Settings |
| [**workerScriptListWorkers**](WorkerScriptApi.md#workerScriptListWorkers) | **GET** /accounts/{account_id}/workers/scripts | List Workers |
| [**workerScriptPatchSettings**](WorkerScriptApi.md#workerScriptPatchSettings) | **PATCH** /accounts/{account_id}/workers/scripts/{script_name}/settings | Patch Settings |
| [**workerScriptPutContent**](WorkerScriptApi.md#workerScriptPutContent) | **PUT** /accounts/{account_id}/workers/scripts/{script_name}/content | Put script content |
| [**workerScriptSettingsGetSettings**](WorkerScriptApi.md#workerScriptSettingsGetSettings) | **GET** /accounts/{account_id}/workers/scripts/{script_name}/script-settings | Get Script Settings |
| [**workerScriptSettingsPatchSettings**](WorkerScriptApi.md#workerScriptSettingsPatchSettings) | **PATCH** /accounts/{account_id}/workers/scripts/{script_name}/script-settings | Patch Script Settings |
| [**workerScriptUpdateUsageModel**](WorkerScriptApi.md#workerScriptUpdateUsageModel) | **PUT** /accounts/{account_id}/workers/scripts/{script_name}/usage-model | Update Usage Model |
| [**workerScriptUploadWorkerModule**](WorkerScriptApi.md#workerScriptUploadWorkerModule) | **PUT** /accounts/{account_id}/workers/scripts/{script_name} | Upload Worker Module |


<a id="workerScriptDeleteWorker"></a>
# **workerScriptDeleteWorker**
> workerScriptDeleteWorker(scriptName, accountId, force)

Delete Worker

Delete your worker. This call has no response body on a successful delete.

### Example
```java
// Import classes:
import cloudflare.ApiClient;
import cloudflare.ApiException;
import cloudflare.Configuration;
import cloudflare.auth.*;
import cloudflare.models.*;
import cloudflare.sdk.WorkerScriptApi;

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

    WorkerScriptApi apiInstance = new WorkerScriptApi(defaultClient);
    String scriptName = "scriptName_example"; // String | 
    String accountId = "accountId_example"; // String | 
    Boolean force = true; // Boolean | If set to true, delete will not be stopped by associated service binding, durable object, or other binding. Any of these associated bindings/durable objects will be deleted along with the script.
    try {
      apiInstance.workerScriptDeleteWorker(scriptName, accountId, force);
    } catch (ApiException e) {
      System.err.println("Exception when calling WorkerScriptApi#workerScriptDeleteWorker");
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

<a id="workerScriptDownloadWorker"></a>
# **workerScriptDownloadWorker**
> Object workerScriptDownloadWorker(scriptName, accountId)

Download Worker

Fetch raw script content for your worker. Note this is the original script content, not JSON encoded.

### Example
```java
// Import classes:
import cloudflare.ApiClient;
import cloudflare.ApiException;
import cloudflare.Configuration;
import cloudflare.auth.*;
import cloudflare.models.*;
import cloudflare.sdk.WorkerScriptApi;

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

    WorkerScriptApi apiInstance = new WorkerScriptApi(defaultClient);
    String scriptName = "scriptName_example"; // String | 
    String accountId = "accountId_example"; // String | 
    try {
      Object result = apiInstance.workerScriptDownloadWorker(scriptName, accountId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling WorkerScriptApi#workerScriptDownloadWorker");
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

**Object**

### Authorization

[api_key](../README.md#api_key), [api_token](../README.md#api_token), [api_email](../README.md#api_email)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: undefined

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Download Worker response |  -  |
| **4XX** | Download Worker response failure |  -  |

<a id="workerScriptFetchUsageModel"></a>
# **workerScriptFetchUsageModel**
> WorkersUsageModelResponse workerScriptFetchUsageModel(scriptName, accountId)

Fetch Usage Model

Fetches the Usage Model for a given Worker.

### Example
```java
// Import classes:
import cloudflare.ApiClient;
import cloudflare.ApiException;
import cloudflare.Configuration;
import cloudflare.auth.*;
import cloudflare.models.*;
import cloudflare.sdk.WorkerScriptApi;

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

    WorkerScriptApi apiInstance = new WorkerScriptApi(defaultClient);
    String scriptName = "scriptName_example"; // String | 
    String accountId = "accountId_example"; // String | 
    try {
      WorkersUsageModelResponse result = apiInstance.workerScriptFetchUsageModel(scriptName, accountId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling WorkerScriptApi#workerScriptFetchUsageModel");
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

[**WorkersUsageModelResponse**](WorkersUsageModelResponse.md)

### Authorization

[api_key](../README.md#api_key), [api_token](../README.md#api_token), [api_email](../README.md#api_email)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Fetch Usage Model response |  -  |
| **4XX** | Fetch Usage Model response failure |  -  |

<a id="workerScriptGetContent"></a>
# **workerScriptGetContent**
> Object workerScriptGetContent(accountId, scriptName)

Get script content

Fetch script content only

### Example
```java
// Import classes:
import cloudflare.ApiClient;
import cloudflare.ApiException;
import cloudflare.Configuration;
import cloudflare.auth.*;
import cloudflare.models.*;
import cloudflare.sdk.WorkerScriptApi;

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

    WorkerScriptApi apiInstance = new WorkerScriptApi(defaultClient);
    String accountId = "accountId_example"; // String | 
    String scriptName = "scriptName_example"; // String | 
    try {
      Object result = apiInstance.workerScriptGetContent(accountId, scriptName);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling WorkerScriptApi#workerScriptGetContent");
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
| **200** | Fetch script content |  -  |
| **4XX** | Fetch script content failure |  -  |

<a id="workerScriptGetSettings"></a>
# **workerScriptGetSettings**
> WorkersScriptAndVersionSettingsResponse workerScriptGetSettings(accountId, scriptName)

Get Settings

Get metadata and config, such as bindings or usage model

### Example
```java
// Import classes:
import cloudflare.ApiClient;
import cloudflare.ApiException;
import cloudflare.Configuration;
import cloudflare.auth.*;
import cloudflare.models.*;
import cloudflare.sdk.WorkerScriptApi;

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

    WorkerScriptApi apiInstance = new WorkerScriptApi(defaultClient);
    String accountId = "accountId_example"; // String | 
    String scriptName = "scriptName_example"; // String | 
    try {
      WorkersScriptAndVersionSettingsResponse result = apiInstance.workerScriptGetSettings(accountId, scriptName);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling WorkerScriptApi#workerScriptGetSettings");
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
| **scriptName** | **String**|  | |

### Return type

[**WorkersScriptAndVersionSettingsResponse**](WorkersScriptAndVersionSettingsResponse.md)

### Authorization

[api_key](../README.md#api_key), [api_token](../README.md#api_token), [api_email](../README.md#api_email)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Fetch settings |  -  |
| **4XX** | Fetch settings failure |  -  |

<a id="workerScriptListWorkers"></a>
# **workerScriptListWorkers**
> WorkersScriptResponseCollection workerScriptListWorkers(accountId)

List Workers

Fetch a list of uploaded workers.

### Example
```java
// Import classes:
import cloudflare.ApiClient;
import cloudflare.ApiException;
import cloudflare.Configuration;
import cloudflare.auth.*;
import cloudflare.models.*;
import cloudflare.sdk.WorkerScriptApi;

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

    WorkerScriptApi apiInstance = new WorkerScriptApi(defaultClient);
    String accountId = "accountId_example"; // String | 
    try {
      WorkersScriptResponseCollection result = apiInstance.workerScriptListWorkers(accountId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling WorkerScriptApi#workerScriptListWorkers");
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

[**WorkersScriptResponseCollection**](WorkersScriptResponseCollection.md)

### Authorization

[api_key](../README.md#api_key), [api_token](../README.md#api_token), [api_email](../README.md#api_email)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | List Workers response |  -  |
| **4XX** | List Workers response failure |  -  |

<a id="workerScriptPatchSettings"></a>
# **workerScriptPatchSettings**
> WorkersScriptAndVersionSettingsResponse workerScriptPatchSettings(accountId, scriptName, settings)

Patch Settings

Patch metadata or config, such as bindings or usage model

### Example
```java
// Import classes:
import cloudflare.ApiClient;
import cloudflare.ApiException;
import cloudflare.Configuration;
import cloudflare.auth.*;
import cloudflare.models.*;
import cloudflare.sdk.WorkerScriptApi;

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

    WorkerScriptApi apiInstance = new WorkerScriptApi(defaultClient);
    String accountId = "accountId_example"; // String | 
    String scriptName = "scriptName_example"; // String | 
    WorkersScriptAndVersionSettingsItem settings = new WorkersScriptAndVersionSettingsItem(); // WorkersScriptAndVersionSettingsItem | 
    try {
      WorkersScriptAndVersionSettingsResponse result = apiInstance.workerScriptPatchSettings(accountId, scriptName, settings);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling WorkerScriptApi#workerScriptPatchSettings");
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
| **scriptName** | **String**|  | |
| **settings** | [**WorkersScriptAndVersionSettingsItem**](WorkersScriptAndVersionSettingsItem.md)|  | [optional] |

### Return type

[**WorkersScriptAndVersionSettingsResponse**](WorkersScriptAndVersionSettingsResponse.md)

### Authorization

[api_key](../README.md#api_key), [api_token](../README.md#api_token), [api_email](../README.md#api_email)

### HTTP request headers

 - **Content-Type**: multipart/form-data
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Patch settings |  -  |
| **4XX** | Patch settings failure |  -  |

<a id="workerScriptPutContent"></a>
# **workerScriptPutContent**
> WorkersScriptResponseSingle workerScriptPutContent(accountId, scriptName, CF_WORKER_BODY_PART, CF_WORKER_MAIN_MODULE_PART, lessThanAnyPartNameGreaterThan, metadata)

Put script content

Put script content without touching config or metadata

### Example
```java
// Import classes:
import cloudflare.ApiClient;
import cloudflare.ApiException;
import cloudflare.Configuration;
import cloudflare.auth.*;
import cloudflare.models.*;
import cloudflare.sdk.WorkerScriptApi;

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

    WorkerScriptApi apiInstance = new WorkerScriptApi(defaultClient);
    String accountId = "accountId_example"; // String | 
    String scriptName = "scriptName_example"; // String | 
    String CF_WORKER_BODY_PART = "CF_WORKER_BODY_PART_example"; // String | The multipart name of a script upload part containing script content in service worker format. Alternative to including in a metadata part.
    String CF_WORKER_MAIN_MODULE_PART = "CF_WORKER_MAIN_MODULE_PART_example"; // String | The multipart name of a script upload part containing script content in es module format. Alternative to including in a metadata part.
    List<File> lessThanAnyPartNameGreaterThan = Arrays.asList(); // List<File> | A module comprising a Worker script, often a javascript file. Multiple modules may be provided as separate named parts, but at least one module must be present. This should be referenced either in the metadata as `main_module` (esm)/`body_part` (service worker) or as a header `CF-WORKER-MAIN-MODULE-PART` (esm) /`CF-WORKER-BODY-PART` (service worker) by part name. Source maps may also be included using the `application/source-map` content type.
    NamespaceWorkerPutScriptContentRequestMetadata metadata = new NamespaceWorkerPutScriptContentRequestMetadata(); // NamespaceWorkerPutScriptContentRequestMetadata | 
    try {
      WorkersScriptResponseSingle result = apiInstance.workerScriptPutContent(accountId, scriptName, CF_WORKER_BODY_PART, CF_WORKER_MAIN_MODULE_PART, lessThanAnyPartNameGreaterThan, metadata);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling WorkerScriptApi#workerScriptPutContent");
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
| **200** | Put script content |  -  |
| **4XX** | Put script content failure |  -  |

<a id="workerScriptSettingsGetSettings"></a>
# **workerScriptSettingsGetSettings**
> WorkersScriptSettingsResponse workerScriptSettingsGetSettings(accountId, scriptName)

Get Script Settings

Get script-level settings when using [Worker Versions](https://developers.cloudflare.com/api/operations/worker-versions-list-versions). Includes Logpush and Tail Consumers.

### Example
```java
// Import classes:
import cloudflare.ApiClient;
import cloudflare.ApiException;
import cloudflare.Configuration;
import cloudflare.auth.*;
import cloudflare.models.*;
import cloudflare.sdk.WorkerScriptApi;

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

    WorkerScriptApi apiInstance = new WorkerScriptApi(defaultClient);
    String accountId = "accountId_example"; // String | 
    String scriptName = "scriptName_example"; // String | 
    try {
      WorkersScriptSettingsResponse result = apiInstance.workerScriptSettingsGetSettings(accountId, scriptName);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling WorkerScriptApi#workerScriptSettingsGetSettings");
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
| **scriptName** | **String**|  | |

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

<a id="workerScriptSettingsPatchSettings"></a>
# **workerScriptSettingsPatchSettings**
> WorkersScriptSettingsResponse workerScriptSettingsPatchSettings(accountId, scriptName, workersScriptSettingsItem)

Patch Script Settings

Patch script-level settings when using [Worker Versions](https://developers.cloudflare.com/api/operations/worker-versions-list-versions). Includes Logpush and Tail Consumers.

### Example
```java
// Import classes:
import cloudflare.ApiClient;
import cloudflare.ApiException;
import cloudflare.Configuration;
import cloudflare.auth.*;
import cloudflare.models.*;
import cloudflare.sdk.WorkerScriptApi;

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

    WorkerScriptApi apiInstance = new WorkerScriptApi(defaultClient);
    String accountId = "accountId_example"; // String | 
    String scriptName = "scriptName_example"; // String | 
    WorkersScriptSettingsItem workersScriptSettingsItem = new WorkersScriptSettingsItem(); // WorkersScriptSettingsItem | 
    try {
      WorkersScriptSettingsResponse result = apiInstance.workerScriptSettingsPatchSettings(accountId, scriptName, workersScriptSettingsItem);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling WorkerScriptApi#workerScriptSettingsPatchSettings");
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
| **scriptName** | **String**|  | |
| **workersScriptSettingsItem** | [**WorkersScriptSettingsItem**](WorkersScriptSettingsItem.md)|  | |

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

<a id="workerScriptUpdateUsageModel"></a>
# **workerScriptUpdateUsageModel**
> WorkersUsageModelResponse workerScriptUpdateUsageModel(scriptName, accountId, body)

Update Usage Model

Updates the Usage Model for a given Worker. Requires a Workers Paid subscription.

### Example
```java
// Import classes:
import cloudflare.ApiClient;
import cloudflare.ApiException;
import cloudflare.Configuration;
import cloudflare.auth.*;
import cloudflare.models.*;
import cloudflare.sdk.WorkerScriptApi;

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

    WorkerScriptApi apiInstance = new WorkerScriptApi(defaultClient);
    String scriptName = "scriptName_example"; // String | 
    String accountId = "accountId_example"; // String | 
    Object body = null; // Object | 
    try {
      WorkersUsageModelResponse result = apiInstance.workerScriptUpdateUsageModel(scriptName, accountId, body);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling WorkerScriptApi#workerScriptUpdateUsageModel");
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

[**WorkersUsageModelResponse**](WorkersUsageModelResponse.md)

### Authorization

[api_key](../README.md#api_key), [api_token](../README.md#api_token), [api_email](../README.md#api_email)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Update Usage Model response |  -  |
| **4XX** | Update Usage Model response failure |  -  |

<a id="workerScriptUploadWorkerModule"></a>
# **workerScriptUploadWorkerModule**
> NamespaceWorkerScriptUploadWorkerModule200Response workerScriptUploadWorkerModule(scriptName, accountId, body, rollbackTo)

Upload Worker Module

Upload a worker module.

### Example
```java
// Import classes:
import cloudflare.ApiClient;
import cloudflare.ApiException;
import cloudflare.Configuration;
import cloudflare.auth.*;
import cloudflare.models.*;
import cloudflare.sdk.WorkerScriptApi;

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

    WorkerScriptApi apiInstance = new WorkerScriptApi(defaultClient);
    String scriptName = "scriptName_example"; // String | 
    String accountId = "accountId_example"; // String | 
    String body = "body_example"; // String | 
    String rollbackTo = "rollbackTo_example"; // String | Rollback to provided deployment based on deployment ID. Request body will only parse a \"message\" part. You can learn more about deployments [here](https://developers.cloudflare.com/workers/platform/deployments/).
    try {
      NamespaceWorkerScriptUploadWorkerModule200Response result = apiInstance.workerScriptUploadWorkerModule(scriptName, accountId, body, rollbackTo);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling WorkerScriptApi#workerScriptUploadWorkerModule");
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
| **body** | **String**|  | |
| **rollbackTo** | **String**| Rollback to provided deployment based on deployment ID. Request body will only parse a \&quot;message\&quot; part. You can learn more about deployments [here](https://developers.cloudflare.com/workers/platform/deployments/). | [optional] |

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

