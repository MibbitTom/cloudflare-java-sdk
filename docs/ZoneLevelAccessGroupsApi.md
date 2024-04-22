# ZoneLevelAccessGroupsApi

All URIs are relative to *https://api.cloudflare.com/client/v4*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**zoneLevelAccessGroupsCreateAnAccessGroup**](ZoneLevelAccessGroupsApi.md#zoneLevelAccessGroupsCreateAnAccessGroup) | **POST** /zones/{identifier}/access/groups | Create an Access group |
| [**zoneLevelAccessGroupsDeleteAnAccessGroup**](ZoneLevelAccessGroupsApi.md#zoneLevelAccessGroupsDeleteAnAccessGroup) | **DELETE** /zones/{identifier}/access/groups/{uuid} | Delete an Access group |
| [**zoneLevelAccessGroupsGetAnAccessGroup**](ZoneLevelAccessGroupsApi.md#zoneLevelAccessGroupsGetAnAccessGroup) | **GET** /zones/{identifier}/access/groups/{uuid} | Get an Access group |
| [**zoneLevelAccessGroupsListAccessGroups**](ZoneLevelAccessGroupsApi.md#zoneLevelAccessGroupsListAccessGroups) | **GET** /zones/{identifier}/access/groups | List Access groups |
| [**zoneLevelAccessGroupsUpdateAnAccessGroup**](ZoneLevelAccessGroupsApi.md#zoneLevelAccessGroupsUpdateAnAccessGroup) | **PUT** /zones/{identifier}/access/groups/{uuid} | Update an Access group |


<a id="zoneLevelAccessGroupsCreateAnAccessGroup"></a>
# **zoneLevelAccessGroupsCreateAnAccessGroup**
> AccessGroupsComponentsSchemasSingleResponse zoneLevelAccessGroupsCreateAnAccessGroup(identifier, zoneLevelAccessGroupsCreateAnAccessGroupRequest)

Create an Access group

Creates a new Access group.

### Example
```java
// Import classes:
import cloudflare.ApiClient;
import cloudflare.ApiException;
import cloudflare.Configuration;
import cloudflare.auth.*;
import cloudflare.models.*;
import cloudflare.sdk.ZoneLevelAccessGroupsApi;

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

    ZoneLevelAccessGroupsApi apiInstance = new ZoneLevelAccessGroupsApi(defaultClient);
    String identifier = "identifier_example"; // String | 
    ZoneLevelAccessGroupsCreateAnAccessGroupRequest zoneLevelAccessGroupsCreateAnAccessGroupRequest = new ZoneLevelAccessGroupsCreateAnAccessGroupRequest(); // ZoneLevelAccessGroupsCreateAnAccessGroupRequest | 
    try {
      AccessGroupsComponentsSchemasSingleResponse result = apiInstance.zoneLevelAccessGroupsCreateAnAccessGroup(identifier, zoneLevelAccessGroupsCreateAnAccessGroupRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ZoneLevelAccessGroupsApi#zoneLevelAccessGroupsCreateAnAccessGroup");
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
| **zoneLevelAccessGroupsCreateAnAccessGroupRequest** | [**ZoneLevelAccessGroupsCreateAnAccessGroupRequest**](ZoneLevelAccessGroupsCreateAnAccessGroupRequest.md)|  | |

### Return type

[**AccessGroupsComponentsSchemasSingleResponse**](AccessGroupsComponentsSchemasSingleResponse.md)

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

<a id="zoneLevelAccessGroupsDeleteAnAccessGroup"></a>
# **zoneLevelAccessGroupsDeleteAnAccessGroup**
> AccessIdResponse zoneLevelAccessGroupsDeleteAnAccessGroup(uuid, identifier)

Delete an Access group

Deletes an Access group.

### Example
```java
// Import classes:
import cloudflare.ApiClient;
import cloudflare.ApiException;
import cloudflare.Configuration;
import cloudflare.auth.*;
import cloudflare.models.*;
import cloudflare.sdk.ZoneLevelAccessGroupsApi;

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

    ZoneLevelAccessGroupsApi apiInstance = new ZoneLevelAccessGroupsApi(defaultClient);
    String uuid = "uuid_example"; // String | 
    String identifier = "identifier_example"; // String | 
    try {
      AccessIdResponse result = apiInstance.zoneLevelAccessGroupsDeleteAnAccessGroup(uuid, identifier);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ZoneLevelAccessGroupsApi#zoneLevelAccessGroupsDeleteAnAccessGroup");
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

<a id="zoneLevelAccessGroupsGetAnAccessGroup"></a>
# **zoneLevelAccessGroupsGetAnAccessGroup**
> AccessGroupsComponentsSchemasSingleResponse zoneLevelAccessGroupsGetAnAccessGroup(uuid, identifier)

Get an Access group

Fetches a single Access group.

### Example
```java
// Import classes:
import cloudflare.ApiClient;
import cloudflare.ApiException;
import cloudflare.Configuration;
import cloudflare.auth.*;
import cloudflare.models.*;
import cloudflare.sdk.ZoneLevelAccessGroupsApi;

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

    ZoneLevelAccessGroupsApi apiInstance = new ZoneLevelAccessGroupsApi(defaultClient);
    String uuid = "uuid_example"; // String | 
    String identifier = "identifier_example"; // String | 
    try {
      AccessGroupsComponentsSchemasSingleResponse result = apiInstance.zoneLevelAccessGroupsGetAnAccessGroup(uuid, identifier);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ZoneLevelAccessGroupsApi#zoneLevelAccessGroupsGetAnAccessGroup");
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

[**AccessGroupsComponentsSchemasSingleResponse**](AccessGroupsComponentsSchemasSingleResponse.md)

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

<a id="zoneLevelAccessGroupsListAccessGroups"></a>
# **zoneLevelAccessGroupsListAccessGroups**
> AccessGroupsComponentsSchemasResponseCollection zoneLevelAccessGroupsListAccessGroups(identifier)

List Access groups

Lists all Access groups.

### Example
```java
// Import classes:
import cloudflare.ApiClient;
import cloudflare.ApiException;
import cloudflare.Configuration;
import cloudflare.auth.*;
import cloudflare.models.*;
import cloudflare.sdk.ZoneLevelAccessGroupsApi;

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

    ZoneLevelAccessGroupsApi apiInstance = new ZoneLevelAccessGroupsApi(defaultClient);
    String identifier = "identifier_example"; // String | 
    try {
      AccessGroupsComponentsSchemasResponseCollection result = apiInstance.zoneLevelAccessGroupsListAccessGroups(identifier);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ZoneLevelAccessGroupsApi#zoneLevelAccessGroupsListAccessGroups");
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

[**AccessGroupsComponentsSchemasResponseCollection**](AccessGroupsComponentsSchemasResponseCollection.md)

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

<a id="zoneLevelAccessGroupsUpdateAnAccessGroup"></a>
# **zoneLevelAccessGroupsUpdateAnAccessGroup**
> AccessGroupsComponentsSchemasSingleResponse zoneLevelAccessGroupsUpdateAnAccessGroup(uuid, identifier, zoneLevelAccessGroupsCreateAnAccessGroupRequest)

Update an Access group

Updates a configured Access group.

### Example
```java
// Import classes:
import cloudflare.ApiClient;
import cloudflare.ApiException;
import cloudflare.Configuration;
import cloudflare.auth.*;
import cloudflare.models.*;
import cloudflare.sdk.ZoneLevelAccessGroupsApi;

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

    ZoneLevelAccessGroupsApi apiInstance = new ZoneLevelAccessGroupsApi(defaultClient);
    String uuid = "uuid_example"; // String | 
    String identifier = "identifier_example"; // String | 
    ZoneLevelAccessGroupsCreateAnAccessGroupRequest zoneLevelAccessGroupsCreateAnAccessGroupRequest = new ZoneLevelAccessGroupsCreateAnAccessGroupRequest(); // ZoneLevelAccessGroupsCreateAnAccessGroupRequest | 
    try {
      AccessGroupsComponentsSchemasSingleResponse result = apiInstance.zoneLevelAccessGroupsUpdateAnAccessGroup(uuid, identifier, zoneLevelAccessGroupsCreateAnAccessGroupRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ZoneLevelAccessGroupsApi#zoneLevelAccessGroupsUpdateAnAccessGroup");
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
| **zoneLevelAccessGroupsCreateAnAccessGroupRequest** | [**ZoneLevelAccessGroupsCreateAnAccessGroupRequest**](ZoneLevelAccessGroupsCreateAnAccessGroupRequest.md)|  | |

### Return type

[**AccessGroupsComponentsSchemasSingleResponse**](AccessGroupsComponentsSchemasSingleResponse.md)

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

