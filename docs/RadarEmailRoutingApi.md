# RadarEmailRoutingApi

All URIs are relative to *https://api.cloudflare.com/client/v4*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**radarGetEmailRoutingSummaryByArc**](RadarEmailRoutingApi.md#radarGetEmailRoutingSummaryByArc) | **GET** /radar/email/routing/summary/arc | Get ARC Validations Summary |
| [**radarGetEmailRoutingSummaryByDkim**](RadarEmailRoutingApi.md#radarGetEmailRoutingSummaryByDkim) | **GET** /radar/email/routing/summary/dkim | Get DKIM Validations Summary |
| [**radarGetEmailRoutingSummaryByDmarc**](RadarEmailRoutingApi.md#radarGetEmailRoutingSummaryByDmarc) | **GET** /radar/email/routing/summary/dmarc | Get DMARC Validations Summary |
| [**radarGetEmailRoutingSummaryByEncrypted**](RadarEmailRoutingApi.md#radarGetEmailRoutingSummaryByEncrypted) | **GET** /radar/email/routing/summary/encrypted | Get Encrypted Summary |
| [**radarGetEmailRoutingSummaryByIpVersion**](RadarEmailRoutingApi.md#radarGetEmailRoutingSummaryByIpVersion) | **GET** /radar/email/routing/summary/ip_version | Get Ip Version Summary |
| [**radarGetEmailRoutingSummaryBySpf**](RadarEmailRoutingApi.md#radarGetEmailRoutingSummaryBySpf) | **GET** /radar/email/routing/summary/spf | Get SPF Validations Summary |
| [**radarGetEmailRoutingTimeseriesGroupByArc**](RadarEmailRoutingApi.md#radarGetEmailRoutingTimeseriesGroupByArc) | **GET** /radar/email/routing/timeseries_groups/arc | Get ARC Validations Time Series |
| [**radarGetEmailRoutingTimeseriesGroupByDkim**](RadarEmailRoutingApi.md#radarGetEmailRoutingTimeseriesGroupByDkim) | **GET** /radar/email/routing/timeseries_groups/dkim | Get DKIM Validations Time Series |
| [**radarGetEmailRoutingTimeseriesGroupByDmarc**](RadarEmailRoutingApi.md#radarGetEmailRoutingTimeseriesGroupByDmarc) | **GET** /radar/email/routing/timeseries_groups/dmarc | Get DMARC Validations Time Series |
| [**radarGetEmailRoutingTimeseriesGroupByEncrypted**](RadarEmailRoutingApi.md#radarGetEmailRoutingTimeseriesGroupByEncrypted) | **GET** /radar/email/routing/timeseries_groups/encrypted | Get Encrypted Time Series |
| [**radarGetEmailRoutingTimeseriesGroupByIpVersion**](RadarEmailRoutingApi.md#radarGetEmailRoutingTimeseriesGroupByIpVersion) | **GET** /radar/email/routing/timeseries_groups/ip_version | Get Ip Version Time Series |
| [**radarGetEmailRoutingTimeseriesGroupBySpf**](RadarEmailRoutingApi.md#radarGetEmailRoutingTimeseriesGroupBySpf) | **GET** /radar/email/routing/timeseries_groups/spf | Get SPF Validations Time Series |


<a id="radarGetEmailRoutingSummaryByArc"></a>
# **radarGetEmailRoutingSummaryByArc**
> RadarGetEmailRoutingSummaryByArc200Response radarGetEmailRoutingSummaryByArc(name, dateRange, dateStart, dateEnd, dkim, dmarc, spf, ipVersion, encrypted, format)

Get ARC Validations Summary

Percentage distribution of emails classified per ARC validation.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.RadarEmailRoutingApi;

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

    RadarEmailRoutingApi apiInstance = new RadarEmailRoutingApi(defaultClient);
    List<String> name = Arrays.asList(); // List<String> | 
    List<String> dateRange = Arrays.asList(); // List<String> | 
    List<OffsetDateTime> dateStart = Arrays.asList(); // List<OffsetDateTime> | 
    List<OffsetDateTime> dateEnd = Arrays.asList(); // List<OffsetDateTime> | 
    List<String> dkim = Arrays.asList(); // List<String> | 
    List<String> dmarc = Arrays.asList(); // List<String> | 
    List<String> spf = Arrays.asList(); // List<String> | 
    List<String> ipVersion = Arrays.asList(); // List<String> | 
    List<String> encrypted = Arrays.asList(); // List<String> | 
    String format = "JSON"; // String | 
    try {
      RadarGetEmailRoutingSummaryByArc200Response result = apiInstance.radarGetEmailRoutingSummaryByArc(name, dateRange, dateStart, dateEnd, dkim, dmarc, spf, ipVersion, encrypted, format);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling RadarEmailRoutingApi#radarGetEmailRoutingSummaryByArc");
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
| **dkim** | [**List&lt;String&gt;**](String.md)|  | [optional] [enum: PASS, NONE, FAIL] |
| **dmarc** | [**List&lt;String&gt;**](String.md)|  | [optional] [enum: PASS, NONE, FAIL] |
| **spf** | [**List&lt;String&gt;**](String.md)|  | [optional] [enum: PASS, NONE, FAIL] |
| **ipVersion** | [**List&lt;String&gt;**](String.md)|  | [optional] [enum: IPv4, IPv6] |
| **encrypted** | [**List&lt;String&gt;**](String.md)|  | [optional] [enum: ENCRYPTED, NOT_ENCRYPTED] |
| **format** | **String**|  | [optional] [enum: JSON, CSV] |

### Return type

[**RadarGetEmailRoutingSummaryByArc200Response**](RadarGetEmailRoutingSummaryByArc200Response.md)

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

<a id="radarGetEmailRoutingSummaryByDkim"></a>
# **radarGetEmailRoutingSummaryByDkim**
> RadarGetEmailRoutingSummaryByArc200Response radarGetEmailRoutingSummaryByDkim(name, dateRange, dateStart, dateEnd, arc, dmarc, spf, ipVersion, encrypted, format)

Get DKIM Validations Summary

Percentage distribution of emails classified per DKIM validation.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.RadarEmailRoutingApi;

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

    RadarEmailRoutingApi apiInstance = new RadarEmailRoutingApi(defaultClient);
    List<String> name = Arrays.asList(); // List<String> | 
    List<String> dateRange = Arrays.asList(); // List<String> | 
    List<OffsetDateTime> dateStart = Arrays.asList(); // List<OffsetDateTime> | 
    List<OffsetDateTime> dateEnd = Arrays.asList(); // List<OffsetDateTime> | 
    List<String> arc = Arrays.asList(); // List<String> | 
    List<String> dmarc = Arrays.asList(); // List<String> | 
    List<String> spf = Arrays.asList(); // List<String> | 
    List<String> ipVersion = Arrays.asList(); // List<String> | 
    List<String> encrypted = Arrays.asList(); // List<String> | 
    String format = "JSON"; // String | 
    try {
      RadarGetEmailRoutingSummaryByArc200Response result = apiInstance.radarGetEmailRoutingSummaryByDkim(name, dateRange, dateStart, dateEnd, arc, dmarc, spf, ipVersion, encrypted, format);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling RadarEmailRoutingApi#radarGetEmailRoutingSummaryByDkim");
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
| **arc** | [**List&lt;String&gt;**](String.md)|  | [optional] [enum: PASS, NONE, FAIL] |
| **dmarc** | [**List&lt;String&gt;**](String.md)|  | [optional] [enum: PASS, NONE, FAIL] |
| **spf** | [**List&lt;String&gt;**](String.md)|  | [optional] [enum: PASS, NONE, FAIL] |
| **ipVersion** | [**List&lt;String&gt;**](String.md)|  | [optional] [enum: IPv4, IPv6] |
| **encrypted** | [**List&lt;String&gt;**](String.md)|  | [optional] [enum: ENCRYPTED, NOT_ENCRYPTED] |
| **format** | **String**|  | [optional] [enum: JSON, CSV] |

### Return type

[**RadarGetEmailRoutingSummaryByArc200Response**](RadarGetEmailRoutingSummaryByArc200Response.md)

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

<a id="radarGetEmailRoutingSummaryByDmarc"></a>
# **radarGetEmailRoutingSummaryByDmarc**
> RadarGetEmailRoutingSummaryByArc200Response radarGetEmailRoutingSummaryByDmarc(name, dateRange, dateStart, dateEnd, arc, dkim, spf, ipVersion, encrypted, format)

Get DMARC Validations Summary

Percentage distribution of emails classified per DMARC validation.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.RadarEmailRoutingApi;

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

    RadarEmailRoutingApi apiInstance = new RadarEmailRoutingApi(defaultClient);
    List<String> name = Arrays.asList(); // List<String> | 
    List<String> dateRange = Arrays.asList(); // List<String> | 
    List<OffsetDateTime> dateStart = Arrays.asList(); // List<OffsetDateTime> | 
    List<OffsetDateTime> dateEnd = Arrays.asList(); // List<OffsetDateTime> | 
    List<String> arc = Arrays.asList(); // List<String> | 
    List<String> dkim = Arrays.asList(); // List<String> | 
    List<String> spf = Arrays.asList(); // List<String> | 
    List<String> ipVersion = Arrays.asList(); // List<String> | 
    List<String> encrypted = Arrays.asList(); // List<String> | 
    String format = "JSON"; // String | 
    try {
      RadarGetEmailRoutingSummaryByArc200Response result = apiInstance.radarGetEmailRoutingSummaryByDmarc(name, dateRange, dateStart, dateEnd, arc, dkim, spf, ipVersion, encrypted, format);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling RadarEmailRoutingApi#radarGetEmailRoutingSummaryByDmarc");
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
| **arc** | [**List&lt;String&gt;**](String.md)|  | [optional] [enum: PASS, NONE, FAIL] |
| **dkim** | [**List&lt;String&gt;**](String.md)|  | [optional] [enum: PASS, NONE, FAIL] |
| **spf** | [**List&lt;String&gt;**](String.md)|  | [optional] [enum: PASS, NONE, FAIL] |
| **ipVersion** | [**List&lt;String&gt;**](String.md)|  | [optional] [enum: IPv4, IPv6] |
| **encrypted** | [**List&lt;String&gt;**](String.md)|  | [optional] [enum: ENCRYPTED, NOT_ENCRYPTED] |
| **format** | **String**|  | [optional] [enum: JSON, CSV] |

### Return type

[**RadarGetEmailRoutingSummaryByArc200Response**](RadarGetEmailRoutingSummaryByArc200Response.md)

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

<a id="radarGetEmailRoutingSummaryByEncrypted"></a>
# **radarGetEmailRoutingSummaryByEncrypted**
> RadarGetEmailRoutingSummaryByEncrypted200Response radarGetEmailRoutingSummaryByEncrypted(name, dateRange, dateStart, dateEnd, arc, dkim, dmarc, spf, ipVersion, format)

Get Encrypted Summary

Percentage distribution of emails by Encrypted

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.RadarEmailRoutingApi;

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

    RadarEmailRoutingApi apiInstance = new RadarEmailRoutingApi(defaultClient);
    List<String> name = Arrays.asList(); // List<String> | 
    List<String> dateRange = Arrays.asList(); // List<String> | 
    List<OffsetDateTime> dateStart = Arrays.asList(); // List<OffsetDateTime> | 
    List<OffsetDateTime> dateEnd = Arrays.asList(); // List<OffsetDateTime> | 
    List<String> arc = Arrays.asList(); // List<String> | 
    List<String> dkim = Arrays.asList(); // List<String> | 
    List<String> dmarc = Arrays.asList(); // List<String> | 
    List<String> spf = Arrays.asList(); // List<String> | 
    List<String> ipVersion = Arrays.asList(); // List<String> | 
    String format = "JSON"; // String | 
    try {
      RadarGetEmailRoutingSummaryByEncrypted200Response result = apiInstance.radarGetEmailRoutingSummaryByEncrypted(name, dateRange, dateStart, dateEnd, arc, dkim, dmarc, spf, ipVersion, format);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling RadarEmailRoutingApi#radarGetEmailRoutingSummaryByEncrypted");
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
| **arc** | [**List&lt;String&gt;**](String.md)|  | [optional] [enum: PASS, NONE, FAIL] |
| **dkim** | [**List&lt;String&gt;**](String.md)|  | [optional] [enum: PASS, NONE, FAIL] |
| **dmarc** | [**List&lt;String&gt;**](String.md)|  | [optional] [enum: PASS, NONE, FAIL] |
| **spf** | [**List&lt;String&gt;**](String.md)|  | [optional] [enum: PASS, NONE, FAIL] |
| **ipVersion** | [**List&lt;String&gt;**](String.md)|  | [optional] [enum: IPv4, IPv6] |
| **format** | **String**|  | [optional] [enum: JSON, CSV] |

### Return type

[**RadarGetEmailRoutingSummaryByEncrypted200Response**](RadarGetEmailRoutingSummaryByEncrypted200Response.md)

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

<a id="radarGetEmailRoutingSummaryByIpVersion"></a>
# **radarGetEmailRoutingSummaryByIpVersion**
> RadarGetEmailRoutingSummaryByIpVersion200Response radarGetEmailRoutingSummaryByIpVersion(name, dateRange, dateStart, dateEnd, arc, dkim, dmarc, spf, encrypted, format)

Get Ip Version Summary

Percentage distribution of emails by Ip Version.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.RadarEmailRoutingApi;

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

    RadarEmailRoutingApi apiInstance = new RadarEmailRoutingApi(defaultClient);
    List<String> name = Arrays.asList(); // List<String> | 
    List<String> dateRange = Arrays.asList(); // List<String> | 
    List<OffsetDateTime> dateStart = Arrays.asList(); // List<OffsetDateTime> | 
    List<OffsetDateTime> dateEnd = Arrays.asList(); // List<OffsetDateTime> | 
    List<String> arc = Arrays.asList(); // List<String> | 
    List<String> dkim = Arrays.asList(); // List<String> | 
    List<String> dmarc = Arrays.asList(); // List<String> | 
    List<String> spf = Arrays.asList(); // List<String> | 
    List<String> encrypted = Arrays.asList(); // List<String> | 
    String format = "JSON"; // String | 
    try {
      RadarGetEmailRoutingSummaryByIpVersion200Response result = apiInstance.radarGetEmailRoutingSummaryByIpVersion(name, dateRange, dateStart, dateEnd, arc, dkim, dmarc, spf, encrypted, format);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling RadarEmailRoutingApi#radarGetEmailRoutingSummaryByIpVersion");
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
| **arc** | [**List&lt;String&gt;**](String.md)|  | [optional] [enum: PASS, NONE, FAIL] |
| **dkim** | [**List&lt;String&gt;**](String.md)|  | [optional] [enum: PASS, NONE, FAIL] |
| **dmarc** | [**List&lt;String&gt;**](String.md)|  | [optional] [enum: PASS, NONE, FAIL] |
| **spf** | [**List&lt;String&gt;**](String.md)|  | [optional] [enum: PASS, NONE, FAIL] |
| **encrypted** | [**List&lt;String&gt;**](String.md)|  | [optional] [enum: ENCRYPTED, NOT_ENCRYPTED] |
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

<a id="radarGetEmailRoutingSummaryBySpf"></a>
# **radarGetEmailRoutingSummaryBySpf**
> RadarGetEmailRoutingSummaryByArc200Response radarGetEmailRoutingSummaryBySpf(name, dateRange, dateStart, dateEnd, arc, dkim, dmarc, ipVersion, encrypted, format)

Get SPF Validations Summary

Percentage distribution of emails classified per SPF validation.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.RadarEmailRoutingApi;

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

    RadarEmailRoutingApi apiInstance = new RadarEmailRoutingApi(defaultClient);
    List<String> name = Arrays.asList(); // List<String> | 
    List<String> dateRange = Arrays.asList(); // List<String> | 
    List<OffsetDateTime> dateStart = Arrays.asList(); // List<OffsetDateTime> | 
    List<OffsetDateTime> dateEnd = Arrays.asList(); // List<OffsetDateTime> | 
    List<String> arc = Arrays.asList(); // List<String> | 
    List<String> dkim = Arrays.asList(); // List<String> | 
    List<String> dmarc = Arrays.asList(); // List<String> | 
    List<String> ipVersion = Arrays.asList(); // List<String> | 
    List<String> encrypted = Arrays.asList(); // List<String> | 
    String format = "JSON"; // String | 
    try {
      RadarGetEmailRoutingSummaryByArc200Response result = apiInstance.radarGetEmailRoutingSummaryBySpf(name, dateRange, dateStart, dateEnd, arc, dkim, dmarc, ipVersion, encrypted, format);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling RadarEmailRoutingApi#radarGetEmailRoutingSummaryBySpf");
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
| **arc** | [**List&lt;String&gt;**](String.md)|  | [optional] [enum: PASS, NONE, FAIL] |
| **dkim** | [**List&lt;String&gt;**](String.md)|  | [optional] [enum: PASS, NONE, FAIL] |
| **dmarc** | [**List&lt;String&gt;**](String.md)|  | [optional] [enum: PASS, NONE, FAIL] |
| **ipVersion** | [**List&lt;String&gt;**](String.md)|  | [optional] [enum: IPv4, IPv6] |
| **encrypted** | [**List&lt;String&gt;**](String.md)|  | [optional] [enum: ENCRYPTED, NOT_ENCRYPTED] |
| **format** | **String**|  | [optional] [enum: JSON, CSV] |

### Return type

[**RadarGetEmailRoutingSummaryByArc200Response**](RadarGetEmailRoutingSummaryByArc200Response.md)

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

<a id="radarGetEmailRoutingTimeseriesGroupByArc"></a>
# **radarGetEmailRoutingTimeseriesGroupByArc**
> RadarGetEmailRoutingTimeseriesGroupByArc200Response radarGetEmailRoutingTimeseriesGroupByArc(aggInterval, name, dateRange, dateStart, dateEnd, dkim, dmarc, spf, ipVersion, encrypted, format)

Get ARC Validations Time Series

Percentage distribution of emails classified per Arc validation over time.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.RadarEmailRoutingApi;

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

    RadarEmailRoutingApi apiInstance = new RadarEmailRoutingApi(defaultClient);
    String aggInterval = "15m"; // String | 
    List<String> name = Arrays.asList(); // List<String> | 
    List<String> dateRange = Arrays.asList(); // List<String> | 
    List<OffsetDateTime> dateStart = Arrays.asList(); // List<OffsetDateTime> | 
    List<OffsetDateTime> dateEnd = Arrays.asList(); // List<OffsetDateTime> | 
    List<String> dkim = Arrays.asList(); // List<String> | 
    List<String> dmarc = Arrays.asList(); // List<String> | 
    List<String> spf = Arrays.asList(); // List<String> | 
    List<String> ipVersion = Arrays.asList(); // List<String> | 
    List<String> encrypted = Arrays.asList(); // List<String> | 
    String format = "JSON"; // String | 
    try {
      RadarGetEmailRoutingTimeseriesGroupByArc200Response result = apiInstance.radarGetEmailRoutingTimeseriesGroupByArc(aggInterval, name, dateRange, dateStart, dateEnd, dkim, dmarc, spf, ipVersion, encrypted, format);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling RadarEmailRoutingApi#radarGetEmailRoutingTimeseriesGroupByArc");
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
| **dkim** | [**List&lt;String&gt;**](String.md)|  | [optional] [enum: PASS, NONE, FAIL] |
| **dmarc** | [**List&lt;String&gt;**](String.md)|  | [optional] [enum: PASS, NONE, FAIL] |
| **spf** | [**List&lt;String&gt;**](String.md)|  | [optional] [enum: PASS, NONE, FAIL] |
| **ipVersion** | [**List&lt;String&gt;**](String.md)|  | [optional] [enum: IPv4, IPv6] |
| **encrypted** | [**List&lt;String&gt;**](String.md)|  | [optional] [enum: ENCRYPTED, NOT_ENCRYPTED] |
| **format** | **String**|  | [optional] [enum: JSON, CSV] |

### Return type

[**RadarGetEmailRoutingTimeseriesGroupByArc200Response**](RadarGetEmailRoutingTimeseriesGroupByArc200Response.md)

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

<a id="radarGetEmailRoutingTimeseriesGroupByDkim"></a>
# **radarGetEmailRoutingTimeseriesGroupByDkim**
> RadarGetEmailRoutingTimeseriesGroupByArc200Response radarGetEmailRoutingTimeseriesGroupByDkim(aggInterval, name, dateRange, dateStart, dateEnd, arc, dmarc, spf, ipVersion, encrypted, format)

Get DKIM Validations Time Series

Percentage distribution of emails classified per DKIM validation over time.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.RadarEmailRoutingApi;

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

    RadarEmailRoutingApi apiInstance = new RadarEmailRoutingApi(defaultClient);
    String aggInterval = "15m"; // String | 
    List<String> name = Arrays.asList(); // List<String> | 
    List<String> dateRange = Arrays.asList(); // List<String> | 
    List<OffsetDateTime> dateStart = Arrays.asList(); // List<OffsetDateTime> | 
    List<OffsetDateTime> dateEnd = Arrays.asList(); // List<OffsetDateTime> | 
    List<String> arc = Arrays.asList(); // List<String> | 
    List<String> dmarc = Arrays.asList(); // List<String> | 
    List<String> spf = Arrays.asList(); // List<String> | 
    List<String> ipVersion = Arrays.asList(); // List<String> | 
    List<String> encrypted = Arrays.asList(); // List<String> | 
    String format = "JSON"; // String | 
    try {
      RadarGetEmailRoutingTimeseriesGroupByArc200Response result = apiInstance.radarGetEmailRoutingTimeseriesGroupByDkim(aggInterval, name, dateRange, dateStart, dateEnd, arc, dmarc, spf, ipVersion, encrypted, format);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling RadarEmailRoutingApi#radarGetEmailRoutingTimeseriesGroupByDkim");
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
| **arc** | [**List&lt;String&gt;**](String.md)|  | [optional] [enum: PASS, NONE, FAIL] |
| **dmarc** | [**List&lt;String&gt;**](String.md)|  | [optional] [enum: PASS, NONE, FAIL] |
| **spf** | [**List&lt;String&gt;**](String.md)|  | [optional] [enum: PASS, NONE, FAIL] |
| **ipVersion** | [**List&lt;String&gt;**](String.md)|  | [optional] [enum: IPv4, IPv6] |
| **encrypted** | [**List&lt;String&gt;**](String.md)|  | [optional] [enum: ENCRYPTED, NOT_ENCRYPTED] |
| **format** | **String**|  | [optional] [enum: JSON, CSV] |

### Return type

[**RadarGetEmailRoutingTimeseriesGroupByArc200Response**](RadarGetEmailRoutingTimeseriesGroupByArc200Response.md)

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

<a id="radarGetEmailRoutingTimeseriesGroupByDmarc"></a>
# **radarGetEmailRoutingTimeseriesGroupByDmarc**
> RadarGetEmailRoutingTimeseriesGroupByArc200Response radarGetEmailRoutingTimeseriesGroupByDmarc(aggInterval, name, dateRange, dateStart, dateEnd, arc, dkim, spf, ipVersion, encrypted, format)

Get DMARC Validations Time Series

Percentage distribution of emails classified per DMARC validation over time.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.RadarEmailRoutingApi;

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

    RadarEmailRoutingApi apiInstance = new RadarEmailRoutingApi(defaultClient);
    String aggInterval = "15m"; // String | 
    List<String> name = Arrays.asList(); // List<String> | 
    List<String> dateRange = Arrays.asList(); // List<String> | 
    List<OffsetDateTime> dateStart = Arrays.asList(); // List<OffsetDateTime> | 
    List<OffsetDateTime> dateEnd = Arrays.asList(); // List<OffsetDateTime> | 
    List<String> arc = Arrays.asList(); // List<String> | 
    List<String> dkim = Arrays.asList(); // List<String> | 
    List<String> spf = Arrays.asList(); // List<String> | 
    List<String> ipVersion = Arrays.asList(); // List<String> | 
    List<String> encrypted = Arrays.asList(); // List<String> | 
    String format = "JSON"; // String | 
    try {
      RadarGetEmailRoutingTimeseriesGroupByArc200Response result = apiInstance.radarGetEmailRoutingTimeseriesGroupByDmarc(aggInterval, name, dateRange, dateStart, dateEnd, arc, dkim, spf, ipVersion, encrypted, format);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling RadarEmailRoutingApi#radarGetEmailRoutingTimeseriesGroupByDmarc");
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
| **arc** | [**List&lt;String&gt;**](String.md)|  | [optional] [enum: PASS, NONE, FAIL] |
| **dkim** | [**List&lt;String&gt;**](String.md)|  | [optional] [enum: PASS, NONE, FAIL] |
| **spf** | [**List&lt;String&gt;**](String.md)|  | [optional] [enum: PASS, NONE, FAIL] |
| **ipVersion** | [**List&lt;String&gt;**](String.md)|  | [optional] [enum: IPv4, IPv6] |
| **encrypted** | [**List&lt;String&gt;**](String.md)|  | [optional] [enum: ENCRYPTED, NOT_ENCRYPTED] |
| **format** | **String**|  | [optional] [enum: JSON, CSV] |

### Return type

[**RadarGetEmailRoutingTimeseriesGroupByArc200Response**](RadarGetEmailRoutingTimeseriesGroupByArc200Response.md)

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

<a id="radarGetEmailRoutingTimeseriesGroupByEncrypted"></a>
# **radarGetEmailRoutingTimeseriesGroupByEncrypted**
> RadarGetEmailRoutingTimeseriesGroupByEncrypted200Response radarGetEmailRoutingTimeseriesGroupByEncrypted(aggInterval, name, dateRange, dateStart, dateEnd, arc, dkim, dmarc, spf, ipVersion, format)

Get Encrypted Time Series

Percentage distribution of emails by Encrypted over time.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.RadarEmailRoutingApi;

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

    RadarEmailRoutingApi apiInstance = new RadarEmailRoutingApi(defaultClient);
    String aggInterval = "15m"; // String | 
    List<String> name = Arrays.asList(); // List<String> | 
    List<String> dateRange = Arrays.asList(); // List<String> | 
    List<OffsetDateTime> dateStart = Arrays.asList(); // List<OffsetDateTime> | 
    List<OffsetDateTime> dateEnd = Arrays.asList(); // List<OffsetDateTime> | 
    List<String> arc = Arrays.asList(); // List<String> | 
    List<String> dkim = Arrays.asList(); // List<String> | 
    List<String> dmarc = Arrays.asList(); // List<String> | 
    List<String> spf = Arrays.asList(); // List<String> | 
    List<String> ipVersion = Arrays.asList(); // List<String> | 
    String format = "JSON"; // String | 
    try {
      RadarGetEmailRoutingTimeseriesGroupByEncrypted200Response result = apiInstance.radarGetEmailRoutingTimeseriesGroupByEncrypted(aggInterval, name, dateRange, dateStart, dateEnd, arc, dkim, dmarc, spf, ipVersion, format);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling RadarEmailRoutingApi#radarGetEmailRoutingTimeseriesGroupByEncrypted");
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
| **arc** | [**List&lt;String&gt;**](String.md)|  | [optional] [enum: PASS, NONE, FAIL] |
| **dkim** | [**List&lt;String&gt;**](String.md)|  | [optional] [enum: PASS, NONE, FAIL] |
| **dmarc** | [**List&lt;String&gt;**](String.md)|  | [optional] [enum: PASS, NONE, FAIL] |
| **spf** | [**List&lt;String&gt;**](String.md)|  | [optional] [enum: PASS, NONE, FAIL] |
| **ipVersion** | [**List&lt;String&gt;**](String.md)|  | [optional] [enum: IPv4, IPv6] |
| **format** | **String**|  | [optional] [enum: JSON, CSV] |

### Return type

[**RadarGetEmailRoutingTimeseriesGroupByEncrypted200Response**](RadarGetEmailRoutingTimeseriesGroupByEncrypted200Response.md)

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

<a id="radarGetEmailRoutingTimeseriesGroupByIpVersion"></a>
# **radarGetEmailRoutingTimeseriesGroupByIpVersion**
> RadarGetEmailRoutingTimeseriesGroupByIpVersion200Response radarGetEmailRoutingTimeseriesGroupByIpVersion(aggInterval, name, dateRange, dateStart, dateEnd, arc, dkim, dmarc, spf, encrypted, format)

Get Ip Version Time Series

Percentage distribution of emails by Ip Version over time.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.RadarEmailRoutingApi;

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

    RadarEmailRoutingApi apiInstance = new RadarEmailRoutingApi(defaultClient);
    String aggInterval = "15m"; // String | 
    List<String> name = Arrays.asList(); // List<String> | 
    List<String> dateRange = Arrays.asList(); // List<String> | 
    List<OffsetDateTime> dateStart = Arrays.asList(); // List<OffsetDateTime> | 
    List<OffsetDateTime> dateEnd = Arrays.asList(); // List<OffsetDateTime> | 
    List<String> arc = Arrays.asList(); // List<String> | 
    List<String> dkim = Arrays.asList(); // List<String> | 
    List<String> dmarc = Arrays.asList(); // List<String> | 
    List<String> spf = Arrays.asList(); // List<String> | 
    List<String> encrypted = Arrays.asList(); // List<String> | 
    String format = "JSON"; // String | 
    try {
      RadarGetEmailRoutingTimeseriesGroupByIpVersion200Response result = apiInstance.radarGetEmailRoutingTimeseriesGroupByIpVersion(aggInterval, name, dateRange, dateStart, dateEnd, arc, dkim, dmarc, spf, encrypted, format);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling RadarEmailRoutingApi#radarGetEmailRoutingTimeseriesGroupByIpVersion");
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
| **arc** | [**List&lt;String&gt;**](String.md)|  | [optional] [enum: PASS, NONE, FAIL] |
| **dkim** | [**List&lt;String&gt;**](String.md)|  | [optional] [enum: PASS, NONE, FAIL] |
| **dmarc** | [**List&lt;String&gt;**](String.md)|  | [optional] [enum: PASS, NONE, FAIL] |
| **spf** | [**List&lt;String&gt;**](String.md)|  | [optional] [enum: PASS, NONE, FAIL] |
| **encrypted** | [**List&lt;String&gt;**](String.md)|  | [optional] [enum: ENCRYPTED, NOT_ENCRYPTED] |
| **format** | **String**|  | [optional] [enum: JSON, CSV] |

### Return type

[**RadarGetEmailRoutingTimeseriesGroupByIpVersion200Response**](RadarGetEmailRoutingTimeseriesGroupByIpVersion200Response.md)

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

<a id="radarGetEmailRoutingTimeseriesGroupBySpf"></a>
# **radarGetEmailRoutingTimeseriesGroupBySpf**
> RadarGetEmailRoutingTimeseriesGroupByArc200Response radarGetEmailRoutingTimeseriesGroupBySpf(aggInterval, name, dateRange, dateStart, dateEnd, arc, dkim, dmarc, ipVersion, encrypted, format)

Get SPF Validations Time Series

Percentage distribution of emails classified per SPF validation over time.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.RadarEmailRoutingApi;

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

    RadarEmailRoutingApi apiInstance = new RadarEmailRoutingApi(defaultClient);
    String aggInterval = "15m"; // String | 
    List<String> name = Arrays.asList(); // List<String> | 
    List<String> dateRange = Arrays.asList(); // List<String> | 
    List<OffsetDateTime> dateStart = Arrays.asList(); // List<OffsetDateTime> | 
    List<OffsetDateTime> dateEnd = Arrays.asList(); // List<OffsetDateTime> | 
    List<String> arc = Arrays.asList(); // List<String> | 
    List<String> dkim = Arrays.asList(); // List<String> | 
    List<String> dmarc = Arrays.asList(); // List<String> | 
    List<String> ipVersion = Arrays.asList(); // List<String> | 
    List<String> encrypted = Arrays.asList(); // List<String> | 
    String format = "JSON"; // String | 
    try {
      RadarGetEmailRoutingTimeseriesGroupByArc200Response result = apiInstance.radarGetEmailRoutingTimeseriesGroupBySpf(aggInterval, name, dateRange, dateStart, dateEnd, arc, dkim, dmarc, ipVersion, encrypted, format);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling RadarEmailRoutingApi#radarGetEmailRoutingTimeseriesGroupBySpf");
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
| **arc** | [**List&lt;String&gt;**](String.md)|  | [optional] [enum: PASS, NONE, FAIL] |
| **dkim** | [**List&lt;String&gt;**](String.md)|  | [optional] [enum: PASS, NONE, FAIL] |
| **dmarc** | [**List&lt;String&gt;**](String.md)|  | [optional] [enum: PASS, NONE, FAIL] |
| **ipVersion** | [**List&lt;String&gt;**](String.md)|  | [optional] [enum: IPv4, IPv6] |
| **encrypted** | [**List&lt;String&gt;**](String.md)|  | [optional] [enum: ENCRYPTED, NOT_ENCRYPTED] |
| **format** | **String**|  | [optional] [enum: JSON, CSV] |

### Return type

[**RadarGetEmailRoutingTimeseriesGroupByArc200Response**](RadarGetEmailRoutingTimeseriesGroupByArc200Response.md)

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

