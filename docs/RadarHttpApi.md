# RadarHttpApi

All URIs are relative to *https://api.cloudflare.com/client/v4*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**radarGetHttpSummaryByBotClass**](RadarHttpApi.md#radarGetHttpSummaryByBotClass) | **GET** /radar/http/summary/bot_class | Get Bot Class Summary |
| [**radarGetHttpSummaryByDeviceType**](RadarHttpApi.md#radarGetHttpSummaryByDeviceType) | **GET** /radar/http/summary/device_type | Get Device Type Summary |
| [**radarGetHttpSummaryByHttpProtocol**](RadarHttpApi.md#radarGetHttpSummaryByHttpProtocol) | **GET** /radar/http/summary/http_protocol | Get HTTP protocols summary |
| [**radarGetHttpSummaryByHttpVersion**](RadarHttpApi.md#radarGetHttpSummaryByHttpVersion) | **GET** /radar/http/summary/http_version | Get HTTP Versions Summary |
| [**radarGetHttpSummaryByIpVersion**](RadarHttpApi.md#radarGetHttpSummaryByIpVersion) | **GET** /radar/http/summary/ip_version | Get IP Version Summary |
| [**radarGetHttpSummaryByOperatingSystem**](RadarHttpApi.md#radarGetHttpSummaryByOperatingSystem) | **GET** /radar/http/summary/os | Get Operating Systems Summary |
| [**radarGetHttpSummaryByTlsVersion**](RadarHttpApi.md#radarGetHttpSummaryByTlsVersion) | **GET** /radar/http/summary/tls_version | Get TLS Versions Summary |
| [**radarGetHttpTimeseriesGroupByBotClass**](RadarHttpApi.md#radarGetHttpTimeseriesGroupByBotClass) | **GET** /radar/http/timeseries_groups/bot_class | Get Bot Classes Time Series |
| [**radarGetHttpTimeseriesGroupByBrowserFamilies**](RadarHttpApi.md#radarGetHttpTimeseriesGroupByBrowserFamilies) | **GET** /radar/http/timeseries_groups/browser_family | Get User Agent Families Time Series |
| [**radarGetHttpTimeseriesGroupByBrowsers**](RadarHttpApi.md#radarGetHttpTimeseriesGroupByBrowsers) | **GET** /radar/http/timeseries_groups/browser | Get User Agents Time Series |
| [**radarGetHttpTimeseriesGroupByDeviceType**](RadarHttpApi.md#radarGetHttpTimeseriesGroupByDeviceType) | **GET** /radar/http/timeseries_groups/device_type | Get Device Types Time Series |
| [**radarGetHttpTimeseriesGroupByHttpProtocol**](RadarHttpApi.md#radarGetHttpTimeseriesGroupByHttpProtocol) | **GET** /radar/http/timeseries_groups/http_protocol | Get HTTP protocols Time Series |
| [**radarGetHttpTimeseriesGroupByHttpVersion**](RadarHttpApi.md#radarGetHttpTimeseriesGroupByHttpVersion) | **GET** /radar/http/timeseries_groups/http_version | Get HTTP Versions Time Series |
| [**radarGetHttpTimeseriesGroupByIpVersion**](RadarHttpApi.md#radarGetHttpTimeseriesGroupByIpVersion) | **GET** /radar/http/timeseries_groups/ip_version | Get IP Versions Time Series |
| [**radarGetHttpTimeseriesGroupByOperatingSystem**](RadarHttpApi.md#radarGetHttpTimeseriesGroupByOperatingSystem) | **GET** /radar/http/timeseries_groups/os | Get Operating Systems Time Series |
| [**radarGetHttpTimeseriesGroupByTlsVersion**](RadarHttpApi.md#radarGetHttpTimeseriesGroupByTlsVersion) | **GET** /radar/http/timeseries_groups/tls_version | Get TLS Versions Time Series |
| [**radarGetHttpTopAsesByBotClass**](RadarHttpApi.md#radarGetHttpTopAsesByBotClass) | **GET** /radar/http/top/ases/bot_class/{bot_class} | Get Top Autonomous Systems By Bot Class |
| [**radarGetHttpTopAsesByDeviceType**](RadarHttpApi.md#radarGetHttpTopAsesByDeviceType) | **GET** /radar/http/top/ases/device_type/{device_type} | Get Top Autonomous Systems By Device Type |
| [**radarGetHttpTopAsesByHttpProtocol**](RadarHttpApi.md#radarGetHttpTopAsesByHttpProtocol) | **GET** /radar/http/top/ases/http_protocol/{http_protocol} | Get Top Autonomous Systems By HTTP Protocol |
| [**radarGetHttpTopAsesByHttpRequests**](RadarHttpApi.md#radarGetHttpTopAsesByHttpRequests) | **GET** /radar/http/top/ases | Get Top Autonomous Systems By HTTP Requests |
| [**radarGetHttpTopAsesByHttpVersion**](RadarHttpApi.md#radarGetHttpTopAsesByHttpVersion) | **GET** /radar/http/top/ases/http_version/{http_version} | Get Top Autonomous Systems By HTTP Version |
| [**radarGetHttpTopAsesByIpVersion**](RadarHttpApi.md#radarGetHttpTopAsesByIpVersion) | **GET** /radar/http/top/ases/ip_version/{ip_version} | Get Top Autonomous Systems By IP Version |
| [**radarGetHttpTopAsesByOperatingSystem**](RadarHttpApi.md#radarGetHttpTopAsesByOperatingSystem) | **GET** /radar/http/top/ases/os/{os} | Get Top Autonomous Systems By Operating System |
| [**radarGetHttpTopAsesByTlsVersion**](RadarHttpApi.md#radarGetHttpTopAsesByTlsVersion) | **GET** /radar/http/top/ases/tls_version/{tls_version} | Get Top Autonomous Systems By TLS Version |
| [**radarGetHttpTopBrowserFamilies**](RadarHttpApi.md#radarGetHttpTopBrowserFamilies) | **GET** /radar/http/top/browser_families | Get Top User Agents Families by HTTP requests |
| [**radarGetHttpTopBrowsers**](RadarHttpApi.md#radarGetHttpTopBrowsers) | **GET** /radar/http/top/browsers | Get Top User Agents By HTTP requests |
| [**radarGetHttpTopLocationsByBotClass**](RadarHttpApi.md#radarGetHttpTopLocationsByBotClass) | **GET** /radar/http/top/locations/bot_class/{bot_class} | Get Top Locations By Bot Class |
| [**radarGetHttpTopLocationsByDeviceType**](RadarHttpApi.md#radarGetHttpTopLocationsByDeviceType) | **GET** /radar/http/top/locations/device_type/{device_type} | Get Top Locations By Device Type |
| [**radarGetHttpTopLocationsByHttpProtocol**](RadarHttpApi.md#radarGetHttpTopLocationsByHttpProtocol) | **GET** /radar/http/top/locations/http_protocol/{http_protocol} | Get Top Locations By HTTP Protocol |
| [**radarGetHttpTopLocationsByHttpRequests**](RadarHttpApi.md#radarGetHttpTopLocationsByHttpRequests) | **GET** /radar/http/top/locations | Get Top Locations By HTTP requests |
| [**radarGetHttpTopLocationsByHttpVersion**](RadarHttpApi.md#radarGetHttpTopLocationsByHttpVersion) | **GET** /radar/http/top/locations/http_version/{http_version} | Get Top Locations By HTTP Version |
| [**radarGetHttpTopLocationsByIpVersion**](RadarHttpApi.md#radarGetHttpTopLocationsByIpVersion) | **GET** /radar/http/top/locations/ip_version/{ip_version} | Get Top Locations By IP Version |
| [**radarGetHttpTopLocationsByOperatingSystem**](RadarHttpApi.md#radarGetHttpTopLocationsByOperatingSystem) | **GET** /radar/http/top/locations/os/{os} | Get Top Locations By Operating System |
| [**radarGetHttpTopLocationsByTlsVersion**](RadarHttpApi.md#radarGetHttpTopLocationsByTlsVersion) | **GET** /radar/http/top/locations/tls_version/{tls_version} | Get Top Locations By TLS Version |


<a id="radarGetHttpSummaryByBotClass"></a>
# **radarGetHttpSummaryByBotClass**
> RadarGetHttpSummaryByBotClass200Response radarGetHttpSummaryByBotClass(name, dateRange, dateStart, dateEnd, asn, location, continent, deviceType, httpProtocol, httpVersion, ipVersion, os, tlsVersion, format)

Get Bot Class Summary

Percentage distribution of bot-generated traffic to genuine human traffic, as classified by Cloudflare. Visit https://developers.cloudflare.com/radar/concepts/bot-classes/ for more information.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.RadarHttpApi;

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

    RadarHttpApi apiInstance = new RadarHttpApi(defaultClient);
    List<String> name = Arrays.asList(); // List<String> | 
    List<String> dateRange = Arrays.asList(); // List<String> | 
    List<OffsetDateTime> dateStart = Arrays.asList(); // List<OffsetDateTime> | 
    List<OffsetDateTime> dateEnd = Arrays.asList(); // List<OffsetDateTime> | 
    List<String> asn = Arrays.asList(); // List<String> | 
    List<String> location = Arrays.asList(); // List<String> | 
    List<String> continent = Arrays.asList(); // List<String> | 
    List<String> deviceType = Arrays.asList(); // List<String> | 
    List<String> httpProtocol = Arrays.asList(); // List<String> | 
    List<String> httpVersion = Arrays.asList(); // List<String> | 
    List<String> ipVersion = Arrays.asList(); // List<String> | 
    List<String> os = Arrays.asList(); // List<String> | 
    List<String> tlsVersion = Arrays.asList(); // List<String> | 
    String format = "JSON"; // String | 
    try {
      RadarGetHttpSummaryByBotClass200Response result = apiInstance.radarGetHttpSummaryByBotClass(name, dateRange, dateStart, dateEnd, asn, location, continent, deviceType, httpProtocol, httpVersion, ipVersion, os, tlsVersion, format);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling RadarHttpApi#radarGetHttpSummaryByBotClass");
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
| **deviceType** | [**List&lt;String&gt;**](String.md)|  | [optional] [enum: DESKTOP, MOBILE, OTHER] |
| **httpProtocol** | [**List&lt;String&gt;**](String.md)|  | [optional] [enum: HTTP, HTTPS] |
| **httpVersion** | [**List&lt;String&gt;**](String.md)|  | [optional] [enum: HTTPv1, HTTPv2, HTTPv3] |
| **ipVersion** | [**List&lt;String&gt;**](String.md)|  | [optional] [enum: IPv4, IPv6] |
| **os** | [**List&lt;String&gt;**](String.md)|  | [optional] [enum: WINDOWS, MACOSX, IOS, ANDROID, CHROMEOS, LINUX, SMART_TV] |
| **tlsVersion** | [**List&lt;String&gt;**](String.md)|  | [optional] [enum: TLSv1_0, TLSv1_1, TLSv1_2, TLSv1_3, TLSvQUIC] |
| **format** | **String**|  | [optional] [enum: JSON, CSV] |

### Return type

[**RadarGetHttpSummaryByBotClass200Response**](RadarGetHttpSummaryByBotClass200Response.md)

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

<a id="radarGetHttpSummaryByDeviceType"></a>
# **radarGetHttpSummaryByDeviceType**
> RadarGetHttpSummaryByDeviceType200Response radarGetHttpSummaryByDeviceType(name, dateRange, dateStart, dateEnd, asn, location, continent, botClass, httpProtocol, httpVersion, ipVersion, os, tlsVersion, format)

Get Device Type Summary

Percentage of Internet traffic generated by mobile, desktop, and other types of devices, over a given time period.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.RadarHttpApi;

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

    RadarHttpApi apiInstance = new RadarHttpApi(defaultClient);
    List<String> name = Arrays.asList(); // List<String> | 
    List<String> dateRange = Arrays.asList(); // List<String> | 
    List<OffsetDateTime> dateStart = Arrays.asList(); // List<OffsetDateTime> | 
    List<OffsetDateTime> dateEnd = Arrays.asList(); // List<OffsetDateTime> | 
    List<String> asn = Arrays.asList(); // List<String> | 
    List<String> location = Arrays.asList(); // List<String> | 
    List<String> continent = Arrays.asList(); // List<String> | 
    List<String> botClass = Arrays.asList(); // List<String> | 
    List<String> httpProtocol = Arrays.asList(); // List<String> | 
    List<String> httpVersion = Arrays.asList(); // List<String> | 
    List<String> ipVersion = Arrays.asList(); // List<String> | 
    List<String> os = Arrays.asList(); // List<String> | 
    List<String> tlsVersion = Arrays.asList(); // List<String> | 
    String format = "JSON"; // String | 
    try {
      RadarGetHttpSummaryByDeviceType200Response result = apiInstance.radarGetHttpSummaryByDeviceType(name, dateRange, dateStart, dateEnd, asn, location, continent, botClass, httpProtocol, httpVersion, ipVersion, os, tlsVersion, format);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling RadarHttpApi#radarGetHttpSummaryByDeviceType");
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
| **botClass** | [**List&lt;String&gt;**](String.md)|  | [optional] [enum: LIKELY_AUTOMATED, LIKELY_HUMAN] |
| **httpProtocol** | [**List&lt;String&gt;**](String.md)|  | [optional] [enum: HTTP, HTTPS] |
| **httpVersion** | [**List&lt;String&gt;**](String.md)|  | [optional] [enum: HTTPv1, HTTPv2, HTTPv3] |
| **ipVersion** | [**List&lt;String&gt;**](String.md)|  | [optional] [enum: IPv4, IPv6] |
| **os** | [**List&lt;String&gt;**](String.md)|  | [optional] [enum: WINDOWS, MACOSX, IOS, ANDROID, CHROMEOS, LINUX, SMART_TV] |
| **tlsVersion** | [**List&lt;String&gt;**](String.md)|  | [optional] [enum: TLSv1_0, TLSv1_1, TLSv1_2, TLSv1_3, TLSvQUIC] |
| **format** | **String**|  | [optional] [enum: JSON, CSV] |

### Return type

[**RadarGetHttpSummaryByDeviceType200Response**](RadarGetHttpSummaryByDeviceType200Response.md)

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

<a id="radarGetHttpSummaryByHttpProtocol"></a>
# **radarGetHttpSummaryByHttpProtocol**
> RadarGetHttpSummaryByHttpProtocol200Response radarGetHttpSummaryByHttpProtocol(name, dateRange, dateStart, dateEnd, asn, location, continent, botClass, deviceType, httpVersion, ipVersion, os, tlsVersion, format)

Get HTTP protocols summary

Percentage distribution of traffic per HTTP protocol over a given time period.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.RadarHttpApi;

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

    RadarHttpApi apiInstance = new RadarHttpApi(defaultClient);
    List<String> name = Arrays.asList(); // List<String> | 
    List<String> dateRange = Arrays.asList(); // List<String> | 
    List<OffsetDateTime> dateStart = Arrays.asList(); // List<OffsetDateTime> | 
    List<OffsetDateTime> dateEnd = Arrays.asList(); // List<OffsetDateTime> | 
    List<String> asn = Arrays.asList(); // List<String> | 
    List<String> location = Arrays.asList(); // List<String> | 
    List<String> continent = Arrays.asList(); // List<String> | 
    List<String> botClass = Arrays.asList(); // List<String> | 
    List<String> deviceType = Arrays.asList(); // List<String> | 
    List<String> httpVersion = Arrays.asList(); // List<String> | 
    List<String> ipVersion = Arrays.asList(); // List<String> | 
    List<String> os = Arrays.asList(); // List<String> | 
    List<String> tlsVersion = Arrays.asList(); // List<String> | 
    String format = "JSON"; // String | 
    try {
      RadarGetHttpSummaryByHttpProtocol200Response result = apiInstance.radarGetHttpSummaryByHttpProtocol(name, dateRange, dateStart, dateEnd, asn, location, continent, botClass, deviceType, httpVersion, ipVersion, os, tlsVersion, format);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling RadarHttpApi#radarGetHttpSummaryByHttpProtocol");
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
| **botClass** | [**List&lt;String&gt;**](String.md)|  | [optional] [enum: LIKELY_AUTOMATED, LIKELY_HUMAN] |
| **deviceType** | [**List&lt;String&gt;**](String.md)|  | [optional] [enum: DESKTOP, MOBILE, OTHER] |
| **httpVersion** | [**List&lt;String&gt;**](String.md)|  | [optional] [enum: HTTPv1, HTTPv2, HTTPv3] |
| **ipVersion** | [**List&lt;String&gt;**](String.md)|  | [optional] [enum: IPv4, IPv6] |
| **os** | [**List&lt;String&gt;**](String.md)|  | [optional] [enum: WINDOWS, MACOSX, IOS, ANDROID, CHROMEOS, LINUX, SMART_TV] |
| **tlsVersion** | [**List&lt;String&gt;**](String.md)|  | [optional] [enum: TLSv1_0, TLSv1_1, TLSv1_2, TLSv1_3, TLSvQUIC] |
| **format** | **String**|  | [optional] [enum: JSON, CSV] |

### Return type

[**RadarGetHttpSummaryByHttpProtocol200Response**](RadarGetHttpSummaryByHttpProtocol200Response.md)

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

<a id="radarGetHttpSummaryByHttpVersion"></a>
# **radarGetHttpSummaryByHttpVersion**
> RadarGetHttpSummaryByHttpVersion200Response radarGetHttpSummaryByHttpVersion(name, dateRange, dateStart, dateEnd, asn, location, continent, botClass, deviceType, httpProtocol, ipVersion, os, tlsVersion, format)

Get HTTP Versions Summary

Percentage distribution of traffic per HTTP protocol version over a given time period.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.RadarHttpApi;

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

    RadarHttpApi apiInstance = new RadarHttpApi(defaultClient);
    List<String> name = Arrays.asList(); // List<String> | 
    List<String> dateRange = Arrays.asList(); // List<String> | 
    List<OffsetDateTime> dateStart = Arrays.asList(); // List<OffsetDateTime> | 
    List<OffsetDateTime> dateEnd = Arrays.asList(); // List<OffsetDateTime> | 
    List<String> asn = Arrays.asList(); // List<String> | 
    List<String> location = Arrays.asList(); // List<String> | 
    List<String> continent = Arrays.asList(); // List<String> | 
    List<String> botClass = Arrays.asList(); // List<String> | 
    List<String> deviceType = Arrays.asList(); // List<String> | 
    List<String> httpProtocol = Arrays.asList(); // List<String> | 
    List<String> ipVersion = Arrays.asList(); // List<String> | 
    List<String> os = Arrays.asList(); // List<String> | 
    List<String> tlsVersion = Arrays.asList(); // List<String> | 
    String format = "JSON"; // String | 
    try {
      RadarGetHttpSummaryByHttpVersion200Response result = apiInstance.radarGetHttpSummaryByHttpVersion(name, dateRange, dateStart, dateEnd, asn, location, continent, botClass, deviceType, httpProtocol, ipVersion, os, tlsVersion, format);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling RadarHttpApi#radarGetHttpSummaryByHttpVersion");
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
| **botClass** | [**List&lt;String&gt;**](String.md)|  | [optional] [enum: LIKELY_AUTOMATED, LIKELY_HUMAN] |
| **deviceType** | [**List&lt;String&gt;**](String.md)|  | [optional] [enum: DESKTOP, MOBILE, OTHER] |
| **httpProtocol** | [**List&lt;String&gt;**](String.md)|  | [optional] [enum: HTTP, HTTPS] |
| **ipVersion** | [**List&lt;String&gt;**](String.md)|  | [optional] [enum: IPv4, IPv6] |
| **os** | [**List&lt;String&gt;**](String.md)|  | [optional] [enum: WINDOWS, MACOSX, IOS, ANDROID, CHROMEOS, LINUX, SMART_TV] |
| **tlsVersion** | [**List&lt;String&gt;**](String.md)|  | [optional] [enum: TLSv1_0, TLSv1_1, TLSv1_2, TLSv1_3, TLSvQUIC] |
| **format** | **String**|  | [optional] [enum: JSON, CSV] |

### Return type

[**RadarGetHttpSummaryByHttpVersion200Response**](RadarGetHttpSummaryByHttpVersion200Response.md)

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

<a id="radarGetHttpSummaryByIpVersion"></a>
# **radarGetHttpSummaryByIpVersion**
> RadarGetEmailRoutingSummaryByIpVersion200Response radarGetHttpSummaryByIpVersion(name, dateRange, dateStart, dateEnd, asn, location, continent, botClass, deviceType, httpProtocol, httpVersion, os, tlsVersion, format)

Get IP Version Summary

Percentage distribution of Internet traffic based on IP protocol versions, such as IPv4 and IPv6, over a given time period.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.RadarHttpApi;

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

    RadarHttpApi apiInstance = new RadarHttpApi(defaultClient);
    List<String> name = Arrays.asList(); // List<String> | 
    List<String> dateRange = Arrays.asList(); // List<String> | 
    List<OffsetDateTime> dateStart = Arrays.asList(); // List<OffsetDateTime> | 
    List<OffsetDateTime> dateEnd = Arrays.asList(); // List<OffsetDateTime> | 
    List<String> asn = Arrays.asList(); // List<String> | 
    List<String> location = Arrays.asList(); // List<String> | 
    List<String> continent = Arrays.asList(); // List<String> | 
    List<String> botClass = Arrays.asList(); // List<String> | 
    List<String> deviceType = Arrays.asList(); // List<String> | 
    List<String> httpProtocol = Arrays.asList(); // List<String> | 
    List<String> httpVersion = Arrays.asList(); // List<String> | 
    List<String> os = Arrays.asList(); // List<String> | 
    List<String> tlsVersion = Arrays.asList(); // List<String> | 
    String format = "JSON"; // String | 
    try {
      RadarGetEmailRoutingSummaryByIpVersion200Response result = apiInstance.radarGetHttpSummaryByIpVersion(name, dateRange, dateStart, dateEnd, asn, location, continent, botClass, deviceType, httpProtocol, httpVersion, os, tlsVersion, format);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling RadarHttpApi#radarGetHttpSummaryByIpVersion");
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
| **botClass** | [**List&lt;String&gt;**](String.md)|  | [optional] [enum: LIKELY_AUTOMATED, LIKELY_HUMAN] |
| **deviceType** | [**List&lt;String&gt;**](String.md)|  | [optional] [enum: DESKTOP, MOBILE, OTHER] |
| **httpProtocol** | [**List&lt;String&gt;**](String.md)|  | [optional] [enum: HTTP, HTTPS] |
| **httpVersion** | [**List&lt;String&gt;**](String.md)|  | [optional] [enum: HTTPv1, HTTPv2, HTTPv3] |
| **os** | [**List&lt;String&gt;**](String.md)|  | [optional] [enum: WINDOWS, MACOSX, IOS, ANDROID, CHROMEOS, LINUX, SMART_TV] |
| **tlsVersion** | [**List&lt;String&gt;**](String.md)|  | [optional] [enum: TLSv1_0, TLSv1_1, TLSv1_2, TLSv1_3, TLSvQUIC] |
| **format** | **String**|  | [optional] [enum: JSON, CSV] |

### Return type

[**RadarGetEmailRoutingSummaryByIpVersion200Response**](RadarGetEmailRoutingSummaryByIpVersion200Response.md)

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

<a id="radarGetHttpSummaryByOperatingSystem"></a>
# **radarGetHttpSummaryByOperatingSystem**
> RadarGetHttpSummaryByOperatingSystem200Response radarGetHttpSummaryByOperatingSystem(name, dateRange, dateStart, dateEnd, asn, location, continent, botClass, deviceType, httpProtocol, httpVersion, ipVersion, tlsVersion, format)

Get Operating Systems Summary

Percentage distribution of Internet traffic generated by different operating systems like Windows, macOS, Android, iOS, and others, over a given time period.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.RadarHttpApi;

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

    RadarHttpApi apiInstance = new RadarHttpApi(defaultClient);
    List<String> name = Arrays.asList(); // List<String> | 
    List<String> dateRange = Arrays.asList(); // List<String> | 
    List<OffsetDateTime> dateStart = Arrays.asList(); // List<OffsetDateTime> | 
    List<OffsetDateTime> dateEnd = Arrays.asList(); // List<OffsetDateTime> | 
    List<String> asn = Arrays.asList(); // List<String> | 
    List<String> location = Arrays.asList(); // List<String> | 
    List<String> continent = Arrays.asList(); // List<String> | 
    List<String> botClass = Arrays.asList(); // List<String> | 
    List<String> deviceType = Arrays.asList(); // List<String> | 
    List<String> httpProtocol = Arrays.asList(); // List<String> | 
    List<String> httpVersion = Arrays.asList(); // List<String> | 
    List<String> ipVersion = Arrays.asList(); // List<String> | 
    List<String> tlsVersion = Arrays.asList(); // List<String> | 
    String format = "JSON"; // String | 
    try {
      RadarGetHttpSummaryByOperatingSystem200Response result = apiInstance.radarGetHttpSummaryByOperatingSystem(name, dateRange, dateStart, dateEnd, asn, location, continent, botClass, deviceType, httpProtocol, httpVersion, ipVersion, tlsVersion, format);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling RadarHttpApi#radarGetHttpSummaryByOperatingSystem");
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
| **botClass** | [**List&lt;String&gt;**](String.md)|  | [optional] [enum: LIKELY_AUTOMATED, LIKELY_HUMAN] |
| **deviceType** | [**List&lt;String&gt;**](String.md)|  | [optional] [enum: DESKTOP, MOBILE, OTHER] |
| **httpProtocol** | [**List&lt;String&gt;**](String.md)|  | [optional] [enum: HTTP, HTTPS] |
| **httpVersion** | [**List&lt;String&gt;**](String.md)|  | [optional] [enum: HTTPv1, HTTPv2, HTTPv3] |
| **ipVersion** | [**List&lt;String&gt;**](String.md)|  | [optional] [enum: IPv4, IPv6] |
| **tlsVersion** | [**List&lt;String&gt;**](String.md)|  | [optional] [enum: TLSv1_0, TLSv1_1, TLSv1_2, TLSv1_3, TLSvQUIC] |
| **format** | **String**|  | [optional] [enum: JSON, CSV] |

### Return type

[**RadarGetHttpSummaryByOperatingSystem200Response**](RadarGetHttpSummaryByOperatingSystem200Response.md)

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

<a id="radarGetHttpSummaryByTlsVersion"></a>
# **radarGetHttpSummaryByTlsVersion**
> RadarGetHttpSummaryByTlsVersion200Response radarGetHttpSummaryByTlsVersion(name, dateRange, dateStart, dateEnd, asn, location, continent, botClass, deviceType, httpProtocol, httpVersion, ipVersion, os, format)

Get TLS Versions Summary

Percentage distribution of traffic per TLS protocol version, over a given time period.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.RadarHttpApi;

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

    RadarHttpApi apiInstance = new RadarHttpApi(defaultClient);
    List<String> name = Arrays.asList(); // List<String> | 
    List<String> dateRange = Arrays.asList(); // List<String> | 
    List<OffsetDateTime> dateStart = Arrays.asList(); // List<OffsetDateTime> | 
    List<OffsetDateTime> dateEnd = Arrays.asList(); // List<OffsetDateTime> | 
    List<String> asn = Arrays.asList(); // List<String> | 
    List<String> location = Arrays.asList(); // List<String> | 
    List<String> continent = Arrays.asList(); // List<String> | 
    List<String> botClass = Arrays.asList(); // List<String> | 
    List<String> deviceType = Arrays.asList(); // List<String> | 
    List<String> httpProtocol = Arrays.asList(); // List<String> | 
    List<String> httpVersion = Arrays.asList(); // List<String> | 
    List<String> ipVersion = Arrays.asList(); // List<String> | 
    List<String> os = Arrays.asList(); // List<String> | 
    String format = "JSON"; // String | 
    try {
      RadarGetHttpSummaryByTlsVersion200Response result = apiInstance.radarGetHttpSummaryByTlsVersion(name, dateRange, dateStart, dateEnd, asn, location, continent, botClass, deviceType, httpProtocol, httpVersion, ipVersion, os, format);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling RadarHttpApi#radarGetHttpSummaryByTlsVersion");
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
| **botClass** | [**List&lt;String&gt;**](String.md)|  | [optional] [enum: LIKELY_AUTOMATED, LIKELY_HUMAN] |
| **deviceType** | [**List&lt;String&gt;**](String.md)|  | [optional] [enum: DESKTOP, MOBILE, OTHER] |
| **httpProtocol** | [**List&lt;String&gt;**](String.md)|  | [optional] [enum: HTTP, HTTPS] |
| **httpVersion** | [**List&lt;String&gt;**](String.md)|  | [optional] [enum: HTTPv1, HTTPv2, HTTPv3] |
| **ipVersion** | [**List&lt;String&gt;**](String.md)|  | [optional] [enum: IPv4, IPv6] |
| **os** | [**List&lt;String&gt;**](String.md)|  | [optional] [enum: WINDOWS, MACOSX, IOS, ANDROID, CHROMEOS, LINUX, SMART_TV] |
| **format** | **String**|  | [optional] [enum: JSON, CSV] |

### Return type

[**RadarGetHttpSummaryByTlsVersion200Response**](RadarGetHttpSummaryByTlsVersion200Response.md)

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

<a id="radarGetHttpTimeseriesGroupByBotClass"></a>
# **radarGetHttpTimeseriesGroupByBotClass**
> RadarGetHttpTimeseriesGroupByBotClass200Response radarGetHttpTimeseriesGroupByBotClass(aggInterval, name, dateRange, dateStart, dateEnd, asn, location, continent, deviceType, httpProtocol, httpVersion, ipVersion, os, tlsVersion, format)

Get Bot Classes Time Series

Get a time series of the percentage distribution of traffic classified as automated or human. Visit https://developers.cloudflare.com/radar/concepts/bot-classes/ for more information.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.RadarHttpApi;

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

    RadarHttpApi apiInstance = new RadarHttpApi(defaultClient);
    String aggInterval = "15m"; // String | 
    List<String> name = Arrays.asList(); // List<String> | 
    List<String> dateRange = Arrays.asList(); // List<String> | 
    List<OffsetDateTime> dateStart = Arrays.asList(); // List<OffsetDateTime> | 
    List<OffsetDateTime> dateEnd = Arrays.asList(); // List<OffsetDateTime> | 
    List<String> asn = Arrays.asList(); // List<String> | 
    List<String> location = Arrays.asList(); // List<String> | 
    List<String> continent = Arrays.asList(); // List<String> | 
    List<String> deviceType = Arrays.asList(); // List<String> | 
    List<String> httpProtocol = Arrays.asList(); // List<String> | 
    List<String> httpVersion = Arrays.asList(); // List<String> | 
    List<String> ipVersion = Arrays.asList(); // List<String> | 
    List<String> os = Arrays.asList(); // List<String> | 
    List<String> tlsVersion = Arrays.asList(); // List<String> | 
    String format = "JSON"; // String | 
    try {
      RadarGetHttpTimeseriesGroupByBotClass200Response result = apiInstance.radarGetHttpTimeseriesGroupByBotClass(aggInterval, name, dateRange, dateStart, dateEnd, asn, location, continent, deviceType, httpProtocol, httpVersion, ipVersion, os, tlsVersion, format);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling RadarHttpApi#radarGetHttpTimeseriesGroupByBotClass");
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
| **deviceType** | [**List&lt;String&gt;**](String.md)|  | [optional] [enum: DESKTOP, MOBILE, OTHER] |
| **httpProtocol** | [**List&lt;String&gt;**](String.md)|  | [optional] [enum: HTTP, HTTPS] |
| **httpVersion** | [**List&lt;String&gt;**](String.md)|  | [optional] [enum: HTTPv1, HTTPv2, HTTPv3] |
| **ipVersion** | [**List&lt;String&gt;**](String.md)|  | [optional] [enum: IPv4, IPv6] |
| **os** | [**List&lt;String&gt;**](String.md)|  | [optional] [enum: WINDOWS, MACOSX, IOS, ANDROID, CHROMEOS, LINUX, SMART_TV] |
| **tlsVersion** | [**List&lt;String&gt;**](String.md)|  | [optional] [enum: TLSv1_0, TLSv1_1, TLSv1_2, TLSv1_3, TLSvQUIC] |
| **format** | **String**|  | [optional] [enum: JSON, CSV] |

### Return type

[**RadarGetHttpTimeseriesGroupByBotClass200Response**](RadarGetHttpTimeseriesGroupByBotClass200Response.md)

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

<a id="radarGetHttpTimeseriesGroupByBrowserFamilies"></a>
# **radarGetHttpTimeseriesGroupByBrowserFamilies**
> RadarGetHttpTimeseriesGroupByBrowsers200Response radarGetHttpTimeseriesGroupByBrowserFamilies(aggInterval, name, dateRange, dateStart, dateEnd, asn, location, continent, botClass, deviceType, httpProtocol, httpVersion, ipVersion, os, tlsVersion, format)

Get User Agent Families Time Series

Get a time series of the percentage distribution of traffic of the top user agents aggregated in families.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.RadarHttpApi;

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

    RadarHttpApi apiInstance = new RadarHttpApi(defaultClient);
    String aggInterval = "15m"; // String | 
    List<String> name = Arrays.asList(); // List<String> | 
    List<String> dateRange = Arrays.asList(); // List<String> | 
    List<OffsetDateTime> dateStart = Arrays.asList(); // List<OffsetDateTime> | 
    List<OffsetDateTime> dateEnd = Arrays.asList(); // List<OffsetDateTime> | 
    List<String> asn = Arrays.asList(); // List<String> | 
    List<String> location = Arrays.asList(); // List<String> | 
    List<String> continent = Arrays.asList(); // List<String> | 
    List<String> botClass = Arrays.asList(); // List<String> | 
    List<String> deviceType = Arrays.asList(); // List<String> | 
    List<String> httpProtocol = Arrays.asList(); // List<String> | 
    List<String> httpVersion = Arrays.asList(); // List<String> | 
    List<String> ipVersion = Arrays.asList(); // List<String> | 
    List<String> os = Arrays.asList(); // List<String> | 
    List<String> tlsVersion = Arrays.asList(); // List<String> | 
    String format = "JSON"; // String | 
    try {
      RadarGetHttpTimeseriesGroupByBrowsers200Response result = apiInstance.radarGetHttpTimeseriesGroupByBrowserFamilies(aggInterval, name, dateRange, dateStart, dateEnd, asn, location, continent, botClass, deviceType, httpProtocol, httpVersion, ipVersion, os, tlsVersion, format);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling RadarHttpApi#radarGetHttpTimeseriesGroupByBrowserFamilies");
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
| **botClass** | [**List&lt;String&gt;**](String.md)|  | [optional] [enum: LIKELY_AUTOMATED, LIKELY_HUMAN] |
| **deviceType** | [**List&lt;String&gt;**](String.md)|  | [optional] [enum: DESKTOP, MOBILE, OTHER] |
| **httpProtocol** | [**List&lt;String&gt;**](String.md)|  | [optional] [enum: HTTP, HTTPS] |
| **httpVersion** | [**List&lt;String&gt;**](String.md)|  | [optional] [enum: HTTPv1, HTTPv2, HTTPv3] |
| **ipVersion** | [**List&lt;String&gt;**](String.md)|  | [optional] [enum: IPv4, IPv6] |
| **os** | [**List&lt;String&gt;**](String.md)|  | [optional] [enum: WINDOWS, MACOSX, IOS, ANDROID, CHROMEOS, LINUX, SMART_TV] |
| **tlsVersion** | [**List&lt;String&gt;**](String.md)|  | [optional] [enum: TLSv1_0, TLSv1_1, TLSv1_2, TLSv1_3, TLSvQUIC] |
| **format** | **String**|  | [optional] [enum: JSON, CSV] |

### Return type

[**RadarGetHttpTimeseriesGroupByBrowsers200Response**](RadarGetHttpTimeseriesGroupByBrowsers200Response.md)

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

<a id="radarGetHttpTimeseriesGroupByBrowsers"></a>
# **radarGetHttpTimeseriesGroupByBrowsers**
> RadarGetHttpTimeseriesGroupByBrowsers200Response radarGetHttpTimeseriesGroupByBrowsers(aggInterval, name, dateRange, dateStart, dateEnd, asn, location, continent, botClass, deviceType, httpProtocol, httpVersion, ipVersion, os, tlsVersion, limitPerGroup, format)

Get User Agents Time Series

Get a time series of the percentage distribution of traffic of the top user agents.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.RadarHttpApi;

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

    RadarHttpApi apiInstance = new RadarHttpApi(defaultClient);
    String aggInterval = "15m"; // String | 
    List<String> name = Arrays.asList(); // List<String> | 
    List<String> dateRange = Arrays.asList(); // List<String> | 
    List<OffsetDateTime> dateStart = Arrays.asList(); // List<OffsetDateTime> | 
    List<OffsetDateTime> dateEnd = Arrays.asList(); // List<OffsetDateTime> | 
    List<String> asn = Arrays.asList(); // List<String> | 
    List<String> location = Arrays.asList(); // List<String> | 
    List<String> continent = Arrays.asList(); // List<String> | 
    List<String> botClass = Arrays.asList(); // List<String> | 
    List<String> deviceType = Arrays.asList(); // List<String> | 
    List<String> httpProtocol = Arrays.asList(); // List<String> | 
    List<String> httpVersion = Arrays.asList(); // List<String> | 
    List<String> ipVersion = Arrays.asList(); // List<String> | 
    List<String> os = Arrays.asList(); // List<String> | 
    List<String> tlsVersion = Arrays.asList(); // List<String> | 
    Integer limitPerGroup = 4; // Integer | 
    String format = "JSON"; // String | 
    try {
      RadarGetHttpTimeseriesGroupByBrowsers200Response result = apiInstance.radarGetHttpTimeseriesGroupByBrowsers(aggInterval, name, dateRange, dateStart, dateEnd, asn, location, continent, botClass, deviceType, httpProtocol, httpVersion, ipVersion, os, tlsVersion, limitPerGroup, format);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling RadarHttpApi#radarGetHttpTimeseriesGroupByBrowsers");
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
| **botClass** | [**List&lt;String&gt;**](String.md)|  | [optional] [enum: LIKELY_AUTOMATED, LIKELY_HUMAN] |
| **deviceType** | [**List&lt;String&gt;**](String.md)|  | [optional] [enum: DESKTOP, MOBILE, OTHER] |
| **httpProtocol** | [**List&lt;String&gt;**](String.md)|  | [optional] [enum: HTTP, HTTPS] |
| **httpVersion** | [**List&lt;String&gt;**](String.md)|  | [optional] [enum: HTTPv1, HTTPv2, HTTPv3] |
| **ipVersion** | [**List&lt;String&gt;**](String.md)|  | [optional] [enum: IPv4, IPv6] |
| **os** | [**List&lt;String&gt;**](String.md)|  | [optional] [enum: WINDOWS, MACOSX, IOS, ANDROID, CHROMEOS, LINUX, SMART_TV] |
| **tlsVersion** | [**List&lt;String&gt;**](String.md)|  | [optional] [enum: TLSv1_0, TLSv1_1, TLSv1_2, TLSv1_3, TLSvQUIC] |
| **limitPerGroup** | **Integer**|  | [optional] |
| **format** | **String**|  | [optional] [enum: JSON, CSV] |

### Return type

[**RadarGetHttpTimeseriesGroupByBrowsers200Response**](RadarGetHttpTimeseriesGroupByBrowsers200Response.md)

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

<a id="radarGetHttpTimeseriesGroupByDeviceType"></a>
# **radarGetHttpTimeseriesGroupByDeviceType**
> RadarGetHttpTimeseriesGroupByDeviceType200Response radarGetHttpTimeseriesGroupByDeviceType(aggInterval, name, dateRange, dateStart, dateEnd, asn, location, continent, botClass, httpProtocol, httpVersion, ipVersion, os, tlsVersion, format)

Get Device Types Time Series

Get a time series of the percentage distribution of traffic per device type.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.RadarHttpApi;

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

    RadarHttpApi apiInstance = new RadarHttpApi(defaultClient);
    String aggInterval = "15m"; // String | 
    List<String> name = Arrays.asList(); // List<String> | 
    List<String> dateRange = Arrays.asList(); // List<String> | 
    List<OffsetDateTime> dateStart = Arrays.asList(); // List<OffsetDateTime> | 
    List<OffsetDateTime> dateEnd = Arrays.asList(); // List<OffsetDateTime> | 
    List<String> asn = Arrays.asList(); // List<String> | 
    List<String> location = Arrays.asList(); // List<String> | 
    List<String> continent = Arrays.asList(); // List<String> | 
    List<String> botClass = Arrays.asList(); // List<String> | 
    List<String> httpProtocol = Arrays.asList(); // List<String> | 
    List<String> httpVersion = Arrays.asList(); // List<String> | 
    List<String> ipVersion = Arrays.asList(); // List<String> | 
    List<String> os = Arrays.asList(); // List<String> | 
    List<String> tlsVersion = Arrays.asList(); // List<String> | 
    String format = "JSON"; // String | 
    try {
      RadarGetHttpTimeseriesGroupByDeviceType200Response result = apiInstance.radarGetHttpTimeseriesGroupByDeviceType(aggInterval, name, dateRange, dateStart, dateEnd, asn, location, continent, botClass, httpProtocol, httpVersion, ipVersion, os, tlsVersion, format);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling RadarHttpApi#radarGetHttpTimeseriesGroupByDeviceType");
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
| **botClass** | [**List&lt;String&gt;**](String.md)|  | [optional] [enum: LIKELY_AUTOMATED, LIKELY_HUMAN] |
| **httpProtocol** | [**List&lt;String&gt;**](String.md)|  | [optional] [enum: HTTP, HTTPS] |
| **httpVersion** | [**List&lt;String&gt;**](String.md)|  | [optional] [enum: HTTPv1, HTTPv2, HTTPv3] |
| **ipVersion** | [**List&lt;String&gt;**](String.md)|  | [optional] [enum: IPv4, IPv6] |
| **os** | [**List&lt;String&gt;**](String.md)|  | [optional] [enum: WINDOWS, MACOSX, IOS, ANDROID, CHROMEOS, LINUX, SMART_TV] |
| **tlsVersion** | [**List&lt;String&gt;**](String.md)|  | [optional] [enum: TLSv1_0, TLSv1_1, TLSv1_2, TLSv1_3, TLSvQUIC] |
| **format** | **String**|  | [optional] [enum: JSON, CSV] |

### Return type

[**RadarGetHttpTimeseriesGroupByDeviceType200Response**](RadarGetHttpTimeseriesGroupByDeviceType200Response.md)

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

<a id="radarGetHttpTimeseriesGroupByHttpProtocol"></a>
# **radarGetHttpTimeseriesGroupByHttpProtocol**
> RadarGetHttpTimeseriesGroupByHttpProtocol200Response radarGetHttpTimeseriesGroupByHttpProtocol(aggInterval, name, dateRange, dateStart, dateEnd, asn, location, continent, botClass, deviceType, httpVersion, ipVersion, os, tlsVersion, format)

Get HTTP protocols Time Series

Get a time series of the percentage distribution of traffic per HTTP protocol.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.RadarHttpApi;

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

    RadarHttpApi apiInstance = new RadarHttpApi(defaultClient);
    String aggInterval = "15m"; // String | 
    List<String> name = Arrays.asList(); // List<String> | 
    List<String> dateRange = Arrays.asList(); // List<String> | 
    List<OffsetDateTime> dateStart = Arrays.asList(); // List<OffsetDateTime> | 
    List<OffsetDateTime> dateEnd = Arrays.asList(); // List<OffsetDateTime> | 
    List<String> asn = Arrays.asList(); // List<String> | 
    List<String> location = Arrays.asList(); // List<String> | 
    List<String> continent = Arrays.asList(); // List<String> | 
    List<String> botClass = Arrays.asList(); // List<String> | 
    List<String> deviceType = Arrays.asList(); // List<String> | 
    List<String> httpVersion = Arrays.asList(); // List<String> | 
    List<String> ipVersion = Arrays.asList(); // List<String> | 
    List<String> os = Arrays.asList(); // List<String> | 
    List<String> tlsVersion = Arrays.asList(); // List<String> | 
    String format = "JSON"; // String | 
    try {
      RadarGetHttpTimeseriesGroupByHttpProtocol200Response result = apiInstance.radarGetHttpTimeseriesGroupByHttpProtocol(aggInterval, name, dateRange, dateStart, dateEnd, asn, location, continent, botClass, deviceType, httpVersion, ipVersion, os, tlsVersion, format);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling RadarHttpApi#radarGetHttpTimeseriesGroupByHttpProtocol");
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
| **botClass** | [**List&lt;String&gt;**](String.md)|  | [optional] [enum: LIKELY_AUTOMATED, LIKELY_HUMAN] |
| **deviceType** | [**List&lt;String&gt;**](String.md)|  | [optional] [enum: DESKTOP, MOBILE, OTHER] |
| **httpVersion** | [**List&lt;String&gt;**](String.md)|  | [optional] [enum: HTTPv1, HTTPv2, HTTPv3] |
| **ipVersion** | [**List&lt;String&gt;**](String.md)|  | [optional] [enum: IPv4, IPv6] |
| **os** | [**List&lt;String&gt;**](String.md)|  | [optional] [enum: WINDOWS, MACOSX, IOS, ANDROID, CHROMEOS, LINUX, SMART_TV] |
| **tlsVersion** | [**List&lt;String&gt;**](String.md)|  | [optional] [enum: TLSv1_0, TLSv1_1, TLSv1_2, TLSv1_3, TLSvQUIC] |
| **format** | **String**|  | [optional] [enum: JSON, CSV] |

### Return type

[**RadarGetHttpTimeseriesGroupByHttpProtocol200Response**](RadarGetHttpTimeseriesGroupByHttpProtocol200Response.md)

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

<a id="radarGetHttpTimeseriesGroupByHttpVersion"></a>
# **radarGetHttpTimeseriesGroupByHttpVersion**
> RadarGetHttpTimeseriesGroupByHttpVersion200Response radarGetHttpTimeseriesGroupByHttpVersion(aggInterval, name, dateRange, dateStart, dateEnd, asn, location, continent, botClass, deviceType, httpProtocol, ipVersion, os, tlsVersion, format)

Get HTTP Versions Time Series

Get a time series of the percentage distribution of traffic per HTTP protocol version.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.RadarHttpApi;

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

    RadarHttpApi apiInstance = new RadarHttpApi(defaultClient);
    String aggInterval = "15m"; // String | 
    List<String> name = Arrays.asList(); // List<String> | 
    List<String> dateRange = Arrays.asList(); // List<String> | 
    List<OffsetDateTime> dateStart = Arrays.asList(); // List<OffsetDateTime> | 
    List<OffsetDateTime> dateEnd = Arrays.asList(); // List<OffsetDateTime> | 
    List<String> asn = Arrays.asList(); // List<String> | 
    List<String> location = Arrays.asList(); // List<String> | 
    List<String> continent = Arrays.asList(); // List<String> | 
    List<String> botClass = Arrays.asList(); // List<String> | 
    List<String> deviceType = Arrays.asList(); // List<String> | 
    List<String> httpProtocol = Arrays.asList(); // List<String> | 
    List<String> ipVersion = Arrays.asList(); // List<String> | 
    List<String> os = Arrays.asList(); // List<String> | 
    List<String> tlsVersion = Arrays.asList(); // List<String> | 
    String format = "JSON"; // String | 
    try {
      RadarGetHttpTimeseriesGroupByHttpVersion200Response result = apiInstance.radarGetHttpTimeseriesGroupByHttpVersion(aggInterval, name, dateRange, dateStart, dateEnd, asn, location, continent, botClass, deviceType, httpProtocol, ipVersion, os, tlsVersion, format);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling RadarHttpApi#radarGetHttpTimeseriesGroupByHttpVersion");
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
| **botClass** | [**List&lt;String&gt;**](String.md)|  | [optional] [enum: LIKELY_AUTOMATED, LIKELY_HUMAN] |
| **deviceType** | [**List&lt;String&gt;**](String.md)|  | [optional] [enum: DESKTOP, MOBILE, OTHER] |
| **httpProtocol** | [**List&lt;String&gt;**](String.md)|  | [optional] [enum: HTTP, HTTPS] |
| **ipVersion** | [**List&lt;String&gt;**](String.md)|  | [optional] [enum: IPv4, IPv6] |
| **os** | [**List&lt;String&gt;**](String.md)|  | [optional] [enum: WINDOWS, MACOSX, IOS, ANDROID, CHROMEOS, LINUX, SMART_TV] |
| **tlsVersion** | [**List&lt;String&gt;**](String.md)|  | [optional] [enum: TLSv1_0, TLSv1_1, TLSv1_2, TLSv1_3, TLSvQUIC] |
| **format** | **String**|  | [optional] [enum: JSON, CSV] |

### Return type

[**RadarGetHttpTimeseriesGroupByHttpVersion200Response**](RadarGetHttpTimeseriesGroupByHttpVersion200Response.md)

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

<a id="radarGetHttpTimeseriesGroupByIpVersion"></a>
# **radarGetHttpTimeseriesGroupByIpVersion**
> RadarGetAttacksLayer3TimeseriesGroupByIpVersion200Response radarGetHttpTimeseriesGroupByIpVersion(aggInterval, name, dateRange, dateStart, dateEnd, asn, location, continent, botClass, deviceType, httpProtocol, httpVersion, os, tlsVersion, format)

Get IP Versions Time Series

Get a time series of the percentage distribution of traffic per IP protocol version.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.RadarHttpApi;

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

    RadarHttpApi apiInstance = new RadarHttpApi(defaultClient);
    String aggInterval = "15m"; // String | 
    List<String> name = Arrays.asList(); // List<String> | 
    List<String> dateRange = Arrays.asList(); // List<String> | 
    List<OffsetDateTime> dateStart = Arrays.asList(); // List<OffsetDateTime> | 
    List<OffsetDateTime> dateEnd = Arrays.asList(); // List<OffsetDateTime> | 
    List<String> asn = Arrays.asList(); // List<String> | 
    List<String> location = Arrays.asList(); // List<String> | 
    List<String> continent = Arrays.asList(); // List<String> | 
    List<String> botClass = Arrays.asList(); // List<String> | 
    List<String> deviceType = Arrays.asList(); // List<String> | 
    List<String> httpProtocol = Arrays.asList(); // List<String> | 
    List<String> httpVersion = Arrays.asList(); // List<String> | 
    List<String> os = Arrays.asList(); // List<String> | 
    List<String> tlsVersion = Arrays.asList(); // List<String> | 
    String format = "JSON"; // String | 
    try {
      RadarGetAttacksLayer3TimeseriesGroupByIpVersion200Response result = apiInstance.radarGetHttpTimeseriesGroupByIpVersion(aggInterval, name, dateRange, dateStart, dateEnd, asn, location, continent, botClass, deviceType, httpProtocol, httpVersion, os, tlsVersion, format);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling RadarHttpApi#radarGetHttpTimeseriesGroupByIpVersion");
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
| **botClass** | [**List&lt;String&gt;**](String.md)|  | [optional] [enum: LIKELY_AUTOMATED, LIKELY_HUMAN] |
| **deviceType** | [**List&lt;String&gt;**](String.md)|  | [optional] [enum: DESKTOP, MOBILE, OTHER] |
| **httpProtocol** | [**List&lt;String&gt;**](String.md)|  | [optional] [enum: HTTP, HTTPS] |
| **httpVersion** | [**List&lt;String&gt;**](String.md)|  | [optional] [enum: HTTPv1, HTTPv2, HTTPv3] |
| **os** | [**List&lt;String&gt;**](String.md)|  | [optional] [enum: WINDOWS, MACOSX, IOS, ANDROID, CHROMEOS, LINUX, SMART_TV] |
| **tlsVersion** | [**List&lt;String&gt;**](String.md)|  | [optional] [enum: TLSv1_0, TLSv1_1, TLSv1_2, TLSv1_3, TLSvQUIC] |
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

<a id="radarGetHttpTimeseriesGroupByOperatingSystem"></a>
# **radarGetHttpTimeseriesGroupByOperatingSystem**
> RadarGetHttpTimeseriesGroupByOperatingSystem200Response radarGetHttpTimeseriesGroupByOperatingSystem(aggInterval, name, dateRange, dateStart, dateEnd, asn, location, continent, botClass, deviceType, httpProtocol, httpVersion, ipVersion, tlsVersion, format)

Get Operating Systems Time Series

Get a time series of the percentage distribution of traffic of the top operating systems.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.RadarHttpApi;

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

    RadarHttpApi apiInstance = new RadarHttpApi(defaultClient);
    String aggInterval = "15m"; // String | 
    List<String> name = Arrays.asList(); // List<String> | 
    List<String> dateRange = Arrays.asList(); // List<String> | 
    List<OffsetDateTime> dateStart = Arrays.asList(); // List<OffsetDateTime> | 
    List<OffsetDateTime> dateEnd = Arrays.asList(); // List<OffsetDateTime> | 
    List<String> asn = Arrays.asList(); // List<String> | 
    List<String> location = Arrays.asList(); // List<String> | 
    List<String> continent = Arrays.asList(); // List<String> | 
    List<String> botClass = Arrays.asList(); // List<String> | 
    List<String> deviceType = Arrays.asList(); // List<String> | 
    List<String> httpProtocol = Arrays.asList(); // List<String> | 
    List<String> httpVersion = Arrays.asList(); // List<String> | 
    List<String> ipVersion = Arrays.asList(); // List<String> | 
    List<String> tlsVersion = Arrays.asList(); // List<String> | 
    String format = "JSON"; // String | 
    try {
      RadarGetHttpTimeseriesGroupByOperatingSystem200Response result = apiInstance.radarGetHttpTimeseriesGroupByOperatingSystem(aggInterval, name, dateRange, dateStart, dateEnd, asn, location, continent, botClass, deviceType, httpProtocol, httpVersion, ipVersion, tlsVersion, format);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling RadarHttpApi#radarGetHttpTimeseriesGroupByOperatingSystem");
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
| **botClass** | [**List&lt;String&gt;**](String.md)|  | [optional] [enum: LIKELY_AUTOMATED, LIKELY_HUMAN] |
| **deviceType** | [**List&lt;String&gt;**](String.md)|  | [optional] [enum: DESKTOP, MOBILE, OTHER] |
| **httpProtocol** | [**List&lt;String&gt;**](String.md)|  | [optional] [enum: HTTP, HTTPS] |
| **httpVersion** | [**List&lt;String&gt;**](String.md)|  | [optional] [enum: HTTPv1, HTTPv2, HTTPv3] |
| **ipVersion** | [**List&lt;String&gt;**](String.md)|  | [optional] [enum: IPv4, IPv6] |
| **tlsVersion** | [**List&lt;String&gt;**](String.md)|  | [optional] [enum: TLSv1_0, TLSv1_1, TLSv1_2, TLSv1_3, TLSvQUIC] |
| **format** | **String**|  | [optional] [enum: JSON, CSV] |

### Return type

[**RadarGetHttpTimeseriesGroupByOperatingSystem200Response**](RadarGetHttpTimeseriesGroupByOperatingSystem200Response.md)

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

<a id="radarGetHttpTimeseriesGroupByTlsVersion"></a>
# **radarGetHttpTimeseriesGroupByTlsVersion**
> RadarGetHttpTimeseriesGroupByTlsVersion200Response radarGetHttpTimeseriesGroupByTlsVersion(aggInterval, name, dateRange, dateStart, dateEnd, asn, location, continent, botClass, deviceType, httpProtocol, httpVersion, ipVersion, os, format)

Get TLS Versions Time Series

Get a time series of the percentage distribution of traffic per TLS protocol version.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.RadarHttpApi;

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

    RadarHttpApi apiInstance = new RadarHttpApi(defaultClient);
    String aggInterval = "15m"; // String | 
    List<String> name = Arrays.asList(); // List<String> | 
    List<String> dateRange = Arrays.asList(); // List<String> | 
    List<OffsetDateTime> dateStart = Arrays.asList(); // List<OffsetDateTime> | 
    List<OffsetDateTime> dateEnd = Arrays.asList(); // List<OffsetDateTime> | 
    List<String> asn = Arrays.asList(); // List<String> | 
    List<String> location = Arrays.asList(); // List<String> | 
    List<String> continent = Arrays.asList(); // List<String> | 
    List<String> botClass = Arrays.asList(); // List<String> | 
    List<String> deviceType = Arrays.asList(); // List<String> | 
    List<String> httpProtocol = Arrays.asList(); // List<String> | 
    List<String> httpVersion = Arrays.asList(); // List<String> | 
    List<String> ipVersion = Arrays.asList(); // List<String> | 
    List<String> os = Arrays.asList(); // List<String> | 
    String format = "JSON"; // String | 
    try {
      RadarGetHttpTimeseriesGroupByTlsVersion200Response result = apiInstance.radarGetHttpTimeseriesGroupByTlsVersion(aggInterval, name, dateRange, dateStart, dateEnd, asn, location, continent, botClass, deviceType, httpProtocol, httpVersion, ipVersion, os, format);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling RadarHttpApi#radarGetHttpTimeseriesGroupByTlsVersion");
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
| **botClass** | [**List&lt;String&gt;**](String.md)|  | [optional] [enum: LIKELY_AUTOMATED, LIKELY_HUMAN] |
| **deviceType** | [**List&lt;String&gt;**](String.md)|  | [optional] [enum: DESKTOP, MOBILE, OTHER] |
| **httpProtocol** | [**List&lt;String&gt;**](String.md)|  | [optional] [enum: HTTP, HTTPS] |
| **httpVersion** | [**List&lt;String&gt;**](String.md)|  | [optional] [enum: HTTPv1, HTTPv2, HTTPv3] |
| **ipVersion** | [**List&lt;String&gt;**](String.md)|  | [optional] [enum: IPv4, IPv6] |
| **os** | [**List&lt;String&gt;**](String.md)|  | [optional] [enum: WINDOWS, MACOSX, IOS, ANDROID, CHROMEOS, LINUX, SMART_TV] |
| **format** | **String**|  | [optional] [enum: JSON, CSV] |

### Return type

[**RadarGetHttpTimeseriesGroupByTlsVersion200Response**](RadarGetHttpTimeseriesGroupByTlsVersion200Response.md)

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

<a id="radarGetHttpTopAsesByBotClass"></a>
# **radarGetHttpTopAsesByBotClass**
> RadarGetHttpTopAsesByHttpRequests200Response radarGetHttpTopAsesByBotClass(botClass, limit, name, dateRange, dateStart, dateEnd, asn, location, continent, deviceType, httpProtocol, httpVersion, ipVersion, os, tlsVersion, format)

Get Top Autonomous Systems By Bot Class

Get the top autonomous systems (AS), by HTTP traffic, of the requested bot class. These two categories use Cloudflare&#39;s bot score - refer to [Bot Scores](https://developers.cloudflare.com/bots/concepts/bot-score) for more information. Values are a percentage out of the total traffic.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.RadarHttpApi;

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

    RadarHttpApi apiInstance = new RadarHttpApi(defaultClient);
    String botClass = "LIKELY_AUTOMATED"; // String | 
    Integer limit = 5; // Integer | 
    List<String> name = Arrays.asList(); // List<String> | 
    List<String> dateRange = Arrays.asList(); // List<String> | 
    List<OffsetDateTime> dateStart = Arrays.asList(); // List<OffsetDateTime> | 
    List<OffsetDateTime> dateEnd = Arrays.asList(); // List<OffsetDateTime> | 
    List<String> asn = Arrays.asList(); // List<String> | 
    List<String> location = Arrays.asList(); // List<String> | 
    List<String> continent = Arrays.asList(); // List<String> | 
    List<String> deviceType = Arrays.asList(); // List<String> | 
    List<String> httpProtocol = Arrays.asList(); // List<String> | 
    List<String> httpVersion = Arrays.asList(); // List<String> | 
    List<String> ipVersion = Arrays.asList(); // List<String> | 
    List<String> os = Arrays.asList(); // List<String> | 
    List<String> tlsVersion = Arrays.asList(); // List<String> | 
    String format = "JSON"; // String | 
    try {
      RadarGetHttpTopAsesByHttpRequests200Response result = apiInstance.radarGetHttpTopAsesByBotClass(botClass, limit, name, dateRange, dateStart, dateEnd, asn, location, continent, deviceType, httpProtocol, httpVersion, ipVersion, os, tlsVersion, format);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling RadarHttpApi#radarGetHttpTopAsesByBotClass");
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
| **botClass** | **String**|  | [enum: LIKELY_AUTOMATED, LIKELY_HUMAN] |
| **limit** | **Integer**|  | [optional] |
| **name** | [**List&lt;String&gt;**](String.md)|  | [optional] |
| **dateRange** | [**List&lt;String&gt;**](String.md)|  | [optional] [enum: 1d, 2d, 7d, 14d, 28d, 12w, 24w, 52w, 1dControl, 2dControl, 7dControl, 14dControl, 28dControl, 12wControl, 24wControl] |
| **dateStart** | [**List&lt;OffsetDateTime&gt;**](OffsetDateTime.md)|  | [optional] |
| **dateEnd** | [**List&lt;OffsetDateTime&gt;**](OffsetDateTime.md)|  | [optional] |
| **asn** | [**List&lt;String&gt;**](String.md)|  | [optional] |
| **location** | [**List&lt;String&gt;**](String.md)|  | [optional] |
| **continent** | [**List&lt;String&gt;**](String.md)|  | [optional] |
| **deviceType** | [**List&lt;String&gt;**](String.md)|  | [optional] [enum: DESKTOP, MOBILE, OTHER] |
| **httpProtocol** | [**List&lt;String&gt;**](String.md)|  | [optional] [enum: HTTP, HTTPS] |
| **httpVersion** | [**List&lt;String&gt;**](String.md)|  | [optional] [enum: HTTPv1, HTTPv2, HTTPv3] |
| **ipVersion** | [**List&lt;String&gt;**](String.md)|  | [optional] [enum: IPv4, IPv6] |
| **os** | [**List&lt;String&gt;**](String.md)|  | [optional] [enum: WINDOWS, MACOSX, IOS, ANDROID, CHROMEOS, LINUX, SMART_TV] |
| **tlsVersion** | [**List&lt;String&gt;**](String.md)|  | [optional] [enum: TLSv1_0, TLSv1_1, TLSv1_2, TLSv1_3, TLSvQUIC] |
| **format** | **String**|  | [optional] [enum: JSON, CSV] |

### Return type

[**RadarGetHttpTopAsesByHttpRequests200Response**](RadarGetHttpTopAsesByHttpRequests200Response.md)

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

<a id="radarGetHttpTopAsesByDeviceType"></a>
# **radarGetHttpTopAsesByDeviceType**
> RadarGetHttpTopAsesByHttpRequests200Response radarGetHttpTopAsesByDeviceType(deviceType, limit, name, dateRange, dateStart, dateEnd, asn, location, continent, botClass, httpProtocol, httpVersion, ipVersion, os, tlsVersion, format)

Get Top Autonomous Systems By Device Type

Get the top autonomous systems (AS), by HTTP traffic, of the requested device type. Values are a percentage out of the total traffic.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.RadarHttpApi;

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

    RadarHttpApi apiInstance = new RadarHttpApi(defaultClient);
    String deviceType = "DESKTOP"; // String | 
    Integer limit = 5; // Integer | 
    List<String> name = Arrays.asList(); // List<String> | 
    List<String> dateRange = Arrays.asList(); // List<String> | 
    List<OffsetDateTime> dateStart = Arrays.asList(); // List<OffsetDateTime> | 
    List<OffsetDateTime> dateEnd = Arrays.asList(); // List<OffsetDateTime> | 
    List<String> asn = Arrays.asList(); // List<String> | 
    List<String> location = Arrays.asList(); // List<String> | 
    List<String> continent = Arrays.asList(); // List<String> | 
    List<String> botClass = Arrays.asList(); // List<String> | 
    List<String> httpProtocol = Arrays.asList(); // List<String> | 
    List<String> httpVersion = Arrays.asList(); // List<String> | 
    List<String> ipVersion = Arrays.asList(); // List<String> | 
    List<String> os = Arrays.asList(); // List<String> | 
    List<String> tlsVersion = Arrays.asList(); // List<String> | 
    String format = "JSON"; // String | 
    try {
      RadarGetHttpTopAsesByHttpRequests200Response result = apiInstance.radarGetHttpTopAsesByDeviceType(deviceType, limit, name, dateRange, dateStart, dateEnd, asn, location, continent, botClass, httpProtocol, httpVersion, ipVersion, os, tlsVersion, format);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling RadarHttpApi#radarGetHttpTopAsesByDeviceType");
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
| **deviceType** | **String**|  | [enum: DESKTOP, MOBILE, OTHER] |
| **limit** | **Integer**|  | [optional] |
| **name** | [**List&lt;String&gt;**](String.md)|  | [optional] |
| **dateRange** | [**List&lt;String&gt;**](String.md)|  | [optional] [enum: 1d, 2d, 7d, 14d, 28d, 12w, 24w, 52w, 1dControl, 2dControl, 7dControl, 14dControl, 28dControl, 12wControl, 24wControl] |
| **dateStart** | [**List&lt;OffsetDateTime&gt;**](OffsetDateTime.md)|  | [optional] |
| **dateEnd** | [**List&lt;OffsetDateTime&gt;**](OffsetDateTime.md)|  | [optional] |
| **asn** | [**List&lt;String&gt;**](String.md)|  | [optional] |
| **location** | [**List&lt;String&gt;**](String.md)|  | [optional] |
| **continent** | [**List&lt;String&gt;**](String.md)|  | [optional] |
| **botClass** | [**List&lt;String&gt;**](String.md)|  | [optional] [enum: LIKELY_AUTOMATED, LIKELY_HUMAN] |
| **httpProtocol** | [**List&lt;String&gt;**](String.md)|  | [optional] [enum: HTTP, HTTPS] |
| **httpVersion** | [**List&lt;String&gt;**](String.md)|  | [optional] [enum: HTTPv1, HTTPv2, HTTPv3] |
| **ipVersion** | [**List&lt;String&gt;**](String.md)|  | [optional] [enum: IPv4, IPv6] |
| **os** | [**List&lt;String&gt;**](String.md)|  | [optional] [enum: WINDOWS, MACOSX, IOS, ANDROID, CHROMEOS, LINUX, SMART_TV] |
| **tlsVersion** | [**List&lt;String&gt;**](String.md)|  | [optional] [enum: TLSv1_0, TLSv1_1, TLSv1_2, TLSv1_3, TLSvQUIC] |
| **format** | **String**|  | [optional] [enum: JSON, CSV] |

### Return type

[**RadarGetHttpTopAsesByHttpRequests200Response**](RadarGetHttpTopAsesByHttpRequests200Response.md)

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

<a id="radarGetHttpTopAsesByHttpProtocol"></a>
# **radarGetHttpTopAsesByHttpProtocol**
> RadarGetHttpTopAsesByHttpRequests200Response radarGetHttpTopAsesByHttpProtocol(httpProtocol, limit, name, dateRange, dateStart, dateEnd, asn, location, continent, botClass, deviceType, httpProtocol2, ipVersion, os, tlsVersion, format)

Get Top Autonomous Systems By HTTP Protocol

Get the top autonomous systems (AS), by HTTP traffic, of the requested HTTP protocol. Values are a percentage out of the total traffic.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.RadarHttpApi;

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

    RadarHttpApi apiInstance = new RadarHttpApi(defaultClient);
    String httpProtocol = "HTTP"; // String | 
    Integer limit = 5; // Integer | 
    List<String> name = Arrays.asList(); // List<String> | 
    List<String> dateRange = Arrays.asList(); // List<String> | 
    List<OffsetDateTime> dateStart = Arrays.asList(); // List<OffsetDateTime> | 
    List<OffsetDateTime> dateEnd = Arrays.asList(); // List<OffsetDateTime> | 
    List<String> asn = Arrays.asList(); // List<String> | 
    List<String> location = Arrays.asList(); // List<String> | 
    List<String> continent = Arrays.asList(); // List<String> | 
    List<String> botClass = Arrays.asList(); // List<String> | 
    List<String> deviceType = Arrays.asList(); // List<String> | 
    List<String> httpProtocol2 = Arrays.asList(); // List<String> | 
    List<String> ipVersion = Arrays.asList(); // List<String> | 
    List<String> os = Arrays.asList(); // List<String> | 
    List<String> tlsVersion = Arrays.asList(); // List<String> | 
    String format = "JSON"; // String | 
    try {
      RadarGetHttpTopAsesByHttpRequests200Response result = apiInstance.radarGetHttpTopAsesByHttpProtocol(httpProtocol, limit, name, dateRange, dateStart, dateEnd, asn, location, continent, botClass, deviceType, httpProtocol2, ipVersion, os, tlsVersion, format);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling RadarHttpApi#radarGetHttpTopAsesByHttpProtocol");
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
| **httpProtocol** | **String**|  | [enum: HTTP, HTTPS] |
| **limit** | **Integer**|  | [optional] |
| **name** | [**List&lt;String&gt;**](String.md)|  | [optional] |
| **dateRange** | [**List&lt;String&gt;**](String.md)|  | [optional] [enum: 1d, 2d, 7d, 14d, 28d, 12w, 24w, 52w, 1dControl, 2dControl, 7dControl, 14dControl, 28dControl, 12wControl, 24wControl] |
| **dateStart** | [**List&lt;OffsetDateTime&gt;**](OffsetDateTime.md)|  | [optional] |
| **dateEnd** | [**List&lt;OffsetDateTime&gt;**](OffsetDateTime.md)|  | [optional] |
| **asn** | [**List&lt;String&gt;**](String.md)|  | [optional] |
| **location** | [**List&lt;String&gt;**](String.md)|  | [optional] |
| **continent** | [**List&lt;String&gt;**](String.md)|  | [optional] |
| **botClass** | [**List&lt;String&gt;**](String.md)|  | [optional] [enum: LIKELY_AUTOMATED, LIKELY_HUMAN] |
| **deviceType** | [**List&lt;String&gt;**](String.md)|  | [optional] [enum: DESKTOP, MOBILE, OTHER] |
| **httpProtocol2** | [**List&lt;String&gt;**](String.md)|  | [optional] [enum: HTTP, HTTPS] |
| **ipVersion** | [**List&lt;String&gt;**](String.md)|  | [optional] [enum: IPv4, IPv6] |
| **os** | [**List&lt;String&gt;**](String.md)|  | [optional] [enum: WINDOWS, MACOSX, IOS, ANDROID, CHROMEOS, LINUX, SMART_TV] |
| **tlsVersion** | [**List&lt;String&gt;**](String.md)|  | [optional] [enum: TLSv1_0, TLSv1_1, TLSv1_2, TLSv1_3, TLSvQUIC] |
| **format** | **String**|  | [optional] [enum: JSON, CSV] |

### Return type

[**RadarGetHttpTopAsesByHttpRequests200Response**](RadarGetHttpTopAsesByHttpRequests200Response.md)

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

<a id="radarGetHttpTopAsesByHttpRequests"></a>
# **radarGetHttpTopAsesByHttpRequests**
> RadarGetHttpTopAsesByHttpRequests200Response radarGetHttpTopAsesByHttpRequests(limit, name, dateRange, dateStart, dateEnd, asn, location, continent, botClass, deviceType, httpProtocol, httpVersion, ipVersion, os, tlsVersion, format)

Get Top Autonomous Systems By HTTP Requests

Get the top autonomous systems by HTTP traffic. Values are a percentage out of the total traffic.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.RadarHttpApi;

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

    RadarHttpApi apiInstance = new RadarHttpApi(defaultClient);
    Integer limit = 5; // Integer | 
    List<String> name = Arrays.asList(); // List<String> | 
    List<String> dateRange = Arrays.asList(); // List<String> | 
    List<OffsetDateTime> dateStart = Arrays.asList(); // List<OffsetDateTime> | 
    List<OffsetDateTime> dateEnd = Arrays.asList(); // List<OffsetDateTime> | 
    List<String> asn = Arrays.asList(); // List<String> | 
    List<String> location = Arrays.asList(); // List<String> | 
    List<String> continent = Arrays.asList(); // List<String> | 
    List<String> botClass = Arrays.asList(); // List<String> | 
    List<String> deviceType = Arrays.asList(); // List<String> | 
    List<String> httpProtocol = Arrays.asList(); // List<String> | 
    List<String> httpVersion = Arrays.asList(); // List<String> | 
    List<String> ipVersion = Arrays.asList(); // List<String> | 
    List<String> os = Arrays.asList(); // List<String> | 
    List<String> tlsVersion = Arrays.asList(); // List<String> | 
    String format = "JSON"; // String | 
    try {
      RadarGetHttpTopAsesByHttpRequests200Response result = apiInstance.radarGetHttpTopAsesByHttpRequests(limit, name, dateRange, dateStart, dateEnd, asn, location, continent, botClass, deviceType, httpProtocol, httpVersion, ipVersion, os, tlsVersion, format);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling RadarHttpApi#radarGetHttpTopAsesByHttpRequests");
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
| **botClass** | [**List&lt;String&gt;**](String.md)|  | [optional] [enum: LIKELY_AUTOMATED, LIKELY_HUMAN] |
| **deviceType** | [**List&lt;String&gt;**](String.md)|  | [optional] [enum: DESKTOP, MOBILE, OTHER] |
| **httpProtocol** | [**List&lt;String&gt;**](String.md)|  | [optional] [enum: HTTP, HTTPS] |
| **httpVersion** | [**List&lt;String&gt;**](String.md)|  | [optional] [enum: HTTPv1, HTTPv2, HTTPv3] |
| **ipVersion** | [**List&lt;String&gt;**](String.md)|  | [optional] [enum: IPv4, IPv6] |
| **os** | [**List&lt;String&gt;**](String.md)|  | [optional] [enum: WINDOWS, MACOSX, IOS, ANDROID, CHROMEOS, LINUX, SMART_TV] |
| **tlsVersion** | [**List&lt;String&gt;**](String.md)|  | [optional] [enum: TLSv1_0, TLSv1_1, TLSv1_2, TLSv1_3, TLSvQUIC] |
| **format** | **String**|  | [optional] [enum: JSON, CSV] |

### Return type

[**RadarGetHttpTopAsesByHttpRequests200Response**](RadarGetHttpTopAsesByHttpRequests200Response.md)

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

<a id="radarGetHttpTopAsesByHttpVersion"></a>
# **radarGetHttpTopAsesByHttpVersion**
> RadarGetHttpTopAsesByHttpRequests200Response radarGetHttpTopAsesByHttpVersion(httpVersion, limit, name, dateRange, dateStart, dateEnd, asn, location, continent, botClass, deviceType, httpProtocol, ipVersion, os, tlsVersion, format)

Get Top Autonomous Systems By HTTP Version

Get the top autonomous systems (AS), by HTTP traffic, of the requested HTTP protocol version. Values are a percentage out of the total traffic.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.RadarHttpApi;

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

    RadarHttpApi apiInstance = new RadarHttpApi(defaultClient);
    String httpVersion = "HTTPv1"; // String | 
    Integer limit = 5; // Integer | 
    List<String> name = Arrays.asList(); // List<String> | 
    List<String> dateRange = Arrays.asList(); // List<String> | 
    List<OffsetDateTime> dateStart = Arrays.asList(); // List<OffsetDateTime> | 
    List<OffsetDateTime> dateEnd = Arrays.asList(); // List<OffsetDateTime> | 
    List<String> asn = Arrays.asList(); // List<String> | 
    List<String> location = Arrays.asList(); // List<String> | 
    List<String> continent = Arrays.asList(); // List<String> | 
    List<String> botClass = Arrays.asList(); // List<String> | 
    List<String> deviceType = Arrays.asList(); // List<String> | 
    List<String> httpProtocol = Arrays.asList(); // List<String> | 
    List<String> ipVersion = Arrays.asList(); // List<String> | 
    List<String> os = Arrays.asList(); // List<String> | 
    List<String> tlsVersion = Arrays.asList(); // List<String> | 
    String format = "JSON"; // String | 
    try {
      RadarGetHttpTopAsesByHttpRequests200Response result = apiInstance.radarGetHttpTopAsesByHttpVersion(httpVersion, limit, name, dateRange, dateStart, dateEnd, asn, location, continent, botClass, deviceType, httpProtocol, ipVersion, os, tlsVersion, format);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling RadarHttpApi#radarGetHttpTopAsesByHttpVersion");
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
| **httpVersion** | **String**|  | [enum: HTTPv1, HTTPv2, HTTPv3] |
| **limit** | **Integer**|  | [optional] |
| **name** | [**List&lt;String&gt;**](String.md)|  | [optional] |
| **dateRange** | [**List&lt;String&gt;**](String.md)|  | [optional] [enum: 1d, 2d, 7d, 14d, 28d, 12w, 24w, 52w, 1dControl, 2dControl, 7dControl, 14dControl, 28dControl, 12wControl, 24wControl] |
| **dateStart** | [**List&lt;OffsetDateTime&gt;**](OffsetDateTime.md)|  | [optional] |
| **dateEnd** | [**List&lt;OffsetDateTime&gt;**](OffsetDateTime.md)|  | [optional] |
| **asn** | [**List&lt;String&gt;**](String.md)|  | [optional] |
| **location** | [**List&lt;String&gt;**](String.md)|  | [optional] |
| **continent** | [**List&lt;String&gt;**](String.md)|  | [optional] |
| **botClass** | [**List&lt;String&gt;**](String.md)|  | [optional] [enum: LIKELY_AUTOMATED, LIKELY_HUMAN] |
| **deviceType** | [**List&lt;String&gt;**](String.md)|  | [optional] [enum: DESKTOP, MOBILE, OTHER] |
| **httpProtocol** | [**List&lt;String&gt;**](String.md)|  | [optional] [enum: HTTP, HTTPS] |
| **ipVersion** | [**List&lt;String&gt;**](String.md)|  | [optional] [enum: IPv4, IPv6] |
| **os** | [**List&lt;String&gt;**](String.md)|  | [optional] [enum: WINDOWS, MACOSX, IOS, ANDROID, CHROMEOS, LINUX, SMART_TV] |
| **tlsVersion** | [**List&lt;String&gt;**](String.md)|  | [optional] [enum: TLSv1_0, TLSv1_1, TLSv1_2, TLSv1_3, TLSvQUIC] |
| **format** | **String**|  | [optional] [enum: JSON, CSV] |

### Return type

[**RadarGetHttpTopAsesByHttpRequests200Response**](RadarGetHttpTopAsesByHttpRequests200Response.md)

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

<a id="radarGetHttpTopAsesByIpVersion"></a>
# **radarGetHttpTopAsesByIpVersion**
> RadarGetHttpTopAsesByHttpRequests200Response radarGetHttpTopAsesByIpVersion(ipVersion, limit, name, dateRange, dateStart, dateEnd, asn, location, continent, botClass, deviceType, httpProtocol, httpVersion, os, tlsVersion, format)

Get Top Autonomous Systems By IP Version

Get the top autonomous systems, by HTTP traffic, of the requested IP protocol version. Values are a percentage out of the total traffic.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.RadarHttpApi;

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

    RadarHttpApi apiInstance = new RadarHttpApi(defaultClient);
    String ipVersion = "IPv4"; // String | 
    Integer limit = 5; // Integer | 
    List<String> name = Arrays.asList(); // List<String> | 
    List<String> dateRange = Arrays.asList(); // List<String> | 
    List<OffsetDateTime> dateStart = Arrays.asList(); // List<OffsetDateTime> | 
    List<OffsetDateTime> dateEnd = Arrays.asList(); // List<OffsetDateTime> | 
    List<String> asn = Arrays.asList(); // List<String> | 
    List<String> location = Arrays.asList(); // List<String> | 
    List<String> continent = Arrays.asList(); // List<String> | 
    List<String> botClass = Arrays.asList(); // List<String> | 
    List<String> deviceType = Arrays.asList(); // List<String> | 
    List<String> httpProtocol = Arrays.asList(); // List<String> | 
    List<String> httpVersion = Arrays.asList(); // List<String> | 
    List<String> os = Arrays.asList(); // List<String> | 
    List<String> tlsVersion = Arrays.asList(); // List<String> | 
    String format = "JSON"; // String | 
    try {
      RadarGetHttpTopAsesByHttpRequests200Response result = apiInstance.radarGetHttpTopAsesByIpVersion(ipVersion, limit, name, dateRange, dateStart, dateEnd, asn, location, continent, botClass, deviceType, httpProtocol, httpVersion, os, tlsVersion, format);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling RadarHttpApi#radarGetHttpTopAsesByIpVersion");
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
| **ipVersion** | **String**|  | [enum: IPv4, IPv6] |
| **limit** | **Integer**|  | [optional] |
| **name** | [**List&lt;String&gt;**](String.md)|  | [optional] |
| **dateRange** | [**List&lt;String&gt;**](String.md)|  | [optional] [enum: 1d, 2d, 7d, 14d, 28d, 12w, 24w, 52w, 1dControl, 2dControl, 7dControl, 14dControl, 28dControl, 12wControl, 24wControl] |
| **dateStart** | [**List&lt;OffsetDateTime&gt;**](OffsetDateTime.md)|  | [optional] |
| **dateEnd** | [**List&lt;OffsetDateTime&gt;**](OffsetDateTime.md)|  | [optional] |
| **asn** | [**List&lt;String&gt;**](String.md)|  | [optional] |
| **location** | [**List&lt;String&gt;**](String.md)|  | [optional] |
| **continent** | [**List&lt;String&gt;**](String.md)|  | [optional] |
| **botClass** | [**List&lt;String&gt;**](String.md)|  | [optional] [enum: LIKELY_AUTOMATED, LIKELY_HUMAN] |
| **deviceType** | [**List&lt;String&gt;**](String.md)|  | [optional] [enum: DESKTOP, MOBILE, OTHER] |
| **httpProtocol** | [**List&lt;String&gt;**](String.md)|  | [optional] [enum: HTTP, HTTPS] |
| **httpVersion** | [**List&lt;String&gt;**](String.md)|  | [optional] [enum: HTTPv1, HTTPv2, HTTPv3] |
| **os** | [**List&lt;String&gt;**](String.md)|  | [optional] [enum: WINDOWS, MACOSX, IOS, ANDROID, CHROMEOS, LINUX, SMART_TV] |
| **tlsVersion** | [**List&lt;String&gt;**](String.md)|  | [optional] [enum: TLSv1_0, TLSv1_1, TLSv1_2, TLSv1_3, TLSvQUIC] |
| **format** | **String**|  | [optional] [enum: JSON, CSV] |

### Return type

[**RadarGetHttpTopAsesByHttpRequests200Response**](RadarGetHttpTopAsesByHttpRequests200Response.md)

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

<a id="radarGetHttpTopAsesByOperatingSystem"></a>
# **radarGetHttpTopAsesByOperatingSystem**
> RadarGetHttpTopAsesByHttpRequests200Response radarGetHttpTopAsesByOperatingSystem(os, limit, name, dateRange, dateStart, dateEnd, asn, location, continent, botClass, deviceType, httpProtocol, httpVersion, ipVersion, tlsVersion, format)

Get Top Autonomous Systems By Operating System

Get the top autonomous systems, by HTTP traffic, of the requested operating systems. Values are a percentage out of the total traffic.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.RadarHttpApi;

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

    RadarHttpApi apiInstance = new RadarHttpApi(defaultClient);
    String os = "WINDOWS"; // String | 
    Integer limit = 5; // Integer | 
    List<String> name = Arrays.asList(); // List<String> | 
    List<String> dateRange = Arrays.asList(); // List<String> | 
    List<OffsetDateTime> dateStart = Arrays.asList(); // List<OffsetDateTime> | 
    List<OffsetDateTime> dateEnd = Arrays.asList(); // List<OffsetDateTime> | 
    List<String> asn = Arrays.asList(); // List<String> | 
    List<String> location = Arrays.asList(); // List<String> | 
    List<String> continent = Arrays.asList(); // List<String> | 
    List<String> botClass = Arrays.asList(); // List<String> | 
    List<String> deviceType = Arrays.asList(); // List<String> | 
    List<String> httpProtocol = Arrays.asList(); // List<String> | 
    List<String> httpVersion = Arrays.asList(); // List<String> | 
    List<String> ipVersion = Arrays.asList(); // List<String> | 
    List<String> tlsVersion = Arrays.asList(); // List<String> | 
    String format = "JSON"; // String | 
    try {
      RadarGetHttpTopAsesByHttpRequests200Response result = apiInstance.radarGetHttpTopAsesByOperatingSystem(os, limit, name, dateRange, dateStart, dateEnd, asn, location, continent, botClass, deviceType, httpProtocol, httpVersion, ipVersion, tlsVersion, format);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling RadarHttpApi#radarGetHttpTopAsesByOperatingSystem");
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
| **os** | **String**|  | [enum: WINDOWS, MACOSX, IOS, ANDROID, CHROMEOS, LINUX, SMART_TV] |
| **limit** | **Integer**|  | [optional] |
| **name** | [**List&lt;String&gt;**](String.md)|  | [optional] |
| **dateRange** | [**List&lt;String&gt;**](String.md)|  | [optional] [enum: 1d, 2d, 7d, 14d, 28d, 12w, 24w, 52w, 1dControl, 2dControl, 7dControl, 14dControl, 28dControl, 12wControl, 24wControl] |
| **dateStart** | [**List&lt;OffsetDateTime&gt;**](OffsetDateTime.md)|  | [optional] |
| **dateEnd** | [**List&lt;OffsetDateTime&gt;**](OffsetDateTime.md)|  | [optional] |
| **asn** | [**List&lt;String&gt;**](String.md)|  | [optional] |
| **location** | [**List&lt;String&gt;**](String.md)|  | [optional] |
| **continent** | [**List&lt;String&gt;**](String.md)|  | [optional] |
| **botClass** | [**List&lt;String&gt;**](String.md)|  | [optional] [enum: LIKELY_AUTOMATED, LIKELY_HUMAN] |
| **deviceType** | [**List&lt;String&gt;**](String.md)|  | [optional] [enum: DESKTOP, MOBILE, OTHER] |
| **httpProtocol** | [**List&lt;String&gt;**](String.md)|  | [optional] [enum: HTTP, HTTPS] |
| **httpVersion** | [**List&lt;String&gt;**](String.md)|  | [optional] [enum: HTTPv1, HTTPv2, HTTPv3] |
| **ipVersion** | [**List&lt;String&gt;**](String.md)|  | [optional] [enum: IPv4, IPv6] |
| **tlsVersion** | [**List&lt;String&gt;**](String.md)|  | [optional] [enum: TLSv1_0, TLSv1_1, TLSv1_2, TLSv1_3, TLSvQUIC] |
| **format** | **String**|  | [optional] [enum: JSON, CSV] |

### Return type

[**RadarGetHttpTopAsesByHttpRequests200Response**](RadarGetHttpTopAsesByHttpRequests200Response.md)

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

<a id="radarGetHttpTopAsesByTlsVersion"></a>
# **radarGetHttpTopAsesByTlsVersion**
> RadarGetHttpTopAsesByHttpRequests200Response radarGetHttpTopAsesByTlsVersion(tlsVersion, limit, name, dateRange, dateStart, dateEnd, asn, location, continent, botClass, deviceType, httpProtocol, httpVersion, ipVersion, os, format)

Get Top Autonomous Systems By TLS Version

Get the top autonomous systems (AS), by HTTP traffic, of the requested TLS protocol version. Values are a percentage out of the total traffic.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.RadarHttpApi;

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

    RadarHttpApi apiInstance = new RadarHttpApi(defaultClient);
    String tlsVersion = "TLSv1_0"; // String | 
    Integer limit = 5; // Integer | 
    List<String> name = Arrays.asList(); // List<String> | 
    List<String> dateRange = Arrays.asList(); // List<String> | 
    List<OffsetDateTime> dateStart = Arrays.asList(); // List<OffsetDateTime> | 
    List<OffsetDateTime> dateEnd = Arrays.asList(); // List<OffsetDateTime> | 
    List<String> asn = Arrays.asList(); // List<String> | 
    List<String> location = Arrays.asList(); // List<String> | 
    List<String> continent = Arrays.asList(); // List<String> | 
    List<String> botClass = Arrays.asList(); // List<String> | 
    List<String> deviceType = Arrays.asList(); // List<String> | 
    List<String> httpProtocol = Arrays.asList(); // List<String> | 
    List<String> httpVersion = Arrays.asList(); // List<String> | 
    List<String> ipVersion = Arrays.asList(); // List<String> | 
    List<String> os = Arrays.asList(); // List<String> | 
    String format = "JSON"; // String | 
    try {
      RadarGetHttpTopAsesByHttpRequests200Response result = apiInstance.radarGetHttpTopAsesByTlsVersion(tlsVersion, limit, name, dateRange, dateStart, dateEnd, asn, location, continent, botClass, deviceType, httpProtocol, httpVersion, ipVersion, os, format);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling RadarHttpApi#radarGetHttpTopAsesByTlsVersion");
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
| **tlsVersion** | **String**|  | [enum: TLSv1_0, TLSv1_1, TLSv1_2, TLSv1_3, TLSvQUIC] |
| **limit** | **Integer**|  | [optional] |
| **name** | [**List&lt;String&gt;**](String.md)|  | [optional] |
| **dateRange** | [**List&lt;String&gt;**](String.md)|  | [optional] [enum: 1d, 2d, 7d, 14d, 28d, 12w, 24w, 52w, 1dControl, 2dControl, 7dControl, 14dControl, 28dControl, 12wControl, 24wControl] |
| **dateStart** | [**List&lt;OffsetDateTime&gt;**](OffsetDateTime.md)|  | [optional] |
| **dateEnd** | [**List&lt;OffsetDateTime&gt;**](OffsetDateTime.md)|  | [optional] |
| **asn** | [**List&lt;String&gt;**](String.md)|  | [optional] |
| **location** | [**List&lt;String&gt;**](String.md)|  | [optional] |
| **continent** | [**List&lt;String&gt;**](String.md)|  | [optional] |
| **botClass** | [**List&lt;String&gt;**](String.md)|  | [optional] [enum: LIKELY_AUTOMATED, LIKELY_HUMAN] |
| **deviceType** | [**List&lt;String&gt;**](String.md)|  | [optional] [enum: DESKTOP, MOBILE, OTHER] |
| **httpProtocol** | [**List&lt;String&gt;**](String.md)|  | [optional] [enum: HTTP, HTTPS] |
| **httpVersion** | [**List&lt;String&gt;**](String.md)|  | [optional] [enum: HTTPv1, HTTPv2, HTTPv3] |
| **ipVersion** | [**List&lt;String&gt;**](String.md)|  | [optional] [enum: IPv4, IPv6] |
| **os** | [**List&lt;String&gt;**](String.md)|  | [optional] [enum: WINDOWS, MACOSX, IOS, ANDROID, CHROMEOS, LINUX, SMART_TV] |
| **format** | **String**|  | [optional] [enum: JSON, CSV] |

### Return type

[**RadarGetHttpTopAsesByHttpRequests200Response**](RadarGetHttpTopAsesByHttpRequests200Response.md)

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

<a id="radarGetHttpTopBrowserFamilies"></a>
# **radarGetHttpTopBrowserFamilies**
> RadarGetHttpTopBrowserFamilies200Response radarGetHttpTopBrowserFamilies(limit, name, dateRange, dateStart, dateEnd, asn, location, continent, botClass, deviceType, httpProtocol, httpVersion, ipVersion, os, tlsVersion, format)

Get Top User Agents Families by HTTP requests

Get the top user agents aggregated in families by HTTP traffic. Values are a percentage out of the total traffic.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.RadarHttpApi;

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

    RadarHttpApi apiInstance = new RadarHttpApi(defaultClient);
    Integer limit = 5; // Integer | 
    List<String> name = Arrays.asList(); // List<String> | 
    List<String> dateRange = Arrays.asList(); // List<String> | 
    List<OffsetDateTime> dateStart = Arrays.asList(); // List<OffsetDateTime> | 
    List<OffsetDateTime> dateEnd = Arrays.asList(); // List<OffsetDateTime> | 
    List<String> asn = Arrays.asList(); // List<String> | 
    List<String> location = Arrays.asList(); // List<String> | 
    List<String> continent = Arrays.asList(); // List<String> | 
    List<String> botClass = Arrays.asList(); // List<String> | 
    List<String> deviceType = Arrays.asList(); // List<String> | 
    List<String> httpProtocol = Arrays.asList(); // List<String> | 
    List<String> httpVersion = Arrays.asList(); // List<String> | 
    List<String> ipVersion = Arrays.asList(); // List<String> | 
    List<String> os = Arrays.asList(); // List<String> | 
    List<String> tlsVersion = Arrays.asList(); // List<String> | 
    String format = "JSON"; // String | 
    try {
      RadarGetHttpTopBrowserFamilies200Response result = apiInstance.radarGetHttpTopBrowserFamilies(limit, name, dateRange, dateStart, dateEnd, asn, location, continent, botClass, deviceType, httpProtocol, httpVersion, ipVersion, os, tlsVersion, format);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling RadarHttpApi#radarGetHttpTopBrowserFamilies");
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
| **botClass** | [**List&lt;String&gt;**](String.md)|  | [optional] [enum: LIKELY_AUTOMATED, LIKELY_HUMAN] |
| **deviceType** | [**List&lt;String&gt;**](String.md)|  | [optional] [enum: DESKTOP, MOBILE, OTHER] |
| **httpProtocol** | [**List&lt;String&gt;**](String.md)|  | [optional] [enum: HTTP, HTTPS] |
| **httpVersion** | [**List&lt;String&gt;**](String.md)|  | [optional] [enum: HTTPv1, HTTPv2, HTTPv3] |
| **ipVersion** | [**List&lt;String&gt;**](String.md)|  | [optional] [enum: IPv4, IPv6] |
| **os** | [**List&lt;String&gt;**](String.md)|  | [optional] [enum: WINDOWS, MACOSX, IOS, ANDROID, CHROMEOS, LINUX, SMART_TV] |
| **tlsVersion** | [**List&lt;String&gt;**](String.md)|  | [optional] [enum: TLSv1_0, TLSv1_1, TLSv1_2, TLSv1_3, TLSvQUIC] |
| **format** | **String**|  | [optional] [enum: JSON, CSV] |

### Return type

[**RadarGetHttpTopBrowserFamilies200Response**](RadarGetHttpTopBrowserFamilies200Response.md)

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

<a id="radarGetHttpTopBrowsers"></a>
# **radarGetHttpTopBrowsers**
> RadarGetHttpTopBrowserFamilies200Response radarGetHttpTopBrowsers(limit, name, dateRange, dateStart, dateEnd, asn, location, continent, botClass, deviceType, httpProtocol, httpVersion, ipVersion, os, tlsVersion, format)

Get Top User Agents By HTTP requests

Get the top user agents by HTTP traffic. Values are a percentage out of the total traffic.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.RadarHttpApi;

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

    RadarHttpApi apiInstance = new RadarHttpApi(defaultClient);
    Integer limit = 5; // Integer | 
    List<String> name = Arrays.asList(); // List<String> | 
    List<String> dateRange = Arrays.asList(); // List<String> | 
    List<OffsetDateTime> dateStart = Arrays.asList(); // List<OffsetDateTime> | 
    List<OffsetDateTime> dateEnd = Arrays.asList(); // List<OffsetDateTime> | 
    List<String> asn = Arrays.asList(); // List<String> | 
    List<String> location = Arrays.asList(); // List<String> | 
    List<String> continent = Arrays.asList(); // List<String> | 
    List<String> botClass = Arrays.asList(); // List<String> | 
    List<String> deviceType = Arrays.asList(); // List<String> | 
    List<String> httpProtocol = Arrays.asList(); // List<String> | 
    List<String> httpVersion = Arrays.asList(); // List<String> | 
    List<String> ipVersion = Arrays.asList(); // List<String> | 
    List<String> os = Arrays.asList(); // List<String> | 
    List<String> tlsVersion = Arrays.asList(); // List<String> | 
    String format = "JSON"; // String | 
    try {
      RadarGetHttpTopBrowserFamilies200Response result = apiInstance.radarGetHttpTopBrowsers(limit, name, dateRange, dateStart, dateEnd, asn, location, continent, botClass, deviceType, httpProtocol, httpVersion, ipVersion, os, tlsVersion, format);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling RadarHttpApi#radarGetHttpTopBrowsers");
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
| **botClass** | [**List&lt;String&gt;**](String.md)|  | [optional] [enum: LIKELY_AUTOMATED, LIKELY_HUMAN] |
| **deviceType** | [**List&lt;String&gt;**](String.md)|  | [optional] [enum: DESKTOP, MOBILE, OTHER] |
| **httpProtocol** | [**List&lt;String&gt;**](String.md)|  | [optional] [enum: HTTP, HTTPS] |
| **httpVersion** | [**List&lt;String&gt;**](String.md)|  | [optional] [enum: HTTPv1, HTTPv2, HTTPv3] |
| **ipVersion** | [**List&lt;String&gt;**](String.md)|  | [optional] [enum: IPv4, IPv6] |
| **os** | [**List&lt;String&gt;**](String.md)|  | [optional] [enum: WINDOWS, MACOSX, IOS, ANDROID, CHROMEOS, LINUX, SMART_TV] |
| **tlsVersion** | [**List&lt;String&gt;**](String.md)|  | [optional] [enum: TLSv1_0, TLSv1_1, TLSv1_2, TLSv1_3, TLSvQUIC] |
| **format** | **String**|  | [optional] [enum: JSON, CSV] |

### Return type

[**RadarGetHttpTopBrowserFamilies200Response**](RadarGetHttpTopBrowserFamilies200Response.md)

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

<a id="radarGetHttpTopLocationsByBotClass"></a>
# **radarGetHttpTopLocationsByBotClass**
> RadarGetDnsAs112TopLocations200Response radarGetHttpTopLocationsByBotClass(botClass, limit, name, dateRange, dateStart, dateEnd, asn, location, continent, deviceType, httpProtocol, httpVersion, ipVersion, os, tlsVersion, format)

Get Top Locations By Bot Class

Get the top locations, by HTTP traffic, of the requested bot class. These two categories use Cloudflare&#39;s bot score - refer to [Bot scores])https://developers.cloudflare.com/bots/concepts/bot-score). Values are a percentage out of the total traffic.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.RadarHttpApi;

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

    RadarHttpApi apiInstance = new RadarHttpApi(defaultClient);
    String botClass = "LIKELY_AUTOMATED"; // String | 
    Integer limit = 5; // Integer | 
    List<String> name = Arrays.asList(); // List<String> | 
    List<String> dateRange = Arrays.asList(); // List<String> | 
    List<OffsetDateTime> dateStart = Arrays.asList(); // List<OffsetDateTime> | 
    List<OffsetDateTime> dateEnd = Arrays.asList(); // List<OffsetDateTime> | 
    List<String> asn = Arrays.asList(); // List<String> | 
    List<String> location = Arrays.asList(); // List<String> | 
    List<String> continent = Arrays.asList(); // List<String> | 
    List<String> deviceType = Arrays.asList(); // List<String> | 
    List<String> httpProtocol = Arrays.asList(); // List<String> | 
    List<String> httpVersion = Arrays.asList(); // List<String> | 
    List<String> ipVersion = Arrays.asList(); // List<String> | 
    List<String> os = Arrays.asList(); // List<String> | 
    List<String> tlsVersion = Arrays.asList(); // List<String> | 
    String format = "JSON"; // String | 
    try {
      RadarGetDnsAs112TopLocations200Response result = apiInstance.radarGetHttpTopLocationsByBotClass(botClass, limit, name, dateRange, dateStart, dateEnd, asn, location, continent, deviceType, httpProtocol, httpVersion, ipVersion, os, tlsVersion, format);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling RadarHttpApi#radarGetHttpTopLocationsByBotClass");
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
| **botClass** | **String**|  | [enum: LIKELY_AUTOMATED, LIKELY_HUMAN] |
| **limit** | **Integer**|  | [optional] |
| **name** | [**List&lt;String&gt;**](String.md)|  | [optional] |
| **dateRange** | [**List&lt;String&gt;**](String.md)|  | [optional] [enum: 1d, 2d, 7d, 14d, 28d, 12w, 24w, 52w, 1dControl, 2dControl, 7dControl, 14dControl, 28dControl, 12wControl, 24wControl] |
| **dateStart** | [**List&lt;OffsetDateTime&gt;**](OffsetDateTime.md)|  | [optional] |
| **dateEnd** | [**List&lt;OffsetDateTime&gt;**](OffsetDateTime.md)|  | [optional] |
| **asn** | [**List&lt;String&gt;**](String.md)|  | [optional] |
| **location** | [**List&lt;String&gt;**](String.md)|  | [optional] |
| **continent** | [**List&lt;String&gt;**](String.md)|  | [optional] |
| **deviceType** | [**List&lt;String&gt;**](String.md)|  | [optional] [enum: DESKTOP, MOBILE, OTHER] |
| **httpProtocol** | [**List&lt;String&gt;**](String.md)|  | [optional] [enum: HTTP, HTTPS] |
| **httpVersion** | [**List&lt;String&gt;**](String.md)|  | [optional] [enum: HTTPv1, HTTPv2, HTTPv3] |
| **ipVersion** | [**List&lt;String&gt;**](String.md)|  | [optional] [enum: IPv4, IPv6] |
| **os** | [**List&lt;String&gt;**](String.md)|  | [optional] [enum: WINDOWS, MACOSX, IOS, ANDROID, CHROMEOS, LINUX, SMART_TV] |
| **tlsVersion** | [**List&lt;String&gt;**](String.md)|  | [optional] [enum: TLSv1_0, TLSv1_1, TLSv1_2, TLSv1_3, TLSvQUIC] |
| **format** | **String**|  | [optional] [enum: JSON, CSV] |

### Return type

[**RadarGetDnsAs112TopLocations200Response**](RadarGetDnsAs112TopLocations200Response.md)

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

<a id="radarGetHttpTopLocationsByDeviceType"></a>
# **radarGetHttpTopLocationsByDeviceType**
> RadarGetDnsAs112TopLocations200Response radarGetHttpTopLocationsByDeviceType(deviceType, limit, name, dateRange, dateStart, dateEnd, asn, location, continent, botClass, httpProtocol, httpVersion, ipVersion, os, tlsVersion, format)

Get Top Locations By Device Type

Get the top locations, by HTTP traffic, of the requested device type. Values are a percentage out of the total traffic.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.RadarHttpApi;

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

    RadarHttpApi apiInstance = new RadarHttpApi(defaultClient);
    String deviceType = "DESKTOP"; // String | 
    Integer limit = 5; // Integer | 
    List<String> name = Arrays.asList(); // List<String> | 
    List<String> dateRange = Arrays.asList(); // List<String> | 
    List<OffsetDateTime> dateStart = Arrays.asList(); // List<OffsetDateTime> | 
    List<OffsetDateTime> dateEnd = Arrays.asList(); // List<OffsetDateTime> | 
    List<String> asn = Arrays.asList(); // List<String> | 
    List<String> location = Arrays.asList(); // List<String> | 
    List<String> continent = Arrays.asList(); // List<String> | 
    List<String> botClass = Arrays.asList(); // List<String> | 
    List<String> httpProtocol = Arrays.asList(); // List<String> | 
    List<String> httpVersion = Arrays.asList(); // List<String> | 
    List<String> ipVersion = Arrays.asList(); // List<String> | 
    List<String> os = Arrays.asList(); // List<String> | 
    List<String> tlsVersion = Arrays.asList(); // List<String> | 
    String format = "JSON"; // String | 
    try {
      RadarGetDnsAs112TopLocations200Response result = apiInstance.radarGetHttpTopLocationsByDeviceType(deviceType, limit, name, dateRange, dateStart, dateEnd, asn, location, continent, botClass, httpProtocol, httpVersion, ipVersion, os, tlsVersion, format);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling RadarHttpApi#radarGetHttpTopLocationsByDeviceType");
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
| **deviceType** | **String**|  | [enum: DESKTOP, MOBILE, OTHER] |
| **limit** | **Integer**|  | [optional] |
| **name** | [**List&lt;String&gt;**](String.md)|  | [optional] |
| **dateRange** | [**List&lt;String&gt;**](String.md)|  | [optional] [enum: 1d, 2d, 7d, 14d, 28d, 12w, 24w, 52w, 1dControl, 2dControl, 7dControl, 14dControl, 28dControl, 12wControl, 24wControl] |
| **dateStart** | [**List&lt;OffsetDateTime&gt;**](OffsetDateTime.md)|  | [optional] |
| **dateEnd** | [**List&lt;OffsetDateTime&gt;**](OffsetDateTime.md)|  | [optional] |
| **asn** | [**List&lt;String&gt;**](String.md)|  | [optional] |
| **location** | [**List&lt;String&gt;**](String.md)|  | [optional] |
| **continent** | [**List&lt;String&gt;**](String.md)|  | [optional] |
| **botClass** | [**List&lt;String&gt;**](String.md)|  | [optional] [enum: LIKELY_AUTOMATED, LIKELY_HUMAN] |
| **httpProtocol** | [**List&lt;String&gt;**](String.md)|  | [optional] [enum: HTTP, HTTPS] |
| **httpVersion** | [**List&lt;String&gt;**](String.md)|  | [optional] [enum: HTTPv1, HTTPv2, HTTPv3] |
| **ipVersion** | [**List&lt;String&gt;**](String.md)|  | [optional] [enum: IPv4, IPv6] |
| **os** | [**List&lt;String&gt;**](String.md)|  | [optional] [enum: WINDOWS, MACOSX, IOS, ANDROID, CHROMEOS, LINUX, SMART_TV] |
| **tlsVersion** | [**List&lt;String&gt;**](String.md)|  | [optional] [enum: TLSv1_0, TLSv1_1, TLSv1_2, TLSv1_3, TLSvQUIC] |
| **format** | **String**|  | [optional] [enum: JSON, CSV] |

### Return type

[**RadarGetDnsAs112TopLocations200Response**](RadarGetDnsAs112TopLocations200Response.md)

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

<a id="radarGetHttpTopLocationsByHttpProtocol"></a>
# **radarGetHttpTopLocationsByHttpProtocol**
> RadarGetDnsAs112TopLocations200Response radarGetHttpTopLocationsByHttpProtocol(httpProtocol, limit, name, dateRange, dateStart, dateEnd, asn, location, continent, botClass, deviceType, httpProtocol2, ipVersion, os, tlsVersion, format)

Get Top Locations By HTTP Protocol

Get the top locations, by HTTP traffic, of the requested HTTP protocol. Values are a percentage out of the total traffic.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.RadarHttpApi;

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

    RadarHttpApi apiInstance = new RadarHttpApi(defaultClient);
    String httpProtocol = "HTTP"; // String | 
    Integer limit = 5; // Integer | 
    List<String> name = Arrays.asList(); // List<String> | 
    List<String> dateRange = Arrays.asList(); // List<String> | 
    List<OffsetDateTime> dateStart = Arrays.asList(); // List<OffsetDateTime> | 
    List<OffsetDateTime> dateEnd = Arrays.asList(); // List<OffsetDateTime> | 
    List<String> asn = Arrays.asList(); // List<String> | 
    List<String> location = Arrays.asList(); // List<String> | 
    List<String> continent = Arrays.asList(); // List<String> | 
    List<String> botClass = Arrays.asList(); // List<String> | 
    List<String> deviceType = Arrays.asList(); // List<String> | 
    List<String> httpProtocol2 = Arrays.asList(); // List<String> | 
    List<String> ipVersion = Arrays.asList(); // List<String> | 
    List<String> os = Arrays.asList(); // List<String> | 
    List<String> tlsVersion = Arrays.asList(); // List<String> | 
    String format = "JSON"; // String | 
    try {
      RadarGetDnsAs112TopLocations200Response result = apiInstance.radarGetHttpTopLocationsByHttpProtocol(httpProtocol, limit, name, dateRange, dateStart, dateEnd, asn, location, continent, botClass, deviceType, httpProtocol2, ipVersion, os, tlsVersion, format);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling RadarHttpApi#radarGetHttpTopLocationsByHttpProtocol");
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
| **httpProtocol** | **String**|  | [enum: HTTP, HTTPS] |
| **limit** | **Integer**|  | [optional] |
| **name** | [**List&lt;String&gt;**](String.md)|  | [optional] |
| **dateRange** | [**List&lt;String&gt;**](String.md)|  | [optional] [enum: 1d, 2d, 7d, 14d, 28d, 12w, 24w, 52w, 1dControl, 2dControl, 7dControl, 14dControl, 28dControl, 12wControl, 24wControl] |
| **dateStart** | [**List&lt;OffsetDateTime&gt;**](OffsetDateTime.md)|  | [optional] |
| **dateEnd** | [**List&lt;OffsetDateTime&gt;**](OffsetDateTime.md)|  | [optional] |
| **asn** | [**List&lt;String&gt;**](String.md)|  | [optional] |
| **location** | [**List&lt;String&gt;**](String.md)|  | [optional] |
| **continent** | [**List&lt;String&gt;**](String.md)|  | [optional] |
| **botClass** | [**List&lt;String&gt;**](String.md)|  | [optional] [enum: LIKELY_AUTOMATED, LIKELY_HUMAN] |
| **deviceType** | [**List&lt;String&gt;**](String.md)|  | [optional] [enum: DESKTOP, MOBILE, OTHER] |
| **httpProtocol2** | [**List&lt;String&gt;**](String.md)|  | [optional] [enum: HTTP, HTTPS] |
| **ipVersion** | [**List&lt;String&gt;**](String.md)|  | [optional] [enum: IPv4, IPv6] |
| **os** | [**List&lt;String&gt;**](String.md)|  | [optional] [enum: WINDOWS, MACOSX, IOS, ANDROID, CHROMEOS, LINUX, SMART_TV] |
| **tlsVersion** | [**List&lt;String&gt;**](String.md)|  | [optional] [enum: TLSv1_0, TLSv1_1, TLSv1_2, TLSv1_3, TLSvQUIC] |
| **format** | **String**|  | [optional] [enum: JSON, CSV] |

### Return type

[**RadarGetDnsAs112TopLocations200Response**](RadarGetDnsAs112TopLocations200Response.md)

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

<a id="radarGetHttpTopLocationsByHttpRequests"></a>
# **radarGetHttpTopLocationsByHttpRequests**
> RadarGetDnsAs112TopLocations200Response radarGetHttpTopLocationsByHttpRequests(limit, name, dateRange, dateStart, dateEnd, asn, location, continent, botClass, deviceType, httpProtocol, httpVersion, ipVersion, os, tlsVersion, format)

Get Top Locations By HTTP requests

Get the top locations by HTTP traffic. Values are a percentage out of the total traffic.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.RadarHttpApi;

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

    RadarHttpApi apiInstance = new RadarHttpApi(defaultClient);
    Integer limit = 5; // Integer | 
    List<String> name = Arrays.asList(); // List<String> | 
    List<String> dateRange = Arrays.asList(); // List<String> | 
    List<OffsetDateTime> dateStart = Arrays.asList(); // List<OffsetDateTime> | 
    List<OffsetDateTime> dateEnd = Arrays.asList(); // List<OffsetDateTime> | 
    List<String> asn = Arrays.asList(); // List<String> | 
    List<String> location = Arrays.asList(); // List<String> | 
    List<String> continent = Arrays.asList(); // List<String> | 
    List<String> botClass = Arrays.asList(); // List<String> | 
    List<String> deviceType = Arrays.asList(); // List<String> | 
    List<String> httpProtocol = Arrays.asList(); // List<String> | 
    List<String> httpVersion = Arrays.asList(); // List<String> | 
    List<String> ipVersion = Arrays.asList(); // List<String> | 
    List<String> os = Arrays.asList(); // List<String> | 
    List<String> tlsVersion = Arrays.asList(); // List<String> | 
    String format = "JSON"; // String | 
    try {
      RadarGetDnsAs112TopLocations200Response result = apiInstance.radarGetHttpTopLocationsByHttpRequests(limit, name, dateRange, dateStart, dateEnd, asn, location, continent, botClass, deviceType, httpProtocol, httpVersion, ipVersion, os, tlsVersion, format);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling RadarHttpApi#radarGetHttpTopLocationsByHttpRequests");
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
| **botClass** | [**List&lt;String&gt;**](String.md)|  | [optional] [enum: LIKELY_AUTOMATED, LIKELY_HUMAN] |
| **deviceType** | [**List&lt;String&gt;**](String.md)|  | [optional] [enum: DESKTOP, MOBILE, OTHER] |
| **httpProtocol** | [**List&lt;String&gt;**](String.md)|  | [optional] [enum: HTTP, HTTPS] |
| **httpVersion** | [**List&lt;String&gt;**](String.md)|  | [optional] [enum: HTTPv1, HTTPv2, HTTPv3] |
| **ipVersion** | [**List&lt;String&gt;**](String.md)|  | [optional] [enum: IPv4, IPv6] |
| **os** | [**List&lt;String&gt;**](String.md)|  | [optional] [enum: WINDOWS, MACOSX, IOS, ANDROID, CHROMEOS, LINUX, SMART_TV] |
| **tlsVersion** | [**List&lt;String&gt;**](String.md)|  | [optional] [enum: TLSv1_0, TLSv1_1, TLSv1_2, TLSv1_3, TLSvQUIC] |
| **format** | **String**|  | [optional] [enum: JSON, CSV] |

### Return type

[**RadarGetDnsAs112TopLocations200Response**](RadarGetDnsAs112TopLocations200Response.md)

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

<a id="radarGetHttpTopLocationsByHttpVersion"></a>
# **radarGetHttpTopLocationsByHttpVersion**
> RadarGetDnsAs112TopLocations200Response radarGetHttpTopLocationsByHttpVersion(httpVersion, limit, name, dateRange, dateStart, dateEnd, asn, location, continent, botClass, deviceType, httpProtocol, ipVersion, os, tlsVersion, format)

Get Top Locations By HTTP Version

Get the top locations, by HTTP traffic, of the requested HTTP protocol. Values are a percentage out of the total traffic.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.RadarHttpApi;

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

    RadarHttpApi apiInstance = new RadarHttpApi(defaultClient);
    String httpVersion = "HTTPv1"; // String | 
    Integer limit = 5; // Integer | 
    List<String> name = Arrays.asList(); // List<String> | 
    List<String> dateRange = Arrays.asList(); // List<String> | 
    List<OffsetDateTime> dateStart = Arrays.asList(); // List<OffsetDateTime> | 
    List<OffsetDateTime> dateEnd = Arrays.asList(); // List<OffsetDateTime> | 
    List<String> asn = Arrays.asList(); // List<String> | 
    List<String> location = Arrays.asList(); // List<String> | 
    List<String> continent = Arrays.asList(); // List<String> | 
    List<String> botClass = Arrays.asList(); // List<String> | 
    List<String> deviceType = Arrays.asList(); // List<String> | 
    List<String> httpProtocol = Arrays.asList(); // List<String> | 
    List<String> ipVersion = Arrays.asList(); // List<String> | 
    List<String> os = Arrays.asList(); // List<String> | 
    List<String> tlsVersion = Arrays.asList(); // List<String> | 
    String format = "JSON"; // String | 
    try {
      RadarGetDnsAs112TopLocations200Response result = apiInstance.radarGetHttpTopLocationsByHttpVersion(httpVersion, limit, name, dateRange, dateStart, dateEnd, asn, location, continent, botClass, deviceType, httpProtocol, ipVersion, os, tlsVersion, format);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling RadarHttpApi#radarGetHttpTopLocationsByHttpVersion");
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
| **httpVersion** | **String**|  | [enum: HTTPv1, HTTPv2, HTTPv3] |
| **limit** | **Integer**|  | [optional] |
| **name** | [**List&lt;String&gt;**](String.md)|  | [optional] |
| **dateRange** | [**List&lt;String&gt;**](String.md)|  | [optional] [enum: 1d, 2d, 7d, 14d, 28d, 12w, 24w, 52w, 1dControl, 2dControl, 7dControl, 14dControl, 28dControl, 12wControl, 24wControl] |
| **dateStart** | [**List&lt;OffsetDateTime&gt;**](OffsetDateTime.md)|  | [optional] |
| **dateEnd** | [**List&lt;OffsetDateTime&gt;**](OffsetDateTime.md)|  | [optional] |
| **asn** | [**List&lt;String&gt;**](String.md)|  | [optional] |
| **location** | [**List&lt;String&gt;**](String.md)|  | [optional] |
| **continent** | [**List&lt;String&gt;**](String.md)|  | [optional] |
| **botClass** | [**List&lt;String&gt;**](String.md)|  | [optional] [enum: LIKELY_AUTOMATED, LIKELY_HUMAN] |
| **deviceType** | [**List&lt;String&gt;**](String.md)|  | [optional] [enum: DESKTOP, MOBILE, OTHER] |
| **httpProtocol** | [**List&lt;String&gt;**](String.md)|  | [optional] [enum: HTTP, HTTPS] |
| **ipVersion** | [**List&lt;String&gt;**](String.md)|  | [optional] [enum: IPv4, IPv6] |
| **os** | [**List&lt;String&gt;**](String.md)|  | [optional] [enum: WINDOWS, MACOSX, IOS, ANDROID, CHROMEOS, LINUX, SMART_TV] |
| **tlsVersion** | [**List&lt;String&gt;**](String.md)|  | [optional] [enum: TLSv1_0, TLSv1_1, TLSv1_2, TLSv1_3, TLSvQUIC] |
| **format** | **String**|  | [optional] [enum: JSON, CSV] |

### Return type

[**RadarGetDnsAs112TopLocations200Response**](RadarGetDnsAs112TopLocations200Response.md)

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

<a id="radarGetHttpTopLocationsByIpVersion"></a>
# **radarGetHttpTopLocationsByIpVersion**
> RadarGetDnsAs112TopLocations200Response radarGetHttpTopLocationsByIpVersion(ipVersion, limit, name, dateRange, dateStart, dateEnd, asn, location, continent, botClass, deviceType, httpProtocol, httpVersion, os, tlsVersion, format)

Get Top Locations By IP Version

Get the top locations, by HTTP traffic, of the requested IP protocol version. Values are a percentage out of the total traffic.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.RadarHttpApi;

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

    RadarHttpApi apiInstance = new RadarHttpApi(defaultClient);
    String ipVersion = "IPv4"; // String | 
    Integer limit = 5; // Integer | 
    List<String> name = Arrays.asList(); // List<String> | 
    List<String> dateRange = Arrays.asList(); // List<String> | 
    List<OffsetDateTime> dateStart = Arrays.asList(); // List<OffsetDateTime> | 
    List<OffsetDateTime> dateEnd = Arrays.asList(); // List<OffsetDateTime> | 
    List<String> asn = Arrays.asList(); // List<String> | 
    List<String> location = Arrays.asList(); // List<String> | 
    List<String> continent = Arrays.asList(); // List<String> | 
    List<String> botClass = Arrays.asList(); // List<String> | 
    List<String> deviceType = Arrays.asList(); // List<String> | 
    List<String> httpProtocol = Arrays.asList(); // List<String> | 
    List<String> httpVersion = Arrays.asList(); // List<String> | 
    List<String> os = Arrays.asList(); // List<String> | 
    List<String> tlsVersion = Arrays.asList(); // List<String> | 
    String format = "JSON"; // String | 
    try {
      RadarGetDnsAs112TopLocations200Response result = apiInstance.radarGetHttpTopLocationsByIpVersion(ipVersion, limit, name, dateRange, dateStart, dateEnd, asn, location, continent, botClass, deviceType, httpProtocol, httpVersion, os, tlsVersion, format);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling RadarHttpApi#radarGetHttpTopLocationsByIpVersion");
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
| **ipVersion** | **String**|  | [enum: IPv4, IPv6] |
| **limit** | **Integer**|  | [optional] |
| **name** | [**List&lt;String&gt;**](String.md)|  | [optional] |
| **dateRange** | [**List&lt;String&gt;**](String.md)|  | [optional] [enum: 1d, 2d, 7d, 14d, 28d, 12w, 24w, 52w, 1dControl, 2dControl, 7dControl, 14dControl, 28dControl, 12wControl, 24wControl] |
| **dateStart** | [**List&lt;OffsetDateTime&gt;**](OffsetDateTime.md)|  | [optional] |
| **dateEnd** | [**List&lt;OffsetDateTime&gt;**](OffsetDateTime.md)|  | [optional] |
| **asn** | [**List&lt;String&gt;**](String.md)|  | [optional] |
| **location** | [**List&lt;String&gt;**](String.md)|  | [optional] |
| **continent** | [**List&lt;String&gt;**](String.md)|  | [optional] |
| **botClass** | [**List&lt;String&gt;**](String.md)|  | [optional] [enum: LIKELY_AUTOMATED, LIKELY_HUMAN] |
| **deviceType** | [**List&lt;String&gt;**](String.md)|  | [optional] [enum: DESKTOP, MOBILE, OTHER] |
| **httpProtocol** | [**List&lt;String&gt;**](String.md)|  | [optional] [enum: HTTP, HTTPS] |
| **httpVersion** | [**List&lt;String&gt;**](String.md)|  | [optional] [enum: HTTPv1, HTTPv2, HTTPv3] |
| **os** | [**List&lt;String&gt;**](String.md)|  | [optional] [enum: WINDOWS, MACOSX, IOS, ANDROID, CHROMEOS, LINUX, SMART_TV] |
| **tlsVersion** | [**List&lt;String&gt;**](String.md)|  | [optional] [enum: TLSv1_0, TLSv1_1, TLSv1_2, TLSv1_3, TLSvQUIC] |
| **format** | **String**|  | [optional] [enum: JSON, CSV] |

### Return type

[**RadarGetDnsAs112TopLocations200Response**](RadarGetDnsAs112TopLocations200Response.md)

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

<a id="radarGetHttpTopLocationsByOperatingSystem"></a>
# **radarGetHttpTopLocationsByOperatingSystem**
> RadarGetDnsAs112TopLocations200Response radarGetHttpTopLocationsByOperatingSystem(os, limit, name, dateRange, dateStart, dateEnd, asn, location, continent, botClass, deviceType, httpProtocol, httpVersion, ipVersion, tlsVersion, format)

Get Top Locations By Operating System

Get the top locations, by HTTP traffic, of the requested operating systems. Values are a percentage out of the total traffic.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.RadarHttpApi;

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

    RadarHttpApi apiInstance = new RadarHttpApi(defaultClient);
    String os = "WINDOWS"; // String | 
    Integer limit = 5; // Integer | 
    List<String> name = Arrays.asList(); // List<String> | 
    List<String> dateRange = Arrays.asList(); // List<String> | 
    List<OffsetDateTime> dateStart = Arrays.asList(); // List<OffsetDateTime> | 
    List<OffsetDateTime> dateEnd = Arrays.asList(); // List<OffsetDateTime> | 
    List<String> asn = Arrays.asList(); // List<String> | 
    List<String> location = Arrays.asList(); // List<String> | 
    List<String> continent = Arrays.asList(); // List<String> | 
    List<String> botClass = Arrays.asList(); // List<String> | 
    List<String> deviceType = Arrays.asList(); // List<String> | 
    List<String> httpProtocol = Arrays.asList(); // List<String> | 
    List<String> httpVersion = Arrays.asList(); // List<String> | 
    List<String> ipVersion = Arrays.asList(); // List<String> | 
    List<String> tlsVersion = Arrays.asList(); // List<String> | 
    String format = "JSON"; // String | 
    try {
      RadarGetDnsAs112TopLocations200Response result = apiInstance.radarGetHttpTopLocationsByOperatingSystem(os, limit, name, dateRange, dateStart, dateEnd, asn, location, continent, botClass, deviceType, httpProtocol, httpVersion, ipVersion, tlsVersion, format);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling RadarHttpApi#radarGetHttpTopLocationsByOperatingSystem");
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
| **os** | **String**|  | [enum: WINDOWS, MACOSX, IOS, ANDROID, CHROMEOS, LINUX, SMART_TV] |
| **limit** | **Integer**|  | [optional] |
| **name** | [**List&lt;String&gt;**](String.md)|  | [optional] |
| **dateRange** | [**List&lt;String&gt;**](String.md)|  | [optional] [enum: 1d, 2d, 7d, 14d, 28d, 12w, 24w, 52w, 1dControl, 2dControl, 7dControl, 14dControl, 28dControl, 12wControl, 24wControl] |
| **dateStart** | [**List&lt;OffsetDateTime&gt;**](OffsetDateTime.md)|  | [optional] |
| **dateEnd** | [**List&lt;OffsetDateTime&gt;**](OffsetDateTime.md)|  | [optional] |
| **asn** | [**List&lt;String&gt;**](String.md)|  | [optional] |
| **location** | [**List&lt;String&gt;**](String.md)|  | [optional] |
| **continent** | [**List&lt;String&gt;**](String.md)|  | [optional] |
| **botClass** | [**List&lt;String&gt;**](String.md)|  | [optional] [enum: LIKELY_AUTOMATED, LIKELY_HUMAN] |
| **deviceType** | [**List&lt;String&gt;**](String.md)|  | [optional] [enum: DESKTOP, MOBILE, OTHER] |
| **httpProtocol** | [**List&lt;String&gt;**](String.md)|  | [optional] [enum: HTTP, HTTPS] |
| **httpVersion** | [**List&lt;String&gt;**](String.md)|  | [optional] [enum: HTTPv1, HTTPv2, HTTPv3] |
| **ipVersion** | [**List&lt;String&gt;**](String.md)|  | [optional] [enum: IPv4, IPv6] |
| **tlsVersion** | [**List&lt;String&gt;**](String.md)|  | [optional] [enum: TLSv1_0, TLSv1_1, TLSv1_2, TLSv1_3, TLSvQUIC] |
| **format** | **String**|  | [optional] [enum: JSON, CSV] |

### Return type

[**RadarGetDnsAs112TopLocations200Response**](RadarGetDnsAs112TopLocations200Response.md)

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

<a id="radarGetHttpTopLocationsByTlsVersion"></a>
# **radarGetHttpTopLocationsByTlsVersion**
> RadarGetDnsAs112TopLocations200Response radarGetHttpTopLocationsByTlsVersion(tlsVersion, limit, name, dateRange, dateStart, dateEnd, asn, location, continent, botClass, deviceType, httpProtocol, httpVersion, ipVersion, os, format)

Get Top Locations By TLS Version

Get the top locations, by HTTP traffic, of the requested TLS protocol version. Values are a percentage out of the total traffic.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.RadarHttpApi;

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

    RadarHttpApi apiInstance = new RadarHttpApi(defaultClient);
    String tlsVersion = "TLSv1_0"; // String | 
    Integer limit = 5; // Integer | 
    List<String> name = Arrays.asList(); // List<String> | 
    List<String> dateRange = Arrays.asList(); // List<String> | 
    List<OffsetDateTime> dateStart = Arrays.asList(); // List<OffsetDateTime> | 
    List<OffsetDateTime> dateEnd = Arrays.asList(); // List<OffsetDateTime> | 
    List<String> asn = Arrays.asList(); // List<String> | 
    List<String> location = Arrays.asList(); // List<String> | 
    List<String> continent = Arrays.asList(); // List<String> | 
    List<String> botClass = Arrays.asList(); // List<String> | 
    List<String> deviceType = Arrays.asList(); // List<String> | 
    List<String> httpProtocol = Arrays.asList(); // List<String> | 
    List<String> httpVersion = Arrays.asList(); // List<String> | 
    List<String> ipVersion = Arrays.asList(); // List<String> | 
    List<String> os = Arrays.asList(); // List<String> | 
    String format = "JSON"; // String | 
    try {
      RadarGetDnsAs112TopLocations200Response result = apiInstance.radarGetHttpTopLocationsByTlsVersion(tlsVersion, limit, name, dateRange, dateStart, dateEnd, asn, location, continent, botClass, deviceType, httpProtocol, httpVersion, ipVersion, os, format);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling RadarHttpApi#radarGetHttpTopLocationsByTlsVersion");
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
| **tlsVersion** | **String**|  | [enum: TLSv1_0, TLSv1_1, TLSv1_2, TLSv1_3, TLSvQUIC] |
| **limit** | **Integer**|  | [optional] |
| **name** | [**List&lt;String&gt;**](String.md)|  | [optional] |
| **dateRange** | [**List&lt;String&gt;**](String.md)|  | [optional] [enum: 1d, 2d, 7d, 14d, 28d, 12w, 24w, 52w, 1dControl, 2dControl, 7dControl, 14dControl, 28dControl, 12wControl, 24wControl] |
| **dateStart** | [**List&lt;OffsetDateTime&gt;**](OffsetDateTime.md)|  | [optional] |
| **dateEnd** | [**List&lt;OffsetDateTime&gt;**](OffsetDateTime.md)|  | [optional] |
| **asn** | [**List&lt;String&gt;**](String.md)|  | [optional] |
| **location** | [**List&lt;String&gt;**](String.md)|  | [optional] |
| **continent** | [**List&lt;String&gt;**](String.md)|  | [optional] |
| **botClass** | [**List&lt;String&gt;**](String.md)|  | [optional] [enum: LIKELY_AUTOMATED, LIKELY_HUMAN] |
| **deviceType** | [**List&lt;String&gt;**](String.md)|  | [optional] [enum: DESKTOP, MOBILE, OTHER] |
| **httpProtocol** | [**List&lt;String&gt;**](String.md)|  | [optional] [enum: HTTP, HTTPS] |
| **httpVersion** | [**List&lt;String&gt;**](String.md)|  | [optional] [enum: HTTPv1, HTTPv2, HTTPv3] |
| **ipVersion** | [**List&lt;String&gt;**](String.md)|  | [optional] [enum: IPv4, IPv6] |
| **os** | [**List&lt;String&gt;**](String.md)|  | [optional] [enum: WINDOWS, MACOSX, IOS, ANDROID, CHROMEOS, LINUX, SMART_TV] |
| **format** | **String**|  | [optional] [enum: JSON, CSV] |

### Return type

[**RadarGetDnsAs112TopLocations200Response**](RadarGetDnsAs112TopLocations200Response.md)

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

