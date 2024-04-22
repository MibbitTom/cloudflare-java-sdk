# AccessGroupsApi

All URIs are relative to *https://api.cloudflare.com/client/v4*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**accessGroupsCreateAnAccessGroup**](AccessGroupsApi.md#accessGroupsCreateAnAccessGroup) | **POST** /accounts/{identifier}/access/groups | Create an Access group |
| [**accessGroupsDeleteAnAccessGroup**](AccessGroupsApi.md#accessGroupsDeleteAnAccessGroup) | **DELETE** /accounts/{identifier}/access/groups/{uuid} | Delete an Access group |
| [**accessGroupsGetAnAccessGroup**](AccessGroupsApi.md#accessGroupsGetAnAccessGroup) | **GET** /accounts/{identifier}/access/groups/{uuid} | Get an Access group |
| [**accessGroupsListAccessGroups**](AccessGroupsApi.md#accessGroupsListAccessGroups) | **GET** /accounts/{identifier}/access/groups | List Access groups |
| [**accessGroupsUpdateAnAccessGroup**](AccessGroupsApi.md#accessGroupsUpdateAnAccessGroup) | **PUT** /accounts/{identifier}/access/groups/{uuid} | Update an Access group |


<a id="accessGroupsCreateAnAccessGroup"></a>
# **accessGroupsCreateAnAccessGroup**
> AccessComponentsSchemasSingleResponse accessGroupsCreateAnAccessGroup(identifier, accessGroupsCreateAnAccessGroupRequest)

Create an Access group

Creates a new Access group.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.AccessGroupsApi;

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

    AccessGroupsApi apiInstance = new AccessGroupsApi(defaultClient);
    String identifier = "identifier_example"; // String | 
    AccessGroupsCreateAnAccessGroupRequest accessGroupsCreateAnAccessGroupRequest = new AccessGroupsCreateAnAccessGroupRequest(); // AccessGroupsCreateAnAccessGroupRequest | 
    try {
      AccessComponentsSchemasSingleResponse result = apiInstance.accessGroupsCreateAnAccessGroup(identifier, accessGroupsCreateAnAccessGroupRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling AccessGroupsApi#accessGroupsCreateAnAccessGroup");
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
| **accessGroupsCreateAnAccessGroupRequest** | [**AccessGroupsCreateAnAccessGroupRequest**](AccessGroupsCreateAnAccessGroupRequest.md)|  | |

### Return type

[**AccessComponentsSchemasSingleResponse**](AccessComponentsSchemasSingleResponse.md)

### Authorization

[api_key](../README.md#api_key), [api_email](../README.md#api_email)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **201** | Create an Access group response |  -  |
| **4XX** | Create an Access group response failure |  -  |

<a id="accessGroupsDeleteAnAccessGroup"></a>
# **accessGroupsDeleteAnAccessGroup**
> AccessIdResponse accessGroupsDeleteAnAccessGroup(uuid, identifier)

Delete an Access group

Deletes an Access group.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.AccessGroupsApi;

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

    AccessGroupsApi apiInstance = new AccessGroupsApi(defaultClient);
    String uuid = "uuid_example"; // String | 
    String identifier = "identifier_example"; // String | 
    try {
      AccessIdResponse result = apiInstance.accessGroupsDeleteAnAccessGroup(uuid, identifier);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling AccessGroupsApi#accessGroupsDeleteAnAccessGroup");
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

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **202** | Delete an Access group response |  -  |
| **4XX** | Delete an Access group response failure |  -  |

<a id="accessGroupsGetAnAccessGroup"></a>
# **accessGroupsGetAnAccessGroup**
> AccessComponentsSchemasSingleResponse accessGroupsGetAnAccessGroup(uuid, identifier)

Get an Access group

Fetches a single Access group.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.AccessGroupsApi;

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

    AccessGroupsApi apiInstance = new AccessGroupsApi(defaultClient);
    String uuid = "uuid_example"; // String | 
    String identifier = "identifier_example"; // String | 
    try {
      AccessComponentsSchemasSingleResponse result = apiInstance.accessGroupsGetAnAccessGroup(uuid, identifier);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling AccessGroupsApi#accessGroupsGetAnAccessGroup");
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

[**AccessComponentsSchemasSingleResponse**](AccessComponentsSchemasSingleResponse.md)

### Authorization

[api_key](../README.md#api_key), [api_email](../README.md#api_email)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Get an Access group response |  -  |
| **4XX** | Get an Access group response failure |  -  |

<a id="accessGroupsListAccessGroups"></a>
# **accessGroupsListAccessGroups**
> AccessSchemasResponseCollection accessGroupsListAccessGroups(identifier)

List Access groups

Lists all Access groups.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.AccessGroupsApi;

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

    AccessGroupsApi apiInstance = new AccessGroupsApi(defaultClient);
    String identifier = "identifier_example"; // String | 
    try {
      AccessSchemasResponseCollection result = apiInstance.accessGroupsListAccessGroups(identifier);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling AccessGroupsApi#accessGroupsListAccessGroups");
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

[**AccessSchemasResponseCollection**](AccessSchemasResponseCollection.md)

### Authorization

[api_key](../README.md#api_key), [api_email](../README.md#api_email)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | List Access groups response |  -  |
| **4XX** | List Access groups response failure |  -  |

<a id="accessGroupsUpdateAnAccessGroup"></a>
# **accessGroupsUpdateAnAccessGroup**
> AccessComponentsSchemasSingleResponse accessGroupsUpdateAnAccessGroup(uuid, identifier, accessGroupsCreateAnAccessGroupRequest)

Update an Access group

Updates a configured Access group.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.AccessGroupsApi;

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

    AccessGroupsApi apiInstance = new AccessGroupsApi(defaultClient);
    String uuid = "uuid_example"; // String | 
    String identifier = "identifier_example"; // String | 
    AccessGroupsCreateAnAccessGroupRequest accessGroupsCreateAnAccessGroupRequest = new AccessGroupsCreateAnAccessGroupRequest(); // AccessGroupsCreateAnAccessGroupRequest | 
    try {
      AccessComponentsSchemasSingleResponse result = apiInstance.accessGroupsUpdateAnAccessGroup(uuid, identifier, accessGroupsCreateAnAccessGroupRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling AccessGroupsApi#accessGroupsUpdateAnAccessGroup");
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
| **accessGroupsCreateAnAccessGroupRequest** | [**AccessGroupsCreateAnAccessGroupRequest**](AccessGroupsCreateAnAccessGroupRequest.md)|  | |

### Return type

[**AccessComponentsSchemasSingleResponse**](AccessComponentsSchemasSingleResponse.md)

### Authorization

[api_key](../README.md#api_key), [api_email](../README.md#api_email)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Update an Access group response |  -  |
| **4XX** | Update an Access group response failure |  -  |

