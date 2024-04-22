# WorkersAiTextEmbeddingsApi

All URIs are relative to *https://api.cloudflare.com/client/v4*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**workersAiPostRunCfBaaiBgeBaseEnV15**](WorkersAiTextEmbeddingsApi.md#workersAiPostRunCfBaaiBgeBaseEnV15) | **POST** /accounts/{account_id}/ai/run/@cf/baai/bge-base-en-v1.5 | Execute @cf/baai/bge-base-en-v1.5 model. |
| [**workersAiPostRunCfBaaiBgeLargeEnV15**](WorkersAiTextEmbeddingsApi.md#workersAiPostRunCfBaaiBgeLargeEnV15) | **POST** /accounts/{account_id}/ai/run/@cf/baai/bge-large-en-v1.5 | Execute @cf/baai/bge-large-en-v1.5 model. |
| [**workersAiPostRunCfBaaiBgeSmallEnV15**](WorkersAiTextEmbeddingsApi.md#workersAiPostRunCfBaaiBgeSmallEnV15) | **POST** /accounts/{account_id}/ai/run/@cf/baai/bge-small-en-v1.5 | Execute @cf/baai/bge-small-en-v1.5 model. |


<a id="workersAiPostRunCfBaaiBgeBaseEnV15"></a>
# **workersAiPostRunCfBaaiBgeBaseEnV15**
> WorkersAiPostRunCfBaaiBgeBaseEnV15200Response workersAiPostRunCfBaaiBgeBaseEnV15(accountId, workersAiPostRunCfBaaiBgeBaseEnV15Request)

Execute @cf/baai/bge-base-en-v1.5 model.

### Example
```java
// Import classes:
import cloudflare.ApiClient;
import cloudflare.ApiException;
import cloudflare.Configuration;
import cloudflare.auth.*;
import cloudflare.models.*;
import cloudflare.sdk.WorkersAiTextEmbeddingsApi;

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

    WorkersAiTextEmbeddingsApi apiInstance = new WorkersAiTextEmbeddingsApi(defaultClient);
    String accountId = "023e105f4ecef8ad9ca31a8372d0c353"; // String | 
    WorkersAiPostRunCfBaaiBgeBaseEnV15Request workersAiPostRunCfBaaiBgeBaseEnV15Request = new WorkersAiPostRunCfBaaiBgeBaseEnV15Request(); // WorkersAiPostRunCfBaaiBgeBaseEnV15Request | 
    try {
      WorkersAiPostRunCfBaaiBgeBaseEnV15200Response result = apiInstance.workersAiPostRunCfBaaiBgeBaseEnV15(accountId, workersAiPostRunCfBaaiBgeBaseEnV15Request);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling WorkersAiTextEmbeddingsApi#workersAiPostRunCfBaaiBgeBaseEnV15");
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
| **workersAiPostRunCfBaaiBgeBaseEnV15Request** | [**WorkersAiPostRunCfBaaiBgeBaseEnV15Request**](WorkersAiPostRunCfBaaiBgeBaseEnV15Request.md)|  | [optional] |

### Return type

[**WorkersAiPostRunCfBaaiBgeBaseEnV15200Response**](WorkersAiPostRunCfBaaiBgeBaseEnV15200Response.md)

### Authorization

[api_key](../README.md#api_key), [api_token](../README.md#api_token), [api_email](../README.md#api_email)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successful response |  -  |
| **400** | Bad request |  -  |

<a id="workersAiPostRunCfBaaiBgeLargeEnV15"></a>
# **workersAiPostRunCfBaaiBgeLargeEnV15**
> WorkersAiPostRunCfBaaiBgeBaseEnV15200Response workersAiPostRunCfBaaiBgeLargeEnV15(accountId, workersAiPostRunCfBaaiBgeBaseEnV15Request)

Execute @cf/baai/bge-large-en-v1.5 model.

### Example
```java
// Import classes:
import cloudflare.ApiClient;
import cloudflare.ApiException;
import cloudflare.Configuration;
import cloudflare.auth.*;
import cloudflare.models.*;
import cloudflare.sdk.WorkersAiTextEmbeddingsApi;

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

    WorkersAiTextEmbeddingsApi apiInstance = new WorkersAiTextEmbeddingsApi(defaultClient);
    String accountId = "023e105f4ecef8ad9ca31a8372d0c353"; // String | 
    WorkersAiPostRunCfBaaiBgeBaseEnV15Request workersAiPostRunCfBaaiBgeBaseEnV15Request = new WorkersAiPostRunCfBaaiBgeBaseEnV15Request(); // WorkersAiPostRunCfBaaiBgeBaseEnV15Request | 
    try {
      WorkersAiPostRunCfBaaiBgeBaseEnV15200Response result = apiInstance.workersAiPostRunCfBaaiBgeLargeEnV15(accountId, workersAiPostRunCfBaaiBgeBaseEnV15Request);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling WorkersAiTextEmbeddingsApi#workersAiPostRunCfBaaiBgeLargeEnV15");
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
| **workersAiPostRunCfBaaiBgeBaseEnV15Request** | [**WorkersAiPostRunCfBaaiBgeBaseEnV15Request**](WorkersAiPostRunCfBaaiBgeBaseEnV15Request.md)|  | [optional] |

### Return type

[**WorkersAiPostRunCfBaaiBgeBaseEnV15200Response**](WorkersAiPostRunCfBaaiBgeBaseEnV15200Response.md)

### Authorization

[api_key](../README.md#api_key), [api_token](../README.md#api_token), [api_email](../README.md#api_email)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successful response |  -  |
| **400** | Bad request |  -  |

<a id="workersAiPostRunCfBaaiBgeSmallEnV15"></a>
# **workersAiPostRunCfBaaiBgeSmallEnV15**
> WorkersAiPostRunCfBaaiBgeBaseEnV15200Response workersAiPostRunCfBaaiBgeSmallEnV15(accountId, workersAiPostRunCfBaaiBgeBaseEnV15Request)

Execute @cf/baai/bge-small-en-v1.5 model.

### Example
```java
// Import classes:
import cloudflare.ApiClient;
import cloudflare.ApiException;
import cloudflare.Configuration;
import cloudflare.auth.*;
import cloudflare.models.*;
import cloudflare.sdk.WorkersAiTextEmbeddingsApi;

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

    WorkersAiTextEmbeddingsApi apiInstance = new WorkersAiTextEmbeddingsApi(defaultClient);
    String accountId = "023e105f4ecef8ad9ca31a8372d0c353"; // String | 
    WorkersAiPostRunCfBaaiBgeBaseEnV15Request workersAiPostRunCfBaaiBgeBaseEnV15Request = new WorkersAiPostRunCfBaaiBgeBaseEnV15Request(); // WorkersAiPostRunCfBaaiBgeBaseEnV15Request | 
    try {
      WorkersAiPostRunCfBaaiBgeBaseEnV15200Response result = apiInstance.workersAiPostRunCfBaaiBgeSmallEnV15(accountId, workersAiPostRunCfBaaiBgeBaseEnV15Request);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling WorkersAiTextEmbeddingsApi#workersAiPostRunCfBaaiBgeSmallEnV15");
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
| **workersAiPostRunCfBaaiBgeBaseEnV15Request** | [**WorkersAiPostRunCfBaaiBgeBaseEnV15Request**](WorkersAiPostRunCfBaaiBgeBaseEnV15Request.md)|  | [optional] |

### Return type

[**WorkersAiPostRunCfBaaiBgeBaseEnV15200Response**](WorkersAiPostRunCfBaaiBgeBaseEnV15200Response.md)

### Authorization

[api_key](../README.md#api_key), [api_token](../README.md#api_token), [api_email](../README.md#api_email)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successful response |  -  |
| **400** | Bad request |  -  |

