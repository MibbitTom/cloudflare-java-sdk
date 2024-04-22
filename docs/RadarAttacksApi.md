# RadarAttacksApi

All URIs are relative to *https://api.cloudflare.com/client/v4*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**radarGetAttacksLayer3Summary**](RadarAttacksApi.md#radarGetAttacksLayer3Summary) | **GET** /radar/attacks/layer3/summary | Get Layer 3 Attacks Summary |
| [**radarGetAttacksLayer3SummaryByBitrate**](RadarAttacksApi.md#radarGetAttacksLayer3SummaryByBitrate) | **GET** /radar/attacks/layer3/summary/bitrate | Get Attack Bitrate Summary |
| [**radarGetAttacksLayer3SummaryByDuration**](RadarAttacksApi.md#radarGetAttacksLayer3SummaryByDuration) | **GET** /radar/attacks/layer3/summary/duration | Get Attack Durations Summary |
| [**radarGetAttacksLayer3SummaryByIpVersion**](RadarAttacksApi.md#radarGetAttacksLayer3SummaryByIpVersion) | **GET** /radar/attacks/layer3/summary/ip_version | Get IP Versions Summary |
| [**radarGetAttacksLayer3SummaryByProtocol**](RadarAttacksApi.md#radarGetAttacksLayer3SummaryByProtocol) | **GET** /radar/attacks/layer3/summary/protocol | Get Layer 3 Protocols Summary |
| [**radarGetAttacksLayer3SummaryByVector**](RadarAttacksApi.md#radarGetAttacksLayer3SummaryByVector) | **GET** /radar/attacks/layer3/summary/vector | Get Attack Vector Summary |
| [**radarGetAttacksLayer3TimeseriesByBytes**](RadarAttacksApi.md#radarGetAttacksLayer3TimeseriesByBytes) | **GET** /radar/attacks/layer3/timeseries | Get Attacks By Bytes Summary |
| [**radarGetAttacksLayer3TimeseriesGroupByBitrate**](RadarAttacksApi.md#radarGetAttacksLayer3TimeseriesGroupByBitrate) | **GET** /radar/attacks/layer3/timeseries_groups/bitrate | Get Attacks By Bitrate Time Series |
| [**radarGetAttacksLayer3TimeseriesGroupByDuration**](RadarAttacksApi.md#radarGetAttacksLayer3TimeseriesGroupByDuration) | **GET** /radar/attacks/layer3/timeseries_groups/duration | Get Layer 3 Attack By Duration Time Series |
| [**radarGetAttacksLayer3TimeseriesGroupByIndustry**](RadarAttacksApi.md#radarGetAttacksLayer3TimeseriesGroupByIndustry) | **GET** /radar/attacks/layer3/timeseries_groups/industry | Get Layer 3 Attacks By Target Industries Time Series |
| [**radarGetAttacksLayer3TimeseriesGroupByIpVersion**](RadarAttacksApi.md#radarGetAttacksLayer3TimeseriesGroupByIpVersion) | **GET** /radar/attacks/layer3/timeseries_groups/ip_version | Get Layer 3 Attacks By IP Version Time Series |
| [**radarGetAttacksLayer3TimeseriesGroupByProtocol**](RadarAttacksApi.md#radarGetAttacksLayer3TimeseriesGroupByProtocol) | **GET** /radar/attacks/layer3/timeseries_groups/protocol | Get Layer 3 Attacks By Protocol Timeseries |
| [**radarGetAttacksLayer3TimeseriesGroupByVector**](RadarAttacksApi.md#radarGetAttacksLayer3TimeseriesGroupByVector) | **GET** /radar/attacks/layer3/timeseries_groups/vector | Get Layer 3 Attacks By Vector |
| [**radarGetAttacksLayer3TimeseriesGroupByVertical**](RadarAttacksApi.md#radarGetAttacksLayer3TimeseriesGroupByVertical) | **GET** /radar/attacks/layer3/timeseries_groups/vertical | Get Layer 3 Attacks By Vertical Time Series |
| [**radarGetAttacksLayer3TimeseriesGroups**](RadarAttacksApi.md#radarGetAttacksLayer3TimeseriesGroups) | **GET** /radar/attacks/layer3/timeseries_groups | Get Layer 3 Attacks By Network Protocol Time Series |
| [**radarGetAttacksLayer3TopAttacks**](RadarAttacksApi.md#radarGetAttacksLayer3TopAttacks) | **GET** /radar/attacks/layer3/top/attacks | Get top attack pairs (origin and target locations) of Layer 3 attacks |
| [**radarGetAttacksLayer3TopIndustries**](RadarAttacksApi.md#radarGetAttacksLayer3TopIndustries) | **GET** /radar/attacks/layer3/top/industry | Get top Industry of attack |
| [**radarGetAttacksLayer3TopOriginLocations**](RadarAttacksApi.md#radarGetAttacksLayer3TopOriginLocations) | **GET** /radar/attacks/layer3/top/locations/origin | Get top origin locations of attack |
| [**radarGetAttacksLayer3TopTargetLocations**](RadarAttacksApi.md#radarGetAttacksLayer3TopTargetLocations) | **GET** /radar/attacks/layer3/top/locations/target | Get top target locations of attack |
| [**radarGetAttacksLayer3TopVerticals**](RadarAttacksApi.md#radarGetAttacksLayer3TopVerticals) | **GET** /radar/attacks/layer3/top/vertical | Get top Verticals of attack |
| [**radarGetAttacksLayer7Summary**](RadarAttacksApi.md#radarGetAttacksLayer7Summary) | **GET** /radar/attacks/layer7/summary | Get Layer 7 Attacks Summary |
| [**radarGetAttacksLayer7SummaryByHttpMethod**](RadarAttacksApi.md#radarGetAttacksLayer7SummaryByHttpMethod) | **GET** /radar/attacks/layer7/summary/http_method | Get HTTP Method Summary |
| [**radarGetAttacksLayer7SummaryByHttpVersion**](RadarAttacksApi.md#radarGetAttacksLayer7SummaryByHttpVersion) | **GET** /radar/attacks/layer7/summary/http_version | Get HTTP Version Summary |
| [**radarGetAttacksLayer7SummaryByIpVersion**](RadarAttacksApi.md#radarGetAttacksLayer7SummaryByIpVersion) | **GET** /radar/attacks/layer7/summary/ip_version | Get Ip Version Summary |
| [**radarGetAttacksLayer7SummaryByManagedRules**](RadarAttacksApi.md#radarGetAttacksLayer7SummaryByManagedRules) | **GET** /radar/attacks/layer7/summary/managed_rules | Get Managed Rules Summary |
| [**radarGetAttacksLayer7SummaryByMitigationProduct**](RadarAttacksApi.md#radarGetAttacksLayer7SummaryByMitigationProduct) | **GET** /radar/attacks/layer7/summary/mitigation_product | Get Mitigation Product Summary |
| [**radarGetAttacksLayer7Timeseries**](RadarAttacksApi.md#radarGetAttacksLayer7Timeseries) | **GET** /radar/attacks/layer7/timeseries | Get Layer 7 Attacks Time Series |
| [**radarGetAttacksLayer7TimeseriesGroup**](RadarAttacksApi.md#radarGetAttacksLayer7TimeseriesGroup) | **GET** /radar/attacks/layer7/timeseries_groups | Get Layer 7 Attacks By Mitigation Technique Time Series |
| [**radarGetAttacksLayer7TimeseriesGroupByHttpMethod**](RadarAttacksApi.md#radarGetAttacksLayer7TimeseriesGroupByHttpMethod) | **GET** /radar/attacks/layer7/timeseries_groups/http_method | Get Layer 7 Attacks By HTTP Method Time Series |
| [**radarGetAttacksLayer7TimeseriesGroupByHttpVersion**](RadarAttacksApi.md#radarGetAttacksLayer7TimeseriesGroupByHttpVersion) | **GET** /radar/attacks/layer7/timeseries_groups/http_version | Get Layer 7 Attacks By HTTP Version Time Series |
| [**radarGetAttacksLayer7TimeseriesGroupByIndustry**](RadarAttacksApi.md#radarGetAttacksLayer7TimeseriesGroupByIndustry) | **GET** /radar/attacks/layer7/timeseries_groups/industry | Get Layer 7 Attacks By Target Industries Time Series |
| [**radarGetAttacksLayer7TimeseriesGroupByIpVersion**](RadarAttacksApi.md#radarGetAttacksLayer7TimeseriesGroupByIpVersion) | **GET** /radar/attacks/layer7/timeseries_groups/ip_version | Get Layer 7 Attacks By IP Version Time Series |
| [**radarGetAttacksLayer7TimeseriesGroupByManagedRules**](RadarAttacksApi.md#radarGetAttacksLayer7TimeseriesGroupByManagedRules) | **GET** /radar/attacks/layer7/timeseries_groups/managed_rules | Get Layer 7 Attacks By Managed Rules Time Series |
| [**radarGetAttacksLayer7TimeseriesGroupByMitigationProduct**](RadarAttacksApi.md#radarGetAttacksLayer7TimeseriesGroupByMitigationProduct) | **GET** /radar/attacks/layer7/timeseries_groups/mitigation_product | Get Layer 7 Attacks By Mitigation Product Time Series |
| [**radarGetAttacksLayer7TimeseriesGroupByVertical**](RadarAttacksApi.md#radarGetAttacksLayer7TimeseriesGroupByVertical) | **GET** /radar/attacks/layer7/timeseries_groups/vertical | Get Layer 7 Attacks By Vertical Time Series |
| [**radarGetAttacksLayer7TopAttacks**](RadarAttacksApi.md#radarGetAttacksLayer7TopAttacks) | **GET** /radar/attacks/layer7/top/attacks | Get Top Attack Pairs (origin and target locations) By Layer 7 Attacks |
| [**radarGetAttacksLayer7TopIndustries**](RadarAttacksApi.md#radarGetAttacksLayer7TopIndustries) | **GET** /radar/attacks/layer7/top/industry | Get top Industry of attack |
| [**radarGetAttacksLayer7TopOriginAs**](RadarAttacksApi.md#radarGetAttacksLayer7TopOriginAs) | **GET** /radar/attacks/layer7/top/ases/origin | Get Top Origin Autonomous Systems By Layer 7 Attacks |
| [**radarGetAttacksLayer7TopOriginLocation**](RadarAttacksApi.md#radarGetAttacksLayer7TopOriginLocation) | **GET** /radar/attacks/layer7/top/locations/origin | Get Top Origin Locations By Layer 7 Attacks |
| [**radarGetAttacksLayer7TopTargetLocation**](RadarAttacksApi.md#radarGetAttacksLayer7TopTargetLocation) | **GET** /radar/attacks/layer7/top/locations/target | Get layer 7 top target locations |
| [**radarGetAttacksLayer7TopVerticals**](RadarAttacksApi.md#radarGetAttacksLayer7TopVerticals) | **GET** /radar/attacks/layer7/top/vertical | Get top Verticals of attack |


<a id="radarGetAttacksLayer3Summary"></a>
# **radarGetAttacksLayer3Summary**
> RadarGetAttacksLayer3Summary200Response radarGetAttacksLayer3Summary(name, dateRange, dateStart, dateEnd, asn, location, continent, format)

Get Layer 3 Attacks Summary

Percentage distribution of network protocols in layer 3/4 attacks over a given time period.

### Example
```java
// Import classes:
import cloudflare.ApiClient;
import cloudflare.ApiException;
import cloudflare.Configuration;
import cloudflare.auth.*;
import cloudflare.models.*;
import cloudflare.sdk.RadarAttacksApi;

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

    RadarAttacksApi apiInstance = new RadarAttacksApi(defaultClient);
    List<String> name = Arrays.asList(); // List<String> | 
    List<String> dateRange = Arrays.asList(); // List<String> | 
    List<OffsetDateTime> dateStart = Arrays.asList(); // List<OffsetDateTime> | 
    List<OffsetDateTime> dateEnd = Arrays.asList(); // List<OffsetDateTime> | 
    List<String> asn = Arrays.asList(); // List<String> | 
    List<String> location = Arrays.asList(); // List<String> | 
    List<String> continent = Arrays.asList(); // List<String> | 
    String format = "JSON"; // String | 
    try {
      RadarGetAttacksLayer3Summary200Response result = apiInstance.radarGetAttacksLayer3Summary(name, dateRange, dateStart, dateEnd, asn, location, continent, format);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling RadarAttacksApi#radarGetAttacksLayer3Summary");
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

[**RadarGetAttacksLayer3Summary200Response**](RadarGetAttacksLayer3Summary200Response.md)

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

<a id="radarGetAttacksLayer3SummaryByBitrate"></a>
# **radarGetAttacksLayer3SummaryByBitrate**
> RadarGetAttacksLayer3SummaryByBitrate200Response radarGetAttacksLayer3SummaryByBitrate(name, dateRange, dateStart, dateEnd, location, continent, ipVersion, protocol, direction, format)

Get Attack Bitrate Summary

Percentage distribution of attacks by bitrate.

### Example
```java
// Import classes:
import cloudflare.ApiClient;
import cloudflare.ApiException;
import cloudflare.Configuration;
import cloudflare.auth.*;
import cloudflare.models.*;
import cloudflare.sdk.RadarAttacksApi;

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

    RadarAttacksApi apiInstance = new RadarAttacksApi(defaultClient);
    List<String> name = Arrays.asList(); // List<String> | 
    List<String> dateRange = Arrays.asList(); // List<String> | 
    List<OffsetDateTime> dateStart = Arrays.asList(); // List<OffsetDateTime> | 
    List<OffsetDateTime> dateEnd = Arrays.asList(); // List<OffsetDateTime> | 
    List<String> location = Arrays.asList(); // List<String> | 
    List<String> continent = Arrays.asList(); // List<String> | 
    List<String> ipVersion = Arrays.asList(); // List<String> | 
    List<String> protocol = Arrays.asList(); // List<String> | 
    String direction = "ORIGIN"; // String | 
    String format = "JSON"; // String | 
    try {
      RadarGetAttacksLayer3SummaryByBitrate200Response result = apiInstance.radarGetAttacksLayer3SummaryByBitrate(name, dateRange, dateStart, dateEnd, location, continent, ipVersion, protocol, direction, format);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling RadarAttacksApi#radarGetAttacksLayer3SummaryByBitrate");
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
| **location** | [**List&lt;String&gt;**](String.md)|  | [optional] |
| **continent** | [**List&lt;String&gt;**](String.md)|  | [optional] |
| **ipVersion** | [**List&lt;String&gt;**](String.md)|  | [optional] [enum: IPv4, IPv6] |
| **protocol** | [**List&lt;String&gt;**](String.md)|  | [optional] [enum: UDP, TCP, ICMP, GRE] |
| **direction** | **String**|  | [optional] [default to ORIGIN] [enum: ORIGIN, TARGET] |
| **format** | **String**|  | [optional] [enum: JSON, CSV] |

### Return type

[**RadarGetAttacksLayer3SummaryByBitrate200Response**](RadarGetAttacksLayer3SummaryByBitrate200Response.md)

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

<a id="radarGetAttacksLayer3SummaryByDuration"></a>
# **radarGetAttacksLayer3SummaryByDuration**
> RadarGetAttacksLayer3SummaryByDuration200Response radarGetAttacksLayer3SummaryByDuration(name, dateRange, dateStart, dateEnd, location, continent, ipVersion, protocol, direction, format)

Get Attack Durations Summary

Percentage distribution of attacks by duration.

### Example
```java
// Import classes:
import cloudflare.ApiClient;
import cloudflare.ApiException;
import cloudflare.Configuration;
import cloudflare.auth.*;
import cloudflare.models.*;
import cloudflare.sdk.RadarAttacksApi;

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

    RadarAttacksApi apiInstance = new RadarAttacksApi(defaultClient);
    List<String> name = Arrays.asList(); // List<String> | 
    List<String> dateRange = Arrays.asList(); // List<String> | 
    List<OffsetDateTime> dateStart = Arrays.asList(); // List<OffsetDateTime> | 
    List<OffsetDateTime> dateEnd = Arrays.asList(); // List<OffsetDateTime> | 
    List<String> location = Arrays.asList(); // List<String> | 
    List<String> continent = Arrays.asList(); // List<String> | 
    List<String> ipVersion = Arrays.asList(); // List<String> | 
    List<String> protocol = Arrays.asList(); // List<String> | 
    String direction = "ORIGIN"; // String | 
    String format = "JSON"; // String | 
    try {
      RadarGetAttacksLayer3SummaryByDuration200Response result = apiInstance.radarGetAttacksLayer3SummaryByDuration(name, dateRange, dateStart, dateEnd, location, continent, ipVersion, protocol, direction, format);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling RadarAttacksApi#radarGetAttacksLayer3SummaryByDuration");
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
| **location** | [**List&lt;String&gt;**](String.md)|  | [optional] |
| **continent** | [**List&lt;String&gt;**](String.md)|  | [optional] |
| **ipVersion** | [**List&lt;String&gt;**](String.md)|  | [optional] [enum: IPv4, IPv6] |
| **protocol** | [**List&lt;String&gt;**](String.md)|  | [optional] [enum: UDP, TCP, ICMP, GRE] |
| **direction** | **String**|  | [optional] [default to ORIGIN] [enum: ORIGIN, TARGET] |
| **format** | **String**|  | [optional] [enum: JSON, CSV] |

### Return type

[**RadarGetAttacksLayer3SummaryByDuration200Response**](RadarGetAttacksLayer3SummaryByDuration200Response.md)

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

<a id="radarGetAttacksLayer3SummaryByIpVersion"></a>
# **radarGetAttacksLayer3SummaryByIpVersion**
> RadarGetAttacksLayer3SummaryByIpVersion200Response radarGetAttacksLayer3SummaryByIpVersion(name, dateRange, dateStart, dateEnd, location, continent, protocol, direction, format)

Get IP Versions Summary

Percentage distribution of attacks by ip version used.

### Example
```java
// Import classes:
import cloudflare.ApiClient;
import cloudflare.ApiException;
import cloudflare.Configuration;
import cloudflare.auth.*;
import cloudflare.models.*;
import cloudflare.sdk.RadarAttacksApi;

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

    RadarAttacksApi apiInstance = new RadarAttacksApi(defaultClient);
    List<String> name = Arrays.asList(); // List<String> | 
    List<String> dateRange = Arrays.asList(); // List<String> | 
    List<OffsetDateTime> dateStart = Arrays.asList(); // List<OffsetDateTime> | 
    List<OffsetDateTime> dateEnd = Arrays.asList(); // List<OffsetDateTime> | 
    List<String> location = Arrays.asList(); // List<String> | 
    List<String> continent = Arrays.asList(); // List<String> | 
    List<String> protocol = Arrays.asList(); // List<String> | 
    String direction = "ORIGIN"; // String | 
    String format = "JSON"; // String | 
    try {
      RadarGetAttacksLayer3SummaryByIpVersion200Response result = apiInstance.radarGetAttacksLayer3SummaryByIpVersion(name, dateRange, dateStart, dateEnd, location, continent, protocol, direction, format);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling RadarAttacksApi#radarGetAttacksLayer3SummaryByIpVersion");
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
| **location** | [**List&lt;String&gt;**](String.md)|  | [optional] |
| **continent** | [**List&lt;String&gt;**](String.md)|  | [optional] |
| **protocol** | [**List&lt;String&gt;**](String.md)|  | [optional] [enum: UDP, TCP, ICMP, GRE] |
| **direction** | **String**|  | [optional] [default to ORIGIN] [enum: ORIGIN, TARGET] |
| **format** | **String**|  | [optional] [enum: JSON, CSV] |

### Return type

[**RadarGetAttacksLayer3SummaryByIpVersion200Response**](RadarGetAttacksLayer3SummaryByIpVersion200Response.md)

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

<a id="radarGetAttacksLayer3SummaryByProtocol"></a>
# **radarGetAttacksLayer3SummaryByProtocol**
> RadarGetAttacksLayer3SummaryByProtocol200Response radarGetAttacksLayer3SummaryByProtocol(name, dateRange, dateStart, dateEnd, location, continent, ipVersion, direction, format)

Get Layer 3 Protocols Summary

Percentage distribution of attacks by protocol used.

### Example
```java
// Import classes:
import cloudflare.ApiClient;
import cloudflare.ApiException;
import cloudflare.Configuration;
import cloudflare.auth.*;
import cloudflare.models.*;
import cloudflare.sdk.RadarAttacksApi;

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

    RadarAttacksApi apiInstance = new RadarAttacksApi(defaultClient);
    List<String> name = Arrays.asList(); // List<String> | 
    List<String> dateRange = Arrays.asList(); // List<String> | 
    List<OffsetDateTime> dateStart = Arrays.asList(); // List<OffsetDateTime> | 
    List<OffsetDateTime> dateEnd = Arrays.asList(); // List<OffsetDateTime> | 
    List<String> location = Arrays.asList(); // List<String> | 
    List<String> continent = Arrays.asList(); // List<String> | 
    List<String> ipVersion = Arrays.asList(); // List<String> | 
    String direction = "ORIGIN"; // String | 
    String format = "JSON"; // String | 
    try {
      RadarGetAttacksLayer3SummaryByProtocol200Response result = apiInstance.radarGetAttacksLayer3SummaryByProtocol(name, dateRange, dateStart, dateEnd, location, continent, ipVersion, direction, format);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling RadarAttacksApi#radarGetAttacksLayer3SummaryByProtocol");
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
| **location** | [**List&lt;String&gt;**](String.md)|  | [optional] |
| **continent** | [**List&lt;String&gt;**](String.md)|  | [optional] |
| **ipVersion** | [**List&lt;String&gt;**](String.md)|  | [optional] [enum: IPv4, IPv6] |
| **direction** | **String**|  | [optional] [default to ORIGIN] [enum: ORIGIN, TARGET] |
| **format** | **String**|  | [optional] [enum: JSON, CSV] |

### Return type

[**RadarGetAttacksLayer3SummaryByProtocol200Response**](RadarGetAttacksLayer3SummaryByProtocol200Response.md)

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

<a id="radarGetAttacksLayer3SummaryByVector"></a>
# **radarGetAttacksLayer3SummaryByVector**
> RadarGetAttacksLayer3SummaryByVector200Response radarGetAttacksLayer3SummaryByVector(name, dateRange, dateStart, dateEnd, location, continent, ipVersion, protocol, direction, format)

Get Attack Vector Summary

Percentage distribution of attacks by vector.

### Example
```java
// Import classes:
import cloudflare.ApiClient;
import cloudflare.ApiException;
import cloudflare.Configuration;
import cloudflare.auth.*;
import cloudflare.models.*;
import cloudflare.sdk.RadarAttacksApi;

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

    RadarAttacksApi apiInstance = new RadarAttacksApi(defaultClient);
    List<String> name = Arrays.asList(); // List<String> | 
    List<String> dateRange = Arrays.asList(); // List<String> | 
    List<OffsetDateTime> dateStart = Arrays.asList(); // List<OffsetDateTime> | 
    List<OffsetDateTime> dateEnd = Arrays.asList(); // List<OffsetDateTime> | 
    List<String> location = Arrays.asList(); // List<String> | 
    List<String> continent = Arrays.asList(); // List<String> | 
    List<String> ipVersion = Arrays.asList(); // List<String> | 
    List<String> protocol = Arrays.asList(); // List<String> | 
    String direction = "ORIGIN"; // String | 
    String format = "JSON"; // String | 
    try {
      RadarGetAttacksLayer3SummaryByVector200Response result = apiInstance.radarGetAttacksLayer3SummaryByVector(name, dateRange, dateStart, dateEnd, location, continent, ipVersion, protocol, direction, format);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling RadarAttacksApi#radarGetAttacksLayer3SummaryByVector");
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
| **location** | [**List&lt;String&gt;**](String.md)|  | [optional] |
| **continent** | [**List&lt;String&gt;**](String.md)|  | [optional] |
| **ipVersion** | [**List&lt;String&gt;**](String.md)|  | [optional] [enum: IPv4, IPv6] |
| **protocol** | [**List&lt;String&gt;**](String.md)|  | [optional] [enum: UDP, TCP, ICMP, GRE] |
| **direction** | **String**|  | [optional] [default to ORIGIN] [enum: ORIGIN, TARGET] |
| **format** | **String**|  | [optional] [enum: JSON, CSV] |

### Return type

[**RadarGetAttacksLayer3SummaryByVector200Response**](RadarGetAttacksLayer3SummaryByVector200Response.md)

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

<a id="radarGetAttacksLayer3TimeseriesByBytes"></a>
# **radarGetAttacksLayer3TimeseriesByBytes**
> RadarGetAttacksLayer3TimeseriesByBytes200Response radarGetAttacksLayer3TimeseriesByBytes(aggInterval, name, dateRange, dateStart, dateEnd, asn, location, continent, ipVersion, protocol, normalization, metric, direction, format)

Get Attacks By Bytes Summary

Get attacks change over time by bytes.

### Example
```java
// Import classes:
import cloudflare.ApiClient;
import cloudflare.ApiException;
import cloudflare.Configuration;
import cloudflare.auth.*;
import cloudflare.models.*;
import cloudflare.sdk.RadarAttacksApi;

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

    RadarAttacksApi apiInstance = new RadarAttacksApi(defaultClient);
    String aggInterval = "15m"; // String | 
    List<String> name = Arrays.asList(); // List<String> | 
    List<String> dateRange = Arrays.asList(); // List<String> | 
    List<OffsetDateTime> dateStart = Arrays.asList(); // List<OffsetDateTime> | 
    List<OffsetDateTime> dateEnd = Arrays.asList(); // List<OffsetDateTime> | 
    List<String> asn = Arrays.asList(); // List<String> | 
    List<String> location = Arrays.asList(); // List<String> | 
    List<String> continent = Arrays.asList(); // List<String> | 
    List<String> ipVersion = Arrays.asList(); // List<String> | 
    List<String> protocol = Arrays.asList(); // List<String> | 
    String normalization = "PERCENTAGE_CHANGE"; // String | 
    String metric = "BYTES"; // String | 
    String direction = "ORIGIN"; // String | 
    String format = "JSON"; // String | 
    try {
      RadarGetAttacksLayer3TimeseriesByBytes200Response result = apiInstance.radarGetAttacksLayer3TimeseriesByBytes(aggInterval, name, dateRange, dateStart, dateEnd, asn, location, continent, ipVersion, protocol, normalization, metric, direction, format);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling RadarAttacksApi#radarGetAttacksLayer3TimeseriesByBytes");
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
| **ipVersion** | [**List&lt;String&gt;**](String.md)|  | [optional] [enum: IPv4, IPv6] |
| **protocol** | [**List&lt;String&gt;**](String.md)|  | [optional] [enum: UDP, TCP, ICMP, GRE] |
| **normalization** | **String**|  | [optional] [enum: PERCENTAGE_CHANGE, MIN0_MAX] |
| **metric** | **String**|  | [optional] [default to bytes] [enum: BYTES, BYTES_OLD] |
| **direction** | **String**|  | [optional] [default to ORIGIN] [enum: ORIGIN, TARGET] |
| **format** | **String**|  | [optional] [enum: JSON, CSV] |

### Return type

[**RadarGetAttacksLayer3TimeseriesByBytes200Response**](RadarGetAttacksLayer3TimeseriesByBytes200Response.md)

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

<a id="radarGetAttacksLayer3TimeseriesGroupByBitrate"></a>
# **radarGetAttacksLayer3TimeseriesGroupByBitrate**
> RadarGetAttacksLayer3TimeseriesGroupByBitrate200Response radarGetAttacksLayer3TimeseriesGroupByBitrate(aggInterval, name, dateRange, dateStart, dateEnd, location, continent, ipVersion, protocol, normalization, direction, format)

Get Attacks By Bitrate Time Series

Percentage distribution of attacks by bitrate over time.

### Example
```java
// Import classes:
import cloudflare.ApiClient;
import cloudflare.ApiException;
import cloudflare.Configuration;
import cloudflare.auth.*;
import cloudflare.models.*;
import cloudflare.sdk.RadarAttacksApi;

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

    RadarAttacksApi apiInstance = new RadarAttacksApi(defaultClient);
    String aggInterval = "15m"; // String | 
    List<String> name = Arrays.asList(); // List<String> | 
    List<String> dateRange = Arrays.asList(); // List<String> | 
    List<OffsetDateTime> dateStart = Arrays.asList(); // List<OffsetDateTime> | 
    List<OffsetDateTime> dateEnd = Arrays.asList(); // List<OffsetDateTime> | 
    List<String> location = Arrays.asList(); // List<String> | 
    List<String> continent = Arrays.asList(); // List<String> | 
    List<String> ipVersion = Arrays.asList(); // List<String> | 
    List<String> protocol = Arrays.asList(); // List<String> | 
    String normalization = "PERCENTAGE"; // String | 
    String direction = "ORIGIN"; // String | 
    String format = "JSON"; // String | 
    try {
      RadarGetAttacksLayer3TimeseriesGroupByBitrate200Response result = apiInstance.radarGetAttacksLayer3TimeseriesGroupByBitrate(aggInterval, name, dateRange, dateStart, dateEnd, location, continent, ipVersion, protocol, normalization, direction, format);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling RadarAttacksApi#radarGetAttacksLayer3TimeseriesGroupByBitrate");
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
| **location** | [**List&lt;String&gt;**](String.md)|  | [optional] |
| **continent** | [**List&lt;String&gt;**](String.md)|  | [optional] |
| **ipVersion** | [**List&lt;String&gt;**](String.md)|  | [optional] [enum: IPv4, IPv6] |
| **protocol** | [**List&lt;String&gt;**](String.md)|  | [optional] [enum: UDP, TCP, ICMP, GRE] |
| **normalization** | **String**|  | [optional] [default to PERCENTAGE] [enum: PERCENTAGE, MIN0_MAX] |
| **direction** | **String**|  | [optional] [default to ORIGIN] [enum: ORIGIN, TARGET] |
| **format** | **String**|  | [optional] [enum: JSON, CSV] |

### Return type

[**RadarGetAttacksLayer3TimeseriesGroupByBitrate200Response**](RadarGetAttacksLayer3TimeseriesGroupByBitrate200Response.md)

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

<a id="radarGetAttacksLayer3TimeseriesGroupByDuration"></a>
# **radarGetAttacksLayer3TimeseriesGroupByDuration**
> RadarGetAttacksLayer3TimeseriesGroupByDuration200Response radarGetAttacksLayer3TimeseriesGroupByDuration(aggInterval, name, dateRange, dateStart, dateEnd, location, continent, ipVersion, protocol, normalization, direction, format)

Get Layer 3 Attack By Duration Time Series

Percentage distribution of attacks by duration over time.

### Example
```java
// Import classes:
import cloudflare.ApiClient;
import cloudflare.ApiException;
import cloudflare.Configuration;
import cloudflare.auth.*;
import cloudflare.models.*;
import cloudflare.sdk.RadarAttacksApi;

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

    RadarAttacksApi apiInstance = new RadarAttacksApi(defaultClient);
    String aggInterval = "15m"; // String | 
    List<String> name = Arrays.asList(); // List<String> | 
    List<String> dateRange = Arrays.asList(); // List<String> | 
    List<OffsetDateTime> dateStart = Arrays.asList(); // List<OffsetDateTime> | 
    List<OffsetDateTime> dateEnd = Arrays.asList(); // List<OffsetDateTime> | 
    List<String> location = Arrays.asList(); // List<String> | 
    List<String> continent = Arrays.asList(); // List<String> | 
    List<String> ipVersion = Arrays.asList(); // List<String> | 
    List<String> protocol = Arrays.asList(); // List<String> | 
    String normalization = "PERCENTAGE"; // String | 
    String direction = "ORIGIN"; // String | 
    String format = "JSON"; // String | 
    try {
      RadarGetAttacksLayer3TimeseriesGroupByDuration200Response result = apiInstance.radarGetAttacksLayer3TimeseriesGroupByDuration(aggInterval, name, dateRange, dateStart, dateEnd, location, continent, ipVersion, protocol, normalization, direction, format);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling RadarAttacksApi#radarGetAttacksLayer3TimeseriesGroupByDuration");
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
| **location** | [**List&lt;String&gt;**](String.md)|  | [optional] |
| **continent** | [**List&lt;String&gt;**](String.md)|  | [optional] |
| **ipVersion** | [**List&lt;String&gt;**](String.md)|  | [optional] [enum: IPv4, IPv6] |
| **protocol** | [**List&lt;String&gt;**](String.md)|  | [optional] [enum: UDP, TCP, ICMP, GRE] |
| **normalization** | **String**|  | [optional] [default to PERCENTAGE] [enum: PERCENTAGE, MIN0_MAX] |
| **direction** | **String**|  | [optional] [default to ORIGIN] [enum: ORIGIN, TARGET] |
| **format** | **String**|  | [optional] [enum: JSON, CSV] |

### Return type

[**RadarGetAttacksLayer3TimeseriesGroupByDuration200Response**](RadarGetAttacksLayer3TimeseriesGroupByDuration200Response.md)

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

<a id="radarGetAttacksLayer3TimeseriesGroupByIndustry"></a>
# **radarGetAttacksLayer3TimeseriesGroupByIndustry**
> RadarGetAttacksLayer3TimeseriesGroupByIndustry200Response radarGetAttacksLayer3TimeseriesGroupByIndustry(aggInterval, name, dateRange, dateStart, dateEnd, location, continent, ipVersion, normalization, direction, limitPerGroup, format)

Get Layer 3 Attacks By Target Industries Time Series

Percentage distribution of attacks by industry used over time.

### Example
```java
// Import classes:
import cloudflare.ApiClient;
import cloudflare.ApiException;
import cloudflare.Configuration;
import cloudflare.auth.*;
import cloudflare.models.*;
import cloudflare.sdk.RadarAttacksApi;

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

    RadarAttacksApi apiInstance = new RadarAttacksApi(defaultClient);
    String aggInterval = "15m"; // String | 
    List<String> name = Arrays.asList(); // List<String> | 
    List<String> dateRange = Arrays.asList(); // List<String> | 
    List<OffsetDateTime> dateStart = Arrays.asList(); // List<OffsetDateTime> | 
    List<OffsetDateTime> dateEnd = Arrays.asList(); // List<OffsetDateTime> | 
    List<String> location = Arrays.asList(); // List<String> | 
    List<String> continent = Arrays.asList(); // List<String> | 
    List<String> ipVersion = Arrays.asList(); // List<String> | 
    String normalization = "PERCENTAGE"; // String | 
    String direction = "ORIGIN"; // String | 
    Integer limitPerGroup = 4; // Integer | 
    String format = "JSON"; // String | 
    try {
      RadarGetAttacksLayer3TimeseriesGroupByIndustry200Response result = apiInstance.radarGetAttacksLayer3TimeseriesGroupByIndustry(aggInterval, name, dateRange, dateStart, dateEnd, location, continent, ipVersion, normalization, direction, limitPerGroup, format);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling RadarAttacksApi#radarGetAttacksLayer3TimeseriesGroupByIndustry");
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
| **location** | [**List&lt;String&gt;**](String.md)|  | [optional] |
| **continent** | [**List&lt;String&gt;**](String.md)|  | [optional] |
| **ipVersion** | [**List&lt;String&gt;**](String.md)|  | [optional] [enum: IPv4, IPv6] |
| **normalization** | **String**|  | [optional] [default to PERCENTAGE] [enum: PERCENTAGE, MIN0_MAX] |
| **direction** | **String**|  | [optional] [default to ORIGIN] [enum: ORIGIN, TARGET] |
| **limitPerGroup** | **Integer**|  | [optional] |
| **format** | **String**|  | [optional] [enum: JSON, CSV] |

### Return type

[**RadarGetAttacksLayer3TimeseriesGroupByIndustry200Response**](RadarGetAttacksLayer3TimeseriesGroupByIndustry200Response.md)

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

<a id="radarGetAttacksLayer3TimeseriesGroupByIpVersion"></a>
# **radarGetAttacksLayer3TimeseriesGroupByIpVersion**
> RadarGetAttacksLayer3TimeseriesGroupByIpVersion200Response radarGetAttacksLayer3TimeseriesGroupByIpVersion(aggInterval, name, dateRange, dateStart, dateEnd, location, continent, protocol, normalization, direction, format)

Get Layer 3 Attacks By IP Version Time Series

Percentage distribution of attacks by ip version used over time.

### Example
```java
// Import classes:
import cloudflare.ApiClient;
import cloudflare.ApiException;
import cloudflare.Configuration;
import cloudflare.auth.*;
import cloudflare.models.*;
import cloudflare.sdk.RadarAttacksApi;

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

    RadarAttacksApi apiInstance = new RadarAttacksApi(defaultClient);
    String aggInterval = "15m"; // String | 
    List<String> name = Arrays.asList(); // List<String> | 
    List<String> dateRange = Arrays.asList(); // List<String> | 
    List<OffsetDateTime> dateStart = Arrays.asList(); // List<OffsetDateTime> | 
    List<OffsetDateTime> dateEnd = Arrays.asList(); // List<OffsetDateTime> | 
    List<String> location = Arrays.asList(); // List<String> | 
    List<String> continent = Arrays.asList(); // List<String> | 
    List<String> protocol = Arrays.asList(); // List<String> | 
    String normalization = "PERCENTAGE"; // String | 
    String direction = "ORIGIN"; // String | 
    String format = "JSON"; // String | 
    try {
      RadarGetAttacksLayer3TimeseriesGroupByIpVersion200Response result = apiInstance.radarGetAttacksLayer3TimeseriesGroupByIpVersion(aggInterval, name, dateRange, dateStart, dateEnd, location, continent, protocol, normalization, direction, format);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling RadarAttacksApi#radarGetAttacksLayer3TimeseriesGroupByIpVersion");
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
| **location** | [**List&lt;String&gt;**](String.md)|  | [optional] |
| **continent** | [**List&lt;String&gt;**](String.md)|  | [optional] |
| **protocol** | [**List&lt;String&gt;**](String.md)|  | [optional] [enum: UDP, TCP, ICMP, GRE] |
| **normalization** | **String**|  | [optional] [default to PERCENTAGE] [enum: PERCENTAGE, MIN0_MAX] |
| **direction** | **String**|  | [optional] [default to ORIGIN] [enum: ORIGIN, TARGET] |
| **format** | **String**|  | [optional] [enum: JSON, CSV] |

### Return type

[**RadarGetAttacksLayer3TimeseriesGroupByIpVersion200Response**](RadarGetAttacksLayer3TimeseriesGroupByIpVersion200Response.md)

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

<a id="radarGetAttacksLayer3TimeseriesGroupByProtocol"></a>
# **radarGetAttacksLayer3TimeseriesGroupByProtocol**
> RadarGetAttacksLayer3TimeseriesGroupByProtocol200Response radarGetAttacksLayer3TimeseriesGroupByProtocol(aggInterval, name, dateRange, dateStart, dateEnd, location, continent, ipVersion, normalization, direction, format)

Get Layer 3 Attacks By Protocol Timeseries

Percentage distribution of attacks by protocol used over time.

### Example
```java
// Import classes:
import cloudflare.ApiClient;
import cloudflare.ApiException;
import cloudflare.Configuration;
import cloudflare.auth.*;
import cloudflare.models.*;
import cloudflare.sdk.RadarAttacksApi;

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

    RadarAttacksApi apiInstance = new RadarAttacksApi(defaultClient);
    String aggInterval = "15m"; // String | 
    List<String> name = Arrays.asList(); // List<String> | 
    List<String> dateRange = Arrays.asList(); // List<String> | 
    List<OffsetDateTime> dateStart = Arrays.asList(); // List<OffsetDateTime> | 
    List<OffsetDateTime> dateEnd = Arrays.asList(); // List<OffsetDateTime> | 
    List<String> location = Arrays.asList(); // List<String> | 
    List<String> continent = Arrays.asList(); // List<String> | 
    List<String> ipVersion = Arrays.asList(); // List<String> | 
    String normalization = "PERCENTAGE"; // String | 
    String direction = "ORIGIN"; // String | 
    String format = "JSON"; // String | 
    try {
      RadarGetAttacksLayer3TimeseriesGroupByProtocol200Response result = apiInstance.radarGetAttacksLayer3TimeseriesGroupByProtocol(aggInterval, name, dateRange, dateStart, dateEnd, location, continent, ipVersion, normalization, direction, format);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling RadarAttacksApi#radarGetAttacksLayer3TimeseriesGroupByProtocol");
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
| **location** | [**List&lt;String&gt;**](String.md)|  | [optional] |
| **continent** | [**List&lt;String&gt;**](String.md)|  | [optional] |
| **ipVersion** | [**List&lt;String&gt;**](String.md)|  | [optional] [enum: IPv4, IPv6] |
| **normalization** | **String**|  | [optional] [default to PERCENTAGE] [enum: PERCENTAGE, MIN0_MAX] |
| **direction** | **String**|  | [optional] [default to ORIGIN] [enum: ORIGIN, TARGET] |
| **format** | **String**|  | [optional] [enum: JSON, CSV] |

### Return type

[**RadarGetAttacksLayer3TimeseriesGroupByProtocol200Response**](RadarGetAttacksLayer3TimeseriesGroupByProtocol200Response.md)

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

<a id="radarGetAttacksLayer3TimeseriesGroupByVector"></a>
# **radarGetAttacksLayer3TimeseriesGroupByVector**
> RadarGetAttacksLayer3TimeseriesGroupByVector200Response radarGetAttacksLayer3TimeseriesGroupByVector(aggInterval, name, dateRange, dateStart, dateEnd, location, continent, ipVersion, protocol, normalization, direction, limitPerGroup, format)

Get Layer 3 Attacks By Vector

Percentage distribution of attacks by vector used over time.

### Example
```java
// Import classes:
import cloudflare.ApiClient;
import cloudflare.ApiException;
import cloudflare.Configuration;
import cloudflare.auth.*;
import cloudflare.models.*;
import cloudflare.sdk.RadarAttacksApi;

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

    RadarAttacksApi apiInstance = new RadarAttacksApi(defaultClient);
    String aggInterval = "15m"; // String | 
    List<String> name = Arrays.asList(); // List<String> | 
    List<String> dateRange = Arrays.asList(); // List<String> | 
    List<OffsetDateTime> dateStart = Arrays.asList(); // List<OffsetDateTime> | 
    List<OffsetDateTime> dateEnd = Arrays.asList(); // List<OffsetDateTime> | 
    List<String> location = Arrays.asList(); // List<String> | 
    List<String> continent = Arrays.asList(); // List<String> | 
    List<String> ipVersion = Arrays.asList(); // List<String> | 
    List<String> protocol = Arrays.asList(); // List<String> | 
    String normalization = "PERCENTAGE"; // String | 
    String direction = "ORIGIN"; // String | 
    Integer limitPerGroup = 4; // Integer | 
    String format = "JSON"; // String | 
    try {
      RadarGetAttacksLayer3TimeseriesGroupByVector200Response result = apiInstance.radarGetAttacksLayer3TimeseriesGroupByVector(aggInterval, name, dateRange, dateStart, dateEnd, location, continent, ipVersion, protocol, normalization, direction, limitPerGroup, format);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling RadarAttacksApi#radarGetAttacksLayer3TimeseriesGroupByVector");
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
| **location** | [**List&lt;String&gt;**](String.md)|  | [optional] |
| **continent** | [**List&lt;String&gt;**](String.md)|  | [optional] |
| **ipVersion** | [**List&lt;String&gt;**](String.md)|  | [optional] [enum: IPv4, IPv6] |
| **protocol** | [**List&lt;String&gt;**](String.md)|  | [optional] [enum: UDP, TCP, ICMP, GRE] |
| **normalization** | **String**|  | [optional] [default to PERCENTAGE] [enum: PERCENTAGE, MIN0_MAX] |
| **direction** | **String**|  | [optional] [default to ORIGIN] [enum: ORIGIN, TARGET] |
| **limitPerGroup** | **Integer**|  | [optional] |
| **format** | **String**|  | [optional] [enum: JSON, CSV] |

### Return type

[**RadarGetAttacksLayer3TimeseriesGroupByVector200Response**](RadarGetAttacksLayer3TimeseriesGroupByVector200Response.md)

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

<a id="radarGetAttacksLayer3TimeseriesGroupByVertical"></a>
# **radarGetAttacksLayer3TimeseriesGroupByVertical**
> RadarGetAttacksLayer3TimeseriesGroupByVertical200Response radarGetAttacksLayer3TimeseriesGroupByVertical(aggInterval, name, dateRange, dateStart, dateEnd, location, continent, ipVersion, normalization, direction, limitPerGroup, format)

Get Layer 3 Attacks By Vertical Time Series

Percentage distribution of attacks by vertical used over time.

### Example
```java
// Import classes:
import cloudflare.ApiClient;
import cloudflare.ApiException;
import cloudflare.Configuration;
import cloudflare.auth.*;
import cloudflare.models.*;
import cloudflare.sdk.RadarAttacksApi;

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

    RadarAttacksApi apiInstance = new RadarAttacksApi(defaultClient);
    String aggInterval = "15m"; // String | 
    List<String> name = Arrays.asList(); // List<String> | 
    List<String> dateRange = Arrays.asList(); // List<String> | 
    List<OffsetDateTime> dateStart = Arrays.asList(); // List<OffsetDateTime> | 
    List<OffsetDateTime> dateEnd = Arrays.asList(); // List<OffsetDateTime> | 
    List<String> location = Arrays.asList(); // List<String> | 
    List<String> continent = Arrays.asList(); // List<String> | 
    List<String> ipVersion = Arrays.asList(); // List<String> | 
    String normalization = "PERCENTAGE"; // String | 
    String direction = "ORIGIN"; // String | 
    Integer limitPerGroup = 4; // Integer | 
    String format = "JSON"; // String | 
    try {
      RadarGetAttacksLayer3TimeseriesGroupByVertical200Response result = apiInstance.radarGetAttacksLayer3TimeseriesGroupByVertical(aggInterval, name, dateRange, dateStart, dateEnd, location, continent, ipVersion, normalization, direction, limitPerGroup, format);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling RadarAttacksApi#radarGetAttacksLayer3TimeseriesGroupByVertical");
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
| **location** | [**List&lt;String&gt;**](String.md)|  | [optional] |
| **continent** | [**List&lt;String&gt;**](String.md)|  | [optional] |
| **ipVersion** | [**List&lt;String&gt;**](String.md)|  | [optional] [enum: IPv4, IPv6] |
| **normalization** | **String**|  | [optional] [default to PERCENTAGE] [enum: PERCENTAGE, MIN0_MAX] |
| **direction** | **String**|  | [optional] [default to ORIGIN] [enum: ORIGIN, TARGET] |
| **limitPerGroup** | **Integer**|  | [optional] |
| **format** | **String**|  | [optional] [enum: JSON, CSV] |

### Return type

[**RadarGetAttacksLayer3TimeseriesGroupByVertical200Response**](RadarGetAttacksLayer3TimeseriesGroupByVertical200Response.md)

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

<a id="radarGetAttacksLayer3TimeseriesGroups"></a>
# **radarGetAttacksLayer3TimeseriesGroups**
> RadarGetAttacksLayer3TimeseriesGroups200Response radarGetAttacksLayer3TimeseriesGroups(aggInterval, name, dateRange, dateStart, dateEnd, asn, location, continent, format)

Get Layer 3 Attacks By Network Protocol Time Series

Get a timeseries of the percentage distribution of network protocols in Layer 3/4 attacks.

### Example
```java
// Import classes:
import cloudflare.ApiClient;
import cloudflare.ApiException;
import cloudflare.Configuration;
import cloudflare.auth.*;
import cloudflare.models.*;
import cloudflare.sdk.RadarAttacksApi;

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

    RadarAttacksApi apiInstance = new RadarAttacksApi(defaultClient);
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
      RadarGetAttacksLayer3TimeseriesGroups200Response result = apiInstance.radarGetAttacksLayer3TimeseriesGroups(aggInterval, name, dateRange, dateStart, dateEnd, asn, location, continent, format);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling RadarAttacksApi#radarGetAttacksLayer3TimeseriesGroups");
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

[**RadarGetAttacksLayer3TimeseriesGroups200Response**](RadarGetAttacksLayer3TimeseriesGroups200Response.md)

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

<a id="radarGetAttacksLayer3TopAttacks"></a>
# **radarGetAttacksLayer3TopAttacks**
> RadarGetAttacksLayer3TopAttacks200Response radarGetAttacksLayer3TopAttacks(limit, name, dateRange, dateStart, dateEnd, location, continent, ipVersion, protocol, limitDirection, limitPerLocation, format)

Get top attack pairs (origin and target locations) of Layer 3 attacks

Get the top attacks from origin to target location. Values are a percentage out of the total layer 3 attacks (with billing country). You can optionally limit the number of attacks per origin/target location (useful if all the top attacks are from or to the same location).

### Example
```java
// Import classes:
import cloudflare.ApiClient;
import cloudflare.ApiException;
import cloudflare.Configuration;
import cloudflare.auth.*;
import cloudflare.models.*;
import cloudflare.sdk.RadarAttacksApi;

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

    RadarAttacksApi apiInstance = new RadarAttacksApi(defaultClient);
    Integer limit = 5; // Integer | 
    List<String> name = Arrays.asList(); // List<String> | 
    List<String> dateRange = Arrays.asList(); // List<String> | 
    List<OffsetDateTime> dateStart = Arrays.asList(); // List<OffsetDateTime> | 
    List<OffsetDateTime> dateEnd = Arrays.asList(); // List<OffsetDateTime> | 
    List<String> location = Arrays.asList(); // List<String> | 
    List<String> continent = Arrays.asList(); // List<String> | 
    List<String> ipVersion = Arrays.asList(); // List<String> | 
    List<String> protocol = Arrays.asList(); // List<String> | 
    String limitDirection = "ORIGIN"; // String | 
    Integer limitPerLocation = 10; // Integer | 
    String format = "JSON"; // String | 
    try {
      RadarGetAttacksLayer3TopAttacks200Response result = apiInstance.radarGetAttacksLayer3TopAttacks(limit, name, dateRange, dateStart, dateEnd, location, continent, ipVersion, protocol, limitDirection, limitPerLocation, format);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling RadarAttacksApi#radarGetAttacksLayer3TopAttacks");
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
| **limit** | **Integer**|  | [optional] |
| **name** | [**List&lt;String&gt;**](String.md)|  | [optional] |
| **dateRange** | [**List&lt;String&gt;**](String.md)|  | [optional] [enum: 1d, 2d, 7d, 14d, 28d, 12w, 24w, 52w, 1dControl, 2dControl, 7dControl, 14dControl, 28dControl, 12wControl, 24wControl] |
| **dateStart** | [**List&lt;OffsetDateTime&gt;**](OffsetDateTime.md)|  | [optional] |
| **dateEnd** | [**List&lt;OffsetDateTime&gt;**](OffsetDateTime.md)|  | [optional] |
| **location** | [**List&lt;String&gt;**](String.md)|  | [optional] |
| **continent** | [**List&lt;String&gt;**](String.md)|  | [optional] |
| **ipVersion** | [**List&lt;String&gt;**](String.md)|  | [optional] [enum: IPv4, IPv6] |
| **protocol** | [**List&lt;String&gt;**](String.md)|  | [optional] [enum: UDP, TCP, ICMP, GRE] |
| **limitDirection** | **String**|  | [optional] [default to ORIGIN] [enum: ORIGIN, TARGET] |
| **limitPerLocation** | **Integer**|  | [optional] |
| **format** | **String**|  | [optional] [enum: JSON, CSV] |

### Return type

[**RadarGetAttacksLayer3TopAttacks200Response**](RadarGetAttacksLayer3TopAttacks200Response.md)

### Authorization

[api_key](../README.md#api_key), [api_token](../README.md#api_token), [api_email](../README.md#api_email)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successful Response |  -  |
| **404** | Not found |  -  |

<a id="radarGetAttacksLayer3TopIndustries"></a>
# **radarGetAttacksLayer3TopIndustries**
> RadarGetAttacksLayer3TopIndustries200Response radarGetAttacksLayer3TopIndustries(limit, name, dateRange, dateStart, dateEnd, location, continent, ipVersion, protocol, format)

Get top Industry of attack

Get the Industry of attacks.

### Example
```java
// Import classes:
import cloudflare.ApiClient;
import cloudflare.ApiException;
import cloudflare.Configuration;
import cloudflare.auth.*;
import cloudflare.models.*;
import cloudflare.sdk.RadarAttacksApi;

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

    RadarAttacksApi apiInstance = new RadarAttacksApi(defaultClient);
    Integer limit = 5; // Integer | 
    List<String> name = Arrays.asList(); // List<String> | 
    List<String> dateRange = Arrays.asList(); // List<String> | 
    List<OffsetDateTime> dateStart = Arrays.asList(); // List<OffsetDateTime> | 
    List<OffsetDateTime> dateEnd = Arrays.asList(); // List<OffsetDateTime> | 
    List<String> location = Arrays.asList(); // List<String> | 
    List<String> continent = Arrays.asList(); // List<String> | 
    List<String> ipVersion = Arrays.asList(); // List<String> | 
    List<String> protocol = Arrays.asList(); // List<String> | 
    String format = "JSON"; // String | 
    try {
      RadarGetAttacksLayer3TopIndustries200Response result = apiInstance.radarGetAttacksLayer3TopIndustries(limit, name, dateRange, dateStart, dateEnd, location, continent, ipVersion, protocol, format);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling RadarAttacksApi#radarGetAttacksLayer3TopIndustries");
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
| **limit** | **Integer**|  | [optional] |
| **name** | [**List&lt;String&gt;**](String.md)|  | [optional] |
| **dateRange** | [**List&lt;String&gt;**](String.md)|  | [optional] [enum: 1d, 2d, 7d, 14d, 28d, 12w, 24w, 52w, 1dControl, 2dControl, 7dControl, 14dControl, 28dControl, 12wControl, 24wControl] |
| **dateStart** | [**List&lt;OffsetDateTime&gt;**](OffsetDateTime.md)|  | [optional] |
| **dateEnd** | [**List&lt;OffsetDateTime&gt;**](OffsetDateTime.md)|  | [optional] |
| **location** | [**List&lt;String&gt;**](String.md)|  | [optional] |
| **continent** | [**List&lt;String&gt;**](String.md)|  | [optional] |
| **ipVersion** | [**List&lt;String&gt;**](String.md)|  | [optional] [enum: IPv4, IPv6] |
| **protocol** | [**List&lt;String&gt;**](String.md)|  | [optional] [enum: UDP, TCP, ICMP, GRE] |
| **format** | **String**|  | [optional] [enum: JSON, CSV] |

### Return type

[**RadarGetAttacksLayer3TopIndustries200Response**](RadarGetAttacksLayer3TopIndustries200Response.md)

### Authorization

[api_key](../README.md#api_key), [api_token](../README.md#api_token), [api_email](../README.md#api_email)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successful Response |  -  |
| **404** | Not found |  -  |

<a id="radarGetAttacksLayer3TopOriginLocations"></a>
# **radarGetAttacksLayer3TopOriginLocations**
> RadarGetAttacksLayer3TopOriginLocations200Response radarGetAttacksLayer3TopOriginLocations(limit, name, dateRange, dateStart, dateEnd, location, continent, ipVersion, protocol, format)

Get top origin locations of attack

Get the origin locations of attacks.

### Example
```java
// Import classes:
import cloudflare.ApiClient;
import cloudflare.ApiException;
import cloudflare.Configuration;
import cloudflare.auth.*;
import cloudflare.models.*;
import cloudflare.sdk.RadarAttacksApi;

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

    RadarAttacksApi apiInstance = new RadarAttacksApi(defaultClient);
    Integer limit = 5; // Integer | 
    List<String> name = Arrays.asList(); // List<String> | 
    List<String> dateRange = Arrays.asList(); // List<String> | 
    List<OffsetDateTime> dateStart = Arrays.asList(); // List<OffsetDateTime> | 
    List<OffsetDateTime> dateEnd = Arrays.asList(); // List<OffsetDateTime> | 
    List<String> location = Arrays.asList(); // List<String> | 
    List<String> continent = Arrays.asList(); // List<String> | 
    List<String> ipVersion = Arrays.asList(); // List<String> | 
    List<String> protocol = Arrays.asList(); // List<String> | 
    String format = "JSON"; // String | 
    try {
      RadarGetAttacksLayer3TopOriginLocations200Response result = apiInstance.radarGetAttacksLayer3TopOriginLocations(limit, name, dateRange, dateStart, dateEnd, location, continent, ipVersion, protocol, format);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling RadarAttacksApi#radarGetAttacksLayer3TopOriginLocations");
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
| **limit** | **Integer**|  | [optional] |
| **name** | [**List&lt;String&gt;**](String.md)|  | [optional] |
| **dateRange** | [**List&lt;String&gt;**](String.md)|  | [optional] [enum: 1d, 2d, 7d, 14d, 28d, 12w, 24w, 52w, 1dControl, 2dControl, 7dControl, 14dControl, 28dControl, 12wControl, 24wControl] |
| **dateStart** | [**List&lt;OffsetDateTime&gt;**](OffsetDateTime.md)|  | [optional] |
| **dateEnd** | [**List&lt;OffsetDateTime&gt;**](OffsetDateTime.md)|  | [optional] |
| **location** | [**List&lt;String&gt;**](String.md)|  | [optional] |
| **continent** | [**List&lt;String&gt;**](String.md)|  | [optional] |
| **ipVersion** | [**List&lt;String&gt;**](String.md)|  | [optional] [enum: IPv4, IPv6] |
| **protocol** | [**List&lt;String&gt;**](String.md)|  | [optional] [enum: UDP, TCP, ICMP, GRE] |
| **format** | **String**|  | [optional] [enum: JSON, CSV] |

### Return type

[**RadarGetAttacksLayer3TopOriginLocations200Response**](RadarGetAttacksLayer3TopOriginLocations200Response.md)

### Authorization

[api_key](../README.md#api_key), [api_token](../README.md#api_token), [api_email](../README.md#api_email)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successful Response |  -  |
| **404** | Not found |  -  |

<a id="radarGetAttacksLayer3TopTargetLocations"></a>
# **radarGetAttacksLayer3TopTargetLocations**
> RadarGetAttacksLayer3TopTargetLocations200Response radarGetAttacksLayer3TopTargetLocations(limit, name, dateRange, dateStart, dateEnd, location, continent, ipVersion, protocol, format)

Get top target locations of attack

Get the target locations of attacks.

### Example
```java
// Import classes:
import cloudflare.ApiClient;
import cloudflare.ApiException;
import cloudflare.Configuration;
import cloudflare.auth.*;
import cloudflare.models.*;
import cloudflare.sdk.RadarAttacksApi;

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

    RadarAttacksApi apiInstance = new RadarAttacksApi(defaultClient);
    Integer limit = 5; // Integer | 
    List<String> name = Arrays.asList(); // List<String> | 
    List<String> dateRange = Arrays.asList(); // List<String> | 
    List<OffsetDateTime> dateStart = Arrays.asList(); // List<OffsetDateTime> | 
    List<OffsetDateTime> dateEnd = Arrays.asList(); // List<OffsetDateTime> | 
    List<String> location = Arrays.asList(); // List<String> | 
    List<String> continent = Arrays.asList(); // List<String> | 
    List<String> ipVersion = Arrays.asList(); // List<String> | 
    List<String> protocol = Arrays.asList(); // List<String> | 
    String format = "JSON"; // String | 
    try {
      RadarGetAttacksLayer3TopTargetLocations200Response result = apiInstance.radarGetAttacksLayer3TopTargetLocations(limit, name, dateRange, dateStart, dateEnd, location, continent, ipVersion, protocol, format);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling RadarAttacksApi#radarGetAttacksLayer3TopTargetLocations");
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
| **limit** | **Integer**|  | [optional] |
| **name** | [**List&lt;String&gt;**](String.md)|  | [optional] |
| **dateRange** | [**List&lt;String&gt;**](String.md)|  | [optional] [enum: 1d, 2d, 7d, 14d, 28d, 12w, 24w, 52w, 1dControl, 2dControl, 7dControl, 14dControl, 28dControl, 12wControl, 24wControl] |
| **dateStart** | [**List&lt;OffsetDateTime&gt;**](OffsetDateTime.md)|  | [optional] |
| **dateEnd** | [**List&lt;OffsetDateTime&gt;**](OffsetDateTime.md)|  | [optional] |
| **location** | [**List&lt;String&gt;**](String.md)|  | [optional] |
| **continent** | [**List&lt;String&gt;**](String.md)|  | [optional] |
| **ipVersion** | [**List&lt;String&gt;**](String.md)|  | [optional] [enum: IPv4, IPv6] |
| **protocol** | [**List&lt;String&gt;**](String.md)|  | [optional] [enum: UDP, TCP, ICMP, GRE] |
| **format** | **String**|  | [optional] [enum: JSON, CSV] |

### Return type

[**RadarGetAttacksLayer3TopTargetLocations200Response**](RadarGetAttacksLayer3TopTargetLocations200Response.md)

### Authorization

[api_key](../README.md#api_key), [api_token](../README.md#api_token), [api_email](../README.md#api_email)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successful Response |  -  |
| **404** | Not found |  -  |

<a id="radarGetAttacksLayer3TopVerticals"></a>
# **radarGetAttacksLayer3TopVerticals**
> RadarGetAttacksLayer3TopVerticals200Response radarGetAttacksLayer3TopVerticals(limit, name, dateRange, dateStart, dateEnd, location, continent, ipVersion, protocol, format)

Get top Verticals of attack

Get the Verticals of attacks.

### Example
```java
// Import classes:
import cloudflare.ApiClient;
import cloudflare.ApiException;
import cloudflare.Configuration;
import cloudflare.auth.*;
import cloudflare.models.*;
import cloudflare.sdk.RadarAttacksApi;

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

    RadarAttacksApi apiInstance = new RadarAttacksApi(defaultClient);
    Integer limit = 5; // Integer | 
    List<String> name = Arrays.asList(); // List<String> | 
    List<String> dateRange = Arrays.asList(); // List<String> | 
    List<OffsetDateTime> dateStart = Arrays.asList(); // List<OffsetDateTime> | 
    List<OffsetDateTime> dateEnd = Arrays.asList(); // List<OffsetDateTime> | 
    List<String> location = Arrays.asList(); // List<String> | 
    List<String> continent = Arrays.asList(); // List<String> | 
    List<String> ipVersion = Arrays.asList(); // List<String> | 
    List<String> protocol = Arrays.asList(); // List<String> | 
    String format = "JSON"; // String | 
    try {
      RadarGetAttacksLayer3TopVerticals200Response result = apiInstance.radarGetAttacksLayer3TopVerticals(limit, name, dateRange, dateStart, dateEnd, location, continent, ipVersion, protocol, format);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling RadarAttacksApi#radarGetAttacksLayer3TopVerticals");
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
| **limit** | **Integer**|  | [optional] |
| **name** | [**List&lt;String&gt;**](String.md)|  | [optional] |
| **dateRange** | [**List&lt;String&gt;**](String.md)|  | [optional] [enum: 1d, 2d, 7d, 14d, 28d, 12w, 24w, 52w, 1dControl, 2dControl, 7dControl, 14dControl, 28dControl, 12wControl, 24wControl] |
| **dateStart** | [**List&lt;OffsetDateTime&gt;**](OffsetDateTime.md)|  | [optional] |
| **dateEnd** | [**List&lt;OffsetDateTime&gt;**](OffsetDateTime.md)|  | [optional] |
| **location** | [**List&lt;String&gt;**](String.md)|  | [optional] |
| **continent** | [**List&lt;String&gt;**](String.md)|  | [optional] |
| **ipVersion** | [**List&lt;String&gt;**](String.md)|  | [optional] [enum: IPv4, IPv6] |
| **protocol** | [**List&lt;String&gt;**](String.md)|  | [optional] [enum: UDP, TCP, ICMP, GRE] |
| **format** | **String**|  | [optional] [enum: JSON, CSV] |

### Return type

[**RadarGetAttacksLayer3TopVerticals200Response**](RadarGetAttacksLayer3TopVerticals200Response.md)

### Authorization

[api_key](../README.md#api_key), [api_token](../README.md#api_token), [api_email](../README.md#api_email)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successful Response |  -  |
| **404** | Not found |  -  |

<a id="radarGetAttacksLayer7Summary"></a>
# **radarGetAttacksLayer7Summary**
> RadarGetAttacksLayer7Summary200Response radarGetAttacksLayer7Summary(name, dateRange, dateStart, dateEnd, asn, location, continent, format)

Get Layer 7 Attacks Summary

Percentage distribution of mitigation techniques in Layer 7 attacks.

### Example
```java
// Import classes:
import cloudflare.ApiClient;
import cloudflare.ApiException;
import cloudflare.Configuration;
import cloudflare.auth.*;
import cloudflare.models.*;
import cloudflare.sdk.RadarAttacksApi;

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

    RadarAttacksApi apiInstance = new RadarAttacksApi(defaultClient);
    List<String> name = Arrays.asList(); // List<String> | 
    List<String> dateRange = Arrays.asList(); // List<String> | 
    List<OffsetDateTime> dateStart = Arrays.asList(); // List<OffsetDateTime> | 
    List<OffsetDateTime> dateEnd = Arrays.asList(); // List<OffsetDateTime> | 
    List<String> asn = Arrays.asList(); // List<String> | 
    List<String> location = Arrays.asList(); // List<String> | 
    List<String> continent = Arrays.asList(); // List<String> | 
    String format = "JSON"; // String | 
    try {
      RadarGetAttacksLayer7Summary200Response result = apiInstance.radarGetAttacksLayer7Summary(name, dateRange, dateStart, dateEnd, asn, location, continent, format);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling RadarAttacksApi#radarGetAttacksLayer7Summary");
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

[**RadarGetAttacksLayer7Summary200Response**](RadarGetAttacksLayer7Summary200Response.md)

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

<a id="radarGetAttacksLayer7SummaryByHttpMethod"></a>
# **radarGetAttacksLayer7SummaryByHttpMethod**
> RadarGetAttacksLayer7SummaryByHttpMethod200Response radarGetAttacksLayer7SummaryByHttpMethod(name, dateRange, dateStart, dateEnd, asn, location, continent, ipVersion, httpVersion, mitigationProduct, format)

Get HTTP Method Summary

Percentage distribution of attacks by http method used.

### Example
```java
// Import classes:
import cloudflare.ApiClient;
import cloudflare.ApiException;
import cloudflare.Configuration;
import cloudflare.auth.*;
import cloudflare.models.*;
import cloudflare.sdk.RadarAttacksApi;

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

    RadarAttacksApi apiInstance = new RadarAttacksApi(defaultClient);
    List<String> name = Arrays.asList(); // List<String> | 
    List<String> dateRange = Arrays.asList(); // List<String> | 
    List<OffsetDateTime> dateStart = Arrays.asList(); // List<OffsetDateTime> | 
    List<OffsetDateTime> dateEnd = Arrays.asList(); // List<OffsetDateTime> | 
    List<String> asn = Arrays.asList(); // List<String> | 
    List<String> location = Arrays.asList(); // List<String> | 
    List<String> continent = Arrays.asList(); // List<String> | 
    List<String> ipVersion = Arrays.asList(); // List<String> | 
    List<String> httpVersion = Arrays.asList(); // List<String> | 
    List<String> mitigationProduct = Arrays.asList(); // List<String> | 
    String format = "JSON"; // String | 
    try {
      RadarGetAttacksLayer7SummaryByHttpMethod200Response result = apiInstance.radarGetAttacksLayer7SummaryByHttpMethod(name, dateRange, dateStart, dateEnd, asn, location, continent, ipVersion, httpVersion, mitigationProduct, format);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling RadarAttacksApi#radarGetAttacksLayer7SummaryByHttpMethod");
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
| **ipVersion** | [**List&lt;String&gt;**](String.md)|  | [optional] [enum: IPv4, IPv6] |
| **httpVersion** | [**List&lt;String&gt;**](String.md)|  | [optional] [enum: HTTPv1, HTTPv2, HTTPv3] |
| **mitigationProduct** | [**List&lt;String&gt;**](String.md)|  | [optional] [enum: DDOS, WAF, BOT_MANAGEMENT, ACCESS_RULES, IP_REPUTATION, API_SHIELD, DATA_LOSS_PREVENTION] |
| **format** | **String**|  | [optional] [enum: JSON, CSV] |

### Return type

[**RadarGetAttacksLayer7SummaryByHttpMethod200Response**](RadarGetAttacksLayer7SummaryByHttpMethod200Response.md)

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

<a id="radarGetAttacksLayer7SummaryByHttpVersion"></a>
# **radarGetAttacksLayer7SummaryByHttpVersion**
> RadarGetAttacksLayer7SummaryByHttpVersion200Response radarGetAttacksLayer7SummaryByHttpVersion(name, dateRange, dateStart, dateEnd, asn, location, continent, ipVersion, httpMethod, mitigationProduct, format)

Get HTTP Version Summary

Percentage distribution of attacks by http version used.

### Example
```java
// Import classes:
import cloudflare.ApiClient;
import cloudflare.ApiException;
import cloudflare.Configuration;
import cloudflare.auth.*;
import cloudflare.models.*;
import cloudflare.sdk.RadarAttacksApi;

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

    RadarAttacksApi apiInstance = new RadarAttacksApi(defaultClient);
    List<String> name = Arrays.asList(); // List<String> | 
    List<String> dateRange = Arrays.asList(); // List<String> | 
    List<OffsetDateTime> dateStart = Arrays.asList(); // List<OffsetDateTime> | 
    List<OffsetDateTime> dateEnd = Arrays.asList(); // List<OffsetDateTime> | 
    List<String> asn = Arrays.asList(); // List<String> | 
    List<String> location = Arrays.asList(); // List<String> | 
    List<String> continent = Arrays.asList(); // List<String> | 
    List<String> ipVersion = Arrays.asList(); // List<String> | 
    List<String> httpMethod = Arrays.asList(); // List<String> | 
    List<String> mitigationProduct = Arrays.asList(); // List<String> | 
    String format = "JSON"; // String | 
    try {
      RadarGetAttacksLayer7SummaryByHttpVersion200Response result = apiInstance.radarGetAttacksLayer7SummaryByHttpVersion(name, dateRange, dateStart, dateEnd, asn, location, continent, ipVersion, httpMethod, mitigationProduct, format);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling RadarAttacksApi#radarGetAttacksLayer7SummaryByHttpVersion");
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
| **ipVersion** | [**List&lt;String&gt;**](String.md)|  | [optional] [enum: IPv4, IPv6] |
| **httpMethod** | [**List&lt;String&gt;**](String.md)|  | [optional] [enum: GET, POST, DELETE, PUT, HEAD, PURGE, OPTIONS, PROPFIND, MKCOL, PATCH, ACL, BCOPY, BDELETE, BMOVE, BPROPFIND, BPROPPATCH, CHECKIN, CHECKOUT, CONNECT, COPY, LABEL, LOCK, MERGE, MKACTIVITY, MKWORKSPACE, MOVE, NOTIFY, ORDERPATCH, POLL, PROPPATCH, REPORT, SEARCH, SUBSCRIBE, TRACE, UNCHECKOUT, UNLOCK, UNSUBSCRIBE, UPDATE, VERSIONCONTROL, BASELINECONTROL, XMSENUMATTS, RPC_OUT_DATA, RPC_IN_DATA, JSON, COOK, TRACK] |
| **mitigationProduct** | [**List&lt;String&gt;**](String.md)|  | [optional] [enum: DDOS, WAF, BOT_MANAGEMENT, ACCESS_RULES, IP_REPUTATION, API_SHIELD, DATA_LOSS_PREVENTION] |
| **format** | **String**|  | [optional] [enum: JSON, CSV] |

### Return type

[**RadarGetAttacksLayer7SummaryByHttpVersion200Response**](RadarGetAttacksLayer7SummaryByHttpVersion200Response.md)

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

<a id="radarGetAttacksLayer7SummaryByIpVersion"></a>
# **radarGetAttacksLayer7SummaryByIpVersion**
> RadarGetAttacksLayer7SummaryByIpVersion200Response radarGetAttacksLayer7SummaryByIpVersion(name, dateRange, dateStart, dateEnd, asn, location, continent, httpVersion, httpMethod, mitigationProduct, format)

Get Ip Version Summary

Percentage distribution of attacks by ip version used.

### Example
```java
// Import classes:
import cloudflare.ApiClient;
import cloudflare.ApiException;
import cloudflare.Configuration;
import cloudflare.auth.*;
import cloudflare.models.*;
import cloudflare.sdk.RadarAttacksApi;

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

    RadarAttacksApi apiInstance = new RadarAttacksApi(defaultClient);
    List<String> name = Arrays.asList(); // List<String> | 
    List<String> dateRange = Arrays.asList(); // List<String> | 
    List<OffsetDateTime> dateStart = Arrays.asList(); // List<OffsetDateTime> | 
    List<OffsetDateTime> dateEnd = Arrays.asList(); // List<OffsetDateTime> | 
    List<String> asn = Arrays.asList(); // List<String> | 
    List<String> location = Arrays.asList(); // List<String> | 
    List<String> continent = Arrays.asList(); // List<String> | 
    List<String> httpVersion = Arrays.asList(); // List<String> | 
    List<String> httpMethod = Arrays.asList(); // List<String> | 
    List<String> mitigationProduct = Arrays.asList(); // List<String> | 
    String format = "JSON"; // String | 
    try {
      RadarGetAttacksLayer7SummaryByIpVersion200Response result = apiInstance.radarGetAttacksLayer7SummaryByIpVersion(name, dateRange, dateStart, dateEnd, asn, location, continent, httpVersion, httpMethod, mitigationProduct, format);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling RadarAttacksApi#radarGetAttacksLayer7SummaryByIpVersion");
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
| **httpVersion** | [**List&lt;String&gt;**](String.md)|  | [optional] [enum: HTTPv1, HTTPv2, HTTPv3] |
| **httpMethod** | [**List&lt;String&gt;**](String.md)|  | [optional] [enum: GET, POST, DELETE, PUT, HEAD, PURGE, OPTIONS, PROPFIND, MKCOL, PATCH, ACL, BCOPY, BDELETE, BMOVE, BPROPFIND, BPROPPATCH, CHECKIN, CHECKOUT, CONNECT, COPY, LABEL, LOCK, MERGE, MKACTIVITY, MKWORKSPACE, MOVE, NOTIFY, ORDERPATCH, POLL, PROPPATCH, REPORT, SEARCH, SUBSCRIBE, TRACE, UNCHECKOUT, UNLOCK, UNSUBSCRIBE, UPDATE, VERSIONCONTROL, BASELINECONTROL, XMSENUMATTS, RPC_OUT_DATA, RPC_IN_DATA, JSON, COOK, TRACK] |
| **mitigationProduct** | [**List&lt;String&gt;**](String.md)|  | [optional] [enum: DDOS, WAF, BOT_MANAGEMENT, ACCESS_RULES, IP_REPUTATION, API_SHIELD, DATA_LOSS_PREVENTION] |
| **format** | **String**|  | [optional] [enum: JSON, CSV] |

### Return type

[**RadarGetAttacksLayer7SummaryByIpVersion200Response**](RadarGetAttacksLayer7SummaryByIpVersion200Response.md)

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

<a id="radarGetAttacksLayer7SummaryByManagedRules"></a>
# **radarGetAttacksLayer7SummaryByManagedRules**
> RadarGetAttacksLayer7SummaryByManagedRules200Response radarGetAttacksLayer7SummaryByManagedRules(name, dateRange, dateStart, dateEnd, asn, location, continent, ipVersion, httpVersion, httpMethod, mitigationProduct, format)

Get Managed Rules Summary

Percentage distribution of attacks by managed rules used.

### Example
```java
// Import classes:
import cloudflare.ApiClient;
import cloudflare.ApiException;
import cloudflare.Configuration;
import cloudflare.auth.*;
import cloudflare.models.*;
import cloudflare.sdk.RadarAttacksApi;

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

    RadarAttacksApi apiInstance = new RadarAttacksApi(defaultClient);
    List<String> name = Arrays.asList(); // List<String> | 
    List<String> dateRange = Arrays.asList(); // List<String> | 
    List<OffsetDateTime> dateStart = Arrays.asList(); // List<OffsetDateTime> | 
    List<OffsetDateTime> dateEnd = Arrays.asList(); // List<OffsetDateTime> | 
    List<String> asn = Arrays.asList(); // List<String> | 
    List<String> location = Arrays.asList(); // List<String> | 
    List<String> continent = Arrays.asList(); // List<String> | 
    List<String> ipVersion = Arrays.asList(); // List<String> | 
    List<String> httpVersion = Arrays.asList(); // List<String> | 
    List<String> httpMethod = Arrays.asList(); // List<String> | 
    List<String> mitigationProduct = Arrays.asList(); // List<String> | 
    String format = "JSON"; // String | 
    try {
      RadarGetAttacksLayer7SummaryByManagedRules200Response result = apiInstance.radarGetAttacksLayer7SummaryByManagedRules(name, dateRange, dateStart, dateEnd, asn, location, continent, ipVersion, httpVersion, httpMethod, mitigationProduct, format);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling RadarAttacksApi#radarGetAttacksLayer7SummaryByManagedRules");
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
| **ipVersion** | [**List&lt;String&gt;**](String.md)|  | [optional] [enum: IPv4, IPv6] |
| **httpVersion** | [**List&lt;String&gt;**](String.md)|  | [optional] [enum: HTTPv1, HTTPv2, HTTPv3] |
| **httpMethod** | [**List&lt;String&gt;**](String.md)|  | [optional] [enum: GET, POST, DELETE, PUT, HEAD, PURGE, OPTIONS, PROPFIND, MKCOL, PATCH, ACL, BCOPY, BDELETE, BMOVE, BPROPFIND, BPROPPATCH, CHECKIN, CHECKOUT, CONNECT, COPY, LABEL, LOCK, MERGE, MKACTIVITY, MKWORKSPACE, MOVE, NOTIFY, ORDERPATCH, POLL, PROPPATCH, REPORT, SEARCH, SUBSCRIBE, TRACE, UNCHECKOUT, UNLOCK, UNSUBSCRIBE, UPDATE, VERSIONCONTROL, BASELINECONTROL, XMSENUMATTS, RPC_OUT_DATA, RPC_IN_DATA, JSON, COOK, TRACK] |
| **mitigationProduct** | [**List&lt;String&gt;**](String.md)|  | [optional] [enum: DDOS, WAF, BOT_MANAGEMENT, ACCESS_RULES, IP_REPUTATION, API_SHIELD, DATA_LOSS_PREVENTION] |
| **format** | **String**|  | [optional] [enum: JSON, CSV] |

### Return type

[**RadarGetAttacksLayer7SummaryByManagedRules200Response**](RadarGetAttacksLayer7SummaryByManagedRules200Response.md)

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

<a id="radarGetAttacksLayer7SummaryByMitigationProduct"></a>
# **radarGetAttacksLayer7SummaryByMitigationProduct**
> RadarGetAttacksLayer7SummaryByMitigationProduct200Response radarGetAttacksLayer7SummaryByMitigationProduct(name, dateRange, dateStart, dateEnd, asn, location, continent, ipVersion, httpVersion, httpMethod, format)

Get Mitigation Product Summary

Percentage distribution of attacks by mitigation product used.

### Example
```java
// Import classes:
import cloudflare.ApiClient;
import cloudflare.ApiException;
import cloudflare.Configuration;
import cloudflare.auth.*;
import cloudflare.models.*;
import cloudflare.sdk.RadarAttacksApi;

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

    RadarAttacksApi apiInstance = new RadarAttacksApi(defaultClient);
    List<String> name = Arrays.asList(); // List<String> | 
    List<String> dateRange = Arrays.asList(); // List<String> | 
    List<OffsetDateTime> dateStart = Arrays.asList(); // List<OffsetDateTime> | 
    List<OffsetDateTime> dateEnd = Arrays.asList(); // List<OffsetDateTime> | 
    List<String> asn = Arrays.asList(); // List<String> | 
    List<String> location = Arrays.asList(); // List<String> | 
    List<String> continent = Arrays.asList(); // List<String> | 
    List<String> ipVersion = Arrays.asList(); // List<String> | 
    List<String> httpVersion = Arrays.asList(); // List<String> | 
    List<String> httpMethod = Arrays.asList(); // List<String> | 
    String format = "JSON"; // String | 
    try {
      RadarGetAttacksLayer7SummaryByMitigationProduct200Response result = apiInstance.radarGetAttacksLayer7SummaryByMitigationProduct(name, dateRange, dateStart, dateEnd, asn, location, continent, ipVersion, httpVersion, httpMethod, format);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling RadarAttacksApi#radarGetAttacksLayer7SummaryByMitigationProduct");
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
| **ipVersion** | [**List&lt;String&gt;**](String.md)|  | [optional] [enum: IPv4, IPv6] |
| **httpVersion** | [**List&lt;String&gt;**](String.md)|  | [optional] [enum: HTTPv1, HTTPv2, HTTPv3] |
| **httpMethod** | [**List&lt;String&gt;**](String.md)|  | [optional] [enum: GET, POST, DELETE, PUT, HEAD, PURGE, OPTIONS, PROPFIND, MKCOL, PATCH, ACL, BCOPY, BDELETE, BMOVE, BPROPFIND, BPROPPATCH, CHECKIN, CHECKOUT, CONNECT, COPY, LABEL, LOCK, MERGE, MKACTIVITY, MKWORKSPACE, MOVE, NOTIFY, ORDERPATCH, POLL, PROPPATCH, REPORT, SEARCH, SUBSCRIBE, TRACE, UNCHECKOUT, UNLOCK, UNSUBSCRIBE, UPDATE, VERSIONCONTROL, BASELINECONTROL, XMSENUMATTS, RPC_OUT_DATA, RPC_IN_DATA, JSON, COOK, TRACK] |
| **format** | **String**|  | [optional] [enum: JSON, CSV] |

### Return type

[**RadarGetAttacksLayer7SummaryByMitigationProduct200Response**](RadarGetAttacksLayer7SummaryByMitigationProduct200Response.md)

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

<a id="radarGetAttacksLayer7Timeseries"></a>
# **radarGetAttacksLayer7Timeseries**
> RadarGetDnsAs112Timeseries200Response radarGetAttacksLayer7Timeseries(aggInterval, name, dateRange, dateStart, dateEnd, attack, asn, location, continent, normalization, format)

Get Layer 7 Attacks Time Series

Get a timeseries of Layer 7 attacks. Values represent HTTP requests and are normalized using min-max by default.

### Example
```java
// Import classes:
import cloudflare.ApiClient;
import cloudflare.ApiException;
import cloudflare.Configuration;
import cloudflare.auth.*;
import cloudflare.models.*;
import cloudflare.sdk.RadarAttacksApi;

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

    RadarAttacksApi apiInstance = new RadarAttacksApi(defaultClient);
    String aggInterval = "15m"; // String | 
    List<String> name = Arrays.asList(); // List<String> | 
    List<String> dateRange = Arrays.asList(); // List<String> | 
    List<OffsetDateTime> dateStart = Arrays.asList(); // List<OffsetDateTime> | 
    List<OffsetDateTime> dateEnd = Arrays.asList(); // List<OffsetDateTime> | 
    List<String> attack = Arrays.asList(); // List<String> | 
    List<String> asn = Arrays.asList(); // List<String> | 
    List<String> location = Arrays.asList(); // List<String> | 
    List<String> continent = Arrays.asList(); // List<String> | 
    String normalization = "PERCENTAGE_CHANGE"; // String | 
    String format = "JSON"; // String | 
    try {
      RadarGetDnsAs112Timeseries200Response result = apiInstance.radarGetAttacksLayer7Timeseries(aggInterval, name, dateRange, dateStart, dateEnd, attack, asn, location, continent, normalization, format);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling RadarAttacksApi#radarGetAttacksLayer7Timeseries");
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
| **attack** | [**List&lt;String&gt;**](String.md)|  | [optional] [enum: DDOS, WAF, BOT_MANAGEMENT, ACCESS_RULES, IP_REPUTATION, API_SHIELD, DATA_LOSS_PREVENTION] |
| **asn** | [**List&lt;String&gt;**](String.md)|  | [optional] |
| **location** | [**List&lt;String&gt;**](String.md)|  | [optional] |
| **continent** | [**List&lt;String&gt;**](String.md)|  | [optional] |
| **normalization** | **String**|  | [optional] [enum: PERCENTAGE_CHANGE, MIN0_MAX] |
| **format** | **String**|  | [optional] [enum: JSON, CSV] |

### Return type

[**RadarGetDnsAs112Timeseries200Response**](RadarGetDnsAs112Timeseries200Response.md)

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

<a id="radarGetAttacksLayer7TimeseriesGroup"></a>
# **radarGetAttacksLayer7TimeseriesGroup**
> RadarGetAttacksLayer7TimeseriesGroup200Response radarGetAttacksLayer7TimeseriesGroup(aggInterval, name, dateRange, dateStart, dateEnd, asn, location, continent, format)

Get Layer 7 Attacks By Mitigation Technique Time Series

Get a time series of the percentual distribution of mitigation techniques, over time.

### Example
```java
// Import classes:
import cloudflare.ApiClient;
import cloudflare.ApiException;
import cloudflare.Configuration;
import cloudflare.auth.*;
import cloudflare.models.*;
import cloudflare.sdk.RadarAttacksApi;

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

    RadarAttacksApi apiInstance = new RadarAttacksApi(defaultClient);
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
      RadarGetAttacksLayer7TimeseriesGroup200Response result = apiInstance.radarGetAttacksLayer7TimeseriesGroup(aggInterval, name, dateRange, dateStart, dateEnd, asn, location, continent, format);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling RadarAttacksApi#radarGetAttacksLayer7TimeseriesGroup");
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

[**RadarGetAttacksLayer7TimeseriesGroup200Response**](RadarGetAttacksLayer7TimeseriesGroup200Response.md)

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

<a id="radarGetAttacksLayer7TimeseriesGroupByHttpMethod"></a>
# **radarGetAttacksLayer7TimeseriesGroupByHttpMethod**
> RadarGetAttacksLayer7TimeseriesGroupByHttpMethod200Response radarGetAttacksLayer7TimeseriesGroupByHttpMethod(aggInterval, name, dateRange, dateStart, dateEnd, asn, location, continent, ipVersion, httpVersion, mitigationProduct, normalization, format)

Get Layer 7 Attacks By HTTP Method Time Series

Percentage distribution of attacks by http method used over time.

### Example
```java
// Import classes:
import cloudflare.ApiClient;
import cloudflare.ApiException;
import cloudflare.Configuration;
import cloudflare.auth.*;
import cloudflare.models.*;
import cloudflare.sdk.RadarAttacksApi;

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

    RadarAttacksApi apiInstance = new RadarAttacksApi(defaultClient);
    String aggInterval = "15m"; // String | 
    List<String> name = Arrays.asList(); // List<String> | 
    List<String> dateRange = Arrays.asList(); // List<String> | 
    List<OffsetDateTime> dateStart = Arrays.asList(); // List<OffsetDateTime> | 
    List<OffsetDateTime> dateEnd = Arrays.asList(); // List<OffsetDateTime> | 
    List<String> asn = Arrays.asList(); // List<String> | 
    List<String> location = Arrays.asList(); // List<String> | 
    List<String> continent = Arrays.asList(); // List<String> | 
    List<String> ipVersion = Arrays.asList(); // List<String> | 
    List<String> httpVersion = Arrays.asList(); // List<String> | 
    List<String> mitigationProduct = Arrays.asList(); // List<String> | 
    String normalization = "PERCENTAGE"; // String | 
    String format = "JSON"; // String | 
    try {
      RadarGetAttacksLayer7TimeseriesGroupByHttpMethod200Response result = apiInstance.radarGetAttacksLayer7TimeseriesGroupByHttpMethod(aggInterval, name, dateRange, dateStart, dateEnd, asn, location, continent, ipVersion, httpVersion, mitigationProduct, normalization, format);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling RadarAttacksApi#radarGetAttacksLayer7TimeseriesGroupByHttpMethod");
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
| **ipVersion** | [**List&lt;String&gt;**](String.md)|  | [optional] [enum: IPv4, IPv6] |
| **httpVersion** | [**List&lt;String&gt;**](String.md)|  | [optional] [enum: HTTPv1, HTTPv2, HTTPv3] |
| **mitigationProduct** | [**List&lt;String&gt;**](String.md)|  | [optional] [enum: DDOS, WAF, BOT_MANAGEMENT, ACCESS_RULES, IP_REPUTATION, API_SHIELD, DATA_LOSS_PREVENTION] |
| **normalization** | **String**|  | [optional] [default to PERCENTAGE] [enum: PERCENTAGE, MIN0_MAX] |
| **format** | **String**|  | [optional] [enum: JSON, CSV] |

### Return type

[**RadarGetAttacksLayer7TimeseriesGroupByHttpMethod200Response**](RadarGetAttacksLayer7TimeseriesGroupByHttpMethod200Response.md)

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

<a id="radarGetAttacksLayer7TimeseriesGroupByHttpVersion"></a>
# **radarGetAttacksLayer7TimeseriesGroupByHttpVersion**
> RadarGetAttacksLayer7TimeseriesGroupByHttpVersion200Response radarGetAttacksLayer7TimeseriesGroupByHttpVersion(aggInterval, name, dateRange, dateStart, dateEnd, asn, location, continent, ipVersion, httpMethod, mitigationProduct, normalization, format)

Get Layer 7 Attacks By HTTP Version Time Series

Percentage distribution of attacks by http version used over time.

### Example
```java
// Import classes:
import cloudflare.ApiClient;
import cloudflare.ApiException;
import cloudflare.Configuration;
import cloudflare.auth.*;
import cloudflare.models.*;
import cloudflare.sdk.RadarAttacksApi;

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

    RadarAttacksApi apiInstance = new RadarAttacksApi(defaultClient);
    String aggInterval = "15m"; // String | 
    List<String> name = Arrays.asList(); // List<String> | 
    List<String> dateRange = Arrays.asList(); // List<String> | 
    List<OffsetDateTime> dateStart = Arrays.asList(); // List<OffsetDateTime> | 
    List<OffsetDateTime> dateEnd = Arrays.asList(); // List<OffsetDateTime> | 
    List<String> asn = Arrays.asList(); // List<String> | 
    List<String> location = Arrays.asList(); // List<String> | 
    List<String> continent = Arrays.asList(); // List<String> | 
    List<String> ipVersion = Arrays.asList(); // List<String> | 
    List<String> httpMethod = Arrays.asList(); // List<String> | 
    List<String> mitigationProduct = Arrays.asList(); // List<String> | 
    String normalization = "PERCENTAGE"; // String | 
    String format = "JSON"; // String | 
    try {
      RadarGetAttacksLayer7TimeseriesGroupByHttpVersion200Response result = apiInstance.radarGetAttacksLayer7TimeseriesGroupByHttpVersion(aggInterval, name, dateRange, dateStart, dateEnd, asn, location, continent, ipVersion, httpMethod, mitigationProduct, normalization, format);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling RadarAttacksApi#radarGetAttacksLayer7TimeseriesGroupByHttpVersion");
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
| **ipVersion** | [**List&lt;String&gt;**](String.md)|  | [optional] [enum: IPv4, IPv6] |
| **httpMethod** | [**List&lt;String&gt;**](String.md)|  | [optional] [enum: GET, POST, DELETE, PUT, HEAD, PURGE, OPTIONS, PROPFIND, MKCOL, PATCH, ACL, BCOPY, BDELETE, BMOVE, BPROPFIND, BPROPPATCH, CHECKIN, CHECKOUT, CONNECT, COPY, LABEL, LOCK, MERGE, MKACTIVITY, MKWORKSPACE, MOVE, NOTIFY, ORDERPATCH, POLL, PROPPATCH, REPORT, SEARCH, SUBSCRIBE, TRACE, UNCHECKOUT, UNLOCK, UNSUBSCRIBE, UPDATE, VERSIONCONTROL, BASELINECONTROL, XMSENUMATTS, RPC_OUT_DATA, RPC_IN_DATA, JSON, COOK, TRACK] |
| **mitigationProduct** | [**List&lt;String&gt;**](String.md)|  | [optional] [enum: DDOS, WAF, BOT_MANAGEMENT, ACCESS_RULES, IP_REPUTATION, API_SHIELD, DATA_LOSS_PREVENTION] |
| **normalization** | **String**|  | [optional] [default to PERCENTAGE] [enum: PERCENTAGE, MIN0_MAX] |
| **format** | **String**|  | [optional] [enum: JSON, CSV] |

### Return type

[**RadarGetAttacksLayer7TimeseriesGroupByHttpVersion200Response**](RadarGetAttacksLayer7TimeseriesGroupByHttpVersion200Response.md)

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

<a id="radarGetAttacksLayer7TimeseriesGroupByIndustry"></a>
# **radarGetAttacksLayer7TimeseriesGroupByIndustry**
> RadarGetAttacksLayer3TimeseriesGroupByIndustry200Response radarGetAttacksLayer7TimeseriesGroupByIndustry(aggInterval, name, dateRange, dateStart, dateEnd, asn, location, continent, ipVersion, httpVersion, httpMethod, mitigationProduct, normalization, limitPerGroup, format)

Get Layer 7 Attacks By Target Industries Time Series

Percentage distribution of attacks by industry used over time.

### Example
```java
// Import classes:
import cloudflare.ApiClient;
import cloudflare.ApiException;
import cloudflare.Configuration;
import cloudflare.auth.*;
import cloudflare.models.*;
import cloudflare.sdk.RadarAttacksApi;

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

    RadarAttacksApi apiInstance = new RadarAttacksApi(defaultClient);
    String aggInterval = "15m"; // String | 
    List<String> name = Arrays.asList(); // List<String> | 
    List<String> dateRange = Arrays.asList(); // List<String> | 
    List<OffsetDateTime> dateStart = Arrays.asList(); // List<OffsetDateTime> | 
    List<OffsetDateTime> dateEnd = Arrays.asList(); // List<OffsetDateTime> | 
    List<String> asn = Arrays.asList(); // List<String> | 
    List<String> location = Arrays.asList(); // List<String> | 
    List<String> continent = Arrays.asList(); // List<String> | 
    List<String> ipVersion = Arrays.asList(); // List<String> | 
    List<String> httpVersion = Arrays.asList(); // List<String> | 
    List<String> httpMethod = Arrays.asList(); // List<String> | 
    List<String> mitigationProduct = Arrays.asList(); // List<String> | 
    String normalization = "PERCENTAGE"; // String | 
    Integer limitPerGroup = 4; // Integer | 
    String format = "JSON"; // String | 
    try {
      RadarGetAttacksLayer3TimeseriesGroupByIndustry200Response result = apiInstance.radarGetAttacksLayer7TimeseriesGroupByIndustry(aggInterval, name, dateRange, dateStart, dateEnd, asn, location, continent, ipVersion, httpVersion, httpMethod, mitigationProduct, normalization, limitPerGroup, format);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling RadarAttacksApi#radarGetAttacksLayer7TimeseriesGroupByIndustry");
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
| **ipVersion** | [**List&lt;String&gt;**](String.md)|  | [optional] [enum: IPv4, IPv6] |
| **httpVersion** | [**List&lt;String&gt;**](String.md)|  | [optional] [enum: HTTPv1, HTTPv2, HTTPv3] |
| **httpMethod** | [**List&lt;String&gt;**](String.md)|  | [optional] [enum: GET, POST, DELETE, PUT, HEAD, PURGE, OPTIONS, PROPFIND, MKCOL, PATCH, ACL, BCOPY, BDELETE, BMOVE, BPROPFIND, BPROPPATCH, CHECKIN, CHECKOUT, CONNECT, COPY, LABEL, LOCK, MERGE, MKACTIVITY, MKWORKSPACE, MOVE, NOTIFY, ORDERPATCH, POLL, PROPPATCH, REPORT, SEARCH, SUBSCRIBE, TRACE, UNCHECKOUT, UNLOCK, UNSUBSCRIBE, UPDATE, VERSIONCONTROL, BASELINECONTROL, XMSENUMATTS, RPC_OUT_DATA, RPC_IN_DATA, JSON, COOK, TRACK] |
| **mitigationProduct** | [**List&lt;String&gt;**](String.md)|  | [optional] [enum: DDOS, WAF, BOT_MANAGEMENT, ACCESS_RULES, IP_REPUTATION, API_SHIELD, DATA_LOSS_PREVENTION] |
| **normalization** | **String**|  | [optional] [default to PERCENTAGE] [enum: PERCENTAGE, MIN0_MAX] |
| **limitPerGroup** | **Integer**|  | [optional] |
| **format** | **String**|  | [optional] [enum: JSON, CSV] |

### Return type

[**RadarGetAttacksLayer3TimeseriesGroupByIndustry200Response**](RadarGetAttacksLayer3TimeseriesGroupByIndustry200Response.md)

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

<a id="radarGetAttacksLayer7TimeseriesGroupByIpVersion"></a>
# **radarGetAttacksLayer7TimeseriesGroupByIpVersion**
> RadarGetAttacksLayer7TimeseriesGroupByIpVersion200Response radarGetAttacksLayer7TimeseriesGroupByIpVersion(aggInterval, name, dateRange, dateStart, dateEnd, asn, location, continent, httpVersion, httpMethod, mitigationProduct, normalization, format)

Get Layer 7 Attacks By IP Version Time Series

Percentage distribution of attacks by ip version used over time.

### Example
```java
// Import classes:
import cloudflare.ApiClient;
import cloudflare.ApiException;
import cloudflare.Configuration;
import cloudflare.auth.*;
import cloudflare.models.*;
import cloudflare.sdk.RadarAttacksApi;

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

    RadarAttacksApi apiInstance = new RadarAttacksApi(defaultClient);
    String aggInterval = "15m"; // String | 
    List<String> name = Arrays.asList(); // List<String> | 
    List<String> dateRange = Arrays.asList(); // List<String> | 
    List<OffsetDateTime> dateStart = Arrays.asList(); // List<OffsetDateTime> | 
    List<OffsetDateTime> dateEnd = Arrays.asList(); // List<OffsetDateTime> | 
    List<String> asn = Arrays.asList(); // List<String> | 
    List<String> location = Arrays.asList(); // List<String> | 
    List<String> continent = Arrays.asList(); // List<String> | 
    List<String> httpVersion = Arrays.asList(); // List<String> | 
    List<String> httpMethod = Arrays.asList(); // List<String> | 
    List<String> mitigationProduct = Arrays.asList(); // List<String> | 
    String normalization = "PERCENTAGE"; // String | 
    String format = "JSON"; // String | 
    try {
      RadarGetAttacksLayer7TimeseriesGroupByIpVersion200Response result = apiInstance.radarGetAttacksLayer7TimeseriesGroupByIpVersion(aggInterval, name, dateRange, dateStart, dateEnd, asn, location, continent, httpVersion, httpMethod, mitigationProduct, normalization, format);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling RadarAttacksApi#radarGetAttacksLayer7TimeseriesGroupByIpVersion");
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
| **httpVersion** | [**List&lt;String&gt;**](String.md)|  | [optional] [enum: HTTPv1, HTTPv2, HTTPv3] |
| **httpMethod** | [**List&lt;String&gt;**](String.md)|  | [optional] [enum: GET, POST, DELETE, PUT, HEAD, PURGE, OPTIONS, PROPFIND, MKCOL, PATCH, ACL, BCOPY, BDELETE, BMOVE, BPROPFIND, BPROPPATCH, CHECKIN, CHECKOUT, CONNECT, COPY, LABEL, LOCK, MERGE, MKACTIVITY, MKWORKSPACE, MOVE, NOTIFY, ORDERPATCH, POLL, PROPPATCH, REPORT, SEARCH, SUBSCRIBE, TRACE, UNCHECKOUT, UNLOCK, UNSUBSCRIBE, UPDATE, VERSIONCONTROL, BASELINECONTROL, XMSENUMATTS, RPC_OUT_DATA, RPC_IN_DATA, JSON, COOK, TRACK] |
| **mitigationProduct** | [**List&lt;String&gt;**](String.md)|  | [optional] [enum: DDOS, WAF, BOT_MANAGEMENT, ACCESS_RULES, IP_REPUTATION, API_SHIELD, DATA_LOSS_PREVENTION] |
| **normalization** | **String**|  | [optional] [default to PERCENTAGE] [enum: PERCENTAGE, MIN0_MAX] |
| **format** | **String**|  | [optional] [enum: JSON, CSV] |

### Return type

[**RadarGetAttacksLayer7TimeseriesGroupByIpVersion200Response**](RadarGetAttacksLayer7TimeseriesGroupByIpVersion200Response.md)

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

<a id="radarGetAttacksLayer7TimeseriesGroupByManagedRules"></a>
# **radarGetAttacksLayer7TimeseriesGroupByManagedRules**
> RadarGetAttacksLayer7TimeseriesGroupByManagedRules200Response radarGetAttacksLayer7TimeseriesGroupByManagedRules(aggInterval, name, dateRange, dateStart, dateEnd, asn, location, continent, ipVersion, httpVersion, httpMethod, mitigationProduct, normalization, format)

Get Layer 7 Attacks By Managed Rules Time Series

Percentage distribution of attacks by managed rules used over time.

### Example
```java
// Import classes:
import cloudflare.ApiClient;
import cloudflare.ApiException;
import cloudflare.Configuration;
import cloudflare.auth.*;
import cloudflare.models.*;
import cloudflare.sdk.RadarAttacksApi;

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

    RadarAttacksApi apiInstance = new RadarAttacksApi(defaultClient);
    String aggInterval = "15m"; // String | 
    List<String> name = Arrays.asList(); // List<String> | 
    List<String> dateRange = Arrays.asList(); // List<String> | 
    List<OffsetDateTime> dateStart = Arrays.asList(); // List<OffsetDateTime> | 
    List<OffsetDateTime> dateEnd = Arrays.asList(); // List<OffsetDateTime> | 
    List<String> asn = Arrays.asList(); // List<String> | 
    List<String> location = Arrays.asList(); // List<String> | 
    List<String> continent = Arrays.asList(); // List<String> | 
    List<String> ipVersion = Arrays.asList(); // List<String> | 
    List<String> httpVersion = Arrays.asList(); // List<String> | 
    List<String> httpMethod = Arrays.asList(); // List<String> | 
    List<String> mitigationProduct = Arrays.asList(); // List<String> | 
    String normalization = "PERCENTAGE"; // String | 
    String format = "JSON"; // String | 
    try {
      RadarGetAttacksLayer7TimeseriesGroupByManagedRules200Response result = apiInstance.radarGetAttacksLayer7TimeseriesGroupByManagedRules(aggInterval, name, dateRange, dateStart, dateEnd, asn, location, continent, ipVersion, httpVersion, httpMethod, mitigationProduct, normalization, format);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling RadarAttacksApi#radarGetAttacksLayer7TimeseriesGroupByManagedRules");
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
| **ipVersion** | [**List&lt;String&gt;**](String.md)|  | [optional] [enum: IPv4, IPv6] |
| **httpVersion** | [**List&lt;String&gt;**](String.md)|  | [optional] [enum: HTTPv1, HTTPv2, HTTPv3] |
| **httpMethod** | [**List&lt;String&gt;**](String.md)|  | [optional] [enum: GET, POST, DELETE, PUT, HEAD, PURGE, OPTIONS, PROPFIND, MKCOL, PATCH, ACL, BCOPY, BDELETE, BMOVE, BPROPFIND, BPROPPATCH, CHECKIN, CHECKOUT, CONNECT, COPY, LABEL, LOCK, MERGE, MKACTIVITY, MKWORKSPACE, MOVE, NOTIFY, ORDERPATCH, POLL, PROPPATCH, REPORT, SEARCH, SUBSCRIBE, TRACE, UNCHECKOUT, UNLOCK, UNSUBSCRIBE, UPDATE, VERSIONCONTROL, BASELINECONTROL, XMSENUMATTS, RPC_OUT_DATA, RPC_IN_DATA, JSON, COOK, TRACK] |
| **mitigationProduct** | [**List&lt;String&gt;**](String.md)|  | [optional] [enum: DDOS, WAF, BOT_MANAGEMENT, ACCESS_RULES, IP_REPUTATION, API_SHIELD, DATA_LOSS_PREVENTION] |
| **normalization** | **String**|  | [optional] [default to PERCENTAGE] [enum: PERCENTAGE, MIN0_MAX] |
| **format** | **String**|  | [optional] [enum: JSON, CSV] |

### Return type

[**RadarGetAttacksLayer7TimeseriesGroupByManagedRules200Response**](RadarGetAttacksLayer7TimeseriesGroupByManagedRules200Response.md)

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

<a id="radarGetAttacksLayer7TimeseriesGroupByMitigationProduct"></a>
# **radarGetAttacksLayer7TimeseriesGroupByMitigationProduct**
> RadarGetAttacksLayer7TimeseriesGroupByMitigationProduct200Response radarGetAttacksLayer7TimeseriesGroupByMitigationProduct(aggInterval, name, dateRange, dateStart, dateEnd, asn, location, continent, ipVersion, httpVersion, httpMethod, normalization, format)

Get Layer 7 Attacks By Mitigation Product Time Series

Percentage distribution of attacks by mitigation product used over time.

### Example
```java
// Import classes:
import cloudflare.ApiClient;
import cloudflare.ApiException;
import cloudflare.Configuration;
import cloudflare.auth.*;
import cloudflare.models.*;
import cloudflare.sdk.RadarAttacksApi;

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

    RadarAttacksApi apiInstance = new RadarAttacksApi(defaultClient);
    String aggInterval = "15m"; // String | 
    List<String> name = Arrays.asList(); // List<String> | 
    List<String> dateRange = Arrays.asList(); // List<String> | 
    List<OffsetDateTime> dateStart = Arrays.asList(); // List<OffsetDateTime> | 
    List<OffsetDateTime> dateEnd = Arrays.asList(); // List<OffsetDateTime> | 
    List<String> asn = Arrays.asList(); // List<String> | 
    List<String> location = Arrays.asList(); // List<String> | 
    List<String> continent = Arrays.asList(); // List<String> | 
    List<String> ipVersion = Arrays.asList(); // List<String> | 
    List<String> httpVersion = Arrays.asList(); // List<String> | 
    List<String> httpMethod = Arrays.asList(); // List<String> | 
    String normalization = "PERCENTAGE"; // String | 
    String format = "JSON"; // String | 
    try {
      RadarGetAttacksLayer7TimeseriesGroupByMitigationProduct200Response result = apiInstance.radarGetAttacksLayer7TimeseriesGroupByMitigationProduct(aggInterval, name, dateRange, dateStart, dateEnd, asn, location, continent, ipVersion, httpVersion, httpMethod, normalization, format);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling RadarAttacksApi#radarGetAttacksLayer7TimeseriesGroupByMitigationProduct");
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
| **ipVersion** | [**List&lt;String&gt;**](String.md)|  | [optional] [enum: IPv4, IPv6] |
| **httpVersion** | [**List&lt;String&gt;**](String.md)|  | [optional] [enum: HTTPv1, HTTPv2, HTTPv3] |
| **httpMethod** | [**List&lt;String&gt;**](String.md)|  | [optional] [enum: GET, POST, DELETE, PUT, HEAD, PURGE, OPTIONS, PROPFIND, MKCOL, PATCH, ACL, BCOPY, BDELETE, BMOVE, BPROPFIND, BPROPPATCH, CHECKIN, CHECKOUT, CONNECT, COPY, LABEL, LOCK, MERGE, MKACTIVITY, MKWORKSPACE, MOVE, NOTIFY, ORDERPATCH, POLL, PROPPATCH, REPORT, SEARCH, SUBSCRIBE, TRACE, UNCHECKOUT, UNLOCK, UNSUBSCRIBE, UPDATE, VERSIONCONTROL, BASELINECONTROL, XMSENUMATTS, RPC_OUT_DATA, RPC_IN_DATA, JSON, COOK, TRACK] |
| **normalization** | **String**|  | [optional] [default to PERCENTAGE] [enum: PERCENTAGE, MIN0_MAX] |
| **format** | **String**|  | [optional] [enum: JSON, CSV] |

### Return type

[**RadarGetAttacksLayer7TimeseriesGroupByMitigationProduct200Response**](RadarGetAttacksLayer7TimeseriesGroupByMitigationProduct200Response.md)

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

<a id="radarGetAttacksLayer7TimeseriesGroupByVertical"></a>
# **radarGetAttacksLayer7TimeseriesGroupByVertical**
> RadarGetAttacksLayer3TimeseriesGroupByVertical200Response radarGetAttacksLayer7TimeseriesGroupByVertical(aggInterval, name, dateRange, dateStart, dateEnd, asn, location, continent, ipVersion, httpVersion, httpMethod, mitigationProduct, normalization, limitPerGroup, format)

Get Layer 7 Attacks By Vertical Time Series

Percentage distribution of attacks by vertical used over time.

### Example
```java
// Import classes:
import cloudflare.ApiClient;
import cloudflare.ApiException;
import cloudflare.Configuration;
import cloudflare.auth.*;
import cloudflare.models.*;
import cloudflare.sdk.RadarAttacksApi;

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

    RadarAttacksApi apiInstance = new RadarAttacksApi(defaultClient);
    String aggInterval = "15m"; // String | 
    List<String> name = Arrays.asList(); // List<String> | 
    List<String> dateRange = Arrays.asList(); // List<String> | 
    List<OffsetDateTime> dateStart = Arrays.asList(); // List<OffsetDateTime> | 
    List<OffsetDateTime> dateEnd = Arrays.asList(); // List<OffsetDateTime> | 
    List<String> asn = Arrays.asList(); // List<String> | 
    List<String> location = Arrays.asList(); // List<String> | 
    List<String> continent = Arrays.asList(); // List<String> | 
    List<String> ipVersion = Arrays.asList(); // List<String> | 
    List<String> httpVersion = Arrays.asList(); // List<String> | 
    List<String> httpMethod = Arrays.asList(); // List<String> | 
    List<String> mitigationProduct = Arrays.asList(); // List<String> | 
    String normalization = "PERCENTAGE"; // String | 
    Integer limitPerGroup = 4; // Integer | 
    String format = "JSON"; // String | 
    try {
      RadarGetAttacksLayer3TimeseriesGroupByVertical200Response result = apiInstance.radarGetAttacksLayer7TimeseriesGroupByVertical(aggInterval, name, dateRange, dateStart, dateEnd, asn, location, continent, ipVersion, httpVersion, httpMethod, mitigationProduct, normalization, limitPerGroup, format);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling RadarAttacksApi#radarGetAttacksLayer7TimeseriesGroupByVertical");
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
| **ipVersion** | [**List&lt;String&gt;**](String.md)|  | [optional] [enum: IPv4, IPv6] |
| **httpVersion** | [**List&lt;String&gt;**](String.md)|  | [optional] [enum: HTTPv1, HTTPv2, HTTPv3] |
| **httpMethod** | [**List&lt;String&gt;**](String.md)|  | [optional] [enum: GET, POST, DELETE, PUT, HEAD, PURGE, OPTIONS, PROPFIND, MKCOL, PATCH, ACL, BCOPY, BDELETE, BMOVE, BPROPFIND, BPROPPATCH, CHECKIN, CHECKOUT, CONNECT, COPY, LABEL, LOCK, MERGE, MKACTIVITY, MKWORKSPACE, MOVE, NOTIFY, ORDERPATCH, POLL, PROPPATCH, REPORT, SEARCH, SUBSCRIBE, TRACE, UNCHECKOUT, UNLOCK, UNSUBSCRIBE, UPDATE, VERSIONCONTROL, BASELINECONTROL, XMSENUMATTS, RPC_OUT_DATA, RPC_IN_DATA, JSON, COOK, TRACK] |
| **mitigationProduct** | [**List&lt;String&gt;**](String.md)|  | [optional] [enum: DDOS, WAF, BOT_MANAGEMENT, ACCESS_RULES, IP_REPUTATION, API_SHIELD, DATA_LOSS_PREVENTION] |
| **normalization** | **String**|  | [optional] [default to PERCENTAGE] [enum: PERCENTAGE, MIN0_MAX] |
| **limitPerGroup** | **Integer**|  | [optional] |
| **format** | **String**|  | [optional] [enum: JSON, CSV] |

### Return type

[**RadarGetAttacksLayer3TimeseriesGroupByVertical200Response**](RadarGetAttacksLayer3TimeseriesGroupByVertical200Response.md)

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

<a id="radarGetAttacksLayer7TopAttacks"></a>
# **radarGetAttacksLayer7TopAttacks**
> RadarGetAttacksLayer7TopAttacks200Response radarGetAttacksLayer7TopAttacks(limit, name, dateRange, dateStart, dateEnd, asn, location, continent, limitDirection, limitPerLocation, magnitude, format)

Get Top Attack Pairs (origin and target locations) By Layer 7 Attacks

Get the top attacks from origin to target location. Values are a percentage out of the total layer 7 attacks (with billing country). The attack magnitude can be defined by the number of mitigated requests or by the number of zones affected. You can optionally limit the number of attacks per origin/target location (useful if all the top attacks are from or to the same location).

### Example
```java
// Import classes:
import cloudflare.ApiClient;
import cloudflare.ApiException;
import cloudflare.Configuration;
import cloudflare.auth.*;
import cloudflare.models.*;
import cloudflare.sdk.RadarAttacksApi;

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

    RadarAttacksApi apiInstance = new RadarAttacksApi(defaultClient);
    Integer limit = 5; // Integer | 
    List<String> name = Arrays.asList(); // List<String> | 
    List<String> dateRange = Arrays.asList(); // List<String> | 
    List<OffsetDateTime> dateStart = Arrays.asList(); // List<OffsetDateTime> | 
    List<OffsetDateTime> dateEnd = Arrays.asList(); // List<OffsetDateTime> | 
    List<String> asn = Arrays.asList(); // List<String> | 
    List<String> location = Arrays.asList(); // List<String> | 
    List<String> continent = Arrays.asList(); // List<String> | 
    String limitDirection = "ORIGIN"; // String | 
    Integer limitPerLocation = 10; // Integer | 
    String magnitude = "AFFECTED_ZONES"; // String | 
    String format = "JSON"; // String | 
    try {
      RadarGetAttacksLayer7TopAttacks200Response result = apiInstance.radarGetAttacksLayer7TopAttacks(limit, name, dateRange, dateStart, dateEnd, asn, location, continent, limitDirection, limitPerLocation, magnitude, format);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling RadarAttacksApi#radarGetAttacksLayer7TopAttacks");
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
| **limit** | **Integer**|  | [optional] |
| **name** | [**List&lt;String&gt;**](String.md)|  | [optional] |
| **dateRange** | [**List&lt;String&gt;**](String.md)|  | [optional] [enum: 1d, 2d, 7d, 14d, 28d, 12w, 24w, 52w, 1dControl, 2dControl, 7dControl, 14dControl, 28dControl, 12wControl, 24wControl] |
| **dateStart** | [**List&lt;OffsetDateTime&gt;**](OffsetDateTime.md)|  | [optional] |
| **dateEnd** | [**List&lt;OffsetDateTime&gt;**](OffsetDateTime.md)|  | [optional] |
| **asn** | [**List&lt;String&gt;**](String.md)|  | [optional] |
| **location** | [**List&lt;String&gt;**](String.md)|  | [optional] |
| **continent** | [**List&lt;String&gt;**](String.md)|  | [optional] |
| **limitDirection** | **String**|  | [optional] [default to ORIGIN] [enum: ORIGIN, TARGET] |
| **limitPerLocation** | **Integer**|  | [optional] |
| **magnitude** | **String**|  | [optional] [enum: AFFECTED_ZONES, MITIGATED_REQUESTS] |
| **format** | **String**|  | [optional] [enum: JSON, CSV] |

### Return type

[**RadarGetAttacksLayer7TopAttacks200Response**](RadarGetAttacksLayer7TopAttacks200Response.md)

### Authorization

[api_key](../README.md#api_key), [api_token](../README.md#api_token), [api_email](../README.md#api_email)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successful Response |  -  |
| **404** | Not found |  -  |

<a id="radarGetAttacksLayer7TopIndustries"></a>
# **radarGetAttacksLayer7TopIndustries**
> RadarGetAttacksLayer3TopIndustries200Response radarGetAttacksLayer7TopIndustries(limit, name, dateRange, dateStart, dateEnd, asn, location, continent, format)

Get top Industry of attack

Get the Industry of attacks.

### Example
```java
// Import classes:
import cloudflare.ApiClient;
import cloudflare.ApiException;
import cloudflare.Configuration;
import cloudflare.auth.*;
import cloudflare.models.*;
import cloudflare.sdk.RadarAttacksApi;

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

    RadarAttacksApi apiInstance = new RadarAttacksApi(defaultClient);
    Integer limit = 5; // Integer | 
    List<String> name = Arrays.asList(); // List<String> | 
    List<String> dateRange = Arrays.asList(); // List<String> | 
    List<OffsetDateTime> dateStart = Arrays.asList(); // List<OffsetDateTime> | 
    List<OffsetDateTime> dateEnd = Arrays.asList(); // List<OffsetDateTime> | 
    List<String> asn = Arrays.asList(); // List<String> | 
    List<String> location = Arrays.asList(); // List<String> | 
    List<String> continent = Arrays.asList(); // List<String> | 
    String format = "JSON"; // String | 
    try {
      RadarGetAttacksLayer3TopIndustries200Response result = apiInstance.radarGetAttacksLayer7TopIndustries(limit, name, dateRange, dateStart, dateEnd, asn, location, continent, format);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling RadarAttacksApi#radarGetAttacksLayer7TopIndustries");
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
| **limit** | **Integer**|  | [optional] |
| **name** | [**List&lt;String&gt;**](String.md)|  | [optional] |
| **dateRange** | [**List&lt;String&gt;**](String.md)|  | [optional] [enum: 1d, 2d, 7d, 14d, 28d, 12w, 24w, 52w, 1dControl, 2dControl, 7dControl, 14dControl, 28dControl, 12wControl, 24wControl] |
| **dateStart** | [**List&lt;OffsetDateTime&gt;**](OffsetDateTime.md)|  | [optional] |
| **dateEnd** | [**List&lt;OffsetDateTime&gt;**](OffsetDateTime.md)|  | [optional] |
| **asn** | [**List&lt;String&gt;**](String.md)|  | [optional] |
| **location** | [**List&lt;String&gt;**](String.md)|  | [optional] |
| **continent** | [**List&lt;String&gt;**](String.md)|  | [optional] |
| **format** | **String**|  | [optional] [enum: JSON, CSV] |

### Return type

[**RadarGetAttacksLayer3TopIndustries200Response**](RadarGetAttacksLayer3TopIndustries200Response.md)

### Authorization

[api_key](../README.md#api_key), [api_token](../README.md#api_token), [api_email](../README.md#api_email)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successful Response |  -  |
| **404** | Not found |  -  |

<a id="radarGetAttacksLayer7TopOriginAs"></a>
# **radarGetAttacksLayer7TopOriginAs**
> RadarGetAttacksLayer7TopOriginAs200Response radarGetAttacksLayer7TopOriginAs(limit, name, dateRange, dateStart, dateEnd, location, continent, format)

Get Top Origin Autonomous Systems By Layer 7 Attacks

Get the top origin Autonomous Systems of and by layer 7 attacks. Values are a percentage out of the total layer 7 attacks. The origin Autonomous Systems is determined by the client IP.

### Example
```java
// Import classes:
import cloudflare.ApiClient;
import cloudflare.ApiException;
import cloudflare.Configuration;
import cloudflare.auth.*;
import cloudflare.models.*;
import cloudflare.sdk.RadarAttacksApi;

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

    RadarAttacksApi apiInstance = new RadarAttacksApi(defaultClient);
    Integer limit = 5; // Integer | 
    List<String> name = Arrays.asList(); // List<String> | 
    List<String> dateRange = Arrays.asList(); // List<String> | 
    List<OffsetDateTime> dateStart = Arrays.asList(); // List<OffsetDateTime> | 
    List<OffsetDateTime> dateEnd = Arrays.asList(); // List<OffsetDateTime> | 
    List<String> location = Arrays.asList(); // List<String> | 
    List<String> continent = Arrays.asList(); // List<String> | 
    String format = "JSON"; // String | 
    try {
      RadarGetAttacksLayer7TopOriginAs200Response result = apiInstance.radarGetAttacksLayer7TopOriginAs(limit, name, dateRange, dateStart, dateEnd, location, continent, format);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling RadarAttacksApi#radarGetAttacksLayer7TopOriginAs");
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
| **limit** | **Integer**|  | [optional] |
| **name** | [**List&lt;String&gt;**](String.md)|  | [optional] |
| **dateRange** | [**List&lt;String&gt;**](String.md)|  | [optional] [enum: 1d, 2d, 7d, 14d, 28d, 12w, 24w, 52w, 1dControl, 2dControl, 7dControl, 14dControl, 28dControl, 12wControl, 24wControl] |
| **dateStart** | [**List&lt;OffsetDateTime&gt;**](OffsetDateTime.md)|  | [optional] |
| **dateEnd** | [**List&lt;OffsetDateTime&gt;**](OffsetDateTime.md)|  | [optional] |
| **location** | [**List&lt;String&gt;**](String.md)|  | [optional] |
| **continent** | [**List&lt;String&gt;**](String.md)|  | [optional] |
| **format** | **String**|  | [optional] [enum: JSON, CSV] |

### Return type

[**RadarGetAttacksLayer7TopOriginAs200Response**](RadarGetAttacksLayer7TopOriginAs200Response.md)

### Authorization

[api_key](../README.md#api_key), [api_token](../README.md#api_token), [api_email](../README.md#api_email)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successful Response |  -  |
| **404** | Not found |  -  |

<a id="radarGetAttacksLayer7TopOriginLocation"></a>
# **radarGetAttacksLayer7TopOriginLocation**
> RadarGetAttacksLayer3TopOriginLocations200Response radarGetAttacksLayer7TopOriginLocation(limit, name, dateRange, dateStart, dateEnd, asn, continent, format)

Get Top Origin Locations By Layer 7 Attacks

Get the top origin locations of and by layer 7 attacks. Values are a percentage out of the total layer 7 attacks. The origin location is determined by the client IP.

### Example
```java
// Import classes:
import cloudflare.ApiClient;
import cloudflare.ApiException;
import cloudflare.Configuration;
import cloudflare.auth.*;
import cloudflare.models.*;
import cloudflare.sdk.RadarAttacksApi;

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

    RadarAttacksApi apiInstance = new RadarAttacksApi(defaultClient);
    Integer limit = 5; // Integer | 
    List<String> name = Arrays.asList(); // List<String> | 
    List<String> dateRange = Arrays.asList(); // List<String> | 
    List<OffsetDateTime> dateStart = Arrays.asList(); // List<OffsetDateTime> | 
    List<OffsetDateTime> dateEnd = Arrays.asList(); // List<OffsetDateTime> | 
    List<String> asn = Arrays.asList(); // List<String> | 
    List<String> continent = Arrays.asList(); // List<String> | 
    String format = "JSON"; // String | 
    try {
      RadarGetAttacksLayer3TopOriginLocations200Response result = apiInstance.radarGetAttacksLayer7TopOriginLocation(limit, name, dateRange, dateStart, dateEnd, asn, continent, format);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling RadarAttacksApi#radarGetAttacksLayer7TopOriginLocation");
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
| **limit** | **Integer**|  | [optional] |
| **name** | [**List&lt;String&gt;**](String.md)|  | [optional] |
| **dateRange** | [**List&lt;String&gt;**](String.md)|  | [optional] [enum: 1d, 2d, 7d, 14d, 28d, 12w, 24w, 52w, 1dControl, 2dControl, 7dControl, 14dControl, 28dControl, 12wControl, 24wControl] |
| **dateStart** | [**List&lt;OffsetDateTime&gt;**](OffsetDateTime.md)|  | [optional] |
| **dateEnd** | [**List&lt;OffsetDateTime&gt;**](OffsetDateTime.md)|  | [optional] |
| **asn** | [**List&lt;String&gt;**](String.md)|  | [optional] |
| **continent** | [**List&lt;String&gt;**](String.md)|  | [optional] |
| **format** | **String**|  | [optional] [enum: JSON, CSV] |

### Return type

[**RadarGetAttacksLayer3TopOriginLocations200Response**](RadarGetAttacksLayer3TopOriginLocations200Response.md)

### Authorization

[api_key](../README.md#api_key), [api_token](../README.md#api_token), [api_email](../README.md#api_email)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successful Response |  -  |
| **404** | Not found |  -  |

<a id="radarGetAttacksLayer7TopTargetLocation"></a>
# **radarGetAttacksLayer7TopTargetLocation**
> RadarGetAttacksLayer3TopTargetLocations200Response radarGetAttacksLayer7TopTargetLocation(limit, name, dateRange, dateStart, dateEnd, continent, format)

Get layer 7 top target locations

Get the top target locations of and by layer 7 attacks. Values are a percentage out of the total layer 7 attacks. The target location is determined by the attacked zone&#39;s billing country, when available.

### Example
```java
// Import classes:
import cloudflare.ApiClient;
import cloudflare.ApiException;
import cloudflare.Configuration;
import cloudflare.auth.*;
import cloudflare.models.*;
import cloudflare.sdk.RadarAttacksApi;

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

    RadarAttacksApi apiInstance = new RadarAttacksApi(defaultClient);
    Integer limit = 5; // Integer | 
    List<String> name = Arrays.asList(); // List<String> | 
    List<String> dateRange = Arrays.asList(); // List<String> | 
    List<OffsetDateTime> dateStart = Arrays.asList(); // List<OffsetDateTime> | 
    List<OffsetDateTime> dateEnd = Arrays.asList(); // List<OffsetDateTime> | 
    List<String> continent = Arrays.asList(); // List<String> | 
    String format = "JSON"; // String | 
    try {
      RadarGetAttacksLayer3TopTargetLocations200Response result = apiInstance.radarGetAttacksLayer7TopTargetLocation(limit, name, dateRange, dateStart, dateEnd, continent, format);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling RadarAttacksApi#radarGetAttacksLayer7TopTargetLocation");
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
| **limit** | **Integer**|  | [optional] |
| **name** | [**List&lt;String&gt;**](String.md)|  | [optional] |
| **dateRange** | [**List&lt;String&gt;**](String.md)|  | [optional] [enum: 1d, 2d, 7d, 14d, 28d, 12w, 24w, 52w, 1dControl, 2dControl, 7dControl, 14dControl, 28dControl, 12wControl, 24wControl] |
| **dateStart** | [**List&lt;OffsetDateTime&gt;**](OffsetDateTime.md)|  | [optional] |
| **dateEnd** | [**List&lt;OffsetDateTime&gt;**](OffsetDateTime.md)|  | [optional] |
| **continent** | [**List&lt;String&gt;**](String.md)|  | [optional] |
| **format** | **String**|  | [optional] [enum: JSON, CSV] |

### Return type

[**RadarGetAttacksLayer3TopTargetLocations200Response**](RadarGetAttacksLayer3TopTargetLocations200Response.md)

### Authorization

[api_key](../README.md#api_key), [api_token](../README.md#api_token), [api_email](../README.md#api_email)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successful Response |  -  |
| **404** | Not found |  -  |

<a id="radarGetAttacksLayer7TopVerticals"></a>
# **radarGetAttacksLayer7TopVerticals**
> RadarGetAttacksLayer3TopVerticals200Response radarGetAttacksLayer7TopVerticals(limit, name, dateRange, dateStart, dateEnd, asn, location, continent, format)

Get top Verticals of attack

Get the Verticals of attacks.

### Example
```java
// Import classes:
import cloudflare.ApiClient;
import cloudflare.ApiException;
import cloudflare.Configuration;
import cloudflare.auth.*;
import cloudflare.models.*;
import cloudflare.sdk.RadarAttacksApi;

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

    RadarAttacksApi apiInstance = new RadarAttacksApi(defaultClient);
    Integer limit = 5; // Integer | 
    List<String> name = Arrays.asList(); // List<String> | 
    List<String> dateRange = Arrays.asList(); // List<String> | 
    List<OffsetDateTime> dateStart = Arrays.asList(); // List<OffsetDateTime> | 
    List<OffsetDateTime> dateEnd = Arrays.asList(); // List<OffsetDateTime> | 
    List<String> asn = Arrays.asList(); // List<String> | 
    List<String> location = Arrays.asList(); // List<String> | 
    List<String> continent = Arrays.asList(); // List<String> | 
    String format = "JSON"; // String | 
    try {
      RadarGetAttacksLayer3TopVerticals200Response result = apiInstance.radarGetAttacksLayer7TopVerticals(limit, name, dateRange, dateStart, dateEnd, asn, location, continent, format);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling RadarAttacksApi#radarGetAttacksLayer7TopVerticals");
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
| **limit** | **Integer**|  | [optional] |
| **name** | [**List&lt;String&gt;**](String.md)|  | [optional] |
| **dateRange** | [**List&lt;String&gt;**](String.md)|  | [optional] [enum: 1d, 2d, 7d, 14d, 28d, 12w, 24w, 52w, 1dControl, 2dControl, 7dControl, 14dControl, 28dControl, 12wControl, 24wControl] |
| **dateStart** | [**List&lt;OffsetDateTime&gt;**](OffsetDateTime.md)|  | [optional] |
| **dateEnd** | [**List&lt;OffsetDateTime&gt;**](OffsetDateTime.md)|  | [optional] |
| **asn** | [**List&lt;String&gt;**](String.md)|  | [optional] |
| **location** | [**List&lt;String&gt;**](String.md)|  | [optional] |
| **continent** | [**List&lt;String&gt;**](String.md)|  | [optional] |
| **format** | **String**|  | [optional] [enum: JSON, CSV] |

### Return type

[**RadarGetAttacksLayer3TopVerticals200Response**](RadarGetAttacksLayer3TopVerticals200Response.md)

### Authorization

[api_key](../README.md#api_key), [api_token](../README.md#api_token), [api_email](../README.md#api_email)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successful Response |  -  |
| **404** | Not found |  -  |

