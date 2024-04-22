# ArgoTunnelApi

All URIs are relative to *https://api.cloudflare.com/client/v4*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**argoTunnelCleanUpArgoTunnelConnections**](ArgoTunnelApi.md#argoTunnelCleanUpArgoTunnelConnections) | **DELETE** /accounts/{account_id}/tunnels/{tunnel_id}/connections | Clean up Argo Tunnel connections |
| [**argoTunnelCreateAnArgoTunnel**](ArgoTunnelApi.md#argoTunnelCreateAnArgoTunnel) | **POST** /accounts/{account_id}/tunnels | Create an Argo Tunnel |
| [**argoTunnelDeleteAnArgoTunnel**](ArgoTunnelApi.md#argoTunnelDeleteAnArgoTunnel) | **DELETE** /accounts/{account_id}/tunnels/{tunnel_id} | Delete an Argo Tunnel |
| [**argoTunnelGetAnArgoTunnel**](ArgoTunnelApi.md#argoTunnelGetAnArgoTunnel) | **GET** /accounts/{account_id}/tunnels/{tunnel_id} | Get an Argo Tunnel |


<a id="argoTunnelCleanUpArgoTunnelConnections"></a>
# **argoTunnelCleanUpArgoTunnelConnections**
> TunnelEmptyResponse argoTunnelCleanUpArgoTunnelConnections(tunnelId, accountId, body)

Clean up Argo Tunnel connections

Removes connections that are in a disconnected or pending reconnect state. We recommend running this command after shutting down a tunnel.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.ArgoTunnelApi;

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

    ArgoTunnelApi apiInstance = new ArgoTunnelApi(defaultClient);
    String tunnelId = "tunnelId_example"; // String | 
    String accountId = "accountId_example"; // String | 
    Object body = null; // Object | 
    try {
      TunnelEmptyResponse result = apiInstance.argoTunnelCleanUpArgoTunnelConnections(tunnelId, accountId, body);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ArgoTunnelApi#argoTunnelCleanUpArgoTunnelConnections");
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
| **body** | **Object**|  | |

### Return type

[**TunnelEmptyResponse**](TunnelEmptyResponse.md)

### Authorization

[api_key](../README.md#api_key), [api_email](../README.md#api_email)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Clean up Argo Tunnel connections response |  -  |
| **4XX** | Clean up Argo Tunnel connections response failure |  -  |

<a id="argoTunnelCreateAnArgoTunnel"></a>
# **argoTunnelCreateAnArgoTunnel**
> TunnelLegacyTunnelResponseSingle argoTunnelCreateAnArgoTunnel(accountId, argoTunnelCreateAnArgoTunnelRequest)

Create an Argo Tunnel

Creates a new Argo Tunnel in an account.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.ArgoTunnelApi;

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

    ArgoTunnelApi apiInstance = new ArgoTunnelApi(defaultClient);
    String accountId = "accountId_example"; // String | 
    ArgoTunnelCreateAnArgoTunnelRequest argoTunnelCreateAnArgoTunnelRequest = new ArgoTunnelCreateAnArgoTunnelRequest(); // ArgoTunnelCreateAnArgoTunnelRequest | 
    try {
      TunnelLegacyTunnelResponseSingle result = apiInstance.argoTunnelCreateAnArgoTunnel(accountId, argoTunnelCreateAnArgoTunnelRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ArgoTunnelApi#argoTunnelCreateAnArgoTunnel");
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
| **argoTunnelCreateAnArgoTunnelRequest** | [**ArgoTunnelCreateAnArgoTunnelRequest**](ArgoTunnelCreateAnArgoTunnelRequest.md)|  | |

### Return type

[**TunnelLegacyTunnelResponseSingle**](TunnelLegacyTunnelResponseSingle.md)

### Authorization

[api_key](../README.md#api_key), [api_email](../README.md#api_email)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Create an Argo Tunnel response |  -  |
| **4XX** | Create an Argo Tunnel response failure |  -  |

<a id="argoTunnelDeleteAnArgoTunnel"></a>
# **argoTunnelDeleteAnArgoTunnel**
> TunnelLegacyTunnelResponseSingle argoTunnelDeleteAnArgoTunnel(tunnelId, accountId, body)

Delete an Argo Tunnel

Deletes an Argo Tunnel from an account.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.ArgoTunnelApi;

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

    ArgoTunnelApi apiInstance = new ArgoTunnelApi(defaultClient);
    String tunnelId = "tunnelId_example"; // String | 
    String accountId = "accountId_example"; // String | 
    Object body = null; // Object | 
    try {
      TunnelLegacyTunnelResponseSingle result = apiInstance.argoTunnelDeleteAnArgoTunnel(tunnelId, accountId, body);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ArgoTunnelApi#argoTunnelDeleteAnArgoTunnel");
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
| **body** | **Object**|  | |

### Return type

[**TunnelLegacyTunnelResponseSingle**](TunnelLegacyTunnelResponseSingle.md)

### Authorization

[api_key](../README.md#api_key), [api_email](../README.md#api_email)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Delete an Argo Tunnel response |  -  |
| **4XX** | Delete an Argo Tunnel response failure |  -  |

<a id="argoTunnelGetAnArgoTunnel"></a>
# **argoTunnelGetAnArgoTunnel**
> TunnelLegacyTunnelResponseSingle argoTunnelGetAnArgoTunnel(tunnelId, accountId)

Get an Argo Tunnel

Fetches a single Argo Tunnel.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.ArgoTunnelApi;

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

    ArgoTunnelApi apiInstance = new ArgoTunnelApi(defaultClient);
    String tunnelId = "tunnelId_example"; // String | 
    String accountId = "accountId_example"; // String | 
    try {
      TunnelLegacyTunnelResponseSingle result = apiInstance.argoTunnelGetAnArgoTunnel(tunnelId, accountId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ArgoTunnelApi#argoTunnelGetAnArgoTunnel");
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

[**TunnelLegacyTunnelResponseSingle**](TunnelLegacyTunnelResponseSingle.md)

### Authorization

[api_key](../README.md#api_key), [api_email](../README.md#api_email)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Get an Argo Tunnel response |  -  |
| **4XX** | Get an Argo Tunnel response failure |  -  |

