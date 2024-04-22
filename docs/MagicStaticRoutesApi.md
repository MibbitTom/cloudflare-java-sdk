# MagicStaticRoutesApi

All URIs are relative to *https://api.cloudflare.com/client/v4*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**magicStaticRoutesCreateRoutes**](MagicStaticRoutesApi.md#magicStaticRoutesCreateRoutes) | **POST** /accounts/{account_id}/magic/routes | Create Routes |
| [**magicStaticRoutesDeleteManyRoutes**](MagicStaticRoutesApi.md#magicStaticRoutesDeleteManyRoutes) | **DELETE** /accounts/{account_id}/magic/routes | Delete Many Routes |
| [**magicStaticRoutesDeleteRoute**](MagicStaticRoutesApi.md#magicStaticRoutesDeleteRoute) | **DELETE** /accounts/{account_id}/magic/routes/{route_identifier} | Delete Route |
| [**magicStaticRoutesListRoutes**](MagicStaticRoutesApi.md#magicStaticRoutesListRoutes) | **GET** /accounts/{account_id}/magic/routes | List Routes |
| [**magicStaticRoutesRouteDetails**](MagicStaticRoutesApi.md#magicStaticRoutesRouteDetails) | **GET** /accounts/{account_id}/magic/routes/{route_identifier} | Route Details |
| [**magicStaticRoutesUpdateManyRoutes**](MagicStaticRoutesApi.md#magicStaticRoutesUpdateManyRoutes) | **PUT** /accounts/{account_id}/magic/routes | Update Many Routes |
| [**magicStaticRoutesUpdateRoute**](MagicStaticRoutesApi.md#magicStaticRoutesUpdateRoute) | **PUT** /accounts/{account_id}/magic/routes/{route_identifier} | Update Route |


<a id="magicStaticRoutesCreateRoutes"></a>
# **magicStaticRoutesCreateRoutes**
> MagicRoutesCollectionResponse magicStaticRoutesCreateRoutes(accountId, body)

Create Routes

Creates a new Magic static route. Use &#x60;?validate_only&#x3D;true&#x60; as an optional query parameter to run validation only without persisting changes.

### Example
```java
// Import classes:
import cloudflare.ApiClient;
import cloudflare.ApiException;
import cloudflare.Configuration;
import cloudflare.auth.*;
import cloudflare.models.*;
import cloudflare.sdk.MagicStaticRoutesApi;

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

    MagicStaticRoutesApi apiInstance = new MagicStaticRoutesApi(defaultClient);
    String accountId = "accountId_example"; // String | 
    Object body = null; // Object | 
    try {
      MagicRoutesCollectionResponse result = apiInstance.magicStaticRoutesCreateRoutes(accountId, body);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling MagicStaticRoutesApi#magicStaticRoutesCreateRoutes");
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
| **accountId** | **String**|  | |
| **body** | **Object**|  | |

### Return type

[**MagicRoutesCollectionResponse**](MagicRoutesCollectionResponse.md)

### Authorization

[api_key](../README.md#api_key), [api_email](../README.md#api_email)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Create Routes response |  -  |
| **4XX** | Create Routes response failure |  -  |

<a id="magicStaticRoutesDeleteManyRoutes"></a>
# **magicStaticRoutesDeleteManyRoutes**
> MagicMultipleRouteDeleteResponse magicStaticRoutesDeleteManyRoutes(accountId, magicRouteDeleteManyRequest)

Delete Many Routes

Delete multiple Magic static routes.

### Example
```java
// Import classes:
import cloudflare.ApiClient;
import cloudflare.ApiException;
import cloudflare.Configuration;
import cloudflare.auth.*;
import cloudflare.models.*;
import cloudflare.sdk.MagicStaticRoutesApi;

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

    MagicStaticRoutesApi apiInstance = new MagicStaticRoutesApi(defaultClient);
    String accountId = "accountId_example"; // String | 
    MagicRouteDeleteManyRequest magicRouteDeleteManyRequest = new MagicRouteDeleteManyRequest(); // MagicRouteDeleteManyRequest | 
    try {
      MagicMultipleRouteDeleteResponse result = apiInstance.magicStaticRoutesDeleteManyRoutes(accountId, magicRouteDeleteManyRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling MagicStaticRoutesApi#magicStaticRoutesDeleteManyRoutes");
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
| **accountId** | **String**|  | |
| **magicRouteDeleteManyRequest** | [**MagicRouteDeleteManyRequest**](MagicRouteDeleteManyRequest.md)|  | |

### Return type

[**MagicMultipleRouteDeleteResponse**](MagicMultipleRouteDeleteResponse.md)

### Authorization

[api_key](../README.md#api_key), [api_email](../README.md#api_email)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Delete Many Routes response |  -  |
| **4XX** | Delete Many Routes response failure |  -  |

<a id="magicStaticRoutesDeleteRoute"></a>
# **magicStaticRoutesDeleteRoute**
> MagicRouteDeletedResponse magicStaticRoutesDeleteRoute(routeIdentifier, accountId)

Delete Route

Disable and remove a specific Magic static route.

### Example
```java
// Import classes:
import cloudflare.ApiClient;
import cloudflare.ApiException;
import cloudflare.Configuration;
import cloudflare.auth.*;
import cloudflare.models.*;
import cloudflare.sdk.MagicStaticRoutesApi;

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

    MagicStaticRoutesApi apiInstance = new MagicStaticRoutesApi(defaultClient);
    String routeIdentifier = "routeIdentifier_example"; // String | 
    String accountId = "accountId_example"; // String | 
    try {
      MagicRouteDeletedResponse result = apiInstance.magicStaticRoutesDeleteRoute(routeIdentifier, accountId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling MagicStaticRoutesApi#magicStaticRoutesDeleteRoute");
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
| **routeIdentifier** | **String**|  | |
| **accountId** | **String**|  | |

### Return type

[**MagicRouteDeletedResponse**](MagicRouteDeletedResponse.md)

### Authorization

[api_key](../README.md#api_key), [api_email](../README.md#api_email)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Delete Route response |  -  |
| **4XX** | Delete Route response failure |  -  |

<a id="magicStaticRoutesListRoutes"></a>
# **magicStaticRoutesListRoutes**
> MagicRoutesCollectionResponse magicStaticRoutesListRoutes(accountId)

List Routes

List all Magic static routes.

### Example
```java
// Import classes:
import cloudflare.ApiClient;
import cloudflare.ApiException;
import cloudflare.Configuration;
import cloudflare.auth.*;
import cloudflare.models.*;
import cloudflare.sdk.MagicStaticRoutesApi;

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

    MagicStaticRoutesApi apiInstance = new MagicStaticRoutesApi(defaultClient);
    String accountId = "accountId_example"; // String | 
    try {
      MagicRoutesCollectionResponse result = apiInstance.magicStaticRoutesListRoutes(accountId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling MagicStaticRoutesApi#magicStaticRoutesListRoutes");
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
| **accountId** | **String**|  | |

### Return type

[**MagicRoutesCollectionResponse**](MagicRoutesCollectionResponse.md)

### Authorization

[api_key](../README.md#api_key), [api_email](../README.md#api_email)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | List Routes response |  -  |
| **4XX** | List Routes response failure |  -  |

<a id="magicStaticRoutesRouteDetails"></a>
# **magicStaticRoutesRouteDetails**
> MagicRouteSingleResponse magicStaticRoutesRouteDetails(routeIdentifier, accountId)

Route Details

Get a specific Magic static route.

### Example
```java
// Import classes:
import cloudflare.ApiClient;
import cloudflare.ApiException;
import cloudflare.Configuration;
import cloudflare.auth.*;
import cloudflare.models.*;
import cloudflare.sdk.MagicStaticRoutesApi;

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

    MagicStaticRoutesApi apiInstance = new MagicStaticRoutesApi(defaultClient);
    String routeIdentifier = "routeIdentifier_example"; // String | 
    String accountId = "accountId_example"; // String | 
    try {
      MagicRouteSingleResponse result = apiInstance.magicStaticRoutesRouteDetails(routeIdentifier, accountId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling MagicStaticRoutesApi#magicStaticRoutesRouteDetails");
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
| **routeIdentifier** | **String**|  | |
| **accountId** | **String**|  | |

### Return type

[**MagicRouteSingleResponse**](MagicRouteSingleResponse.md)

### Authorization

[api_key](../README.md#api_key), [api_email](../README.md#api_email)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Route Details response |  -  |
| **4XX** | Route Details response failure |  -  |

<a id="magicStaticRoutesUpdateManyRoutes"></a>
# **magicStaticRoutesUpdateManyRoutes**
> MagicMultipleRouteModifiedResponse magicStaticRoutesUpdateManyRoutes(accountId, magicRouteUpdateManyRequest)

Update Many Routes

Update multiple Magic static routes. Use &#x60;?validate_only&#x3D;true&#x60; as an optional query parameter to run validation only without persisting changes. Only fields for a route that need to be changed need be provided.

### Example
```java
// Import classes:
import cloudflare.ApiClient;
import cloudflare.ApiException;
import cloudflare.Configuration;
import cloudflare.auth.*;
import cloudflare.models.*;
import cloudflare.sdk.MagicStaticRoutesApi;

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

    MagicStaticRoutesApi apiInstance = new MagicStaticRoutesApi(defaultClient);
    String accountId = "accountId_example"; // String | 
    MagicRouteUpdateManyRequest magicRouteUpdateManyRequest = new MagicRouteUpdateManyRequest(); // MagicRouteUpdateManyRequest | 
    try {
      MagicMultipleRouteModifiedResponse result = apiInstance.magicStaticRoutesUpdateManyRoutes(accountId, magicRouteUpdateManyRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling MagicStaticRoutesApi#magicStaticRoutesUpdateManyRoutes");
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
| **accountId** | **String**|  | |
| **magicRouteUpdateManyRequest** | [**MagicRouteUpdateManyRequest**](MagicRouteUpdateManyRequest.md)|  | |

### Return type

[**MagicMultipleRouteModifiedResponse**](MagicMultipleRouteModifiedResponse.md)

### Authorization

[api_key](../README.md#api_key), [api_email](../README.md#api_email)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Update Many Routes response |  -  |
| **4XX** | Update Many Routes response failure |  -  |

<a id="magicStaticRoutesUpdateRoute"></a>
# **magicStaticRoutesUpdateRoute**
> MagicRouteModifiedResponse magicStaticRoutesUpdateRoute(routeIdentifier, accountId, magicRouteUpdateRequest)

Update Route

Update a specific Magic static route. Use &#x60;?validate_only&#x3D;true&#x60; as an optional query parameter to run validation only without persisting changes.

### Example
```java
// Import classes:
import cloudflare.ApiClient;
import cloudflare.ApiException;
import cloudflare.Configuration;
import cloudflare.auth.*;
import cloudflare.models.*;
import cloudflare.sdk.MagicStaticRoutesApi;

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

    MagicStaticRoutesApi apiInstance = new MagicStaticRoutesApi(defaultClient);
    String routeIdentifier = "routeIdentifier_example"; // String | 
    String accountId = "accountId_example"; // String | 
    MagicRouteUpdateRequest magicRouteUpdateRequest = new MagicRouteUpdateRequest(); // MagicRouteUpdateRequest | 
    try {
      MagicRouteModifiedResponse result = apiInstance.magicStaticRoutesUpdateRoute(routeIdentifier, accountId, magicRouteUpdateRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling MagicStaticRoutesApi#magicStaticRoutesUpdateRoute");
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
| **routeIdentifier** | **String**|  | |
| **accountId** | **String**|  | |
| **magicRouteUpdateRequest** | [**MagicRouteUpdateRequest**](MagicRouteUpdateRequest.md)|  | |

### Return type

[**MagicRouteModifiedResponse**](MagicRouteModifiedResponse.md)

### Authorization

[api_key](../README.md#api_key), [api_email](../README.md#api_email)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Update Route response |  -  |
| **4XX** | Update Route response failure |  -  |

