# SecondaryDnsAclApi

All URIs are relative to *https://api.cloudflare.com/client/v4*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**secondaryDnsAclAclDetails**](SecondaryDnsAclApi.md#secondaryDnsAclAclDetails) | **GET** /accounts/{account_id}/secondary_dns/acls/{acl_id} | ACL Details |
| [**secondaryDnsAclCreateAcl**](SecondaryDnsAclApi.md#secondaryDnsAclCreateAcl) | **POST** /accounts/{account_id}/secondary_dns/acls | Create ACL |
| [**secondaryDnsAclDeleteAcl**](SecondaryDnsAclApi.md#secondaryDnsAclDeleteAcl) | **DELETE** /accounts/{account_id}/secondary_dns/acls/{acl_id} | Delete ACL |
| [**secondaryDnsAclListAcLs**](SecondaryDnsAclApi.md#secondaryDnsAclListAcLs) | **GET** /accounts/{account_id}/secondary_dns/acls | List ACLs |
| [**secondaryDnsAclUpdateAcl**](SecondaryDnsAclApi.md#secondaryDnsAclUpdateAcl) | **PUT** /accounts/{account_id}/secondary_dns/acls/{acl_id} | Update ACL |


<a id="secondaryDnsAclAclDetails"></a>
# **secondaryDnsAclAclDetails**
> SecondaryDnsComponentsSchemasSingleResponse secondaryDnsAclAclDetails(aclId, accountId)

ACL Details

Get ACL.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.SecondaryDnsAclApi;

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

    SecondaryDnsAclApi apiInstance = new SecondaryDnsAclApi(defaultClient);
    Object aclId = null; // Object | 
    Object accountId = null; // Object | 
    try {
      SecondaryDnsComponentsSchemasSingleResponse result = apiInstance.secondaryDnsAclAclDetails(aclId, accountId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling SecondaryDnsAclApi#secondaryDnsAclAclDetails");
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
| **aclId** | [**Object**](.md)|  | |
| **accountId** | [**Object**](.md)|  | |

### Return type

[**SecondaryDnsComponentsSchemasSingleResponse**](SecondaryDnsComponentsSchemasSingleResponse.md)

### Authorization

[api_key](../README.md#api_key), [api_email](../README.md#api_email)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | ACL Details response |  -  |
| **4XX** | ACL Details response failure |  -  |

<a id="secondaryDnsAclCreateAcl"></a>
# **secondaryDnsAclCreateAcl**
> SecondaryDnsComponentsSchemasSingleResponse secondaryDnsAclCreateAcl(accountId, body)

Create ACL

Create ACL.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.SecondaryDnsAclApi;

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

    SecondaryDnsAclApi apiInstance = new SecondaryDnsAclApi(defaultClient);
    Object accountId = null; // Object | 
    Object body = null; // Object | 
    try {
      SecondaryDnsComponentsSchemasSingleResponse result = apiInstance.secondaryDnsAclCreateAcl(accountId, body);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling SecondaryDnsAclApi#secondaryDnsAclCreateAcl");
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

[**SecondaryDnsComponentsSchemasSingleResponse**](SecondaryDnsComponentsSchemasSingleResponse.md)

### Authorization

[api_key](../README.md#api_key), [api_email](../README.md#api_email)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Create ACL response |  -  |
| **4XX** | Create ACL response failure |  -  |

<a id="secondaryDnsAclDeleteAcl"></a>
# **secondaryDnsAclDeleteAcl**
> SecondaryDnsComponentsSchemasIdResponse secondaryDnsAclDeleteAcl(aclId, accountId)

Delete ACL

Delete ACL.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.SecondaryDnsAclApi;

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

    SecondaryDnsAclApi apiInstance = new SecondaryDnsAclApi(defaultClient);
    Object aclId = null; // Object | 
    Object accountId = null; // Object | 
    try {
      SecondaryDnsComponentsSchemasIdResponse result = apiInstance.secondaryDnsAclDeleteAcl(aclId, accountId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling SecondaryDnsAclApi#secondaryDnsAclDeleteAcl");
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
| **aclId** | [**Object**](.md)|  | |
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
| **200** | Delete ACL response |  -  |
| **4XX** | Delete ACL response failure |  -  |

<a id="secondaryDnsAclListAcLs"></a>
# **secondaryDnsAclListAcLs**
> SecondaryDnsComponentsSchemasResponseCollection secondaryDnsAclListAcLs(accountId)

List ACLs

List ACLs.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.SecondaryDnsAclApi;

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

    SecondaryDnsAclApi apiInstance = new SecondaryDnsAclApi(defaultClient);
    Object accountId = null; // Object | 
    try {
      SecondaryDnsComponentsSchemasResponseCollection result = apiInstance.secondaryDnsAclListAcLs(accountId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling SecondaryDnsAclApi#secondaryDnsAclListAcLs");
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

[**SecondaryDnsComponentsSchemasResponseCollection**](SecondaryDnsComponentsSchemasResponseCollection.md)

### Authorization

[api_key](../README.md#api_key), [api_email](../README.md#api_email)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | List ACLs response |  -  |
| **4XX** | List ACLs response failure |  -  |

<a id="secondaryDnsAclUpdateAcl"></a>
# **secondaryDnsAclUpdateAcl**
> SecondaryDnsComponentsSchemasSingleResponse secondaryDnsAclUpdateAcl(aclId, accountId, secondaryDnsAcl)

Update ACL

Modify ACL.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.SecondaryDnsAclApi;

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

    SecondaryDnsAclApi apiInstance = new SecondaryDnsAclApi(defaultClient);
    Object aclId = null; // Object | 
    Object accountId = null; // Object | 
    SecondaryDnsAcl secondaryDnsAcl = new SecondaryDnsAcl(); // SecondaryDnsAcl | 
    try {
      SecondaryDnsComponentsSchemasSingleResponse result = apiInstance.secondaryDnsAclUpdateAcl(aclId, accountId, secondaryDnsAcl);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling SecondaryDnsAclApi#secondaryDnsAclUpdateAcl");
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
| **aclId** | [**Object**](.md)|  | |
| **accountId** | [**Object**](.md)|  | |
| **secondaryDnsAcl** | [**SecondaryDnsAcl**](SecondaryDnsAcl.md)|  | |

### Return type

[**SecondaryDnsComponentsSchemasSingleResponse**](SecondaryDnsComponentsSchemasSingleResponse.md)

### Authorization

[api_key](../README.md#api_key), [api_email](../README.md#api_email)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Update ACL response |  -  |
| **4XX** | Update ACL response failure |  -  |

