# DeviceManagedNetworksApi

All URIs are relative to *https://api.cloudflare.com/client/v4*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**deviceManagedNetworksCreateDeviceManagedNetwork**](DeviceManagedNetworksApi.md#deviceManagedNetworksCreateDeviceManagedNetwork) | **POST** /accounts/{account_id}/devices/networks | Create a device managed network |
| [**deviceManagedNetworksDeleteDeviceManagedNetwork**](DeviceManagedNetworksApi.md#deviceManagedNetworksDeleteDeviceManagedNetwork) | **DELETE** /accounts/{account_id}/devices/networks/{network_id} | Delete a device managed network |
| [**deviceManagedNetworksDeviceManagedNetworkDetails**](DeviceManagedNetworksApi.md#deviceManagedNetworksDeviceManagedNetworkDetails) | **GET** /accounts/{account_id}/devices/networks/{network_id} | Get device managed network details |
| [**deviceManagedNetworksListDeviceManagedNetworks**](DeviceManagedNetworksApi.md#deviceManagedNetworksListDeviceManagedNetworks) | **GET** /accounts/{account_id}/devices/networks | List your device managed networks |
| [**deviceManagedNetworksUpdateDeviceManagedNetwork**](DeviceManagedNetworksApi.md#deviceManagedNetworksUpdateDeviceManagedNetwork) | **PUT** /accounts/{account_id}/devices/networks/{network_id} | Update a device managed network |


<a id="deviceManagedNetworksCreateDeviceManagedNetwork"></a>
# **deviceManagedNetworksCreateDeviceManagedNetwork**
> TeamsDevicesComponentsSchemasSingleResponse deviceManagedNetworksCreateDeviceManagedNetwork(accountId, deviceManagedNetworksCreateDeviceManagedNetworkRequest)

Create a device managed network

Creates a new device managed network.

### Example
```java
// Import classes:
import cloudflare.ApiClient;
import cloudflare.ApiException;
import cloudflare.Configuration;
import cloudflare.auth.*;
import cloudflare.models.*;
import cloudflare.sdk.DeviceManagedNetworksApi;

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

    DeviceManagedNetworksApi apiInstance = new DeviceManagedNetworksApi(defaultClient);
    Object accountId = null; // Object | 
    DeviceManagedNetworksCreateDeviceManagedNetworkRequest deviceManagedNetworksCreateDeviceManagedNetworkRequest = new DeviceManagedNetworksCreateDeviceManagedNetworkRequest(); // DeviceManagedNetworksCreateDeviceManagedNetworkRequest | 
    try {
      TeamsDevicesComponentsSchemasSingleResponse result = apiInstance.deviceManagedNetworksCreateDeviceManagedNetwork(accountId, deviceManagedNetworksCreateDeviceManagedNetworkRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling DeviceManagedNetworksApi#deviceManagedNetworksCreateDeviceManagedNetwork");
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
| **accountId** | [**Object**](.md)|  | |
| **deviceManagedNetworksCreateDeviceManagedNetworkRequest** | [**DeviceManagedNetworksCreateDeviceManagedNetworkRequest**](DeviceManagedNetworksCreateDeviceManagedNetworkRequest.md)|  | |

### Return type

[**TeamsDevicesComponentsSchemasSingleResponse**](TeamsDevicesComponentsSchemasSingleResponse.md)

### Authorization

[api_key](../README.md#api_key), [api_email](../README.md#api_email)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Create a device managed networks response |  -  |
| **4XX** | Create a device managed networks response failure |  -  |

<a id="deviceManagedNetworksDeleteDeviceManagedNetwork"></a>
# **deviceManagedNetworksDeleteDeviceManagedNetwork**
> TeamsDevicesComponentsSchemasResponseCollection deviceManagedNetworksDeleteDeviceManagedNetwork(networkId, accountId)

Delete a device managed network

Deletes a device managed network and fetches a list of the remaining device managed networks for an account.

### Example
```java
// Import classes:
import cloudflare.ApiClient;
import cloudflare.ApiException;
import cloudflare.Configuration;
import cloudflare.auth.*;
import cloudflare.models.*;
import cloudflare.sdk.DeviceManagedNetworksApi;

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

    DeviceManagedNetworksApi apiInstance = new DeviceManagedNetworksApi(defaultClient);
    String networkId = "networkId_example"; // String | 
    Object accountId = null; // Object | 
    try {
      TeamsDevicesComponentsSchemasResponseCollection result = apiInstance.deviceManagedNetworksDeleteDeviceManagedNetwork(networkId, accountId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling DeviceManagedNetworksApi#deviceManagedNetworksDeleteDeviceManagedNetwork");
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
| **networkId** | **String**|  | |
| **accountId** | [**Object**](.md)|  | |

### Return type

[**TeamsDevicesComponentsSchemasResponseCollection**](TeamsDevicesComponentsSchemasResponseCollection.md)

### Authorization

[api_key](../README.md#api_key), [api_email](../README.md#api_email)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Delete a device managed network response |  -  |
| **4XX** | Delete a device managed network response failure |  -  |

<a id="deviceManagedNetworksDeviceManagedNetworkDetails"></a>
# **deviceManagedNetworksDeviceManagedNetworkDetails**
> TeamsDevicesComponentsSchemasSingleResponse deviceManagedNetworksDeviceManagedNetworkDetails(networkId, accountId)

Get device managed network details

Fetches details for a single managed network.

### Example
```java
// Import classes:
import cloudflare.ApiClient;
import cloudflare.ApiException;
import cloudflare.Configuration;
import cloudflare.auth.*;
import cloudflare.models.*;
import cloudflare.sdk.DeviceManagedNetworksApi;

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

    DeviceManagedNetworksApi apiInstance = new DeviceManagedNetworksApi(defaultClient);
    String networkId = "networkId_example"; // String | 
    Object accountId = null; // Object | 
    try {
      TeamsDevicesComponentsSchemasSingleResponse result = apiInstance.deviceManagedNetworksDeviceManagedNetworkDetails(networkId, accountId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling DeviceManagedNetworksApi#deviceManagedNetworksDeviceManagedNetworkDetails");
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
| **networkId** | **String**|  | |
| **accountId** | [**Object**](.md)|  | |

### Return type

[**TeamsDevicesComponentsSchemasSingleResponse**](TeamsDevicesComponentsSchemasSingleResponse.md)

### Authorization

[api_key](../README.md#api_key), [api_email](../README.md#api_email)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Get device managed network details response |  -  |
| **4XX** | Get device managed network details response failure |  -  |

<a id="deviceManagedNetworksListDeviceManagedNetworks"></a>
# **deviceManagedNetworksListDeviceManagedNetworks**
> TeamsDevicesComponentsSchemasResponseCollection deviceManagedNetworksListDeviceManagedNetworks(accountId)

List your device managed networks

Fetches a list of managed networks for an account.

### Example
```java
// Import classes:
import cloudflare.ApiClient;
import cloudflare.ApiException;
import cloudflare.Configuration;
import cloudflare.auth.*;
import cloudflare.models.*;
import cloudflare.sdk.DeviceManagedNetworksApi;

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

    DeviceManagedNetworksApi apiInstance = new DeviceManagedNetworksApi(defaultClient);
    Object accountId = null; // Object | 
    try {
      TeamsDevicesComponentsSchemasResponseCollection result = apiInstance.deviceManagedNetworksListDeviceManagedNetworks(accountId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling DeviceManagedNetworksApi#deviceManagedNetworksListDeviceManagedNetworks");
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
| **accountId** | [**Object**](.md)|  | |

### Return type

[**TeamsDevicesComponentsSchemasResponseCollection**](TeamsDevicesComponentsSchemasResponseCollection.md)

### Authorization

[api_key](../README.md#api_key), [api_email](../README.md#api_email)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | List your device managed networks response |  -  |
| **4XX** | List your device managed networks response failure |  -  |

<a id="deviceManagedNetworksUpdateDeviceManagedNetwork"></a>
# **deviceManagedNetworksUpdateDeviceManagedNetwork**
> TeamsDevicesComponentsSchemasSingleResponse deviceManagedNetworksUpdateDeviceManagedNetwork(networkId, accountId, deviceManagedNetworksUpdateDeviceManagedNetworkRequest)

Update a device managed network

Updates a configured device managed network.

### Example
```java
// Import classes:
import cloudflare.ApiClient;
import cloudflare.ApiException;
import cloudflare.Configuration;
import cloudflare.auth.*;
import cloudflare.models.*;
import cloudflare.sdk.DeviceManagedNetworksApi;

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

    DeviceManagedNetworksApi apiInstance = new DeviceManagedNetworksApi(defaultClient);
    String networkId = "networkId_example"; // String | 
    Object accountId = null; // Object | 
    DeviceManagedNetworksUpdateDeviceManagedNetworkRequest deviceManagedNetworksUpdateDeviceManagedNetworkRequest = new DeviceManagedNetworksUpdateDeviceManagedNetworkRequest(); // DeviceManagedNetworksUpdateDeviceManagedNetworkRequest | 
    try {
      TeamsDevicesComponentsSchemasSingleResponse result = apiInstance.deviceManagedNetworksUpdateDeviceManagedNetwork(networkId, accountId, deviceManagedNetworksUpdateDeviceManagedNetworkRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling DeviceManagedNetworksApi#deviceManagedNetworksUpdateDeviceManagedNetwork");
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
| **networkId** | **String**|  | |
| **accountId** | [**Object**](.md)|  | |
| **deviceManagedNetworksUpdateDeviceManagedNetworkRequest** | [**DeviceManagedNetworksUpdateDeviceManagedNetworkRequest**](DeviceManagedNetworksUpdateDeviceManagedNetworkRequest.md)|  | |

### Return type

[**TeamsDevicesComponentsSchemasSingleResponse**](TeamsDevicesComponentsSchemasSingleResponse.md)

### Authorization

[api_key](../README.md#api_key), [api_email](../README.md#api_email)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Update a device managed network response |  -  |
| **4XX** | Update a device managed network response failure |  -  |

