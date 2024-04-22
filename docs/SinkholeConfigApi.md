# SinkholeConfigApi

All URIs are relative to *https://api.cloudflare.com/client/v4*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**sinkholeConfigGetSinkholes**](SinkholeConfigApi.md#sinkholeConfigGetSinkholes) | **GET** /accounts/{account_id}/intel/sinkholes | List sinkholes owned by this account |


<a id="sinkholeConfigGetSinkholes"></a>
# **sinkholeConfigGetSinkholes**
> IntelSinkholesGetSinkholesResponse sinkholeConfigGetSinkholes(accountId)

List sinkholes owned by this account

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.SinkholeConfigApi;

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

    SinkholeConfigApi apiInstance = new SinkholeConfigApi(defaultClient);
    String accountId = "accountId_example"; // String | 
    try {
      IntelSinkholesGetSinkholesResponse result = apiInstance.sinkholeConfigGetSinkholes(accountId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling SinkholeConfigApi#sinkholeConfigGetSinkholes");
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

### Return type

[**IntelSinkholesGetSinkholesResponse**](IntelSinkholesGetSinkholesResponse.md)

### Authorization

[api_key](../README.md#api_key), [api_email](../README.md#api_email)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successful Response |  -  |

