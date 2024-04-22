# ZeroTrustGatewayApplicationAndApplicationTypeMappingsApi

All URIs are relative to *https://api.cloudflare.com/client/v4*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**zeroTrustGatewayApplicationAndApplicationTypeMappingsListApplicationAndApplicationTypeMappings**](ZeroTrustGatewayApplicationAndApplicationTypeMappingsApi.md#zeroTrustGatewayApplicationAndApplicationTypeMappingsListApplicationAndApplicationTypeMappings) | **GET** /accounts/{account_id}/gateway/app_types | List application and application type mappings |


<a id="zeroTrustGatewayApplicationAndApplicationTypeMappingsListApplicationAndApplicationTypeMappings"></a>
# **zeroTrustGatewayApplicationAndApplicationTypeMappingsListApplicationAndApplicationTypeMappings**
> ZeroTrustGatewayAppTypesComponentsSchemasResponseCollection zeroTrustGatewayApplicationAndApplicationTypeMappingsListApplicationAndApplicationTypeMappings(accountId)

List application and application type mappings

Fetches all application and application type mappings.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.ZeroTrustGatewayApplicationAndApplicationTypeMappingsApi;

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

    ZeroTrustGatewayApplicationAndApplicationTypeMappingsApi apiInstance = new ZeroTrustGatewayApplicationAndApplicationTypeMappingsApi(defaultClient);
    String accountId = "accountId_example"; // String | 
    try {
      ZeroTrustGatewayAppTypesComponentsSchemasResponseCollection result = apiInstance.zeroTrustGatewayApplicationAndApplicationTypeMappingsListApplicationAndApplicationTypeMappings(accountId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ZeroTrustGatewayApplicationAndApplicationTypeMappingsApi#zeroTrustGatewayApplicationAndApplicationTypeMappingsListApplicationAndApplicationTypeMappings");
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

[**ZeroTrustGatewayAppTypesComponentsSchemasResponseCollection**](ZeroTrustGatewayAppTypesComponentsSchemasResponseCollection.md)

### Authorization

[api_key](../README.md#api_key), [api_email](../README.md#api_email)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | List application and application type mappings response |  -  |
| **4XX** | List application and application type mappings response failure |  -  |

