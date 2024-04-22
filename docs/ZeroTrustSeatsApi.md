# ZeroTrustSeatsApi

All URIs are relative to *https://api.cloudflare.com/client/v4*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**zeroTrustSeatsUpdateAUserSeat**](ZeroTrustSeatsApi.md#zeroTrustSeatsUpdateAUserSeat) | **PATCH** /accounts/{identifier}/access/seats | Update a user seat |


<a id="zeroTrustSeatsUpdateAUserSeat"></a>
# **zeroTrustSeatsUpdateAUserSeat**
> AccessSeatsComponentsSchemasResponseCollection zeroTrustSeatsUpdateAUserSeat(identifier, accessSeat)

Update a user seat

Removes a user from a Zero Trust seat when both &#x60;access_seat&#x60; and &#x60;gateway_seat&#x60; are set to false.

### Example
```java
// Import classes:
import cloudflare.ApiClient;
import cloudflare.ApiException;
import cloudflare.Configuration;
import cloudflare.auth.*;
import cloudflare.models.*;
import cloudflare.sdk.ZeroTrustSeatsApi;

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

    ZeroTrustSeatsApi apiInstance = new ZeroTrustSeatsApi(defaultClient);
    String identifier = "identifier_example"; // String | 
    List<AccessSeat> accessSeat = Arrays.asList(); // List<AccessSeat> | 
    try {
      AccessSeatsComponentsSchemasResponseCollection result = apiInstance.zeroTrustSeatsUpdateAUserSeat(identifier, accessSeat);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ZeroTrustSeatsApi#zeroTrustSeatsUpdateAUserSeat");
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
| **identifier** | **String**|  | |
| **accessSeat** | [**List&lt;AccessSeat&gt;**](AccessSeat.md)|  | |

### Return type

[**AccessSeatsComponentsSchemasResponseCollection**](AccessSeatsComponentsSchemasResponseCollection.md)

### Authorization

[api_key](../README.md#api_key), [api_email](../README.md#api_email)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Update a user seat response |  -  |
| **4XX** | Update a user seat response failure |  -  |

