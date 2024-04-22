# AccountRequestTracerApi

All URIs are relative to *https://api.cloudflare.com/client/v4*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**accountRequestTracerRequestTrace**](AccountRequestTracerApi.md#accountRequestTracerRequestTrace) | **POST** /accounts/{account_id}/request-tracer/trace | Request Trace |


<a id="accountRequestTracerRequestTrace"></a>
# **accountRequestTracerRequestTrace**
> AccountRequestTracerRequestTrace200Response accountRequestTracerRequestTrace(accountId, accountRequestTracerRequestTraceRequest)

Request Trace

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.AccountRequestTracerApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.cloudflare.com/client/v4");
    
    // Configure API key authorization: api_key
    ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
    api_key.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //api_key.setApiKeyPrefix("Token");

    // Configure API key authorization: api_email
    ApiKeyAuth api_email = (ApiKeyAuth) defaultClient.getAuthentication("api_email");
    api_email.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //api_email.setApiKeyPrefix("Token");

    AccountRequestTracerApi apiInstance = new AccountRequestTracerApi(defaultClient);
    String accountId = "accountId_example"; // String | 
    AccountRequestTracerRequestTraceRequest accountRequestTracerRequestTraceRequest = new AccountRequestTracerRequestTraceRequest(); // AccountRequestTracerRequestTraceRequest | 
    try {
      AccountRequestTracerRequestTrace200Response result = apiInstance.accountRequestTracerRequestTrace(accountId, accountRequestTracerRequestTraceRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling AccountRequestTracerApi#accountRequestTracerRequestTrace");
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
| **accountRequestTracerRequestTraceRequest** | [**AccountRequestTracerRequestTraceRequest**](AccountRequestTracerRequestTraceRequest.md)|  | |

### Return type

[**AccountRequestTracerRequestTrace200Response**](AccountRequestTracerRequestTrace200Response.md)

### Authorization

[api_key](../README.md#api_key), [api_email](../README.md#api_email)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Request Trace response |  -  |
| **4XX** | Request Trace response failure |  -  |

