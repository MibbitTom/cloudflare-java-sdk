# CloudflareTunnelConfigurationApi

All URIs are relative to *https://api.cloudflare.com/client/v4*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**cloudflareTunnelConfigurationGetConfiguration**](CloudflareTunnelConfigurationApi.md#cloudflareTunnelConfigurationGetConfiguration) | **GET** /accounts/{account_id}/cfd_tunnel/{tunnel_id}/configurations | Get configuration |
| [**cloudflareTunnelConfigurationPutConfiguration**](CloudflareTunnelConfigurationApi.md#cloudflareTunnelConfigurationPutConfiguration) | **PUT** /accounts/{account_id}/cfd_tunnel/{tunnel_id}/configurations | Put configuration |


<a id="cloudflareTunnelConfigurationGetConfiguration"></a>
# **cloudflareTunnelConfigurationGetConfiguration**
> TunnelConfigResponseSingle cloudflareTunnelConfigurationGetConfiguration(tunnelId, accountId)

Get configuration

Gets the configuration for a remotely-managed tunnel

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.CloudflareTunnelConfigurationApi;

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

    CloudflareTunnelConfigurationApi apiInstance = new CloudflareTunnelConfigurationApi(defaultClient);
    String tunnelId = "tunnelId_example"; // String | 
    String accountId = "accountId_example"; // String | 
    try {
      TunnelConfigResponseSingle result = apiInstance.cloudflareTunnelConfigurationGetConfiguration(tunnelId, accountId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling CloudflareTunnelConfigurationApi#cloudflareTunnelConfigurationGetConfiguration");
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
| **tunnelId** | **String**|  | |
| **accountId** | **String**|  | |

### Return type

[**TunnelConfigResponseSingle**](TunnelConfigResponseSingle.md)

### Authorization

[api_key](../README.md#api_key), [api_email](../README.md#api_email)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Get configuration response |  -  |
| **4XX** | Get configuration response failure |  -  |

<a id="cloudflareTunnelConfigurationPutConfiguration"></a>
# **cloudflareTunnelConfigurationPutConfiguration**
> TunnelConfigResponseSingle cloudflareTunnelConfigurationPutConfiguration(tunnelId, accountId, cloudflareTunnelConfigurationPutConfigurationRequest)

Put configuration

Adds or updates the configuration for a remotely-managed tunnel.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.CloudflareTunnelConfigurationApi;

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

    CloudflareTunnelConfigurationApi apiInstance = new CloudflareTunnelConfigurationApi(defaultClient);
    String tunnelId = "tunnelId_example"; // String | 
    String accountId = "accountId_example"; // String | 
    CloudflareTunnelConfigurationPutConfigurationRequest cloudflareTunnelConfigurationPutConfigurationRequest = new CloudflareTunnelConfigurationPutConfigurationRequest(); // CloudflareTunnelConfigurationPutConfigurationRequest | 
    try {
      TunnelConfigResponseSingle result = apiInstance.cloudflareTunnelConfigurationPutConfiguration(tunnelId, accountId, cloudflareTunnelConfigurationPutConfigurationRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling CloudflareTunnelConfigurationApi#cloudflareTunnelConfigurationPutConfiguration");
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
| **tunnelId** | **String**|  | |
| **accountId** | **String**|  | |
| **cloudflareTunnelConfigurationPutConfigurationRequest** | [**CloudflareTunnelConfigurationPutConfigurationRequest**](CloudflareTunnelConfigurationPutConfigurationRequest.md)|  | |

### Return type

[**TunnelConfigResponseSingle**](TunnelConfigResponseSingle.md)

### Authorization

[api_key](../README.md#api_key), [api_email](../README.md#api_email)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Put configuration response |  -  |
| **4XX** | Put configuration response failure |  -  |

