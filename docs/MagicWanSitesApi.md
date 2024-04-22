# MagicWanSitesApi

All URIs are relative to *https://api.cloudflare.com/client/v4*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**magicSitesCreateSite**](MagicWanSitesApi.md#magicSitesCreateSite) | **POST** /accounts/{account_id}/magic/sites | Create a new Site |
| [**magicSitesDeleteSite**](MagicWanSitesApi.md#magicSitesDeleteSite) | **DELETE** /accounts/{account_id}/magic/sites/{site_id} | Delete Site |
| [**magicSitesSiteDetails**](MagicWanSitesApi.md#magicSitesSiteDetails) | **GET** /accounts/{account_id}/magic/sites/{site_id} | Site Details |
| [**magicSitesUpdateSite**](MagicWanSitesApi.md#magicSitesUpdateSite) | **PUT** /accounts/{account_id}/magic/sites/{site_id} | Update Site |
| [**magicWanSitesListSites**](MagicWanSitesApi.md#magicWanSitesListSites) | **GET** /accounts/{account_id}/magic/sites | List Sites |


<a id="magicSitesCreateSite"></a>
# **magicSitesCreateSite**
> MagicSiteSingleResponse magicSitesCreateSite(accountId, magicSitesAddSingleRequest)

Create a new Site

Creates a new Site

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.MagicWanSitesApi;

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

    MagicWanSitesApi apiInstance = new MagicWanSitesApi(defaultClient);
    String accountId = "accountId_example"; // String | 
    MagicSitesAddSingleRequest magicSitesAddSingleRequest = new MagicSitesAddSingleRequest(); // MagicSitesAddSingleRequest | 
    try {
      MagicSiteSingleResponse result = apiInstance.magicSitesCreateSite(accountId, magicSitesAddSingleRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling MagicWanSitesApi#magicSitesCreateSite");
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
| **magicSitesAddSingleRequest** | [**MagicSitesAddSingleRequest**](MagicSitesAddSingleRequest.md)|  | |

### Return type

[**MagicSiteSingleResponse**](MagicSiteSingleResponse.md)

### Authorization

[api_key](../README.md#api_key), [api_email](../README.md#api_email)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Create Site response |  -  |
| **4XX** | Create Site response failure |  -  |

<a id="magicSitesDeleteSite"></a>
# **magicSitesDeleteSite**
> MagicSiteDeletedResponse magicSitesDeleteSite(siteId, accountId)

Delete Site

Remove a specific Site.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.MagicWanSitesApi;

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

    MagicWanSitesApi apiInstance = new MagicWanSitesApi(defaultClient);
    String siteId = "siteId_example"; // String | 
    String accountId = "accountId_example"; // String | 
    try {
      MagicSiteDeletedResponse result = apiInstance.magicSitesDeleteSite(siteId, accountId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling MagicWanSitesApi#magicSitesDeleteSite");
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

### Return type

[**MagicSiteDeletedResponse**](MagicSiteDeletedResponse.md)

### Authorization

[api_key](../README.md#api_key), [api_email](../README.md#api_email)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Delete Site response |  -  |
| **4XX** | Delete Site response failure |  -  |

<a id="magicSitesSiteDetails"></a>
# **magicSitesSiteDetails**
> MagicSiteSingleResponse magicSitesSiteDetails(siteId, accountId)

Site Details

Get a specific Site.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.MagicWanSitesApi;

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

    MagicWanSitesApi apiInstance = new MagicWanSitesApi(defaultClient);
    String siteId = "siteId_example"; // String | 
    String accountId = "accountId_example"; // String | 
    try {
      MagicSiteSingleResponse result = apiInstance.magicSitesSiteDetails(siteId, accountId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling MagicWanSitesApi#magicSitesSiteDetails");
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

### Return type

[**MagicSiteSingleResponse**](MagicSiteSingleResponse.md)

### Authorization

[api_key](../README.md#api_key), [api_email](../README.md#api_email)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Site Details response |  -  |
| **4XX** | Site Details response failure |  -  |

<a id="magicSitesUpdateSite"></a>
# **magicSitesUpdateSite**
> MagicSiteModifiedResponse magicSitesUpdateSite(siteId, accountId, magicSiteUpdateRequest)

Update Site

Update a specific Site.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.MagicWanSitesApi;

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

    MagicWanSitesApi apiInstance = new MagicWanSitesApi(defaultClient);
    String siteId = "siteId_example"; // String | 
    String accountId = "accountId_example"; // String | 
    MagicSiteUpdateRequest magicSiteUpdateRequest = new MagicSiteUpdateRequest(); // MagicSiteUpdateRequest | 
    try {
      MagicSiteModifiedResponse result = apiInstance.magicSitesUpdateSite(siteId, accountId, magicSiteUpdateRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling MagicWanSitesApi#magicSitesUpdateSite");
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
| **magicSiteUpdateRequest** | [**MagicSiteUpdateRequest**](MagicSiteUpdateRequest.md)|  | |

### Return type

[**MagicSiteModifiedResponse**](MagicSiteModifiedResponse.md)

### Authorization

[api_key](../README.md#api_key), [api_email](../README.md#api_email)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Update Site response |  -  |
| **4XX** | Update Site response failure |  -  |

<a id="magicWanSitesListSites"></a>
# **magicWanSitesListSites**
> MagicSitesCollectionResponse magicWanSitesListSites(accountId, connectorIdentifier)

List Sites

Lists Sites associated with an account. Use connector_identifier query param to return sites where connector_identifier matches either site.ConnectorID or site.SecondaryConnectorID.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.MagicWanSitesApi;

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

    MagicWanSitesApi apiInstance = new MagicWanSitesApi(defaultClient);
    String accountId = "accountId_example"; // String | 
    String connectorIdentifier = "connectorIdentifier_example"; // String | 
    try {
      MagicSitesCollectionResponse result = apiInstance.magicWanSitesListSites(accountId, connectorIdentifier);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling MagicWanSitesApi#magicWanSitesListSites");
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
| **connectorIdentifier** | **String**|  | [optional] |

### Return type

[**MagicSitesCollectionResponse**](MagicSitesCollectionResponse.md)

### Authorization

[api_key](../README.md#api_key), [api_email](../README.md#api_email)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | List Sites response |  -  |
| **4XX** | List Sites response failure |  -  |

