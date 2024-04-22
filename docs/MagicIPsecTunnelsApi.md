# MagicIPsecTunnelsApi

All URIs are relative to *https://api.cloudflare.com/client/v4*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**magicIpsecTunnelsCreateIpsecTunnels**](MagicIPsecTunnelsApi.md#magicIpsecTunnelsCreateIpsecTunnels) | **POST** /accounts/{account_id}/magic/ipsec_tunnels | Create IPsec tunnels |
| [**magicIpsecTunnelsDeleteIpsecTunnel**](MagicIPsecTunnelsApi.md#magicIpsecTunnelsDeleteIpsecTunnel) | **DELETE** /accounts/{account_id}/magic/ipsec_tunnels/{tunnel_identifier} | Delete IPsec Tunnel |
| [**magicIpsecTunnelsGeneratePreSharedKeyPskForIpsecTunnels**](MagicIPsecTunnelsApi.md#magicIpsecTunnelsGeneratePreSharedKeyPskForIpsecTunnels) | **POST** /accounts/{account_id}/magic/ipsec_tunnels/{tunnel_identifier}/psk_generate | Generate Pre Shared Key (PSK) for IPsec tunnels |
| [**magicIpsecTunnelsListIpsecTunnelDetails**](MagicIPsecTunnelsApi.md#magicIpsecTunnelsListIpsecTunnelDetails) | **GET** /accounts/{account_id}/magic/ipsec_tunnels/{tunnel_identifier} | List IPsec tunnel details |
| [**magicIpsecTunnelsListIpsecTunnels**](MagicIPsecTunnelsApi.md#magicIpsecTunnelsListIpsecTunnels) | **GET** /accounts/{account_id}/magic/ipsec_tunnels | List IPsec tunnels |
| [**magicIpsecTunnelsUpdateIpsecTunnel**](MagicIPsecTunnelsApi.md#magicIpsecTunnelsUpdateIpsecTunnel) | **PUT** /accounts/{account_id}/magic/ipsec_tunnels/{tunnel_identifier} | Update IPsec Tunnel |
| [**magicIpsecTunnelsUpdateMultipleIpsecTunnels**](MagicIPsecTunnelsApi.md#magicIpsecTunnelsUpdateMultipleIpsecTunnels) | **PUT** /accounts/{account_id}/magic/ipsec_tunnels | Update multiple IPsec tunnels |


<a id="magicIpsecTunnelsCreateIpsecTunnels"></a>
# **magicIpsecTunnelsCreateIpsecTunnels**
> MagicSchemasTunnelsCollectionResponse magicIpsecTunnelsCreateIpsecTunnels(accountId, magicSchemasTunnelAddRequest)

Create IPsec tunnels

Creates new IPsec tunnels associated with an account. Use &#x60;?validate_only&#x3D;true&#x60; as an optional query parameter to only run validation without persisting changes.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.MagicIPsecTunnelsApi;

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

    MagicIPsecTunnelsApi apiInstance = new MagicIPsecTunnelsApi(defaultClient);
    String accountId = "accountId_example"; // String | 
    MagicSchemasTunnelAddRequest magicSchemasTunnelAddRequest = new MagicSchemasTunnelAddRequest(); // MagicSchemasTunnelAddRequest | 
    try {
      MagicSchemasTunnelsCollectionResponse result = apiInstance.magicIpsecTunnelsCreateIpsecTunnels(accountId, magicSchemasTunnelAddRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling MagicIPsecTunnelsApi#magicIpsecTunnelsCreateIpsecTunnels");
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
| **magicSchemasTunnelAddRequest** | [**MagicSchemasTunnelAddRequest**](MagicSchemasTunnelAddRequest.md)|  | |

### Return type

[**MagicSchemasTunnelsCollectionResponse**](MagicSchemasTunnelsCollectionResponse.md)

### Authorization

[api_key](../README.md#api_key), [api_email](../README.md#api_email)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Create IPsec tunnels response |  -  |
| **4XX** | Create IPsec tunnels response failure |  -  |

<a id="magicIpsecTunnelsDeleteIpsecTunnel"></a>
# **magicIpsecTunnelsDeleteIpsecTunnel**
> MagicSchemasTunnelDeletedResponse magicIpsecTunnelsDeleteIpsecTunnel(tunnelIdentifier, accountId)

Delete IPsec Tunnel

Disables and removes a specific static IPsec Tunnel associated with an account. Use &#x60;?validate_only&#x3D;true&#x60; as an optional query parameter to only run validation without persisting changes.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.MagicIPsecTunnelsApi;

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

    MagicIPsecTunnelsApi apiInstance = new MagicIPsecTunnelsApi(defaultClient);
    String tunnelIdentifier = "tunnelIdentifier_example"; // String | 
    String accountId = "accountId_example"; // String | 
    try {
      MagicSchemasTunnelDeletedResponse result = apiInstance.magicIpsecTunnelsDeleteIpsecTunnel(tunnelIdentifier, accountId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling MagicIPsecTunnelsApi#magicIpsecTunnelsDeleteIpsecTunnel");
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

[**MagicSchemasTunnelDeletedResponse**](MagicSchemasTunnelDeletedResponse.md)

### Authorization

[api_key](../README.md#api_key), [api_email](../README.md#api_email)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Delete IPsec Tunnel response |  -  |
| **4XX** | Delete IPsec Tunnel response failure |  -  |

<a id="magicIpsecTunnelsGeneratePreSharedKeyPskForIpsecTunnels"></a>
# **magicIpsecTunnelsGeneratePreSharedKeyPskForIpsecTunnels**
> MagicPskGenerationResponse magicIpsecTunnelsGeneratePreSharedKeyPskForIpsecTunnels(tunnelIdentifier, accountId)

Generate Pre Shared Key (PSK) for IPsec tunnels

Generates a Pre Shared Key for a specific IPsec tunnel used in the IKE session. Use &#x60;?validate_only&#x3D;true&#x60; as an optional query parameter to only run validation without persisting changes. After a PSK is generated, the PSK is immediately persisted to Cloudflare&#39;s edge and cannot be retrieved later. Note the PSK in a safe place.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.MagicIPsecTunnelsApi;

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

    MagicIPsecTunnelsApi apiInstance = new MagicIPsecTunnelsApi(defaultClient);
    String tunnelIdentifier = "tunnelIdentifier_example"; // String | 
    String accountId = "accountId_example"; // String | 
    try {
      MagicPskGenerationResponse result = apiInstance.magicIpsecTunnelsGeneratePreSharedKeyPskForIpsecTunnels(tunnelIdentifier, accountId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling MagicIPsecTunnelsApi#magicIpsecTunnelsGeneratePreSharedKeyPskForIpsecTunnels");
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

[**MagicPskGenerationResponse**](MagicPskGenerationResponse.md)

### Authorization

[api_key](../README.md#api_key), [api_email](../README.md#api_email)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Generate Pre Shared Key (PSK) for IPsec tunnels response |  -  |
| **4xx** | Generate Pre Shared Key (PSK) for IPsec tunnels response failure |  -  |

<a id="magicIpsecTunnelsListIpsecTunnelDetails"></a>
# **magicIpsecTunnelsListIpsecTunnelDetails**
> MagicSchemasTunnelSingleResponse magicIpsecTunnelsListIpsecTunnelDetails(tunnelIdentifier, accountId)

List IPsec tunnel details

Lists details for a specific IPsec tunnel.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.MagicIPsecTunnelsApi;

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

    MagicIPsecTunnelsApi apiInstance = new MagicIPsecTunnelsApi(defaultClient);
    String tunnelIdentifier = "tunnelIdentifier_example"; // String | 
    String accountId = "accountId_example"; // String | 
    try {
      MagicSchemasTunnelSingleResponse result = apiInstance.magicIpsecTunnelsListIpsecTunnelDetails(tunnelIdentifier, accountId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling MagicIPsecTunnelsApi#magicIpsecTunnelsListIpsecTunnelDetails");
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

[**MagicSchemasTunnelSingleResponse**](MagicSchemasTunnelSingleResponse.md)

### Authorization

[api_key](../README.md#api_key), [api_email](../README.md#api_email)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | List IPsec tunnel details response |  -  |
| **4XX** | List IPsec tunnel details response failure |  -  |

<a id="magicIpsecTunnelsListIpsecTunnels"></a>
# **magicIpsecTunnelsListIpsecTunnels**
> MagicSchemasTunnelsCollectionResponse magicIpsecTunnelsListIpsecTunnels(accountId)

List IPsec tunnels

Lists IPsec tunnels associated with an account.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.MagicIPsecTunnelsApi;

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

    MagicIPsecTunnelsApi apiInstance = new MagicIPsecTunnelsApi(defaultClient);
    String accountId = "accountId_example"; // String | 
    try {
      MagicSchemasTunnelsCollectionResponse result = apiInstance.magicIpsecTunnelsListIpsecTunnels(accountId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling MagicIPsecTunnelsApi#magicIpsecTunnelsListIpsecTunnels");
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

[**MagicSchemasTunnelsCollectionResponse**](MagicSchemasTunnelsCollectionResponse.md)

### Authorization

[api_key](../README.md#api_key), [api_email](../README.md#api_email)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | List IPsec tunnels response |  -  |
| **4XX** | List IPsec tunnels response failure |  -  |

<a id="magicIpsecTunnelsUpdateIpsecTunnel"></a>
# **magicIpsecTunnelsUpdateIpsecTunnel**
> MagicSchemasTunnelModifiedResponse magicIpsecTunnelsUpdateIpsecTunnel(tunnelIdentifier, accountId, magicSchemasTunnelUpdateRequest)

Update IPsec Tunnel

Updates a specific IPsec tunnel associated with an account. Use &#x60;?validate_only&#x3D;true&#x60; as an optional query parameter to only run validation without persisting changes.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.MagicIPsecTunnelsApi;

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

    MagicIPsecTunnelsApi apiInstance = new MagicIPsecTunnelsApi(defaultClient);
    String tunnelIdentifier = "tunnelIdentifier_example"; // String | 
    String accountId = "accountId_example"; // String | 
    MagicSchemasTunnelUpdateRequest magicSchemasTunnelUpdateRequest = new MagicSchemasTunnelUpdateRequest(); // MagicSchemasTunnelUpdateRequest | 
    try {
      MagicSchemasTunnelModifiedResponse result = apiInstance.magicIpsecTunnelsUpdateIpsecTunnel(tunnelIdentifier, accountId, magicSchemasTunnelUpdateRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling MagicIPsecTunnelsApi#magicIpsecTunnelsUpdateIpsecTunnel");
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
| **magicSchemasTunnelUpdateRequest** | [**MagicSchemasTunnelUpdateRequest**](MagicSchemasTunnelUpdateRequest.md)|  | |

### Return type

[**MagicSchemasTunnelModifiedResponse**](MagicSchemasTunnelModifiedResponse.md)

### Authorization

[api_key](../README.md#api_key), [api_email](../README.md#api_email)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Update IPsec Tunnel response |  -  |
| **4XX** | Update IPsec Tunnel response failure |  -  |

<a id="magicIpsecTunnelsUpdateMultipleIpsecTunnels"></a>
# **magicIpsecTunnelsUpdateMultipleIpsecTunnels**
> MagicSchemasModifiedTunnelsCollectionResponse magicIpsecTunnelsUpdateMultipleIpsecTunnels(accountId, body)

Update multiple IPsec tunnels

Update multiple IPsec tunnels associated with an account. Use &#x60;?validate_only&#x3D;true&#x60; as an optional query parameter to only run validation without persisting changes.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.MagicIPsecTunnelsApi;

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

    MagicIPsecTunnelsApi apiInstance = new MagicIPsecTunnelsApi(defaultClient);
    String accountId = "accountId_example"; // String | 
    Object body = null; // Object | 
    try {
      MagicSchemasModifiedTunnelsCollectionResponse result = apiInstance.magicIpsecTunnelsUpdateMultipleIpsecTunnels(accountId, body);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling MagicIPsecTunnelsApi#magicIpsecTunnelsUpdateMultipleIpsecTunnels");
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

[**MagicSchemasModifiedTunnelsCollectionResponse**](MagicSchemasModifiedTunnelsCollectionResponse.md)

### Authorization

[api_key](../README.md#api_key), [api_email](../README.md#api_email)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Update multiple IPsec tunnels response |  -  |
| **4XX** | Update multiple IPsec tunnels response failure |  -  |

