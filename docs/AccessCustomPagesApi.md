# AccessCustomPagesApi

All URIs are relative to *https://api.cloudflare.com/client/v4*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**accessCustomPagesCreateACustomPage**](AccessCustomPagesApi.md#accessCustomPagesCreateACustomPage) | **POST** /accounts/{identifier}/access/custom_pages | Create a custom page |
| [**accessCustomPagesDeleteACustomPage**](AccessCustomPagesApi.md#accessCustomPagesDeleteACustomPage) | **DELETE** /accounts/{identifier}/access/custom_pages/{uuid} | Delete a custom page |
| [**accessCustomPagesGetACustomPage**](AccessCustomPagesApi.md#accessCustomPagesGetACustomPage) | **GET** /accounts/{identifier}/access/custom_pages/{uuid} | Get a custom page |
| [**accessCustomPagesListCustomPages**](AccessCustomPagesApi.md#accessCustomPagesListCustomPages) | **GET** /accounts/{identifier}/access/custom_pages | List custom pages |
| [**accessCustomPagesUpdateACustomPage**](AccessCustomPagesApi.md#accessCustomPagesUpdateACustomPage) | **PUT** /accounts/{identifier}/access/custom_pages/{uuid} | Update a custom page |


<a id="accessCustomPagesCreateACustomPage"></a>
# **accessCustomPagesCreateACustomPage**
> AccessSingleResponseWithoutHtml accessCustomPagesCreateACustomPage(identifier, accessCustomPage)

Create a custom page

Create a custom page

### Example
```java
// Import classes:
import cloudflare.ApiClient;
import cloudflare.ApiException;
import cloudflare.Configuration;
import cloudflare.auth.*;
import cloudflare.models.*;
import cloudflare.sdk.AccessCustomPagesApi;

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

    AccessCustomPagesApi apiInstance = new AccessCustomPagesApi(defaultClient);
    String identifier = "identifier_example"; // String | 
    AccessCustomPage accessCustomPage = new AccessCustomPage(); // AccessCustomPage | 
    try {
      AccessSingleResponseWithoutHtml result = apiInstance.accessCustomPagesCreateACustomPage(identifier, accessCustomPage);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling AccessCustomPagesApi#accessCustomPagesCreateACustomPage");
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
| **accessCustomPage** | [**AccessCustomPage**](AccessCustomPage.md)|  | [optional] |

### Return type

[**AccessSingleResponseWithoutHtml**](AccessSingleResponseWithoutHtml.md)

### Authorization

[api_key](../README.md#api_key), [api_email](../README.md#api_email)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **201** | Create a custom page response |  -  |
| **4XX** | Create a custom page response failure |  -  |

<a id="accessCustomPagesDeleteACustomPage"></a>
# **accessCustomPagesDeleteACustomPage**
> AccessComponentsSchemasIdResponse accessCustomPagesDeleteACustomPage(uuid, identifier)

Delete a custom page

Delete a custom page

### Example
```java
// Import classes:
import cloudflare.ApiClient;
import cloudflare.ApiException;
import cloudflare.Configuration;
import cloudflare.auth.*;
import cloudflare.models.*;
import cloudflare.sdk.AccessCustomPagesApi;

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

    AccessCustomPagesApi apiInstance = new AccessCustomPagesApi(defaultClient);
    String uuid = "uuid_example"; // String | 
    String identifier = "identifier_example"; // String | 
    try {
      AccessComponentsSchemasIdResponse result = apiInstance.accessCustomPagesDeleteACustomPage(uuid, identifier);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling AccessCustomPagesApi#accessCustomPagesDeleteACustomPage");
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

[**AccessComponentsSchemasIdResponse**](AccessComponentsSchemasIdResponse.md)

### Authorization

[api_key](../README.md#api_key), [api_email](../README.md#api_email)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **202** | Delete a custom page response |  -  |
| **4XX** | Delete a custom page response failure |  -  |

<a id="accessCustomPagesGetACustomPage"></a>
# **accessCustomPagesGetACustomPage**
> AccessCustomPagesComponentsSchemasSingleResponse accessCustomPagesGetACustomPage(uuid, identifier)

Get a custom page

Fetches a custom page and also returns its HTML.

### Example
```java
// Import classes:
import cloudflare.ApiClient;
import cloudflare.ApiException;
import cloudflare.Configuration;
import cloudflare.auth.*;
import cloudflare.models.*;
import cloudflare.sdk.AccessCustomPagesApi;

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

    AccessCustomPagesApi apiInstance = new AccessCustomPagesApi(defaultClient);
    String uuid = "uuid_example"; // String | 
    String identifier = "identifier_example"; // String | 
    try {
      AccessCustomPagesComponentsSchemasSingleResponse result = apiInstance.accessCustomPagesGetACustomPage(uuid, identifier);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling AccessCustomPagesApi#accessCustomPagesGetACustomPage");
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

[**AccessCustomPagesComponentsSchemasSingleResponse**](AccessCustomPagesComponentsSchemasSingleResponse.md)

### Authorization

[api_key](../README.md#api_key), [api_email](../README.md#api_email)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Get a custom page response |  -  |
| **4XX** | Get a custom page response failure |  -  |

<a id="accessCustomPagesListCustomPages"></a>
# **accessCustomPagesListCustomPages**
> AccessCustomPagesComponentsSchemasResponseCollection accessCustomPagesListCustomPages(identifier)

List custom pages

List custom pages

### Example
```java
// Import classes:
import cloudflare.ApiClient;
import cloudflare.ApiException;
import cloudflare.Configuration;
import cloudflare.auth.*;
import cloudflare.models.*;
import cloudflare.sdk.AccessCustomPagesApi;

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

    AccessCustomPagesApi apiInstance = new AccessCustomPagesApi(defaultClient);
    String identifier = "identifier_example"; // String | 
    try {
      AccessCustomPagesComponentsSchemasResponseCollection result = apiInstance.accessCustomPagesListCustomPages(identifier);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling AccessCustomPagesApi#accessCustomPagesListCustomPages");
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

[**AccessCustomPagesComponentsSchemasResponseCollection**](AccessCustomPagesComponentsSchemasResponseCollection.md)

### Authorization

[api_key](../README.md#api_key), [api_email](../README.md#api_email)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | List custom pages response |  -  |
| **4XX** | List custom pages response failure |  -  |

<a id="accessCustomPagesUpdateACustomPage"></a>
# **accessCustomPagesUpdateACustomPage**
> AccessSingleResponseWithoutHtml accessCustomPagesUpdateACustomPage(uuid, identifier, accessCustomPage)

Update a custom page

Update a custom page

### Example
```java
// Import classes:
import cloudflare.ApiClient;
import cloudflare.ApiException;
import cloudflare.Configuration;
import cloudflare.auth.*;
import cloudflare.models.*;
import cloudflare.sdk.AccessCustomPagesApi;

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

    AccessCustomPagesApi apiInstance = new AccessCustomPagesApi(defaultClient);
    String uuid = "uuid_example"; // String | 
    String identifier = "identifier_example"; // String | 
    AccessCustomPage accessCustomPage = new AccessCustomPage(); // AccessCustomPage | 
    try {
      AccessSingleResponseWithoutHtml result = apiInstance.accessCustomPagesUpdateACustomPage(uuid, identifier, accessCustomPage);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling AccessCustomPagesApi#accessCustomPagesUpdateACustomPage");
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
| **accessCustomPage** | [**AccessCustomPage**](AccessCustomPage.md)|  | [optional] |

### Return type

[**AccessSingleResponseWithoutHtml**](AccessSingleResponseWithoutHtml.md)

### Authorization

[api_key](../README.md#api_key), [api_email](../README.md#api_email)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Update a custom page response |  -  |
| **4XX** | Update a custom page response failure |  -  |

