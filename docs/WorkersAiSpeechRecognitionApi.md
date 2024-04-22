# WorkersAiSpeechRecognitionApi

All URIs are relative to *https://api.cloudflare.com/client/v4*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**workersAiPostRunCfOpenaiWhisper**](WorkersAiSpeechRecognitionApi.md#workersAiPostRunCfOpenaiWhisper) | **POST** /accounts/{account_id}/ai/run/@cf/openai/whisper | Execute @cf/openai/whisper model. |
| [**workersAiPostRunCfOpenaiWhisperSherpa**](WorkersAiSpeechRecognitionApi.md#workersAiPostRunCfOpenaiWhisperSherpa) | **POST** /accounts/{account_id}/ai/run/@cf/openai/whisper-sherpa | Execute @cf/openai/whisper-sherpa model. |
| [**workersAiPostRunCfOpenaiWhisperTinyEn**](WorkersAiSpeechRecognitionApi.md#workersAiPostRunCfOpenaiWhisperTinyEn) | **POST** /accounts/{account_id}/ai/run/@cf/openai/whisper-tiny-en | Execute @cf/openai/whisper-tiny-en model. |


<a id="workersAiPostRunCfOpenaiWhisper"></a>
# **workersAiPostRunCfOpenaiWhisper**
> WorkersAiPostRunCfOpenaiWhisper200Response workersAiPostRunCfOpenaiWhisper(accountId, body)

Execute @cf/openai/whisper model.

### Example
```java
// Import classes:
import cloudflare.ApiClient;
import cloudflare.ApiException;
import cloudflare.Configuration;
import cloudflare.auth.*;
import cloudflare.models.*;
import cloudflare.sdk.WorkersAiSpeechRecognitionApi;

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

    WorkersAiSpeechRecognitionApi apiInstance = new WorkersAiSpeechRecognitionApi(defaultClient);
    String accountId = "023e105f4ecef8ad9ca31a8372d0c353"; // String | 
    File body = new File("/path/to/file"); // File | 
    try {
      WorkersAiPostRunCfOpenaiWhisper200Response result = apiInstance.workersAiPostRunCfOpenaiWhisper(accountId, body);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling WorkersAiSpeechRecognitionApi#workersAiPostRunCfOpenaiWhisper");
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
| **body** | **File**|  | [optional] |

### Return type

[**WorkersAiPostRunCfOpenaiWhisper200Response**](WorkersAiPostRunCfOpenaiWhisper200Response.md)

### Authorization

[api_key](../README.md#api_key), [api_token](../README.md#api_token), [api_email](../README.md#api_email)

### HTTP request headers

 - **Content-Type**: application/octet-stream
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successful response |  -  |
| **400** | Bad request |  -  |

<a id="workersAiPostRunCfOpenaiWhisperSherpa"></a>
# **workersAiPostRunCfOpenaiWhisperSherpa**
> WorkersAiPostRunCfOpenaiWhisper200Response workersAiPostRunCfOpenaiWhisperSherpa(accountId, body)

Execute @cf/openai/whisper-sherpa model.

### Example
```java
// Import classes:
import cloudflare.ApiClient;
import cloudflare.ApiException;
import cloudflare.Configuration;
import cloudflare.auth.*;
import cloudflare.models.*;
import cloudflare.sdk.WorkersAiSpeechRecognitionApi;

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

    WorkersAiSpeechRecognitionApi apiInstance = new WorkersAiSpeechRecognitionApi(defaultClient);
    String accountId = "023e105f4ecef8ad9ca31a8372d0c353"; // String | 
    File body = new File("/path/to/file"); // File | 
    try {
      WorkersAiPostRunCfOpenaiWhisper200Response result = apiInstance.workersAiPostRunCfOpenaiWhisperSherpa(accountId, body);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling WorkersAiSpeechRecognitionApi#workersAiPostRunCfOpenaiWhisperSherpa");
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
| **body** | **File**|  | [optional] |

### Return type

[**WorkersAiPostRunCfOpenaiWhisper200Response**](WorkersAiPostRunCfOpenaiWhisper200Response.md)

### Authorization

[api_key](../README.md#api_key), [api_token](../README.md#api_token), [api_email](../README.md#api_email)

### HTTP request headers

 - **Content-Type**: application/octet-stream
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successful response |  -  |
| **400** | Bad request |  -  |

<a id="workersAiPostRunCfOpenaiWhisperTinyEn"></a>
# **workersAiPostRunCfOpenaiWhisperTinyEn**
> WorkersAiPostRunCfOpenaiWhisper200Response workersAiPostRunCfOpenaiWhisperTinyEn(accountId, body)

Execute @cf/openai/whisper-tiny-en model.

### Example
```java
// Import classes:
import cloudflare.ApiClient;
import cloudflare.ApiException;
import cloudflare.Configuration;
import cloudflare.auth.*;
import cloudflare.models.*;
import cloudflare.sdk.WorkersAiSpeechRecognitionApi;

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

    WorkersAiSpeechRecognitionApi apiInstance = new WorkersAiSpeechRecognitionApi(defaultClient);
    String accountId = "023e105f4ecef8ad9ca31a8372d0c353"; // String | 
    File body = new File("/path/to/file"); // File | 
    try {
      WorkersAiPostRunCfOpenaiWhisper200Response result = apiInstance.workersAiPostRunCfOpenaiWhisperTinyEn(accountId, body);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling WorkersAiSpeechRecognitionApi#workersAiPostRunCfOpenaiWhisperTinyEn");
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
| **body** | **File**|  | [optional] |

### Return type

[**WorkersAiPostRunCfOpenaiWhisper200Response**](WorkersAiPostRunCfOpenaiWhisper200Response.md)

### Authorization

[api_key](../README.md#api_key), [api_token](../README.md#api_token), [api_email](../README.md#api_email)

### HTTP request headers

 - **Content-Type**: application/octet-stream
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successful response |  -  |
| **400** | Bad request |  -  |

