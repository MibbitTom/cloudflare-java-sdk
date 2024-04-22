# IpAddressManagementDynamicAdvertisementApi

All URIs are relative to *https://api.cloudflare.com/client/v4*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**ipAddressManagementDynamicAdvertisementGetAdvertisementStatus**](IpAddressManagementDynamicAdvertisementApi.md#ipAddressManagementDynamicAdvertisementGetAdvertisementStatus) | **GET** /accounts/{account_id}/addressing/prefixes/{prefix_id}/bgp/status | Get Advertisement Status |
| [**ipAddressManagementDynamicAdvertisementUpdatePrefixDynamicAdvertisementStatus**](IpAddressManagementDynamicAdvertisementApi.md#ipAddressManagementDynamicAdvertisementUpdatePrefixDynamicAdvertisementStatus) | **PATCH** /accounts/{account_id}/addressing/prefixes/{prefix_id}/bgp/status | Update Prefix Dynamic Advertisement Status |


<a id="ipAddressManagementDynamicAdvertisementGetAdvertisementStatus"></a>
# **ipAddressManagementDynamicAdvertisementGetAdvertisementStatus**
> AddressingAdvertisedResponse ipAddressManagementDynamicAdvertisementGetAdvertisementStatus(prefixId, accountId)

Get Advertisement Status

List the current advertisement state for a prefix.

### Example
```java
// Import classes:
import cloudflare.ApiClient;
import cloudflare.ApiException;
import cloudflare.Configuration;
import cloudflare.auth.*;
import cloudflare.models.*;
import cloudflare.sdk.IpAddressManagementDynamicAdvertisementApi;

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

    IpAddressManagementDynamicAdvertisementApi apiInstance = new IpAddressManagementDynamicAdvertisementApi(defaultClient);
    String prefixId = "prefixId_example"; // String | 
    String accountId = "accountId_example"; // String | 
    try {
      AddressingAdvertisedResponse result = apiInstance.ipAddressManagementDynamicAdvertisementGetAdvertisementStatus(prefixId, accountId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling IpAddressManagementDynamicAdvertisementApi#ipAddressManagementDynamicAdvertisementGetAdvertisementStatus");
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
| **prefixId** | **String**|  | |
| **accountId** | **String**|  | |

### Return type

[**AddressingAdvertisedResponse**](AddressingAdvertisedResponse.md)

### Authorization

[api_key](../README.md#api_key), [api_email](../README.md#api_email)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Get Advertisement Status response |  -  |
| **4XX** | Get Advertisement Status response failure |  -  |

<a id="ipAddressManagementDynamicAdvertisementUpdatePrefixDynamicAdvertisementStatus"></a>
# **ipAddressManagementDynamicAdvertisementUpdatePrefixDynamicAdvertisementStatus**
> AddressingAdvertisedResponse ipAddressManagementDynamicAdvertisementUpdatePrefixDynamicAdvertisementStatus(prefixId, accountId, ipAddressManagementDynamicAdvertisementUpdatePrefixDynamicAdvertisementStatusRequest)

Update Prefix Dynamic Advertisement Status

Advertise or withdraw BGP route for a prefix.

### Example
```java
// Import classes:
import cloudflare.ApiClient;
import cloudflare.ApiException;
import cloudflare.Configuration;
import cloudflare.auth.*;
import cloudflare.models.*;
import cloudflare.sdk.IpAddressManagementDynamicAdvertisementApi;

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

    IpAddressManagementDynamicAdvertisementApi apiInstance = new IpAddressManagementDynamicAdvertisementApi(defaultClient);
    String prefixId = "prefixId_example"; // String | 
    String accountId = "accountId_example"; // String | 
    IpAddressManagementDynamicAdvertisementUpdatePrefixDynamicAdvertisementStatusRequest ipAddressManagementDynamicAdvertisementUpdatePrefixDynamicAdvertisementStatusRequest = new IpAddressManagementDynamicAdvertisementUpdatePrefixDynamicAdvertisementStatusRequest(); // IpAddressManagementDynamicAdvertisementUpdatePrefixDynamicAdvertisementStatusRequest | 
    try {
      AddressingAdvertisedResponse result = apiInstance.ipAddressManagementDynamicAdvertisementUpdatePrefixDynamicAdvertisementStatus(prefixId, accountId, ipAddressManagementDynamicAdvertisementUpdatePrefixDynamicAdvertisementStatusRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling IpAddressManagementDynamicAdvertisementApi#ipAddressManagementDynamicAdvertisementUpdatePrefixDynamicAdvertisementStatus");
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
| **prefixId** | **String**|  | |
| **accountId** | **String**|  | |
| **ipAddressManagementDynamicAdvertisementUpdatePrefixDynamicAdvertisementStatusRequest** | [**IpAddressManagementDynamicAdvertisementUpdatePrefixDynamicAdvertisementStatusRequest**](IpAddressManagementDynamicAdvertisementUpdatePrefixDynamicAdvertisementStatusRequest.md)|  | |

### Return type

[**AddressingAdvertisedResponse**](AddressingAdvertisedResponse.md)

### Authorization

[api_key](../README.md#api_key), [api_email](../README.md#api_email)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Update Prefix Dynamic Advertisement Status response |  -  |
| **4XX** | Update Prefix Dynamic Advertisement Status response failure |  -  |

