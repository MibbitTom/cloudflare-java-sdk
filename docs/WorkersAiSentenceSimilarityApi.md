# WorkersAiSentenceSimilarityApi

All URIs are relative to *https://api.cloudflare.com/client/v4*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**workersAiPostRunHfSentenceTransformersAllMinilmL6V2**](WorkersAiSentenceSimilarityApi.md#workersAiPostRunHfSentenceTransformersAllMinilmL6V2) | **POST** /accounts/{account_id}/ai/run/@hf/sentence-transformers/all-minilm-l6-v2 | Execute @hf/sentence-transformers/all-minilm-l6-v2 model. |


<a id="workersAiPostRunHfSentenceTransformersAllMinilmL6V2"></a>
# **workersAiPostRunHfSentenceTransformersAllMinilmL6V2**
> WorkersAiPostRunHfSentenceTransformersAllMinilmL6V2200Response workersAiPostRunHfSentenceTransformersAllMinilmL6V2(accountId, workersAiPostRunHfSentenceTransformersAllMinilmL6V2Request)

Execute @hf/sentence-transformers/all-minilm-l6-v2 model.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.WorkersAiSentenceSimilarityApi;

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

    WorkersAiSentenceSimilarityApi apiInstance = new WorkersAiSentenceSimilarityApi(defaultClient);
    String accountId = "023e105f4ecef8ad9ca31a8372d0c353"; // String | 
    WorkersAiPostRunHfSentenceTransformersAllMinilmL6V2Request workersAiPostRunHfSentenceTransformersAllMinilmL6V2Request = new WorkersAiPostRunHfSentenceTransformersAllMinilmL6V2Request(); // WorkersAiPostRunHfSentenceTransformersAllMinilmL6V2Request | 
    try {
      WorkersAiPostRunHfSentenceTransformersAllMinilmL6V2200Response result = apiInstance.workersAiPostRunHfSentenceTransformersAllMinilmL6V2(accountId, workersAiPostRunHfSentenceTransformersAllMinilmL6V2Request);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling WorkersAiSentenceSimilarityApi#workersAiPostRunHfSentenceTransformersAllMinilmL6V2");
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
| **workersAiPostRunHfSentenceTransformersAllMinilmL6V2Request** | [**WorkersAiPostRunHfSentenceTransformersAllMinilmL6V2Request**](WorkersAiPostRunHfSentenceTransformersAllMinilmL6V2Request.md)|  | [optional] |

### Return type

[**WorkersAiPostRunHfSentenceTransformersAllMinilmL6V2200Response**](WorkersAiPostRunHfSentenceTransformersAllMinilmL6V2200Response.md)

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

