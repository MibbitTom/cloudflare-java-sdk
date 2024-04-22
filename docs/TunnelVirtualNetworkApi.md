# TunnelVirtualNetworkApi

All URIs are relative to *https://api.cloudflare.com/client/v4*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**tunnelVirtualNetworkCreateAVirtualNetwork**](TunnelVirtualNetworkApi.md#tunnelVirtualNetworkCreateAVirtualNetwork) | **POST** /accounts/{account_id}/teamnet/virtual_networks | Create a virtual network |
| [**tunnelVirtualNetworkDeleteAVirtualNetwork**](TunnelVirtualNetworkApi.md#tunnelVirtualNetworkDeleteAVirtualNetwork) | **DELETE** /accounts/{account_id}/teamnet/virtual_networks/{virtual_network_id} | Delete a virtual network |
| [**tunnelVirtualNetworkListVirtualNetworks**](TunnelVirtualNetworkApi.md#tunnelVirtualNetworkListVirtualNetworks) | **GET** /accounts/{account_id}/teamnet/virtual_networks | List virtual networks |
| [**tunnelVirtualNetworkUpdateAVirtualNetwork**](TunnelVirtualNetworkApi.md#tunnelVirtualNetworkUpdateAVirtualNetwork) | **PATCH** /accounts/{account_id}/teamnet/virtual_networks/{virtual_network_id} | Update a virtual network |


<a id="tunnelVirtualNetworkCreateAVirtualNetwork"></a>
# **tunnelVirtualNetworkCreateAVirtualNetwork**
> TunnelVnetResponseSingle tunnelVirtualNetworkCreateAVirtualNetwork(accountId, tunnelVirtualNetworkCreateAVirtualNetworkRequest)

Create a virtual network

Adds a new virtual network to an account.

### Example
```java
// Import classes:
import cloudflare.ApiClient;
import cloudflare.ApiException;
import cloudflare.Configuration;
import cloudflare.auth.*;
import cloudflare.models.*;
import cloudflare.sdk.TunnelVirtualNetworkApi;

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

    TunnelVirtualNetworkApi apiInstance = new TunnelVirtualNetworkApi(defaultClient);
    String accountId = "accountId_example"; // String | 
    TunnelVirtualNetworkCreateAVirtualNetworkRequest tunnelVirtualNetworkCreateAVirtualNetworkRequest = new TunnelVirtualNetworkCreateAVirtualNetworkRequest(); // TunnelVirtualNetworkCreateAVirtualNetworkRequest | 
    try {
      TunnelVnetResponseSingle result = apiInstance.tunnelVirtualNetworkCreateAVirtualNetwork(accountId, tunnelVirtualNetworkCreateAVirtualNetworkRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling TunnelVirtualNetworkApi#tunnelVirtualNetworkCreateAVirtualNetwork");
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
| **tunnelVirtualNetworkCreateAVirtualNetworkRequest** | [**TunnelVirtualNetworkCreateAVirtualNetworkRequest**](TunnelVirtualNetworkCreateAVirtualNetworkRequest.md)|  | |

### Return type

[**TunnelVnetResponseSingle**](TunnelVnetResponseSingle.md)

### Authorization

[api_key](../README.md#api_key), [api_email](../README.md#api_email)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Create a virtual network response |  -  |
| **4XX** | Create a virtual network response failure |  -  |

<a id="tunnelVirtualNetworkDeleteAVirtualNetwork"></a>
# **tunnelVirtualNetworkDeleteAVirtualNetwork**
> TunnelVnetResponseSingle tunnelVirtualNetworkDeleteAVirtualNetwork(virtualNetworkId, accountId)

Delete a virtual network

Deletes an existing virtual network.

### Example
```java
// Import classes:
import cloudflare.ApiClient;
import cloudflare.ApiException;
import cloudflare.Configuration;
import cloudflare.auth.*;
import cloudflare.models.*;
import cloudflare.sdk.TunnelVirtualNetworkApi;

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

    TunnelVirtualNetworkApi apiInstance = new TunnelVirtualNetworkApi(defaultClient);
    String virtualNetworkId = "virtualNetworkId_example"; // String | 
    String accountId = "accountId_example"; // String | 
    try {
      TunnelVnetResponseSingle result = apiInstance.tunnelVirtualNetworkDeleteAVirtualNetwork(virtualNetworkId, accountId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling TunnelVirtualNetworkApi#tunnelVirtualNetworkDeleteAVirtualNetwork");
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
| **virtualNetworkId** | **String**|  | |
| **accountId** | **String**|  | |

### Return type

[**TunnelVnetResponseSingle**](TunnelVnetResponseSingle.md)

### Authorization

[api_key](../README.md#api_key), [api_email](../README.md#api_email)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Delete a virtual network response |  -  |
| **4XX** | Delete a virtual network response failure |  -  |

<a id="tunnelVirtualNetworkListVirtualNetworks"></a>
# **tunnelVirtualNetworkListVirtualNetworks**
> TunnelVnetResponseCollection tunnelVirtualNetworkListVirtualNetworks(accountId, name, isDefault, isDeleted, vnetName, vnetId)

List virtual networks

Lists and filters virtual networks in an account.

### Example
```java
// Import classes:
import cloudflare.ApiClient;
import cloudflare.ApiException;
import cloudflare.Configuration;
import cloudflare.auth.*;
import cloudflare.models.*;
import cloudflare.sdk.TunnelVirtualNetworkApi;

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

    TunnelVirtualNetworkApi apiInstance = new TunnelVirtualNetworkApi(defaultClient);
    String accountId = "accountId_example"; // String | 
    String name = "name_example"; // String | 
    Object isDefault = null; // Object | 
    Object isDeleted = null; // Object | 
    String vnetName = "vnetName_example"; // String | 
    String vnetId = "f70ff985-a4ef-4643-bbbc-4a0ed4fc8415"; // String | 
    try {
      TunnelVnetResponseCollection result = apiInstance.tunnelVirtualNetworkListVirtualNetworks(accountId, name, isDefault, isDeleted, vnetName, vnetId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling TunnelVirtualNetworkApi#tunnelVirtualNetworkListVirtualNetworks");
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
| **name** | **String**|  | [optional] |
| **isDefault** | [**Object**](.md)|  | [optional] |
| **isDeleted** | [**Object**](.md)|  | [optional] |
| **vnetName** | **String**|  | [optional] |
| **vnetId** | **String**|  | [optional] |

### Return type

[**TunnelVnetResponseCollection**](TunnelVnetResponseCollection.md)

### Authorization

[api_key](../README.md#api_key), [api_email](../README.md#api_email)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | List virtual networks response |  -  |
| **4XX** | List virtual networks response failure |  -  |

<a id="tunnelVirtualNetworkUpdateAVirtualNetwork"></a>
# **tunnelVirtualNetworkUpdateAVirtualNetwork**
> TunnelVnetResponseSingle tunnelVirtualNetworkUpdateAVirtualNetwork(virtualNetworkId, accountId, tunnelVirtualNetworkUpdateAVirtualNetworkRequest)

Update a virtual network

Updates an existing virtual network.

### Example
```java
// Import classes:
import cloudflare.ApiClient;
import cloudflare.ApiException;
import cloudflare.Configuration;
import cloudflare.auth.*;
import cloudflare.models.*;
import cloudflare.sdk.TunnelVirtualNetworkApi;

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

    TunnelVirtualNetworkApi apiInstance = new TunnelVirtualNetworkApi(defaultClient);
    String virtualNetworkId = "virtualNetworkId_example"; // String | 
    String accountId = "accountId_example"; // String | 
    TunnelVirtualNetworkUpdateAVirtualNetworkRequest tunnelVirtualNetworkUpdateAVirtualNetworkRequest = new TunnelVirtualNetworkUpdateAVirtualNetworkRequest(); // TunnelVirtualNetworkUpdateAVirtualNetworkRequest | 
    try {
      TunnelVnetResponseSingle result = apiInstance.tunnelVirtualNetworkUpdateAVirtualNetwork(virtualNetworkId, accountId, tunnelVirtualNetworkUpdateAVirtualNetworkRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling TunnelVirtualNetworkApi#tunnelVirtualNetworkUpdateAVirtualNetwork");
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
| **virtualNetworkId** | **String**|  | |
| **accountId** | **String**|  | |
| **tunnelVirtualNetworkUpdateAVirtualNetworkRequest** | [**TunnelVirtualNetworkUpdateAVirtualNetworkRequest**](TunnelVirtualNetworkUpdateAVirtualNetworkRequest.md)|  | |

### Return type

[**TunnelVnetResponseSingle**](TunnelVnetResponseSingle.md)

### Authorization

[api_key](../README.md#api_key), [api_email](../README.md#api_email)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Update a virtual network response |  -  |
| **4XX** | Update a virtual network response failure |  -  |

