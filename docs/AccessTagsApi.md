# AccessTagsApi

All URIs are relative to *https://api.cloudflare.com/client/v4*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**accessTagsCreateTag**](AccessTagsApi.md#accessTagsCreateTag) | **POST** /accounts/{identifier}/access/tags | Create a tag |
| [**accessTagsDeleteATag**](AccessTagsApi.md#accessTagsDeleteATag) | **DELETE** /accounts/{identifier}/access/tags/{name} | Delete a tag |
| [**accessTagsGetATag**](AccessTagsApi.md#accessTagsGetATag) | **GET** /accounts/{identifier}/access/tags/{name} | Get a tag |
| [**accessTagsListTags**](AccessTagsApi.md#accessTagsListTags) | **GET** /accounts/{identifier}/access/tags | List tags |
| [**accessTagsUpdateATag**](AccessTagsApi.md#accessTagsUpdateATag) | **PUT** /accounts/{identifier}/access/tags/{name} | Update a tag |


<a id="accessTagsCreateTag"></a>
# **accessTagsCreateTag**
> AccessTagsComponentsSchemasSingleResponse accessTagsCreateTag(identifier, accessTagWithoutAppCount)

Create a tag

Create a tag

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.AccessTagsApi;

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

    AccessTagsApi apiInstance = new AccessTagsApi(defaultClient);
    String identifier = "identifier_example"; // String | 
    AccessTagWithoutAppCount accessTagWithoutAppCount = new AccessTagWithoutAppCount(); // AccessTagWithoutAppCount | 
    try {
      AccessTagsComponentsSchemasSingleResponse result = apiInstance.accessTagsCreateTag(identifier, accessTagWithoutAppCount);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling AccessTagsApi#accessTagsCreateTag");
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
| **accessTagWithoutAppCount** | [**AccessTagWithoutAppCount**](AccessTagWithoutAppCount.md)|  | [optional] |

### Return type

[**AccessTagsComponentsSchemasSingleResponse**](AccessTagsComponentsSchemasSingleResponse.md)

### Authorization

[api_key](../README.md#api_key), [api_email](../README.md#api_email)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **201** | Create a tag response |  -  |
| **4XX** | Create a tag response failure |  -  |

<a id="accessTagsDeleteATag"></a>
# **accessTagsDeleteATag**
> AccessNameResponse accessTagsDeleteATag(identifier, name)

Delete a tag

Delete a tag

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.AccessTagsApi;

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

    AccessTagsApi apiInstance = new AccessTagsApi(defaultClient);
    String identifier = "identifier_example"; // String | 
    String name = "name_example"; // String | 
    try {
      AccessNameResponse result = apiInstance.accessTagsDeleteATag(identifier, name);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling AccessTagsApi#accessTagsDeleteATag");
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
| **name** | **String**|  | |

### Return type

[**AccessNameResponse**](AccessNameResponse.md)

### Authorization

[api_key](../README.md#api_key), [api_email](../README.md#api_email)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **202** | Delete a tag response |  -  |
| **4XX** | Delete a tag response failure |  -  |

<a id="accessTagsGetATag"></a>
# **accessTagsGetATag**
> AccessTagsComponentsSchemasSingleResponse accessTagsGetATag(identifier, name)

Get a tag

Get a tag

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.AccessTagsApi;

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

    AccessTagsApi apiInstance = new AccessTagsApi(defaultClient);
    String identifier = "identifier_example"; // String | 
    String name = "name_example"; // String | 
    try {
      AccessTagsComponentsSchemasSingleResponse result = apiInstance.accessTagsGetATag(identifier, name);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling AccessTagsApi#accessTagsGetATag");
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
| **name** | **String**|  | |

### Return type

[**AccessTagsComponentsSchemasSingleResponse**](AccessTagsComponentsSchemasSingleResponse.md)

### Authorization

[api_key](../README.md#api_key), [api_email](../README.md#api_email)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Get a tag response |  -  |
| **4XX** | Get a tag response failure |  -  |

<a id="accessTagsListTags"></a>
# **accessTagsListTags**
> AccessTagsComponentsSchemasResponseCollection accessTagsListTags(identifier)

List tags

List tags

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.AccessTagsApi;

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

    AccessTagsApi apiInstance = new AccessTagsApi(defaultClient);
    String identifier = "identifier_example"; // String | 
    try {
      AccessTagsComponentsSchemasResponseCollection result = apiInstance.accessTagsListTags(identifier);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling AccessTagsApi#accessTagsListTags");
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

[**AccessTagsComponentsSchemasResponseCollection**](AccessTagsComponentsSchemasResponseCollection.md)

### Authorization

[api_key](../README.md#api_key), [api_email](../README.md#api_email)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | List tags response |  -  |
| **4XX** | List tags response failure |  -  |

<a id="accessTagsUpdateATag"></a>
# **accessTagsUpdateATag**
> AccessTagsComponentsSchemasSingleResponse accessTagsUpdateATag(identifier, name, accessTagWithoutAppCount)

Update a tag

Update a tag

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.AccessTagsApi;

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

    AccessTagsApi apiInstance = new AccessTagsApi(defaultClient);
    String identifier = "identifier_example"; // String | 
    String name = "name_example"; // String | 
    AccessTagWithoutAppCount accessTagWithoutAppCount = new AccessTagWithoutAppCount(); // AccessTagWithoutAppCount | 
    try {
      AccessTagsComponentsSchemasSingleResponse result = apiInstance.accessTagsUpdateATag(identifier, name, accessTagWithoutAppCount);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling AccessTagsApi#accessTagsUpdateATag");
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
| **name** | **String**|  | |
| **accessTagWithoutAppCount** | [**AccessTagWithoutAppCount**](AccessTagWithoutAppCount.md)|  | [optional] |

### Return type

[**AccessTagsComponentsSchemasSingleResponse**](AccessTagsComponentsSchemasSingleResponse.md)

### Authorization

[api_key](../README.md#api_key), [api_email](../README.md#api_email)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Update a tag response |  -  |
| **4XX** | Update a tag response failure |  -  |

