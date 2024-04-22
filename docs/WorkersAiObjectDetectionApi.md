# WorkersAiObjectDetectionApi

All URIs are relative to *https://api.cloudflare.com/client/v4*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**workersAiPostRunCfFacebookDetrResnet50**](WorkersAiObjectDetectionApi.md#workersAiPostRunCfFacebookDetrResnet50) | **POST** /accounts/{account_id}/ai/run/@cf/facebook/detr-resnet-50 | Execute @cf/facebook/detr-resnet-50 model. |


<a id="workersAiPostRunCfFacebookDetrResnet50"></a>
# **workersAiPostRunCfFacebookDetrResnet50**
> WorkersAiPostRunCfFacebookDetrResnet50200Response workersAiPostRunCfFacebookDetrResnet50(accountId, body)

Execute @cf/facebook/detr-resnet-50 model.

### Example
```java
// Import classes:
import cloudflare.ApiClient;
import cloudflare.ApiException;
import cloudflare.Configuration;
import cloudflare.auth.*;
import cloudflare.models.*;
import cloudflare.sdk.WorkersAiObjectDetectionApi;

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

    WorkersAiObjectDetectionApi apiInstance = new WorkersAiObjectDetectionApi(defaultClient);
    String accountId = "023e105f4ecef8ad9ca31a8372d0c353"; // String | 
    File body = new File("/path/to/file"); // File | 
    try {
      WorkersAiPostRunCfFacebookDetrResnet50200Response result = apiInstance.workersAiPostRunCfFacebookDetrResnet50(accountId, body);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling WorkersAiObjectDetectionApi#workersAiPostRunCfFacebookDetrResnet50");
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

[**WorkersAiPostRunCfFacebookDetrResnet50200Response**](WorkersAiPostRunCfFacebookDetrResnet50200Response.md)

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

