# RadarConnectionTamperingApi

All URIs are relative to *https://api.cloudflare.com/client/v4*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**radarGetConnectionTamperingSummary**](RadarConnectionTamperingApi.md#radarGetConnectionTamperingSummary) | **GET** /radar/connection_tampering/summary | Get Connection Tampering Summary |
| [**radarGetConnectionTamperingTimeseriesGroup**](RadarConnectionTamperingApi.md#radarGetConnectionTamperingTimeseriesGroup) | **GET** /radar/connection_tampering/timeseries_groups | Get Connection Tampering Time Series |


<a id="radarGetConnectionTamperingSummary"></a>
# **radarGetConnectionTamperingSummary**
> RadarGetConnectionTamperingSummary200Response radarGetConnectionTamperingSummary(name, dateRange, dateStart, dateEnd, asn, location, continent, format)

Get Connection Tampering Summary

Distribution of connection tampering types over a given time period.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.RadarConnectionTamperingApi;

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

    RadarConnectionTamperingApi apiInstance = new RadarConnectionTamperingApi(defaultClient);
    List<String> name = Arrays.asList(); // List<String> | 
    List<String> dateRange = Arrays.asList(); // List<String> | 
    List<OffsetDateTime> dateStart = Arrays.asList(); // List<OffsetDateTime> | 
    List<OffsetDateTime> dateEnd = Arrays.asList(); // List<OffsetDateTime> | 
    List<String> asn = Arrays.asList(); // List<String> | 
    List<String> location = Arrays.asList(); // List<String> | 
    List<String> continent = Arrays.asList(); // List<String> | 
    String format = "JSON"; // String | 
    try {
      RadarGetConnectionTamperingSummary200Response result = apiInstance.radarGetConnectionTamperingSummary(name, dateRange, dateStart, dateEnd, asn, location, continent, format);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling RadarConnectionTamperingApi#radarGetConnectionTamperingSummary");
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
| **name** | [**List&lt;String&gt;**](String.md)|  | [optional] |
| **dateRange** | [**List&lt;String&gt;**](String.md)|  | [optional] [enum: 1d, 2d, 7d, 14d, 28d, 12w, 24w, 52w, 1dControl, 2dControl, 7dControl, 14dControl, 28dControl, 12wControl, 24wControl] |
| **dateStart** | [**List&lt;OffsetDateTime&gt;**](OffsetDateTime.md)|  | [optional] |
| **dateEnd** | [**List&lt;OffsetDateTime&gt;**](OffsetDateTime.md)|  | [optional] |
| **asn** | [**List&lt;String&gt;**](String.md)|  | [optional] |
| **location** | [**List&lt;String&gt;**](String.md)|  | [optional] |
| **continent** | [**List&lt;String&gt;**](String.md)|  | [optional] |
| **format** | **String**|  | [optional] [enum: JSON, CSV] |

### Return type

[**RadarGetConnectionTamperingSummary200Response**](RadarGetConnectionTamperingSummary200Response.md)

### Authorization

[api_key](../README.md#api_key), [api_token](../README.md#api_token), [api_email](../README.md#api_email)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successful Response |  -  |
| **400** | Bad Request |  -  |

<a id="radarGetConnectionTamperingTimeseriesGroup"></a>
# **radarGetConnectionTamperingTimeseriesGroup**
> RadarGetConnectionTamperingTimeseriesGroup200Response radarGetConnectionTamperingTimeseriesGroup(aggInterval, name, dateRange, dateStart, dateEnd, asn, location, continent, format)

Get Connection Tampering Time Series

Distribution of connection tampering types over time.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.RadarConnectionTamperingApi;

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

    RadarConnectionTamperingApi apiInstance = new RadarConnectionTamperingApi(defaultClient);
    String aggInterval = "15m"; // String | 
    List<String> name = Arrays.asList(); // List<String> | 
    List<String> dateRange = Arrays.asList(); // List<String> | 
    List<OffsetDateTime> dateStart = Arrays.asList(); // List<OffsetDateTime> | 
    List<OffsetDateTime> dateEnd = Arrays.asList(); // List<OffsetDateTime> | 
    List<String> asn = Arrays.asList(); // List<String> | 
    List<String> location = Arrays.asList(); // List<String> | 
    List<String> continent = Arrays.asList(); // List<String> | 
    String format = "JSON"; // String | 
    try {
      RadarGetConnectionTamperingTimeseriesGroup200Response result = apiInstance.radarGetConnectionTamperingTimeseriesGroup(aggInterval, name, dateRange, dateStart, dateEnd, asn, location, continent, format);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling RadarConnectionTamperingApi#radarGetConnectionTamperingTimeseriesGroup");
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
| **aggInterval** | **String**|  | [optional] [enum: 15m, 1h, 1d, 1w] |
| **name** | [**List&lt;String&gt;**](String.md)|  | [optional] |
| **dateRange** | [**List&lt;String&gt;**](String.md)|  | [optional] [enum: 1d, 2d, 7d, 14d, 28d, 12w, 24w, 52w, 1dControl, 2dControl, 7dControl, 14dControl, 28dControl, 12wControl, 24wControl] |
| **dateStart** | [**List&lt;OffsetDateTime&gt;**](OffsetDateTime.md)|  | [optional] |
| **dateEnd** | [**List&lt;OffsetDateTime&gt;**](OffsetDateTime.md)|  | [optional] |
| **asn** | [**List&lt;String&gt;**](String.md)|  | [optional] |
| **location** | [**List&lt;String&gt;**](String.md)|  | [optional] |
| **continent** | [**List&lt;String&gt;**](String.md)|  | [optional] |
| **format** | **String**|  | [optional] [enum: JSON, CSV] |

### Return type

[**RadarGetConnectionTamperingTimeseriesGroup200Response**](RadarGetConnectionTamperingTimeseriesGroup200Response.md)

### Authorization

[api_key](../README.md#api_key), [api_token](../README.md#api_token), [api_email](../README.md#api_email)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successful Response |  -  |
| **400** | Bad Request |  -  |

