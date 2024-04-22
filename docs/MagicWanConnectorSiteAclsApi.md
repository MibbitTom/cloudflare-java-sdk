# MagicWanConnectorSiteAclsApi

All URIs are relative to *https://api.cloudflare.com/client/v4*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**magicSiteAclsAclDetails**](MagicWanConnectorSiteAclsApi.md#magicSiteAclsAclDetails) | **GET** /accounts/{account_id}/magic/sites/{site_id}/acls/{acl_identifier} | Site ACL Details |
| [**magicSiteAclsCreateSiteAcl**](MagicWanConnectorSiteAclsApi.md#magicSiteAclsCreateSiteAcl) | **POST** /accounts/{account_id}/magic/sites/{site_id}/acls | Create a new Site ACL |
| [**magicSiteAclsDeleteAcl**](MagicWanConnectorSiteAclsApi.md#magicSiteAclsDeleteAcl) | **DELETE** /accounts/{account_id}/magic/sites/{site_id}/acls/{acl_identifier} | Delete Site ACL |
| [**magicSiteAclsListAcls**](MagicWanConnectorSiteAclsApi.md#magicSiteAclsListAcls) | **GET** /accounts/{account_id}/magic/sites/{site_id}/acls | List Site ACLs |
| [**magicSiteAclsUpdateAcl**](MagicWanConnectorSiteAclsApi.md#magicSiteAclsUpdateAcl) | **PUT** /accounts/{account_id}/magic/sites/{site_id}/acls/{acl_identifier} | Update Site ACL |


<a id="magicSiteAclsAclDetails"></a>
# **magicSiteAclsAclDetails**
> MagicAclSingleResponse magicSiteAclsAclDetails(siteId, accountId, aclIdentifier)

Site ACL Details

Get a specific Site ACL.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.MagicWanConnectorSiteAclsApi;

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

    MagicWanConnectorSiteAclsApi apiInstance = new MagicWanConnectorSiteAclsApi(defaultClient);
    String siteId = "siteId_example"; // String | 
    String accountId = "accountId_example"; // String | 
    String aclIdentifier = "aclIdentifier_example"; // String | 
    try {
      MagicAclSingleResponse result = apiInstance.magicSiteAclsAclDetails(siteId, accountId, aclIdentifier);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling MagicWanConnectorSiteAclsApi#magicSiteAclsAclDetails");
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
| **aclIdentifier** | **String**|  | |

### Return type

[**MagicAclSingleResponse**](MagicAclSingleResponse.md)

### Authorization

[api_key](../README.md#api_key), [api_email](../README.md#api_email)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Site ACL Details response |  -  |
| **4XX** | Site ACL Details response failure |  -  |

<a id="magicSiteAclsCreateSiteAcl"></a>
# **magicSiteAclsCreateSiteAcl**
> MagicAclsCollectionResponse magicSiteAclsCreateSiteAcl(accountId, siteId, magicAclsAddSingleRequest)

Create a new Site ACL

Creates a new Site ACL.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.MagicWanConnectorSiteAclsApi;

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

    MagicWanConnectorSiteAclsApi apiInstance = new MagicWanConnectorSiteAclsApi(defaultClient);
    String accountId = "accountId_example"; // String | 
    String siteId = "siteId_example"; // String | 
    MagicAclsAddSingleRequest magicAclsAddSingleRequest = new MagicAclsAddSingleRequest(); // MagicAclsAddSingleRequest | 
    try {
      MagicAclsCollectionResponse result = apiInstance.magicSiteAclsCreateSiteAcl(accountId, siteId, magicAclsAddSingleRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling MagicWanConnectorSiteAclsApi#magicSiteAclsCreateSiteAcl");
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
| **magicAclsAddSingleRequest** | [**MagicAclsAddSingleRequest**](MagicAclsAddSingleRequest.md)|  | |

### Return type

[**MagicAclsCollectionResponse**](MagicAclsCollectionResponse.md)

### Authorization

[api_key](../README.md#api_key), [api_email](../README.md#api_email)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Create Site ACL response |  -  |
| **4XX** | Create Site ACL response failure |  -  |

<a id="magicSiteAclsDeleteAcl"></a>
# **magicSiteAclsDeleteAcl**
> MagicAclDeletedResponse magicSiteAclsDeleteAcl(siteId, accountId, aclIdentifier)

Delete Site ACL

Remove a specific Site ACL.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.MagicWanConnectorSiteAclsApi;

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

    MagicWanConnectorSiteAclsApi apiInstance = new MagicWanConnectorSiteAclsApi(defaultClient);
    String siteId = "siteId_example"; // String | 
    String accountId = "accountId_example"; // String | 
    String aclIdentifier = "aclIdentifier_example"; // String | 
    try {
      MagicAclDeletedResponse result = apiInstance.magicSiteAclsDeleteAcl(siteId, accountId, aclIdentifier);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling MagicWanConnectorSiteAclsApi#magicSiteAclsDeleteAcl");
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
| **aclIdentifier** | **String**|  | |

### Return type

[**MagicAclDeletedResponse**](MagicAclDeletedResponse.md)

### Authorization

[api_key](../README.md#api_key), [api_email](../README.md#api_email)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Delete Site ACL response |  -  |
| **4XX** | Delete Site ACL response failure |  -  |

<a id="magicSiteAclsListAcls"></a>
# **magicSiteAclsListAcls**
> MagicAclsCollectionResponse magicSiteAclsListAcls(accountId, siteId)

List Site ACLs

Lists Site ACLs associated with an account.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.MagicWanConnectorSiteAclsApi;

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

    MagicWanConnectorSiteAclsApi apiInstance = new MagicWanConnectorSiteAclsApi(defaultClient);
    String accountId = "accountId_example"; // String | 
    String siteId = "siteId_example"; // String | 
    try {
      MagicAclsCollectionResponse result = apiInstance.magicSiteAclsListAcls(accountId, siteId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling MagicWanConnectorSiteAclsApi#magicSiteAclsListAcls");
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

[**MagicAclsCollectionResponse**](MagicAclsCollectionResponse.md)

### Authorization

[api_key](../README.md#api_key), [api_email](../README.md#api_email)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | List Site ACLs response |  -  |
| **4XX** | List Site ACLs response failure |  -  |

<a id="magicSiteAclsUpdateAcl"></a>
# **magicSiteAclsUpdateAcl**
> MagicAclModifiedResponse magicSiteAclsUpdateAcl(siteId, accountId, aclIdentifier, magicAclUpdateRequest)

Update Site ACL

Update a specific Site ACL.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.MagicWanConnectorSiteAclsApi;

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

    MagicWanConnectorSiteAclsApi apiInstance = new MagicWanConnectorSiteAclsApi(defaultClient);
    String siteId = "siteId_example"; // String | 
    String accountId = "accountId_example"; // String | 
    String aclIdentifier = "aclIdentifier_example"; // String | 
    MagicAclUpdateRequest magicAclUpdateRequest = new MagicAclUpdateRequest(); // MagicAclUpdateRequest | 
    try {
      MagicAclModifiedResponse result = apiInstance.magicSiteAclsUpdateAcl(siteId, accountId, aclIdentifier, magicAclUpdateRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling MagicWanConnectorSiteAclsApi#magicSiteAclsUpdateAcl");
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
| **aclIdentifier** | **String**|  | |
| **magicAclUpdateRequest** | [**MagicAclUpdateRequest**](MagicAclUpdateRequest.md)|  | |

### Return type

[**MagicAclModifiedResponse**](MagicAclModifiedResponse.md)

### Authorization

[api_key](../README.md#api_key), [api_email](../README.md#api_email)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Update Site ACL response |  -  |
| **4XX** | Update Site ACL response failure |  -  |

