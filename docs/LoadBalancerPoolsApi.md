# LoadBalancerPoolsApi

All URIs are relative to *https://api.cloudflare.com/client/v4*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**loadBalancerPoolsCreatePool**](LoadBalancerPoolsApi.md#loadBalancerPoolsCreatePool) | **POST** /user/load_balancers/pools | Create Pool |
| [**loadBalancerPoolsDeletePool**](LoadBalancerPoolsApi.md#loadBalancerPoolsDeletePool) | **DELETE** /user/load_balancers/pools/{pool_id} | Delete Pool |
| [**loadBalancerPoolsListPoolReferences**](LoadBalancerPoolsApi.md#loadBalancerPoolsListPoolReferences) | **GET** /user/load_balancers/pools/{pool_id}/references | List Pool References |
| [**loadBalancerPoolsListPools**](LoadBalancerPoolsApi.md#loadBalancerPoolsListPools) | **GET** /user/load_balancers/pools | List Pools |
| [**loadBalancerPoolsPatchPool**](LoadBalancerPoolsApi.md#loadBalancerPoolsPatchPool) | **PATCH** /user/load_balancers/pools/{pool_id} | Patch Pool |
| [**loadBalancerPoolsPatchPools**](LoadBalancerPoolsApi.md#loadBalancerPoolsPatchPools) | **PATCH** /user/load_balancers/pools | Patch Pools |
| [**loadBalancerPoolsPoolDetails**](LoadBalancerPoolsApi.md#loadBalancerPoolsPoolDetails) | **GET** /user/load_balancers/pools/{pool_id} | Pool Details |
| [**loadBalancerPoolsPoolHealthDetails**](LoadBalancerPoolsApi.md#loadBalancerPoolsPoolHealthDetails) | **GET** /user/load_balancers/pools/{pool_id}/health | Pool Health Details |
| [**loadBalancerPoolsPreviewPool**](LoadBalancerPoolsApi.md#loadBalancerPoolsPreviewPool) | **POST** /user/load_balancers/pools/{pool_id}/preview | Preview Pool |
| [**loadBalancerPoolsUpdatePool**](LoadBalancerPoolsApi.md#loadBalancerPoolsUpdatePool) | **PUT** /user/load_balancers/pools/{pool_id} | Update Pool |


<a id="loadBalancerPoolsCreatePool"></a>
# **loadBalancerPoolsCreatePool**
> LoadBalancingSchemasSingleResponse loadBalancerPoolsCreatePool(loadBalancerPoolsCreatePoolRequest)

Create Pool

Create a new pool.

### Example
```java
// Import classes:
import cloudflare.ApiClient;
import cloudflare.ApiException;
import cloudflare.Configuration;
import cloudflare.auth.*;
import cloudflare.models.*;
import cloudflare.sdk.LoadBalancerPoolsApi;

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

    LoadBalancerPoolsApi apiInstance = new LoadBalancerPoolsApi(defaultClient);
    LoadBalancerPoolsCreatePoolRequest loadBalancerPoolsCreatePoolRequest = new LoadBalancerPoolsCreatePoolRequest(); // LoadBalancerPoolsCreatePoolRequest | 
    try {
      LoadBalancingSchemasSingleResponse result = apiInstance.loadBalancerPoolsCreatePool(loadBalancerPoolsCreatePoolRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling LoadBalancerPoolsApi#loadBalancerPoolsCreatePool");
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
| **loadBalancerPoolsCreatePoolRequest** | [**LoadBalancerPoolsCreatePoolRequest**](LoadBalancerPoolsCreatePoolRequest.md)|  | |

### Return type

[**LoadBalancingSchemasSingleResponse**](LoadBalancingSchemasSingleResponse.md)

### Authorization

[api_key](../README.md#api_key), [api_token](../README.md#api_token), [api_email](../README.md#api_email)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Create Pool response |  -  |
| **4XX** | Create Pool response failure |  -  |

<a id="loadBalancerPoolsDeletePool"></a>
# **loadBalancerPoolsDeletePool**
> LoadBalancingSchemasIdResponse loadBalancerPoolsDeletePool(poolId)

Delete Pool

Delete a configured pool.

### Example
```java
// Import classes:
import cloudflare.ApiClient;
import cloudflare.ApiException;
import cloudflare.Configuration;
import cloudflare.auth.*;
import cloudflare.models.*;
import cloudflare.sdk.LoadBalancerPoolsApi;

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

    LoadBalancerPoolsApi apiInstance = new LoadBalancerPoolsApi(defaultClient);
    String poolId = "poolId_example"; // String | 
    try {
      LoadBalancingSchemasIdResponse result = apiInstance.loadBalancerPoolsDeletePool(poolId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling LoadBalancerPoolsApi#loadBalancerPoolsDeletePool");
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
| **poolId** | **String**|  | |

### Return type

[**LoadBalancingSchemasIdResponse**](LoadBalancingSchemasIdResponse.md)

### Authorization

[api_key](../README.md#api_key), [api_token](../README.md#api_token), [api_email](../README.md#api_email)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Delete Pool response |  -  |
| **4XX** | Delete Pool response failure |  -  |

<a id="loadBalancerPoolsListPoolReferences"></a>
# **loadBalancerPoolsListPoolReferences**
> LoadBalancingSchemasReferencesResponse loadBalancerPoolsListPoolReferences(poolId)

List Pool References

Get the list of resources that reference the provided pool.

### Example
```java
// Import classes:
import cloudflare.ApiClient;
import cloudflare.ApiException;
import cloudflare.Configuration;
import cloudflare.auth.*;
import cloudflare.models.*;
import cloudflare.sdk.LoadBalancerPoolsApi;

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

    LoadBalancerPoolsApi apiInstance = new LoadBalancerPoolsApi(defaultClient);
    String poolId = "poolId_example"; // String | 
    try {
      LoadBalancingSchemasReferencesResponse result = apiInstance.loadBalancerPoolsListPoolReferences(poolId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling LoadBalancerPoolsApi#loadBalancerPoolsListPoolReferences");
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
| **poolId** | **String**|  | |

### Return type

[**LoadBalancingSchemasReferencesResponse**](LoadBalancingSchemasReferencesResponse.md)

### Authorization

[api_key](../README.md#api_key), [api_token](../README.md#api_token), [api_email](../README.md#api_email)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | List Pool References response |  -  |
| **4XX** | List Pool References response failure |  -  |

<a id="loadBalancerPoolsListPools"></a>
# **loadBalancerPoolsListPools**
> LoadBalancingSchemasResponseCollection loadBalancerPoolsListPools(monitor)

List Pools

List configured pools.

### Example
```java
// Import classes:
import cloudflare.ApiClient;
import cloudflare.ApiException;
import cloudflare.Configuration;
import cloudflare.auth.*;
import cloudflare.models.*;
import cloudflare.sdk.LoadBalancerPoolsApi;

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

    LoadBalancerPoolsApi apiInstance = new LoadBalancerPoolsApi(defaultClient);
    Object monitor = null; // Object | 
    try {
      LoadBalancingSchemasResponseCollection result = apiInstance.loadBalancerPoolsListPools(monitor);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling LoadBalancerPoolsApi#loadBalancerPoolsListPools");
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
| **monitor** | [**Object**](.md)|  | [optional] |

### Return type

[**LoadBalancingSchemasResponseCollection**](LoadBalancingSchemasResponseCollection.md)

### Authorization

[api_key](../README.md#api_key), [api_token](../README.md#api_token), [api_email](../README.md#api_email)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | List Pools response |  -  |
| **4XX** | List Pools response failure |  -  |

<a id="loadBalancerPoolsPatchPool"></a>
# **loadBalancerPoolsPatchPool**
> LoadBalancingSchemasSingleResponse loadBalancerPoolsPatchPool(poolId, accountLoadBalancerPoolsPatchPoolRequest)

Patch Pool

Apply changes to an existing pool, overwriting the supplied properties.

### Example
```java
// Import classes:
import cloudflare.ApiClient;
import cloudflare.ApiException;
import cloudflare.Configuration;
import cloudflare.auth.*;
import cloudflare.models.*;
import cloudflare.sdk.LoadBalancerPoolsApi;

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

    LoadBalancerPoolsApi apiInstance = new LoadBalancerPoolsApi(defaultClient);
    String poolId = "poolId_example"; // String | 
    AccountLoadBalancerPoolsPatchPoolRequest accountLoadBalancerPoolsPatchPoolRequest = new AccountLoadBalancerPoolsPatchPoolRequest(); // AccountLoadBalancerPoolsPatchPoolRequest | 
    try {
      LoadBalancingSchemasSingleResponse result = apiInstance.loadBalancerPoolsPatchPool(poolId, accountLoadBalancerPoolsPatchPoolRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling LoadBalancerPoolsApi#loadBalancerPoolsPatchPool");
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
| **poolId** | **String**|  | |
| **accountLoadBalancerPoolsPatchPoolRequest** | [**AccountLoadBalancerPoolsPatchPoolRequest**](AccountLoadBalancerPoolsPatchPoolRequest.md)|  | |

### Return type

[**LoadBalancingSchemasSingleResponse**](LoadBalancingSchemasSingleResponse.md)

### Authorization

[api_key](../README.md#api_key), [api_token](../README.md#api_token), [api_email](../README.md#api_email)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Patch Pool response |  -  |
| **4XX** | Patch Pool response failure |  -  |

<a id="loadBalancerPoolsPatchPools"></a>
# **loadBalancerPoolsPatchPools**
> LoadBalancingSchemasResponseCollection loadBalancerPoolsPatchPools(accountLoadBalancerPoolsPatchPoolsRequest)

Patch Pools

Apply changes to a number of existing pools, overwriting the supplied properties. Pools are ordered by ascending &#x60;name&#x60;. Returns the list of affected pools. Supports the standard pagination query parameters, either &#x60;limit&#x60;/&#x60;offset&#x60; or &#x60;per_page&#x60;/&#x60;page&#x60;.

### Example
```java
// Import classes:
import cloudflare.ApiClient;
import cloudflare.ApiException;
import cloudflare.Configuration;
import cloudflare.auth.*;
import cloudflare.models.*;
import cloudflare.sdk.LoadBalancerPoolsApi;

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

    LoadBalancerPoolsApi apiInstance = new LoadBalancerPoolsApi(defaultClient);
    AccountLoadBalancerPoolsPatchPoolsRequest accountLoadBalancerPoolsPatchPoolsRequest = new AccountLoadBalancerPoolsPatchPoolsRequest(); // AccountLoadBalancerPoolsPatchPoolsRequest | 
    try {
      LoadBalancingSchemasResponseCollection result = apiInstance.loadBalancerPoolsPatchPools(accountLoadBalancerPoolsPatchPoolsRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling LoadBalancerPoolsApi#loadBalancerPoolsPatchPools");
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
| **accountLoadBalancerPoolsPatchPoolsRequest** | [**AccountLoadBalancerPoolsPatchPoolsRequest**](AccountLoadBalancerPoolsPatchPoolsRequest.md)|  | |

### Return type

[**LoadBalancingSchemasResponseCollection**](LoadBalancingSchemasResponseCollection.md)

### Authorization

[api_key](../README.md#api_key), [api_token](../README.md#api_token), [api_email](../README.md#api_email)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Patch Pools response |  -  |
| **4XX** | Patch Pools response failure |  -  |

<a id="loadBalancerPoolsPoolDetails"></a>
# **loadBalancerPoolsPoolDetails**
> LoadBalancingSchemasSingleResponse loadBalancerPoolsPoolDetails(poolId)

Pool Details

Fetch a single configured pool.

### Example
```java
// Import classes:
import cloudflare.ApiClient;
import cloudflare.ApiException;
import cloudflare.Configuration;
import cloudflare.auth.*;
import cloudflare.models.*;
import cloudflare.sdk.LoadBalancerPoolsApi;

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

    LoadBalancerPoolsApi apiInstance = new LoadBalancerPoolsApi(defaultClient);
    String poolId = "poolId_example"; // String | 
    try {
      LoadBalancingSchemasSingleResponse result = apiInstance.loadBalancerPoolsPoolDetails(poolId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling LoadBalancerPoolsApi#loadBalancerPoolsPoolDetails");
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
| **poolId** | **String**|  | |

### Return type

[**LoadBalancingSchemasSingleResponse**](LoadBalancingSchemasSingleResponse.md)

### Authorization

[api_key](../README.md#api_key), [api_token](../README.md#api_token), [api_email](../README.md#api_email)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Pool Details response |  -  |
| **4XX** | Pool Details response failure |  -  |

<a id="loadBalancerPoolsPoolHealthDetails"></a>
# **loadBalancerPoolsPoolHealthDetails**
> LoadBalancingHealthDetails loadBalancerPoolsPoolHealthDetails(poolId)

Pool Health Details

Fetch the latest pool health status for a single pool.

### Example
```java
// Import classes:
import cloudflare.ApiClient;
import cloudflare.ApiException;
import cloudflare.Configuration;
import cloudflare.auth.*;
import cloudflare.models.*;
import cloudflare.sdk.LoadBalancerPoolsApi;

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

    LoadBalancerPoolsApi apiInstance = new LoadBalancerPoolsApi(defaultClient);
    String poolId = "poolId_example"; // String | 
    try {
      LoadBalancingHealthDetails result = apiInstance.loadBalancerPoolsPoolHealthDetails(poolId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling LoadBalancerPoolsApi#loadBalancerPoolsPoolHealthDetails");
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
| **poolId** | **String**|  | |

### Return type

[**LoadBalancingHealthDetails**](LoadBalancingHealthDetails.md)

### Authorization

[api_key](../README.md#api_key), [api_token](../README.md#api_token), [api_email](../README.md#api_email)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Pool Health Details response |  -  |
| **4XX** | Pool Health Details response failure |  -  |

<a id="loadBalancerPoolsPreviewPool"></a>
# **loadBalancerPoolsPreviewPool**
> LoadBalancingPreviewResponse loadBalancerPoolsPreviewPool(poolId, accountLoadBalancerMonitorsCreateMonitorRequest)

Preview Pool

Preview pool health using provided monitor details. The returned preview_id can be used in the preview endpoint to retrieve the results.

### Example
```java
// Import classes:
import cloudflare.ApiClient;
import cloudflare.ApiException;
import cloudflare.Configuration;
import cloudflare.auth.*;
import cloudflare.models.*;
import cloudflare.sdk.LoadBalancerPoolsApi;

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

    LoadBalancerPoolsApi apiInstance = new LoadBalancerPoolsApi(defaultClient);
    String poolId = "poolId_example"; // String | 
    AccountLoadBalancerMonitorsCreateMonitorRequest accountLoadBalancerMonitorsCreateMonitorRequest = new AccountLoadBalancerMonitorsCreateMonitorRequest(); // AccountLoadBalancerMonitorsCreateMonitorRequest | 
    try {
      LoadBalancingPreviewResponse result = apiInstance.loadBalancerPoolsPreviewPool(poolId, accountLoadBalancerMonitorsCreateMonitorRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling LoadBalancerPoolsApi#loadBalancerPoolsPreviewPool");
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
| **poolId** | **String**|  | |
| **accountLoadBalancerMonitorsCreateMonitorRequest** | [**AccountLoadBalancerMonitorsCreateMonitorRequest**](AccountLoadBalancerMonitorsCreateMonitorRequest.md)|  | |

### Return type

[**LoadBalancingPreviewResponse**](LoadBalancingPreviewResponse.md)

### Authorization

[api_key](../README.md#api_key), [api_token](../README.md#api_token), [api_email](../README.md#api_email)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Preview Pool response |  -  |
| **4XX** | Preview Pool response failure |  -  |

<a id="loadBalancerPoolsUpdatePool"></a>
# **loadBalancerPoolsUpdatePool**
> LoadBalancingSchemasSingleResponse loadBalancerPoolsUpdatePool(poolId, accountLoadBalancerPoolsUpdatePoolRequest)

Update Pool

Modify a configured pool.

### Example
```java
// Import classes:
import cloudflare.ApiClient;
import cloudflare.ApiException;
import cloudflare.Configuration;
import cloudflare.auth.*;
import cloudflare.models.*;
import cloudflare.sdk.LoadBalancerPoolsApi;

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

    LoadBalancerPoolsApi apiInstance = new LoadBalancerPoolsApi(defaultClient);
    String poolId = "poolId_example"; // String | 
    AccountLoadBalancerPoolsUpdatePoolRequest accountLoadBalancerPoolsUpdatePoolRequest = new AccountLoadBalancerPoolsUpdatePoolRequest(); // AccountLoadBalancerPoolsUpdatePoolRequest | 
    try {
      LoadBalancingSchemasSingleResponse result = apiInstance.loadBalancerPoolsUpdatePool(poolId, accountLoadBalancerPoolsUpdatePoolRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling LoadBalancerPoolsApi#loadBalancerPoolsUpdatePool");
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
| **poolId** | **String**|  | |
| **accountLoadBalancerPoolsUpdatePoolRequest** | [**AccountLoadBalancerPoolsUpdatePoolRequest**](AccountLoadBalancerPoolsUpdatePoolRequest.md)|  | |

### Return type

[**LoadBalancingSchemasSingleResponse**](LoadBalancingSchemasSingleResponse.md)

### Authorization

[api_key](../README.md#api_key), [api_token](../README.md#api_token), [api_email](../README.md#api_email)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Update Pool response |  -  |
| **4XX** | Update Pool response failure |  -  |

