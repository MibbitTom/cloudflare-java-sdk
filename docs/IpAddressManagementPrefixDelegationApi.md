# IpAddressManagementPrefixDelegationApi

All URIs are relative to *https://api.cloudflare.com/client/v4*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**ipAddressManagementPrefixDelegationCreatePrefixDelegation**](IpAddressManagementPrefixDelegationApi.md#ipAddressManagementPrefixDelegationCreatePrefixDelegation) | **POST** /accounts/{account_id}/addressing/prefixes/{prefix_id}/delegations | Create Prefix Delegation |
| [**ipAddressManagementPrefixDelegationDeletePrefixDelegation**](IpAddressManagementPrefixDelegationApi.md#ipAddressManagementPrefixDelegationDeletePrefixDelegation) | **DELETE** /accounts/{account_id}/addressing/prefixes/{prefix_id}/delegations/{delegation_id} | Delete Prefix Delegation |
| [**ipAddressManagementPrefixDelegationListPrefixDelegations**](IpAddressManagementPrefixDelegationApi.md#ipAddressManagementPrefixDelegationListPrefixDelegations) | **GET** /accounts/{account_id}/addressing/prefixes/{prefix_id}/delegations | List Prefix Delegations |


<a id="ipAddressManagementPrefixDelegationCreatePrefixDelegation"></a>
# **ipAddressManagementPrefixDelegationCreatePrefixDelegation**
> AddressingSchemasSingleResponse ipAddressManagementPrefixDelegationCreatePrefixDelegation(prefixId, accountId, ipAddressManagementPrefixDelegationCreatePrefixDelegationRequest)

Create Prefix Delegation

Create a new account delegation for a given IP prefix.

### Example
```java
// Import classes:
import cloudflare.ApiClient;
import cloudflare.ApiException;
import cloudflare.Configuration;
import cloudflare.auth.*;
import cloudflare.models.*;
import cloudflare.sdk.IpAddressManagementPrefixDelegationApi;

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

    IpAddressManagementPrefixDelegationApi apiInstance = new IpAddressManagementPrefixDelegationApi(defaultClient);
    String prefixId = "prefixId_example"; // String | 
    String accountId = "accountId_example"; // String | 
    IpAddressManagementPrefixDelegationCreatePrefixDelegationRequest ipAddressManagementPrefixDelegationCreatePrefixDelegationRequest = new IpAddressManagementPrefixDelegationCreatePrefixDelegationRequest(); // IpAddressManagementPrefixDelegationCreatePrefixDelegationRequest | 
    try {
      AddressingSchemasSingleResponse result = apiInstance.ipAddressManagementPrefixDelegationCreatePrefixDelegation(prefixId, accountId, ipAddressManagementPrefixDelegationCreatePrefixDelegationRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling IpAddressManagementPrefixDelegationApi#ipAddressManagementPrefixDelegationCreatePrefixDelegation");
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
| **ipAddressManagementPrefixDelegationCreatePrefixDelegationRequest** | [**IpAddressManagementPrefixDelegationCreatePrefixDelegationRequest**](IpAddressManagementPrefixDelegationCreatePrefixDelegationRequest.md)|  | |

### Return type

[**AddressingSchemasSingleResponse**](AddressingSchemasSingleResponse.md)

### Authorization

[api_key](../README.md#api_key), [api_email](../README.md#api_email)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Create Prefix Delegation response |  -  |
| **4XX** | Create Prefix Delegation response failure |  -  |

<a id="ipAddressManagementPrefixDelegationDeletePrefixDelegation"></a>
# **ipAddressManagementPrefixDelegationDeletePrefixDelegation**
> AddressingIdResponse ipAddressManagementPrefixDelegationDeletePrefixDelegation(delegationId, prefixId, accountId)

Delete Prefix Delegation

Delete an account delegation for a given IP prefix.

### Example
```java
// Import classes:
import cloudflare.ApiClient;
import cloudflare.ApiException;
import cloudflare.Configuration;
import cloudflare.auth.*;
import cloudflare.models.*;
import cloudflare.sdk.IpAddressManagementPrefixDelegationApi;

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

    IpAddressManagementPrefixDelegationApi apiInstance = new IpAddressManagementPrefixDelegationApi(defaultClient);
    String delegationId = "delegationId_example"; // String | 
    String prefixId = "prefixId_example"; // String | 
    String accountId = "accountId_example"; // String | 
    try {
      AddressingIdResponse result = apiInstance.ipAddressManagementPrefixDelegationDeletePrefixDelegation(delegationId, prefixId, accountId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling IpAddressManagementPrefixDelegationApi#ipAddressManagementPrefixDelegationDeletePrefixDelegation");
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
| **delegationId** | **String**|  | |
| **prefixId** | **String**|  | |
| **accountId** | **String**|  | |

### Return type

[**AddressingIdResponse**](AddressingIdResponse.md)

### Authorization

[api_key](../README.md#api_key), [api_email](../README.md#api_email)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Delete Prefix Delegation response |  -  |
| **4XX** | Delete Prefix Delegation response failure |  -  |

<a id="ipAddressManagementPrefixDelegationListPrefixDelegations"></a>
# **ipAddressManagementPrefixDelegationListPrefixDelegations**
> AddressingSchemasResponseCollection ipAddressManagementPrefixDelegationListPrefixDelegations(prefixId, accountId)

List Prefix Delegations

List all delegations for a given account IP prefix.

### Example
```java
// Import classes:
import cloudflare.ApiClient;
import cloudflare.ApiException;
import cloudflare.Configuration;
import cloudflare.auth.*;
import cloudflare.models.*;
import cloudflare.sdk.IpAddressManagementPrefixDelegationApi;

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

    IpAddressManagementPrefixDelegationApi apiInstance = new IpAddressManagementPrefixDelegationApi(defaultClient);
    String prefixId = "prefixId_example"; // String | 
    String accountId = "accountId_example"; // String | 
    try {
      AddressingSchemasResponseCollection result = apiInstance.ipAddressManagementPrefixDelegationListPrefixDelegations(prefixId, accountId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling IpAddressManagementPrefixDelegationApi#ipAddressManagementPrefixDelegationListPrefixDelegations");
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

[**AddressingSchemasResponseCollection**](AddressingSchemasResponseCollection.md)

### Authorization

[api_key](../README.md#api_key), [api_email](../README.md#api_email)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | List Prefix Delegations response |  -  |
| **4XX** | List Prefix Delegations response failure |  -  |

