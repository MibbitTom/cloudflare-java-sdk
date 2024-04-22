# AccountLoadBalancerMonitorsApi

All URIs are relative to *https://api.cloudflare.com/client/v4*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**accountLoadBalancerMonitorsCreateMonitor**](AccountLoadBalancerMonitorsApi.md#accountLoadBalancerMonitorsCreateMonitor) | **POST** /accounts/{account_id}/load_balancers/monitors | Create Monitor |
| [**accountLoadBalancerMonitorsDeleteMonitor**](AccountLoadBalancerMonitorsApi.md#accountLoadBalancerMonitorsDeleteMonitor) | **DELETE** /accounts/{account_id}/load_balancers/monitors/{monitor_id} | Delete Monitor |
| [**accountLoadBalancerMonitorsListMonitorReferences**](AccountLoadBalancerMonitorsApi.md#accountLoadBalancerMonitorsListMonitorReferences) | **GET** /accounts/{account_id}/load_balancers/monitors/{monitor_id}/references | List Monitor References |
| [**accountLoadBalancerMonitorsListMonitors**](AccountLoadBalancerMonitorsApi.md#accountLoadBalancerMonitorsListMonitors) | **GET** /accounts/{account_id}/load_balancers/monitors | List Monitors |
| [**accountLoadBalancerMonitorsMonitorDetails**](AccountLoadBalancerMonitorsApi.md#accountLoadBalancerMonitorsMonitorDetails) | **GET** /accounts/{account_id}/load_balancers/monitors/{monitor_id} | Monitor Details |
| [**accountLoadBalancerMonitorsPatchMonitor**](AccountLoadBalancerMonitorsApi.md#accountLoadBalancerMonitorsPatchMonitor) | **PATCH** /accounts/{account_id}/load_balancers/monitors/{monitor_id} | Patch Monitor |
| [**accountLoadBalancerMonitorsPreviewMonitor**](AccountLoadBalancerMonitorsApi.md#accountLoadBalancerMonitorsPreviewMonitor) | **POST** /accounts/{account_id}/load_balancers/monitors/{monitor_id}/preview | Preview Monitor |
| [**accountLoadBalancerMonitorsPreviewResult**](AccountLoadBalancerMonitorsApi.md#accountLoadBalancerMonitorsPreviewResult) | **GET** /accounts/{account_id}/load_balancers/preview/{preview_id} | Preview Result |
| [**accountLoadBalancerMonitorsUpdateMonitor**](AccountLoadBalancerMonitorsApi.md#accountLoadBalancerMonitorsUpdateMonitor) | **PUT** /accounts/{account_id}/load_balancers/monitors/{monitor_id} | Update Monitor |


<a id="accountLoadBalancerMonitorsCreateMonitor"></a>
# **accountLoadBalancerMonitorsCreateMonitor**
> LoadBalancingMonitorResponseSingle accountLoadBalancerMonitorsCreateMonitor(accountId, accountLoadBalancerMonitorsCreateMonitorRequest)

Create Monitor

Create a configured monitor.

### Example
```java
// Import classes:
import cloudflare.ApiClient;
import cloudflare.ApiException;
import cloudflare.Configuration;
import cloudflare.auth.*;
import cloudflare.models.*;
import cloudflare.sdk.AccountLoadBalancerMonitorsApi;

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

    AccountLoadBalancerMonitorsApi apiInstance = new AccountLoadBalancerMonitorsApi(defaultClient);
    String accountId = "accountId_example"; // String | 
    AccountLoadBalancerMonitorsCreateMonitorRequest accountLoadBalancerMonitorsCreateMonitorRequest = new AccountLoadBalancerMonitorsCreateMonitorRequest(); // AccountLoadBalancerMonitorsCreateMonitorRequest | 
    try {
      LoadBalancingMonitorResponseSingle result = apiInstance.accountLoadBalancerMonitorsCreateMonitor(accountId, accountLoadBalancerMonitorsCreateMonitorRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling AccountLoadBalancerMonitorsApi#accountLoadBalancerMonitorsCreateMonitor");
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

<a id="accountLoadBalancerMonitorsDeleteMonitor"></a>
# **accountLoadBalancerMonitorsDeleteMonitor**
> LoadBalancingIdResponse accountLoadBalancerMonitorsDeleteMonitor(monitorId, accountId)

Delete Monitor

Delete a configured monitor.

### Example
```java
// Import classes:
import cloudflare.ApiClient;
import cloudflare.ApiException;
import cloudflare.Configuration;
import cloudflare.auth.*;
import cloudflare.models.*;
import cloudflare.sdk.AccountLoadBalancerMonitorsApi;

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

    AccountLoadBalancerMonitorsApi apiInstance = new AccountLoadBalancerMonitorsApi(defaultClient);
    String monitorId = "monitorId_example"; // String | 
    String accountId = "accountId_example"; // String | 
    try {
      LoadBalancingIdResponse result = apiInstance.accountLoadBalancerMonitorsDeleteMonitor(monitorId, accountId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling AccountLoadBalancerMonitorsApi#accountLoadBalancerMonitorsDeleteMonitor");
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
| **accountId** | **String**|  | |

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

<a id="accountLoadBalancerMonitorsListMonitorReferences"></a>
# **accountLoadBalancerMonitorsListMonitorReferences**
> LoadBalancingReferencesResponse accountLoadBalancerMonitorsListMonitorReferences(monitorId, accountId)

List Monitor References

Get the list of resources that reference the provided monitor.

### Example
```java
// Import classes:
import cloudflare.ApiClient;
import cloudflare.ApiException;
import cloudflare.Configuration;
import cloudflare.auth.*;
import cloudflare.models.*;
import cloudflare.sdk.AccountLoadBalancerMonitorsApi;

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

    AccountLoadBalancerMonitorsApi apiInstance = new AccountLoadBalancerMonitorsApi(defaultClient);
    String monitorId = "monitorId_example"; // String | 
    String accountId = "accountId_example"; // String | 
    try {
      LoadBalancingReferencesResponse result = apiInstance.accountLoadBalancerMonitorsListMonitorReferences(monitorId, accountId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling AccountLoadBalancerMonitorsApi#accountLoadBalancerMonitorsListMonitorReferences");
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
| **accountId** | **String**|  | |

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

<a id="accountLoadBalancerMonitorsListMonitors"></a>
# **accountLoadBalancerMonitorsListMonitors**
> LoadBalancingMonitorResponseCollection accountLoadBalancerMonitorsListMonitors(accountId)

List Monitors

List configured monitors for an account.

### Example
```java
// Import classes:
import cloudflare.ApiClient;
import cloudflare.ApiException;
import cloudflare.Configuration;
import cloudflare.auth.*;
import cloudflare.models.*;
import cloudflare.sdk.AccountLoadBalancerMonitorsApi;

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

    AccountLoadBalancerMonitorsApi apiInstance = new AccountLoadBalancerMonitorsApi(defaultClient);
    String accountId = "accountId_example"; // String | 
    try {
      LoadBalancingMonitorResponseCollection result = apiInstance.accountLoadBalancerMonitorsListMonitors(accountId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling AccountLoadBalancerMonitorsApi#accountLoadBalancerMonitorsListMonitors");
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

<a id="accountLoadBalancerMonitorsMonitorDetails"></a>
# **accountLoadBalancerMonitorsMonitorDetails**
> LoadBalancingMonitorResponseSingle accountLoadBalancerMonitorsMonitorDetails(monitorId, accountId)

Monitor Details

List a single configured monitor for an account.

### Example
```java
// Import classes:
import cloudflare.ApiClient;
import cloudflare.ApiException;
import cloudflare.Configuration;
import cloudflare.auth.*;
import cloudflare.models.*;
import cloudflare.sdk.AccountLoadBalancerMonitorsApi;

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

    AccountLoadBalancerMonitorsApi apiInstance = new AccountLoadBalancerMonitorsApi(defaultClient);
    String monitorId = "monitorId_example"; // String | 
    String accountId = "accountId_example"; // String | 
    try {
      LoadBalancingMonitorResponseSingle result = apiInstance.accountLoadBalancerMonitorsMonitorDetails(monitorId, accountId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling AccountLoadBalancerMonitorsApi#accountLoadBalancerMonitorsMonitorDetails");
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
| **accountId** | **String**|  | |

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

<a id="accountLoadBalancerMonitorsPatchMonitor"></a>
# **accountLoadBalancerMonitorsPatchMonitor**
> LoadBalancingMonitorResponseSingle accountLoadBalancerMonitorsPatchMonitor(monitorId, accountId, accountLoadBalancerMonitorsCreateMonitorRequest)

Patch Monitor

Apply changes to an existing monitor, overwriting the supplied properties.

### Example
```java
// Import classes:
import cloudflare.ApiClient;
import cloudflare.ApiException;
import cloudflare.Configuration;
import cloudflare.auth.*;
import cloudflare.models.*;
import cloudflare.sdk.AccountLoadBalancerMonitorsApi;

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

    AccountLoadBalancerMonitorsApi apiInstance = new AccountLoadBalancerMonitorsApi(defaultClient);
    String monitorId = "monitorId_example"; // String | 
    String accountId = "accountId_example"; // String | 
    AccountLoadBalancerMonitorsCreateMonitorRequest accountLoadBalancerMonitorsCreateMonitorRequest = new AccountLoadBalancerMonitorsCreateMonitorRequest(); // AccountLoadBalancerMonitorsCreateMonitorRequest | 
    try {
      LoadBalancingMonitorResponseSingle result = apiInstance.accountLoadBalancerMonitorsPatchMonitor(monitorId, accountId, accountLoadBalancerMonitorsCreateMonitorRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling AccountLoadBalancerMonitorsApi#accountLoadBalancerMonitorsPatchMonitor");
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
| **accountId** | **String**|  | |
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

<a id="accountLoadBalancerMonitorsPreviewMonitor"></a>
# **accountLoadBalancerMonitorsPreviewMonitor**
> LoadBalancingPreviewResponse accountLoadBalancerMonitorsPreviewMonitor(monitorId, accountId, accountLoadBalancerMonitorsCreateMonitorRequest)

Preview Monitor

Preview pools using the specified monitor with provided monitor details. The returned preview_id can be used in the preview endpoint to retrieve the results.

### Example
```java
// Import classes:
import cloudflare.ApiClient;
import cloudflare.ApiException;
import cloudflare.Configuration;
import cloudflare.auth.*;
import cloudflare.models.*;
import cloudflare.sdk.AccountLoadBalancerMonitorsApi;

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

    AccountLoadBalancerMonitorsApi apiInstance = new AccountLoadBalancerMonitorsApi(defaultClient);
    String monitorId = "monitorId_example"; // String | 
    String accountId = "accountId_example"; // String | 
    AccountLoadBalancerMonitorsCreateMonitorRequest accountLoadBalancerMonitorsCreateMonitorRequest = new AccountLoadBalancerMonitorsCreateMonitorRequest(); // AccountLoadBalancerMonitorsCreateMonitorRequest | 
    try {
      LoadBalancingPreviewResponse result = apiInstance.accountLoadBalancerMonitorsPreviewMonitor(monitorId, accountId, accountLoadBalancerMonitorsCreateMonitorRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling AccountLoadBalancerMonitorsApi#accountLoadBalancerMonitorsPreviewMonitor");
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
| **200** | Preview Monitor response |  -  |
| **4XX** | Preview Monitor response failure |  -  |

<a id="accountLoadBalancerMonitorsPreviewResult"></a>
# **accountLoadBalancerMonitorsPreviewResult**
> LoadBalancingPreviewResultResponse accountLoadBalancerMonitorsPreviewResult(previewId, accountId)

Preview Result

Get the result of a previous preview operation using the provided preview_id.

### Example
```java
// Import classes:
import cloudflare.ApiClient;
import cloudflare.ApiException;
import cloudflare.Configuration;
import cloudflare.auth.*;
import cloudflare.models.*;
import cloudflare.sdk.AccountLoadBalancerMonitorsApi;

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

    AccountLoadBalancerMonitorsApi apiInstance = new AccountLoadBalancerMonitorsApi(defaultClient);
    Object previewId = null; // Object | 
    String accountId = "accountId_example"; // String | 
    try {
      LoadBalancingPreviewResultResponse result = apiInstance.accountLoadBalancerMonitorsPreviewResult(previewId, accountId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling AccountLoadBalancerMonitorsApi#accountLoadBalancerMonitorsPreviewResult");
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
| **accountId** | **String**|  | |

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

<a id="accountLoadBalancerMonitorsUpdateMonitor"></a>
# **accountLoadBalancerMonitorsUpdateMonitor**
> LoadBalancingMonitorResponseSingle accountLoadBalancerMonitorsUpdateMonitor(monitorId, accountId, accountLoadBalancerMonitorsCreateMonitorRequest)

Update Monitor

Modify a configured monitor.

### Example
```java
// Import classes:
import cloudflare.ApiClient;
import cloudflare.ApiException;
import cloudflare.Configuration;
import cloudflare.auth.*;
import cloudflare.models.*;
import cloudflare.sdk.AccountLoadBalancerMonitorsApi;

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

    AccountLoadBalancerMonitorsApi apiInstance = new AccountLoadBalancerMonitorsApi(defaultClient);
    String monitorId = "monitorId_example"; // String | 
    String accountId = "accountId_example"; // String | 
    AccountLoadBalancerMonitorsCreateMonitorRequest accountLoadBalancerMonitorsCreateMonitorRequest = new AccountLoadBalancerMonitorsCreateMonitorRequest(); // AccountLoadBalancerMonitorsCreateMonitorRequest | 
    try {
      LoadBalancingMonitorResponseSingle result = apiInstance.accountLoadBalancerMonitorsUpdateMonitor(monitorId, accountId, accountLoadBalancerMonitorsCreateMonitorRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling AccountLoadBalancerMonitorsApi#accountLoadBalancerMonitorsUpdateMonitor");
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
| **accountId** | **String**|  | |
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

