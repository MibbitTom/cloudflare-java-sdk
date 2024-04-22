# LoadBalancerMonitorsApi

All URIs are relative to *https://api.cloudflare.com/client/v4*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**loadBalancerMonitorsCreateMonitor**](LoadBalancerMonitorsApi.md#loadBalancerMonitorsCreateMonitor) | **POST** /user/load_balancers/monitors | Create Monitor |
| [**loadBalancerMonitorsDeleteMonitor**](LoadBalancerMonitorsApi.md#loadBalancerMonitorsDeleteMonitor) | **DELETE** /user/load_balancers/monitors/{monitor_id} | Delete Monitor |
| [**loadBalancerMonitorsListMonitorReferences**](LoadBalancerMonitorsApi.md#loadBalancerMonitorsListMonitorReferences) | **GET** /user/load_balancers/monitors/{monitor_id}/references | List Monitor References |
| [**loadBalancerMonitorsListMonitors**](LoadBalancerMonitorsApi.md#loadBalancerMonitorsListMonitors) | **GET** /user/load_balancers/monitors | List Monitors |
| [**loadBalancerMonitorsMonitorDetails**](LoadBalancerMonitorsApi.md#loadBalancerMonitorsMonitorDetails) | **GET** /user/load_balancers/monitors/{monitor_id} | Monitor Details |
| [**loadBalancerMonitorsPatchMonitor**](LoadBalancerMonitorsApi.md#loadBalancerMonitorsPatchMonitor) | **PATCH** /user/load_balancers/monitors/{monitor_id} | Patch Monitor |
| [**loadBalancerMonitorsPreviewMonitor**](LoadBalancerMonitorsApi.md#loadBalancerMonitorsPreviewMonitor) | **POST** /user/load_balancers/monitors/{monitor_id}/preview | Preview Monitor |
| [**loadBalancerMonitorsPreviewResult**](LoadBalancerMonitorsApi.md#loadBalancerMonitorsPreviewResult) | **GET** /user/load_balancers/preview/{preview_id} | Preview Result |
| [**loadBalancerMonitorsUpdateMonitor**](LoadBalancerMonitorsApi.md#loadBalancerMonitorsUpdateMonitor) | **PUT** /user/load_balancers/monitors/{monitor_id} | Update Monitor |


<a id="loadBalancerMonitorsCreateMonitor"></a>
# **loadBalancerMonitorsCreateMonitor**
> LoadBalancingMonitorResponseSingle loadBalancerMonitorsCreateMonitor(accountLoadBalancerMonitorsCreateMonitorRequest)

Create Monitor

Create a configured monitor.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.LoadBalancerMonitorsApi;

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

    LoadBalancerMonitorsApi apiInstance = new LoadBalancerMonitorsApi(defaultClient);
    AccountLoadBalancerMonitorsCreateMonitorRequest accountLoadBalancerMonitorsCreateMonitorRequest = new AccountLoadBalancerMonitorsCreateMonitorRequest(); // AccountLoadBalancerMonitorsCreateMonitorRequest | 
    try {
      LoadBalancingMonitorResponseSingle result = apiInstance.loadBalancerMonitorsCreateMonitor(accountLoadBalancerMonitorsCreateMonitorRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling LoadBalancerMonitorsApi#loadBalancerMonitorsCreateMonitor");
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
| **accountLoadBalancerMonitorsCreateMonitorRequest** | [**AccountLoadBalancerMonitorsCreateMonitorRequest**](AccountLoadBalancerMonitorsCreateMonitorRequest.md)|  | |

### Return type

[**LoadBalancingMonitorResponseSingle**](LoadBalancingMonitorResponseSingle.md)

### Authorization

[api_key](../README.md#api_key), [api_token](../README.md#api_token), [api_email](../README.md#api_email)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Create Monitor response |  -  |
| **4XX** | Create Monitor response failure |  -  |

<a id="loadBalancerMonitorsDeleteMonitor"></a>
# **loadBalancerMonitorsDeleteMonitor**
> LoadBalancingIdResponse loadBalancerMonitorsDeleteMonitor(monitorId)

Delete Monitor

Delete a configured monitor.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.LoadBalancerMonitorsApi;

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

    LoadBalancerMonitorsApi apiInstance = new LoadBalancerMonitorsApi(defaultClient);
    String monitorId = "monitorId_example"; // String | 
    try {
      LoadBalancingIdResponse result = apiInstance.loadBalancerMonitorsDeleteMonitor(monitorId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling LoadBalancerMonitorsApi#loadBalancerMonitorsDeleteMonitor");
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
| **monitorId** | **String**|  | |

### Return type

[**LoadBalancingIdResponse**](LoadBalancingIdResponse.md)

### Authorization

[api_key](../README.md#api_key), [api_token](../README.md#api_token), [api_email](../README.md#api_email)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Delete Monitor response |  -  |
| **4XX** | Delete Monitor response failure |  -  |

<a id="loadBalancerMonitorsListMonitorReferences"></a>
# **loadBalancerMonitorsListMonitorReferences**
> LoadBalancingReferencesResponse loadBalancerMonitorsListMonitorReferences(monitorId)

List Monitor References

Get the list of resources that reference the provided monitor.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.LoadBalancerMonitorsApi;

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

    LoadBalancerMonitorsApi apiInstance = new LoadBalancerMonitorsApi(defaultClient);
    String monitorId = "monitorId_example"; // String | 
    try {
      LoadBalancingReferencesResponse result = apiInstance.loadBalancerMonitorsListMonitorReferences(monitorId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling LoadBalancerMonitorsApi#loadBalancerMonitorsListMonitorReferences");
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
| **monitorId** | **String**|  | |

### Return type

[**LoadBalancingReferencesResponse**](LoadBalancingReferencesResponse.md)

### Authorization

[api_key](../README.md#api_key), [api_token](../README.md#api_token), [api_email](../README.md#api_email)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | List Monitor References response |  -  |
| **4XX** | List Monitor References response failure |  -  |

<a id="loadBalancerMonitorsListMonitors"></a>
# **loadBalancerMonitorsListMonitors**
> LoadBalancingMonitorResponseCollection loadBalancerMonitorsListMonitors()

List Monitors

List configured monitors for a user.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.LoadBalancerMonitorsApi;

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

    LoadBalancerMonitorsApi apiInstance = new LoadBalancerMonitorsApi(defaultClient);
    try {
      LoadBalancingMonitorResponseCollection result = apiInstance.loadBalancerMonitorsListMonitors();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling LoadBalancerMonitorsApi#loadBalancerMonitorsListMonitors");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**LoadBalancingMonitorResponseCollection**](LoadBalancingMonitorResponseCollection.md)

### Authorization

[api_key](../README.md#api_key), [api_token](../README.md#api_token), [api_email](../README.md#api_email)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | List Monitors response |  -  |
| **4XX** | List Monitors response failure |  -  |

<a id="loadBalancerMonitorsMonitorDetails"></a>
# **loadBalancerMonitorsMonitorDetails**
> LoadBalancingMonitorResponseSingle loadBalancerMonitorsMonitorDetails(monitorId)

Monitor Details

List a single configured monitor for a user.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.LoadBalancerMonitorsApi;

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

    LoadBalancerMonitorsApi apiInstance = new LoadBalancerMonitorsApi(defaultClient);
    String monitorId = "monitorId_example"; // String | 
    try {
      LoadBalancingMonitorResponseSingle result = apiInstance.loadBalancerMonitorsMonitorDetails(monitorId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling LoadBalancerMonitorsApi#loadBalancerMonitorsMonitorDetails");
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
| **monitorId** | **String**|  | |

### Return type

[**LoadBalancingMonitorResponseSingle**](LoadBalancingMonitorResponseSingle.md)

### Authorization

[api_key](../README.md#api_key), [api_token](../README.md#api_token), [api_email](../README.md#api_email)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Monitor Details response |  -  |
| **4XX** | Monitor Details response failure |  -  |

<a id="loadBalancerMonitorsPatchMonitor"></a>
# **loadBalancerMonitorsPatchMonitor**
> LoadBalancingMonitorResponseSingle loadBalancerMonitorsPatchMonitor(monitorId, accountLoadBalancerMonitorsCreateMonitorRequest)

Patch Monitor

Apply changes to an existing monitor, overwriting the supplied properties.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.LoadBalancerMonitorsApi;

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

    LoadBalancerMonitorsApi apiInstance = new LoadBalancerMonitorsApi(defaultClient);
    String monitorId = "monitorId_example"; // String | 
    AccountLoadBalancerMonitorsCreateMonitorRequest accountLoadBalancerMonitorsCreateMonitorRequest = new AccountLoadBalancerMonitorsCreateMonitorRequest(); // AccountLoadBalancerMonitorsCreateMonitorRequest | 
    try {
      LoadBalancingMonitorResponseSingle result = apiInstance.loadBalancerMonitorsPatchMonitor(monitorId, accountLoadBalancerMonitorsCreateMonitorRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling LoadBalancerMonitorsApi#loadBalancerMonitorsPatchMonitor");
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
| **monitorId** | **String**|  | |
| **accountLoadBalancerMonitorsCreateMonitorRequest** | [**AccountLoadBalancerMonitorsCreateMonitorRequest**](AccountLoadBalancerMonitorsCreateMonitorRequest.md)|  | |

### Return type

[**LoadBalancingMonitorResponseSingle**](LoadBalancingMonitorResponseSingle.md)

### Authorization

[api_key](../README.md#api_key), [api_token](../README.md#api_token), [api_email](../README.md#api_email)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Patch Monitor response |  -  |
| **4XX** | Patch Monitor response failure |  -  |

<a id="loadBalancerMonitorsPreviewMonitor"></a>
# **loadBalancerMonitorsPreviewMonitor**
> LoadBalancingPreviewResponse loadBalancerMonitorsPreviewMonitor(monitorId, accountLoadBalancerMonitorsCreateMonitorRequest)

Preview Monitor

Preview pools using the specified monitor with provided monitor details. The returned preview_id can be used in the preview endpoint to retrieve the results.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.LoadBalancerMonitorsApi;

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

    LoadBalancerMonitorsApi apiInstance = new LoadBalancerMonitorsApi(defaultClient);
    String monitorId = "monitorId_example"; // String | 
    AccountLoadBalancerMonitorsCreateMonitorRequest accountLoadBalancerMonitorsCreateMonitorRequest = new AccountLoadBalancerMonitorsCreateMonitorRequest(); // AccountLoadBalancerMonitorsCreateMonitorRequest | 
    try {
      LoadBalancingPreviewResponse result = apiInstance.loadBalancerMonitorsPreviewMonitor(monitorId, accountLoadBalancerMonitorsCreateMonitorRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling LoadBalancerMonitorsApi#loadBalancerMonitorsPreviewMonitor");
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
| **monitorId** | **String**|  | |
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
| **200** | Preview Monitor response |  -  |
| **4XX** | Preview Monitor response failure |  -  |

<a id="loadBalancerMonitorsPreviewResult"></a>
# **loadBalancerMonitorsPreviewResult**
> LoadBalancingPreviewResultResponse loadBalancerMonitorsPreviewResult(previewId)

Preview Result

Get the result of a previous preview operation using the provided preview_id.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.LoadBalancerMonitorsApi;

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

    LoadBalancerMonitorsApi apiInstance = new LoadBalancerMonitorsApi(defaultClient);
    Object previewId = null; // Object | 
    try {
      LoadBalancingPreviewResultResponse result = apiInstance.loadBalancerMonitorsPreviewResult(previewId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling LoadBalancerMonitorsApi#loadBalancerMonitorsPreviewResult");
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
| **previewId** | [**Object**](.md)|  | |

### Return type

[**LoadBalancingPreviewResultResponse**](LoadBalancingPreviewResultResponse.md)

### Authorization

[api_key](../README.md#api_key), [api_token](../README.md#api_token), [api_email](../README.md#api_email)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Preview Result response |  -  |
| **4XX** | Preview Result response failure |  -  |

<a id="loadBalancerMonitorsUpdateMonitor"></a>
# **loadBalancerMonitorsUpdateMonitor**
> LoadBalancingMonitorResponseSingle loadBalancerMonitorsUpdateMonitor(monitorId, accountLoadBalancerMonitorsCreateMonitorRequest)

Update Monitor

Modify a configured monitor.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.LoadBalancerMonitorsApi;

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

    LoadBalancerMonitorsApi apiInstance = new LoadBalancerMonitorsApi(defaultClient);
    String monitorId = "monitorId_example"; // String | 
    AccountLoadBalancerMonitorsCreateMonitorRequest accountLoadBalancerMonitorsCreateMonitorRequest = new AccountLoadBalancerMonitorsCreateMonitorRequest(); // AccountLoadBalancerMonitorsCreateMonitorRequest | 
    try {
      LoadBalancingMonitorResponseSingle result = apiInstance.loadBalancerMonitorsUpdateMonitor(monitorId, accountLoadBalancerMonitorsCreateMonitorRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling LoadBalancerMonitorsApi#loadBalancerMonitorsUpdateMonitor");
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
| **monitorId** | **String**|  | |
| **accountLoadBalancerMonitorsCreateMonitorRequest** | [**AccountLoadBalancerMonitorsCreateMonitorRequest**](AccountLoadBalancerMonitorsCreateMonitorRequest.md)|  | |

### Return type

[**LoadBalancingMonitorResponseSingle**](LoadBalancingMonitorResponseSingle.md)

### Authorization

[api_key](../README.md#api_key), [api_token](../README.md#api_token), [api_email](../README.md#api_email)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Update Monitor response |  -  |
| **4XX** | Update Monitor response failure |  -  |

