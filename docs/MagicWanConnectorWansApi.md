# MagicWanConnectorWansApi

All URIs are relative to *https://api.cloudflare.com/client/v4*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**magicWanConnectorsCreateWan**](MagicWanConnectorWansApi.md#magicWanConnectorsCreateWan) | **POST** /accounts/{account_id}/magic/sites/{site_id}/wans | Create a new WAN |
| [**magicWanConnectorsDeleteWan**](MagicWanConnectorWansApi.md#magicWanConnectorsDeleteWan) | **DELETE** /accounts/{account_id}/magic/sites/{site_id}/wans/{wan_id} | Delete WAN |
| [**magicWanConnectorsListWans**](MagicWanConnectorWansApi.md#magicWanConnectorsListWans) | **GET** /accounts/{account_id}/magic/sites/{site_id}/wans | List WANs |
| [**magicWanConnectorsUpdateWan**](MagicWanConnectorWansApi.md#magicWanConnectorsUpdateWan) | **PUT** /accounts/{account_id}/magic/sites/{site_id}/wans/{wan_id} | Update WAN |
| [**magicWanConnectorsWanDetails**](MagicWanConnectorWansApi.md#magicWanConnectorsWanDetails) | **GET** /accounts/{account_id}/magic/sites/{site_id}/wans/{wan_id} | WAN Details |


<a id="magicWanConnectorsCreateWan"></a>
# **magicWanConnectorsCreateWan**
> MagicWansCollectionResponse magicWanConnectorsCreateWan(accountId, siteId, magicWansAddSingleRequest)

Create a new WAN

Creates a new WAN.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.MagicWanConnectorWansApi;

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

    MagicWanConnectorWansApi apiInstance = new MagicWanConnectorWansApi(defaultClient);
    String accountId = "accountId_example"; // String | 
    String siteId = "siteId_example"; // String | 
    MagicWansAddSingleRequest magicWansAddSingleRequest = new MagicWansAddSingleRequest(); // MagicWansAddSingleRequest | 
    try {
      MagicWansCollectionResponse result = apiInstance.magicWanConnectorsCreateWan(accountId, siteId, magicWansAddSingleRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling MagicWanConnectorWansApi#magicWanConnectorsCreateWan");
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
| **siteId** | **String**|  | |
| **magicWansAddSingleRequest** | [**MagicWansAddSingleRequest**](MagicWansAddSingleRequest.md)|  | |

### Return type

[**MagicWansCollectionResponse**](MagicWansCollectionResponse.md)

### Authorization

[api_key](../README.md#api_key), [api_email](../README.md#api_email)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Create WAN response |  -  |
| **4XX** | Create WAN response failure |  -  |

<a id="magicWanConnectorsDeleteWan"></a>
# **magicWanConnectorsDeleteWan**
> MagicWanDeletedResponse magicWanConnectorsDeleteWan(siteId, accountId, wanId)

Delete WAN

Remove a specific WAN.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.MagicWanConnectorWansApi;

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

    MagicWanConnectorWansApi apiInstance = new MagicWanConnectorWansApi(defaultClient);
    String siteId = "siteId_example"; // String | 
    String accountId = "accountId_example"; // String | 
    String wanId = "wanId_example"; // String | 
    try {
      MagicWanDeletedResponse result = apiInstance.magicWanConnectorsDeleteWan(siteId, accountId, wanId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling MagicWanConnectorWansApi#magicWanConnectorsDeleteWan");
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
| **siteId** | **String**|  | |
| **accountId** | **String**|  | |
| **wanId** | **String**|  | |

### Return type

[**MagicWanDeletedResponse**](MagicWanDeletedResponse.md)

### Authorization

[api_key](../README.md#api_key), [api_email](../README.md#api_email)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Delete WAN response |  -  |
| **4XX** | Delete WAN response failure |  -  |

<a id="magicWanConnectorsListWans"></a>
# **magicWanConnectorsListWans**
> MagicWansCollectionResponse magicWanConnectorsListWans(accountId, siteId)

List WANs

Lists WANs associated with an account and site.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.MagicWanConnectorWansApi;

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

    MagicWanConnectorWansApi apiInstance = new MagicWanConnectorWansApi(defaultClient);
    String accountId = "accountId_example"; // String | 
    String siteId = "siteId_example"; // String | 
    try {
      MagicWansCollectionResponse result = apiInstance.magicWanConnectorsListWans(accountId, siteId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling MagicWanConnectorWansApi#magicWanConnectorsListWans");
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
| **siteId** | **String**|  | |

### Return type

[**MagicWansCollectionResponse**](MagicWansCollectionResponse.md)

### Authorization

[api_key](../README.md#api_key), [api_email](../README.md#api_email)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | List WANs response |  -  |
| **4XX** | List WANs response failure |  -  |

<a id="magicWanConnectorsUpdateWan"></a>
# **magicWanConnectorsUpdateWan**
> MagicWanModifiedResponse magicWanConnectorsUpdateWan(siteId, accountId, wanId, magicWanUpdateRequest)

Update WAN

Update a specific WAN.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.MagicWanConnectorWansApi;

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

    MagicWanConnectorWansApi apiInstance = new MagicWanConnectorWansApi(defaultClient);
    String siteId = "siteId_example"; // String | 
    String accountId = "accountId_example"; // String | 
    String wanId = "wanId_example"; // String | 
    MagicWanUpdateRequest magicWanUpdateRequest = new MagicWanUpdateRequest(); // MagicWanUpdateRequest | 
    try {
      MagicWanModifiedResponse result = apiInstance.magicWanConnectorsUpdateWan(siteId, accountId, wanId, magicWanUpdateRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling MagicWanConnectorWansApi#magicWanConnectorsUpdateWan");
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
| **siteId** | **String**|  | |
| **accountId** | **String**|  | |
| **wanId** | **String**|  | |
| **magicWanUpdateRequest** | [**MagicWanUpdateRequest**](MagicWanUpdateRequest.md)|  | |

### Return type

[**MagicWanModifiedResponse**](MagicWanModifiedResponse.md)

### Authorization

[api_key](../README.md#api_key), [api_email](../README.md#api_email)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Update WAN response |  -  |
| **4XX** | Update WAN response failure |  -  |

<a id="magicWanConnectorsWanDetails"></a>
# **magicWanConnectorsWanDetails**
> MagicWanSingleResponse magicWanConnectorsWanDetails(siteId, accountId, wanId)

WAN Details

Get a specific WAN.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.MagicWanConnectorWansApi;

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

    MagicWanConnectorWansApi apiInstance = new MagicWanConnectorWansApi(defaultClient);
    String siteId = "siteId_example"; // String | 
    String accountId = "accountId_example"; // String | 
    String wanId = "wanId_example"; // String | 
    try {
      MagicWanSingleResponse result = apiInstance.magicWanConnectorsWanDetails(siteId, accountId, wanId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling MagicWanConnectorWansApi#magicWanConnectorsWanDetails");
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
| **siteId** | **String**|  | |
| **accountId** | **String**|  | |
| **wanId** | **String**|  | |

### Return type

[**MagicWanSingleResponse**](MagicWanSingleResponse.md)

### Authorization

[api_key](../README.md#api_key), [api_email](../README.md#api_email)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | WAN Details response |  -  |
| **4XX** | WAN Details response failure |  -  |

