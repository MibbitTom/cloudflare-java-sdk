# ZoneLevelAccessApplicationsApi

All URIs are relative to *https://api.cloudflare.com/client/v4*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**zoneLevelAccessApplicationsAddABookmarkApplication**](ZoneLevelAccessApplicationsApi.md#zoneLevelAccessApplicationsAddABookmarkApplication) | **POST** /zones/{identifier}/access/apps | Add an Access application |
| [**zoneLevelAccessApplicationsDeleteAnAccessApplication**](ZoneLevelAccessApplicationsApi.md#zoneLevelAccessApplicationsDeleteAnAccessApplication) | **DELETE** /zones/{identifier}/access/apps/{app_id} | Delete an Access application |
| [**zoneLevelAccessApplicationsGetAnAccessApplication**](ZoneLevelAccessApplicationsApi.md#zoneLevelAccessApplicationsGetAnAccessApplication) | **GET** /zones/{identifier}/access/apps/{app_id} | Get an Access application |
| [**zoneLevelAccessApplicationsListAccessApplications**](ZoneLevelAccessApplicationsApi.md#zoneLevelAccessApplicationsListAccessApplications) | **GET** /zones/{identifier}/access/apps | List Access Applications |
| [**zoneLevelAccessApplicationsRevokeServiceTokens**](ZoneLevelAccessApplicationsApi.md#zoneLevelAccessApplicationsRevokeServiceTokens) | **POST** /zones/{identifier}/access/apps/{app_id}/revoke_tokens | Revoke application tokens |
| [**zoneLevelAccessApplicationsTestAccessPolicies**](ZoneLevelAccessApplicationsApi.md#zoneLevelAccessApplicationsTestAccessPolicies) | **GET** /zones/{identifier}/access/apps/{app_id}/user_policy_checks | Test Access policies |
| [**zoneLevelAccessApplicationsUpdateABookmarkApplication**](ZoneLevelAccessApplicationsApi.md#zoneLevelAccessApplicationsUpdateABookmarkApplication) | **PUT** /zones/{identifier}/access/apps/{app_id} | Update an Access application |


<a id="zoneLevelAccessApplicationsAddABookmarkApplication"></a>
# **zoneLevelAccessApplicationsAddABookmarkApplication**
> ZoneLevelAccessApplicationsAddABookmarkApplication201Response zoneLevelAccessApplicationsAddABookmarkApplication(identifier, accessSchemasApps)

Add an Access application

Adds a new application to Access.

### Example
```java
// Import classes:
import cloudflare.ApiClient;
import cloudflare.ApiException;
import cloudflare.Configuration;
import cloudflare.auth.*;
import cloudflare.models.*;
import cloudflare.sdk.ZoneLevelAccessApplicationsApi;

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

    ZoneLevelAccessApplicationsApi apiInstance = new ZoneLevelAccessApplicationsApi(defaultClient);
    String identifier = "identifier_example"; // String | 
    AccessSchemasApps accessSchemasApps = new AccessSchemasApps(); // AccessSchemasApps | 
    try {
      ZoneLevelAccessApplicationsAddABookmarkApplication201Response result = apiInstance.zoneLevelAccessApplicationsAddABookmarkApplication(identifier, accessSchemasApps);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ZoneLevelAccessApplicationsApi#zoneLevelAccessApplicationsAddABookmarkApplication");
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
| **accessSchemasApps** | [**AccessSchemasApps**](AccessSchemasApps.md)|  | |

### Return type

[**ZoneLevelAccessApplicationsAddABookmarkApplication201Response**](ZoneLevelAccessApplicationsAddABookmarkApplication201Response.md)

### Authorization

[api_key](../README.md#api_key), [api_email](../README.md#api_email)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **201** | Add an Access application response |  -  |
| **4XX** | Add an Access application response failure |  -  |

<a id="zoneLevelAccessApplicationsDeleteAnAccessApplication"></a>
# **zoneLevelAccessApplicationsDeleteAnAccessApplication**
> AccessIdResponse zoneLevelAccessApplicationsDeleteAnAccessApplication(appId, identifier)

Delete an Access application

Deletes an application from Access.

### Example
```java
// Import classes:
import cloudflare.ApiClient;
import cloudflare.ApiException;
import cloudflare.Configuration;
import cloudflare.auth.*;
import cloudflare.models.*;
import cloudflare.sdk.ZoneLevelAccessApplicationsApi;

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

    ZoneLevelAccessApplicationsApi apiInstance = new ZoneLevelAccessApplicationsApi(defaultClient);
    AccessAppId appId = new AccessAppId(); // AccessAppId | 
    String identifier = "identifier_example"; // String | 
    try {
      AccessIdResponse result = apiInstance.zoneLevelAccessApplicationsDeleteAnAccessApplication(appId, identifier);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ZoneLevelAccessApplicationsApi#zoneLevelAccessApplicationsDeleteAnAccessApplication");
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
| **appId** | [**AccessAppId**](.md)|  | |
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
| **202** | Delete an Access application response |  -  |
| **4XX** | Delete an Access application response failure |  -  |

<a id="zoneLevelAccessApplicationsGetAnAccessApplication"></a>
# **zoneLevelAccessApplicationsGetAnAccessApplication**
> AccessAppsComponentsSchemasSingleResponse2 zoneLevelAccessApplicationsGetAnAccessApplication(appId, identifier)

Get an Access application

Fetches information about an Access application.

### Example
```java
// Import classes:
import cloudflare.ApiClient;
import cloudflare.ApiException;
import cloudflare.Configuration;
import cloudflare.auth.*;
import cloudflare.models.*;
import cloudflare.sdk.ZoneLevelAccessApplicationsApi;

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

    ZoneLevelAccessApplicationsApi apiInstance = new ZoneLevelAccessApplicationsApi(defaultClient);
    AccessAppId appId = new AccessAppId(); // AccessAppId | 
    String identifier = "identifier_example"; // String | 
    try {
      AccessAppsComponentsSchemasSingleResponse2 result = apiInstance.zoneLevelAccessApplicationsGetAnAccessApplication(appId, identifier);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ZoneLevelAccessApplicationsApi#zoneLevelAccessApplicationsGetAnAccessApplication");
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
| **appId** | [**AccessAppId**](.md)|  | |
| **identifier** | **String**|  | |

### Return type

[**AccessAppsComponentsSchemasSingleResponse2**](AccessAppsComponentsSchemasSingleResponse2.md)

### Authorization

[api_key](../README.md#api_key), [api_email](../README.md#api_email)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Get an Access application response |  -  |
| **4XX** | Get an Access application response failure |  -  |

<a id="zoneLevelAccessApplicationsListAccessApplications"></a>
# **zoneLevelAccessApplicationsListAccessApplications**
> AccessAppsComponentsSchemasResponseCollection2 zoneLevelAccessApplicationsListAccessApplications(identifier)

List Access Applications

List all Access Applications in a zone.

### Example
```java
// Import classes:
import cloudflare.ApiClient;
import cloudflare.ApiException;
import cloudflare.Configuration;
import cloudflare.auth.*;
import cloudflare.models.*;
import cloudflare.sdk.ZoneLevelAccessApplicationsApi;

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

    ZoneLevelAccessApplicationsApi apiInstance = new ZoneLevelAccessApplicationsApi(defaultClient);
    String identifier = "identifier_example"; // String | 
    try {
      AccessAppsComponentsSchemasResponseCollection2 result = apiInstance.zoneLevelAccessApplicationsListAccessApplications(identifier);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ZoneLevelAccessApplicationsApi#zoneLevelAccessApplicationsListAccessApplications");
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

[**AccessAppsComponentsSchemasResponseCollection2**](AccessAppsComponentsSchemasResponseCollection2.md)

### Authorization

[api_key](../README.md#api_key), [api_email](../README.md#api_email)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | List Access Applications response |  -  |
| **4XX** | List Access Applications response failure |  -  |

<a id="zoneLevelAccessApplicationsRevokeServiceTokens"></a>
# **zoneLevelAccessApplicationsRevokeServiceTokens**
> AccessSchemasEmptyResponse zoneLevelAccessApplicationsRevokeServiceTokens(appId, identifier)

Revoke application tokens

Revokes all tokens issued for an application.

### Example
```java
// Import classes:
import cloudflare.ApiClient;
import cloudflare.ApiException;
import cloudflare.Configuration;
import cloudflare.auth.*;
import cloudflare.models.*;
import cloudflare.sdk.ZoneLevelAccessApplicationsApi;

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

    ZoneLevelAccessApplicationsApi apiInstance = new ZoneLevelAccessApplicationsApi(defaultClient);
    AccessAppId appId = new AccessAppId(); // AccessAppId | 
    String identifier = "identifier_example"; // String | 
    try {
      AccessSchemasEmptyResponse result = apiInstance.zoneLevelAccessApplicationsRevokeServiceTokens(appId, identifier);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ZoneLevelAccessApplicationsApi#zoneLevelAccessApplicationsRevokeServiceTokens");
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
| **appId** | [**AccessAppId**](.md)|  | |
| **identifier** | **String**|  | |

### Return type

[**AccessSchemasEmptyResponse**](AccessSchemasEmptyResponse.md)

### Authorization

[api_key](../README.md#api_key), [api_email](../README.md#api_email)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **202** | Revoke application tokens response |  -  |
| **4XX** | Revoke application tokens response failure |  -  |

<a id="zoneLevelAccessApplicationsTestAccessPolicies"></a>
# **zoneLevelAccessApplicationsTestAccessPolicies**
> AccessSchemasPolicyCheckResponse zoneLevelAccessApplicationsTestAccessPolicies(appId, identifier)

Test Access policies

Tests if a specific user has permission to access an application.

### Example
```java
// Import classes:
import cloudflare.ApiClient;
import cloudflare.ApiException;
import cloudflare.Configuration;
import cloudflare.auth.*;
import cloudflare.models.*;
import cloudflare.sdk.ZoneLevelAccessApplicationsApi;

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

    ZoneLevelAccessApplicationsApi apiInstance = new ZoneLevelAccessApplicationsApi(defaultClient);
    AccessAppId appId = new AccessAppId(); // AccessAppId | 
    String identifier = "identifier_example"; // String | 
    try {
      AccessSchemasPolicyCheckResponse result = apiInstance.zoneLevelAccessApplicationsTestAccessPolicies(appId, identifier);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ZoneLevelAccessApplicationsApi#zoneLevelAccessApplicationsTestAccessPolicies");
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
| **appId** | [**AccessAppId**](.md)|  | |
| **identifier** | **String**|  | |

### Return type

[**AccessSchemasPolicyCheckResponse**](AccessSchemasPolicyCheckResponse.md)

### Authorization

[api_key](../README.md#api_key), [api_email](../README.md#api_email)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Test Access policies response |  -  |
| **4XX** | Test Access policies response failure |  -  |

<a id="zoneLevelAccessApplicationsUpdateABookmarkApplication"></a>
# **zoneLevelAccessApplicationsUpdateABookmarkApplication**
> ZoneLevelAccessApplicationsAddABookmarkApplication201Response zoneLevelAccessApplicationsUpdateABookmarkApplication(appId, identifier, accessSchemasApps)

Update an Access application

Updates an Access application.

### Example
```java
// Import classes:
import cloudflare.ApiClient;
import cloudflare.ApiException;
import cloudflare.Configuration;
import cloudflare.auth.*;
import cloudflare.models.*;
import cloudflare.sdk.ZoneLevelAccessApplicationsApi;

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

    ZoneLevelAccessApplicationsApi apiInstance = new ZoneLevelAccessApplicationsApi(defaultClient);
    AccessAppId appId = new AccessAppId(); // AccessAppId | 
    String identifier = "identifier_example"; // String | 
    AccessSchemasApps accessSchemasApps = new AccessSchemasApps(); // AccessSchemasApps | 
    try {
      ZoneLevelAccessApplicationsAddABookmarkApplication201Response result = apiInstance.zoneLevelAccessApplicationsUpdateABookmarkApplication(appId, identifier, accessSchemasApps);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ZoneLevelAccessApplicationsApi#zoneLevelAccessApplicationsUpdateABookmarkApplication");
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
| **appId** | [**AccessAppId**](.md)|  | |
| **identifier** | **String**|  | |
| **accessSchemasApps** | [**AccessSchemasApps**](AccessSchemasApps.md)|  | |

### Return type

[**ZoneLevelAccessApplicationsAddABookmarkApplication201Response**](ZoneLevelAccessApplicationsAddABookmarkApplication201Response.md)

### Authorization

[api_key](../README.md#api_key), [api_email](../README.md#api_email)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Update an Access application response |  -  |
| **4XX** | Update an Access application response failure |  -  |

