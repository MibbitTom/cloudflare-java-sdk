# AccessIdentityProvidersApi

All URIs are relative to *https://api.cloudflare.com/client/v4*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**accessIdentityProvidersAddAnAccessIdentityProvider**](AccessIdentityProvidersApi.md#accessIdentityProvidersAddAnAccessIdentityProvider) | **POST** /accounts/{identifier}/access/identity_providers | Add an Access identity provider |
| [**accessIdentityProvidersDeleteAnAccessIdentityProvider**](AccessIdentityProvidersApi.md#accessIdentityProvidersDeleteAnAccessIdentityProvider) | **DELETE** /accounts/{identifier}/access/identity_providers/{uuid} | Delete an Access identity provider |
| [**accessIdentityProvidersGetAnAccessIdentityProvider**](AccessIdentityProvidersApi.md#accessIdentityProvidersGetAnAccessIdentityProvider) | **GET** /accounts/{identifier}/access/identity_providers/{uuid} | Get an Access identity provider |
| [**accessIdentityProvidersListAccessIdentityProviders**](AccessIdentityProvidersApi.md#accessIdentityProvidersListAccessIdentityProviders) | **GET** /accounts/{identifier}/access/identity_providers | List Access identity providers |
| [**accessIdentityProvidersUpdateAnAccessIdentityProvider**](AccessIdentityProvidersApi.md#accessIdentityProvidersUpdateAnAccessIdentityProvider) | **PUT** /accounts/{identifier}/access/identity_providers/{uuid} | Update an Access identity provider |


<a id="accessIdentityProvidersAddAnAccessIdentityProvider"></a>
# **accessIdentityProvidersAddAnAccessIdentityProvider**
> AccessSchemasSingleResponse accessIdentityProvidersAddAnAccessIdentityProvider(identifier, accessIdentityProviders)

Add an Access identity provider

Adds a new identity provider to Access.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.AccessIdentityProvidersApi;

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

    AccessIdentityProvidersApi apiInstance = new AccessIdentityProvidersApi(defaultClient);
    String identifier = "identifier_example"; // String | 
    AccessIdentityProviders accessIdentityProviders = new AccessIdentityProviders(); // AccessIdentityProviders | 
    try {
      AccessSchemasSingleResponse result = apiInstance.accessIdentityProvidersAddAnAccessIdentityProvider(identifier, accessIdentityProviders);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling AccessIdentityProvidersApi#accessIdentityProvidersAddAnAccessIdentityProvider");
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
| **accessIdentityProviders** | [**AccessIdentityProviders**](AccessIdentityProviders.md)|  | |

### Return type

[**AccessSchemasSingleResponse**](AccessSchemasSingleResponse.md)

### Authorization

[api_key](../README.md#api_key), [api_email](../README.md#api_email)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **201** | Add an Access identity provider response |  -  |
| **4XX** | Add an Access identity provider response failure |  -  |

<a id="accessIdentityProvidersDeleteAnAccessIdentityProvider"></a>
# **accessIdentityProvidersDeleteAnAccessIdentityProvider**
> AccessIdResponse accessIdentityProvidersDeleteAnAccessIdentityProvider(uuid, identifier)

Delete an Access identity provider

Deletes an identity provider from Access.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.AccessIdentityProvidersApi;

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

    AccessIdentityProvidersApi apiInstance = new AccessIdentityProvidersApi(defaultClient);
    String uuid = "uuid_example"; // String | 
    String identifier = "identifier_example"; // String | 
    try {
      AccessIdResponse result = apiInstance.accessIdentityProvidersDeleteAnAccessIdentityProvider(uuid, identifier);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling AccessIdentityProvidersApi#accessIdentityProvidersDeleteAnAccessIdentityProvider");
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
| **202** | Delete an Access identity provider response |  -  |
| **4XX** | Delete an Access identity provider response failure |  -  |

<a id="accessIdentityProvidersGetAnAccessIdentityProvider"></a>
# **accessIdentityProvidersGetAnAccessIdentityProvider**
> AccessSchemasSingleResponse accessIdentityProvidersGetAnAccessIdentityProvider(uuid, identifier)

Get an Access identity provider

Fetches a configured identity provider.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.AccessIdentityProvidersApi;

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

    AccessIdentityProvidersApi apiInstance = new AccessIdentityProvidersApi(defaultClient);
    String uuid = "uuid_example"; // String | 
    String identifier = "identifier_example"; // String | 
    try {
      AccessSchemasSingleResponse result = apiInstance.accessIdentityProvidersGetAnAccessIdentityProvider(uuid, identifier);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling AccessIdentityProvidersApi#accessIdentityProvidersGetAnAccessIdentityProvider");
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

[**AccessSchemasSingleResponse**](AccessSchemasSingleResponse.md)

### Authorization

[api_key](../README.md#api_key), [api_email](../README.md#api_email)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Get an Access identity provider response |  -  |
| **4XX** | Get an Access identity provider response failure |  -  |

<a id="accessIdentityProvidersListAccessIdentityProviders"></a>
# **accessIdentityProvidersListAccessIdentityProviders**
> AccessResponseCollection accessIdentityProvidersListAccessIdentityProviders(identifier)

List Access identity providers

Lists all configured identity providers.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.AccessIdentityProvidersApi;

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

    AccessIdentityProvidersApi apiInstance = new AccessIdentityProvidersApi(defaultClient);
    String identifier = "identifier_example"; // String | 
    try {
      AccessResponseCollection result = apiInstance.accessIdentityProvidersListAccessIdentityProviders(identifier);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling AccessIdentityProvidersApi#accessIdentityProvidersListAccessIdentityProviders");
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

[**AccessResponseCollection**](AccessResponseCollection.md)

### Authorization

[api_key](../README.md#api_key), [api_email](../README.md#api_email)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | List Access identity providers response |  -  |
| **4XX** | List Access identity providers response failure |  -  |

<a id="accessIdentityProvidersUpdateAnAccessIdentityProvider"></a>
# **accessIdentityProvidersUpdateAnAccessIdentityProvider**
> AccessSchemasSingleResponse accessIdentityProvidersUpdateAnAccessIdentityProvider(uuid, identifier, accessIdentityProviders)

Update an Access identity provider

Updates a configured identity provider.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.AccessIdentityProvidersApi;

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

    AccessIdentityProvidersApi apiInstance = new AccessIdentityProvidersApi(defaultClient);
    String uuid = "uuid_example"; // String | 
    String identifier = "identifier_example"; // String | 
    AccessIdentityProviders accessIdentityProviders = new AccessIdentityProviders(); // AccessIdentityProviders | 
    try {
      AccessSchemasSingleResponse result = apiInstance.accessIdentityProvidersUpdateAnAccessIdentityProvider(uuid, identifier, accessIdentityProviders);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling AccessIdentityProvidersApi#accessIdentityProvidersUpdateAnAccessIdentityProvider");
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
| **accessIdentityProviders** | [**AccessIdentityProviders**](AccessIdentityProviders.md)|  | |

### Return type

[**AccessSchemasSingleResponse**](AccessSchemasSingleResponse.md)

### Authorization

[api_key](../README.md#api_key), [api_email](../README.md#api_email)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Update an Access identity provider response |  -  |
| **4XX** | Update an Access identity provider response failure |  -  |

