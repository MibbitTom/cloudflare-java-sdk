# WorkersAiTextClassificationApi

All URIs are relative to *https://api.cloudflare.com/client/v4*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**workersAiPostRunCfHuggingfaceDistilbertSst2Int8**](WorkersAiTextClassificationApi.md#workersAiPostRunCfHuggingfaceDistilbertSst2Int8) | **POST** /accounts/{account_id}/ai/run/@cf/huggingface/distilbert-sst-2-int8 | Execute @cf/huggingface/distilbert-sst-2-int8 model. |
| [**workersAiPostRunCfInmlInmlRobertaDga**](WorkersAiTextClassificationApi.md#workersAiPostRunCfInmlInmlRobertaDga) | **POST** /accounts/{account_id}/ai/run/@cf/inml/inml-roberta-dga | Execute @cf/inml/inml-roberta-dga model. |
| [**workersAiPostRunCfJpmorganchaseRobertaSpam**](WorkersAiTextClassificationApi.md#workersAiPostRunCfJpmorganchaseRobertaSpam) | **POST** /accounts/{account_id}/ai/run/@cf/jpmorganchase/roberta-spam | Execute @cf/jpmorganchase/roberta-spam model. |


<a id="workersAiPostRunCfHuggingfaceDistilbertSst2Int8"></a>
# **workersAiPostRunCfHuggingfaceDistilbertSst2Int8**
> WorkersAiPostRunCfHuggingfaceDistilbertSst2Int8200Response workersAiPostRunCfHuggingfaceDistilbertSst2Int8(accountId, workersAiPostRunCfHuggingfaceDistilbertSst2Int8Request)

Execute @cf/huggingface/distilbert-sst-2-int8 model.

### Example
```java
// Import classes:
import cloudflare.ApiClient;
import cloudflare.ApiException;
import cloudflare.Configuration;
import cloudflare.auth.*;
import cloudflare.models.*;
import cloudflare.sdk.WorkersAiTextClassificationApi;

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

    WorkersAiTextClassificationApi apiInstance = new WorkersAiTextClassificationApi(defaultClient);
    String accountId = "023e105f4ecef8ad9ca31a8372d0c353"; // String | 
    WorkersAiPostRunCfHuggingfaceDistilbertSst2Int8Request workersAiPostRunCfHuggingfaceDistilbertSst2Int8Request = new WorkersAiPostRunCfHuggingfaceDistilbertSst2Int8Request(); // WorkersAiPostRunCfHuggingfaceDistilbertSst2Int8Request | 
    try {
      WorkersAiPostRunCfHuggingfaceDistilbertSst2Int8200Response result = apiInstance.workersAiPostRunCfHuggingfaceDistilbertSst2Int8(accountId, workersAiPostRunCfHuggingfaceDistilbertSst2Int8Request);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling WorkersAiTextClassificationApi#workersAiPostRunCfHuggingfaceDistilbertSst2Int8");
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
| **workersAiPostRunCfHuggingfaceDistilbertSst2Int8Request** | [**WorkersAiPostRunCfHuggingfaceDistilbertSst2Int8Request**](WorkersAiPostRunCfHuggingfaceDistilbertSst2Int8Request.md)|  | [optional] |

### Return type

[**WorkersAiPostRunCfHuggingfaceDistilbertSst2Int8200Response**](WorkersAiPostRunCfHuggingfaceDistilbertSst2Int8200Response.md)

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

<a id="workersAiPostRunCfInmlInmlRobertaDga"></a>
# **workersAiPostRunCfInmlInmlRobertaDga**
> WorkersAiPostRunCfHuggingfaceDistilbertSst2Int8200Response workersAiPostRunCfInmlInmlRobertaDga(accountId, workersAiPostRunCfHuggingfaceDistilbertSst2Int8Request)

Execute @cf/inml/inml-roberta-dga model.

### Example
```java
// Import classes:
import cloudflare.ApiClient;
import cloudflare.ApiException;
import cloudflare.Configuration;
import cloudflare.auth.*;
import cloudflare.models.*;
import cloudflare.sdk.WorkersAiTextClassificationApi;

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

    WorkersAiTextClassificationApi apiInstance = new WorkersAiTextClassificationApi(defaultClient);
    String accountId = "023e105f4ecef8ad9ca31a8372d0c353"; // String | 
    WorkersAiPostRunCfHuggingfaceDistilbertSst2Int8Request workersAiPostRunCfHuggingfaceDistilbertSst2Int8Request = new WorkersAiPostRunCfHuggingfaceDistilbertSst2Int8Request(); // WorkersAiPostRunCfHuggingfaceDistilbertSst2Int8Request | 
    try {
      WorkersAiPostRunCfHuggingfaceDistilbertSst2Int8200Response result = apiInstance.workersAiPostRunCfInmlInmlRobertaDga(accountId, workersAiPostRunCfHuggingfaceDistilbertSst2Int8Request);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling WorkersAiTextClassificationApi#workersAiPostRunCfInmlInmlRobertaDga");
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
| **workersAiPostRunCfHuggingfaceDistilbertSst2Int8Request** | [**WorkersAiPostRunCfHuggingfaceDistilbertSst2Int8Request**](WorkersAiPostRunCfHuggingfaceDistilbertSst2Int8Request.md)|  | [optional] |

### Return type

[**WorkersAiPostRunCfHuggingfaceDistilbertSst2Int8200Response**](WorkersAiPostRunCfHuggingfaceDistilbertSst2Int8200Response.md)

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

<a id="workersAiPostRunCfJpmorganchaseRobertaSpam"></a>
# **workersAiPostRunCfJpmorganchaseRobertaSpam**
> WorkersAiPostRunCfHuggingfaceDistilbertSst2Int8200Response workersAiPostRunCfJpmorganchaseRobertaSpam(accountId, workersAiPostRunCfHuggingfaceDistilbertSst2Int8Request)

Execute @cf/jpmorganchase/roberta-spam model.

### Example
```java
// Import classes:
import cloudflare.ApiClient;
import cloudflare.ApiException;
import cloudflare.Configuration;
import cloudflare.auth.*;
import cloudflare.models.*;
import cloudflare.sdk.WorkersAiTextClassificationApi;

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

    WorkersAiTextClassificationApi apiInstance = new WorkersAiTextClassificationApi(defaultClient);
    String accountId = "023e105f4ecef8ad9ca31a8372d0c353"; // String | 
    WorkersAiPostRunCfHuggingfaceDistilbertSst2Int8Request workersAiPostRunCfHuggingfaceDistilbertSst2Int8Request = new WorkersAiPostRunCfHuggingfaceDistilbertSst2Int8Request(); // WorkersAiPostRunCfHuggingfaceDistilbertSst2Int8Request | 
    try {
      WorkersAiPostRunCfHuggingfaceDistilbertSst2Int8200Response result = apiInstance.workersAiPostRunCfJpmorganchaseRobertaSpam(accountId, workersAiPostRunCfHuggingfaceDistilbertSst2Int8Request);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling WorkersAiTextClassificationApi#workersAiPostRunCfJpmorganchaseRobertaSpam");
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
| **workersAiPostRunCfHuggingfaceDistilbertSst2Int8Request** | [**WorkersAiPostRunCfHuggingfaceDistilbertSst2Int8Request**](WorkersAiPostRunCfHuggingfaceDistilbertSst2Int8Request.md)|  | [optional] |

### Return type

[**WorkersAiPostRunCfHuggingfaceDistilbertSst2Int8200Response**](WorkersAiPostRunCfHuggingfaceDistilbertSst2Int8200Response.md)

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

