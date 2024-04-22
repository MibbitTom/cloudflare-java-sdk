# SecondaryDnsPeerApi

All URIs are relative to *https://api.cloudflare.com/client/v4*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**secondaryDnsPeerCreatePeer**](SecondaryDnsPeerApi.md#secondaryDnsPeerCreatePeer) | **POST** /accounts/{account_id}/secondary_dns/peers | Create Peer |
| [**secondaryDnsPeerDeletePeer**](SecondaryDnsPeerApi.md#secondaryDnsPeerDeletePeer) | **DELETE** /accounts/{account_id}/secondary_dns/peers/{peer_id} | Delete Peer |
| [**secondaryDnsPeerListPeers**](SecondaryDnsPeerApi.md#secondaryDnsPeerListPeers) | **GET** /accounts/{account_id}/secondary_dns/peers | List Peers |
| [**secondaryDnsPeerPeerDetails**](SecondaryDnsPeerApi.md#secondaryDnsPeerPeerDetails) | **GET** /accounts/{account_id}/secondary_dns/peers/{peer_id} | Peer Details |
| [**secondaryDnsPeerUpdatePeer**](SecondaryDnsPeerApi.md#secondaryDnsPeerUpdatePeer) | **PUT** /accounts/{account_id}/secondary_dns/peers/{peer_id} | Update Peer |


<a id="secondaryDnsPeerCreatePeer"></a>
# **secondaryDnsPeerCreatePeer**
> SecondaryDnsSchemasSingleResponse secondaryDnsPeerCreatePeer(accountId, body)

Create Peer

Create Peer.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.SecondaryDnsPeerApi;

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

    SecondaryDnsPeerApi apiInstance = new SecondaryDnsPeerApi(defaultClient);
    Object accountId = null; // Object | 
    Object body = null; // Object | 
    try {
      SecondaryDnsSchemasSingleResponse result = apiInstance.secondaryDnsPeerCreatePeer(accountId, body);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling SecondaryDnsPeerApi#secondaryDnsPeerCreatePeer");
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
| **body** | **Object**|  | |

### Return type

[**SecondaryDnsSchemasSingleResponse**](SecondaryDnsSchemasSingleResponse.md)

### Authorization

[api_key](../README.md#api_key), [api_email](../README.md#api_email)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Create Peer response |  -  |
| **4XX** | Create Peer response failure |  -  |

<a id="secondaryDnsPeerDeletePeer"></a>
# **secondaryDnsPeerDeletePeer**
> SecondaryDnsComponentsSchemasIdResponse secondaryDnsPeerDeletePeer(peerId, accountId)

Delete Peer

Delete Peer.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.SecondaryDnsPeerApi;

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

    SecondaryDnsPeerApi apiInstance = new SecondaryDnsPeerApi(defaultClient);
    Object peerId = null; // Object | 
    Object accountId = null; // Object | 
    try {
      SecondaryDnsComponentsSchemasIdResponse result = apiInstance.secondaryDnsPeerDeletePeer(peerId, accountId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling SecondaryDnsPeerApi#secondaryDnsPeerDeletePeer");
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
| **peerId** | [**Object**](.md)|  | |
| **accountId** | [**Object**](.md)|  | |

### Return type

[**SecondaryDnsComponentsSchemasIdResponse**](SecondaryDnsComponentsSchemasIdResponse.md)

### Authorization

[api_key](../README.md#api_key), [api_email](../README.md#api_email)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Delete Peer response |  -  |
| **4XX** | Delete Peer response failure |  -  |

<a id="secondaryDnsPeerListPeers"></a>
# **secondaryDnsPeerListPeers**
> SecondaryDnsSchemasResponseCollection secondaryDnsPeerListPeers(accountId)

List Peers

List Peers.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.SecondaryDnsPeerApi;

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

    SecondaryDnsPeerApi apiInstance = new SecondaryDnsPeerApi(defaultClient);
    Object accountId = null; // Object | 
    try {
      SecondaryDnsSchemasResponseCollection result = apiInstance.secondaryDnsPeerListPeers(accountId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling SecondaryDnsPeerApi#secondaryDnsPeerListPeers");
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

[**SecondaryDnsSchemasResponseCollection**](SecondaryDnsSchemasResponseCollection.md)

### Authorization

[api_key](../README.md#api_key), [api_email](../README.md#api_email)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | List Peers response |  -  |
| **4XX** | List Peers response failure |  -  |

<a id="secondaryDnsPeerPeerDetails"></a>
# **secondaryDnsPeerPeerDetails**
> SecondaryDnsSchemasSingleResponse secondaryDnsPeerPeerDetails(peerId, accountId)

Peer Details

Get Peer.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.SecondaryDnsPeerApi;

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

    SecondaryDnsPeerApi apiInstance = new SecondaryDnsPeerApi(defaultClient);
    Object peerId = null; // Object | 
    Object accountId = null; // Object | 
    try {
      SecondaryDnsSchemasSingleResponse result = apiInstance.secondaryDnsPeerPeerDetails(peerId, accountId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling SecondaryDnsPeerApi#secondaryDnsPeerPeerDetails");
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
| **peerId** | [**Object**](.md)|  | |
| **accountId** | [**Object**](.md)|  | |

### Return type

[**SecondaryDnsSchemasSingleResponse**](SecondaryDnsSchemasSingleResponse.md)

### Authorization

[api_key](../README.md#api_key), [api_email](../README.md#api_email)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Peer Details response |  -  |
| **4XX** | Peer Details response failure |  -  |

<a id="secondaryDnsPeerUpdatePeer"></a>
# **secondaryDnsPeerUpdatePeer**
> SecondaryDnsSchemasSingleResponse secondaryDnsPeerUpdatePeer(peerId, accountId, secondaryDnsPeer)

Update Peer

Modify Peer.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.SecondaryDnsPeerApi;

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

    SecondaryDnsPeerApi apiInstance = new SecondaryDnsPeerApi(defaultClient);
    Object peerId = null; // Object | 
    Object accountId = null; // Object | 
    SecondaryDnsPeer secondaryDnsPeer = new SecondaryDnsPeer(); // SecondaryDnsPeer | 
    try {
      SecondaryDnsSchemasSingleResponse result = apiInstance.secondaryDnsPeerUpdatePeer(peerId, accountId, secondaryDnsPeer);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling SecondaryDnsPeerApi#secondaryDnsPeerUpdatePeer");
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
| **peerId** | [**Object**](.md)|  | |
| **accountId** | [**Object**](.md)|  | |
| **secondaryDnsPeer** | [**SecondaryDnsPeer**](SecondaryDnsPeer.md)|  | |

### Return type

[**SecondaryDnsSchemasSingleResponse**](SecondaryDnsSchemasSingleResponse.md)

### Authorization

[api_key](../README.md#api_key), [api_email](../README.md#api_email)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Update Peer response |  -  |
| **4XX** | Update Peer response failure |  -  |

