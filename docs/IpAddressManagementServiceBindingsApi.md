# IpAddressManagementServiceBindingsApi

All URIs are relative to *https://api.cloudflare.com/client/v4*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**ipAddressManagementServiceBindingsCreateServiceBinding**](IpAddressManagementServiceBindingsApi.md#ipAddressManagementServiceBindingsCreateServiceBinding) | **POST** /accounts/{account_id}/addressing/prefixes/{prefix_id}/bindings | Create Service Binding |
| [**ipAddressManagementServiceBindingsDeleteServiceBinding**](IpAddressManagementServiceBindingsApi.md#ipAddressManagementServiceBindingsDeleteServiceBinding) | **DELETE** /accounts/{account_id}/addressing/prefixes/{prefix_id}/bindings/{binding_id} | Delete Service Binding |
| [**ipAddressManagementServiceBindingsGetServiceBinding**](IpAddressManagementServiceBindingsApi.md#ipAddressManagementServiceBindingsGetServiceBinding) | **GET** /accounts/{account_id}/addressing/prefixes/{prefix_id}/bindings/{binding_id} | Get Service Binding |
| [**ipAddressManagementServiceBindingsListServiceBindings**](IpAddressManagementServiceBindingsApi.md#ipAddressManagementServiceBindingsListServiceBindings) | **GET** /accounts/{account_id}/addressing/prefixes/{prefix_id}/bindings | List Service Bindings |
| [**ipAddressManagementServiceBindingsListServices**](IpAddressManagementServiceBindingsApi.md#ipAddressManagementServiceBindingsListServices) | **GET** /accounts/{account_id}/addressing/services | List Services |


<a id="ipAddressManagementServiceBindingsCreateServiceBinding"></a>
# **ipAddressManagementServiceBindingsCreateServiceBinding**
> IpAddressManagementServiceBindingsCreateServiceBinding201Response ipAddressManagementServiceBindingsCreateServiceBinding(accountId, prefixId, addressingCreateBindingRequest)

Create Service Binding

Creates a new Service Binding, routing traffic to IPs within the given CIDR to a service running on Cloudflare&#39;s network. **Note:** This API may only be used on prefixes currently configured with a Magic Transit service binding, and only allows creating service bindings for the Cloudflare CDN or Cloudflare Spectrum. 

### Example
```java
// Import classes:
import cloudflare.ApiClient;
import cloudflare.ApiException;
import cloudflare.Configuration;
import cloudflare.auth.*;
import cloudflare.models.*;
import cloudflare.sdk.IpAddressManagementServiceBindingsApi;

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

    IpAddressManagementServiceBindingsApi apiInstance = new IpAddressManagementServiceBindingsApi(defaultClient);
    String accountId = "accountId_example"; // String | 
    String prefixId = "prefixId_example"; // String | 
    AddressingCreateBindingRequest addressingCreateBindingRequest = new AddressingCreateBindingRequest(); // AddressingCreateBindingRequest | 
    try {
      IpAddressManagementServiceBindingsCreateServiceBinding201Response result = apiInstance.ipAddressManagementServiceBindingsCreateServiceBinding(accountId, prefixId, addressingCreateBindingRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling IpAddressManagementServiceBindingsApi#ipAddressManagementServiceBindingsCreateServiceBinding");
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
| **addressingCreateBindingRequest** | [**AddressingCreateBindingRequest**](AddressingCreateBindingRequest.md)|  | [optional] |

### Return type

[**IpAddressManagementServiceBindingsCreateServiceBinding201Response**](IpAddressManagementServiceBindingsCreateServiceBinding201Response.md)

### Authorization

[api_key](../README.md#api_key), [api_email](../README.md#api_email)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **201** | The created Service Binding |  -  |
| **4XX** | Create Service Binding response failure |  -  |

<a id="ipAddressManagementServiceBindingsDeleteServiceBinding"></a>
# **ipAddressManagementServiceBindingsDeleteServiceBinding**
> AddressingApiResponseCommon ipAddressManagementServiceBindingsDeleteServiceBinding(accountId, prefixId, bindingId)

Delete Service Binding

Delete a Service Binding

### Example
```java
// Import classes:
import cloudflare.ApiClient;
import cloudflare.ApiException;
import cloudflare.Configuration;
import cloudflare.auth.*;
import cloudflare.models.*;
import cloudflare.sdk.IpAddressManagementServiceBindingsApi;

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

    IpAddressManagementServiceBindingsApi apiInstance = new IpAddressManagementServiceBindingsApi(defaultClient);
    String accountId = "accountId_example"; // String | 
    String prefixId = "prefixId_example"; // String | 
    String bindingId = "bindingId_example"; // String | 
    try {
      AddressingApiResponseCommon result = apiInstance.ipAddressManagementServiceBindingsDeleteServiceBinding(accountId, prefixId, bindingId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling IpAddressManagementServiceBindingsApi#ipAddressManagementServiceBindingsDeleteServiceBinding");
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
| **bindingId** | **String**|  | |

### Return type

[**AddressingApiResponseCommon**](AddressingApiResponseCommon.md)

### Authorization

[api_key](../README.md#api_key), [api_email](../README.md#api_email)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Service Binding deleted |  -  |
| **4XX** | Delete Service Binding response failure |  -  |

<a id="ipAddressManagementServiceBindingsGetServiceBinding"></a>
# **ipAddressManagementServiceBindingsGetServiceBinding**
> IpAddressManagementServiceBindingsCreateServiceBinding201Response ipAddressManagementServiceBindingsGetServiceBinding(accountId, prefixId, bindingId)

Get Service Binding

Fetch a single Service Binding

### Example
```java
// Import classes:
import cloudflare.ApiClient;
import cloudflare.ApiException;
import cloudflare.Configuration;
import cloudflare.auth.*;
import cloudflare.models.*;
import cloudflare.sdk.IpAddressManagementServiceBindingsApi;

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

    IpAddressManagementServiceBindingsApi apiInstance = new IpAddressManagementServiceBindingsApi(defaultClient);
    String accountId = "accountId_example"; // String | 
    String prefixId = "prefixId_example"; // String | 
    String bindingId = "bindingId_example"; // String | 
    try {
      IpAddressManagementServiceBindingsCreateServiceBinding201Response result = apiInstance.ipAddressManagementServiceBindingsGetServiceBinding(accountId, prefixId, bindingId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling IpAddressManagementServiceBindingsApi#ipAddressManagementServiceBindingsGetServiceBinding");
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
| **bindingId** | **String**|  | |

### Return type

[**IpAddressManagementServiceBindingsCreateServiceBinding201Response**](IpAddressManagementServiceBindingsCreateServiceBinding201Response.md)

### Authorization

[api_key](../README.md#api_key), [api_email](../README.md#api_email)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | The Service Binding with the requested ID |  -  |
| **4XX** | Get Service Binding response failure |  -  |

<a id="ipAddressManagementServiceBindingsListServiceBindings"></a>
# **ipAddressManagementServiceBindingsListServiceBindings**
> IpAddressManagementServiceBindingsListServiceBindings200Response ipAddressManagementServiceBindingsListServiceBindings(accountId, prefixId)

List Service Bindings

List the Cloudflare services this prefix is currently bound to. Traffic sent to an address within an IP prefix will be routed to the Cloudflare service of the most-specific Service Binding matching the address. **Example:** binding &#x60;192.0.2.0/24&#x60; to Cloudflare Magic Transit and &#x60;192.0.2.1/32&#x60; to the Cloudflare CDN would route traffic for &#x60;192.0.2.1&#x60; to the CDN, and traffic for all other IPs in the prefix to Cloudflare Magic Transit. 

### Example
```java
// Import classes:
import cloudflare.ApiClient;
import cloudflare.ApiException;
import cloudflare.Configuration;
import cloudflare.auth.*;
import cloudflare.models.*;
import cloudflare.sdk.IpAddressManagementServiceBindingsApi;

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

    IpAddressManagementServiceBindingsApi apiInstance = new IpAddressManagementServiceBindingsApi(defaultClient);
    String accountId = "accountId_example"; // String | 
    String prefixId = "prefixId_example"; // String | 
    try {
      IpAddressManagementServiceBindingsListServiceBindings200Response result = apiInstance.ipAddressManagementServiceBindingsListServiceBindings(accountId, prefixId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling IpAddressManagementServiceBindingsApi#ipAddressManagementServiceBindingsListServiceBindings");
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

[**IpAddressManagementServiceBindingsListServiceBindings200Response**](IpAddressManagementServiceBindingsListServiceBindings200Response.md)

### Authorization

[api_key](../README.md#api_key), [api_email](../README.md#api_email)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Service Bindings attached to the Prefix |  -  |
| **4XX** | List Service Bindings response failure |  -  |

<a id="ipAddressManagementServiceBindingsListServices"></a>
# **ipAddressManagementServiceBindingsListServices**
> IpAddressManagementServiceBindingsListServices200Response ipAddressManagementServiceBindingsListServices(accountId)

List Services

Bring-Your-Own IP (BYOIP) prefixes onboarded to Cloudflare must be bound to a service running on the Cloudflare network to enable a Cloudflare product on the IP addresses. This endpoint can be used as a reference of available services on the Cloudflare network, and their service IDs. 

### Example
```java
// Import classes:
import cloudflare.ApiClient;
import cloudflare.ApiException;
import cloudflare.Configuration;
import cloudflare.auth.*;
import cloudflare.models.*;
import cloudflare.sdk.IpAddressManagementServiceBindingsApi;

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

    IpAddressManagementServiceBindingsApi apiInstance = new IpAddressManagementServiceBindingsApi(defaultClient);
    String accountId = "accountId_example"; // String | 
    try {
      IpAddressManagementServiceBindingsListServices200Response result = apiInstance.ipAddressManagementServiceBindingsListServices(accountId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling IpAddressManagementServiceBindingsApi#ipAddressManagementServiceBindingsListServices");
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

[**IpAddressManagementServiceBindingsListServices200Response**](IpAddressManagementServiceBindingsListServices200Response.md)

### Authorization

[api_key](../README.md#api_key), [api_email](../README.md#api_email)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Service names and IDs |  -  |
| **4XX** | List Services response failure |  -  |

