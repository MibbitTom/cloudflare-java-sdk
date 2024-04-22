# AccessBookmarkApplicationsDeprecatedApi

All URIs are relative to *https://api.cloudflare.com/client/v4*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**accessBookmarkApplicationsDeprecatedCreateABookmarkApplication**](AccessBookmarkApplicationsDeprecatedApi.md#accessBookmarkApplicationsDeprecatedCreateABookmarkApplication) | **POST** /accounts/{identifier}/access/bookmarks/{uuid} | Create a Bookmark application |
| [**accessBookmarkApplicationsDeprecatedDeleteABookmarkApplication**](AccessBookmarkApplicationsDeprecatedApi.md#accessBookmarkApplicationsDeprecatedDeleteABookmarkApplication) | **DELETE** /accounts/{identifier}/access/bookmarks/{uuid} | Delete a Bookmark application |
| [**accessBookmarkApplicationsDeprecatedGetABookmarkApplication**](AccessBookmarkApplicationsDeprecatedApi.md#accessBookmarkApplicationsDeprecatedGetABookmarkApplication) | **GET** /accounts/{identifier}/access/bookmarks/{uuid} | Get a Bookmark application |
| [**accessBookmarkApplicationsDeprecatedListBookmarkApplications**](AccessBookmarkApplicationsDeprecatedApi.md#accessBookmarkApplicationsDeprecatedListBookmarkApplications) | **GET** /accounts/{identifier}/access/bookmarks | List Bookmark applications |
| [**accessBookmarkApplicationsDeprecatedUpdateABookmarkApplication**](AccessBookmarkApplicationsDeprecatedApi.md#accessBookmarkApplicationsDeprecatedUpdateABookmarkApplication) | **PUT** /accounts/{identifier}/access/bookmarks/{uuid} | Update a Bookmark application |


<a id="accessBookmarkApplicationsDeprecatedCreateABookmarkApplication"></a>
# **accessBookmarkApplicationsDeprecatedCreateABookmarkApplication**
> AccessBookmarksComponentsSchemasSingleResponse accessBookmarkApplicationsDeprecatedCreateABookmarkApplication(uuid, identifier)

Create a Bookmark application

Create a new Bookmark application.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.AccessBookmarkApplicationsDeprecatedApi;

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

    AccessBookmarkApplicationsDeprecatedApi apiInstance = new AccessBookmarkApplicationsDeprecatedApi(defaultClient);
    String uuid = "uuid_example"; // String | 
    String identifier = "identifier_example"; // String | 
    try {
      AccessBookmarksComponentsSchemasSingleResponse result = apiInstance.accessBookmarkApplicationsDeprecatedCreateABookmarkApplication(uuid, identifier);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling AccessBookmarkApplicationsDeprecatedApi#accessBookmarkApplicationsDeprecatedCreateABookmarkApplication");
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
| **uuid** | **String**|  | |
| **identifier** | **String**|  | |

### Return type

[**AccessBookmarksComponentsSchemasSingleResponse**](AccessBookmarksComponentsSchemasSingleResponse.md)

### Authorization

[api_key](../README.md#api_key), [api_email](../README.md#api_email)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Create a Bookmark application response |  -  |
| **4XX** | Create a Bookmark application response failure |  -  |

<a id="accessBookmarkApplicationsDeprecatedDeleteABookmarkApplication"></a>
# **accessBookmarkApplicationsDeprecatedDeleteABookmarkApplication**
> AccessIdResponse accessBookmarkApplicationsDeprecatedDeleteABookmarkApplication(uuid, identifier)

Delete a Bookmark application

Deletes a Bookmark application.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.AccessBookmarkApplicationsDeprecatedApi;

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

    AccessBookmarkApplicationsDeprecatedApi apiInstance = new AccessBookmarkApplicationsDeprecatedApi(defaultClient);
    String uuid = "uuid_example"; // String | 
    String identifier = "identifier_example"; // String | 
    try {
      AccessIdResponse result = apiInstance.accessBookmarkApplicationsDeprecatedDeleteABookmarkApplication(uuid, identifier);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling AccessBookmarkApplicationsDeprecatedApi#accessBookmarkApplicationsDeprecatedDeleteABookmarkApplication");
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
| **uuid** | **String**|  | |
| **identifier** | **String**|  | |

### Return type

[**AccessIdResponse**](AccessIdResponse.md)

### Authorization

[api_key](../README.md#api_key), [api_email](../README.md#api_email)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Delete a Bookmark application response |  -  |
| **4XX** | Delete a Bookmark application response failure |  -  |

<a id="accessBookmarkApplicationsDeprecatedGetABookmarkApplication"></a>
# **accessBookmarkApplicationsDeprecatedGetABookmarkApplication**
> AccessBookmarksComponentsSchemasSingleResponse accessBookmarkApplicationsDeprecatedGetABookmarkApplication(uuid, identifier)

Get a Bookmark application

Fetches a single Bookmark application.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.AccessBookmarkApplicationsDeprecatedApi;

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

    AccessBookmarkApplicationsDeprecatedApi apiInstance = new AccessBookmarkApplicationsDeprecatedApi(defaultClient);
    String uuid = "uuid_example"; // String | 
    String identifier = "identifier_example"; // String | 
    try {
      AccessBookmarksComponentsSchemasSingleResponse result = apiInstance.accessBookmarkApplicationsDeprecatedGetABookmarkApplication(uuid, identifier);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling AccessBookmarkApplicationsDeprecatedApi#accessBookmarkApplicationsDeprecatedGetABookmarkApplication");
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
| **uuid** | **String**|  | |
| **identifier** | **String**|  | |

### Return type

[**AccessBookmarksComponentsSchemasSingleResponse**](AccessBookmarksComponentsSchemasSingleResponse.md)

### Authorization

[api_key](../README.md#api_key), [api_email](../README.md#api_email)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Get a Bookmark application response |  -  |
| **4XX** | Get a Bookmark application response failure |  -  |

<a id="accessBookmarkApplicationsDeprecatedListBookmarkApplications"></a>
# **accessBookmarkApplicationsDeprecatedListBookmarkApplications**
> AccessBookmarksComponentsSchemasResponseCollection accessBookmarkApplicationsDeprecatedListBookmarkApplications(identifier)

List Bookmark applications

Lists Bookmark applications.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.AccessBookmarkApplicationsDeprecatedApi;

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

    AccessBookmarkApplicationsDeprecatedApi apiInstance = new AccessBookmarkApplicationsDeprecatedApi(defaultClient);
    String identifier = "identifier_example"; // String | 
    try {
      AccessBookmarksComponentsSchemasResponseCollection result = apiInstance.accessBookmarkApplicationsDeprecatedListBookmarkApplications(identifier);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling AccessBookmarkApplicationsDeprecatedApi#accessBookmarkApplicationsDeprecatedListBookmarkApplications");
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
| **identifier** | **String**|  | |

### Return type

[**AccessBookmarksComponentsSchemasResponseCollection**](AccessBookmarksComponentsSchemasResponseCollection.md)

### Authorization

[api_key](../README.md#api_key), [api_email](../README.md#api_email)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | List Bookmark applications response |  -  |
| **4XX** | List Bookmark applications response failure |  -  |

<a id="accessBookmarkApplicationsDeprecatedUpdateABookmarkApplication"></a>
# **accessBookmarkApplicationsDeprecatedUpdateABookmarkApplication**
> AccessBookmarksComponentsSchemasSingleResponse accessBookmarkApplicationsDeprecatedUpdateABookmarkApplication(uuid, identifier)

Update a Bookmark application

Updates a configured Bookmark application.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.AccessBookmarkApplicationsDeprecatedApi;

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

    AccessBookmarkApplicationsDeprecatedApi apiInstance = new AccessBookmarkApplicationsDeprecatedApi(defaultClient);
    String uuid = "uuid_example"; // String | 
    String identifier = "identifier_example"; // String | 
    try {
      AccessBookmarksComponentsSchemasSingleResponse result = apiInstance.accessBookmarkApplicationsDeprecatedUpdateABookmarkApplication(uuid, identifier);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling AccessBookmarkApplicationsDeprecatedApi#accessBookmarkApplicationsDeprecatedUpdateABookmarkApplication");
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
| **uuid** | **String**|  | |
| **identifier** | **String**|  | |

### Return type

[**AccessBookmarksComponentsSchemasSingleResponse**](AccessBookmarksComponentsSchemasSingleResponse.md)

### Authorization

[api_key](../README.md#api_key), [api_email](../README.md#api_email)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Update a Bookmark application response |  -  |
| **4XX** | Update a Bookmark application response failure |  -  |

