# RadarAs112Api

All URIs are relative to *https://api.cloudflare.com/client/v4*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**radarGetDnsAs112Timeseries**](RadarAs112Api.md#radarGetDnsAs112Timeseries) | **GET** /radar/as112/timeseries | Get AS112 DNS Queries Time Series |
| [**radarGetDnsAs112TimeseriesByDnssec**](RadarAs112Api.md#radarGetDnsAs112TimeseriesByDnssec) | **GET** /radar/as112/summary/dnssec | Get AS112 DNSSEC Summary |
| [**radarGetDnsAs112TimeseriesByEdns**](RadarAs112Api.md#radarGetDnsAs112TimeseriesByEdns) | **GET** /radar/as112/summary/edns | Get AS112 EDNS Summary |
| [**radarGetDnsAs112TimeseriesByIpVersion**](RadarAs112Api.md#radarGetDnsAs112TimeseriesByIpVersion) | **GET** /radar/as112/summary/ip_version | Get AS112 IP Version Summary |
| [**radarGetDnsAs112TimeseriesByProtocol**](RadarAs112Api.md#radarGetDnsAs112TimeseriesByProtocol) | **GET** /radar/as112/summary/protocol | Get AS112 DNS Protocol Summary |
| [**radarGetDnsAs112TimeseriesByQueryType**](RadarAs112Api.md#radarGetDnsAs112TimeseriesByQueryType) | **GET** /radar/as112/summary/query_type | Get AS112 Query Types Summary |
| [**radarGetDnsAs112TimeseriesByResponseCodes**](RadarAs112Api.md#radarGetDnsAs112TimeseriesByResponseCodes) | **GET** /radar/as112/summary/response_codes | Get a summary of AS112 Response Codes |
| [**radarGetDnsAs112TimeseriesGroupByDnssec**](RadarAs112Api.md#radarGetDnsAs112TimeseriesGroupByDnssec) | **GET** /radar/as112/timeseries_groups/dnssec | Get AS112 DNSSEC Support Time Series |
| [**radarGetDnsAs112TimeseriesGroupByEdns**](RadarAs112Api.md#radarGetDnsAs112TimeseriesGroupByEdns) | **GET** /radar/as112/timeseries_groups/edns | Get AS112 EDNS Support Summary |
| [**radarGetDnsAs112TimeseriesGroupByIpVersion**](RadarAs112Api.md#radarGetDnsAs112TimeseriesGroupByIpVersion) | **GET** /radar/as112/timeseries_groups/ip_version | Get AS112 IP Version Time Series |
| [**radarGetDnsAs112TimeseriesGroupByProtocol**](RadarAs112Api.md#radarGetDnsAs112TimeseriesGroupByProtocol) | **GET** /radar/as112/timeseries_groups/protocol | Get AS112 DNS Protocol Time Series |
| [**radarGetDnsAs112TimeseriesGroupByQueryType**](RadarAs112Api.md#radarGetDnsAs112TimeseriesGroupByQueryType) | **GET** /radar/as112/timeseries_groups/query_type | Get AS112 Query Types Time Series |
| [**radarGetDnsAs112TimeseriesGroupByResponseCodes**](RadarAs112Api.md#radarGetDnsAs112TimeseriesGroupByResponseCodes) | **GET** /radar/as112/timeseries_groups/response_codes | Get a time series of AS112 Response Codes |
| [**radarGetDnsAs112TopLocations**](RadarAs112Api.md#radarGetDnsAs112TopLocations) | **GET** /radar/as112/top/locations | Get top autonomous systems by AS112 DNS queries |
| [**radarGetDnsAs112TopLocationsByDnssec**](RadarAs112Api.md#radarGetDnsAs112TopLocationsByDnssec) | **GET** /radar/as112/top/locations/dnssec/{dnssec} | Get Top Locations By DNS Queries DNSSEC Support |
| [**radarGetDnsAs112TopLocationsByEdns**](RadarAs112Api.md#radarGetDnsAs112TopLocationsByEdns) | **GET** /radar/as112/top/locations/edns/{edns} | Get Top Locations By EDNS Support |
| [**radarGetDnsAs112TopLocationsByIpVersion**](RadarAs112Api.md#radarGetDnsAs112TopLocationsByIpVersion) | **GET** /radar/as112/top/locations/ip_version/{ip_version} | Get Top Locations by DNS Queries IP version |


<a id="radarGetDnsAs112Timeseries"></a>
# **radarGetDnsAs112Timeseries**
> RadarGetDnsAs112Timeseries200Response radarGetDnsAs112Timeseries(aggInterval, name, dateRange, dateStart, dateEnd, asn, location, continent, format)

Get AS112 DNS Queries Time Series

Get AS112 queries change over time.

### Example
```java
// Import classes:
import cloudflare.ApiClient;
import cloudflare.ApiException;
import cloudflare.Configuration;
import cloudflare.auth.*;
import cloudflare.models.*;
import cloudflare.sdk.RadarAs112Api;

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

    RadarAs112Api apiInstance = new RadarAs112Api(defaultClient);
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
      RadarGetDnsAs112Timeseries200Response result = apiInstance.radarGetDnsAs112Timeseries(aggInterval, name, dateRange, dateStart, dateEnd, asn, location, continent, format);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling RadarAs112Api#radarGetDnsAs112Timeseries");
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

<a id="radarGetDnsAs112TimeseriesByDnssec"></a>
# **radarGetDnsAs112TimeseriesByDnssec**
> RadarGetDnsAs112TimeseriesByDnssec200Response radarGetDnsAs112TimeseriesByDnssec(name, dateRange, dateStart, dateEnd, asn, location, continent, format)

Get AS112 DNSSEC Summary

Percentage distribution of DNS queries to AS112 by DNSSEC support.

### Example
```java
// Import classes:
import cloudflare.ApiClient;
import cloudflare.ApiException;
import cloudflare.Configuration;
import cloudflare.auth.*;
import cloudflare.models.*;
import cloudflare.sdk.RadarAs112Api;

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

    RadarAs112Api apiInstance = new RadarAs112Api(defaultClient);
    List<String> name = Arrays.asList(); // List<String> | 
    List<String> dateRange = Arrays.asList(); // List<String> | 
    List<OffsetDateTime> dateStart = Arrays.asList(); // List<OffsetDateTime> | 
    List<OffsetDateTime> dateEnd = Arrays.asList(); // List<OffsetDateTime> | 
    List<String> asn = Arrays.asList(); // List<String> | 
    List<String> location = Arrays.asList(); // List<String> | 
    List<String> continent = Arrays.asList(); // List<String> | 
    String format = "JSON"; // String | 
    try {
      RadarGetDnsAs112TimeseriesByDnssec200Response result = apiInstance.radarGetDnsAs112TimeseriesByDnssec(name, dateRange, dateStart, dateEnd, asn, location, continent, format);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling RadarAs112Api#radarGetDnsAs112TimeseriesByDnssec");
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

[**RadarGetDnsAs112TimeseriesByDnssec200Response**](RadarGetDnsAs112TimeseriesByDnssec200Response.md)

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

<a id="radarGetDnsAs112TimeseriesByEdns"></a>
# **radarGetDnsAs112TimeseriesByEdns**
> RadarGetDnsAs112TimeseriesByEdns200Response radarGetDnsAs112TimeseriesByEdns(name, dateRange, dateStart, dateEnd, asn, location, continent, format)

Get AS112 EDNS Summary

Percentage distribution of DNS queries, to AS112, by EDNS support.

### Example
```java
// Import classes:
import cloudflare.ApiClient;
import cloudflare.ApiException;
import cloudflare.Configuration;
import cloudflare.auth.*;
import cloudflare.models.*;
import cloudflare.sdk.RadarAs112Api;

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

    RadarAs112Api apiInstance = new RadarAs112Api(defaultClient);
    List<String> name = Arrays.asList(); // List<String> | 
    List<String> dateRange = Arrays.asList(); // List<String> | 
    List<OffsetDateTime> dateStart = Arrays.asList(); // List<OffsetDateTime> | 
    List<OffsetDateTime> dateEnd = Arrays.asList(); // List<OffsetDateTime> | 
    List<String> asn = Arrays.asList(); // List<String> | 
    List<String> location = Arrays.asList(); // List<String> | 
    List<String> continent = Arrays.asList(); // List<String> | 
    String format = "JSON"; // String | 
    try {
      RadarGetDnsAs112TimeseriesByEdns200Response result = apiInstance.radarGetDnsAs112TimeseriesByEdns(name, dateRange, dateStart, dateEnd, asn, location, continent, format);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling RadarAs112Api#radarGetDnsAs112TimeseriesByEdns");
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

[**RadarGetDnsAs112TimeseriesByEdns200Response**](RadarGetDnsAs112TimeseriesByEdns200Response.md)

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

<a id="radarGetDnsAs112TimeseriesByIpVersion"></a>
# **radarGetDnsAs112TimeseriesByIpVersion**
> RadarGetDnsAs112TimeseriesByIpVersion200Response radarGetDnsAs112TimeseriesByIpVersion(name, dateRange, dateStart, dateEnd, asn, location, continent, format)

Get AS112 IP Version Summary

Percentage distribution of DNS queries to AS112 per IP Version.

### Example
```java
// Import classes:
import cloudflare.ApiClient;
import cloudflare.ApiException;
import cloudflare.Configuration;
import cloudflare.auth.*;
import cloudflare.models.*;
import cloudflare.sdk.RadarAs112Api;

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

    RadarAs112Api apiInstance = new RadarAs112Api(defaultClient);
    List<String> name = Arrays.asList(); // List<String> | 
    List<String> dateRange = Arrays.asList(); // List<String> | 
    List<OffsetDateTime> dateStart = Arrays.asList(); // List<OffsetDateTime> | 
    List<OffsetDateTime> dateEnd = Arrays.asList(); // List<OffsetDateTime> | 
    List<String> asn = Arrays.asList(); // List<String> | 
    List<String> location = Arrays.asList(); // List<String> | 
    List<String> continent = Arrays.asList(); // List<String> | 
    String format = "JSON"; // String | 
    try {
      RadarGetDnsAs112TimeseriesByIpVersion200Response result = apiInstance.radarGetDnsAs112TimeseriesByIpVersion(name, dateRange, dateStart, dateEnd, asn, location, continent, format);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling RadarAs112Api#radarGetDnsAs112TimeseriesByIpVersion");
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

[**RadarGetDnsAs112TimeseriesByIpVersion200Response**](RadarGetDnsAs112TimeseriesByIpVersion200Response.md)

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

<a id="radarGetDnsAs112TimeseriesByProtocol"></a>
# **radarGetDnsAs112TimeseriesByProtocol**
> RadarGetDnsAs112TimeseriesByProtocol200Response radarGetDnsAs112TimeseriesByProtocol(name, dateRange, dateStart, dateEnd, asn, location, continent, format)

Get AS112 DNS Protocol Summary

Percentage distribution of DNS queries to AS112 per protocol.

### Example
```java
// Import classes:
import cloudflare.ApiClient;
import cloudflare.ApiException;
import cloudflare.Configuration;
import cloudflare.auth.*;
import cloudflare.models.*;
import cloudflare.sdk.RadarAs112Api;

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

    RadarAs112Api apiInstance = new RadarAs112Api(defaultClient);
    List<String> name = Arrays.asList(); // List<String> | 
    List<String> dateRange = Arrays.asList(); // List<String> | 
    List<OffsetDateTime> dateStart = Arrays.asList(); // List<OffsetDateTime> | 
    List<OffsetDateTime> dateEnd = Arrays.asList(); // List<OffsetDateTime> | 
    List<String> asn = Arrays.asList(); // List<String> | 
    List<String> location = Arrays.asList(); // List<String> | 
    List<String> continent = Arrays.asList(); // List<String> | 
    String format = "JSON"; // String | 
    try {
      RadarGetDnsAs112TimeseriesByProtocol200Response result = apiInstance.radarGetDnsAs112TimeseriesByProtocol(name, dateRange, dateStart, dateEnd, asn, location, continent, format);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling RadarAs112Api#radarGetDnsAs112TimeseriesByProtocol");
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

[**RadarGetDnsAs112TimeseriesByProtocol200Response**](RadarGetDnsAs112TimeseriesByProtocol200Response.md)

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

<a id="radarGetDnsAs112TimeseriesByQueryType"></a>
# **radarGetDnsAs112TimeseriesByQueryType**
> RadarGetDnsAs112TimeseriesByQueryType200Response radarGetDnsAs112TimeseriesByQueryType(name, dateRange, dateStart, dateEnd, asn, location, continent, format)

Get AS112 Query Types Summary

Percentage distribution of DNS queries to AS112 by Query Type.

### Example
```java
// Import classes:
import cloudflare.ApiClient;
import cloudflare.ApiException;
import cloudflare.Configuration;
import cloudflare.auth.*;
import cloudflare.models.*;
import cloudflare.sdk.RadarAs112Api;

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

    RadarAs112Api apiInstance = new RadarAs112Api(defaultClient);
    List<String> name = Arrays.asList(); // List<String> | 
    List<String> dateRange = Arrays.asList(); // List<String> | 
    List<OffsetDateTime> dateStart = Arrays.asList(); // List<OffsetDateTime> | 
    List<OffsetDateTime> dateEnd = Arrays.asList(); // List<OffsetDateTime> | 
    List<String> asn = Arrays.asList(); // List<String> | 
    List<String> location = Arrays.asList(); // List<String> | 
    List<String> continent = Arrays.asList(); // List<String> | 
    String format = "JSON"; // String | 
    try {
      RadarGetDnsAs112TimeseriesByQueryType200Response result = apiInstance.radarGetDnsAs112TimeseriesByQueryType(name, dateRange, dateStart, dateEnd, asn, location, continent, format);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling RadarAs112Api#radarGetDnsAs112TimeseriesByQueryType");
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

[**RadarGetDnsAs112TimeseriesByQueryType200Response**](RadarGetDnsAs112TimeseriesByQueryType200Response.md)

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

<a id="radarGetDnsAs112TimeseriesByResponseCodes"></a>
# **radarGetDnsAs112TimeseriesByResponseCodes**
> RadarGetDnsAs112TimeseriesByResponseCodes200Response radarGetDnsAs112TimeseriesByResponseCodes(name, dateRange, dateStart, dateEnd, asn, location, continent, format)

Get a summary of AS112 Response Codes

Percentage distribution of AS112 dns requests classified per Response Codes.

### Example
```java
// Import classes:
import cloudflare.ApiClient;
import cloudflare.ApiException;
import cloudflare.Configuration;
import cloudflare.auth.*;
import cloudflare.models.*;
import cloudflare.sdk.RadarAs112Api;

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

    RadarAs112Api apiInstance = new RadarAs112Api(defaultClient);
    List<String> name = Arrays.asList(); // List<String> | 
    List<String> dateRange = Arrays.asList(); // List<String> | 
    List<OffsetDateTime> dateStart = Arrays.asList(); // List<OffsetDateTime> | 
    List<OffsetDateTime> dateEnd = Arrays.asList(); // List<OffsetDateTime> | 
    List<String> asn = Arrays.asList(); // List<String> | 
    List<String> location = Arrays.asList(); // List<String> | 
    List<String> continent = Arrays.asList(); // List<String> | 
    String format = "JSON"; // String | 
    try {
      RadarGetDnsAs112TimeseriesByResponseCodes200Response result = apiInstance.radarGetDnsAs112TimeseriesByResponseCodes(name, dateRange, dateStart, dateEnd, asn, location, continent, format);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling RadarAs112Api#radarGetDnsAs112TimeseriesByResponseCodes");
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

[**RadarGetDnsAs112TimeseriesByResponseCodes200Response**](RadarGetDnsAs112TimeseriesByResponseCodes200Response.md)

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

<a id="radarGetDnsAs112TimeseriesGroupByDnssec"></a>
# **radarGetDnsAs112TimeseriesGroupByDnssec**
> RadarGetDnsAs112TimeseriesGroupByDnssec200Response radarGetDnsAs112TimeseriesGroupByDnssec(aggInterval, name, dateRange, dateStart, dateEnd, asn, location, continent, format)

Get AS112 DNSSEC Support Time Series

Percentage distribution of DNS AS112 queries by DNSSEC support over time.

### Example
```java
// Import classes:
import cloudflare.ApiClient;
import cloudflare.ApiException;
import cloudflare.Configuration;
import cloudflare.auth.*;
import cloudflare.models.*;
import cloudflare.sdk.RadarAs112Api;

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

    RadarAs112Api apiInstance = new RadarAs112Api(defaultClient);
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
      RadarGetDnsAs112TimeseriesGroupByDnssec200Response result = apiInstance.radarGetDnsAs112TimeseriesGroupByDnssec(aggInterval, name, dateRange, dateStart, dateEnd, asn, location, continent, format);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling RadarAs112Api#radarGetDnsAs112TimeseriesGroupByDnssec");
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

[**RadarGetDnsAs112TimeseriesGroupByDnssec200Response**](RadarGetDnsAs112TimeseriesGroupByDnssec200Response.md)

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

<a id="radarGetDnsAs112TimeseriesGroupByEdns"></a>
# **radarGetDnsAs112TimeseriesGroupByEdns**
> RadarGetDnsAs112TimeseriesGroupByEdns200Response radarGetDnsAs112TimeseriesGroupByEdns(aggInterval, name, dateRange, dateStart, dateEnd, asn, location, continent, format)

Get AS112 EDNS Support Summary

Percentage distribution of AS112 DNS queries by EDNS support over time.

### Example
```java
// Import classes:
import cloudflare.ApiClient;
import cloudflare.ApiException;
import cloudflare.Configuration;
import cloudflare.auth.*;
import cloudflare.models.*;
import cloudflare.sdk.RadarAs112Api;

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

    RadarAs112Api apiInstance = new RadarAs112Api(defaultClient);
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
      RadarGetDnsAs112TimeseriesGroupByEdns200Response result = apiInstance.radarGetDnsAs112TimeseriesGroupByEdns(aggInterval, name, dateRange, dateStart, dateEnd, asn, location, continent, format);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling RadarAs112Api#radarGetDnsAs112TimeseriesGroupByEdns");
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

[**RadarGetDnsAs112TimeseriesGroupByEdns200Response**](RadarGetDnsAs112TimeseriesGroupByEdns200Response.md)

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

<a id="radarGetDnsAs112TimeseriesGroupByIpVersion"></a>
# **radarGetDnsAs112TimeseriesGroupByIpVersion**
> RadarGetDnsAs112TimeseriesGroupByIpVersion200Response radarGetDnsAs112TimeseriesGroupByIpVersion(aggInterval, name, dateRange, dateStart, dateEnd, asn, location, continent, format)

Get AS112 IP Version Time Series

Percentage distribution of AS112 DNS queries by IP Version over time.

### Example
```java
// Import classes:
import cloudflare.ApiClient;
import cloudflare.ApiException;
import cloudflare.Configuration;
import cloudflare.auth.*;
import cloudflare.models.*;
import cloudflare.sdk.RadarAs112Api;

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

    RadarAs112Api apiInstance = new RadarAs112Api(defaultClient);
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
      RadarGetDnsAs112TimeseriesGroupByIpVersion200Response result = apiInstance.radarGetDnsAs112TimeseriesGroupByIpVersion(aggInterval, name, dateRange, dateStart, dateEnd, asn, location, continent, format);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling RadarAs112Api#radarGetDnsAs112TimeseriesGroupByIpVersion");
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

[**RadarGetDnsAs112TimeseriesGroupByIpVersion200Response**](RadarGetDnsAs112TimeseriesGroupByIpVersion200Response.md)

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

<a id="radarGetDnsAs112TimeseriesGroupByProtocol"></a>
# **radarGetDnsAs112TimeseriesGroupByProtocol**
> RadarGetDnsAs112TimeseriesGroupByProtocol200Response radarGetDnsAs112TimeseriesGroupByProtocol(aggInterval, name, dateRange, dateStart, dateEnd, asn, location, continent, format)

Get AS112 DNS Protocol Time Series

Percentage distribution of AS112 dns requests classified per Protocol over time.

### Example
```java
// Import classes:
import cloudflare.ApiClient;
import cloudflare.ApiException;
import cloudflare.Configuration;
import cloudflare.auth.*;
import cloudflare.models.*;
import cloudflare.sdk.RadarAs112Api;

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

    RadarAs112Api apiInstance = new RadarAs112Api(defaultClient);
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
      RadarGetDnsAs112TimeseriesGroupByProtocol200Response result = apiInstance.radarGetDnsAs112TimeseriesGroupByProtocol(aggInterval, name, dateRange, dateStart, dateEnd, asn, location, continent, format);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling RadarAs112Api#radarGetDnsAs112TimeseriesGroupByProtocol");
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

[**RadarGetDnsAs112TimeseriesGroupByProtocol200Response**](RadarGetDnsAs112TimeseriesGroupByProtocol200Response.md)

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

<a id="radarGetDnsAs112TimeseriesGroupByQueryType"></a>
# **radarGetDnsAs112TimeseriesGroupByQueryType**
> RadarGetDnsAs112TimeseriesGroupByQueryType200Response radarGetDnsAs112TimeseriesGroupByQueryType(aggInterval, name, dateRange, dateStart, dateEnd, asn, location, continent, format)

Get AS112 Query Types Time Series

Percentage distribution of AS112 DNS queries by Query Type over time.

### Example
```java
// Import classes:
import cloudflare.ApiClient;
import cloudflare.ApiException;
import cloudflare.Configuration;
import cloudflare.auth.*;
import cloudflare.models.*;
import cloudflare.sdk.RadarAs112Api;

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

    RadarAs112Api apiInstance = new RadarAs112Api(defaultClient);
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
      RadarGetDnsAs112TimeseriesGroupByQueryType200Response result = apiInstance.radarGetDnsAs112TimeseriesGroupByQueryType(aggInterval, name, dateRange, dateStart, dateEnd, asn, location, continent, format);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling RadarAs112Api#radarGetDnsAs112TimeseriesGroupByQueryType");
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

[**RadarGetDnsAs112TimeseriesGroupByQueryType200Response**](RadarGetDnsAs112TimeseriesGroupByQueryType200Response.md)

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

<a id="radarGetDnsAs112TimeseriesGroupByResponseCodes"></a>
# **radarGetDnsAs112TimeseriesGroupByResponseCodes**
> RadarGetDnsAs112TimeseriesGroupByResponseCodes200Response radarGetDnsAs112TimeseriesGroupByResponseCodes(aggInterval, name, dateRange, dateStart, dateEnd, asn, location, continent, format)

Get a time series of AS112 Response Codes

Percentage distribution of AS112 dns requests classified per Response Codes over time.

### Example
```java
// Import classes:
import cloudflare.ApiClient;
import cloudflare.ApiException;
import cloudflare.Configuration;
import cloudflare.auth.*;
import cloudflare.models.*;
import cloudflare.sdk.RadarAs112Api;

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

    RadarAs112Api apiInstance = new RadarAs112Api(defaultClient);
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
      RadarGetDnsAs112TimeseriesGroupByResponseCodes200Response result = apiInstance.radarGetDnsAs112TimeseriesGroupByResponseCodes(aggInterval, name, dateRange, dateStart, dateEnd, asn, location, continent, format);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling RadarAs112Api#radarGetDnsAs112TimeseriesGroupByResponseCodes");
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

[**RadarGetDnsAs112TimeseriesGroupByResponseCodes200Response**](RadarGetDnsAs112TimeseriesGroupByResponseCodes200Response.md)

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

<a id="radarGetDnsAs112TopLocations"></a>
# **radarGetDnsAs112TopLocations**
> RadarGetDnsAs112TopLocations200Response radarGetDnsAs112TopLocations(limit, name, dateRange, dateStart, dateEnd, asn, location, continent, format)

Get top autonomous systems by AS112 DNS queries

Get the top locations by AS112 DNS queries. Values are a percentage out of the total queries.

### Example
```java
// Import classes:
import cloudflare.ApiClient;
import cloudflare.ApiException;
import cloudflare.Configuration;
import cloudflare.auth.*;
import cloudflare.models.*;
import cloudflare.sdk.RadarAs112Api;

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

    RadarAs112Api apiInstance = new RadarAs112Api(defaultClient);
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
      RadarGetDnsAs112TopLocations200Response result = apiInstance.radarGetDnsAs112TopLocations(limit, name, dateRange, dateStart, dateEnd, asn, location, continent, format);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling RadarAs112Api#radarGetDnsAs112TopLocations");
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

<a id="radarGetDnsAs112TopLocationsByDnssec"></a>
# **radarGetDnsAs112TopLocationsByDnssec**
> RadarGetDnsAs112TopLocations200Response radarGetDnsAs112TopLocationsByDnssec(dnssec, limit, name, dateRange, dateStart, dateEnd, asn, location, continent, format)

Get Top Locations By DNS Queries DNSSEC Support

Get the top locations by DNS queries DNSSEC support to AS112.

### Example
```java
// Import classes:
import cloudflare.ApiClient;
import cloudflare.ApiException;
import cloudflare.Configuration;
import cloudflare.auth.*;
import cloudflare.models.*;
import cloudflare.sdk.RadarAs112Api;

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

    RadarAs112Api apiInstance = new RadarAs112Api(defaultClient);
    String dnssec = "SUPPORTED"; // String | 
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
      RadarGetDnsAs112TopLocations200Response result = apiInstance.radarGetDnsAs112TopLocationsByDnssec(dnssec, limit, name, dateRange, dateStart, dateEnd, asn, location, continent, format);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling RadarAs112Api#radarGetDnsAs112TopLocationsByDnssec");
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
| **dnssec** | **String**|  | [enum: SUPPORTED, NOT_SUPPORTED] |
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

<a id="radarGetDnsAs112TopLocationsByEdns"></a>
# **radarGetDnsAs112TopLocationsByEdns**
> RadarGetDnsAs112TopLocations200Response radarGetDnsAs112TopLocationsByEdns(edns, limit, name, dateRange, dateStart, dateEnd, asn, location, continent, format)

Get Top Locations By EDNS Support

Get the top locations, by DNS queries EDNS support to AS112.

### Example
```java
// Import classes:
import cloudflare.ApiClient;
import cloudflare.ApiException;
import cloudflare.Configuration;
import cloudflare.auth.*;
import cloudflare.models.*;
import cloudflare.sdk.RadarAs112Api;

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

    RadarAs112Api apiInstance = new RadarAs112Api(defaultClient);
    String edns = "SUPPORTED"; // String | 
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
      RadarGetDnsAs112TopLocations200Response result = apiInstance.radarGetDnsAs112TopLocationsByEdns(edns, limit, name, dateRange, dateStart, dateEnd, asn, location, continent, format);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling RadarAs112Api#radarGetDnsAs112TopLocationsByEdns");
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
| **edns** | **String**|  | [enum: SUPPORTED, NOT_SUPPORTED] |
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

<a id="radarGetDnsAs112TopLocationsByIpVersion"></a>
# **radarGetDnsAs112TopLocationsByIpVersion**
> RadarGetDnsAs112TopLocations200Response radarGetDnsAs112TopLocationsByIpVersion(ipVersion, limit, name, dateRange, dateStart, dateEnd, asn, location, continent, format)

Get Top Locations by DNS Queries IP version

Get the top locations by DNS queries IP version to AS112.

### Example
```java
// Import classes:
import cloudflare.ApiClient;
import cloudflare.ApiException;
import cloudflare.Configuration;
import cloudflare.auth.*;
import cloudflare.models.*;
import cloudflare.sdk.RadarAs112Api;

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

    RadarAs112Api apiInstance = new RadarAs112Api(defaultClient);
    String ipVersion = "IPv4"; // String | 
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
      RadarGetDnsAs112TopLocations200Response result = apiInstance.radarGetDnsAs112TopLocationsByIpVersion(ipVersion, limit, name, dateRange, dateStart, dateEnd, asn, location, continent, format);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling RadarAs112Api#radarGetDnsAs112TopLocationsByIpVersion");
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

