# ZoneLevelAccessIdentityProvidersApi

All URIs are relative to *https://api.cloudflare.com/client/v4*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**zoneLevelAccessIdentityProvidersAddAnAccessIdentityProvider**](ZoneLevelAccessIdentityProvidersApi.md#zoneLevelAccessIdentityProvidersAddAnAccessIdentityProvider) | **POST** /zones/{identifier}/access/identity_providers | Add an Access identity provider |
| [**zoneLevelAccessIdentityProvidersDeleteAnAccessIdentityProvider**](ZoneLevelAccessIdentityProvidersApi.md#zoneLevelAccessIdentityProvidersDeleteAnAccessIdentityProvider) | **DELETE** /zones/{identifier}/access/identity_providers/{uuid} | Delete an Access identity provider |
| [**zoneLevelAccessIdentityProvidersGetAnAccessIdentityProvider**](ZoneLevelAccessIdentityProvidersApi.md#zoneLevelAccessIdentityProvidersGetAnAccessIdentityProvider) | **GET** /zones/{identifier}/access/identity_providers/{uuid} | Get an Access identity provider |
| [**zoneLevelAccessIdentityProvidersListAccessIdentityProviders**](ZoneLevelAccessIdentityProvidersApi.md#zoneLevelAccessIdentityProvidersListAccessIdentityProviders) | **GET** /zones/{identifier}/access/identity_providers | List Access identity providers |
| [**zoneLevelAccessIdentityProvidersUpdateAnAccessIdentityProvider**](ZoneLevelAccessIdentityProvidersApi.md#zoneLevelAccessIdentityProvidersUpdateAnAccessIdentityProvider) | **PUT** /zones/{identifier}/access/identity_providers/{uuid} | Update an Access identity provider |


<a id="zoneLevelAccessIdentityProvidersAddAnAccessIdentityProvider"></a>
# **zoneLevelAccessIdentityProvidersAddAnAccessIdentityProvider**
> AccessIdentityProvidersComponentsSchemasSingleResponse zoneLevelAccessIdentityProvidersAddAnAccessIdentityProvider(identifier, accessSchemasIdentityProviders)

Add an Access identity provider

Adds a new identity provider to Access.

### Example
```java
// Import classes:
import cloudflare.ApiClient;
import cloudflare.ApiException;
import cloudflare.Configuration;
import cloudflare.auth.*;
import cloudflare.models.*;
import cloudflare.sdk.ZoneLevelAccessIdentityProvidersApi;

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

    ZoneLevelAccessIdentityProvidersApi apiInstance = new ZoneLevelAccessIdentityProvidersApi(defaultClient);
    String identifier = "identifier_example"; // String | 
    AccessSchemasIdentityProviders accessSchemasIdentityProviders = new AccessSchemasIdentityProviders(); // AccessSchemasIdentityProviders | 
    try {
      AccessIdentityProvidersComponentsSchemasSingleResponse result = apiInstance.zoneLevelAccessIdentityProvidersAddAnAccessIdentityProvider(identifier, accessSchemasIdentityProviders);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ZoneLevelAccessIdentityProvidersApi#zoneLevelAccessIdentityProvidersAddAnAccessIdentityProvider");
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
| **accessSchemasIdentityProviders** | [**AccessSchemasIdentityProviders**](AccessSchemasIdentityProviders.md)|  | |

### Return type

[**AccessIdentityProvidersComponentsSchemasSingleResponse**](AccessIdentityProvidersComponentsSchemasSingleResponse.md)

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

<a id="zoneLevelAccessIdentityProvidersDeleteAnAccessIdentityProvider"></a>
# **zoneLevelAccessIdentityProvidersDeleteAnAccessIdentityProvider**
> AccessIdResponse zoneLevelAccessIdentityProvidersDeleteAnAccessIdentityProvider(uuid, identifier)

Delete an Access identity provider

Deletes an identity provider from Access.

### Example
```java
// Import classes:
import cloudflare.ApiClient;
import cloudflare.ApiException;
import cloudflare.Configuration;
import cloudflare.auth.*;
import cloudflare.models.*;
import cloudflare.sdk.ZoneLevelAccessIdentityProvidersApi;

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

    ZoneLevelAccessIdentityProvidersApi apiInstance = new ZoneLevelAccessIdentityProvidersApi(defaultClient);
    String uuid = "uuid_example"; // String | 
    String identifier = "identifier_example"; // String | 
    try {
      AccessIdResponse result = apiInstance.zoneLevelAccessIdentityProvidersDeleteAnAccessIdentityProvider(uuid, identifier);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ZoneLevelAccessIdentityProvidersApi#zoneLevelAccessIdentityProvidersDeleteAnAccessIdentityProvider");
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

<a id="zoneLevelAccessIdentityProvidersGetAnAccessIdentityProvider"></a>
# **zoneLevelAccessIdentityProvidersGetAnAccessIdentityProvider**
> AccessIdentityProvidersComponentsSchemasSingleResponse zoneLevelAccessIdentityProvidersGetAnAccessIdentityProvider(uuid, identifier)

Get an Access identity provider

Fetches a configured identity provider.

### Example
```java
// Import classes:
import cloudflare.ApiClient;
import cloudflare.ApiException;
import cloudflare.Configuration;
import cloudflare.auth.*;
import cloudflare.models.*;
import cloudflare.sdk.ZoneLevelAccessIdentityProvidersApi;

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

    ZoneLevelAccessIdentityProvidersApi apiInstance = new ZoneLevelAccessIdentityProvidersApi(defaultClient);
    String uuid = "uuid_example"; // String | 
    String identifier = "identifier_example"; // String | 
    try {
      AccessIdentityProvidersComponentsSchemasSingleResponse result = apiInstance.zoneLevelAccessIdentityProvidersGetAnAccessIdentityProvider(uuid, identifier);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ZoneLevelAccessIdentityProvidersApi#zoneLevelAccessIdentityProvidersGetAnAccessIdentityProvider");
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

[**AccessIdentityProvidersComponentsSchemasSingleResponse**](AccessIdentityProvidersComponentsSchemasSingleResponse.md)

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

<a id="zoneLevelAccessIdentityProvidersListAccessIdentityProviders"></a>
# **zoneLevelAccessIdentityProvidersListAccessIdentityProviders**
> AccessIdentityProvidersComponentsSchemasResponseCollection zoneLevelAccessIdentityProvidersListAccessIdentityProviders(identifier)

List Access identity providers

Lists all configured identity providers.

### Example
```java
// Import classes:
import cloudflare.ApiClient;
import cloudflare.ApiException;
import cloudflare.Configuration;
import cloudflare.auth.*;
import cloudflare.models.*;
import cloudflare.sdk.ZoneLevelAccessIdentityProvidersApi;

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

    ZoneLevelAccessIdentityProvidersApi apiInstance = new ZoneLevelAccessIdentityProvidersApi(defaultClient);
    String identifier = "identifier_example"; // String | 
    try {
      AccessIdentityProvidersComponentsSchemasResponseCollection result = apiInstance.zoneLevelAccessIdentityProvidersListAccessIdentityProviders(identifier);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ZoneLevelAccessIdentityProvidersApi#zoneLevelAccessIdentityProvidersListAccessIdentityProviders");
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

[**AccessIdentityProvidersComponentsSchemasResponseCollection**](AccessIdentityProvidersComponentsSchemasResponseCollection.md)

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

<a id="zoneLevelAccessIdentityProvidersUpdateAnAccessIdentityProvider"></a>
# **zoneLevelAccessIdentityProvidersUpdateAnAccessIdentityProvider**
> AccessIdentityProvidersComponentsSchemasSingleResponse zoneLevelAccessIdentityProvidersUpdateAnAccessIdentityProvider(uuid, identifier, accessSchemasIdentityProviders)

Update an Access identity provider

Updates a configured identity provider.

### Example
```java
// Import classes:
import cloudflare.ApiClient;
import cloudflare.ApiException;
import cloudflare.Configuration;
import cloudflare.auth.*;
import cloudflare.models.*;
import cloudflare.sdk.ZoneLevelAccessIdentityProvidersApi;

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

    ZoneLevelAccessIdentityProvidersApi apiInstance = new ZoneLevelAccessIdentityProvidersApi(defaultClient);
    String uuid = "uuid_example"; // String | 
    String identifier = "identifier_example"; // String | 
    AccessSchemasIdentityProviders accessSchemasIdentityProviders = new AccessSchemasIdentityProviders(); // AccessSchemasIdentityProviders | 
    try {
      AccessIdentityProvidersComponentsSchemasSingleResponse result = apiInstance.zoneLevelAccessIdentityProvidersUpdateAnAccessIdentityProvider(uuid, identifier, accessSchemasIdentityProviders);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ZoneLevelAccessIdentityProvidersApi#zoneLevelAccessIdentityProvidersUpdateAnAccessIdentityProvider");
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
| **accessSchemasIdentityProviders** | [**AccessSchemasIdentityProviders**](AccessSchemasIdentityProviders.md)|  | |

### Return type

[**AccessIdentityProvidersComponentsSchemasSingleResponse**](AccessIdentityProvidersComponentsSchemasSingleResponse.md)

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

