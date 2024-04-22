# MagicGreTunnelsApi

All URIs are relative to *https://api.cloudflare.com/client/v4*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**magicGreTunnelsCreateGreTunnels**](MagicGreTunnelsApi.md#magicGreTunnelsCreateGreTunnels) | **POST** /accounts/{account_id}/magic/gre_tunnels | Create GRE tunnels |
| [**magicGreTunnelsDeleteGreTunnel**](MagicGreTunnelsApi.md#magicGreTunnelsDeleteGreTunnel) | **DELETE** /accounts/{account_id}/magic/gre_tunnels/{tunnel_identifier} | Delete GRE Tunnel |
| [**magicGreTunnelsListGreTunnelDetails**](MagicGreTunnelsApi.md#magicGreTunnelsListGreTunnelDetails) | **GET** /accounts/{account_id}/magic/gre_tunnels/{tunnel_identifier} | List GRE Tunnel Details |
| [**magicGreTunnelsListGreTunnels**](MagicGreTunnelsApi.md#magicGreTunnelsListGreTunnels) | **GET** /accounts/{account_id}/magic/gre_tunnels | List GRE tunnels |
| [**magicGreTunnelsUpdateGreTunnel**](MagicGreTunnelsApi.md#magicGreTunnelsUpdateGreTunnel) | **PUT** /accounts/{account_id}/magic/gre_tunnels/{tunnel_identifier} | Update GRE Tunnel |
| [**magicGreTunnelsUpdateMultipleGreTunnels**](MagicGreTunnelsApi.md#magicGreTunnelsUpdateMultipleGreTunnels) | **PUT** /accounts/{account_id}/magic/gre_tunnels | Update multiple GRE tunnels |


<a id="magicGreTunnelsCreateGreTunnels"></a>
# **magicGreTunnelsCreateGreTunnels**
> MagicTunnelsCollectionResponse magicGreTunnelsCreateGreTunnels(accountId, body)

Create GRE tunnels

Creates new GRE tunnels. Use &#x60;?validate_only&#x3D;true&#x60; as an optional query parameter to only run validation without persisting changes.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.MagicGreTunnelsApi;

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

    MagicGreTunnelsApi apiInstance = new MagicGreTunnelsApi(defaultClient);
    String accountId = "accountId_example"; // String | 
    Object body = null; // Object | 
    try {
      MagicTunnelsCollectionResponse result = apiInstance.magicGreTunnelsCreateGreTunnels(accountId, body);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling MagicGreTunnelsApi#magicGreTunnelsCreateGreTunnels");
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
| **body** | **Object**|  | |

### Return type

[**MagicTunnelsCollectionResponse**](MagicTunnelsCollectionResponse.md)

### Authorization

[api_key](../README.md#api_key), [api_email](../README.md#api_email)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Create GRE tunnels response |  -  |
| **4XX** | Create GRE tunnels response failure |  -  |

<a id="magicGreTunnelsDeleteGreTunnel"></a>
# **magicGreTunnelsDeleteGreTunnel**
> MagicTunnelDeletedResponse magicGreTunnelsDeleteGreTunnel(tunnelIdentifier, accountId)

Delete GRE Tunnel

Disables and removes a specific static GRE tunnel. Use &#x60;?validate_only&#x3D;true&#x60; as an optional query parameter to only run validation without persisting changes.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.MagicGreTunnelsApi;

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

    MagicGreTunnelsApi apiInstance = new MagicGreTunnelsApi(defaultClient);
    String tunnelIdentifier = "tunnelIdentifier_example"; // String | 
    String accountId = "accountId_example"; // String | 
    try {
      MagicTunnelDeletedResponse result = apiInstance.magicGreTunnelsDeleteGreTunnel(tunnelIdentifier, accountId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling MagicGreTunnelsApi#magicGreTunnelsDeleteGreTunnel");
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
| **tunnelIdentifier** | **String**|  | |
| **accountId** | **String**|  | |

### Return type

[**MagicTunnelDeletedResponse**](MagicTunnelDeletedResponse.md)

### Authorization

[api_key](../README.md#api_key), [api_email](../README.md#api_email)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Delete GRE Tunnel response |  -  |
| **4XX** | Delete GRE Tunnel response failure |  -  |

<a id="magicGreTunnelsListGreTunnelDetails"></a>
# **magicGreTunnelsListGreTunnelDetails**
> MagicTunnelSingleResponse magicGreTunnelsListGreTunnelDetails(tunnelIdentifier, accountId)

List GRE Tunnel Details

Lists informtion for a specific GRE tunnel.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.MagicGreTunnelsApi;

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

    MagicGreTunnelsApi apiInstance = new MagicGreTunnelsApi(defaultClient);
    String tunnelIdentifier = "tunnelIdentifier_example"; // String | 
    String accountId = "accountId_example"; // String | 
    try {
      MagicTunnelSingleResponse result = apiInstance.magicGreTunnelsListGreTunnelDetails(tunnelIdentifier, accountId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling MagicGreTunnelsApi#magicGreTunnelsListGreTunnelDetails");
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
| **tunnelIdentifier** | **String**|  | |
| **accountId** | **String**|  | |

### Return type

[**MagicTunnelSingleResponse**](MagicTunnelSingleResponse.md)

### Authorization

[api_key](../README.md#api_key), [api_email](../README.md#api_email)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | List GRE Tunnel Details response |  -  |
| **4XX** | List GRE Tunnel Details response failure |  -  |

<a id="magicGreTunnelsListGreTunnels"></a>
# **magicGreTunnelsListGreTunnels**
> MagicTunnelsCollectionResponse magicGreTunnelsListGreTunnels(accountId)

List GRE tunnels

Lists GRE tunnels associated with an account.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.MagicGreTunnelsApi;

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

    MagicGreTunnelsApi apiInstance = new MagicGreTunnelsApi(defaultClient);
    String accountId = "accountId_example"; // String | 
    try {
      MagicTunnelsCollectionResponse result = apiInstance.magicGreTunnelsListGreTunnels(accountId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling MagicGreTunnelsApi#magicGreTunnelsListGreTunnels");
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

[**MagicTunnelsCollectionResponse**](MagicTunnelsCollectionResponse.md)

### Authorization

[api_key](../README.md#api_key), [api_email](../README.md#api_email)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | List GRE tunnels response |  -  |
| **4XX** | List GRE tunnels response failure |  -  |

<a id="magicGreTunnelsUpdateGreTunnel"></a>
# **magicGreTunnelsUpdateGreTunnel**
> MagicTunnelModifiedResponse magicGreTunnelsUpdateGreTunnel(tunnelIdentifier, accountId, magicTunnelUpdateRequest)

Update GRE Tunnel

Updates a specific GRE tunnel. Use &#x60;?validate_only&#x3D;true&#x60; as an optional query parameter to only run validation without persisting changes.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.MagicGreTunnelsApi;

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

    MagicGreTunnelsApi apiInstance = new MagicGreTunnelsApi(defaultClient);
    String tunnelIdentifier = "tunnelIdentifier_example"; // String | 
    String accountId = "accountId_example"; // String | 
    MagicTunnelUpdateRequest magicTunnelUpdateRequest = new MagicTunnelUpdateRequest(); // MagicTunnelUpdateRequest | 
    try {
      MagicTunnelModifiedResponse result = apiInstance.magicGreTunnelsUpdateGreTunnel(tunnelIdentifier, accountId, magicTunnelUpdateRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling MagicGreTunnelsApi#magicGreTunnelsUpdateGreTunnel");
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
| **tunnelIdentifier** | **String**|  | |
| **accountId** | **String**|  | |
| **magicTunnelUpdateRequest** | [**MagicTunnelUpdateRequest**](MagicTunnelUpdateRequest.md)|  | |

### Return type

[**MagicTunnelModifiedResponse**](MagicTunnelModifiedResponse.md)

### Authorization

[api_key](../README.md#api_key), [api_email](../README.md#api_email)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Update GRE Tunnel response |  -  |
| **4XX** | Update GRE Tunnel response failure |  -  |

<a id="magicGreTunnelsUpdateMultipleGreTunnels"></a>
# **magicGreTunnelsUpdateMultipleGreTunnels**
> MagicModifiedTunnelsCollectionResponse magicGreTunnelsUpdateMultipleGreTunnels(accountId, body)

Update multiple GRE tunnels

Updates multiple GRE tunnels. Use &#x60;?validate_only&#x3D;true&#x60; as an optional query parameter to only run validation without persisting changes.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.MagicGreTunnelsApi;

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

    MagicGreTunnelsApi apiInstance = new MagicGreTunnelsApi(defaultClient);
    String accountId = "accountId_example"; // String | 
    Object body = null; // Object | 
    try {
      MagicModifiedTunnelsCollectionResponse result = apiInstance.magicGreTunnelsUpdateMultipleGreTunnels(accountId, body);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling MagicGreTunnelsApi#magicGreTunnelsUpdateMultipleGreTunnels");
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
| **body** | **Object**|  | |

### Return type

[**MagicModifiedTunnelsCollectionResponse**](MagicModifiedTunnelsCollectionResponse.md)

### Authorization

[api_key](../README.md#api_key), [api_email](../README.md#api_email)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Update multiple GRE tunnels response |  -  |
| **4XX** | Update multiple GRE tunnels response failure |  -  |

