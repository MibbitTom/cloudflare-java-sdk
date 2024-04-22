# LoadBalancersApi

All URIs are relative to *https://api.cloudflare.com/client/v4*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**loadBalancersCreateLoadBalancer**](LoadBalancersApi.md#loadBalancersCreateLoadBalancer) | **POST** /zones/{zone_id}/load_balancers | Create Load Balancer |
| [**loadBalancersDeleteLoadBalancer**](LoadBalancersApi.md#loadBalancersDeleteLoadBalancer) | **DELETE** /zones/{zone_id}/load_balancers/{load_balancer_id} | Delete Load Balancer |
| [**loadBalancersListLoadBalancers**](LoadBalancersApi.md#loadBalancersListLoadBalancers) | **GET** /zones/{zone_id}/load_balancers | List Load Balancers |
| [**loadBalancersLoadBalancerDetails**](LoadBalancersApi.md#loadBalancersLoadBalancerDetails) | **GET** /zones/{zone_id}/load_balancers/{load_balancer_id} | Load Balancer Details |
| [**loadBalancersPatchLoadBalancer**](LoadBalancersApi.md#loadBalancersPatchLoadBalancer) | **PATCH** /zones/{zone_id}/load_balancers/{load_balancer_id} | Patch Load Balancer |
| [**loadBalancersUpdateLoadBalancer**](LoadBalancersApi.md#loadBalancersUpdateLoadBalancer) | **PUT** /zones/{zone_id}/load_balancers/{load_balancer_id} | Update Load Balancer |


<a id="loadBalancersCreateLoadBalancer"></a>
# **loadBalancersCreateLoadBalancer**
> LoadBalancingLoadBalancerComponentsSchemasSingleResponse loadBalancersCreateLoadBalancer(zoneId, loadBalancersCreateLoadBalancerRequest)

Create Load Balancer

Create a new load balancer.

### Example
```java
// Import classes:
import cloudflare.ApiClient;
import cloudflare.ApiException;
import cloudflare.Configuration;
import cloudflare.auth.*;
import cloudflare.models.*;
import cloudflare.sdk.LoadBalancersApi;

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

    LoadBalancersApi apiInstance = new LoadBalancersApi(defaultClient);
    String zoneId = "zoneId_example"; // String | 
    LoadBalancersCreateLoadBalancerRequest loadBalancersCreateLoadBalancerRequest = new LoadBalancersCreateLoadBalancerRequest(); // LoadBalancersCreateLoadBalancerRequest | 
    try {
      LoadBalancingLoadBalancerComponentsSchemasSingleResponse result = apiInstance.loadBalancersCreateLoadBalancer(zoneId, loadBalancersCreateLoadBalancerRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling LoadBalancersApi#loadBalancersCreateLoadBalancer");
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
| **loadBalancersCreateLoadBalancerRequest** | [**LoadBalancersCreateLoadBalancerRequest**](LoadBalancersCreateLoadBalancerRequest.md)|  | |

### Return type

[**LoadBalancingLoadBalancerComponentsSchemasSingleResponse**](LoadBalancingLoadBalancerComponentsSchemasSingleResponse.md)

### Authorization

[api_key](../README.md#api_key), [api_token](../README.md#api_token), [api_email](../README.md#api_email)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Create Load Balancer response |  -  |
| **4XX** | Create Load Balancer response failure |  -  |

<a id="loadBalancersDeleteLoadBalancer"></a>
# **loadBalancersDeleteLoadBalancer**
> LoadBalancingComponentsSchemasIdResponse loadBalancersDeleteLoadBalancer(zoneId, loadBalancerId)

Delete Load Balancer

Delete a configured load balancer.

### Example
```java
// Import classes:
import cloudflare.ApiClient;
import cloudflare.ApiException;
import cloudflare.Configuration;
import cloudflare.auth.*;
import cloudflare.models.*;
import cloudflare.sdk.LoadBalancersApi;

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

    LoadBalancersApi apiInstance = new LoadBalancersApi(defaultClient);
    String zoneId = "zoneId_example"; // String | 
    String loadBalancerId = "loadBalancerId_example"; // String | 
    try {
      LoadBalancingComponentsSchemasIdResponse result = apiInstance.loadBalancersDeleteLoadBalancer(zoneId, loadBalancerId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling LoadBalancersApi#loadBalancersDeleteLoadBalancer");
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
| **loadBalancerId** | **String**|  | |

### Return type

[**LoadBalancingComponentsSchemasIdResponse**](LoadBalancingComponentsSchemasIdResponse.md)

### Authorization

[api_key](../README.md#api_key), [api_token](../README.md#api_token), [api_email](../README.md#api_email)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Delete Load Balancer response |  -  |
| **4XX** | Delete Load Balancer response failure |  -  |

<a id="loadBalancersListLoadBalancers"></a>
# **loadBalancersListLoadBalancers**
> LoadBalancingLoadBalancerComponentsSchemasResponseCollection loadBalancersListLoadBalancers(zoneId)

List Load Balancers

List configured load balancers.

### Example
```java
// Import classes:
import cloudflare.ApiClient;
import cloudflare.ApiException;
import cloudflare.Configuration;
import cloudflare.auth.*;
import cloudflare.models.*;
import cloudflare.sdk.LoadBalancersApi;

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

    LoadBalancersApi apiInstance = new LoadBalancersApi(defaultClient);
    String zoneId = "zoneId_example"; // String | 
    try {
      LoadBalancingLoadBalancerComponentsSchemasResponseCollection result = apiInstance.loadBalancersListLoadBalancers(zoneId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling LoadBalancersApi#loadBalancersListLoadBalancers");
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

[**LoadBalancingLoadBalancerComponentsSchemasResponseCollection**](LoadBalancingLoadBalancerComponentsSchemasResponseCollection.md)

### Authorization

[api_key](../README.md#api_key), [api_token](../README.md#api_token), [api_email](../README.md#api_email)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | List Load Balancers response |  -  |
| **4XX** | List Load Balancers response failure |  -  |

<a id="loadBalancersLoadBalancerDetails"></a>
# **loadBalancersLoadBalancerDetails**
> LoadBalancingLoadBalancerComponentsSchemasSingleResponse loadBalancersLoadBalancerDetails(zoneId, loadBalancerId)

Load Balancer Details

Fetch a single configured load balancer.

### Example
```java
// Import classes:
import cloudflare.ApiClient;
import cloudflare.ApiException;
import cloudflare.Configuration;
import cloudflare.auth.*;
import cloudflare.models.*;
import cloudflare.sdk.LoadBalancersApi;

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

    LoadBalancersApi apiInstance = new LoadBalancersApi(defaultClient);
    String zoneId = "zoneId_example"; // String | 
    String loadBalancerId = "loadBalancerId_example"; // String | 
    try {
      LoadBalancingLoadBalancerComponentsSchemasSingleResponse result = apiInstance.loadBalancersLoadBalancerDetails(zoneId, loadBalancerId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling LoadBalancersApi#loadBalancersLoadBalancerDetails");
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
| **loadBalancerId** | **String**|  | |

### Return type

[**LoadBalancingLoadBalancerComponentsSchemasSingleResponse**](LoadBalancingLoadBalancerComponentsSchemasSingleResponse.md)

### Authorization

[api_key](../README.md#api_key), [api_token](../README.md#api_token), [api_email](../README.md#api_email)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Load Balancer Details response |  -  |
| **4XX** | Load Balancer Details response failure |  -  |

<a id="loadBalancersPatchLoadBalancer"></a>
# **loadBalancersPatchLoadBalancer**
> LoadBalancingLoadBalancerComponentsSchemasSingleResponse loadBalancersPatchLoadBalancer(zoneId, loadBalancerId, loadBalancersPatchLoadBalancerRequest)

Patch Load Balancer

Apply changes to an existing load balancer, overwriting the supplied properties.

### Example
```java
// Import classes:
import cloudflare.ApiClient;
import cloudflare.ApiException;
import cloudflare.Configuration;
import cloudflare.auth.*;
import cloudflare.models.*;
import cloudflare.sdk.LoadBalancersApi;

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

    LoadBalancersApi apiInstance = new LoadBalancersApi(defaultClient);
    String zoneId = "zoneId_example"; // String | 
    String loadBalancerId = "loadBalancerId_example"; // String | 
    LoadBalancersPatchLoadBalancerRequest loadBalancersPatchLoadBalancerRequest = new LoadBalancersPatchLoadBalancerRequest(); // LoadBalancersPatchLoadBalancerRequest | 
    try {
      LoadBalancingLoadBalancerComponentsSchemasSingleResponse result = apiInstance.loadBalancersPatchLoadBalancer(zoneId, loadBalancerId, loadBalancersPatchLoadBalancerRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling LoadBalancersApi#loadBalancersPatchLoadBalancer");
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
| **loadBalancerId** | **String**|  | |
| **loadBalancersPatchLoadBalancerRequest** | [**LoadBalancersPatchLoadBalancerRequest**](LoadBalancersPatchLoadBalancerRequest.md)|  | |

### Return type

[**LoadBalancingLoadBalancerComponentsSchemasSingleResponse**](LoadBalancingLoadBalancerComponentsSchemasSingleResponse.md)

### Authorization

[api_key](../README.md#api_key), [api_token](../README.md#api_token), [api_email](../README.md#api_email)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Patch Load Balancer response |  -  |
| **4XX** | Patch Load Balancer response failure |  -  |

<a id="loadBalancersUpdateLoadBalancer"></a>
# **loadBalancersUpdateLoadBalancer**
> LoadBalancingLoadBalancerComponentsSchemasSingleResponse loadBalancersUpdateLoadBalancer(zoneId, loadBalancerId, loadBalancersUpdateLoadBalancerRequest)

Update Load Balancer

Update a configured load balancer.

### Example
```java
// Import classes:
import cloudflare.ApiClient;
import cloudflare.ApiException;
import cloudflare.Configuration;
import cloudflare.auth.*;
import cloudflare.models.*;
import cloudflare.sdk.LoadBalancersApi;

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

    LoadBalancersApi apiInstance = new LoadBalancersApi(defaultClient);
    String zoneId = "zoneId_example"; // String | 
    String loadBalancerId = "loadBalancerId_example"; // String | 
    LoadBalancersUpdateLoadBalancerRequest loadBalancersUpdateLoadBalancerRequest = new LoadBalancersUpdateLoadBalancerRequest(); // LoadBalancersUpdateLoadBalancerRequest | 
    try {
      LoadBalancingLoadBalancerComponentsSchemasSingleResponse result = apiInstance.loadBalancersUpdateLoadBalancer(zoneId, loadBalancerId, loadBalancersUpdateLoadBalancerRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling LoadBalancersApi#loadBalancersUpdateLoadBalancer");
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
| **loadBalancerId** | **String**|  | |
| **loadBalancersUpdateLoadBalancerRequest** | [**LoadBalancersUpdateLoadBalancerRequest**](LoadBalancersUpdateLoadBalancerRequest.md)|  | |

### Return type

[**LoadBalancingLoadBalancerComponentsSchemasSingleResponse**](LoadBalancingLoadBalancerComponentsSchemasSingleResponse.md)

### Authorization

[api_key](../README.md#api_key), [api_token](../README.md#api_token), [api_email](../README.md#api_email)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Update Load Balancer response |  -  |
| **4XX** | Update Load Balancer response failure |  -  |

