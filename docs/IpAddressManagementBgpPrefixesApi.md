# IpAddressManagementBgpPrefixesApi

All URIs are relative to *https://api.cloudflare.com/client/v4*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**ipAddressManagementPrefixesFetchBgpPrefix**](IpAddressManagementBgpPrefixesApi.md#ipAddressManagementPrefixesFetchBgpPrefix) | **GET** /accounts/{account_id}/addressing/prefixes/{prefix_id}/bgp/prefixes/{bgp_prefix_id} | Fetch BGP Prefix |
| [**ipAddressManagementPrefixesListBgpPrefixes**](IpAddressManagementBgpPrefixesApi.md#ipAddressManagementPrefixesListBgpPrefixes) | **GET** /accounts/{account_id}/addressing/prefixes/{prefix_id}/bgp/prefixes | List BGP Prefixes |
| [**ipAddressManagementPrefixesUpdateBgpPrefix**](IpAddressManagementBgpPrefixesApi.md#ipAddressManagementPrefixesUpdateBgpPrefix) | **PATCH** /accounts/{account_id}/addressing/prefixes/{prefix_id}/bgp/prefixes/{bgp_prefix_id} | Update BGP Prefix |


<a id="ipAddressManagementPrefixesFetchBgpPrefix"></a>
# **ipAddressManagementPrefixesFetchBgpPrefix**
> AddressingSingleResponseBgp ipAddressManagementPrefixesFetchBgpPrefix(accountId, prefixId, bgpPrefixId)

Fetch BGP Prefix

Retrieve a single BGP Prefix according to its identifier

### Example
```java
// Import classes:
import cloudflare.ApiClient;
import cloudflare.ApiException;
import cloudflare.Configuration;
import cloudflare.auth.*;
import cloudflare.models.*;
import cloudflare.sdk.IpAddressManagementBgpPrefixesApi;

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

    IpAddressManagementBgpPrefixesApi apiInstance = new IpAddressManagementBgpPrefixesApi(defaultClient);
    String accountId = "accountId_example"; // String | 
    String prefixId = "prefixId_example"; // String | 
    String bgpPrefixId = "bgpPrefixId_example"; // String | 
    try {
      AddressingSingleResponseBgp result = apiInstance.ipAddressManagementPrefixesFetchBgpPrefix(accountId, prefixId, bgpPrefixId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling IpAddressManagementBgpPrefixesApi#ipAddressManagementPrefixesFetchBgpPrefix");
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
| **prefixId** | **String**|  | |
| **bgpPrefixId** | **String**|  | |

### Return type

[**AddressingSingleResponseBgp**](AddressingSingleResponseBgp.md)

### Authorization

[api_key](../README.md#api_key), [api_email](../README.md#api_email)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Fetch BGP Prefix response |  -  |
| **4XX** | Fetch BGP Prefix response failure |  -  |

<a id="ipAddressManagementPrefixesListBgpPrefixes"></a>
# **ipAddressManagementPrefixesListBgpPrefixes**
> AddressingResponseCollectionBgp ipAddressManagementPrefixesListBgpPrefixes(accountId, prefixId)

List BGP Prefixes

List all BGP Prefixes within the specified IP Prefix. BGP Prefixes are used to control which specific subnets are advertised to the Internet. It is possible to advertise subnets more specific than an IP Prefix by creating more specific BGP Prefixes.

### Example
```java
// Import classes:
import cloudflare.ApiClient;
import cloudflare.ApiException;
import cloudflare.Configuration;
import cloudflare.auth.*;
import cloudflare.models.*;
import cloudflare.sdk.IpAddressManagementBgpPrefixesApi;

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

    IpAddressManagementBgpPrefixesApi apiInstance = new IpAddressManagementBgpPrefixesApi(defaultClient);
    String accountId = "accountId_example"; // String | 
    String prefixId = "prefixId_example"; // String | 
    try {
      AddressingResponseCollectionBgp result = apiInstance.ipAddressManagementPrefixesListBgpPrefixes(accountId, prefixId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling IpAddressManagementBgpPrefixesApi#ipAddressManagementPrefixesListBgpPrefixes");
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
| **prefixId** | **String**|  | |

### Return type

[**AddressingResponseCollectionBgp**](AddressingResponseCollectionBgp.md)

### Authorization

[api_key](../README.md#api_key), [api_email](../README.md#api_email)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | List BGP Prefixes response |  -  |
| **4XX** | List BGP Prefixes response failure |  -  |

<a id="ipAddressManagementPrefixesUpdateBgpPrefix"></a>
# **ipAddressManagementPrefixesUpdateBgpPrefix**
> AddressingSingleResponseBgp ipAddressManagementPrefixesUpdateBgpPrefix(accountId, prefixId, bgpPrefixId, addressingBgpPrefixUpdateAdvertisement)

Update BGP Prefix

Update the properties of a BGP Prefix, such as the on demand advertisement status (advertised or withdrawn).

### Example
```java
// Import classes:
import cloudflare.ApiClient;
import cloudflare.ApiException;
import cloudflare.Configuration;
import cloudflare.auth.*;
import cloudflare.models.*;
import cloudflare.sdk.IpAddressManagementBgpPrefixesApi;

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

    IpAddressManagementBgpPrefixesApi apiInstance = new IpAddressManagementBgpPrefixesApi(defaultClient);
    String accountId = "accountId_example"; // String | 
    String prefixId = "prefixId_example"; // String | 
    String bgpPrefixId = "bgpPrefixId_example"; // String | 
    AddressingBgpPrefixUpdateAdvertisement addressingBgpPrefixUpdateAdvertisement = new AddressingBgpPrefixUpdateAdvertisement(); // AddressingBgpPrefixUpdateAdvertisement | 
    try {
      AddressingSingleResponseBgp result = apiInstance.ipAddressManagementPrefixesUpdateBgpPrefix(accountId, prefixId, bgpPrefixId, addressingBgpPrefixUpdateAdvertisement);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling IpAddressManagementBgpPrefixesApi#ipAddressManagementPrefixesUpdateBgpPrefix");
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
| **prefixId** | **String**|  | |
| **bgpPrefixId** | **String**|  | |
| **addressingBgpPrefixUpdateAdvertisement** | [**AddressingBgpPrefixUpdateAdvertisement**](AddressingBgpPrefixUpdateAdvertisement.md)|  | |

### Return type

[**AddressingSingleResponseBgp**](AddressingSingleResponseBgp.md)

### Authorization

[api_key](../README.md#api_key), [api_email](../README.md#api_email)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Update BGP Prefix response |  -  |
| **4XX** | Update BGP Prefix response failure |  -  |

