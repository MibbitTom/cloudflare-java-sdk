# WorkersAiTranslationApi

All URIs are relative to *https://api.cloudflare.com/client/v4*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**workersAiPostRunCfMetaM2m10012b**](WorkersAiTranslationApi.md#workersAiPostRunCfMetaM2m10012b) | **POST** /accounts/{account_id}/ai/run/@cf/meta/m2m100-1.2b | Execute @cf/meta/m2m100-1.2b model. |


<a id="workersAiPostRunCfMetaM2m10012b"></a>
# **workersAiPostRunCfMetaM2m10012b**
> WorkersAiPostRunCfMetaM2m10012b200Response workersAiPostRunCfMetaM2m10012b(accountId, workersAiPostRunCfMetaM2m10012bRequest)

Execute @cf/meta/m2m100-1.2b model.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.WorkersAiTranslationApi;

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

    WorkersAiTranslationApi apiInstance = new WorkersAiTranslationApi(defaultClient);
    String accountId = "023e105f4ecef8ad9ca31a8372d0c353"; // String | 
    WorkersAiPostRunCfMetaM2m10012bRequest workersAiPostRunCfMetaM2m10012bRequest = new WorkersAiPostRunCfMetaM2m10012bRequest(); // WorkersAiPostRunCfMetaM2m10012bRequest | 
    try {
      WorkersAiPostRunCfMetaM2m10012b200Response result = apiInstance.workersAiPostRunCfMetaM2m10012b(accountId, workersAiPostRunCfMetaM2m10012bRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling WorkersAiTranslationApi#workersAiPostRunCfMetaM2m10012b");
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
| **workersAiPostRunCfMetaM2m10012bRequest** | [**WorkersAiPostRunCfMetaM2m10012bRequest**](WorkersAiPostRunCfMetaM2m10012bRequest.md)|  | [optional] |

### Return type

[**WorkersAiPostRunCfMetaM2m10012b200Response**](WorkersAiPostRunCfMetaM2m10012b200Response.md)

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

