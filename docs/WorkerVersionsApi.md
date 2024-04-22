# WorkerVersionsApi

All URIs are relative to *https://api.cloudflare.com/client/v4*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**workerVersionsGetVersionDetail**](WorkerVersionsApi.md#workerVersionsGetVersionDetail) | **GET** /accounts/{account_id}/workers/scripts/{script_name}/versions/{version_id} | Get Version Detail |
| [**workerVersionsListVersions**](WorkerVersionsApi.md#workerVersionsListVersions) | **GET** /accounts/{account_id}/workers/scripts/{script_name}/versions | List Versions |
| [**workerVersionsUploadVersion**](WorkerVersionsApi.md#workerVersionsUploadVersion) | **POST** /accounts/{account_id}/workers/scripts/{script_name}/versions | Upload Version |


<a id="workerVersionsGetVersionDetail"></a>
# **workerVersionsGetVersionDetail**
> WorkersVersionsSingleResponse workerVersionsGetVersionDetail(versionId, scriptName, accountId)

Get Version Detail

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.WorkerVersionsApi;

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

    WorkerVersionsApi apiInstance = new WorkerVersionsApi(defaultClient);
    String versionId = "versionId_example"; // String | 
    String scriptName = "scriptName_example"; // String | 
    String accountId = "accountId_example"; // String | 
    try {
      WorkersVersionsSingleResponse result = apiInstance.workerVersionsGetVersionDetail(versionId, scriptName, accountId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling WorkerVersionsApi#workerVersionsGetVersionDetail");
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
| **versionId** | **String**|  | |
| **scriptName** | **String**|  | |
| **accountId** | **String**|  | |

### Return type

[**WorkersVersionsSingleResponse**](WorkersVersionsSingleResponse.md)

### Authorization

[api_key](../README.md#api_key), [api_token](../README.md#api_token), [api_email](../README.md#api_email)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Get Version Detail response |  -  |
| **4XX** | Get Version Detail response failure |  -  |

<a id="workerVersionsListVersions"></a>
# **workerVersionsListVersions**
> WorkersVersionsListResponse workerVersionsListVersions(scriptName, accountId)

List Versions

List of Worker Versions. The first version in the list is the latest version.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.WorkerVersionsApi;

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

    WorkerVersionsApi apiInstance = new WorkerVersionsApi(defaultClient);
    String scriptName = "scriptName_example"; // String | 
    String accountId = "accountId_example"; // String | 
    try {
      WorkersVersionsListResponse result = apiInstance.workerVersionsListVersions(scriptName, accountId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling WorkerVersionsApi#workerVersionsListVersions");
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

[**WorkersVersionsListResponse**](WorkersVersionsListResponse.md)

### Authorization

[api_key](../README.md#api_key), [api_token](../README.md#api_token), [api_email](../README.md#api_email)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | List Versions response |  -  |
| **4XX** | List Versions response failure |  -  |

<a id="workerVersionsUploadVersion"></a>
# **workerVersionsUploadVersion**
> WorkersVersionsSingleResponse workerVersionsUploadVersion(scriptName, accountId, lessThanAnyPartNameGreaterThan, metadata)

Upload Version

Upload a Worker Version without deploying to Cloudflare&#39;s network.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.WorkerVersionsApi;

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

    WorkerVersionsApi apiInstance = new WorkerVersionsApi(defaultClient);
    String scriptName = "scriptName_example"; // String | 
    String accountId = "accountId_example"; // String | 
    List<File> lessThanAnyPartNameGreaterThan = Arrays.asList(); // List<File> | A module comprising a Worker script, often a javascript file. Multiple modules may be provided as separate named parts, but at least one module must be present and referenced in the metadata as `main_module`.
    WorkerVersionsUploadVersionRequestMetadata metadata = new WorkerVersionsUploadVersionRequestMetadata(); // WorkerVersionsUploadVersionRequestMetadata | 
    try {
      WorkersVersionsSingleResponse result = apiInstance.workerVersionsUploadVersion(scriptName, accountId, lessThanAnyPartNameGreaterThan, metadata);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling WorkerVersionsApi#workerVersionsUploadVersion");
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
| **lessThanAnyPartNameGreaterThan** | **List&lt;File&gt;**| A module comprising a Worker script, often a javascript file. Multiple modules may be provided as separate named parts, but at least one module must be present and referenced in the metadata as &#x60;main_module&#x60;. | [optional] |
| **metadata** | [**WorkerVersionsUploadVersionRequestMetadata**](WorkerVersionsUploadVersionRequestMetadata.md)|  | [optional] |

### Return type

[**WorkersVersionsSingleResponse**](WorkersVersionsSingleResponse.md)

### Authorization

[api_key](../README.md#api_key), [api_token](../README.md#api_token), [api_email](../README.md#api_email)

### HTTP request headers

 - **Content-Type**: multipart/form-data
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Upload Version response |  -  |
| **4XX** | Upload Version response failure |  -  |

