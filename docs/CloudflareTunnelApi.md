# CloudflareTunnelApi

All URIs are relative to *https://api.cloudflare.com/client/v4*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**cloudflareTunnelCleanUpCloudflareTunnelConnections**](CloudflareTunnelApi.md#cloudflareTunnelCleanUpCloudflareTunnelConnections) | **DELETE** /accounts/{account_id}/cfd_tunnel/{tunnel_id}/connections | Clean up Cloudflare Tunnel connections |
| [**cloudflareTunnelCreateACloudflareTunnel**](CloudflareTunnelApi.md#cloudflareTunnelCreateACloudflareTunnel) | **POST** /accounts/{account_id}/cfd_tunnel | Create a Cloudflare Tunnel |
| [**cloudflareTunnelCreateAWarpConnectorTunnel**](CloudflareTunnelApi.md#cloudflareTunnelCreateAWarpConnectorTunnel) | **POST** /accounts/{account_id}/warp_connector | Create a Warp Connector Tunnel |
| [**cloudflareTunnelDeleteACloudflareTunnel**](CloudflareTunnelApi.md#cloudflareTunnelDeleteACloudflareTunnel) | **DELETE** /accounts/{account_id}/cfd_tunnel/{tunnel_id} | Delete a Cloudflare Tunnel |
| [**cloudflareTunnelDeleteAWarpConnectorTunnel**](CloudflareTunnelApi.md#cloudflareTunnelDeleteAWarpConnectorTunnel) | **DELETE** /accounts/{account_id}/warp_connector/{tunnel_id} | Delete a Warp Connector Tunnel |
| [**cloudflareTunnelGetACloudflareTunnel**](CloudflareTunnelApi.md#cloudflareTunnelGetACloudflareTunnel) | **GET** /accounts/{account_id}/cfd_tunnel/{tunnel_id} | Get a Cloudflare Tunnel |
| [**cloudflareTunnelGetACloudflareTunnelManagementToken**](CloudflareTunnelApi.md#cloudflareTunnelGetACloudflareTunnelManagementToken) | **POST** /accounts/{account_id}/cfd_tunnel/{tunnel_id}/management | Get a Cloudflare Tunnel management token |
| [**cloudflareTunnelGetACloudflareTunnelToken**](CloudflareTunnelApi.md#cloudflareTunnelGetACloudflareTunnelToken) | **GET** /accounts/{account_id}/cfd_tunnel/{tunnel_id}/token | Get a Cloudflare Tunnel token |
| [**cloudflareTunnelGetAWarpConnectorTunnel**](CloudflareTunnelApi.md#cloudflareTunnelGetAWarpConnectorTunnel) | **GET** /accounts/{account_id}/warp_connector/{tunnel_id} | Get a Warp Connector Tunnel |
| [**cloudflareTunnelGetAWarpConnectorTunnelToken**](CloudflareTunnelApi.md#cloudflareTunnelGetAWarpConnectorTunnelToken) | **GET** /accounts/{account_id}/warp_connector/{tunnel_id}/token | Get a Warp Connector Tunnel token |
| [**cloudflareTunnelGetCloudflareTunnelConnector**](CloudflareTunnelApi.md#cloudflareTunnelGetCloudflareTunnelConnector) | **GET** /accounts/{account_id}/cfd_tunnel/{tunnel_id}/connectors/{connector_id} | Get Cloudflare Tunnel connector |
| [**cloudflareTunnelListAllTunnels**](CloudflareTunnelApi.md#cloudflareTunnelListAllTunnels) | **GET** /accounts/{account_id}/tunnels | List All Tunnels |
| [**cloudflareTunnelListCloudflareTunnelConnections**](CloudflareTunnelApi.md#cloudflareTunnelListCloudflareTunnelConnections) | **GET** /accounts/{account_id}/cfd_tunnel/{tunnel_id}/connections | List Cloudflare Tunnel connections |
| [**cloudflareTunnelListCloudflareTunnels**](CloudflareTunnelApi.md#cloudflareTunnelListCloudflareTunnels) | **GET** /accounts/{account_id}/cfd_tunnel | List Cloudflare Tunnels |
| [**cloudflareTunnelListWarpConnectorTunnels**](CloudflareTunnelApi.md#cloudflareTunnelListWarpConnectorTunnels) | **GET** /accounts/{account_id}/warp_connector | List Warp Connector Tunnels |
| [**cloudflareTunnelUpdateACloudflareTunnel**](CloudflareTunnelApi.md#cloudflareTunnelUpdateACloudflareTunnel) | **PATCH** /accounts/{account_id}/cfd_tunnel/{tunnel_id} | Update a Cloudflare Tunnel |
| [**cloudflareTunnelUpdateAWarpConnectorTunnel**](CloudflareTunnelApi.md#cloudflareTunnelUpdateAWarpConnectorTunnel) | **PATCH** /accounts/{account_id}/warp_connector/{tunnel_id} | Update a Warp Connector Tunnel |


<a id="cloudflareTunnelCleanUpCloudflareTunnelConnections"></a>
# **cloudflareTunnelCleanUpCloudflareTunnelConnections**
> TunnelEmptyResponse cloudflareTunnelCleanUpCloudflareTunnelConnections(accountId, tunnelId, body, clientId)

Clean up Cloudflare Tunnel connections

Removes a connection (aka Cloudflare Tunnel Connector) from a Cloudflare Tunnel independently of its current state. If no connector id (client_id) is provided all connectors will be removed. We recommend running this command after rotating tokens.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.CloudflareTunnelApi;

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

    CloudflareTunnelApi apiInstance = new CloudflareTunnelApi(defaultClient);
    String accountId = "accountId_example"; // String | 
    String tunnelId = "tunnelId_example"; // String | 
    Object body = null; // Object | 
    String clientId = "clientId_example"; // String | 
    try {
      TunnelEmptyResponse result = apiInstance.cloudflareTunnelCleanUpCloudflareTunnelConnections(accountId, tunnelId, body, clientId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling CloudflareTunnelApi#cloudflareTunnelCleanUpCloudflareTunnelConnections");
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
| **tunnelId** | **String**|  | |
| **body** | **Object**|  | |
| **clientId** | **String**|  | [optional] |

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
| **200** | Clean up Cloudflare Tunnel connections response |  -  |
| **4XX** | Clean up Cloudflare Tunnel connections response failure |  -  |

<a id="cloudflareTunnelCreateACloudflareTunnel"></a>
# **cloudflareTunnelCreateACloudflareTunnel**
> TunnelTunnelResponseSingle cloudflareTunnelCreateACloudflareTunnel(accountId, cloudflareTunnelCreateACloudflareTunnelRequest)

Create a Cloudflare Tunnel

Creates a new Cloudflare Tunnel in an account.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.CloudflareTunnelApi;

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

    CloudflareTunnelApi apiInstance = new CloudflareTunnelApi(defaultClient);
    String accountId = "accountId_example"; // String | 
    CloudflareTunnelCreateACloudflareTunnelRequest cloudflareTunnelCreateACloudflareTunnelRequest = new CloudflareTunnelCreateACloudflareTunnelRequest(); // CloudflareTunnelCreateACloudflareTunnelRequest | 
    try {
      TunnelTunnelResponseSingle result = apiInstance.cloudflareTunnelCreateACloudflareTunnel(accountId, cloudflareTunnelCreateACloudflareTunnelRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling CloudflareTunnelApi#cloudflareTunnelCreateACloudflareTunnel");
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
| **cloudflareTunnelCreateACloudflareTunnelRequest** | [**CloudflareTunnelCreateACloudflareTunnelRequest**](CloudflareTunnelCreateACloudflareTunnelRequest.md)|  | |

### Return type

[**TunnelTunnelResponseSingle**](TunnelTunnelResponseSingle.md)

### Authorization

[api_key](../README.md#api_key), [api_email](../README.md#api_email)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Create a Cloudflare Tunnel response |  -  |
| **4XX** | Create a Cloudflare Tunnel response failure |  -  |

<a id="cloudflareTunnelCreateAWarpConnectorTunnel"></a>
# **cloudflareTunnelCreateAWarpConnectorTunnel**
> TunnelTunnelResponseSingle cloudflareTunnelCreateAWarpConnectorTunnel(accountId, cloudflareTunnelCreateAWarpConnectorTunnelRequest)

Create a Warp Connector Tunnel

Creates a new Warp Connector Tunnel in an account.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.CloudflareTunnelApi;

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

    CloudflareTunnelApi apiInstance = new CloudflareTunnelApi(defaultClient);
    String accountId = "accountId_example"; // String | 
    CloudflareTunnelCreateAWarpConnectorTunnelRequest cloudflareTunnelCreateAWarpConnectorTunnelRequest = new CloudflareTunnelCreateAWarpConnectorTunnelRequest(); // CloudflareTunnelCreateAWarpConnectorTunnelRequest | 
    try {
      TunnelTunnelResponseSingle result = apiInstance.cloudflareTunnelCreateAWarpConnectorTunnel(accountId, cloudflareTunnelCreateAWarpConnectorTunnelRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling CloudflareTunnelApi#cloudflareTunnelCreateAWarpConnectorTunnel");
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
| **cloudflareTunnelCreateAWarpConnectorTunnelRequest** | [**CloudflareTunnelCreateAWarpConnectorTunnelRequest**](CloudflareTunnelCreateAWarpConnectorTunnelRequest.md)|  | |

### Return type

[**TunnelTunnelResponseSingle**](TunnelTunnelResponseSingle.md)

### Authorization

[api_key](../README.md#api_key), [api_email](../README.md#api_email)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Create a Warp Connector Tunnel response |  -  |
| **4XX** | Create a Warp Connector Tunnel response failure |  -  |

<a id="cloudflareTunnelDeleteACloudflareTunnel"></a>
# **cloudflareTunnelDeleteACloudflareTunnel**
> TunnelTunnelResponseSingle cloudflareTunnelDeleteACloudflareTunnel(tunnelId, accountId, body)

Delete a Cloudflare Tunnel

Deletes a Cloudflare Tunnel from an account.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.CloudflareTunnelApi;

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

    CloudflareTunnelApi apiInstance = new CloudflareTunnelApi(defaultClient);
    String tunnelId = "tunnelId_example"; // String | 
    String accountId = "accountId_example"; // String | 
    Object body = null; // Object | 
    try {
      TunnelTunnelResponseSingle result = apiInstance.cloudflareTunnelDeleteACloudflareTunnel(tunnelId, accountId, body);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling CloudflareTunnelApi#cloudflareTunnelDeleteACloudflareTunnel");
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

[**TunnelTunnelResponseSingle**](TunnelTunnelResponseSingle.md)

### Authorization

[api_key](../README.md#api_key), [api_email](../README.md#api_email)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Delete a Cloudflare Tunnel response |  -  |
| **4XX** | Delete a Cloudflare Tunnel response failure |  -  |

<a id="cloudflareTunnelDeleteAWarpConnectorTunnel"></a>
# **cloudflareTunnelDeleteAWarpConnectorTunnel**
> TunnelTunnelResponseSingle cloudflareTunnelDeleteAWarpConnectorTunnel(tunnelId, accountId, body)

Delete a Warp Connector Tunnel

Deletes a Warp Connector Tunnel from an account.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.CloudflareTunnelApi;

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

    CloudflareTunnelApi apiInstance = new CloudflareTunnelApi(defaultClient);
    String tunnelId = "tunnelId_example"; // String | 
    String accountId = "accountId_example"; // String | 
    Object body = null; // Object | 
    try {
      TunnelTunnelResponseSingle result = apiInstance.cloudflareTunnelDeleteAWarpConnectorTunnel(tunnelId, accountId, body);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling CloudflareTunnelApi#cloudflareTunnelDeleteAWarpConnectorTunnel");
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

[**TunnelTunnelResponseSingle**](TunnelTunnelResponseSingle.md)

### Authorization

[api_key](../README.md#api_key), [api_email](../README.md#api_email)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Delete a Warp Connector Tunnel response |  -  |
| **4XX** | Delete a Warp Connector Tunnel response failure |  -  |

<a id="cloudflareTunnelGetACloudflareTunnel"></a>
# **cloudflareTunnelGetACloudflareTunnel**
> TunnelTunnelResponseSingle cloudflareTunnelGetACloudflareTunnel(tunnelId, accountId)

Get a Cloudflare Tunnel

Fetches a single Cloudflare Tunnel.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.CloudflareTunnelApi;

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

    CloudflareTunnelApi apiInstance = new CloudflareTunnelApi(defaultClient);
    String tunnelId = "tunnelId_example"; // String | 
    String accountId = "accountId_example"; // String | 
    try {
      TunnelTunnelResponseSingle result = apiInstance.cloudflareTunnelGetACloudflareTunnel(tunnelId, accountId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling CloudflareTunnelApi#cloudflareTunnelGetACloudflareTunnel");
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

[**TunnelTunnelResponseSingle**](TunnelTunnelResponseSingle.md)

### Authorization

[api_key](../README.md#api_key), [api_email](../README.md#api_email)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Get a Cloudflare Tunnel response |  -  |
| **4XX** | Get a Cloudflare Tunnel response failure |  -  |

<a id="cloudflareTunnelGetACloudflareTunnelManagementToken"></a>
# **cloudflareTunnelGetACloudflareTunnelManagementToken**
> TunnelTunnelResponseToken cloudflareTunnelGetACloudflareTunnelManagementToken(tunnelId, accountId, cloudflareTunnelGetACloudflareTunnelManagementTokenRequest)

Get a Cloudflare Tunnel management token

Gets a management token used to access the management resources (i.e. Streaming Logs) of a tunnel.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.CloudflareTunnelApi;

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

    CloudflareTunnelApi apiInstance = new CloudflareTunnelApi(defaultClient);
    String tunnelId = "tunnelId_example"; // String | 
    String accountId = "accountId_example"; // String | 
    CloudflareTunnelGetACloudflareTunnelManagementTokenRequest cloudflareTunnelGetACloudflareTunnelManagementTokenRequest = new CloudflareTunnelGetACloudflareTunnelManagementTokenRequest(); // CloudflareTunnelGetACloudflareTunnelManagementTokenRequest | 
    try {
      TunnelTunnelResponseToken result = apiInstance.cloudflareTunnelGetACloudflareTunnelManagementToken(tunnelId, accountId, cloudflareTunnelGetACloudflareTunnelManagementTokenRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling CloudflareTunnelApi#cloudflareTunnelGetACloudflareTunnelManagementToken");
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
| **cloudflareTunnelGetACloudflareTunnelManagementTokenRequest** | [**CloudflareTunnelGetACloudflareTunnelManagementTokenRequest**](CloudflareTunnelGetACloudflareTunnelManagementTokenRequest.md)|  | |

### Return type

[**TunnelTunnelResponseToken**](TunnelTunnelResponseToken.md)

### Authorization

[api_key](../README.md#api_key), [api_email](../README.md#api_email)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Get a Cloudflare Tunnel management token response |  -  |
| **4XX** | Cloudflare API response failure |  -  |

<a id="cloudflareTunnelGetACloudflareTunnelToken"></a>
# **cloudflareTunnelGetACloudflareTunnelToken**
> TunnelTunnelResponseToken cloudflareTunnelGetACloudflareTunnelToken(tunnelId, accountId)

Get a Cloudflare Tunnel token

Gets the token used to associate cloudflared with a specific tunnel.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.CloudflareTunnelApi;

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

    CloudflareTunnelApi apiInstance = new CloudflareTunnelApi(defaultClient);
    String tunnelId = "tunnelId_example"; // String | 
    String accountId = "accountId_example"; // String | 
    try {
      TunnelTunnelResponseToken result = apiInstance.cloudflareTunnelGetACloudflareTunnelToken(tunnelId, accountId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling CloudflareTunnelApi#cloudflareTunnelGetACloudflareTunnelToken");
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

[**TunnelTunnelResponseToken**](TunnelTunnelResponseToken.md)

### Authorization

[api_key](../README.md#api_key), [api_email](../README.md#api_email)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Get a Cloudflare Tunnel token response |  -  |
| **4XX** | Get a Cloudflare Tunnel token response failure |  -  |

<a id="cloudflareTunnelGetAWarpConnectorTunnel"></a>
# **cloudflareTunnelGetAWarpConnectorTunnel**
> TunnelTunnelResponseSingle cloudflareTunnelGetAWarpConnectorTunnel(tunnelId, accountId)

Get a Warp Connector Tunnel

Fetches a single Warp Connector Tunnel.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.CloudflareTunnelApi;

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

    CloudflareTunnelApi apiInstance = new CloudflareTunnelApi(defaultClient);
    String tunnelId = "tunnelId_example"; // String | 
    String accountId = "accountId_example"; // String | 
    try {
      TunnelTunnelResponseSingle result = apiInstance.cloudflareTunnelGetAWarpConnectorTunnel(tunnelId, accountId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling CloudflareTunnelApi#cloudflareTunnelGetAWarpConnectorTunnel");
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

[**TunnelTunnelResponseSingle**](TunnelTunnelResponseSingle.md)

### Authorization

[api_key](../README.md#api_key), [api_email](../README.md#api_email)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Get a Warp Connector Tunnel response |  -  |
| **4XX** | Get a Warp Connector Tunnel response failure |  -  |

<a id="cloudflareTunnelGetAWarpConnectorTunnelToken"></a>
# **cloudflareTunnelGetAWarpConnectorTunnelToken**
> TunnelTunnelResponseToken cloudflareTunnelGetAWarpConnectorTunnelToken(tunnelId, accountId)

Get a Warp Connector Tunnel token

Gets the token used to associate warp device with a specific Warp Connector tunnel.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.CloudflareTunnelApi;

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

    CloudflareTunnelApi apiInstance = new CloudflareTunnelApi(defaultClient);
    String tunnelId = "tunnelId_example"; // String | 
    String accountId = "accountId_example"; // String | 
    try {
      TunnelTunnelResponseToken result = apiInstance.cloudflareTunnelGetAWarpConnectorTunnelToken(tunnelId, accountId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling CloudflareTunnelApi#cloudflareTunnelGetAWarpConnectorTunnelToken");
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

[**TunnelTunnelResponseToken**](TunnelTunnelResponseToken.md)

### Authorization

[api_key](../README.md#api_key), [api_email](../README.md#api_email)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Get a Warp Connector Tunnel token response |  -  |
| **4XX** | Get a Warp Connector Tunnel token response failure |  -  |

<a id="cloudflareTunnelGetCloudflareTunnelConnector"></a>
# **cloudflareTunnelGetCloudflareTunnelConnector**
> TunnelTunnelClientResponse cloudflareTunnelGetCloudflareTunnelConnector(accountId, tunnelId, connectorId)

Get Cloudflare Tunnel connector

Fetches connector and connection details for a Cloudflare Tunnel.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.CloudflareTunnelApi;

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

    CloudflareTunnelApi apiInstance = new CloudflareTunnelApi(defaultClient);
    String accountId = "accountId_example"; // String | 
    String tunnelId = "tunnelId_example"; // String | 
    String connectorId = "connectorId_example"; // String | 
    try {
      TunnelTunnelClientResponse result = apiInstance.cloudflareTunnelGetCloudflareTunnelConnector(accountId, tunnelId, connectorId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling CloudflareTunnelApi#cloudflareTunnelGetCloudflareTunnelConnector");
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
| **tunnelId** | **String**|  | |
| **connectorId** | **String**|  | |

### Return type

[**TunnelTunnelClientResponse**](TunnelTunnelClientResponse.md)

### Authorization

[api_key](../README.md#api_key), [api_email](../README.md#api_email)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Get Cloudflare Tunnel connector response |  -  |
| **4XX** | Get Cloudflare Tunnel connector response failure |  -  |

<a id="cloudflareTunnelListAllTunnels"></a>
# **cloudflareTunnelListAllTunnels**
> TunnelTunnelResponseCollection cloudflareTunnelListAllTunnels(accountId, name, isDeleted, existedAt, uuid, wasActiveAt, wasInactiveAt, includePrefix, excludePrefix, tunTypes, perPage, page)

List All Tunnels

Lists and filters all types of Tunnels in an account.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.CloudflareTunnelApi;

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

    CloudflareTunnelApi apiInstance = new CloudflareTunnelApi(defaultClient);
    String accountId = "accountId_example"; // String | 
    String name = "blog"; // String | 
    Boolean isDeleted = true; // Boolean | 
    OffsetDateTime existedAt = OffsetDateTime.now(); // OffsetDateTime | 
    String uuid = "uuid_example"; // String | 
    OffsetDateTime wasActiveAt = OffsetDateTime.parse("2009-11-10T23:00Z"); // OffsetDateTime | 
    OffsetDateTime wasInactiveAt = OffsetDateTime.parse("2009-11-10T23:00Z"); // OffsetDateTime | 
    String includePrefix = "vpc1-"; // String | 
    String excludePrefix = "vpc1-"; // String | 
    String tunTypes = "tunTypes_example"; // String | 
    BigDecimal perPage = new BigDecimal(78); // BigDecimal | 
    BigDecimal page = new BigDecimal("1"); // BigDecimal | 
    try {
      TunnelTunnelResponseCollection result = apiInstance.cloudflareTunnelListAllTunnels(accountId, name, isDeleted, existedAt, uuid, wasActiveAt, wasInactiveAt, includePrefix, excludePrefix, tunTypes, perPage, page);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling CloudflareTunnelApi#cloudflareTunnelListAllTunnels");
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
| **isDeleted** | **Boolean**|  | [optional] |
| **existedAt** | **OffsetDateTime**|  | [optional] |
| **uuid** | **String**|  | [optional] |
| **wasActiveAt** | **OffsetDateTime**|  | [optional] |
| **wasInactiveAt** | **OffsetDateTime**|  | [optional] |
| **includePrefix** | **String**|  | [optional] |
| **excludePrefix** | **String**|  | [optional] |
| **tunTypes** | **String**|  | [optional] |
| **perPage** | **BigDecimal**|  | [optional] |
| **page** | **BigDecimal**|  | [optional] [default to 1] |

### Return type

[**TunnelTunnelResponseCollection**](TunnelTunnelResponseCollection.md)

### Authorization

[api_key](../README.md#api_key), [api_email](../README.md#api_email)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | List Tunnels response |  -  |
| **4XX** | List Tunnels response failure |  -  |

<a id="cloudflareTunnelListCloudflareTunnelConnections"></a>
# **cloudflareTunnelListCloudflareTunnelConnections**
> TunnelTunnelConnectionsResponse cloudflareTunnelListCloudflareTunnelConnections(accountId, tunnelId)

List Cloudflare Tunnel connections

Fetches connection details for a Cloudflare Tunnel.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.CloudflareTunnelApi;

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

    CloudflareTunnelApi apiInstance = new CloudflareTunnelApi(defaultClient);
    String accountId = "accountId_example"; // String | 
    String tunnelId = "tunnelId_example"; // String | 
    try {
      TunnelTunnelConnectionsResponse result = apiInstance.cloudflareTunnelListCloudflareTunnelConnections(accountId, tunnelId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling CloudflareTunnelApi#cloudflareTunnelListCloudflareTunnelConnections");
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
| **tunnelId** | **String**|  | |

### Return type

[**TunnelTunnelConnectionsResponse**](TunnelTunnelConnectionsResponse.md)

### Authorization

[api_key](../README.md#api_key), [api_email](../README.md#api_email)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | List Cloudflare Tunnel connections response |  -  |
| **4XX** | List Cloudflare Tunnel connections response failure |  -  |

<a id="cloudflareTunnelListCloudflareTunnels"></a>
# **cloudflareTunnelListCloudflareTunnels**
> TunnelTunnelResponseCollection cloudflareTunnelListCloudflareTunnels(accountId, name, isDeleted, existedAt, uuid, wasActiveAt, wasInactiveAt, includePrefix, excludePrefix, perPage, page)

List Cloudflare Tunnels

Lists and filters Cloudflare Tunnels in an account.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.CloudflareTunnelApi;

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

    CloudflareTunnelApi apiInstance = new CloudflareTunnelApi(defaultClient);
    String accountId = "accountId_example"; // String | 
    String name = "blog"; // String | 
    Boolean isDeleted = true; // Boolean | 
    OffsetDateTime existedAt = OffsetDateTime.now(); // OffsetDateTime | 
    String uuid = "uuid_example"; // String | 
    OffsetDateTime wasActiveAt = OffsetDateTime.parse("2009-11-10T23:00Z"); // OffsetDateTime | 
    OffsetDateTime wasInactiveAt = OffsetDateTime.parse("2009-11-10T23:00Z"); // OffsetDateTime | 
    String includePrefix = "vpc1-"; // String | 
    String excludePrefix = "vpc1-"; // String | 
    BigDecimal perPage = new BigDecimal(78); // BigDecimal | 
    BigDecimal page = new BigDecimal("1"); // BigDecimal | 
    try {
      TunnelTunnelResponseCollection result = apiInstance.cloudflareTunnelListCloudflareTunnels(accountId, name, isDeleted, existedAt, uuid, wasActiveAt, wasInactiveAt, includePrefix, excludePrefix, perPage, page);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling CloudflareTunnelApi#cloudflareTunnelListCloudflareTunnels");
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
| **isDeleted** | **Boolean**|  | [optional] |
| **existedAt** | **OffsetDateTime**|  | [optional] |
| **uuid** | **String**|  | [optional] |
| **wasActiveAt** | **OffsetDateTime**|  | [optional] |
| **wasInactiveAt** | **OffsetDateTime**|  | [optional] |
| **includePrefix** | **String**|  | [optional] |
| **excludePrefix** | **String**|  | [optional] |
| **perPage** | **BigDecimal**|  | [optional] |
| **page** | **BigDecimal**|  | [optional] [default to 1] |

### Return type

[**TunnelTunnelResponseCollection**](TunnelTunnelResponseCollection.md)

### Authorization

[api_key](../README.md#api_key), [api_email](../README.md#api_email)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | List Cloudflare Tunnels response |  -  |
| **4XX** | List Cloudflare Tunnels response failure |  -  |

<a id="cloudflareTunnelListWarpConnectorTunnels"></a>
# **cloudflareTunnelListWarpConnectorTunnels**
> TunnelTunnelResponseCollection cloudflareTunnelListWarpConnectorTunnels(accountId, name, isDeleted, existedAt, uuid, wasActiveAt, wasInactiveAt, includePrefix, excludePrefix, perPage, page)

List Warp Connector Tunnels

Lists and filters Warp Connector Tunnels in an account.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.CloudflareTunnelApi;

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

    CloudflareTunnelApi apiInstance = new CloudflareTunnelApi(defaultClient);
    String accountId = "accountId_example"; // String | 
    String name = "blog"; // String | 
    Boolean isDeleted = true; // Boolean | 
    OffsetDateTime existedAt = OffsetDateTime.now(); // OffsetDateTime | 
    String uuid = "uuid_example"; // String | 
    OffsetDateTime wasActiveAt = OffsetDateTime.parse("2009-11-10T23:00Z"); // OffsetDateTime | 
    OffsetDateTime wasInactiveAt = OffsetDateTime.parse("2009-11-10T23:00Z"); // OffsetDateTime | 
    String includePrefix = "vpc1-"; // String | 
    String excludePrefix = "vpc1-"; // String | 
    BigDecimal perPage = new BigDecimal(78); // BigDecimal | 
    BigDecimal page = new BigDecimal("1"); // BigDecimal | 
    try {
      TunnelTunnelResponseCollection result = apiInstance.cloudflareTunnelListWarpConnectorTunnels(accountId, name, isDeleted, existedAt, uuid, wasActiveAt, wasInactiveAt, includePrefix, excludePrefix, perPage, page);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling CloudflareTunnelApi#cloudflareTunnelListWarpConnectorTunnels");
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
| **isDeleted** | **Boolean**|  | [optional] |
| **existedAt** | **OffsetDateTime**|  | [optional] |
| **uuid** | **String**|  | [optional] |
| **wasActiveAt** | **OffsetDateTime**|  | [optional] |
| **wasInactiveAt** | **OffsetDateTime**|  | [optional] |
| **includePrefix** | **String**|  | [optional] |
| **excludePrefix** | **String**|  | [optional] |
| **perPage** | **BigDecimal**|  | [optional] |
| **page** | **BigDecimal**|  | [optional] [default to 1] |

### Return type

[**TunnelTunnelResponseCollection**](TunnelTunnelResponseCollection.md)

### Authorization

[api_key](../README.md#api_key), [api_email](../README.md#api_email)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | List Warp Connector Tunnels response |  -  |
| **4XX** | List Warp Connector Tunnels response failure |  -  |

<a id="cloudflareTunnelUpdateACloudflareTunnel"></a>
# **cloudflareTunnelUpdateACloudflareTunnel**
> TunnelTunnelResponseSingle cloudflareTunnelUpdateACloudflareTunnel(tunnelId, accountId, cloudflareTunnelUpdateACloudflareTunnelRequest)

Update a Cloudflare Tunnel

Updates an existing Cloudflare Tunnel.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.CloudflareTunnelApi;

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

    CloudflareTunnelApi apiInstance = new CloudflareTunnelApi(defaultClient);
    String tunnelId = "tunnelId_example"; // String | 
    String accountId = "accountId_example"; // String | 
    CloudflareTunnelUpdateACloudflareTunnelRequest cloudflareTunnelUpdateACloudflareTunnelRequest = new CloudflareTunnelUpdateACloudflareTunnelRequest(); // CloudflareTunnelUpdateACloudflareTunnelRequest | 
    try {
      TunnelTunnelResponseSingle result = apiInstance.cloudflareTunnelUpdateACloudflareTunnel(tunnelId, accountId, cloudflareTunnelUpdateACloudflareTunnelRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling CloudflareTunnelApi#cloudflareTunnelUpdateACloudflareTunnel");
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
| **cloudflareTunnelUpdateACloudflareTunnelRequest** | [**CloudflareTunnelUpdateACloudflareTunnelRequest**](CloudflareTunnelUpdateACloudflareTunnelRequest.md)|  | |

### Return type

[**TunnelTunnelResponseSingle**](TunnelTunnelResponseSingle.md)

### Authorization

[api_key](../README.md#api_key), [api_email](../README.md#api_email)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Update a Cloudflare Tunnel response |  -  |
| **4XX** | Update a Cloudflare Tunnel response failure |  -  |

<a id="cloudflareTunnelUpdateAWarpConnectorTunnel"></a>
# **cloudflareTunnelUpdateAWarpConnectorTunnel**
> TunnelTunnelResponseSingle cloudflareTunnelUpdateAWarpConnectorTunnel(tunnelId, accountId, cloudflareTunnelUpdateACloudflareTunnelRequest)

Update a Warp Connector Tunnel

Updates an existing Warp Connector Tunnel.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.CloudflareTunnelApi;

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

    CloudflareTunnelApi apiInstance = new CloudflareTunnelApi(defaultClient);
    String tunnelId = "tunnelId_example"; // String | 
    String accountId = "accountId_example"; // String | 
    CloudflareTunnelUpdateACloudflareTunnelRequest cloudflareTunnelUpdateACloudflareTunnelRequest = new CloudflareTunnelUpdateACloudflareTunnelRequest(); // CloudflareTunnelUpdateACloudflareTunnelRequest | 
    try {
      TunnelTunnelResponseSingle result = apiInstance.cloudflareTunnelUpdateAWarpConnectorTunnel(tunnelId, accountId, cloudflareTunnelUpdateACloudflareTunnelRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling CloudflareTunnelApi#cloudflareTunnelUpdateAWarpConnectorTunnel");
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
| **cloudflareTunnelUpdateACloudflareTunnelRequest** | [**CloudflareTunnelUpdateACloudflareTunnelRequest**](CloudflareTunnelUpdateACloudflareTunnelRequest.md)|  | |

### Return type

[**TunnelTunnelResponseSingle**](TunnelTunnelResponseSingle.md)

### Authorization

[api_key](../README.md#api_key), [api_email](../README.md#api_email)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Update a Warp Connector Tunnel response |  -  |
| **4XX** | Update a Warp Connector Tunnel response failure |  -  |

