# TunnelRouteApi

All URIs are relative to *https://api.cloudflare.com/client/v4*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**tunnelRouteCreateATunnelRoute**](TunnelRouteApi.md#tunnelRouteCreateATunnelRoute) | **POST** /accounts/{account_id}/teamnet/routes | Create a tunnel route |
| [**tunnelRouteCreateATunnelRouteWithCidr**](TunnelRouteApi.md#tunnelRouteCreateATunnelRouteWithCidr) | **POST** /accounts/{account_id}/teamnet/routes/network/{ip_network_encoded} | Create a tunnel route (CIDR Endpoint) |
| [**tunnelRouteDeleteATunnelRoute**](TunnelRouteApi.md#tunnelRouteDeleteATunnelRoute) | **DELETE** /accounts/{account_id}/teamnet/routes/{route_id} | Delete a tunnel route |
| [**tunnelRouteDeleteATunnelRouteWithCidr**](TunnelRouteApi.md#tunnelRouteDeleteATunnelRouteWithCidr) | **DELETE** /accounts/{account_id}/teamnet/routes/network/{ip_network_encoded} | Delete a tunnel route (CIDR Endpoint) |
| [**tunnelRouteGetTunnelRouteByIp**](TunnelRouteApi.md#tunnelRouteGetTunnelRouteByIp) | **GET** /accounts/{account_id}/teamnet/routes/ip/{ip} | Get tunnel route by IP |
| [**tunnelRouteListTunnelRoutes**](TunnelRouteApi.md#tunnelRouteListTunnelRoutes) | **GET** /accounts/{account_id}/teamnet/routes | List tunnel routes |
| [**tunnelRouteUpdateATunnelRoute**](TunnelRouteApi.md#tunnelRouteUpdateATunnelRoute) | **PATCH** /accounts/{account_id}/teamnet/routes/{route_id} | Update a tunnel route |
| [**tunnelRouteUpdateATunnelRouteWithCidr**](TunnelRouteApi.md#tunnelRouteUpdateATunnelRouteWithCidr) | **PATCH** /accounts/{account_id}/teamnet/routes/network/{ip_network_encoded} | Update a tunnel route (CIDR Endpoint) |


<a id="tunnelRouteCreateATunnelRoute"></a>
# **tunnelRouteCreateATunnelRoute**
> TunnelRouteResponseSingle tunnelRouteCreateATunnelRoute(accountId, tunnelRouteCreateATunnelRouteRequest)

Create a tunnel route

Routes a private network through a Cloudflare Tunnel.

### Example
```java
// Import classes:
import cloudflare.ApiClient;
import cloudflare.ApiException;
import cloudflare.Configuration;
import cloudflare.auth.*;
import cloudflare.models.*;
import cloudflare.sdk.TunnelRouteApi;

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

    TunnelRouteApi apiInstance = new TunnelRouteApi(defaultClient);
    String accountId = "accountId_example"; // String | 
    TunnelRouteCreateATunnelRouteRequest tunnelRouteCreateATunnelRouteRequest = new TunnelRouteCreateATunnelRouteRequest(); // TunnelRouteCreateATunnelRouteRequest | 
    try {
      TunnelRouteResponseSingle result = apiInstance.tunnelRouteCreateATunnelRoute(accountId, tunnelRouteCreateATunnelRouteRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling TunnelRouteApi#tunnelRouteCreateATunnelRoute");
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
| **tunnelRouteCreateATunnelRouteRequest** | [**TunnelRouteCreateATunnelRouteRequest**](TunnelRouteCreateATunnelRouteRequest.md)|  | |

### Return type

[**TunnelRouteResponseSingle**](TunnelRouteResponseSingle.md)

### Authorization

[api_key](../README.md#api_key), [api_email](../README.md#api_email)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Create a tunnel route response |  -  |
| **4XX** | Create a tunnel route response failure |  -  |

<a id="tunnelRouteCreateATunnelRouteWithCidr"></a>
# **tunnelRouteCreateATunnelRouteWithCidr**
> TunnelRouteResponseSingle tunnelRouteCreateATunnelRouteWithCidr(ipNetworkEncoded, accountId, tunnelRouteCreateATunnelRouteWithCidrRequest)

Create a tunnel route (CIDR Endpoint)

Routes a private network through a Cloudflare Tunnel. The CIDR in &#x60;ip_network_encoded&#x60; must be written in URL-encoded format.

### Example
```java
// Import classes:
import cloudflare.ApiClient;
import cloudflare.ApiException;
import cloudflare.Configuration;
import cloudflare.auth.*;
import cloudflare.models.*;
import cloudflare.sdk.TunnelRouteApi;

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

    TunnelRouteApi apiInstance = new TunnelRouteApi(defaultClient);
    String ipNetworkEncoded = "ipNetworkEncoded_example"; // String | 
    String accountId = "accountId_example"; // String | 
    TunnelRouteCreateATunnelRouteWithCidrRequest tunnelRouteCreateATunnelRouteWithCidrRequest = new TunnelRouteCreateATunnelRouteWithCidrRequest(); // TunnelRouteCreateATunnelRouteWithCidrRequest | 
    try {
      TunnelRouteResponseSingle result = apiInstance.tunnelRouteCreateATunnelRouteWithCidr(ipNetworkEncoded, accountId, tunnelRouteCreateATunnelRouteWithCidrRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling TunnelRouteApi#tunnelRouteCreateATunnelRouteWithCidr");
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
| **ipNetworkEncoded** | **String**|  | |
| **accountId** | **String**|  | |
| **tunnelRouteCreateATunnelRouteWithCidrRequest** | [**TunnelRouteCreateATunnelRouteWithCidrRequest**](TunnelRouteCreateATunnelRouteWithCidrRequest.md)|  | |

### Return type

[**TunnelRouteResponseSingle**](TunnelRouteResponseSingle.md)

### Authorization

[api_key](../README.md#api_key), [api_email](../README.md#api_email)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Create a tunnel route response |  -  |
| **4XX** | Create a tunnel route response failure |  -  |

<a id="tunnelRouteDeleteATunnelRoute"></a>
# **tunnelRouteDeleteATunnelRoute**
> TunnelRouteResponseSingle tunnelRouteDeleteATunnelRoute(routeId, accountId)

Delete a tunnel route

Deletes a private network route from an account. 

### Example
```java
// Import classes:
import cloudflare.ApiClient;
import cloudflare.ApiException;
import cloudflare.Configuration;
import cloudflare.auth.*;
import cloudflare.models.*;
import cloudflare.sdk.TunnelRouteApi;

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

    TunnelRouteApi apiInstance = new TunnelRouteApi(defaultClient);
    String routeId = "routeId_example"; // String | 
    String accountId = "accountId_example"; // String | 
    try {
      TunnelRouteResponseSingle result = apiInstance.tunnelRouteDeleteATunnelRoute(routeId, accountId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling TunnelRouteApi#tunnelRouteDeleteATunnelRoute");
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
| **routeId** | **String**|  | |
| **accountId** | **String**|  | |

### Return type

[**TunnelRouteResponseSingle**](TunnelRouteResponseSingle.md)

### Authorization

[api_key](../README.md#api_key), [api_email](../README.md#api_email)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Delete a tunnel route response |  -  |
| **4XX** | Delete a tunnel route response failure |  -  |

<a id="tunnelRouteDeleteATunnelRouteWithCidr"></a>
# **tunnelRouteDeleteATunnelRouteWithCidr**
> TunnelRouteResponseSingle tunnelRouteDeleteATunnelRouteWithCidr(ipNetworkEncoded, accountId, virtualNetworkId, tunType, tunnelId)

Delete a tunnel route (CIDR Endpoint)

Deletes a private network route from an account. The CIDR in &#x60;ip_network_encoded&#x60; must be written in URL-encoded format. If no virtual_network_id is provided it will delete the route from the default vnet. If no tun_type is provided it will fetch the type from the tunnel_id or if that is missing it will assume Cloudflare Tunnel as default. If tunnel_id is provided it will delete the route from that tunnel, otherwise it will delete the route based on the vnet and tun_type. 

### Example
```java
// Import classes:
import cloudflare.ApiClient;
import cloudflare.ApiException;
import cloudflare.Configuration;
import cloudflare.auth.*;
import cloudflare.models.*;
import cloudflare.sdk.TunnelRouteApi;

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

    TunnelRouteApi apiInstance = new TunnelRouteApi(defaultClient);
    String ipNetworkEncoded = "ipNetworkEncoded_example"; // String | 
    String accountId = "accountId_example"; // String | 
    String virtualNetworkId = "virtualNetworkId_example"; // String | 
    TunnelTunnelType tunType = TunnelTunnelType.fromValue("cfd_tunnel"); // TunnelTunnelType | 
    String tunnelId = "tunnelId_example"; // String | 
    try {
      TunnelRouteResponseSingle result = apiInstance.tunnelRouteDeleteATunnelRouteWithCidr(ipNetworkEncoded, accountId, virtualNetworkId, tunType, tunnelId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling TunnelRouteApi#tunnelRouteDeleteATunnelRouteWithCidr");
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
| **ipNetworkEncoded** | **String**|  | |
| **accountId** | **String**|  | |
| **virtualNetworkId** | **String**|  | [optional] |
| **tunType** | [**TunnelTunnelType**](.md)|  | [optional] [enum: cfd_tunnel, warp_connector, ip_sec, gre, cni] |
| **tunnelId** | **String**|  | [optional] |

### Return type

[**TunnelRouteResponseSingle**](TunnelRouteResponseSingle.md)

### Authorization

[api_key](../README.md#api_key), [api_email](../README.md#api_email)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Delete a tunnel route response |  -  |
| **4XX** | Delete a tunnel route response failure |  -  |

<a id="tunnelRouteGetTunnelRouteByIp"></a>
# **tunnelRouteGetTunnelRouteByIp**
> TunnelTeamnetResponseSingle tunnelRouteGetTunnelRouteByIp(ip, accountId, virtualNetworkId)

Get tunnel route by IP

Fetches routes that contain the given IP address.

### Example
```java
// Import classes:
import cloudflare.ApiClient;
import cloudflare.ApiException;
import cloudflare.Configuration;
import cloudflare.auth.*;
import cloudflare.models.*;
import cloudflare.sdk.TunnelRouteApi;

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

    TunnelRouteApi apiInstance = new TunnelRouteApi(defaultClient);
    String ip = "ip_example"; // String | 
    String accountId = "accountId_example"; // String | 
    Object virtualNetworkId = null; // Object | 
    try {
      TunnelTeamnetResponseSingle result = apiInstance.tunnelRouteGetTunnelRouteByIp(ip, accountId, virtualNetworkId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling TunnelRouteApi#tunnelRouteGetTunnelRouteByIp");
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
| **ip** | **String**|  | |
| **accountId** | **String**|  | |
| **virtualNetworkId** | [**Object**](.md)|  | [optional] |

### Return type

[**TunnelTeamnetResponseSingle**](TunnelTeamnetResponseSingle.md)

### Authorization

[api_key](../README.md#api_key), [api_email](../README.md#api_email)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Get tunnel route by IP response |  -  |
| **4XX** | Get tunnel route by IP response failure |  -  |

<a id="tunnelRouteListTunnelRoutes"></a>
# **tunnelRouteListTunnelRoutes**
> TunnelTeamnetResponseCollection tunnelRouteListTunnelRoutes(accountId, comment, isDeleted, networkSubset, networkSuperset, existedAt, tunnelId, routeId, tunTypes, virtualNetworkId, perPage, page)

List tunnel routes

Lists and filters private network routes in an account.

### Example
```java
// Import classes:
import cloudflare.ApiClient;
import cloudflare.ApiException;
import cloudflare.Configuration;
import cloudflare.auth.*;
import cloudflare.models.*;
import cloudflare.sdk.TunnelRouteApi;

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

    TunnelRouteApi apiInstance = new TunnelRouteApi(defaultClient);
    String accountId = "accountId_example"; // String | 
    String comment = "comment_example"; // String | 
    Object isDeleted = null; // Object | 
    Object networkSubset = null; // Object | 
    Object networkSuperset = null; // Object | 
    Object existedAt = null; // Object | 
    Object tunnelId = null; // Object | 
    String routeId = "routeId_example"; // String | 
    String tunTypes = "tunTypes_example"; // String | 
    Object virtualNetworkId = null; // Object | 
    BigDecimal perPage = new BigDecimal(78); // BigDecimal | 
    BigDecimal page = new BigDecimal("1"); // BigDecimal | 
    try {
      TunnelTeamnetResponseCollection result = apiInstance.tunnelRouteListTunnelRoutes(accountId, comment, isDeleted, networkSubset, networkSuperset, existedAt, tunnelId, routeId, tunTypes, virtualNetworkId, perPage, page);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling TunnelRouteApi#tunnelRouteListTunnelRoutes");
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
| **comment** | **String**|  | [optional] |
| **isDeleted** | [**Object**](.md)|  | [optional] |
| **networkSubset** | [**Object**](.md)|  | [optional] |
| **networkSuperset** | [**Object**](.md)|  | [optional] |
| **existedAt** | [**Object**](.md)|  | [optional] |
| **tunnelId** | [**Object**](.md)|  | [optional] |
| **routeId** | **String**|  | [optional] |
| **tunTypes** | **String**|  | [optional] |
| **virtualNetworkId** | [**Object**](.md)|  | [optional] |
| **perPage** | **BigDecimal**|  | [optional] |
| **page** | **BigDecimal**|  | [optional] [default to 1] |

### Return type

[**TunnelTeamnetResponseCollection**](TunnelTeamnetResponseCollection.md)

### Authorization

[api_key](../README.md#api_key), [api_email](../README.md#api_email)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | List tunnel routes response |  -  |
| **4XX** | List tunnel routes response failure |  -  |

<a id="tunnelRouteUpdateATunnelRoute"></a>
# **tunnelRouteUpdateATunnelRoute**
> TunnelRouteResponseSingle tunnelRouteUpdateATunnelRoute(routeId, accountId, tunnelRouteUpdateATunnelRouteRequest)

Update a tunnel route

Updates an existing private network route in an account. The fields that are meant to be updated should be provided in the body of the request.

### Example
```java
// Import classes:
import cloudflare.ApiClient;
import cloudflare.ApiException;
import cloudflare.Configuration;
import cloudflare.auth.*;
import cloudflare.models.*;
import cloudflare.sdk.TunnelRouteApi;

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

    TunnelRouteApi apiInstance = new TunnelRouteApi(defaultClient);
    String routeId = "routeId_example"; // String | 
    String accountId = "accountId_example"; // String | 
    TunnelRouteUpdateATunnelRouteRequest tunnelRouteUpdateATunnelRouteRequest = new TunnelRouteUpdateATunnelRouteRequest(); // TunnelRouteUpdateATunnelRouteRequest | 
    try {
      TunnelRouteResponseSingle result = apiInstance.tunnelRouteUpdateATunnelRoute(routeId, accountId, tunnelRouteUpdateATunnelRouteRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling TunnelRouteApi#tunnelRouteUpdateATunnelRoute");
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
| **routeId** | **String**|  | |
| **accountId** | **String**|  | |
| **tunnelRouteUpdateATunnelRouteRequest** | [**TunnelRouteUpdateATunnelRouteRequest**](TunnelRouteUpdateATunnelRouteRequest.md)|  | |

### Return type

[**TunnelRouteResponseSingle**](TunnelRouteResponseSingle.md)

### Authorization

[api_key](../README.md#api_key), [api_email](../README.md#api_email)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Update a tunnel route response |  -  |
| **4XX** | Update a tunnel route response failure |  -  |

<a id="tunnelRouteUpdateATunnelRouteWithCidr"></a>
# **tunnelRouteUpdateATunnelRouteWithCidr**
> TunnelRouteResponseSingle tunnelRouteUpdateATunnelRouteWithCidr(ipNetworkEncoded, accountId)

Update a tunnel route (CIDR Endpoint)

Updates an existing private network route in an account. The CIDR in &#x60;ip_network_encoded&#x60; must be written in URL-encoded format.

### Example
```java
// Import classes:
import cloudflare.ApiClient;
import cloudflare.ApiException;
import cloudflare.Configuration;
import cloudflare.auth.*;
import cloudflare.models.*;
import cloudflare.sdk.TunnelRouteApi;

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

    TunnelRouteApi apiInstance = new TunnelRouteApi(defaultClient);
    String ipNetworkEncoded = "ipNetworkEncoded_example"; // String | 
    String accountId = "accountId_example"; // String | 
    try {
      TunnelRouteResponseSingle result = apiInstance.tunnelRouteUpdateATunnelRouteWithCidr(ipNetworkEncoded, accountId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling TunnelRouteApi#tunnelRouteUpdateATunnelRouteWithCidr");
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
| **ipNetworkEncoded** | **String**|  | |
| **accountId** | **String**|  | |

### Return type

[**TunnelRouteResponseSingle**](TunnelRouteResponseSingle.md)

### Authorization

[api_key](../README.md#api_key), [api_email](../README.md#api_email)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Update a tunnel route response |  -  |
| **4XX** | Update a tunnel route response failure |  -  |

