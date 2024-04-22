# RadarBgpApi

All URIs are relative to *https://api.cloudflare.com/client/v4*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**radarGetBgpHijacksEvents**](RadarBgpApi.md#radarGetBgpHijacksEvents) | **GET** /radar/bgp/hijacks/events | Get BGP hijack events |
| [**radarGetBgpIpSpaceTimeseries**](RadarBgpApi.md#radarGetBgpIpSpaceTimeseries) | **GET** /radar/bgp/routes/timeseries | Get BGP IP space time series |
| [**radarGetBgpPfx2as**](RadarBgpApi.md#radarGetBgpPfx2as) | **GET** /radar/bgp/routes/pfx2as | Get prefix-to-ASN mapping |
| [**radarGetBgpPfx2asMoas**](RadarBgpApi.md#radarGetBgpPfx2asMoas) | **GET** /radar/bgp/routes/moas | Get MOASes |
| [**radarGetBgpRouteLeakEvents**](RadarBgpApi.md#radarGetBgpRouteLeakEvents) | **GET** /radar/bgp/leaks/events | Get BGP route leak events |
| [**radarGetBgpRoutesStats**](RadarBgpApi.md#radarGetBgpRoutesStats) | **GET** /radar/bgp/routes/stats | Get BGP routing table stats  |
| [**radarGetBgpTimeseries**](RadarBgpApi.md#radarGetBgpTimeseries) | **GET** /radar/bgp/timeseries | Get BGP time series |
| [**radarGetBgpTopAses**](RadarBgpApi.md#radarGetBgpTopAses) | **GET** /radar/bgp/top/ases | Get top autonomous systems |
| [**radarGetBgpTopAsnsByPrefixes**](RadarBgpApi.md#radarGetBgpTopAsnsByPrefixes) | **GET** /radar/bgp/top/ases/prefixes | Get list of ASNs ordered by prefix count |
| [**radarGetBgpTopPrefixes**](RadarBgpApi.md#radarGetBgpTopPrefixes) | **GET** /radar/bgp/top/prefixes | Get top prefixes |


<a id="radarGetBgpHijacksEvents"></a>
# **radarGetBgpHijacksEvents**
> RadarGetBgpHijacksEvents200Response radarGetBgpHijacksEvents(page, perPage, eventId, hijackerAsn, victimAsn, involvedAsn, involvedCountry, prefix, minConfidence, maxConfidence, dateRange, dateStart, dateEnd, sortBy, sortOrder, format)

Get BGP hijack events

Get the BGP hijack events. (Beta)

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.RadarBgpApi;

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

    RadarBgpApi apiInstance = new RadarBgpApi(defaultClient);
    Integer page = 56; // Integer | 
    Integer perPage = 56; // Integer | 
    Integer eventId = 56; // Integer | 
    Integer hijackerAsn = 56; // Integer | 
    Integer victimAsn = 56; // Integer | 
    Integer involvedAsn = 56; // Integer | 
    String involvedCountry = "involvedCountry_example"; // String | 
    String prefix = "prefix_example"; // String | 
    Integer minConfidence = 56; // Integer | 
    Integer maxConfidence = 56; // Integer | 
    String dateRange = "1d"; // String | 
    OffsetDateTime dateStart = OffsetDateTime.parse("2023-09-01T11:41:33.782Z"); // OffsetDateTime | 
    OffsetDateTime dateEnd = OffsetDateTime.parse("2023-09-01T11:41:33.782Z"); // OffsetDateTime | 
    String sortBy = "ID"; // String | 
    String sortOrder = "ASC"; // String | 
    String format = "JSON"; // String | 
    try {
      RadarGetBgpHijacksEvents200Response result = apiInstance.radarGetBgpHijacksEvents(page, perPage, eventId, hijackerAsn, victimAsn, involvedAsn, involvedCountry, prefix, minConfidence, maxConfidence, dateRange, dateStart, dateEnd, sortBy, sortOrder, format);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling RadarBgpApi#radarGetBgpHijacksEvents");
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
| **page** | **Integer**|  | [optional] |
| **perPage** | **Integer**|  | [optional] |
| **eventId** | **Integer**|  | [optional] |
| **hijackerAsn** | **Integer**|  | [optional] |
| **victimAsn** | **Integer**|  | [optional] |
| **involvedAsn** | **Integer**|  | [optional] |
| **involvedCountry** | **String**|  | [optional] |
| **prefix** | **String**|  | [optional] |
| **minConfidence** | **Integer**|  | [optional] |
| **maxConfidence** | **Integer**|  | [optional] |
| **dateRange** | **String**|  | [optional] [enum: 1d, 2d, 7d, 14d, 28d, 12w, 24w, 52w, 1dControl, 2dControl, 7dControl, 14dControl, 28dControl, 12wControl, 24wControl] |
| **dateStart** | **OffsetDateTime**|  | [optional] |
| **dateEnd** | **OffsetDateTime**|  | [optional] |
| **sortBy** | **String**|  | [optional] [enum: ID, TIME, CONFIDENCE] |
| **sortOrder** | **String**|  | [optional] [enum: ASC, DESC] |
| **format** | **String**|  | [optional] [enum: JSON, CSV] |

### Return type

[**RadarGetBgpHijacksEvents200Response**](RadarGetBgpHijacksEvents200Response.md)

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

<a id="radarGetBgpIpSpaceTimeseries"></a>
# **radarGetBgpIpSpaceTimeseries**
> RadarGetBgpIpSpaceTimeseries200Response radarGetBgpIpSpaceTimeseries(dateRange, dateStart, dateEnd, asn, location, includeDelay, format)

Get BGP IP space time series

Gets time-series data for the announced IP space count, represented as the number of IPv4 /24s and IPv6 /48s, for a given ASN.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.RadarBgpApi;

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

    RadarBgpApi apiInstance = new RadarBgpApi(defaultClient);
    String dateRange = "1d"; // String | 
    OffsetDateTime dateStart = OffsetDateTime.parse("2023-09-01T11:41:33.782Z"); // OffsetDateTime | 
    OffsetDateTime dateEnd = OffsetDateTime.parse("2023-09-01T11:41:33.782Z"); // OffsetDateTime | 
    Integer asn = 174; // Integer | 
    String location = "US"; // String | 
    Boolean includeDelay = true; // Boolean | 
    String format = "JSON"; // String | 
    try {
      RadarGetBgpIpSpaceTimeseries200Response result = apiInstance.radarGetBgpIpSpaceTimeseries(dateRange, dateStart, dateEnd, asn, location, includeDelay, format);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling RadarBgpApi#radarGetBgpIpSpaceTimeseries");
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
| **dateRange** | **String**|  | [optional] [enum: 1d, 2d, 7d, 14d, 28d, 12w, 24w, 52w, 1dControl, 2dControl, 7dControl, 14dControl, 28dControl, 12wControl, 24wControl] |
| **dateStart** | **OffsetDateTime**|  | [optional] |
| **dateEnd** | **OffsetDateTime**|  | [optional] |
| **asn** | **Integer**|  | [optional] |
| **location** | **String**|  | [optional] |
| **includeDelay** | **Boolean**|  | [optional] |
| **format** | **String**|  | [optional] [enum: JSON, CSV] |

### Return type

[**RadarGetBgpIpSpaceTimeseries200Response**](RadarGetBgpIpSpaceTimeseries200Response.md)

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

<a id="radarGetBgpPfx2as"></a>
# **radarGetBgpPfx2as**
> RadarGetBgpPfx2as200Response radarGetBgpPfx2as(origin, prefix, rpkiStatus, longestPrefixMatch, format)

Get prefix-to-ASN mapping

Lookup prefix-to-ASN mapping on global routing tables.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.RadarBgpApi;

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

    RadarBgpApi apiInstance = new RadarBgpApi(defaultClient);
    Integer origin = 56; // Integer | 
    String prefix = "1.1.1.0/24"; // String | 
    String rpkiStatus = "VALID"; // String | 
    Boolean longestPrefixMatch = true; // Boolean | 
    String format = "JSON"; // String | 
    try {
      RadarGetBgpPfx2as200Response result = apiInstance.radarGetBgpPfx2as(origin, prefix, rpkiStatus, longestPrefixMatch, format);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling RadarBgpApi#radarGetBgpPfx2as");
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
| **origin** | **Integer**|  | [optional] |
| **prefix** | **String**|  | [optional] |
| **rpkiStatus** | **String**|  | [optional] [enum: VALID, INVALID, UNKNOWN] |
| **longestPrefixMatch** | **Boolean**|  | [optional] |
| **format** | **String**|  | [optional] [enum: JSON, CSV] |

### Return type

[**RadarGetBgpPfx2as200Response**](RadarGetBgpPfx2as200Response.md)

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

<a id="radarGetBgpPfx2asMoas"></a>
# **radarGetBgpPfx2asMoas**
> RadarGetBgpPfx2asMoas200Response radarGetBgpPfx2asMoas(origin, prefix, invalidOnly, format)

Get MOASes

List all Multi-origin AS (MOAS) prefixes on the global routing tables.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.RadarBgpApi;

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

    RadarBgpApi apiInstance = new RadarBgpApi(defaultClient);
    Integer origin = 56; // Integer | 
    String prefix = "prefix_example"; // String | 
    Boolean invalidOnly = true; // Boolean | 
    String format = "JSON"; // String | 
    try {
      RadarGetBgpPfx2asMoas200Response result = apiInstance.radarGetBgpPfx2asMoas(origin, prefix, invalidOnly, format);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling RadarBgpApi#radarGetBgpPfx2asMoas");
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
| **origin** | **Integer**|  | [optional] |
| **prefix** | **String**|  | [optional] |
| **invalidOnly** | **Boolean**|  | [optional] |
| **format** | **String**|  | [optional] [enum: JSON, CSV] |

### Return type

[**RadarGetBgpPfx2asMoas200Response**](RadarGetBgpPfx2asMoas200Response.md)

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

<a id="radarGetBgpRouteLeakEvents"></a>
# **radarGetBgpRouteLeakEvents**
> RadarGetBgpRouteLeakEvents200Response radarGetBgpRouteLeakEvents(page, perPage, eventId, leakAsn, involvedAsn, involvedCountry, dateRange, dateStart, dateEnd, sortBy, sortOrder, format)

Get BGP route leak events

Get the BGP route leak events (Beta).

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.RadarBgpApi;

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

    RadarBgpApi apiInstance = new RadarBgpApi(defaultClient);
    Integer page = 56; // Integer | 
    Integer perPage = 56; // Integer | 
    Integer eventId = 56; // Integer | 
    Integer leakAsn = 56; // Integer | 
    Integer involvedAsn = 56; // Integer | 
    String involvedCountry = "involvedCountry_example"; // String | 
    String dateRange = "1d"; // String | 
    OffsetDateTime dateStart = OffsetDateTime.parse("2023-09-01T11:41:33.782Z"); // OffsetDateTime | 
    OffsetDateTime dateEnd = OffsetDateTime.parse("2023-09-01T11:41:33.782Z"); // OffsetDateTime | 
    String sortBy = "ID"; // String | 
    String sortOrder = "ASC"; // String | 
    String format = "JSON"; // String | 
    try {
      RadarGetBgpRouteLeakEvents200Response result = apiInstance.radarGetBgpRouteLeakEvents(page, perPage, eventId, leakAsn, involvedAsn, involvedCountry, dateRange, dateStart, dateEnd, sortBy, sortOrder, format);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling RadarBgpApi#radarGetBgpRouteLeakEvents");
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
| **page** | **Integer**|  | [optional] |
| **perPage** | **Integer**|  | [optional] |
| **eventId** | **Integer**|  | [optional] |
| **leakAsn** | **Integer**|  | [optional] |
| **involvedAsn** | **Integer**|  | [optional] |
| **involvedCountry** | **String**|  | [optional] |
| **dateRange** | **String**|  | [optional] [enum: 1d, 2d, 7d, 14d, 28d, 12w, 24w, 52w, 1dControl, 2dControl, 7dControl, 14dControl, 28dControl, 12wControl, 24wControl] |
| **dateStart** | **OffsetDateTime**|  | [optional] |
| **dateEnd** | **OffsetDateTime**|  | [optional] |
| **sortBy** | **String**|  | [optional] [enum: ID, LEAKS, PEERS, PREFIXES, ORIGINS, TIME] |
| **sortOrder** | **String**|  | [optional] [enum: ASC, DESC] |
| **format** | **String**|  | [optional] [enum: JSON, CSV] |

### Return type

[**RadarGetBgpRouteLeakEvents200Response**](RadarGetBgpRouteLeakEvents200Response.md)

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

<a id="radarGetBgpRoutesStats"></a>
# **radarGetBgpRoutesStats**
> RadarGetBgpRoutesStats200Response radarGetBgpRoutesStats(asn, location, format)

Get BGP routing table stats 

Get the BGP routing table stats (Beta).

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.RadarBgpApi;

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

    RadarBgpApi apiInstance = new RadarBgpApi(defaultClient);
    Integer asn = 174; // Integer | 
    String location = "US"; // String | 
    String format = "JSON"; // String | 
    try {
      RadarGetBgpRoutesStats200Response result = apiInstance.radarGetBgpRoutesStats(asn, location, format);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling RadarBgpApi#radarGetBgpRoutesStats");
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
| **asn** | **Integer**|  | [optional] |
| **location** | **String**|  | [optional] |
| **format** | **String**|  | [optional] [enum: JSON, CSV] |

### Return type

[**RadarGetBgpRoutesStats200Response**](RadarGetBgpRoutesStats200Response.md)

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

<a id="radarGetBgpTimeseries"></a>
# **radarGetBgpTimeseries**
> RadarGetDnsAs112Timeseries200Response radarGetBgpTimeseries(aggInterval, name, dateRange, dateStart, dateEnd, prefix, updateType, asn, format)

Get BGP time series

Gets BGP updates change over time. Raw values are returned. When requesting updates of an autonomous system (AS), only BGP updates of type announcement are returned.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.RadarBgpApi;

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

    RadarBgpApi apiInstance = new RadarBgpApi(defaultClient);
    String aggInterval = "15m"; // String | 
    List<String> name = Arrays.asList(); // List<String> | 
    List<String> dateRange = Arrays.asList(); // List<String> | 
    List<OffsetDateTime> dateStart = Arrays.asList(); // List<OffsetDateTime> | 
    List<OffsetDateTime> dateEnd = Arrays.asList(); // List<OffsetDateTime> | 
    List<String> prefix = Arrays.asList(); // List<String> | 
    List<String> updateType = Arrays.asList(); // List<String> | 
    List<String> asn = Arrays.asList(); // List<String> | 
    String format = "JSON"; // String | 
    try {
      RadarGetDnsAs112Timeseries200Response result = apiInstance.radarGetBgpTimeseries(aggInterval, name, dateRange, dateStart, dateEnd, prefix, updateType, asn, format);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling RadarBgpApi#radarGetBgpTimeseries");
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
| **prefix** | [**List&lt;String&gt;**](String.md)|  | [optional] |
| **updateType** | [**List&lt;String&gt;**](String.md)|  | [optional] [enum: ANNOUNCEMENT, WITHDRAWAL] |
| **asn** | [**List&lt;String&gt;**](String.md)|  | [optional] |
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

<a id="radarGetBgpTopAses"></a>
# **radarGetBgpTopAses**
> RadarGetBgpTopAses200Response radarGetBgpTopAses(limit, name, dateRange, dateStart, dateEnd, asn, prefix, updateType, format)

Get top autonomous systems

Get the top autonomous systems (AS) by BGP updates (announcements only). Values are a percentage out of the total updates.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.RadarBgpApi;

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

    RadarBgpApi apiInstance = new RadarBgpApi(defaultClient);
    Integer limit = 5; // Integer | 
    List<String> name = Arrays.asList(); // List<String> | 
    List<String> dateRange = Arrays.asList(); // List<String> | 
    List<OffsetDateTime> dateStart = Arrays.asList(); // List<OffsetDateTime> | 
    List<OffsetDateTime> dateEnd = Arrays.asList(); // List<OffsetDateTime> | 
    List<String> asn = Arrays.asList(); // List<String> | 
    List<String> prefix = Arrays.asList(); // List<String> | 
    List<String> updateType = Arrays.asList(); // List<String> | 
    String format = "JSON"; // String | 
    try {
      RadarGetBgpTopAses200Response result = apiInstance.radarGetBgpTopAses(limit, name, dateRange, dateStart, dateEnd, asn, prefix, updateType, format);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling RadarBgpApi#radarGetBgpTopAses");
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
| **prefix** | [**List&lt;String&gt;**](String.md)|  | [optional] |
| **updateType** | [**List&lt;String&gt;**](String.md)|  | [optional] [enum: ANNOUNCEMENT, WITHDRAWAL] |
| **format** | **String**|  | [optional] [enum: JSON, CSV] |

### Return type

[**RadarGetBgpTopAses200Response**](RadarGetBgpTopAses200Response.md)

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

<a id="radarGetBgpTopAsnsByPrefixes"></a>
# **radarGetBgpTopAsnsByPrefixes**
> RadarGetBgpTopAsnsByPrefixes200Response radarGetBgpTopAsnsByPrefixes(country, limit, format)

Get list of ASNs ordered by prefix count

Get the full list of autonomous systems on the global routing table ordered by announced prefixes count. The data comes from public BGP MRT data archives and updates every 2 hours.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.RadarBgpApi;

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

    RadarBgpApi apiInstance = new RadarBgpApi(defaultClient);
    String country = "NZ"; // String | 
    Integer limit = 10; // Integer | 
    String format = "JSON"; // String | 
    try {
      RadarGetBgpTopAsnsByPrefixes200Response result = apiInstance.radarGetBgpTopAsnsByPrefixes(country, limit, format);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling RadarBgpApi#radarGetBgpTopAsnsByPrefixes");
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
| **country** | **String**|  | [optional] |
| **limit** | **Integer**|  | [optional] |
| **format** | **String**|  | [optional] [enum: JSON, CSV] |

### Return type

[**RadarGetBgpTopAsnsByPrefixes200Response**](RadarGetBgpTopAsnsByPrefixes200Response.md)

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

<a id="radarGetBgpTopPrefixes"></a>
# **radarGetBgpTopPrefixes**
> RadarGetBgpTopPrefixes200Response radarGetBgpTopPrefixes(limit, name, dateRange, dateStart, dateEnd, asn, updateType, format)

Get top prefixes

Get the top network prefixes by BGP updates. Values are a percentage out of the total BGP updates.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.RadarBgpApi;

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

    RadarBgpApi apiInstance = new RadarBgpApi(defaultClient);
    Integer limit = 5; // Integer | 
    List<String> name = Arrays.asList(); // List<String> | 
    List<String> dateRange = Arrays.asList(); // List<String> | 
    List<OffsetDateTime> dateStart = Arrays.asList(); // List<OffsetDateTime> | 
    List<OffsetDateTime> dateEnd = Arrays.asList(); // List<OffsetDateTime> | 
    List<String> asn = Arrays.asList(); // List<String> | 
    List<String> updateType = Arrays.asList(); // List<String> | 
    String format = "JSON"; // String | 
    try {
      RadarGetBgpTopPrefixes200Response result = apiInstance.radarGetBgpTopPrefixes(limit, name, dateRange, dateStart, dateEnd, asn, updateType, format);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling RadarBgpApi#radarGetBgpTopPrefixes");
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
| **updateType** | [**List&lt;String&gt;**](String.md)|  | [optional] [enum: ANNOUNCEMENT, WITHDRAWAL] |
| **format** | **String**|  | [optional] [enum: JSON, CSV] |

### Return type

[**RadarGetBgpTopPrefixes200Response**](RadarGetBgpTopPrefixes200Response.md)

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

