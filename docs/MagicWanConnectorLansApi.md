# MagicWanConnectorLansApi

All URIs are relative to *https://api.cloudflare.com/client/v4*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**magicWanConnectorsLansCreateLan**](MagicWanConnectorLansApi.md#magicWanConnectorsLansCreateLan) | **POST** /accounts/{account_id}/magic/sites/{site_id}/lans | Create a new LAN |
| [**magicWanConnectorsLansDeleteLan**](MagicWanConnectorLansApi.md#magicWanConnectorsLansDeleteLan) | **DELETE** /accounts/{account_id}/magic/sites/{site_id}/lans/{lan_id} | Delete LAN |
| [**magicWanConnectorsLansLanDetails**](MagicWanConnectorLansApi.md#magicWanConnectorsLansLanDetails) | **GET** /accounts/{account_id}/magic/sites/{site_id}/lans/{lan_id} | LAN Details |
| [**magicWanConnectorsLansListLans**](MagicWanConnectorLansApi.md#magicWanConnectorsLansListLans) | **GET** /accounts/{account_id}/magic/sites/{site_id}/lans | List LANs |
| [**magicWanConnectorsLansUpdateLan**](MagicWanConnectorLansApi.md#magicWanConnectorsLansUpdateLan) | **PUT** /accounts/{account_id}/magic/sites/{site_id}/lans/{lan_id} | Update LAN |


<a id="magicWanConnectorsLansCreateLan"></a>
# **magicWanConnectorsLansCreateLan**
> MagicLansCollectionResponse magicWanConnectorsLansCreateLan(accountId, siteId, magicLansAddSingleRequest)

Create a new LAN

Creates a new LAN. If the site is in high availability mode, static_addressing is required along with secondary and virtual address.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.MagicWanConnectorLansApi;

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

    MagicWanConnectorLansApi apiInstance = new MagicWanConnectorLansApi(defaultClient);
    String accountId = "accountId_example"; // String | 
    String siteId = "siteId_example"; // String | 
    MagicLansAddSingleRequest magicLansAddSingleRequest = new MagicLansAddSingleRequest(); // MagicLansAddSingleRequest | 
    try {
      MagicLansCollectionResponse result = apiInstance.magicWanConnectorsLansCreateLan(accountId, siteId, magicLansAddSingleRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling MagicWanConnectorLansApi#magicWanConnectorsLansCreateLan");
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
| **magicLansAddSingleRequest** | [**MagicLansAddSingleRequest**](MagicLansAddSingleRequest.md)|  | |

### Return type

[**MagicLansCollectionResponse**](MagicLansCollectionResponse.md)

### Authorization

[api_key](../README.md#api_key), [api_email](../README.md#api_email)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Create LAN response |  -  |
| **4XX** | Create LAN response failure |  -  |

<a id="magicWanConnectorsLansDeleteLan"></a>
# **magicWanConnectorsLansDeleteLan**
> MagicLanDeletedResponse magicWanConnectorsLansDeleteLan(siteId, accountId, lanId)

Delete LAN

Remove a specific LAN.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.MagicWanConnectorLansApi;

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

    MagicWanConnectorLansApi apiInstance = new MagicWanConnectorLansApi(defaultClient);
    String siteId = "siteId_example"; // String | 
    String accountId = "accountId_example"; // String | 
    String lanId = "lanId_example"; // String | 
    try {
      MagicLanDeletedResponse result = apiInstance.magicWanConnectorsLansDeleteLan(siteId, accountId, lanId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling MagicWanConnectorLansApi#magicWanConnectorsLansDeleteLan");
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
| **lanId** | **String**|  | |

### Return type

[**MagicLanDeletedResponse**](MagicLanDeletedResponse.md)

### Authorization

[api_key](../README.md#api_key), [api_email](../README.md#api_email)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Delete LAN response |  -  |
| **4XX** | Delete LAN response failure |  -  |

<a id="magicWanConnectorsLansLanDetails"></a>
# **magicWanConnectorsLansLanDetails**
> MagicLanSingleResponse magicWanConnectorsLansLanDetails(siteId, accountId, lanId)

LAN Details

Get a specific LAN.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.MagicWanConnectorLansApi;

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

    MagicWanConnectorLansApi apiInstance = new MagicWanConnectorLansApi(defaultClient);
    String siteId = "siteId_example"; // String | 
    String accountId = "accountId_example"; // String | 
    String lanId = "lanId_example"; // String | 
    try {
      MagicLanSingleResponse result = apiInstance.magicWanConnectorsLansLanDetails(siteId, accountId, lanId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling MagicWanConnectorLansApi#magicWanConnectorsLansLanDetails");
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
| **lanId** | **String**|  | |

### Return type

[**MagicLanSingleResponse**](MagicLanSingleResponse.md)

### Authorization

[api_key](../README.md#api_key), [api_email](../README.md#api_email)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | LAN Details response |  -  |
| **4XX** | LAN Details response failure |  -  |

<a id="magicWanConnectorsLansListLans"></a>
# **magicWanConnectorsLansListLans**
> MagicLansCollectionResponse magicWanConnectorsLansListLans(accountId, siteId)

List LANs

Lists LANs associated with an account and site.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.MagicWanConnectorLansApi;

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

    MagicWanConnectorLansApi apiInstance = new MagicWanConnectorLansApi(defaultClient);
    String accountId = "accountId_example"; // String | 
    String siteId = "siteId_example"; // String | 
    try {
      MagicLansCollectionResponse result = apiInstance.magicWanConnectorsLansListLans(accountId, siteId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling MagicWanConnectorLansApi#magicWanConnectorsLansListLans");
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

[**MagicLansCollectionResponse**](MagicLansCollectionResponse.md)

### Authorization

[api_key](../README.md#api_key), [api_email](../README.md#api_email)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | List LANs response |  -  |
| **4XX** | List LANs response failure |  -  |

<a id="magicWanConnectorsLansUpdateLan"></a>
# **magicWanConnectorsLansUpdateLan**
> MagicLanModifiedResponse magicWanConnectorsLansUpdateLan(siteId, accountId, lanId, magicLanUpdateRequest)

Update LAN

Update a specific LAN.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.MagicWanConnectorLansApi;

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

    MagicWanConnectorLansApi apiInstance = new MagicWanConnectorLansApi(defaultClient);
    String siteId = "siteId_example"; // String | 
    String accountId = "accountId_example"; // String | 
    String lanId = "lanId_example"; // String | 
    MagicLanUpdateRequest magicLanUpdateRequest = new MagicLanUpdateRequest(); // MagicLanUpdateRequest | 
    try {
      MagicLanModifiedResponse result = apiInstance.magicWanConnectorsLansUpdateLan(siteId, accountId, lanId, magicLanUpdateRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling MagicWanConnectorLansApi#magicWanConnectorsLansUpdateLan");
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
| **lanId** | **String**|  | |
| **magicLanUpdateRequest** | [**MagicLanUpdateRequest**](MagicLanUpdateRequest.md)|  | |

### Return type

[**MagicLanModifiedResponse**](MagicLanModifiedResponse.md)

### Authorization

[api_key](../README.md#api_key), [api_email](../README.md#api_email)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Update LAN response |  -  |
| **4XX** | Update LAN response failure |  -  |

