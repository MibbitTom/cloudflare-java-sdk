# ObservatoryApi

All URIs are relative to *https://api.cloudflare.com/client/v4*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**speedCreateScheduledTest**](ObservatoryApi.md#speedCreateScheduledTest) | **POST** /zones/{zone_id}/speed_api/schedule/{url} | Create scheduled page test |
| [**speedCreateTest**](ObservatoryApi.md#speedCreateTest) | **POST** /zones/{zone_id}/speed_api/pages/{url}/tests | Start page test |
| [**speedDeleteTestSchedule**](ObservatoryApi.md#speedDeleteTestSchedule) | **DELETE** /zones/{zone_id}/speed_api/schedule/{url} | Delete scheduled page test |
| [**speedDeleteTests**](ObservatoryApi.md#speedDeleteTests) | **DELETE** /zones/{zone_id}/speed_api/pages/{url}/tests | Delete all page tests |
| [**speedGetAvailabilities**](ObservatoryApi.md#speedGetAvailabilities) | **GET** /zones/{zone_id}/speed_api/availabilities | Get quota and availability |
| [**speedGetScheduledTest**](ObservatoryApi.md#speedGetScheduledTest) | **GET** /zones/{zone_id}/speed_api/schedule/{url} | Get a page test schedule |
| [**speedGetTest**](ObservatoryApi.md#speedGetTest) | **GET** /zones/{zone_id}/speed_api/pages/{url}/tests/{test_id} | Get a page test result |
| [**speedListPageTrend**](ObservatoryApi.md#speedListPageTrend) | **GET** /zones/{zone_id}/speed_api/pages/{url}/trend | List core web vital metrics trend |
| [**speedListPages**](ObservatoryApi.md#speedListPages) | **GET** /zones/{zone_id}/speed_api/pages | List tested webpages |
| [**speedListTestHistory**](ObservatoryApi.md#speedListTestHistory) | **GET** /zones/{zone_id}/speed_api/pages/{url}/tests | List page test history |


<a id="speedCreateScheduledTest"></a>
# **speedCreateScheduledTest**
> ObservatoryCreateScheduleResponse speedCreateScheduledTest(zoneId, url, region)

Create scheduled page test

Creates a scheduled test for a page.

### Example
```java
// Import classes:
import cloudflare.ApiClient;
import cloudflare.ApiException;
import cloudflare.Configuration;
import cloudflare.auth.*;
import cloudflare.models.*;
import cloudflare.sdk.ObservatoryApi;

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

    ObservatoryApi apiInstance = new ObservatoryApi(defaultClient);
    String zoneId = "zoneId_example"; // String | 
    String url = "url_example"; // String | 
    ObservatoryRegion region = ObservatoryRegion.fromValue("asia-east1"); // ObservatoryRegion | 
    try {
      ObservatoryCreateScheduleResponse result = apiInstance.speedCreateScheduledTest(zoneId, url, region);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ObservatoryApi#speedCreateScheduledTest");
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
| **url** | **String**|  | |
| **region** | [**ObservatoryRegion**](.md)|  | [optional] [enum: asia-east1, asia-northeast1, asia-northeast2, asia-south1, asia-southeast1, australia-southeast1, europe-north1, europe-southwest1, europe-west1, europe-west2, europe-west3, europe-west4, europe-west8, europe-west9, me-west1, southamerica-east1, us-central1, us-east1, us-east4, us-south1, us-west1] |

### Return type

[**ObservatoryCreateScheduleResponse**](ObservatoryCreateScheduleResponse.md)

### Authorization

[api_key](../README.md#api_key), [api_email](../README.md#api_email)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Page test schedule |  -  |
| **4XX** | Failure response |  -  |

<a id="speedCreateTest"></a>
# **speedCreateTest**
> ObservatoryPageTestResponseSingle speedCreateTest(zoneId, url, speedCreateTestRequest)

Start page test

Starts a test for a specific webpage, in a specific region.

### Example
```java
// Import classes:
import cloudflare.ApiClient;
import cloudflare.ApiException;
import cloudflare.Configuration;
import cloudflare.auth.*;
import cloudflare.models.*;
import cloudflare.sdk.ObservatoryApi;

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

    ObservatoryApi apiInstance = new ObservatoryApi(defaultClient);
    String zoneId = "zoneId_example"; // String | 
    String url = "url_example"; // String | 
    SpeedCreateTestRequest speedCreateTestRequest = new SpeedCreateTestRequest(); // SpeedCreateTestRequest | 
    try {
      ObservatoryPageTestResponseSingle result = apiInstance.speedCreateTest(zoneId, url, speedCreateTestRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ObservatoryApi#speedCreateTest");
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
| **url** | **String**|  | |
| **speedCreateTestRequest** | [**SpeedCreateTestRequest**](SpeedCreateTestRequest.md)|  | [optional] |

### Return type

[**ObservatoryPageTestResponseSingle**](ObservatoryPageTestResponseSingle.md)

### Authorization

[api_key](../README.md#api_key), [api_email](../README.md#api_email)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Page test details |  -  |
| **4XX** | Failure response |  -  |

<a id="speedDeleteTestSchedule"></a>
# **speedDeleteTestSchedule**
> ObservatoryCountResponse speedDeleteTestSchedule(zoneId, url, region)

Delete scheduled page test

Deletes a scheduled test for a page.

### Example
```java
// Import classes:
import cloudflare.ApiClient;
import cloudflare.ApiException;
import cloudflare.Configuration;
import cloudflare.auth.*;
import cloudflare.models.*;
import cloudflare.sdk.ObservatoryApi;

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

    ObservatoryApi apiInstance = new ObservatoryApi(defaultClient);
    String zoneId = "zoneId_example"; // String | 
    String url = "url_example"; // String | 
    ObservatoryRegion region = ObservatoryRegion.fromValue("asia-east1"); // ObservatoryRegion | 
    try {
      ObservatoryCountResponse result = apiInstance.speedDeleteTestSchedule(zoneId, url, region);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ObservatoryApi#speedDeleteTestSchedule");
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
| **url** | **String**|  | |
| **region** | [**ObservatoryRegion**](.md)|  | [optional] [enum: asia-east1, asia-northeast1, asia-northeast2, asia-south1, asia-southeast1, australia-southeast1, europe-north1, europe-southwest1, europe-west1, europe-west2, europe-west3, europe-west4, europe-west8, europe-west9, me-west1, southamerica-east1, us-central1, us-east1, us-east4, us-south1, us-west1] |

### Return type

[**ObservatoryCountResponse**](ObservatoryCountResponse.md)

### Authorization

[api_key](../README.md#api_key), [api_email](../README.md#api_email)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Number of deleted tests |  -  |
| **4XX** | Failure response |  -  |

<a id="speedDeleteTests"></a>
# **speedDeleteTests**
> ObservatoryCountResponse speedDeleteTests(zoneId, url, region)

Delete all page tests

Deletes all tests for a specific webpage from a specific region. Deleted tests are still counted as part of the quota.

### Example
```java
// Import classes:
import cloudflare.ApiClient;
import cloudflare.ApiException;
import cloudflare.Configuration;
import cloudflare.auth.*;
import cloudflare.models.*;
import cloudflare.sdk.ObservatoryApi;

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

    ObservatoryApi apiInstance = new ObservatoryApi(defaultClient);
    String zoneId = "zoneId_example"; // String | 
    String url = "url_example"; // String | 
    ObservatoryRegion region = ObservatoryRegion.fromValue("asia-east1"); // ObservatoryRegion | 
    try {
      ObservatoryCountResponse result = apiInstance.speedDeleteTests(zoneId, url, region);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ObservatoryApi#speedDeleteTests");
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
| **url** | **String**|  | |
| **region** | [**ObservatoryRegion**](.md)|  | [optional] [enum: asia-east1, asia-northeast1, asia-northeast2, asia-south1, asia-southeast1, australia-southeast1, europe-north1, europe-southwest1, europe-west1, europe-west2, europe-west3, europe-west4, europe-west8, europe-west9, me-west1, southamerica-east1, us-central1, us-east1, us-east4, us-south1, us-west1] |

### Return type

[**ObservatoryCountResponse**](ObservatoryCountResponse.md)

### Authorization

[api_key](../README.md#api_key), [api_email](../README.md#api_email)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Number of deleted tests |  -  |
| **4XX** | Failure response |  -  |

<a id="speedGetAvailabilities"></a>
# **speedGetAvailabilities**
> ObservatoryAvailabilitiesResponse speedGetAvailabilities(zoneId)

Get quota and availability

Retrieves quota for all plans, as well as the current zone quota.

### Example
```java
// Import classes:
import cloudflare.ApiClient;
import cloudflare.ApiException;
import cloudflare.Configuration;
import cloudflare.auth.*;
import cloudflare.models.*;
import cloudflare.sdk.ObservatoryApi;

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

    ObservatoryApi apiInstance = new ObservatoryApi(defaultClient);
    String zoneId = "zoneId_example"; // String | 
    try {
      ObservatoryAvailabilitiesResponse result = apiInstance.speedGetAvailabilities(zoneId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ObservatoryApi#speedGetAvailabilities");
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

[**ObservatoryAvailabilitiesResponse**](ObservatoryAvailabilitiesResponse.md)

### Authorization

[api_key](../README.md#api_key), [api_email](../README.md#api_email)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Page test availability |  -  |
| **4XX** | Failure response |  -  |

<a id="speedGetScheduledTest"></a>
# **speedGetScheduledTest**
> ObservatoryScheduleResponseSingle speedGetScheduledTest(zoneId, url, region)

Get a page test schedule

Retrieves the test schedule for a page in a specific region.

### Example
```java
// Import classes:
import cloudflare.ApiClient;
import cloudflare.ApiException;
import cloudflare.Configuration;
import cloudflare.auth.*;
import cloudflare.models.*;
import cloudflare.sdk.ObservatoryApi;

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

    ObservatoryApi apiInstance = new ObservatoryApi(defaultClient);
    String zoneId = "zoneId_example"; // String | 
    String url = "url_example"; // String | 
    ObservatoryRegion region = ObservatoryRegion.fromValue("asia-east1"); // ObservatoryRegion | 
    try {
      ObservatoryScheduleResponseSingle result = apiInstance.speedGetScheduledTest(zoneId, url, region);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ObservatoryApi#speedGetScheduledTest");
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
| **url** | **String**|  | |
| **region** | [**ObservatoryRegion**](.md)|  | [optional] [enum: asia-east1, asia-northeast1, asia-northeast2, asia-south1, asia-southeast1, australia-southeast1, europe-north1, europe-southwest1, europe-west1, europe-west2, europe-west3, europe-west4, europe-west8, europe-west9, me-west1, southamerica-east1, us-central1, us-east1, us-east4, us-south1, us-west1] |

### Return type

[**ObservatoryScheduleResponseSingle**](ObservatoryScheduleResponseSingle.md)

### Authorization

[api_key](../README.md#api_key), [api_email](../README.md#api_email)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Page test schedule |  -  |
| **4XX** | Failure response |  -  |

<a id="speedGetTest"></a>
# **speedGetTest**
> ObservatoryPageTestResponseSingle speedGetTest(zoneId, url, testId)

Get a page test result

Retrieves the result of a specific test.

### Example
```java
// Import classes:
import cloudflare.ApiClient;
import cloudflare.ApiException;
import cloudflare.Configuration;
import cloudflare.auth.*;
import cloudflare.models.*;
import cloudflare.sdk.ObservatoryApi;

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

    ObservatoryApi apiInstance = new ObservatoryApi(defaultClient);
    String zoneId = "zoneId_example"; // String | 
    String url = "url_example"; // String | 
    String testId = "testId_example"; // String | 
    try {
      ObservatoryPageTestResponseSingle result = apiInstance.speedGetTest(zoneId, url, testId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ObservatoryApi#speedGetTest");
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
| **url** | **String**|  | |
| **testId** | **String**|  | |

### Return type

[**ObservatoryPageTestResponseSingle**](ObservatoryPageTestResponseSingle.md)

### Authorization

[api_key](../README.md#api_key), [api_email](../README.md#api_email)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Page test result |  -  |
| **4XX** | Failure response |  -  |

<a id="speedListPageTrend"></a>
# **speedListPageTrend**
> ObservatoryTrendResponse speedListPageTrend(zoneId, url, region, deviceType, start, tz, metrics, end)

List core web vital metrics trend

Lists the core web vital metrics trend over time for a specific page.

### Example
```java
// Import classes:
import cloudflare.ApiClient;
import cloudflare.ApiException;
import cloudflare.Configuration;
import cloudflare.auth.*;
import cloudflare.models.*;
import cloudflare.sdk.ObservatoryApi;

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

    ObservatoryApi apiInstance = new ObservatoryApi(defaultClient);
    String zoneId = "zoneId_example"; // String | 
    String url = "url_example"; // String | 
    ObservatoryRegion region = ObservatoryRegion.fromValue("asia-east1"); // ObservatoryRegion | 
    ObservatoryDeviceType deviceType = ObservatoryDeviceType.fromValue("DESKTOP"); // ObservatoryDeviceType | 
    OffsetDateTime start = OffsetDateTime.now(); // OffsetDateTime | 
    String tz = "America/Chicago"; // String | The timezone of the start and end timestamps.
    String metrics = "performanceScore,ttfb,fcp,si,lcp,tti,tbt,cls"; // String | A comma-separated list of metrics to include in the results.
    OffsetDateTime end = OffsetDateTime.now(); // OffsetDateTime | 
    try {
      ObservatoryTrendResponse result = apiInstance.speedListPageTrend(zoneId, url, region, deviceType, start, tz, metrics, end);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ObservatoryApi#speedListPageTrend");
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
| **url** | **String**|  | |
| **region** | [**ObservatoryRegion**](.md)|  | [enum: asia-east1, asia-northeast1, asia-northeast2, asia-south1, asia-southeast1, australia-southeast1, europe-north1, europe-southwest1, europe-west1, europe-west2, europe-west3, europe-west4, europe-west8, europe-west9, me-west1, southamerica-east1, us-central1, us-east1, us-east4, us-south1, us-west1] |
| **deviceType** | [**ObservatoryDeviceType**](.md)|  | [enum: DESKTOP, MOBILE] |
| **start** | **OffsetDateTime**|  | |
| **tz** | **String**| The timezone of the start and end timestamps. | |
| **metrics** | **String**| A comma-separated list of metrics to include in the results. | |
| **end** | **OffsetDateTime**|  | [optional] |

### Return type

[**ObservatoryTrendResponse**](ObservatoryTrendResponse.md)

### Authorization

[api_key](../README.md#api_key), [api_email](../README.md#api_email)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Page trend |  -  |
| **4XX** | Failure response |  -  |

<a id="speedListPages"></a>
# **speedListPages**
> ObservatoryPagesResponseCollection speedListPages(zoneId)

List tested webpages

Lists all webpages which have been tested.

### Example
```java
// Import classes:
import cloudflare.ApiClient;
import cloudflare.ApiException;
import cloudflare.Configuration;
import cloudflare.auth.*;
import cloudflare.models.*;
import cloudflare.sdk.ObservatoryApi;

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

    ObservatoryApi apiInstance = new ObservatoryApi(defaultClient);
    String zoneId = "zoneId_example"; // String | 
    try {
      ObservatoryPagesResponseCollection result = apiInstance.speedListPages(zoneId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ObservatoryApi#speedListPages");
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

[**ObservatoryPagesResponseCollection**](ObservatoryPagesResponseCollection.md)

### Authorization

[api_key](../README.md#api_key), [api_email](../README.md#api_email)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | List of pages |  -  |
| **4XX** | Failure response |  -  |

<a id="speedListTestHistory"></a>
# **speedListTestHistory**
> ObservatoryPageTestResponseCollection speedListTestHistory(zoneId, url, page, perPage, region)

List page test history

Test history (list of tests) for a specific webpage.

### Example
```java
// Import classes:
import cloudflare.ApiClient;
import cloudflare.ApiException;
import cloudflare.Configuration;
import cloudflare.auth.*;
import cloudflare.models.*;
import cloudflare.sdk.ObservatoryApi;

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

    ObservatoryApi apiInstance = new ObservatoryApi(defaultClient);
    String zoneId = "zoneId_example"; // String | 
    String url = "url_example"; // String | 
    Integer page = 1; // Integer | 
    Integer perPage = 20; // Integer | 
    ObservatoryRegion region = ObservatoryRegion.fromValue("asia-east1"); // ObservatoryRegion | 
    try {
      ObservatoryPageTestResponseCollection result = apiInstance.speedListTestHistory(zoneId, url, page, perPage, region);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ObservatoryApi#speedListTestHistory");
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
| **url** | **String**|  | |
| **page** | **Integer**|  | [optional] |
| **perPage** | **Integer**|  | [optional] |
| **region** | [**ObservatoryRegion**](.md)|  | [optional] [enum: asia-east1, asia-northeast1, asia-northeast2, asia-south1, asia-southeast1, australia-southeast1, europe-north1, europe-southwest1, europe-west1, europe-west2, europe-west3, europe-west4, europe-west8, europe-west9, me-west1, southamerica-east1, us-central1, us-east1, us-east4, us-south1, us-west1] |

### Return type

[**ObservatoryPageTestResponseCollection**](ObservatoryPageTestResponseCollection.md)

### Authorization

[api_key](../README.md#api_key), [api_email](../README.md#api_email)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | List of test history for a page |  -  |
| **4XX** | Failure response |  -  |

