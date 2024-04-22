# AccountLoadBalancerPoolsApi

All URIs are relative to *https://api.cloudflare.com/client/v4*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**accountLoadBalancerPoolsCreatePool**](AccountLoadBalancerPoolsApi.md#accountLoadBalancerPoolsCreatePool) | **POST** /accounts/{account_id}/load_balancers/pools | Create Pool |
| [**accountLoadBalancerPoolsDeletePool**](AccountLoadBalancerPoolsApi.md#accountLoadBalancerPoolsDeletePool) | **DELETE** /accounts/{account_id}/load_balancers/pools/{pool_id} | Delete Pool |
| [**accountLoadBalancerPoolsListPoolReferences**](AccountLoadBalancerPoolsApi.md#accountLoadBalancerPoolsListPoolReferences) | **GET** /accounts/{account_id}/load_balancers/pools/{pool_id}/references | List Pool References |
| [**accountLoadBalancerPoolsListPools**](AccountLoadBalancerPoolsApi.md#accountLoadBalancerPoolsListPools) | **GET** /accounts/{account_id}/load_balancers/pools | List Pools |
| [**accountLoadBalancerPoolsPatchPool**](AccountLoadBalancerPoolsApi.md#accountLoadBalancerPoolsPatchPool) | **PATCH** /accounts/{account_id}/load_balancers/pools/{pool_id} | Patch Pool |
| [**accountLoadBalancerPoolsPatchPools**](AccountLoadBalancerPoolsApi.md#accountLoadBalancerPoolsPatchPools) | **PATCH** /accounts/{account_id}/load_balancers/pools | Patch Pools |
| [**accountLoadBalancerPoolsPoolDetails**](AccountLoadBalancerPoolsApi.md#accountLoadBalancerPoolsPoolDetails) | **GET** /accounts/{account_id}/load_balancers/pools/{pool_id} | Pool Details |
| [**accountLoadBalancerPoolsPoolHealthDetails**](AccountLoadBalancerPoolsApi.md#accountLoadBalancerPoolsPoolHealthDetails) | **GET** /accounts/{account_id}/load_balancers/pools/{pool_id}/health | Pool Health Details |
| [**accountLoadBalancerPoolsPreviewPool**](AccountLoadBalancerPoolsApi.md#accountLoadBalancerPoolsPreviewPool) | **POST** /accounts/{account_id}/load_balancers/pools/{pool_id}/preview | Preview Pool |
| [**accountLoadBalancerPoolsUpdatePool**](AccountLoadBalancerPoolsApi.md#accountLoadBalancerPoolsUpdatePool) | **PUT** /accounts/{account_id}/load_balancers/pools/{pool_id} | Update Pool |


<a id="accountLoadBalancerPoolsCreatePool"></a>
# **accountLoadBalancerPoolsCreatePool**
> LoadBalancingSchemasSingleResponse accountLoadBalancerPoolsCreatePool(accountId, accountLoadBalancerPoolsCreatePoolRequest)

Create Pool

Create a new pool.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.AccountLoadBalancerPoolsApi;

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

    AccountLoadBalancerPoolsApi apiInstance = new AccountLoadBalancerPoolsApi(defaultClient);
    String accountId = "accountId_example"; // String | 
    AccountLoadBalancerPoolsCreatePoolRequest accountLoadBalancerPoolsCreatePoolRequest = new AccountLoadBalancerPoolsCreatePoolRequest(); // AccountLoadBalancerPoolsCreatePoolRequest | 
    try {
      LoadBalancingSchemasSingleResponse result = apiInstance.accountLoadBalancerPoolsCreatePool(accountId, accountLoadBalancerPoolsCreatePoolRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling AccountLoadBalancerPoolsApi#accountLoadBalancerPoolsCreatePool");
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
| **accountLoadBalancerPoolsCreatePoolRequest** | [**AccountLoadBalancerPoolsCreatePoolRequest**](AccountLoadBalancerPoolsCreatePoolRequest.md)|  | |

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

<a id="accountLoadBalancerPoolsDeletePool"></a>
# **accountLoadBalancerPoolsDeletePool**
> LoadBalancingSchemasIdResponse accountLoadBalancerPoolsDeletePool(poolId, accountId)

Delete Pool

Delete a configured pool.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.AccountLoadBalancerPoolsApi;

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

    AccountLoadBalancerPoolsApi apiInstance = new AccountLoadBalancerPoolsApi(defaultClient);
    String poolId = "poolId_example"; // String | 
    String accountId = "accountId_example"; // String | 
    try {
      LoadBalancingSchemasIdResponse result = apiInstance.accountLoadBalancerPoolsDeletePool(poolId, accountId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling AccountLoadBalancerPoolsApi#accountLoadBalancerPoolsDeletePool");
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
| **accountId** | **String**|  | |

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

<a id="accountLoadBalancerPoolsListPoolReferences"></a>
# **accountLoadBalancerPoolsListPoolReferences**
> LoadBalancingSchemasReferencesResponse accountLoadBalancerPoolsListPoolReferences(poolId, accountId)

List Pool References

Get the list of resources that reference the provided pool.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.AccountLoadBalancerPoolsApi;

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

    AccountLoadBalancerPoolsApi apiInstance = new AccountLoadBalancerPoolsApi(defaultClient);
    String poolId = "poolId_example"; // String | 
    String accountId = "accountId_example"; // String | 
    try {
      LoadBalancingSchemasReferencesResponse result = apiInstance.accountLoadBalancerPoolsListPoolReferences(poolId, accountId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling AccountLoadBalancerPoolsApi#accountLoadBalancerPoolsListPoolReferences");
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
| **accountId** | **String**|  | |

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

<a id="accountLoadBalancerPoolsListPools"></a>
# **accountLoadBalancerPoolsListPools**
> LoadBalancingSchemasResponseCollection accountLoadBalancerPoolsListPools(accountId, monitor)

List Pools

List configured pools.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.AccountLoadBalancerPoolsApi;

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

    AccountLoadBalancerPoolsApi apiInstance = new AccountLoadBalancerPoolsApi(defaultClient);
    String accountId = "accountId_example"; // String | 
    Object monitor = null; // Object | 
    try {
      LoadBalancingSchemasResponseCollection result = apiInstance.accountLoadBalancerPoolsListPools(accountId, monitor);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling AccountLoadBalancerPoolsApi#accountLoadBalancerPoolsListPools");
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

<a id="accountLoadBalancerPoolsPatchPool"></a>
# **accountLoadBalancerPoolsPatchPool**
> LoadBalancingSchemasSingleResponse accountLoadBalancerPoolsPatchPool(poolId, accountId, accountLoadBalancerPoolsPatchPoolRequest)

Patch Pool

Apply changes to an existing pool, overwriting the supplied properties.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.AccountLoadBalancerPoolsApi;

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

    AccountLoadBalancerPoolsApi apiInstance = new AccountLoadBalancerPoolsApi(defaultClient);
    String poolId = "poolId_example"; // String | 
    String accountId = "accountId_example"; // String | 
    AccountLoadBalancerPoolsPatchPoolRequest accountLoadBalancerPoolsPatchPoolRequest = new AccountLoadBalancerPoolsPatchPoolRequest(); // AccountLoadBalancerPoolsPatchPoolRequest | 
    try {
      LoadBalancingSchemasSingleResponse result = apiInstance.accountLoadBalancerPoolsPatchPool(poolId, accountId, accountLoadBalancerPoolsPatchPoolRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling AccountLoadBalancerPoolsApi#accountLoadBalancerPoolsPatchPool");
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
| **accountId** | **String**|  | |
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

<a id="accountLoadBalancerPoolsPatchPools"></a>
# **accountLoadBalancerPoolsPatchPools**
> LoadBalancingSchemasResponseCollection accountLoadBalancerPoolsPatchPools(accountId, accountLoadBalancerPoolsPatchPoolsRequest)

Patch Pools

Apply changes to a number of existing pools, overwriting the supplied properties. Pools are ordered by ascending &#x60;name&#x60;. Returns the list of affected pools. Supports the standard pagination query parameters, either &#x60;limit&#x60;/&#x60;offset&#x60; or &#x60;per_page&#x60;/&#x60;page&#x60;.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.AccountLoadBalancerPoolsApi;

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

    AccountLoadBalancerPoolsApi apiInstance = new AccountLoadBalancerPoolsApi(defaultClient);
    String accountId = "accountId_example"; // String | 
    AccountLoadBalancerPoolsPatchPoolsRequest accountLoadBalancerPoolsPatchPoolsRequest = new AccountLoadBalancerPoolsPatchPoolsRequest(); // AccountLoadBalancerPoolsPatchPoolsRequest | 
    try {
      LoadBalancingSchemasResponseCollection result = apiInstance.accountLoadBalancerPoolsPatchPools(accountId, accountLoadBalancerPoolsPatchPoolsRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling AccountLoadBalancerPoolsApi#accountLoadBalancerPoolsPatchPools");
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

<a id="accountLoadBalancerPoolsPoolDetails"></a>
# **accountLoadBalancerPoolsPoolDetails**
> LoadBalancingSchemasSingleResponse accountLoadBalancerPoolsPoolDetails(poolId, accountId)

Pool Details

Fetch a single configured pool.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.AccountLoadBalancerPoolsApi;

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

    AccountLoadBalancerPoolsApi apiInstance = new AccountLoadBalancerPoolsApi(defaultClient);
    String poolId = "poolId_example"; // String | 
    String accountId = "accountId_example"; // String | 
    try {
      LoadBalancingSchemasSingleResponse result = apiInstance.accountLoadBalancerPoolsPoolDetails(poolId, accountId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling AccountLoadBalancerPoolsApi#accountLoadBalancerPoolsPoolDetails");
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
| **accountId** | **String**|  | |

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

<a id="accountLoadBalancerPoolsPoolHealthDetails"></a>
# **accountLoadBalancerPoolsPoolHealthDetails**
> LoadBalancingHealthDetails accountLoadBalancerPoolsPoolHealthDetails(poolId, accountId)

Pool Health Details

Fetch the latest pool health status for a single pool.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.AccountLoadBalancerPoolsApi;

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

    AccountLoadBalancerPoolsApi apiInstance = new AccountLoadBalancerPoolsApi(defaultClient);
    String poolId = "poolId_example"; // String | 
    String accountId = "accountId_example"; // String | 
    try {
      LoadBalancingHealthDetails result = apiInstance.accountLoadBalancerPoolsPoolHealthDetails(poolId, accountId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling AccountLoadBalancerPoolsApi#accountLoadBalancerPoolsPoolHealthDetails");
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
| **accountId** | **String**|  | |

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

<a id="accountLoadBalancerPoolsPreviewPool"></a>
# **accountLoadBalancerPoolsPreviewPool**
> LoadBalancingPreviewResponse accountLoadBalancerPoolsPreviewPool(poolId, accountId, accountLoadBalancerMonitorsCreateMonitorRequest)

Preview Pool

Preview pool health using provided monitor details. The returned preview_id can be used in the preview endpoint to retrieve the results.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.AccountLoadBalancerPoolsApi;

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

    AccountLoadBalancerPoolsApi apiInstance = new AccountLoadBalancerPoolsApi(defaultClient);
    String poolId = "poolId_example"; // String | 
    String accountId = "accountId_example"; // String | 
    AccountLoadBalancerMonitorsCreateMonitorRequest accountLoadBalancerMonitorsCreateMonitorRequest = new AccountLoadBalancerMonitorsCreateMonitorRequest(); // AccountLoadBalancerMonitorsCreateMonitorRequest | 
    try {
      LoadBalancingPreviewResponse result = apiInstance.accountLoadBalancerPoolsPreviewPool(poolId, accountId, accountLoadBalancerMonitorsCreateMonitorRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling AccountLoadBalancerPoolsApi#accountLoadBalancerPoolsPreviewPool");
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
| **accountId** | **String**|  | |
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

<a id="accountLoadBalancerPoolsUpdatePool"></a>
# **accountLoadBalancerPoolsUpdatePool**
> LoadBalancingSchemasSingleResponse accountLoadBalancerPoolsUpdatePool(poolId, accountId, accountLoadBalancerPoolsUpdatePoolRequest)

Update Pool

Modify a configured pool.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.AccountLoadBalancerPoolsApi;

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

    AccountLoadBalancerPoolsApi apiInstance = new AccountLoadBalancerPoolsApi(defaultClient);
    String poolId = "poolId_example"; // String | 
    String accountId = "accountId_example"; // String | 
    AccountLoadBalancerPoolsUpdatePoolRequest accountLoadBalancerPoolsUpdatePoolRequest = new AccountLoadBalancerPoolsUpdatePoolRequest(); // AccountLoadBalancerPoolsUpdatePoolRequest | 
    try {
      LoadBalancingSchemasSingleResponse result = apiInstance.accountLoadBalancerPoolsUpdatePool(poolId, accountId, accountLoadBalancerPoolsUpdatePoolRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling AccountLoadBalancerPoolsApi#accountLoadBalancerPoolsUpdatePool");
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
| **accountId** | **String**|  | |
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

