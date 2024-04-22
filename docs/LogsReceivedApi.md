# LogsReceivedApi

All URIs are relative to *https://api.cloudflare.com/client/v4*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**logsReceivedGetLogRetentionFlag**](LogsReceivedApi.md#logsReceivedGetLogRetentionFlag) | **GET** /zones/{zone_identifier}/logs/control/retention/flag | Get log retention flag |
| [**logsReceivedGetLogsRayIDs**](LogsReceivedApi.md#logsReceivedGetLogsRayIDs) | **GET** /zones/{zone_identifier}/logs/rayids/{ray_identifier} | Get logs RayIDs |
| [**logsReceivedGetLogsReceived**](LogsReceivedApi.md#logsReceivedGetLogsReceived) | **GET** /zones/{zone_identifier}/logs/received | Get logs received |
| [**logsReceivedListFields**](LogsReceivedApi.md#logsReceivedListFields) | **GET** /zones/{zone_identifier}/logs/received/fields | List fields |
| [**logsReceivedUpdateLogRetentionFlag**](LogsReceivedApi.md#logsReceivedUpdateLogRetentionFlag) | **POST** /zones/{zone_identifier}/logs/control/retention/flag | Update log retention flag |


<a id="logsReceivedGetLogRetentionFlag"></a>
# **logsReceivedGetLogRetentionFlag**
> DataZoneAnalyticsApiFlagResponse logsReceivedGetLogRetentionFlag(zoneIdentifier)

Get log retention flag

Gets log retention flag for Logpull API.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.LogsReceivedApi;

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

    LogsReceivedApi apiInstance = new LogsReceivedApi(defaultClient);
    String zoneIdentifier = "zoneIdentifier_example"; // String | 
    try {
      DataZoneAnalyticsApiFlagResponse result = apiInstance.logsReceivedGetLogRetentionFlag(zoneIdentifier);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling LogsReceivedApi#logsReceivedGetLogRetentionFlag");
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
| **zoneIdentifier** | **String**|  | |

### Return type

[**DataZoneAnalyticsApiFlagResponse**](DataZoneAnalyticsApiFlagResponse.md)

### Authorization

[api_key](../README.md#api_key), [api_token](../README.md#api_token), [api_email](../README.md#api_email)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Get log retention flag response |  -  |
| **4XX** | Get log retention flag response failure |  -  |

<a id="logsReceivedGetLogsRayIDs"></a>
# **logsReceivedGetLogsRayIDs**
> DataZoneAnalyticsApiLogs logsReceivedGetLogsRayIDs(rayIdentifier, zoneIdentifier, timestamps, fields)

Get logs RayIDs

The &#x60;/rayids&#x60; api route allows lookups by specific rayid. The rayids route will return zero, one, or more records (ray ids are not unique).

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.LogsReceivedApi;

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

    LogsReceivedApi apiInstance = new LogsReceivedApi(defaultClient);
    String rayIdentifier = "rayIdentifier_example"; // String | 
    String zoneIdentifier = "zoneIdentifier_example"; // String | 
    DataZoneAnalyticsApiTimestamps timestamps = DataZoneAnalyticsApiTimestamps.fromValue("unix"); // DataZoneAnalyticsApiTimestamps | 
    String fields = "ClientIP,RayID,EdgeStartTimestamp"; // String | 
    try {
      DataZoneAnalyticsApiLogs result = apiInstance.logsReceivedGetLogsRayIDs(rayIdentifier, zoneIdentifier, timestamps, fields);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling LogsReceivedApi#logsReceivedGetLogsRayIDs");
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
| **rayIdentifier** | **String**|  | |
| **zoneIdentifier** | **String**|  | |
| **timestamps** | [**DataZoneAnalyticsApiTimestamps**](.md)|  | [optional] [default to unixnano] [enum: unix, unixnano, rfc3339] |
| **fields** | **String**|  | [optional] |

### Return type

[**DataZoneAnalyticsApiLogs**](DataZoneAnalyticsApiLogs.md)

### Authorization

[api_key](../README.md#api_key), [api_token](../README.md#api_token), [api_email](../README.md#api_email)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Get logs RayIDs response |  -  |
| **4XX** | Get logs RayIDs response failure |  -  |

<a id="logsReceivedGetLogsReceived"></a>
# **logsReceivedGetLogsReceived**
> DataZoneAnalyticsApiLogs logsReceivedGetLogsReceived(zoneIdentifier, end, sample, timestamps, count, fields, start)

Get logs received

The &#x60;/received&#x60; api route allows customers to retrieve their edge HTTP logs. The basic access pattern is \&quot;give me all the logs for zone Z for minute M\&quot;, where the minute M refers to the time records were received at Cloudflare&#39;s central data center. &#x60;start&#x60; is inclusive, and &#x60;end&#x60; is exclusive. Because of that, to get all data, at minutely cadence, starting at 10AM, the proper values are: &#x60;start&#x3D;2018-05-20T10:00:00Z&amp;end&#x3D;2018-05-20T10:01:00Z&#x60;, then &#x60;start&#x3D;2018-05-20T10:01:00Z&amp;end&#x3D;2018-05-20T10:02:00Z&#x60; and so on; the overlap will be handled properly.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.LogsReceivedApi;

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

    LogsReceivedApi apiInstance = new LogsReceivedApi(defaultClient);
    String zoneIdentifier = "zoneIdentifier_example"; // String | 
    DataZoneAnalyticsApiEnd end = new DataZoneAnalyticsApiEnd(); // DataZoneAnalyticsApiEnd | 
    BigDecimal sample = new BigDecimal(78); // BigDecimal | 
    DataZoneAnalyticsApiTimestamps timestamps = DataZoneAnalyticsApiTimestamps.fromValue("unix"); // DataZoneAnalyticsApiTimestamps | 
    Integer count = 56; // Integer | 
    String fields = "ClientIP,RayID,EdgeStartTimestamp"; // String | 
    LogsReceivedGetLogsReceivedStartParameter start = new LogsReceivedGetLogsReceivedStartParameter(); // LogsReceivedGetLogsReceivedStartParameter | 
    try {
      DataZoneAnalyticsApiLogs result = apiInstance.logsReceivedGetLogsReceived(zoneIdentifier, end, sample, timestamps, count, fields, start);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling LogsReceivedApi#logsReceivedGetLogsReceived");
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
| **zoneIdentifier** | **String**|  | |
| **end** | [**DataZoneAnalyticsApiEnd**](.md)|  | |
| **sample** | **BigDecimal**|  | [optional] |
| **timestamps** | [**DataZoneAnalyticsApiTimestamps**](.md)|  | [optional] [default to unixnano] [enum: unix, unixnano, rfc3339] |
| **count** | **Integer**|  | [optional] |
| **fields** | **String**|  | [optional] |
| **start** | [**LogsReceivedGetLogsReceivedStartParameter**](.md)|  | [optional] |

### Return type

[**DataZoneAnalyticsApiLogs**](DataZoneAnalyticsApiLogs.md)

### Authorization

[api_key](../README.md#api_key), [api_token](../README.md#api_token), [api_email](../README.md#api_email)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Get logs received response |  -  |
| **4XX** | Get logs received response failure |  -  |

<a id="logsReceivedListFields"></a>
# **logsReceivedListFields**
> DataZoneAnalyticsApiFieldsResponse logsReceivedListFields(zoneIdentifier)

List fields

Lists all fields available. The response is json object with key-value pairs, where keys are field names, and values are descriptions.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.LogsReceivedApi;

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

    LogsReceivedApi apiInstance = new LogsReceivedApi(defaultClient);
    String zoneIdentifier = "zoneIdentifier_example"; // String | 
    try {
      DataZoneAnalyticsApiFieldsResponse result = apiInstance.logsReceivedListFields(zoneIdentifier);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling LogsReceivedApi#logsReceivedListFields");
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
| **zoneIdentifier** | **String**|  | |

### Return type

[**DataZoneAnalyticsApiFieldsResponse**](DataZoneAnalyticsApiFieldsResponse.md)

### Authorization

[api_key](../README.md#api_key), [api_token](../README.md#api_token), [api_email](../README.md#api_email)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | List fields response |  -  |
| **4XX** | List fields response failure |  -  |

<a id="logsReceivedUpdateLogRetentionFlag"></a>
# **logsReceivedUpdateLogRetentionFlag**
> DataZoneAnalyticsApiFlagResponse logsReceivedUpdateLogRetentionFlag(zoneIdentifier, logsReceivedUpdateLogRetentionFlagRequest)

Update log retention flag

Updates log retention flag for Logpull API.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.LogsReceivedApi;

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

    LogsReceivedApi apiInstance = new LogsReceivedApi(defaultClient);
    String zoneIdentifier = "zoneIdentifier_example"; // String | 
    LogsReceivedUpdateLogRetentionFlagRequest logsReceivedUpdateLogRetentionFlagRequest = new LogsReceivedUpdateLogRetentionFlagRequest(); // LogsReceivedUpdateLogRetentionFlagRequest | 
    try {
      DataZoneAnalyticsApiFlagResponse result = apiInstance.logsReceivedUpdateLogRetentionFlag(zoneIdentifier, logsReceivedUpdateLogRetentionFlagRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling LogsReceivedApi#logsReceivedUpdateLogRetentionFlag");
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
| **zoneIdentifier** | **String**|  | |
| **logsReceivedUpdateLogRetentionFlagRequest** | [**LogsReceivedUpdateLogRetentionFlagRequest**](LogsReceivedUpdateLogRetentionFlagRequest.md)|  | |

### Return type

[**DataZoneAnalyticsApiFlagResponse**](DataZoneAnalyticsApiFlagResponse.md)

### Authorization

[api_key](../README.md#api_key), [api_token](../README.md#api_token), [api_email](../README.md#api_email)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Update log retention flag response |  -  |
| **4XX** | Update log retention flag response failure |  -  |

