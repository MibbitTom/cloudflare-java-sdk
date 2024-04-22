# WorkerRoutesApi

All URIs are relative to *https://api.cloudflare.com/client/v4*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**workerRoutesCreateRoute**](WorkerRoutesApi.md#workerRoutesCreateRoute) | **POST** /zones/{zone_id}/workers/routes | Create Route |
| [**workerRoutesDeleteRoute**](WorkerRoutesApi.md#workerRoutesDeleteRoute) | **DELETE** /zones/{zone_id}/workers/routes/{route_id} | Delete Route |
| [**workerRoutesGetRoute**](WorkerRoutesApi.md#workerRoutesGetRoute) | **GET** /zones/{zone_id}/workers/routes/{route_id} | Get Route |
| [**workerRoutesListRoutes**](WorkerRoutesApi.md#workerRoutesListRoutes) | **GET** /zones/{zone_id}/workers/routes | List Routes |
| [**workerRoutesUpdateRoute**](WorkerRoutesApi.md#workerRoutesUpdateRoute) | **PUT** /zones/{zone_id}/workers/routes/{route_id} | Update Route |


<a id="workerRoutesCreateRoute"></a>
# **workerRoutesCreateRoute**
> WorkersApiResponseSingle workerRoutesCreateRoute(zoneId, workersRouteNoId)

Create Route

Creates a route that maps a URL pattern to a Worker.

### Example
```java
// Import classes:
import cloudflare.ApiClient;
import cloudflare.ApiException;
import cloudflare.Configuration;
import cloudflare.auth.*;
import cloudflare.models.*;
import cloudflare.sdk.WorkerRoutesApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.cloudflare.com/client/v4");
    
    // Configure API key authorization: api_key
    ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
    api_key.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //api_key.setApiKeyPrefix("Token");

    // Configure HTTP bearer authorization: api_token
    HttpBearerAuth api_token = (HttpBearerAuth) defaultClient.getAuthentication("api_token");
    api_token.setBearerToken("BEARER TOKEN");

    // Configure API key authorization: api_email
    ApiKeyAuth api_email = (ApiKeyAuth) defaultClient.getAuthentication("api_email");
    api_email.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //api_email.setApiKeyPrefix("Token");

    WorkerRoutesApi apiInstance = new WorkerRoutesApi(defaultClient);
    String zoneId = "zoneId_example"; // String | 
    WorkersRouteNoId workersRouteNoId = new WorkersRouteNoId(); // WorkersRouteNoId | 
    try {
      WorkersApiResponseSingle result = apiInstance.workerRoutesCreateRoute(zoneId, workersRouteNoId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling WorkerRoutesApi#workerRoutesCreateRoute");
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
| **zoneId** | **String**|  | |
| **workersRouteNoId** | [**WorkersRouteNoId**](WorkersRouteNoId.md)|  | |

### Return type

[**WorkersApiResponseSingle**](WorkersApiResponseSingle.md)

### Authorization

[api_key](../README.md#api_key), [api_token](../README.md#api_token), [api_email](../README.md#api_email)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Create Route response |  -  |
| **4XX** | Create Route response failure |  -  |

<a id="workerRoutesDeleteRoute"></a>
# **workerRoutesDeleteRoute**
> WorkersApiResponseSingle workerRoutesDeleteRoute(routeId, zoneId)

Delete Route

Deletes a route.

### Example
```java
// Import classes:
import cloudflare.ApiClient;
import cloudflare.ApiException;
import cloudflare.Configuration;
import cloudflare.auth.*;
import cloudflare.models.*;
import cloudflare.sdk.WorkerRoutesApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.cloudflare.com/client/v4");
    
    // Configure API key authorization: api_key
    ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
    api_key.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //api_key.setApiKeyPrefix("Token");

    // Configure HTTP bearer authorization: api_token
    HttpBearerAuth api_token = (HttpBearerAuth) defaultClient.getAuthentication("api_token");
    api_token.setBearerToken("BEARER TOKEN");

    // Configure API key authorization: api_email
    ApiKeyAuth api_email = (ApiKeyAuth) defaultClient.getAuthentication("api_email");
    api_email.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //api_email.setApiKeyPrefix("Token");

    WorkerRoutesApi apiInstance = new WorkerRoutesApi(defaultClient);
    String routeId = "routeId_example"; // String | 
    String zoneId = "zoneId_example"; // String | 
    try {
      WorkersApiResponseSingle result = apiInstance.workerRoutesDeleteRoute(routeId, zoneId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling WorkerRoutesApi#workerRoutesDeleteRoute");
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
| **routeId** | **String**|  | |
| **zoneId** | **String**|  | |

### Return type

[**WorkersApiResponseSingle**](WorkersApiResponseSingle.md)

### Authorization

[api_key](../README.md#api_key), [api_token](../README.md#api_token), [api_email](../README.md#api_email)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Delete Route response |  -  |
| **4XX** | Delete Route response failure |  -  |

<a id="workerRoutesGetRoute"></a>
# **workerRoutesGetRoute**
> WorkersRouteResponseSingle workerRoutesGetRoute(routeId, zoneId)

Get Route

Returns information about a route, including URL pattern and Worker.

### Example
```java
// Import classes:
import cloudflare.ApiClient;
import cloudflare.ApiException;
import cloudflare.Configuration;
import cloudflare.auth.*;
import cloudflare.models.*;
import cloudflare.sdk.WorkerRoutesApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.cloudflare.com/client/v4");
    
    // Configure API key authorization: api_key
    ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
    api_key.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //api_key.setApiKeyPrefix("Token");

    // Configure HTTP bearer authorization: api_token
    HttpBearerAuth api_token = (HttpBearerAuth) defaultClient.getAuthentication("api_token");
    api_token.setBearerToken("BEARER TOKEN");

    // Configure API key authorization: api_email
    ApiKeyAuth api_email = (ApiKeyAuth) defaultClient.getAuthentication("api_email");
    api_email.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //api_email.setApiKeyPrefix("Token");

    WorkerRoutesApi apiInstance = new WorkerRoutesApi(defaultClient);
    String routeId = "routeId_example"; // String | 
    String zoneId = "zoneId_example"; // String | 
    try {
      WorkersRouteResponseSingle result = apiInstance.workerRoutesGetRoute(routeId, zoneId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling WorkerRoutesApi#workerRoutesGetRoute");
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
| **routeId** | **String**|  | |
| **zoneId** | **String**|  | |

### Return type

[**WorkersRouteResponseSingle**](WorkersRouteResponseSingle.md)

### Authorization

[api_key](../README.md#api_key), [api_token](../README.md#api_token), [api_email](../README.md#api_email)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Get Route response |  -  |
| **4XX** | Get Route response failure |  -  |

<a id="workerRoutesListRoutes"></a>
# **workerRoutesListRoutes**
> WorkersRouteResponseCollection workerRoutesListRoutes(zoneId)

List Routes

Returns routes for a zone.

### Example
```java
// Import classes:
import cloudflare.ApiClient;
import cloudflare.ApiException;
import cloudflare.Configuration;
import cloudflare.auth.*;
import cloudflare.models.*;
import cloudflare.sdk.WorkerRoutesApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.cloudflare.com/client/v4");
    
    // Configure API key authorization: api_key
    ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
    api_key.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //api_key.setApiKeyPrefix("Token");

    // Configure HTTP bearer authorization: api_token
    HttpBearerAuth api_token = (HttpBearerAuth) defaultClient.getAuthentication("api_token");
    api_token.setBearerToken("BEARER TOKEN");

    // Configure API key authorization: api_email
    ApiKeyAuth api_email = (ApiKeyAuth) defaultClient.getAuthentication("api_email");
    api_email.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //api_email.setApiKeyPrefix("Token");

    WorkerRoutesApi apiInstance = new WorkerRoutesApi(defaultClient);
    String zoneId = "zoneId_example"; // String | 
    try {
      WorkersRouteResponseCollection result = apiInstance.workerRoutesListRoutes(zoneId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling WorkerRoutesApi#workerRoutesListRoutes");
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
| **zoneId** | **String**|  | |

### Return type

[**WorkersRouteResponseCollection**](WorkersRouteResponseCollection.md)

### Authorization

[api_key](../README.md#api_key), [api_token](../README.md#api_token), [api_email](../README.md#api_email)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | List Routes response |  -  |
| **4XX** | List Routes response failure |  -  |

<a id="workerRoutesUpdateRoute"></a>
# **workerRoutesUpdateRoute**
> WorkersRouteResponseSingle workerRoutesUpdateRoute(routeId, zoneId, workersRouteNoId)

Update Route

Updates the URL pattern or Worker associated with a route.

### Example
```java
// Import classes:
import cloudflare.ApiClient;
import cloudflare.ApiException;
import cloudflare.Configuration;
import cloudflare.auth.*;
import cloudflare.models.*;
import cloudflare.sdk.WorkerRoutesApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.cloudflare.com/client/v4");
    
    // Configure API key authorization: api_key
    ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
    api_key.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //api_key.setApiKeyPrefix("Token");

    // Configure HTTP bearer authorization: api_token
    HttpBearerAuth api_token = (HttpBearerAuth) defaultClient.getAuthentication("api_token");
    api_token.setBearerToken("BEARER TOKEN");

    // Configure API key authorization: api_email
    ApiKeyAuth api_email = (ApiKeyAuth) defaultClient.getAuthentication("api_email");
    api_email.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //api_email.setApiKeyPrefix("Token");

    WorkerRoutesApi apiInstance = new WorkerRoutesApi(defaultClient);
    String routeId = "routeId_example"; // String | 
    String zoneId = "zoneId_example"; // String | 
    WorkersRouteNoId workersRouteNoId = new WorkersRouteNoId(); // WorkersRouteNoId | 
    try {
      WorkersRouteResponseSingle result = apiInstance.workerRoutesUpdateRoute(routeId, zoneId, workersRouteNoId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling WorkerRoutesApi#workerRoutesUpdateRoute");
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
| **routeId** | **String**|  | |
| **zoneId** | **String**|  | |
| **workersRouteNoId** | [**WorkersRouteNoId**](WorkersRouteNoId.md)|  | |

### Return type

[**WorkersRouteResponseSingle**](WorkersRouteResponseSingle.md)

### Authorization

[api_key](../README.md#api_key), [api_token](../README.md#api_token), [api_email](../README.md#api_email)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Update Route response |  -  |
| **4XX** | Update Route response failure |  -  |

