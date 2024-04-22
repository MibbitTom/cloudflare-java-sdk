# WorkersAiSummarizationApi

All URIs are relative to *https://api.cloudflare.com/client/v4*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**workersAiPostRunCfFacebookBartLargeCnn**](WorkersAiSummarizationApi.md#workersAiPostRunCfFacebookBartLargeCnn) | **POST** /accounts/{account_id}/ai/run/@cf/facebook/bart-large-cnn | Execute @cf/facebook/bart-large-cnn model. |


<a id="workersAiPostRunCfFacebookBartLargeCnn"></a>
# **workersAiPostRunCfFacebookBartLargeCnn**
> WorkersAiPostRunCfFacebookBartLargeCnn200Response workersAiPostRunCfFacebookBartLargeCnn(accountId, workersAiPostRunCfFacebookBartLargeCnnRequest)

Execute @cf/facebook/bart-large-cnn model.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.WorkersAiSummarizationApi;

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

    WorkersAiSummarizationApi apiInstance = new WorkersAiSummarizationApi(defaultClient);
    String accountId = "023e105f4ecef8ad9ca31a8372d0c353"; // String | 
    WorkersAiPostRunCfFacebookBartLargeCnnRequest workersAiPostRunCfFacebookBartLargeCnnRequest = new WorkersAiPostRunCfFacebookBartLargeCnnRequest(); // WorkersAiPostRunCfFacebookBartLargeCnnRequest | 
    try {
      WorkersAiPostRunCfFacebookBartLargeCnn200Response result = apiInstance.workersAiPostRunCfFacebookBartLargeCnn(accountId, workersAiPostRunCfFacebookBartLargeCnnRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling WorkersAiSummarizationApi#workersAiPostRunCfFacebookBartLargeCnn");
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
| **workersAiPostRunCfFacebookBartLargeCnnRequest** | [**WorkersAiPostRunCfFacebookBartLargeCnnRequest**](WorkersAiPostRunCfFacebookBartLargeCnnRequest.md)|  | [optional] |

### Return type

[**WorkersAiPostRunCfFacebookBartLargeCnn200Response**](WorkersAiPostRunCfFacebookBartLargeCnn200Response.md)

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
