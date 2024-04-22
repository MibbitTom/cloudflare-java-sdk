# AccessApplicationsApi

All URIs are relative to *https://api.cloudflare.com/client/v4*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**accessApplicationsAddAnApplication**](AccessApplicationsApi.md#accessApplicationsAddAnApplication) | **POST** /accounts/{identifier}/access/apps | Add an Access Application |
| [**accessApplicationsDeleteAnAccessApplication**](AccessApplicationsApi.md#accessApplicationsDeleteAnAccessApplication) | **DELETE** /accounts/{identifier}/access/apps/{app_id} | Delete an Access application |
| [**accessApplicationsGetAnAccessApplication**](AccessApplicationsApi.md#accessApplicationsGetAnAccessApplication) | **GET** /accounts/{identifier}/access/apps/{app_id} | Get an Access application |
| [**accessApplicationsListAccessApplications**](AccessApplicationsApi.md#accessApplicationsListAccessApplications) | **GET** /accounts/{identifier}/access/apps | List Access applications |
| [**accessApplicationsRevokeServiceTokens**](AccessApplicationsApi.md#accessApplicationsRevokeServiceTokens) | **POST** /accounts/{identifier}/access/apps/{app_id}/revoke_tokens | Revoke application tokens |
| [**accessApplicationsTestAccessPolicies**](AccessApplicationsApi.md#accessApplicationsTestAccessPolicies) | **GET** /accounts/{identifier}/access/apps/{app_id}/user_policy_checks | Test Access policies |
| [**accessApplicationsUpdateABookmarkApplication**](AccessApplicationsApi.md#accessApplicationsUpdateABookmarkApplication) | **PUT** /accounts/{identifier}/access/apps/{app_id} | Update an Access application |


<a id="accessApplicationsAddAnApplication"></a>
# **accessApplicationsAddAnApplication**
> AccessApplicationsAddAnApplication201Response accessApplicationsAddAnApplication(identifier, accessApps)

Add an Access Application

Adds a new application to Access.

### Example
```java
// Import classes:
import cloudflare.ApiClient;
import cloudflare.ApiException;
import cloudflare.Configuration;
import cloudflare.auth.*;
import cloudflare.models.*;
import cloudflare.sdk.AccessApplicationsApi;

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

    AccessApplicationsApi apiInstance = new AccessApplicationsApi(defaultClient);
    String identifier = "identifier_example"; // String | 
    AccessApps accessApps = new AccessApps(); // AccessApps | 
    try {
      AccessApplicationsAddAnApplication201Response result = apiInstance.accessApplicationsAddAnApplication(identifier, accessApps);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling AccessApplicationsApi#accessApplicationsAddAnApplication");
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
| **accessApps** | [**AccessApps**](AccessApps.md)|  | |

### Return type

[**AccessApplicationsAddAnApplication201Response**](AccessApplicationsAddAnApplication201Response.md)

### Authorization

[api_key](../README.md#api_key), [api_email](../README.md#api_email)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **201** | Add an application response |  -  |
| **4XX** | Add a Bookmark application response failure |  -  |

<a id="accessApplicationsDeleteAnAccessApplication"></a>
# **accessApplicationsDeleteAnAccessApplication**
> AccessIdResponse accessApplicationsDeleteAnAccessApplication(appId, identifier)

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
import cloudflare.sdk.AccessApplicationsApi;

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

    AccessApplicationsApi apiInstance = new AccessApplicationsApi(defaultClient);
    AccessAppId appId = new AccessAppId(); // AccessAppId | 
    String identifier = "identifier_example"; // String | 
    try {
      AccessIdResponse result = apiInstance.accessApplicationsDeleteAnAccessApplication(appId, identifier);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling AccessApplicationsApi#accessApplicationsDeleteAnAccessApplication");
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

<a id="accessApplicationsGetAnAccessApplication"></a>
# **accessApplicationsGetAnAccessApplication**
> AccessAppsComponentsSchemasSingleResponse accessApplicationsGetAnAccessApplication(appId, identifier)

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
import cloudflare.sdk.AccessApplicationsApi;

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

    AccessApplicationsApi apiInstance = new AccessApplicationsApi(defaultClient);
    AccessAppId appId = new AccessAppId(); // AccessAppId | 
    String identifier = "identifier_example"; // String | 
    try {
      AccessAppsComponentsSchemasSingleResponse result = apiInstance.accessApplicationsGetAnAccessApplication(appId, identifier);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling AccessApplicationsApi#accessApplicationsGetAnAccessApplication");
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

[**AccessAppsComponentsSchemasSingleResponse**](AccessAppsComponentsSchemasSingleResponse.md)

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

<a id="accessApplicationsListAccessApplications"></a>
# **accessApplicationsListAccessApplications**
> AccessAppsComponentsSchemasResponseCollection accessApplicationsListAccessApplications(identifier)

List Access applications

Lists all Access applications in an account.

### Example
```java
// Import classes:
import cloudflare.ApiClient;
import cloudflare.ApiException;
import cloudflare.Configuration;
import cloudflare.auth.*;
import cloudflare.models.*;
import cloudflare.sdk.AccessApplicationsApi;

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

    AccessApplicationsApi apiInstance = new AccessApplicationsApi(defaultClient);
    String identifier = "identifier_example"; // String | 
    try {
      AccessAppsComponentsSchemasResponseCollection result = apiInstance.accessApplicationsListAccessApplications(identifier);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling AccessApplicationsApi#accessApplicationsListAccessApplications");
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

[**AccessAppsComponentsSchemasResponseCollection**](AccessAppsComponentsSchemasResponseCollection.md)

### Authorization

[api_key](../README.md#api_key), [api_email](../README.md#api_email)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | List Access applications response |  -  |
| **4XX** | List Access applications response failure |  -  |

<a id="accessApplicationsRevokeServiceTokens"></a>
# **accessApplicationsRevokeServiceTokens**
> AccessSchemasEmptyResponse accessApplicationsRevokeServiceTokens(appId, identifier)

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
import cloudflare.sdk.AccessApplicationsApi;

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

    AccessApplicationsApi apiInstance = new AccessApplicationsApi(defaultClient);
    AccessAppId appId = new AccessAppId(); // AccessAppId | 
    String identifier = "identifier_example"; // String | 
    try {
      AccessSchemasEmptyResponse result = apiInstance.accessApplicationsRevokeServiceTokens(appId, identifier);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling AccessApplicationsApi#accessApplicationsRevokeServiceTokens");
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

<a id="accessApplicationsTestAccessPolicies"></a>
# **accessApplicationsTestAccessPolicies**
> AccessPolicyCheckResponse accessApplicationsTestAccessPolicies(appId, identifier)

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
import cloudflare.sdk.AccessApplicationsApi;

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

    AccessApplicationsApi apiInstance = new AccessApplicationsApi(defaultClient);
    AccessAppId appId = new AccessAppId(); // AccessAppId | 
    String identifier = "identifier_example"; // String | 
    try {
      AccessPolicyCheckResponse result = apiInstance.accessApplicationsTestAccessPolicies(appId, identifier);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling AccessApplicationsApi#accessApplicationsTestAccessPolicies");
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

[**AccessPolicyCheckResponse**](AccessPolicyCheckResponse.md)

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

<a id="accessApplicationsUpdateABookmarkApplication"></a>
# **accessApplicationsUpdateABookmarkApplication**
> AccessApplicationsAddAnApplication201Response accessApplicationsUpdateABookmarkApplication(appId, identifier, accessApps)

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
import cloudflare.sdk.AccessApplicationsApi;

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

    AccessApplicationsApi apiInstance = new AccessApplicationsApi(defaultClient);
    AccessAppId appId = new AccessAppId(); // AccessAppId | 
    String identifier = "identifier_example"; // String | 
    AccessApps accessApps = new AccessApps(); // AccessApps | 
    try {
      AccessApplicationsAddAnApplication201Response result = apiInstance.accessApplicationsUpdateABookmarkApplication(appId, identifier, accessApps);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling AccessApplicationsApi#accessApplicationsUpdateABookmarkApplication");
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
| **accessApps** | [**AccessApps**](AccessApps.md)|  | |

### Return type

[**AccessApplicationsAddAnApplication201Response**](AccessApplicationsAddAnApplication201Response.md)

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

