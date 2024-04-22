# WorkersAiFinetuneApi

All URIs are relative to *https://api.cloudflare.com/client/v4*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**workersAiCreateFinetune**](WorkersAiFinetuneApi.md#workersAiCreateFinetune) | **POST** /accounts/{account_id}/ai/finetunes | Create a new Finetune |
| [**workersAiListFinetunes**](WorkersAiFinetuneApi.md#workersAiListFinetunes) | **GET** /accounts/{account_id}/ai/finetunes | List Finetunes |
| [**workersAiUploadFinetuneAsset**](WorkersAiFinetuneApi.md#workersAiUploadFinetuneAsset) | **POST** /accounts/{account_id}/ai/finetunes/{finetune_id}/finetune-assets | Upload a Finetune Asset |


<a id="workersAiCreateFinetune"></a>
# **workersAiCreateFinetune**
> WorkersAiCreateFinetune200Response workersAiCreateFinetune(accountId, workersAiCreateFinetuneRequest)

Create a new Finetune

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.WorkersAiFinetuneApi;

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

    WorkersAiFinetuneApi apiInstance = new WorkersAiFinetuneApi(defaultClient);
    Integer accountId = 48546000; // Integer | 
    WorkersAiCreateFinetuneRequest workersAiCreateFinetuneRequest = new WorkersAiCreateFinetuneRequest(); // WorkersAiCreateFinetuneRequest | 
    try {
      WorkersAiCreateFinetune200Response result = apiInstance.workersAiCreateFinetune(accountId, workersAiCreateFinetuneRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling WorkersAiFinetuneApi#workersAiCreateFinetune");
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
| **accountId** | **Integer**|  | |
| **workersAiCreateFinetuneRequest** | [**WorkersAiCreateFinetuneRequest**](WorkersAiCreateFinetuneRequest.md)|  | [optional] |

### Return type

[**WorkersAiCreateFinetune200Response**](WorkersAiCreateFinetune200Response.md)

### Authorization

[api_key](../README.md#api_key), [api_token](../README.md#api_token), [api_email](../README.md#api_email)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Returns the created finetune |  -  |
| **400** | Finetune creation failed |  -  |

<a id="workersAiListFinetunes"></a>
# **workersAiListFinetunes**
> WorkersAiListFinetunes200Response workersAiListFinetunes(accountId)

List Finetunes

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.WorkersAiFinetuneApi;

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

    WorkersAiFinetuneApi apiInstance = new WorkersAiFinetuneApi(defaultClient);
    Integer accountId = 48546000; // Integer | 
    try {
      WorkersAiListFinetunes200Response result = apiInstance.workersAiListFinetunes(accountId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling WorkersAiFinetuneApi#workersAiListFinetunes");
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
| **accountId** | **Integer**|  | |

### Return type

[**WorkersAiListFinetunes200Response**](WorkersAiListFinetunes200Response.md)

### Authorization

[api_key](../README.md#api_key), [api_token](../README.md#api_token), [api_email](../README.md#api_email)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Returns all finetunes |  -  |
| **400** | Bad Request |  -  |

<a id="workersAiUploadFinetuneAsset"></a>
# **workersAiUploadFinetuneAsset**
> WorkersAiUploadFinetuneAsset200Response workersAiUploadFinetuneAsset(accountId, finetuneId, _file, fileName)

Upload a Finetune Asset

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.WorkersAiFinetuneApi;

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

    WorkersAiFinetuneApi apiInstance = new WorkersAiFinetuneApi(defaultClient);
    Integer accountId = 48546000; // Integer | 
    String finetuneId = "bc451aef-f723-4b26-a6b2-901afd2e7a8a"; // String | 
    File _file = new File("/path/to/file"); // File | 
    String fileName = "fileName_example"; // String | 
    try {
      WorkersAiUploadFinetuneAsset200Response result = apiInstance.workersAiUploadFinetuneAsset(accountId, finetuneId, _file, fileName);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling WorkersAiFinetuneApi#workersAiUploadFinetuneAsset");
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
| **accountId** | **Integer**|  | |
| **finetuneId** | **String**|  | |
| **_file** | **File**|  | [optional] |
| **fileName** | **String**|  | [optional] |

### Return type

[**WorkersAiUploadFinetuneAsset200Response**](WorkersAiUploadFinetuneAsset200Response.md)

### Authorization

[api_key](../README.md#api_key), [api_token](../README.md#api_token), [api_email](../README.md#api_email)

### HTTP request headers

 - **Content-Type**: multipart/form-data
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Returns the created finetune asset |  -  |
| **400** | Finetune creation failed |  -  |

