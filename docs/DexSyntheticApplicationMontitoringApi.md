# DexSyntheticApplicationMontitoringApi

All URIs are relative to *https://api.cloudflare.com/client/v4*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**dexEndpointsHttpTestDetails**](DexSyntheticApplicationMontitoringApi.md#dexEndpointsHttpTestDetails) | **GET** /accounts/{account_id}/dex/http-tests/{test_id} | Get details and aggregate metrics for an http test |
| [**dexEndpointsHttpTestPercentiles**](DexSyntheticApplicationMontitoringApi.md#dexEndpointsHttpTestPercentiles) | **GET** /accounts/{account_id}/dex/http-tests/{test_id}/percentiles | Get percentiles for an http test |
| [**dexEndpointsListColos**](DexSyntheticApplicationMontitoringApi.md#dexEndpointsListColos) | **GET** /accounts/{account_id}/dex/colos | List Cloudflare colos |
| [**dexEndpointsListTests**](DexSyntheticApplicationMontitoringApi.md#dexEndpointsListTests) | **GET** /accounts/{account_id}/dex/tests | List DEX test analytics |
| [**dexEndpointsTestsUniqueDevices**](DexSyntheticApplicationMontitoringApi.md#dexEndpointsTestsUniqueDevices) | **GET** /accounts/{account_id}/dex/tests/unique-devices | Get count of devices targeted |
| [**dexEndpointsTracerouteTestDetails**](DexSyntheticApplicationMontitoringApi.md#dexEndpointsTracerouteTestDetails) | **GET** /accounts/{account_id}/dex/traceroute-tests/{test_id} | Get details and aggregate metrics for a traceroute test |
| [**dexEndpointsTracerouteTestNetworkPath**](DexSyntheticApplicationMontitoringApi.md#dexEndpointsTracerouteTestNetworkPath) | **GET** /accounts/{account_id}/dex/traceroute-tests/{test_id}/network-path | Get network path breakdown for a traceroute test |
| [**dexEndpointsTracerouteTestPercentiles**](DexSyntheticApplicationMontitoringApi.md#dexEndpointsTracerouteTestPercentiles) | **GET** /accounts/{account_id}/dex/traceroute-tests/{test_id}/percentiles | Get percentiles for a traceroute test |
| [**dexEndpointsTracerouteTestResultNetworkPath**](DexSyntheticApplicationMontitoringApi.md#dexEndpointsTracerouteTestResultNetworkPath) | **GET** /accounts/{account_id}/dex/traceroute-test-results/{test_result_id}/network-path | Get details for a specific traceroute test run |
| [**dexFleetStatusDevices**](DexSyntheticApplicationMontitoringApi.md#dexFleetStatusDevices) | **GET** /accounts/{account_id}/dex/fleet-status/devices | List fleet status devices |
| [**dexFleetStatusLive**](DexSyntheticApplicationMontitoringApi.md#dexFleetStatusLive) | **GET** /accounts/{account_id}/dex/fleet-status/live | List fleet status details by dimension |
| [**dexFleetStatusOverTime**](DexSyntheticApplicationMontitoringApi.md#dexFleetStatusOverTime) | **GET** /accounts/{account_id}/dex/fleet-status/over-time | List fleet status aggregate details by dimension |


<a id="dexEndpointsHttpTestDetails"></a>
# **dexEndpointsHttpTestDetails**
> DexEndpointsHttpTestDetails200Response dexEndpointsHttpTestDetails(accountId, testId, timeStart, timeEnd, interval, deviceId, colo)

Get details and aggregate metrics for an http test

Get test details and aggregate performance metrics for an http test for a given time period between 1 hour and 7 days.

### Example
```java
// Import classes:
import cloudflare.ApiClient;
import cloudflare.ApiException;
import cloudflare.Configuration;
import cloudflare.auth.*;
import cloudflare.models.*;
import cloudflare.sdk.DexSyntheticApplicationMontitoringApi;

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

    DexSyntheticApplicationMontitoringApi apiInstance = new DexSyntheticApplicationMontitoringApi(defaultClient);
    String accountId = "accountId_example"; // String | unique identifier linked to an account in the API request path.
    String testId = "testId_example"; // String | unique identifier for a specific test
    String timeStart = "1689520412000"; // String | Start time for aggregate metrics in ISO ms
    String timeEnd = "1689606812000"; // String | End time for aggregate metrics in ISO ms
    String interval = "minute"; // String | Time interval for aggregate time slots.
    List<String> deviceId = Arrays.asList(); // List<String> | Optionally filter result stats to a specific device(s). Cannot be used in combination with colo param.
    String colo = "colo_example"; // String | Optionally filter result stats to a Cloudflare colo. Cannot be used in combination with deviceId param.
    try {
      DexEndpointsHttpTestDetails200Response result = apiInstance.dexEndpointsHttpTestDetails(accountId, testId, timeStart, timeEnd, interval, deviceId, colo);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling DexSyntheticApplicationMontitoringApi#dexEndpointsHttpTestDetails");
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
| **accountId** | **String**| unique identifier linked to an account in the API request path. | |
| **testId** | **String**| unique identifier for a specific test | |
| **timeStart** | **String**| Start time for aggregate metrics in ISO ms | |
| **timeEnd** | **String**| End time for aggregate metrics in ISO ms | |
| **interval** | **String**| Time interval for aggregate time slots. | [enum: minute, hour] |
| **deviceId** | [**List&lt;String&gt;**](String.md)| Optionally filter result stats to a specific device(s). Cannot be used in combination with colo param. | [optional] |
| **colo** | **String**| Optionally filter result stats to a Cloudflare colo. Cannot be used in combination with deviceId param. | [optional] |

### Return type

[**DexEndpointsHttpTestDetails200Response**](DexEndpointsHttpTestDetails200Response.md)

### Authorization

[api_key](../README.md#api_key), [api_email](../README.md#api_email)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | DEX HTTP test details response |  -  |
| **4XX** | DEX HTTP test details failure response |  -  |

<a id="dexEndpointsHttpTestPercentiles"></a>
# **dexEndpointsHttpTestPercentiles**
> DexEndpointsHttpTestPercentiles200Response dexEndpointsHttpTestPercentiles(accountId, testId, timeStart, timeEnd, deviceId, colo)

Get percentiles for an http test

Get percentiles for an http test for a given time period between 1 hour and 7 days.

### Example
```java
// Import classes:
import cloudflare.ApiClient;
import cloudflare.ApiException;
import cloudflare.Configuration;
import cloudflare.auth.*;
import cloudflare.models.*;
import cloudflare.sdk.DexSyntheticApplicationMontitoringApi;

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

    DexSyntheticApplicationMontitoringApi apiInstance = new DexSyntheticApplicationMontitoringApi(defaultClient);
    String accountId = "accountId_example"; // String | unique identifier linked to an account in the API request path.
    String testId = "testId_example"; // String | unique identifier for a specific test
    String timeStart = "2023-09-20T17:00:00Z"; // String | Start time for aggregate metrics in ISO format
    String timeEnd = "2023-09-20T17:00:00Z"; // String | End time for aggregate metrics in ISO format
    List<String> deviceId = Arrays.asList(); // List<String> | Optionally filter result stats to a specific device(s). Cannot be used in combination with colo param.
    String colo = "colo_example"; // String | Optionally filter result stats to a Cloudflare colo. Cannot be used in combination with deviceId param.
    try {
      DexEndpointsHttpTestPercentiles200Response result = apiInstance.dexEndpointsHttpTestPercentiles(accountId, testId, timeStart, timeEnd, deviceId, colo);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling DexSyntheticApplicationMontitoringApi#dexEndpointsHttpTestPercentiles");
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
| **accountId** | **String**| unique identifier linked to an account in the API request path. | |
| **testId** | **String**| unique identifier for a specific test | |
| **timeStart** | **String**| Start time for aggregate metrics in ISO format | |
| **timeEnd** | **String**| End time for aggregate metrics in ISO format | |
| **deviceId** | [**List&lt;String&gt;**](String.md)| Optionally filter result stats to a specific device(s). Cannot be used in combination with colo param. | [optional] |
| **colo** | **String**| Optionally filter result stats to a Cloudflare colo. Cannot be used in combination with deviceId param. | [optional] |

### Return type

[**DexEndpointsHttpTestPercentiles200Response**](DexEndpointsHttpTestPercentiles200Response.md)

### Authorization

[api_key](../README.md#api_key), [api_email](../README.md#api_email)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | DEX HTTP test percentiles response |  -  |
| **4XX** | DEX HTTP test percentiles failure response |  -  |

<a id="dexEndpointsListColos"></a>
# **dexEndpointsListColos**
> DexEndpointsListColos200Response dexEndpointsListColos(accountId, timeStart, timeEnd, sortBy)

List Cloudflare colos

List Cloudflare colos that account&#39;s devices were connected to during a time period, sorted by usage starting from the most used colo. Colos without traffic are also returned and sorted alphabetically.

### Example
```java
// Import classes:
import cloudflare.ApiClient;
import cloudflare.ApiException;
import cloudflare.Configuration;
import cloudflare.auth.*;
import cloudflare.models.*;
import cloudflare.sdk.DexSyntheticApplicationMontitoringApi;

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

    DexSyntheticApplicationMontitoringApi apiInstance = new DexSyntheticApplicationMontitoringApi(defaultClient);
    String accountId = "accountId_example"; // String | unique identifier linked to an account in the API request path.
    String timeStart = "2023-08-20T20:45:00Z"; // String | Start time for connection period in RFC3339 (ISO 8601) format.
    String timeEnd = "2023-08-24T20:45:00Z"; // String | End time for connection period in RFC3339 (ISO 8601) format.
    String sortBy = "fleet-status-usage"; // String | Type of usage that colos should be sorted by. If unspecified, returns all Cloudflare colos sorted alphabetically.
    try {
      DexEndpointsListColos200Response result = apiInstance.dexEndpointsListColos(accountId, timeStart, timeEnd, sortBy);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling DexSyntheticApplicationMontitoringApi#dexEndpointsListColos");
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
| **accountId** | **String**| unique identifier linked to an account in the API request path. | |
| **timeStart** | **String**| Start time for connection period in RFC3339 (ISO 8601) format. | |
| **timeEnd** | **String**| End time for connection period in RFC3339 (ISO 8601) format. | |
| **sortBy** | **String**| Type of usage that colos should be sorted by. If unspecified, returns all Cloudflare colos sorted alphabetically. | [optional] [enum: fleet-status-usage, application-tests-usage] |

### Return type

[**DexEndpointsListColos200Response**](DexEndpointsListColos200Response.md)

### Authorization

[api_key](../README.md#api_key), [api_email](../README.md#api_email)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | List colos response |  -  |
| **4XX** | List colos failure response |  -  |

<a id="dexEndpointsListTests"></a>
# **dexEndpointsListTests**
> DexEndpointsListTests200Response dexEndpointsListTests(accountId, colo, testName, deviceId, page, perPage)

List DEX test analytics

List DEX tests

### Example
```java
// Import classes:
import cloudflare.ApiClient;
import cloudflare.ApiException;
import cloudflare.Configuration;
import cloudflare.auth.*;
import cloudflare.models.*;
import cloudflare.sdk.DexSyntheticApplicationMontitoringApi;

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

    DexSyntheticApplicationMontitoringApi apiInstance = new DexSyntheticApplicationMontitoringApi(defaultClient);
    String accountId = "accountId_example"; // String | unique identifier linked to an account in the API request path.
    String colo = "colo_example"; // String | Optionally filter result stats to a Cloudflare colo. Cannot be used in combination with deviceId param.
    String testName = "testName_example"; // String | Optionally filter results by test name
    List<String> deviceId = Arrays.asList(); // List<String> | Optionally filter result stats to a specific device(s). Cannot be used in combination with colo param.
    BigDecimal page = new BigDecimal("1"); // BigDecimal | Page number of paginated results
    BigDecimal perPage = new BigDecimal("10"); // BigDecimal | Number of items per page
    try {
      DexEndpointsListTests200Response result = apiInstance.dexEndpointsListTests(accountId, colo, testName, deviceId, page, perPage);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling DexSyntheticApplicationMontitoringApi#dexEndpointsListTests");
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
| **accountId** | **String**| unique identifier linked to an account in the API request path. | |
| **colo** | **String**| Optionally filter result stats to a Cloudflare colo. Cannot be used in combination with deviceId param. | [optional] |
| **testName** | **String**| Optionally filter results by test name | [optional] |
| **deviceId** | [**List&lt;String&gt;**](String.md)| Optionally filter result stats to a specific device(s). Cannot be used in combination with colo param. | [optional] |
| **page** | **BigDecimal**| Page number of paginated results | [optional] [default to 1] |
| **perPage** | **BigDecimal**| Number of items per page | [optional] [default to 10] |

### Return type

[**DexEndpointsListTests200Response**](DexEndpointsListTests200Response.md)

### Authorization

[api_key](../README.md#api_key), [api_email](../README.md#api_email)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | DEX tests list response |  -  |
| **4XX** | List DEX tests failure response |  -  |

<a id="dexEndpointsTestsUniqueDevices"></a>
# **dexEndpointsTestsUniqueDevices**
> DexEndpointsTestsUniqueDevices200Response dexEndpointsTestsUniqueDevices(accountId, testName, deviceId)

Get count of devices targeted

Returns unique count of devices that have run synthetic application monitoring tests in the past 7 days.

### Example
```java
// Import classes:
import cloudflare.ApiClient;
import cloudflare.ApiException;
import cloudflare.Configuration;
import cloudflare.auth.*;
import cloudflare.models.*;
import cloudflare.sdk.DexSyntheticApplicationMontitoringApi;

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

    DexSyntheticApplicationMontitoringApi apiInstance = new DexSyntheticApplicationMontitoringApi(defaultClient);
    String accountId = "accountId_example"; // String | unique identifier linked to an account in the API request path.
    String testName = "testName_example"; // String | Optionally filter results by test name
    List<String> deviceId = Arrays.asList(); // List<String> | Optionally filter result stats to a specific device(s). Cannot be used in combination with colo param.
    try {
      DexEndpointsTestsUniqueDevices200Response result = apiInstance.dexEndpointsTestsUniqueDevices(accountId, testName, deviceId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling DexSyntheticApplicationMontitoringApi#dexEndpointsTestsUniqueDevices");
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
| **accountId** | **String**| unique identifier linked to an account in the API request path. | |
| **testName** | **String**| Optionally filter results by test name | [optional] |
| **deviceId** | [**List&lt;String&gt;**](String.md)| Optionally filter result stats to a specific device(s). Cannot be used in combination with colo param. | [optional] |

### Return type

[**DexEndpointsTestsUniqueDevices200Response**](DexEndpointsTestsUniqueDevices200Response.md)

### Authorization

[api_key](../README.md#api_key), [api_email](../README.md#api_email)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | DEX unique devices targeted response |  -  |
| **4XX** | DEX unique devices targeted failure response |  -  |

<a id="dexEndpointsTracerouteTestDetails"></a>
# **dexEndpointsTracerouteTestDetails**
> DexEndpointsTracerouteTestDetails200Response dexEndpointsTracerouteTestDetails(accountId, testId, timeStart, timeEnd, interval, deviceId, colo)

Get details and aggregate metrics for a traceroute test

Get test details and aggregate performance metrics for an traceroute test for a given time period between 1 hour and 7 days.

### Example
```java
// Import classes:
import cloudflare.ApiClient;
import cloudflare.ApiException;
import cloudflare.Configuration;
import cloudflare.auth.*;
import cloudflare.models.*;
import cloudflare.sdk.DexSyntheticApplicationMontitoringApi;

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

    DexSyntheticApplicationMontitoringApi apiInstance = new DexSyntheticApplicationMontitoringApi(defaultClient);
    String accountId = "accountId_example"; // String | Unique identifier linked to an account
    String testId = "testId_example"; // String | Unique identifier for a specific test
    String timeStart = "1689520412000"; // String | Start time for aggregate metrics in ISO ms
    String timeEnd = "1689606812000"; // String | End time for aggregate metrics in ISO ms
    String interval = "minute"; // String | Time interval for aggregate time slots.
    List<String> deviceId = Arrays.asList(); // List<String> | Optionally filter result stats to a specific device(s). Cannot be used in combination with colo param.
    String colo = "colo_example"; // String | Optionally filter result stats to a Cloudflare colo. Cannot be used in combination with deviceId param.
    try {
      DexEndpointsTracerouteTestDetails200Response result = apiInstance.dexEndpointsTracerouteTestDetails(accountId, testId, timeStart, timeEnd, interval, deviceId, colo);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling DexSyntheticApplicationMontitoringApi#dexEndpointsTracerouteTestDetails");
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
| **accountId** | **String**| Unique identifier linked to an account | |
| **testId** | **String**| Unique identifier for a specific test | |
| **timeStart** | **String**| Start time for aggregate metrics in ISO ms | |
| **timeEnd** | **String**| End time for aggregate metrics in ISO ms | |
| **interval** | **String**| Time interval for aggregate time slots. | [enum: minute, hour] |
| **deviceId** | [**List&lt;String&gt;**](String.md)| Optionally filter result stats to a specific device(s). Cannot be used in combination with colo param. | [optional] |
| **colo** | **String**| Optionally filter result stats to a Cloudflare colo. Cannot be used in combination with deviceId param. | [optional] |

### Return type

[**DexEndpointsTracerouteTestDetails200Response**](DexEndpointsTracerouteTestDetails200Response.md)

### Authorization

[api_key](../README.md#api_key), [api_email](../README.md#api_email)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | DEX traceroute test details response |  -  |
| **4XX** | DEX traceroute test details response failure response |  -  |

<a id="dexEndpointsTracerouteTestNetworkPath"></a>
# **dexEndpointsTracerouteTestNetworkPath**
> DexEndpointsTracerouteTestNetworkPath200Response dexEndpointsTracerouteTestNetworkPath(accountId, testId, deviceId, timeStart, timeEnd, interval)

Get network path breakdown for a traceroute test

Get a breakdown of metrics by hop for individual traceroute test runs

### Example
```java
// Import classes:
import cloudflare.ApiClient;
import cloudflare.ApiException;
import cloudflare.Configuration;
import cloudflare.auth.*;
import cloudflare.models.*;
import cloudflare.sdk.DexSyntheticApplicationMontitoringApi;

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

    DexSyntheticApplicationMontitoringApi apiInstance = new DexSyntheticApplicationMontitoringApi(defaultClient);
    String accountId = "accountId_example"; // String | unique identifier linked to an account
    String testId = "testId_example"; // String | unique identifier for a specific test
    String deviceId = "deviceId_example"; // String | Device to filter tracroute result runs to
    String timeStart = "1689520412000"; // String | Start time for aggregate metrics in ISO ms
    String timeEnd = "1689606812000"; // String | End time for aggregate metrics in ISO ms
    String interval = "minute"; // String | Time interval for aggregate time slots.
    try {
      DexEndpointsTracerouteTestNetworkPath200Response result = apiInstance.dexEndpointsTracerouteTestNetworkPath(accountId, testId, deviceId, timeStart, timeEnd, interval);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling DexSyntheticApplicationMontitoringApi#dexEndpointsTracerouteTestNetworkPath");
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
| **accountId** | **String**| unique identifier linked to an account | |
| **testId** | **String**| unique identifier for a specific test | |
| **deviceId** | **String**| Device to filter tracroute result runs to | |
| **timeStart** | **String**| Start time for aggregate metrics in ISO ms | |
| **timeEnd** | **String**| End time for aggregate metrics in ISO ms | |
| **interval** | **String**| Time interval for aggregate time slots. | [enum: minute, hour] |

### Return type

[**DexEndpointsTracerouteTestNetworkPath200Response**](DexEndpointsTracerouteTestNetworkPath200Response.md)

### Authorization

[api_key](../README.md#api_key), [api_email](../README.md#api_email)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | DEX traceroute test network path response |  -  |
| **4XX** | DEX traceroute test network path failure response |  -  |

<a id="dexEndpointsTracerouteTestPercentiles"></a>
# **dexEndpointsTracerouteTestPercentiles**
> DexEndpointsTracerouteTestPercentiles200Response dexEndpointsTracerouteTestPercentiles(accountId, testId, timeStart, timeEnd, deviceId, colo)

Get percentiles for a traceroute test

Get percentiles for a traceroute test for a given time period between 1 hour and 7 days.

### Example
```java
// Import classes:
import cloudflare.ApiClient;
import cloudflare.ApiException;
import cloudflare.Configuration;
import cloudflare.auth.*;
import cloudflare.models.*;
import cloudflare.sdk.DexSyntheticApplicationMontitoringApi;

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

    DexSyntheticApplicationMontitoringApi apiInstance = new DexSyntheticApplicationMontitoringApi(defaultClient);
    String accountId = "accountId_example"; // String | unique identifier linked to an account in the API request path.
    String testId = "testId_example"; // String | unique identifier for a specific test
    String timeStart = "2023-09-20T17:00:00Z"; // String | Start time for aggregate metrics in ISO format
    String timeEnd = "2023-09-20T17:00:00Z"; // String | End time for aggregate metrics in ISO format
    List<String> deviceId = Arrays.asList(); // List<String> | Optionally filter result stats to a specific device(s). Cannot be used in combination with colo param.
    String colo = "colo_example"; // String | Optionally filter result stats to a Cloudflare colo. Cannot be used in combination with deviceId param.
    try {
      DexEndpointsTracerouteTestPercentiles200Response result = apiInstance.dexEndpointsTracerouteTestPercentiles(accountId, testId, timeStart, timeEnd, deviceId, colo);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling DexSyntheticApplicationMontitoringApi#dexEndpointsTracerouteTestPercentiles");
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
| **accountId** | **String**| unique identifier linked to an account in the API request path. | |
| **testId** | **String**| unique identifier for a specific test | |
| **timeStart** | **String**| Start time for aggregate metrics in ISO format | |
| **timeEnd** | **String**| End time for aggregate metrics in ISO format | |
| **deviceId** | [**List&lt;String&gt;**](String.md)| Optionally filter result stats to a specific device(s). Cannot be used in combination with colo param. | [optional] |
| **colo** | **String**| Optionally filter result stats to a Cloudflare colo. Cannot be used in combination with deviceId param. | [optional] |

### Return type

[**DexEndpointsTracerouteTestPercentiles200Response**](DexEndpointsTracerouteTestPercentiles200Response.md)

### Authorization

[api_key](../README.md#api_key), [api_email](../README.md#api_email)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | DEX Traceroute test percentiles response |  -  |
| **4XX** | DEX Traceroute test percentiles failure response |  -  |

<a id="dexEndpointsTracerouteTestResultNetworkPath"></a>
# **dexEndpointsTracerouteTestResultNetworkPath**
> DexEndpointsTracerouteTestResultNetworkPath200Response dexEndpointsTracerouteTestResultNetworkPath(accountId, testResultId)

Get details for a specific traceroute test run

Get a breakdown of hops and performance metrics for a specific traceroute test run

### Example
```java
// Import classes:
import cloudflare.ApiClient;
import cloudflare.ApiException;
import cloudflare.Configuration;
import cloudflare.auth.*;
import cloudflare.models.*;
import cloudflare.sdk.DexSyntheticApplicationMontitoringApi;

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

    DexSyntheticApplicationMontitoringApi apiInstance = new DexSyntheticApplicationMontitoringApi(defaultClient);
    String accountId = "accountId_example"; // String | unique identifier linked to an account
    String testResultId = "testResultId_example"; // String | unique identifier for a specific traceroute test
    try {
      DexEndpointsTracerouteTestResultNetworkPath200Response result = apiInstance.dexEndpointsTracerouteTestResultNetworkPath(accountId, testResultId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling DexSyntheticApplicationMontitoringApi#dexEndpointsTracerouteTestResultNetworkPath");
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
| **accountId** | **String**| unique identifier linked to an account | |
| **testResultId** | **String**| unique identifier for a specific traceroute test | |

### Return type

[**DexEndpointsTracerouteTestResultNetworkPath200Response**](DexEndpointsTracerouteTestResultNetworkPath200Response.md)

### Authorization

[api_key](../README.md#api_key), [api_email](../README.md#api_email)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | DEX traceroute test result network path response |  -  |
| **4XX** | DEX traceroute test result network path failure response |  -  |

<a id="dexFleetStatusDevices"></a>
# **dexFleetStatusDevices**
> DigitalExperienceMonitoringFleetStatusDevicesResponse dexFleetStatusDevices(accountId, timeEnd, timeStart, page, perPage, sortBy, colo, deviceId, mode, status, platform, version)

List fleet status devices

List details for devices using WARP

### Example
```java
// Import classes:
import cloudflare.ApiClient;
import cloudflare.ApiException;
import cloudflare.Configuration;
import cloudflare.auth.*;
import cloudflare.models.*;
import cloudflare.sdk.DexSyntheticApplicationMontitoringApi;

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

    DexSyntheticApplicationMontitoringApi apiInstance = new DexSyntheticApplicationMontitoringApi(defaultClient);
    String accountId = "accountId_example"; // String | 
    String timeEnd = "timeEnd_example"; // String | 
    String timeStart = "timeStart_example"; // String | 
    BigDecimal page = new BigDecimal("1"); // BigDecimal | 
    BigDecimal perPage = new BigDecimal(78); // BigDecimal | 
    DigitalExperienceMonitoringSortBy sortBy = DigitalExperienceMonitoringSortBy.fromValue("colo"); // DigitalExperienceMonitoringSortBy | 
    String colo = "colo_example"; // String | 
    String deviceId = "deviceId_example"; // String | 
    String mode = "mode_example"; // String | 
    String status = "status_example"; // String | 
    String platform = "platform_example"; // String | 
    String version = "version_example"; // String | 
    try {
      DigitalExperienceMonitoringFleetStatusDevicesResponse result = apiInstance.dexFleetStatusDevices(accountId, timeEnd, timeStart, page, perPage, sortBy, colo, deviceId, mode, status, platform, version);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling DexSyntheticApplicationMontitoringApi#dexFleetStatusDevices");
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
| **timeEnd** | **String**|  | |
| **timeStart** | **String**|  | |
| **page** | **BigDecimal**|  | [default to 1] |
| **perPage** | **BigDecimal**|  | |
| **sortBy** | [**DigitalExperienceMonitoringSortBy**](.md)|  | [optional] [default to timestamp] [enum: colo, device_id, mode, platform, status, timestamp, version] |
| **colo** | **String**|  | [optional] |
| **deviceId** | **String**|  | [optional] |
| **mode** | **String**|  | [optional] |
| **status** | **String**|  | [optional] |
| **platform** | **String**|  | [optional] |
| **version** | **String**|  | [optional] |

### Return type

[**DigitalExperienceMonitoringFleetStatusDevicesResponse**](DigitalExperienceMonitoringFleetStatusDevicesResponse.md)

### Authorization

[api_key](../README.md#api_key), [api_email](../README.md#api_email)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | List devices response |  -  |
| **4xx** | List devices response failure |  -  |

<a id="dexFleetStatusLive"></a>
# **dexFleetStatusLive**
> DigitalExperienceMonitoringFleetStatusLiveResponse dexFleetStatusLive(accountId, sinceMinutes)

List fleet status details by dimension

List details for live (up to 60 minutes) devices using WARP

### Example
```java
// Import classes:
import cloudflare.ApiClient;
import cloudflare.ApiException;
import cloudflare.Configuration;
import cloudflare.auth.*;
import cloudflare.models.*;
import cloudflare.sdk.DexSyntheticApplicationMontitoringApi;

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

    DexSyntheticApplicationMontitoringApi apiInstance = new DexSyntheticApplicationMontitoringApi(defaultClient);
    String accountId = "accountId_example"; // String | 
    BigDecimal sinceMinutes = new BigDecimal("10"); // BigDecimal | 
    try {
      DigitalExperienceMonitoringFleetStatusLiveResponse result = apiInstance.dexFleetStatusLive(accountId, sinceMinutes);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling DexSyntheticApplicationMontitoringApi#dexFleetStatusLive");
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
| **sinceMinutes** | **BigDecimal**|  | [default to 10] |

### Return type

[**DigitalExperienceMonitoringFleetStatusLiveResponse**](DigitalExperienceMonitoringFleetStatusLiveResponse.md)

### Authorization

[api_key](../README.md#api_key), [api_email](../README.md#api_email)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | List device details (live) response |  -  |
| **4xx** | List device details (live) response failure |  -  |

<a id="dexFleetStatusOverTime"></a>
# **dexFleetStatusOverTime**
> dexFleetStatusOverTime(accountId, timeEnd, timeStart, colo, deviceId)

List fleet status aggregate details by dimension

List details for devices using WARP, up to 7 days

### Example
```java
// Import classes:
import cloudflare.ApiClient;
import cloudflare.ApiException;
import cloudflare.Configuration;
import cloudflare.auth.*;
import cloudflare.models.*;
import cloudflare.sdk.DexSyntheticApplicationMontitoringApi;

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

    DexSyntheticApplicationMontitoringApi apiInstance = new DexSyntheticApplicationMontitoringApi(defaultClient);
    String accountId = "accountId_example"; // String | 
    String timeEnd = "timeEnd_example"; // String | 
    String timeStart = "timeStart_example"; // String | 
    String colo = "colo_example"; // String | 
    String deviceId = "deviceId_example"; // String | 
    try {
      apiInstance.dexFleetStatusOverTime(accountId, timeEnd, timeStart, colo, deviceId);
    } catch (ApiException e) {
      System.err.println("Exception when calling DexSyntheticApplicationMontitoringApi#dexFleetStatusOverTime");
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
| **timeEnd** | **String**|  | |
| **timeStart** | **String**|  | |
| **colo** | **String**|  | [optional] |
| **deviceId** | **String**|  | [optional] |

### Return type

null (empty response body)

### Authorization

[api_key](../README.md#api_key), [api_email](../README.md#api_email)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | List DEX devices response |  -  |
| **4xx** | DEX HTTP test details failure response |  -  |

