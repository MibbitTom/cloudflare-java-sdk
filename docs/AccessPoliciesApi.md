# AccessPoliciesApi

All URIs are relative to *https://api.cloudflare.com/client/v4*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**accessPoliciesCreateAnAccessPolicy**](AccessPoliciesApi.md#accessPoliciesCreateAnAccessPolicy) | **POST** /accounts/{identifier}/access/apps/{uuid}/policies | Create an Access policy |
| [**accessPoliciesDeleteAnAccessPolicy**](AccessPoliciesApi.md#accessPoliciesDeleteAnAccessPolicy) | **DELETE** /accounts/{identifier}/access/apps/{uuid1}/policies/{uuid} | Delete an Access policy |
| [**accessPoliciesGetAnAccessPolicy**](AccessPoliciesApi.md#accessPoliciesGetAnAccessPolicy) | **GET** /accounts/{identifier}/access/apps/{uuid1}/policies/{uuid} | Get an Access policy |
| [**accessPoliciesListAccessPolicies**](AccessPoliciesApi.md#accessPoliciesListAccessPolicies) | **GET** /accounts/{identifier}/access/apps/{uuid}/policies | List Access policies |
| [**accessPoliciesUpdateAnAccessPolicy**](AccessPoliciesApi.md#accessPoliciesUpdateAnAccessPolicy) | **PUT** /accounts/{identifier}/access/apps/{uuid1}/policies/{uuid} | Update an Access policy |


<a id="accessPoliciesCreateAnAccessPolicy"></a>
# **accessPoliciesCreateAnAccessPolicy**
> AccessPoliciesComponentsSchemasSingleResponse accessPoliciesCreateAnAccessPolicy(uuid, identifier, accessPoliciesUpdateAnAccessPolicyRequest)

Create an Access policy

Create a new Access policy for an application.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.AccessPoliciesApi;

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

    AccessPoliciesApi apiInstance = new AccessPoliciesApi(defaultClient);
    String uuid = "uuid_example"; // String | 
    String identifier = "identifier_example"; // String | 
    AccessPoliciesUpdateAnAccessPolicyRequest accessPoliciesUpdateAnAccessPolicyRequest = new AccessPoliciesUpdateAnAccessPolicyRequest(); // AccessPoliciesUpdateAnAccessPolicyRequest | 
    try {
      AccessPoliciesComponentsSchemasSingleResponse result = apiInstance.accessPoliciesCreateAnAccessPolicy(uuid, identifier, accessPoliciesUpdateAnAccessPolicyRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling AccessPoliciesApi#accessPoliciesCreateAnAccessPolicy");
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
| **accessPoliciesUpdateAnAccessPolicyRequest** | [**AccessPoliciesUpdateAnAccessPolicyRequest**](AccessPoliciesUpdateAnAccessPolicyRequest.md)|  | |

### Return type

[**AccessPoliciesComponentsSchemasSingleResponse**](AccessPoliciesComponentsSchemasSingleResponse.md)

### Authorization

[api_key](../README.md#api_key), [api_email](../README.md#api_email)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **201** | Create an Access policy response |  -  |
| **4XX** | Create an Access policy response failure |  -  |

<a id="accessPoliciesDeleteAnAccessPolicy"></a>
# **accessPoliciesDeleteAnAccessPolicy**
> AccessIdResponse accessPoliciesDeleteAnAccessPolicy(uuid, uuid1, identifier)

Delete an Access policy

Delete an Access policy.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.AccessPoliciesApi;

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

    AccessPoliciesApi apiInstance = new AccessPoliciesApi(defaultClient);
    String uuid = "uuid_example"; // String | 
    String uuid1 = "uuid1_example"; // String | 
    String identifier = "identifier_example"; // String | 
    try {
      AccessIdResponse result = apiInstance.accessPoliciesDeleteAnAccessPolicy(uuid, uuid1, identifier);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling AccessPoliciesApi#accessPoliciesDeleteAnAccessPolicy");
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
| **uuid1** | **String**|  | |
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
| **202** | Delete an Access policy response |  -  |
| **4XX** | Delete an Access policy response failure |  -  |

<a id="accessPoliciesGetAnAccessPolicy"></a>
# **accessPoliciesGetAnAccessPolicy**
> AccessPoliciesComponentsSchemasSingleResponse accessPoliciesGetAnAccessPolicy(uuid, uuid1, identifier)

Get an Access policy

Fetches a single Access policy.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.AccessPoliciesApi;

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

    AccessPoliciesApi apiInstance = new AccessPoliciesApi(defaultClient);
    String uuid = "uuid_example"; // String | 
    String uuid1 = "uuid1_example"; // String | 
    String identifier = "identifier_example"; // String | 
    try {
      AccessPoliciesComponentsSchemasSingleResponse result = apiInstance.accessPoliciesGetAnAccessPolicy(uuid, uuid1, identifier);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling AccessPoliciesApi#accessPoliciesGetAnAccessPolicy");
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
| **uuid1** | **String**|  | |
| **identifier** | **String**|  | |

### Return type

[**AccessPoliciesComponentsSchemasSingleResponse**](AccessPoliciesComponentsSchemasSingleResponse.md)

### Authorization

[api_key](../README.md#api_key), [api_email](../README.md#api_email)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Get an Access policy response |  -  |
| **4XX** | Get an Access policy response failure |  -  |

<a id="accessPoliciesListAccessPolicies"></a>
# **accessPoliciesListAccessPolicies**
> AccessPoliciesComponentsSchemasResponseCollection accessPoliciesListAccessPolicies(uuid, identifier)

List Access policies

Lists Access policies configured for an application.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.AccessPoliciesApi;

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

    AccessPoliciesApi apiInstance = new AccessPoliciesApi(defaultClient);
    String uuid = "uuid_example"; // String | 
    String identifier = "identifier_example"; // String | 
    try {
      AccessPoliciesComponentsSchemasResponseCollection result = apiInstance.accessPoliciesListAccessPolicies(uuid, identifier);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling AccessPoliciesApi#accessPoliciesListAccessPolicies");
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

[**AccessPoliciesComponentsSchemasResponseCollection**](AccessPoliciesComponentsSchemasResponseCollection.md)

### Authorization

[api_key](../README.md#api_key), [api_email](../README.md#api_email)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | List Access policies response |  -  |
| **4XX** | List Access policies response failure |  -  |

<a id="accessPoliciesUpdateAnAccessPolicy"></a>
# **accessPoliciesUpdateAnAccessPolicy**
> AccessPoliciesComponentsSchemasSingleResponse accessPoliciesUpdateAnAccessPolicy(uuid, uuid1, identifier, accessPoliciesUpdateAnAccessPolicyRequest)

Update an Access policy

Update a configured Access policy.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.AccessPoliciesApi;

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

    AccessPoliciesApi apiInstance = new AccessPoliciesApi(defaultClient);
    String uuid = "uuid_example"; // String | 
    String uuid1 = "uuid1_example"; // String | 
    String identifier = "identifier_example"; // String | 
    AccessPoliciesUpdateAnAccessPolicyRequest accessPoliciesUpdateAnAccessPolicyRequest = new AccessPoliciesUpdateAnAccessPolicyRequest(); // AccessPoliciesUpdateAnAccessPolicyRequest | 
    try {
      AccessPoliciesComponentsSchemasSingleResponse result = apiInstance.accessPoliciesUpdateAnAccessPolicy(uuid, uuid1, identifier, accessPoliciesUpdateAnAccessPolicyRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling AccessPoliciesApi#accessPoliciesUpdateAnAccessPolicy");
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
| **uuid1** | **String**|  | |
| **identifier** | **String**|  | |
| **accessPoliciesUpdateAnAccessPolicyRequest** | [**AccessPoliciesUpdateAnAccessPolicyRequest**](AccessPoliciesUpdateAnAccessPolicyRequest.md)|  | |

### Return type

[**AccessPoliciesComponentsSchemasSingleResponse**](AccessPoliciesComponentsSchemasSingleResponse.md)

### Authorization

[api_key](../README.md#api_key), [api_email](../README.md#api_email)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Update an Access policy response |  -  |
| **4XX** | Update an Access policy response failure |  -  |

