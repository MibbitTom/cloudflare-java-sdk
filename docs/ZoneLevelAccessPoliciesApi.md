# ZoneLevelAccessPoliciesApi

All URIs are relative to *https://api.cloudflare.com/client/v4*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**zoneLevelAccessPoliciesCreateAnAccessPolicy**](ZoneLevelAccessPoliciesApi.md#zoneLevelAccessPoliciesCreateAnAccessPolicy) | **POST** /zones/{identifier}/access/apps/{uuid}/policies | Create an Access policy |
| [**zoneLevelAccessPoliciesDeleteAnAccessPolicy**](ZoneLevelAccessPoliciesApi.md#zoneLevelAccessPoliciesDeleteAnAccessPolicy) | **DELETE** /zones/{identifier}/access/apps/{uuid1}/policies/{uuid} | Delete an Access policy |
| [**zoneLevelAccessPoliciesGetAnAccessPolicy**](ZoneLevelAccessPoliciesApi.md#zoneLevelAccessPoliciesGetAnAccessPolicy) | **GET** /zones/{identifier}/access/apps/{uuid1}/policies/{uuid} | Get an Access policy |
| [**zoneLevelAccessPoliciesListAccessPolicies**](ZoneLevelAccessPoliciesApi.md#zoneLevelAccessPoliciesListAccessPolicies) | **GET** /zones/{identifier}/access/apps/{uuid}/policies | List Access policies |
| [**zoneLevelAccessPoliciesUpdateAnAccessPolicy**](ZoneLevelAccessPoliciesApi.md#zoneLevelAccessPoliciesUpdateAnAccessPolicy) | **PUT** /zones/{identifier}/access/apps/{uuid1}/policies/{uuid} | Update an Access policy |


<a id="zoneLevelAccessPoliciesCreateAnAccessPolicy"></a>
# **zoneLevelAccessPoliciesCreateAnAccessPolicy**
> AccessPoliciesComponentsSchemasSingleResponse2 zoneLevelAccessPoliciesCreateAnAccessPolicy(uuid, identifier, zoneLevelAccessPoliciesUpdateAnAccessPolicyRequest)

Create an Access policy

Create a new Access policy for an application.

### Example
```java
// Import classes:
import cloudflare.ApiClient;
import cloudflare.ApiException;
import cloudflare.Configuration;
import cloudflare.auth.*;
import cloudflare.models.*;
import cloudflare.sdk.ZoneLevelAccessPoliciesApi;

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

    ZoneLevelAccessPoliciesApi apiInstance = new ZoneLevelAccessPoliciesApi(defaultClient);
    String uuid = "uuid_example"; // String | 
    String identifier = "identifier_example"; // String | 
    ZoneLevelAccessPoliciesUpdateAnAccessPolicyRequest zoneLevelAccessPoliciesUpdateAnAccessPolicyRequest = new ZoneLevelAccessPoliciesUpdateAnAccessPolicyRequest(); // ZoneLevelAccessPoliciesUpdateAnAccessPolicyRequest | 
    try {
      AccessPoliciesComponentsSchemasSingleResponse2 result = apiInstance.zoneLevelAccessPoliciesCreateAnAccessPolicy(uuid, identifier, zoneLevelAccessPoliciesUpdateAnAccessPolicyRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ZoneLevelAccessPoliciesApi#zoneLevelAccessPoliciesCreateAnAccessPolicy");
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
| **zoneLevelAccessPoliciesUpdateAnAccessPolicyRequest** | [**ZoneLevelAccessPoliciesUpdateAnAccessPolicyRequest**](ZoneLevelAccessPoliciesUpdateAnAccessPolicyRequest.md)|  | |

### Return type

[**AccessPoliciesComponentsSchemasSingleResponse2**](AccessPoliciesComponentsSchemasSingleResponse2.md)

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

<a id="zoneLevelAccessPoliciesDeleteAnAccessPolicy"></a>
# **zoneLevelAccessPoliciesDeleteAnAccessPolicy**
> AccessIdResponse zoneLevelAccessPoliciesDeleteAnAccessPolicy(uuid, uuid1, identifier)

Delete an Access policy

Delete an Access policy.

### Example
```java
// Import classes:
import cloudflare.ApiClient;
import cloudflare.ApiException;
import cloudflare.Configuration;
import cloudflare.auth.*;
import cloudflare.models.*;
import cloudflare.sdk.ZoneLevelAccessPoliciesApi;

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

    ZoneLevelAccessPoliciesApi apiInstance = new ZoneLevelAccessPoliciesApi(defaultClient);
    String uuid = "uuid_example"; // String | 
    String uuid1 = "uuid1_example"; // String | 
    String identifier = "identifier_example"; // String | 
    try {
      AccessIdResponse result = apiInstance.zoneLevelAccessPoliciesDeleteAnAccessPolicy(uuid, uuid1, identifier);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ZoneLevelAccessPoliciesApi#zoneLevelAccessPoliciesDeleteAnAccessPolicy");
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

<a id="zoneLevelAccessPoliciesGetAnAccessPolicy"></a>
# **zoneLevelAccessPoliciesGetAnAccessPolicy**
> AccessPoliciesComponentsSchemasSingleResponse2 zoneLevelAccessPoliciesGetAnAccessPolicy(uuid, uuid1, identifier)

Get an Access policy

Fetches a single Access policy.

### Example
```java
// Import classes:
import cloudflare.ApiClient;
import cloudflare.ApiException;
import cloudflare.Configuration;
import cloudflare.auth.*;
import cloudflare.models.*;
import cloudflare.sdk.ZoneLevelAccessPoliciesApi;

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

    ZoneLevelAccessPoliciesApi apiInstance = new ZoneLevelAccessPoliciesApi(defaultClient);
    String uuid = "uuid_example"; // String | 
    String uuid1 = "uuid1_example"; // String | 
    String identifier = "identifier_example"; // String | 
    try {
      AccessPoliciesComponentsSchemasSingleResponse2 result = apiInstance.zoneLevelAccessPoliciesGetAnAccessPolicy(uuid, uuid1, identifier);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ZoneLevelAccessPoliciesApi#zoneLevelAccessPoliciesGetAnAccessPolicy");
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

[**AccessPoliciesComponentsSchemasSingleResponse2**](AccessPoliciesComponentsSchemasSingleResponse2.md)

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

<a id="zoneLevelAccessPoliciesListAccessPolicies"></a>
# **zoneLevelAccessPoliciesListAccessPolicies**
> AccessPoliciesComponentsSchemasResponseCollection2 zoneLevelAccessPoliciesListAccessPolicies(uuid, identifier)

List Access policies

Lists Access policies configured for an application.

### Example
```java
// Import classes:
import cloudflare.ApiClient;
import cloudflare.ApiException;
import cloudflare.Configuration;
import cloudflare.auth.*;
import cloudflare.models.*;
import cloudflare.sdk.ZoneLevelAccessPoliciesApi;

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

    ZoneLevelAccessPoliciesApi apiInstance = new ZoneLevelAccessPoliciesApi(defaultClient);
    String uuid = "uuid_example"; // String | 
    String identifier = "identifier_example"; // String | 
    try {
      AccessPoliciesComponentsSchemasResponseCollection2 result = apiInstance.zoneLevelAccessPoliciesListAccessPolicies(uuid, identifier);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ZoneLevelAccessPoliciesApi#zoneLevelAccessPoliciesListAccessPolicies");
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

[**AccessPoliciesComponentsSchemasResponseCollection2**](AccessPoliciesComponentsSchemasResponseCollection2.md)

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

<a id="zoneLevelAccessPoliciesUpdateAnAccessPolicy"></a>
# **zoneLevelAccessPoliciesUpdateAnAccessPolicy**
> AccessPoliciesComponentsSchemasSingleResponse2 zoneLevelAccessPoliciesUpdateAnAccessPolicy(uuid, uuid1, identifier, zoneLevelAccessPoliciesUpdateAnAccessPolicyRequest)

Update an Access policy

Update a configured Access policy.

### Example
```java
// Import classes:
import cloudflare.ApiClient;
import cloudflare.ApiException;
import cloudflare.Configuration;
import cloudflare.auth.*;
import cloudflare.models.*;
import cloudflare.sdk.ZoneLevelAccessPoliciesApi;

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

    ZoneLevelAccessPoliciesApi apiInstance = new ZoneLevelAccessPoliciesApi(defaultClient);
    String uuid = "uuid_example"; // String | 
    String uuid1 = "uuid1_example"; // String | 
    String identifier = "identifier_example"; // String | 
    ZoneLevelAccessPoliciesUpdateAnAccessPolicyRequest zoneLevelAccessPoliciesUpdateAnAccessPolicyRequest = new ZoneLevelAccessPoliciesUpdateAnAccessPolicyRequest(); // ZoneLevelAccessPoliciesUpdateAnAccessPolicyRequest | 
    try {
      AccessPoliciesComponentsSchemasSingleResponse2 result = apiInstance.zoneLevelAccessPoliciesUpdateAnAccessPolicy(uuid, uuid1, identifier, zoneLevelAccessPoliciesUpdateAnAccessPolicyRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ZoneLevelAccessPoliciesApi#zoneLevelAccessPoliciesUpdateAnAccessPolicy");
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
| **zoneLevelAccessPoliciesUpdateAnAccessPolicyRequest** | [**ZoneLevelAccessPoliciesUpdateAnAccessPolicyRequest**](ZoneLevelAccessPoliciesUpdateAnAccessPolicyRequest.md)|  | |

### Return type

[**AccessPoliciesComponentsSchemasSingleResponse2**](AccessPoliciesComponentsSchemasSingleResponse2.md)

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

