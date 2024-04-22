# RadarEmailSecurityApi

All URIs are relative to *https://api.cloudflare.com/client/v4*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**radarGetEmailSecuritySummaryByArc**](RadarEmailSecurityApi.md#radarGetEmailSecuritySummaryByArc) | **GET** /radar/email/security/summary/arc | Get ARC Validations Summary |
| [**radarGetEmailSecuritySummaryByDkim**](RadarEmailSecurityApi.md#radarGetEmailSecuritySummaryByDkim) | **GET** /radar/email/security/summary/dkim | Get DKIM Validations Summary |
| [**radarGetEmailSecuritySummaryByDmarc**](RadarEmailSecurityApi.md#radarGetEmailSecuritySummaryByDmarc) | **GET** /radar/email/security/summary/dmarc | Get DMARC Validations Summary |
| [**radarGetEmailSecuritySummaryByMalicious**](RadarEmailSecurityApi.md#radarGetEmailSecuritySummaryByMalicious) | **GET** /radar/email/security/summary/malicious | Get MALICIOUS Validations Summary |
| [**radarGetEmailSecuritySummaryBySpam**](RadarEmailSecurityApi.md#radarGetEmailSecuritySummaryBySpam) | **GET** /radar/email/security/summary/spam | Get SPAM Summary |
| [**radarGetEmailSecuritySummaryBySpf**](RadarEmailSecurityApi.md#radarGetEmailSecuritySummaryBySpf) | **GET** /radar/email/security/summary/spf | Get SPF Validations Summary |
| [**radarGetEmailSecuritySummaryBySpoof**](RadarEmailSecurityApi.md#radarGetEmailSecuritySummaryBySpoof) | **GET** /radar/email/security/summary/spoof | Get SPOOF Summary |
| [**radarGetEmailSecuritySummaryByThreatCategory**](RadarEmailSecurityApi.md#radarGetEmailSecuritySummaryByThreatCategory) | **GET** /radar/email/security/summary/threat_category | Get Threat Categories Summary |
| [**radarGetEmailSecuritySummaryByTlsVersion**](RadarEmailSecurityApi.md#radarGetEmailSecuritySummaryByTlsVersion) | **GET** /radar/email/security/summary/tls_version | Get TLS Version Summary |
| [**radarGetEmailSecurityTimeseriesGroupByArc**](RadarEmailSecurityApi.md#radarGetEmailSecurityTimeseriesGroupByArc) | **GET** /radar/email/security/timeseries_groups/arc | Get ARC Validations Time Series |
| [**radarGetEmailSecurityTimeseriesGroupByDkim**](RadarEmailSecurityApi.md#radarGetEmailSecurityTimeseriesGroupByDkim) | **GET** /radar/email/security/timeseries_groups/dkim | Get DKIM Validations Time Series |
| [**radarGetEmailSecurityTimeseriesGroupByDmarc**](RadarEmailSecurityApi.md#radarGetEmailSecurityTimeseriesGroupByDmarc) | **GET** /radar/email/security/timeseries_groups/dmarc | Get DMARC Validations Time Series |
| [**radarGetEmailSecurityTimeseriesGroupByMalicious**](RadarEmailSecurityApi.md#radarGetEmailSecurityTimeseriesGroupByMalicious) | **GET** /radar/email/security/timeseries_groups/malicious | Get MALICIOUS Validations Time Series |
| [**radarGetEmailSecurityTimeseriesGroupBySpam**](RadarEmailSecurityApi.md#radarGetEmailSecurityTimeseriesGroupBySpam) | **GET** /radar/email/security/timeseries_groups/spam | Get SPAM Validations Time Series |
| [**radarGetEmailSecurityTimeseriesGroupBySpf**](RadarEmailSecurityApi.md#radarGetEmailSecurityTimeseriesGroupBySpf) | **GET** /radar/email/security/timeseries_groups/spf | Get SPF Validations Time Series |
| [**radarGetEmailSecurityTimeseriesGroupBySpoof**](RadarEmailSecurityApi.md#radarGetEmailSecurityTimeseriesGroupBySpoof) | **GET** /radar/email/security/timeseries_groups/spoof | Get SPOOF Validations Time Series |
| [**radarGetEmailSecurityTimeseriesGroupByThreatCategory**](RadarEmailSecurityApi.md#radarGetEmailSecurityTimeseriesGroupByThreatCategory) | **GET** /radar/email/security/timeseries_groups/threat_category | Get Threat Categories Time Series |
| [**radarGetEmailSecurityTimeseriesGroupByTlsVersion**](RadarEmailSecurityApi.md#radarGetEmailSecurityTimeseriesGroupByTlsVersion) | **GET** /radar/email/security/timeseries_groups/tls_version | Get TLS Version Time Series |
| [**radarGetEmailSecurityTopTldsByMalicious**](RadarEmailSecurityApi.md#radarGetEmailSecurityTopTldsByMalicious) | **GET** /radar/email/security/top/tlds/malicious/{malicious} | Get Top TLDs By Malicious Classification |
| [**radarGetEmailSecurityTopTldsByMessages**](RadarEmailSecurityApi.md#radarGetEmailSecurityTopTldsByMessages) | **GET** /radar/email/security/top/tlds | Get Top TLDs By Email Messages |
| [**radarGetEmailSecurityTopTldsBySpam**](RadarEmailSecurityApi.md#radarGetEmailSecurityTopTldsBySpam) | **GET** /radar/email/security/top/tlds/spam/{spam} | Get Top TLDs By Spam Classification |
| [**radarGetEmailSecurityTopTldsBySpoof**](RadarEmailSecurityApi.md#radarGetEmailSecurityTopTldsBySpoof) | **GET** /radar/email/security/top/tlds/spoof/{spoof} | Get Top TLDs By Spoof Classification |


<a id="radarGetEmailSecuritySummaryByArc"></a>
# **radarGetEmailSecuritySummaryByArc**
> RadarGetEmailRoutingSummaryByArc200Response radarGetEmailSecuritySummaryByArc(name, dateRange, dateStart, dateEnd, dkim, dmarc, spf, tlsVersion, format)

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
import org.openapitools.client.api.RadarEmailSecurityApi;

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

    RadarEmailSecurityApi apiInstance = new RadarEmailSecurityApi(defaultClient);
    List<String> name = Arrays.asList(); // List<String> | 
    List<String> dateRange = Arrays.asList(); // List<String> | 
    List<OffsetDateTime> dateStart = Arrays.asList(); // List<OffsetDateTime> | 
    List<OffsetDateTime> dateEnd = Arrays.asList(); // List<OffsetDateTime> | 
    List<String> dkim = Arrays.asList(); // List<String> | 
    List<String> dmarc = Arrays.asList(); // List<String> | 
    List<String> spf = Arrays.asList(); // List<String> | 
    List<String> tlsVersion = Arrays.asList(); // List<String> | 
    String format = "JSON"; // String | 
    try {
      RadarGetEmailRoutingSummaryByArc200Response result = apiInstance.radarGetEmailSecuritySummaryByArc(name, dateRange, dateStart, dateEnd, dkim, dmarc, spf, tlsVersion, format);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling RadarEmailSecurityApi#radarGetEmailSecuritySummaryByArc");
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
| **tlsVersion** | [**List&lt;String&gt;**](String.md)|  | [optional] [enum: TLSv1_0, TLSv1_1, TLSv1_2, TLSv1_3] |
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

<a id="radarGetEmailSecuritySummaryByDkim"></a>
# **radarGetEmailSecuritySummaryByDkim**
> RadarGetEmailRoutingSummaryByArc200Response radarGetEmailSecuritySummaryByDkim(name, dateRange, dateStart, dateEnd, arc, dmarc, spf, tlsVersion, format)

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
import org.openapitools.client.api.RadarEmailSecurityApi;

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

    RadarEmailSecurityApi apiInstance = new RadarEmailSecurityApi(defaultClient);
    List<String> name = Arrays.asList(); // List<String> | 
    List<String> dateRange = Arrays.asList(); // List<String> | 
    List<OffsetDateTime> dateStart = Arrays.asList(); // List<OffsetDateTime> | 
    List<OffsetDateTime> dateEnd = Arrays.asList(); // List<OffsetDateTime> | 
    List<String> arc = Arrays.asList(); // List<String> | 
    List<String> dmarc = Arrays.asList(); // List<String> | 
    List<String> spf = Arrays.asList(); // List<String> | 
    List<String> tlsVersion = Arrays.asList(); // List<String> | 
    String format = "JSON"; // String | 
    try {
      RadarGetEmailRoutingSummaryByArc200Response result = apiInstance.radarGetEmailSecuritySummaryByDkim(name, dateRange, dateStart, dateEnd, arc, dmarc, spf, tlsVersion, format);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling RadarEmailSecurityApi#radarGetEmailSecuritySummaryByDkim");
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
| **tlsVersion** | [**List&lt;String&gt;**](String.md)|  | [optional] [enum: TLSv1_0, TLSv1_1, TLSv1_2, TLSv1_3] |
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

<a id="radarGetEmailSecuritySummaryByDmarc"></a>
# **radarGetEmailSecuritySummaryByDmarc**
> RadarGetEmailRoutingSummaryByArc200Response radarGetEmailSecuritySummaryByDmarc(name, dateRange, dateStart, dateEnd, arc, dkim, spf, tlsVersion, format)

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
import org.openapitools.client.api.RadarEmailSecurityApi;

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

    RadarEmailSecurityApi apiInstance = new RadarEmailSecurityApi(defaultClient);
    List<String> name = Arrays.asList(); // List<String> | 
    List<String> dateRange = Arrays.asList(); // List<String> | 
    List<OffsetDateTime> dateStart = Arrays.asList(); // List<OffsetDateTime> | 
    List<OffsetDateTime> dateEnd = Arrays.asList(); // List<OffsetDateTime> | 
    List<String> arc = Arrays.asList(); // List<String> | 
    List<String> dkim = Arrays.asList(); // List<String> | 
    List<String> spf = Arrays.asList(); // List<String> | 
    List<String> tlsVersion = Arrays.asList(); // List<String> | 
    String format = "JSON"; // String | 
    try {
      RadarGetEmailRoutingSummaryByArc200Response result = apiInstance.radarGetEmailSecuritySummaryByDmarc(name, dateRange, dateStart, dateEnd, arc, dkim, spf, tlsVersion, format);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling RadarEmailSecurityApi#radarGetEmailSecuritySummaryByDmarc");
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
| **tlsVersion** | [**List&lt;String&gt;**](String.md)|  | [optional] [enum: TLSv1_0, TLSv1_1, TLSv1_2, TLSv1_3] |
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

<a id="radarGetEmailSecuritySummaryByMalicious"></a>
# **radarGetEmailSecuritySummaryByMalicious**
> RadarGetEmailSecuritySummaryByMalicious200Response radarGetEmailSecuritySummaryByMalicious(name, dateRange, dateStart, dateEnd, arc, dkim, dmarc, spf, tlsVersion, format)

Get MALICIOUS Validations Summary

Percentage distribution of emails classified as MALICIOUS.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.RadarEmailSecurityApi;

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

    RadarEmailSecurityApi apiInstance = new RadarEmailSecurityApi(defaultClient);
    List<String> name = Arrays.asList(); // List<String> | 
    List<String> dateRange = Arrays.asList(); // List<String> | 
    List<OffsetDateTime> dateStart = Arrays.asList(); // List<OffsetDateTime> | 
    List<OffsetDateTime> dateEnd = Arrays.asList(); // List<OffsetDateTime> | 
    List<String> arc = Arrays.asList(); // List<String> | 
    List<String> dkim = Arrays.asList(); // List<String> | 
    List<String> dmarc = Arrays.asList(); // List<String> | 
    List<String> spf = Arrays.asList(); // List<String> | 
    List<String> tlsVersion = Arrays.asList(); // List<String> | 
    String format = "JSON"; // String | 
    try {
      RadarGetEmailSecuritySummaryByMalicious200Response result = apiInstance.radarGetEmailSecuritySummaryByMalicious(name, dateRange, dateStart, dateEnd, arc, dkim, dmarc, spf, tlsVersion, format);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling RadarEmailSecurityApi#radarGetEmailSecuritySummaryByMalicious");
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
| **tlsVersion** | [**List&lt;String&gt;**](String.md)|  | [optional] [enum: TLSv1_0, TLSv1_1, TLSv1_2, TLSv1_3] |
| **format** | **String**|  | [optional] [enum: JSON, CSV] |

### Return type

[**RadarGetEmailSecuritySummaryByMalicious200Response**](RadarGetEmailSecuritySummaryByMalicious200Response.md)

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

<a id="radarGetEmailSecuritySummaryBySpam"></a>
# **radarGetEmailSecuritySummaryBySpam**
> RadarGetEmailSecuritySummaryBySpam200Response radarGetEmailSecuritySummaryBySpam(name, dateRange, dateStart, dateEnd, arc, dkim, dmarc, spf, tlsVersion, format)

Get SPAM Summary

Proportion of emails categorized as either spam or legitimate (non-spam).

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.RadarEmailSecurityApi;

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

    RadarEmailSecurityApi apiInstance = new RadarEmailSecurityApi(defaultClient);
    List<String> name = Arrays.asList(); // List<String> | 
    List<String> dateRange = Arrays.asList(); // List<String> | 
    List<OffsetDateTime> dateStart = Arrays.asList(); // List<OffsetDateTime> | 
    List<OffsetDateTime> dateEnd = Arrays.asList(); // List<OffsetDateTime> | 
    List<String> arc = Arrays.asList(); // List<String> | 
    List<String> dkim = Arrays.asList(); // List<String> | 
    List<String> dmarc = Arrays.asList(); // List<String> | 
    List<String> spf = Arrays.asList(); // List<String> | 
    List<String> tlsVersion = Arrays.asList(); // List<String> | 
    String format = "JSON"; // String | 
    try {
      RadarGetEmailSecuritySummaryBySpam200Response result = apiInstance.radarGetEmailSecuritySummaryBySpam(name, dateRange, dateStart, dateEnd, arc, dkim, dmarc, spf, tlsVersion, format);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling RadarEmailSecurityApi#radarGetEmailSecuritySummaryBySpam");
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
| **tlsVersion** | [**List&lt;String&gt;**](String.md)|  | [optional] [enum: TLSv1_0, TLSv1_1, TLSv1_2, TLSv1_3] |
| **format** | **String**|  | [optional] [enum: JSON, CSV] |

### Return type

[**RadarGetEmailSecuritySummaryBySpam200Response**](RadarGetEmailSecuritySummaryBySpam200Response.md)

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

<a id="radarGetEmailSecuritySummaryBySpf"></a>
# **radarGetEmailSecuritySummaryBySpf**
> RadarGetEmailRoutingSummaryByArc200Response radarGetEmailSecuritySummaryBySpf(name, dateRange, dateStart, dateEnd, arc, dkim, dmarc, tlsVersion, format)

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
import org.openapitools.client.api.RadarEmailSecurityApi;

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

    RadarEmailSecurityApi apiInstance = new RadarEmailSecurityApi(defaultClient);
    List<String> name = Arrays.asList(); // List<String> | 
    List<String> dateRange = Arrays.asList(); // List<String> | 
    List<OffsetDateTime> dateStart = Arrays.asList(); // List<OffsetDateTime> | 
    List<OffsetDateTime> dateEnd = Arrays.asList(); // List<OffsetDateTime> | 
    List<String> arc = Arrays.asList(); // List<String> | 
    List<String> dkim = Arrays.asList(); // List<String> | 
    List<String> dmarc = Arrays.asList(); // List<String> | 
    List<String> tlsVersion = Arrays.asList(); // List<String> | 
    String format = "JSON"; // String | 
    try {
      RadarGetEmailRoutingSummaryByArc200Response result = apiInstance.radarGetEmailSecuritySummaryBySpf(name, dateRange, dateStart, dateEnd, arc, dkim, dmarc, tlsVersion, format);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling RadarEmailSecurityApi#radarGetEmailSecuritySummaryBySpf");
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
| **tlsVersion** | [**List&lt;String&gt;**](String.md)|  | [optional] [enum: TLSv1_0, TLSv1_1, TLSv1_2, TLSv1_3] |
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

<a id="radarGetEmailSecuritySummaryBySpoof"></a>
# **radarGetEmailSecuritySummaryBySpoof**
> RadarGetEmailSecuritySummaryBySpoof200Response radarGetEmailSecuritySummaryBySpoof(name, dateRange, dateStart, dateEnd, arc, dkim, dmarc, spf, tlsVersion, format)

Get SPOOF Summary

Proportion of emails categorized as either spoof or legitimate (non-spoof).

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.RadarEmailSecurityApi;

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

    RadarEmailSecurityApi apiInstance = new RadarEmailSecurityApi(defaultClient);
    List<String> name = Arrays.asList(); // List<String> | 
    List<String> dateRange = Arrays.asList(); // List<String> | 
    List<OffsetDateTime> dateStart = Arrays.asList(); // List<OffsetDateTime> | 
    List<OffsetDateTime> dateEnd = Arrays.asList(); // List<OffsetDateTime> | 
    List<String> arc = Arrays.asList(); // List<String> | 
    List<String> dkim = Arrays.asList(); // List<String> | 
    List<String> dmarc = Arrays.asList(); // List<String> | 
    List<String> spf = Arrays.asList(); // List<String> | 
    List<String> tlsVersion = Arrays.asList(); // List<String> | 
    String format = "JSON"; // String | 
    try {
      RadarGetEmailSecuritySummaryBySpoof200Response result = apiInstance.radarGetEmailSecuritySummaryBySpoof(name, dateRange, dateStart, dateEnd, arc, dkim, dmarc, spf, tlsVersion, format);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling RadarEmailSecurityApi#radarGetEmailSecuritySummaryBySpoof");
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
| **tlsVersion** | [**List&lt;String&gt;**](String.md)|  | [optional] [enum: TLSv1_0, TLSv1_1, TLSv1_2, TLSv1_3] |
| **format** | **String**|  | [optional] [enum: JSON, CSV] |

### Return type

[**RadarGetEmailSecuritySummaryBySpoof200Response**](RadarGetEmailSecuritySummaryBySpoof200Response.md)

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

<a id="radarGetEmailSecuritySummaryByThreatCategory"></a>
# **radarGetEmailSecuritySummaryByThreatCategory**
> RadarGetEmailSecuritySummaryByThreatCategory200Response radarGetEmailSecuritySummaryByThreatCategory(name, dateRange, dateStart, dateEnd, arc, dkim, dmarc, spf, tlsVersion, format)

Get Threat Categories Summary

Percentage distribution of emails classified in Threat Categories.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.RadarEmailSecurityApi;

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

    RadarEmailSecurityApi apiInstance = new RadarEmailSecurityApi(defaultClient);
    List<String> name = Arrays.asList(); // List<String> | 
    List<String> dateRange = Arrays.asList(); // List<String> | 
    List<OffsetDateTime> dateStart = Arrays.asList(); // List<OffsetDateTime> | 
    List<OffsetDateTime> dateEnd = Arrays.asList(); // List<OffsetDateTime> | 
    List<String> arc = Arrays.asList(); // List<String> | 
    List<String> dkim = Arrays.asList(); // List<String> | 
    List<String> dmarc = Arrays.asList(); // List<String> | 
    List<String> spf = Arrays.asList(); // List<String> | 
    List<String> tlsVersion = Arrays.asList(); // List<String> | 
    String format = "JSON"; // String | 
    try {
      RadarGetEmailSecuritySummaryByThreatCategory200Response result = apiInstance.radarGetEmailSecuritySummaryByThreatCategory(name, dateRange, dateStart, dateEnd, arc, dkim, dmarc, spf, tlsVersion, format);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling RadarEmailSecurityApi#radarGetEmailSecuritySummaryByThreatCategory");
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
| **tlsVersion** | [**List&lt;String&gt;**](String.md)|  | [optional] [enum: TLSv1_0, TLSv1_1, TLSv1_2, TLSv1_3] |
| **format** | **String**|  | [optional] [enum: JSON, CSV] |

### Return type

[**RadarGetEmailSecuritySummaryByThreatCategory200Response**](RadarGetEmailSecuritySummaryByThreatCategory200Response.md)

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

<a id="radarGetEmailSecuritySummaryByTlsVersion"></a>
# **radarGetEmailSecuritySummaryByTlsVersion**
> RadarGetEmailSecuritySummaryByTlsVersion200Response radarGetEmailSecuritySummaryByTlsVersion(name, dateRange, dateStart, dateEnd, arc, dkim, dmarc, spf, format)

Get TLS Version Summary

Percentage distribution of emails classified per TLS Version.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.RadarEmailSecurityApi;

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

    RadarEmailSecurityApi apiInstance = new RadarEmailSecurityApi(defaultClient);
    List<String> name = Arrays.asList(); // List<String> | 
    List<String> dateRange = Arrays.asList(); // List<String> | 
    List<OffsetDateTime> dateStart = Arrays.asList(); // List<OffsetDateTime> | 
    List<OffsetDateTime> dateEnd = Arrays.asList(); // List<OffsetDateTime> | 
    List<String> arc = Arrays.asList(); // List<String> | 
    List<String> dkim = Arrays.asList(); // List<String> | 
    List<String> dmarc = Arrays.asList(); // List<String> | 
    List<String> spf = Arrays.asList(); // List<String> | 
    String format = "JSON"; // String | 
    try {
      RadarGetEmailSecuritySummaryByTlsVersion200Response result = apiInstance.radarGetEmailSecuritySummaryByTlsVersion(name, dateRange, dateStart, dateEnd, arc, dkim, dmarc, spf, format);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling RadarEmailSecurityApi#radarGetEmailSecuritySummaryByTlsVersion");
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
| **format** | **String**|  | [optional] [enum: JSON, CSV] |

### Return type

[**RadarGetEmailSecuritySummaryByTlsVersion200Response**](RadarGetEmailSecuritySummaryByTlsVersion200Response.md)

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

<a id="radarGetEmailSecurityTimeseriesGroupByArc"></a>
# **radarGetEmailSecurityTimeseriesGroupByArc**
> RadarGetEmailRoutingTimeseriesGroupByArc200Response radarGetEmailSecurityTimeseriesGroupByArc(aggInterval, name, dateRange, dateStart, dateEnd, dkim, dmarc, spf, tlsVersion, format)

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
import org.openapitools.client.api.RadarEmailSecurityApi;

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

    RadarEmailSecurityApi apiInstance = new RadarEmailSecurityApi(defaultClient);
    String aggInterval = "15m"; // String | 
    List<String> name = Arrays.asList(); // List<String> | 
    List<String> dateRange = Arrays.asList(); // List<String> | 
    List<OffsetDateTime> dateStart = Arrays.asList(); // List<OffsetDateTime> | 
    List<OffsetDateTime> dateEnd = Arrays.asList(); // List<OffsetDateTime> | 
    List<String> dkim = Arrays.asList(); // List<String> | 
    List<String> dmarc = Arrays.asList(); // List<String> | 
    List<String> spf = Arrays.asList(); // List<String> | 
    List<String> tlsVersion = Arrays.asList(); // List<String> | 
    String format = "JSON"; // String | 
    try {
      RadarGetEmailRoutingTimeseriesGroupByArc200Response result = apiInstance.radarGetEmailSecurityTimeseriesGroupByArc(aggInterval, name, dateRange, dateStart, dateEnd, dkim, dmarc, spf, tlsVersion, format);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling RadarEmailSecurityApi#radarGetEmailSecurityTimeseriesGroupByArc");
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
| **tlsVersion** | [**List&lt;String&gt;**](String.md)|  | [optional] [enum: TLSv1_0, TLSv1_1, TLSv1_2, TLSv1_3] |
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

<a id="radarGetEmailSecurityTimeseriesGroupByDkim"></a>
# **radarGetEmailSecurityTimeseriesGroupByDkim**
> RadarGetEmailRoutingTimeseriesGroupByArc200Response radarGetEmailSecurityTimeseriesGroupByDkim(aggInterval, name, dateRange, dateStart, dateEnd, arc, dmarc, spf, tlsVersion, format)

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
import org.openapitools.client.api.RadarEmailSecurityApi;

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

    RadarEmailSecurityApi apiInstance = new RadarEmailSecurityApi(defaultClient);
    String aggInterval = "15m"; // String | 
    List<String> name = Arrays.asList(); // List<String> | 
    List<String> dateRange = Arrays.asList(); // List<String> | 
    List<OffsetDateTime> dateStart = Arrays.asList(); // List<OffsetDateTime> | 
    List<OffsetDateTime> dateEnd = Arrays.asList(); // List<OffsetDateTime> | 
    List<String> arc = Arrays.asList(); // List<String> | 
    List<String> dmarc = Arrays.asList(); // List<String> | 
    List<String> spf = Arrays.asList(); // List<String> | 
    List<String> tlsVersion = Arrays.asList(); // List<String> | 
    String format = "JSON"; // String | 
    try {
      RadarGetEmailRoutingTimeseriesGroupByArc200Response result = apiInstance.radarGetEmailSecurityTimeseriesGroupByDkim(aggInterval, name, dateRange, dateStart, dateEnd, arc, dmarc, spf, tlsVersion, format);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling RadarEmailSecurityApi#radarGetEmailSecurityTimeseriesGroupByDkim");
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
| **tlsVersion** | [**List&lt;String&gt;**](String.md)|  | [optional] [enum: TLSv1_0, TLSv1_1, TLSv1_2, TLSv1_3] |
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

<a id="radarGetEmailSecurityTimeseriesGroupByDmarc"></a>
# **radarGetEmailSecurityTimeseriesGroupByDmarc**
> RadarGetEmailRoutingTimeseriesGroupByArc200Response radarGetEmailSecurityTimeseriesGroupByDmarc(aggInterval, name, dateRange, dateStart, dateEnd, arc, dkim, spf, tlsVersion, format)

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
import org.openapitools.client.api.RadarEmailSecurityApi;

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

    RadarEmailSecurityApi apiInstance = new RadarEmailSecurityApi(defaultClient);
    String aggInterval = "15m"; // String | 
    List<String> name = Arrays.asList(); // List<String> | 
    List<String> dateRange = Arrays.asList(); // List<String> | 
    List<OffsetDateTime> dateStart = Arrays.asList(); // List<OffsetDateTime> | 
    List<OffsetDateTime> dateEnd = Arrays.asList(); // List<OffsetDateTime> | 
    List<String> arc = Arrays.asList(); // List<String> | 
    List<String> dkim = Arrays.asList(); // List<String> | 
    List<String> spf = Arrays.asList(); // List<String> | 
    List<String> tlsVersion = Arrays.asList(); // List<String> | 
    String format = "JSON"; // String | 
    try {
      RadarGetEmailRoutingTimeseriesGroupByArc200Response result = apiInstance.radarGetEmailSecurityTimeseriesGroupByDmarc(aggInterval, name, dateRange, dateStart, dateEnd, arc, dkim, spf, tlsVersion, format);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling RadarEmailSecurityApi#radarGetEmailSecurityTimeseriesGroupByDmarc");
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
| **tlsVersion** | [**List&lt;String&gt;**](String.md)|  | [optional] [enum: TLSv1_0, TLSv1_1, TLSv1_2, TLSv1_3] |
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

<a id="radarGetEmailSecurityTimeseriesGroupByMalicious"></a>
# **radarGetEmailSecurityTimeseriesGroupByMalicious**
> RadarGetEmailSecurityTimeseriesGroupByMalicious200Response radarGetEmailSecurityTimeseriesGroupByMalicious(aggInterval, name, dateRange, dateStart, dateEnd, arc, dkim, dmarc, spf, tlsVersion, format)

Get MALICIOUS Validations Time Series

Percentage distribution of emails classified as MALICIOUS over time.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.RadarEmailSecurityApi;

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

    RadarEmailSecurityApi apiInstance = new RadarEmailSecurityApi(defaultClient);
    String aggInterval = "15m"; // String | 
    List<String> name = Arrays.asList(); // List<String> | 
    List<String> dateRange = Arrays.asList(); // List<String> | 
    List<OffsetDateTime> dateStart = Arrays.asList(); // List<OffsetDateTime> | 
    List<OffsetDateTime> dateEnd = Arrays.asList(); // List<OffsetDateTime> | 
    List<String> arc = Arrays.asList(); // List<String> | 
    List<String> dkim = Arrays.asList(); // List<String> | 
    List<String> dmarc = Arrays.asList(); // List<String> | 
    List<String> spf = Arrays.asList(); // List<String> | 
    List<String> tlsVersion = Arrays.asList(); // List<String> | 
    String format = "JSON"; // String | 
    try {
      RadarGetEmailSecurityTimeseriesGroupByMalicious200Response result = apiInstance.radarGetEmailSecurityTimeseriesGroupByMalicious(aggInterval, name, dateRange, dateStart, dateEnd, arc, dkim, dmarc, spf, tlsVersion, format);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling RadarEmailSecurityApi#radarGetEmailSecurityTimeseriesGroupByMalicious");
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
| **tlsVersion** | [**List&lt;String&gt;**](String.md)|  | [optional] [enum: TLSv1_0, TLSv1_1, TLSv1_2, TLSv1_3] |
| **format** | **String**|  | [optional] [enum: JSON, CSV] |

### Return type

[**RadarGetEmailSecurityTimeseriesGroupByMalicious200Response**](RadarGetEmailSecurityTimeseriesGroupByMalicious200Response.md)

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

<a id="radarGetEmailSecurityTimeseriesGroupBySpam"></a>
# **radarGetEmailSecurityTimeseriesGroupBySpam**
> RadarGetEmailSecurityTimeseriesGroupBySpam200Response radarGetEmailSecurityTimeseriesGroupBySpam(aggInterval, name, dateRange, dateStart, dateEnd, arc, dkim, dmarc, spf, tlsVersion, format)

Get SPAM Validations Time Series

Percentage distribution of emails classified as SPAM over time.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.RadarEmailSecurityApi;

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

    RadarEmailSecurityApi apiInstance = new RadarEmailSecurityApi(defaultClient);
    String aggInterval = "15m"; // String | 
    List<String> name = Arrays.asList(); // List<String> | 
    List<String> dateRange = Arrays.asList(); // List<String> | 
    List<OffsetDateTime> dateStart = Arrays.asList(); // List<OffsetDateTime> | 
    List<OffsetDateTime> dateEnd = Arrays.asList(); // List<OffsetDateTime> | 
    List<String> arc = Arrays.asList(); // List<String> | 
    List<String> dkim = Arrays.asList(); // List<String> | 
    List<String> dmarc = Arrays.asList(); // List<String> | 
    List<String> spf = Arrays.asList(); // List<String> | 
    List<String> tlsVersion = Arrays.asList(); // List<String> | 
    String format = "JSON"; // String | 
    try {
      RadarGetEmailSecurityTimeseriesGroupBySpam200Response result = apiInstance.radarGetEmailSecurityTimeseriesGroupBySpam(aggInterval, name, dateRange, dateStart, dateEnd, arc, dkim, dmarc, spf, tlsVersion, format);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling RadarEmailSecurityApi#radarGetEmailSecurityTimeseriesGroupBySpam");
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
| **tlsVersion** | [**List&lt;String&gt;**](String.md)|  | [optional] [enum: TLSv1_0, TLSv1_1, TLSv1_2, TLSv1_3] |
| **format** | **String**|  | [optional] [enum: JSON, CSV] |

### Return type

[**RadarGetEmailSecurityTimeseriesGroupBySpam200Response**](RadarGetEmailSecurityTimeseriesGroupBySpam200Response.md)

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

<a id="radarGetEmailSecurityTimeseriesGroupBySpf"></a>
# **radarGetEmailSecurityTimeseriesGroupBySpf**
> RadarGetEmailRoutingTimeseriesGroupByArc200Response radarGetEmailSecurityTimeseriesGroupBySpf(aggInterval, name, dateRange, dateStart, dateEnd, arc, dkim, dmarc, tlsVersion, format)

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
import org.openapitools.client.api.RadarEmailSecurityApi;

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

    RadarEmailSecurityApi apiInstance = new RadarEmailSecurityApi(defaultClient);
    String aggInterval = "15m"; // String | 
    List<String> name = Arrays.asList(); // List<String> | 
    List<String> dateRange = Arrays.asList(); // List<String> | 
    List<OffsetDateTime> dateStart = Arrays.asList(); // List<OffsetDateTime> | 
    List<OffsetDateTime> dateEnd = Arrays.asList(); // List<OffsetDateTime> | 
    List<String> arc = Arrays.asList(); // List<String> | 
    List<String> dkim = Arrays.asList(); // List<String> | 
    List<String> dmarc = Arrays.asList(); // List<String> | 
    List<String> tlsVersion = Arrays.asList(); // List<String> | 
    String format = "JSON"; // String | 
    try {
      RadarGetEmailRoutingTimeseriesGroupByArc200Response result = apiInstance.radarGetEmailSecurityTimeseriesGroupBySpf(aggInterval, name, dateRange, dateStart, dateEnd, arc, dkim, dmarc, tlsVersion, format);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling RadarEmailSecurityApi#radarGetEmailSecurityTimeseriesGroupBySpf");
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
| **tlsVersion** | [**List&lt;String&gt;**](String.md)|  | [optional] [enum: TLSv1_0, TLSv1_1, TLSv1_2, TLSv1_3] |
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

<a id="radarGetEmailSecurityTimeseriesGroupBySpoof"></a>
# **radarGetEmailSecurityTimeseriesGroupBySpoof**
> RadarGetEmailSecurityTimeseriesGroupBySpoof200Response radarGetEmailSecurityTimeseriesGroupBySpoof(aggInterval, name, dateRange, dateStart, dateEnd, arc, dkim, dmarc, spf, tlsVersion, format)

Get SPOOF Validations Time Series

Percentage distribution of emails classified as SPOOF over time.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.RadarEmailSecurityApi;

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

    RadarEmailSecurityApi apiInstance = new RadarEmailSecurityApi(defaultClient);
    String aggInterval = "15m"; // String | 
    List<String> name = Arrays.asList(); // List<String> | 
    List<String> dateRange = Arrays.asList(); // List<String> | 
    List<OffsetDateTime> dateStart = Arrays.asList(); // List<OffsetDateTime> | 
    List<OffsetDateTime> dateEnd = Arrays.asList(); // List<OffsetDateTime> | 
    List<String> arc = Arrays.asList(); // List<String> | 
    List<String> dkim = Arrays.asList(); // List<String> | 
    List<String> dmarc = Arrays.asList(); // List<String> | 
    List<String> spf = Arrays.asList(); // List<String> | 
    List<String> tlsVersion = Arrays.asList(); // List<String> | 
    String format = "JSON"; // String | 
    try {
      RadarGetEmailSecurityTimeseriesGroupBySpoof200Response result = apiInstance.radarGetEmailSecurityTimeseriesGroupBySpoof(aggInterval, name, dateRange, dateStart, dateEnd, arc, dkim, dmarc, spf, tlsVersion, format);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling RadarEmailSecurityApi#radarGetEmailSecurityTimeseriesGroupBySpoof");
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
| **tlsVersion** | [**List&lt;String&gt;**](String.md)|  | [optional] [enum: TLSv1_0, TLSv1_1, TLSv1_2, TLSv1_3] |
| **format** | **String**|  | [optional] [enum: JSON, CSV] |

### Return type

[**RadarGetEmailSecurityTimeseriesGroupBySpoof200Response**](RadarGetEmailSecurityTimeseriesGroupBySpoof200Response.md)

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

<a id="radarGetEmailSecurityTimeseriesGroupByThreatCategory"></a>
# **radarGetEmailSecurityTimeseriesGroupByThreatCategory**
> RadarGetEmailSecurityTimeseriesGroupByThreatCategory200Response radarGetEmailSecurityTimeseriesGroupByThreatCategory(aggInterval, name, dateRange, dateStart, dateEnd, arc, dkim, dmarc, spf, tlsVersion, format)

Get Threat Categories Time Series

Percentage distribution of emails classified in Threat Categories over time.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.RadarEmailSecurityApi;

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

    RadarEmailSecurityApi apiInstance = new RadarEmailSecurityApi(defaultClient);
    String aggInterval = "15m"; // String | 
    List<String> name = Arrays.asList(); // List<String> | 
    List<String> dateRange = Arrays.asList(); // List<String> | 
    List<OffsetDateTime> dateStart = Arrays.asList(); // List<OffsetDateTime> | 
    List<OffsetDateTime> dateEnd = Arrays.asList(); // List<OffsetDateTime> | 
    List<String> arc = Arrays.asList(); // List<String> | 
    List<String> dkim = Arrays.asList(); // List<String> | 
    List<String> dmarc = Arrays.asList(); // List<String> | 
    List<String> spf = Arrays.asList(); // List<String> | 
    List<String> tlsVersion = Arrays.asList(); // List<String> | 
    String format = "JSON"; // String | 
    try {
      RadarGetEmailSecurityTimeseriesGroupByThreatCategory200Response result = apiInstance.radarGetEmailSecurityTimeseriesGroupByThreatCategory(aggInterval, name, dateRange, dateStart, dateEnd, arc, dkim, dmarc, spf, tlsVersion, format);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling RadarEmailSecurityApi#radarGetEmailSecurityTimeseriesGroupByThreatCategory");
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
| **tlsVersion** | [**List&lt;String&gt;**](String.md)|  | [optional] [enum: TLSv1_0, TLSv1_1, TLSv1_2, TLSv1_3] |
| **format** | **String**|  | [optional] [enum: JSON, CSV] |

### Return type

[**RadarGetEmailSecurityTimeseriesGroupByThreatCategory200Response**](RadarGetEmailSecurityTimeseriesGroupByThreatCategory200Response.md)

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

<a id="radarGetEmailSecurityTimeseriesGroupByTlsVersion"></a>
# **radarGetEmailSecurityTimeseriesGroupByTlsVersion**
> RadarGetEmailSecurityTimeseriesGroupByTlsVersion200Response radarGetEmailSecurityTimeseriesGroupByTlsVersion(aggInterval, name, dateRange, dateStart, dateEnd, arc, dkim, dmarc, spf, format)

Get TLS Version Time Series

Percentage distribution of emails classified per TLS Version over time.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.RadarEmailSecurityApi;

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

    RadarEmailSecurityApi apiInstance = new RadarEmailSecurityApi(defaultClient);
    String aggInterval = "15m"; // String | 
    List<String> name = Arrays.asList(); // List<String> | 
    List<String> dateRange = Arrays.asList(); // List<String> | 
    List<OffsetDateTime> dateStart = Arrays.asList(); // List<OffsetDateTime> | 
    List<OffsetDateTime> dateEnd = Arrays.asList(); // List<OffsetDateTime> | 
    List<String> arc = Arrays.asList(); // List<String> | 
    List<String> dkim = Arrays.asList(); // List<String> | 
    List<String> dmarc = Arrays.asList(); // List<String> | 
    List<String> spf = Arrays.asList(); // List<String> | 
    String format = "JSON"; // String | 
    try {
      RadarGetEmailSecurityTimeseriesGroupByTlsVersion200Response result = apiInstance.radarGetEmailSecurityTimeseriesGroupByTlsVersion(aggInterval, name, dateRange, dateStart, dateEnd, arc, dkim, dmarc, spf, format);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling RadarEmailSecurityApi#radarGetEmailSecurityTimeseriesGroupByTlsVersion");
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
| **format** | **String**|  | [optional] [enum: JSON, CSV] |

### Return type

[**RadarGetEmailSecurityTimeseriesGroupByTlsVersion200Response**](RadarGetEmailSecurityTimeseriesGroupByTlsVersion200Response.md)

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

<a id="radarGetEmailSecurityTopTldsByMalicious"></a>
# **radarGetEmailSecurityTopTldsByMalicious**
> RadarGetEmailSecurityTopTldsByMessages200Response radarGetEmailSecurityTopTldsByMalicious(malicious, limit, name, dateRange, dateStart, dateEnd, arc, dkim, dmarc, spf, tlsVersion, tldCategory, format)

Get Top TLDs By Malicious Classification

Get the TLDs by emails classified as malicious or not.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.RadarEmailSecurityApi;

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

    RadarEmailSecurityApi apiInstance = new RadarEmailSecurityApi(defaultClient);
    String malicious = "MALICIOUS"; // String | 
    Integer limit = 5; // Integer | 
    List<String> name = Arrays.asList(); // List<String> | 
    List<String> dateRange = Arrays.asList(); // List<String> | 
    List<OffsetDateTime> dateStart = Arrays.asList(); // List<OffsetDateTime> | 
    List<OffsetDateTime> dateEnd = Arrays.asList(); // List<OffsetDateTime> | 
    List<String> arc = Arrays.asList(); // List<String> | 
    List<String> dkim = Arrays.asList(); // List<String> | 
    List<String> dmarc = Arrays.asList(); // List<String> | 
    List<String> spf = Arrays.asList(); // List<String> | 
    List<String> tlsVersion = Arrays.asList(); // List<String> | 
    String tldCategory = "CLASSIC"; // String | 
    String format = "JSON"; // String | 
    try {
      RadarGetEmailSecurityTopTldsByMessages200Response result = apiInstance.radarGetEmailSecurityTopTldsByMalicious(malicious, limit, name, dateRange, dateStart, dateEnd, arc, dkim, dmarc, spf, tlsVersion, tldCategory, format);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling RadarEmailSecurityApi#radarGetEmailSecurityTopTldsByMalicious");
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
| **malicious** | **String**|  | [enum: MALICIOUS, NOT_MALICIOUS] |
| **limit** | **Integer**|  | [optional] |
| **name** | [**List&lt;String&gt;**](String.md)|  | [optional] |
| **dateRange** | [**List&lt;String&gt;**](String.md)|  | [optional] [enum: 1d, 2d, 7d, 14d, 28d, 12w, 24w, 52w, 1dControl, 2dControl, 7dControl, 14dControl, 28dControl, 12wControl, 24wControl] |
| **dateStart** | [**List&lt;OffsetDateTime&gt;**](OffsetDateTime.md)|  | [optional] |
| **dateEnd** | [**List&lt;OffsetDateTime&gt;**](OffsetDateTime.md)|  | [optional] |
| **arc** | [**List&lt;String&gt;**](String.md)|  | [optional] [enum: PASS, NONE, FAIL] |
| **dkim** | [**List&lt;String&gt;**](String.md)|  | [optional] [enum: PASS, NONE, FAIL] |
| **dmarc** | [**List&lt;String&gt;**](String.md)|  | [optional] [enum: PASS, NONE, FAIL] |
| **spf** | [**List&lt;String&gt;**](String.md)|  | [optional] [enum: PASS, NONE, FAIL] |
| **tlsVersion** | [**List&lt;String&gt;**](String.md)|  | [optional] [enum: TLSv1_0, TLSv1_1, TLSv1_2, TLSv1_3] |
| **tldCategory** | **String**|  | [optional] [enum: CLASSIC, COUNTRY] |
| **format** | **String**|  | [optional] [enum: JSON, CSV] |

### Return type

[**RadarGetEmailSecurityTopTldsByMessages200Response**](RadarGetEmailSecurityTopTldsByMessages200Response.md)

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

<a id="radarGetEmailSecurityTopTldsByMessages"></a>
# **radarGetEmailSecurityTopTldsByMessages**
> RadarGetEmailSecurityTopTldsByMessages200Response radarGetEmailSecurityTopTldsByMessages(limit, name, dateRange, dateStart, dateEnd, arc, dkim, dmarc, spf, tlsVersion, tldCategory, format)

Get Top TLDs By Email Messages

Get the top TLDs by email messages. Values are a percentage out of the total emails.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.RadarEmailSecurityApi;

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

    RadarEmailSecurityApi apiInstance = new RadarEmailSecurityApi(defaultClient);
    Integer limit = 5; // Integer | 
    List<String> name = Arrays.asList(); // List<String> | 
    List<String> dateRange = Arrays.asList(); // List<String> | 
    List<OffsetDateTime> dateStart = Arrays.asList(); // List<OffsetDateTime> | 
    List<OffsetDateTime> dateEnd = Arrays.asList(); // List<OffsetDateTime> | 
    List<String> arc = Arrays.asList(); // List<String> | 
    List<String> dkim = Arrays.asList(); // List<String> | 
    List<String> dmarc = Arrays.asList(); // List<String> | 
    List<String> spf = Arrays.asList(); // List<String> | 
    List<String> tlsVersion = Arrays.asList(); // List<String> | 
    String tldCategory = "CLASSIC"; // String | 
    String format = "JSON"; // String | 
    try {
      RadarGetEmailSecurityTopTldsByMessages200Response result = apiInstance.radarGetEmailSecurityTopTldsByMessages(limit, name, dateRange, dateStart, dateEnd, arc, dkim, dmarc, spf, tlsVersion, tldCategory, format);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling RadarEmailSecurityApi#radarGetEmailSecurityTopTldsByMessages");
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
| **arc** | [**List&lt;String&gt;**](String.md)|  | [optional] [enum: PASS, NONE, FAIL] |
| **dkim** | [**List&lt;String&gt;**](String.md)|  | [optional] [enum: PASS, NONE, FAIL] |
| **dmarc** | [**List&lt;String&gt;**](String.md)|  | [optional] [enum: PASS, NONE, FAIL] |
| **spf** | [**List&lt;String&gt;**](String.md)|  | [optional] [enum: PASS, NONE, FAIL] |
| **tlsVersion** | [**List&lt;String&gt;**](String.md)|  | [optional] [enum: TLSv1_0, TLSv1_1, TLSv1_2, TLSv1_3] |
| **tldCategory** | **String**|  | [optional] [enum: CLASSIC, COUNTRY] |
| **format** | **String**|  | [optional] [enum: JSON, CSV] |

### Return type

[**RadarGetEmailSecurityTopTldsByMessages200Response**](RadarGetEmailSecurityTopTldsByMessages200Response.md)

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

<a id="radarGetEmailSecurityTopTldsBySpam"></a>
# **radarGetEmailSecurityTopTldsBySpam**
> RadarGetEmailSecurityTopTldsByMessages200Response radarGetEmailSecurityTopTldsBySpam(spam, limit, name, dateRange, dateStart, dateEnd, arc, dkim, dmarc, spf, tlsVersion, tldCategory, format)

Get Top TLDs By Spam Classification

Get the top TLDs by emails classified as Spam or not.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.RadarEmailSecurityApi;

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

    RadarEmailSecurityApi apiInstance = new RadarEmailSecurityApi(defaultClient);
    String spam = "SPAM"; // String | 
    Integer limit = 5; // Integer | 
    List<String> name = Arrays.asList(); // List<String> | 
    List<String> dateRange = Arrays.asList(); // List<String> | 
    List<OffsetDateTime> dateStart = Arrays.asList(); // List<OffsetDateTime> | 
    List<OffsetDateTime> dateEnd = Arrays.asList(); // List<OffsetDateTime> | 
    List<String> arc = Arrays.asList(); // List<String> | 
    List<String> dkim = Arrays.asList(); // List<String> | 
    List<String> dmarc = Arrays.asList(); // List<String> | 
    List<String> spf = Arrays.asList(); // List<String> | 
    List<String> tlsVersion = Arrays.asList(); // List<String> | 
    String tldCategory = "CLASSIC"; // String | 
    String format = "JSON"; // String | 
    try {
      RadarGetEmailSecurityTopTldsByMessages200Response result = apiInstance.radarGetEmailSecurityTopTldsBySpam(spam, limit, name, dateRange, dateStart, dateEnd, arc, dkim, dmarc, spf, tlsVersion, tldCategory, format);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling RadarEmailSecurityApi#radarGetEmailSecurityTopTldsBySpam");
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
| **spam** | **String**|  | [enum: SPAM, NOT_SPAM] |
| **limit** | **Integer**|  | [optional] |
| **name** | [**List&lt;String&gt;**](String.md)|  | [optional] |
| **dateRange** | [**List&lt;String&gt;**](String.md)|  | [optional] [enum: 1d, 2d, 7d, 14d, 28d, 12w, 24w, 52w, 1dControl, 2dControl, 7dControl, 14dControl, 28dControl, 12wControl, 24wControl] |
| **dateStart** | [**List&lt;OffsetDateTime&gt;**](OffsetDateTime.md)|  | [optional] |
| **dateEnd** | [**List&lt;OffsetDateTime&gt;**](OffsetDateTime.md)|  | [optional] |
| **arc** | [**List&lt;String&gt;**](String.md)|  | [optional] [enum: PASS, NONE, FAIL] |
| **dkim** | [**List&lt;String&gt;**](String.md)|  | [optional] [enum: PASS, NONE, FAIL] |
| **dmarc** | [**List&lt;String&gt;**](String.md)|  | [optional] [enum: PASS, NONE, FAIL] |
| **spf** | [**List&lt;String&gt;**](String.md)|  | [optional] [enum: PASS, NONE, FAIL] |
| **tlsVersion** | [**List&lt;String&gt;**](String.md)|  | [optional] [enum: TLSv1_0, TLSv1_1, TLSv1_2, TLSv1_3] |
| **tldCategory** | **String**|  | [optional] [enum: CLASSIC, COUNTRY] |
| **format** | **String**|  | [optional] [enum: JSON, CSV] |

### Return type

[**RadarGetEmailSecurityTopTldsByMessages200Response**](RadarGetEmailSecurityTopTldsByMessages200Response.md)

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

<a id="radarGetEmailSecurityTopTldsBySpoof"></a>
# **radarGetEmailSecurityTopTldsBySpoof**
> RadarGetEmailSecurityTopTldsByMessages200Response radarGetEmailSecurityTopTldsBySpoof(spoof, limit, name, dateRange, dateStart, dateEnd, arc, dkim, dmarc, spf, tlsVersion, tldCategory, format)

Get Top TLDs By Spoof Classification

Get the TLDs by emails classified as spoof or not.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.RadarEmailSecurityApi;

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

    RadarEmailSecurityApi apiInstance = new RadarEmailSecurityApi(defaultClient);
    String spoof = "SPOOF"; // String | 
    Integer limit = 5; // Integer | 
    List<String> name = Arrays.asList(); // List<String> | 
    List<String> dateRange = Arrays.asList(); // List<String> | 
    List<OffsetDateTime> dateStart = Arrays.asList(); // List<OffsetDateTime> | 
    List<OffsetDateTime> dateEnd = Arrays.asList(); // List<OffsetDateTime> | 
    List<String> arc = Arrays.asList(); // List<String> | 
    List<String> dkim = Arrays.asList(); // List<String> | 
    List<String> dmarc = Arrays.asList(); // List<String> | 
    List<String> spf = Arrays.asList(); // List<String> | 
    List<String> tlsVersion = Arrays.asList(); // List<String> | 
    String tldCategory = "CLASSIC"; // String | 
    String format = "JSON"; // String | 
    try {
      RadarGetEmailSecurityTopTldsByMessages200Response result = apiInstance.radarGetEmailSecurityTopTldsBySpoof(spoof, limit, name, dateRange, dateStart, dateEnd, arc, dkim, dmarc, spf, tlsVersion, tldCategory, format);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling RadarEmailSecurityApi#radarGetEmailSecurityTopTldsBySpoof");
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
| **spoof** | **String**|  | [enum: SPOOF, NOT_SPOOF] |
| **limit** | **Integer**|  | [optional] |
| **name** | [**List&lt;String&gt;**](String.md)|  | [optional] |
| **dateRange** | [**List&lt;String&gt;**](String.md)|  | [optional] [enum: 1d, 2d, 7d, 14d, 28d, 12w, 24w, 52w, 1dControl, 2dControl, 7dControl, 14dControl, 28dControl, 12wControl, 24wControl] |
| **dateStart** | [**List&lt;OffsetDateTime&gt;**](OffsetDateTime.md)|  | [optional] |
| **dateEnd** | [**List&lt;OffsetDateTime&gt;**](OffsetDateTime.md)|  | [optional] |
| **arc** | [**List&lt;String&gt;**](String.md)|  | [optional] [enum: PASS, NONE, FAIL] |
| **dkim** | [**List&lt;String&gt;**](String.md)|  | [optional] [enum: PASS, NONE, FAIL] |
| **dmarc** | [**List&lt;String&gt;**](String.md)|  | [optional] [enum: PASS, NONE, FAIL] |
| **spf** | [**List&lt;String&gt;**](String.md)|  | [optional] [enum: PASS, NONE, FAIL] |
| **tlsVersion** | [**List&lt;String&gt;**](String.md)|  | [optional] [enum: TLSv1_0, TLSv1_1, TLSv1_2, TLSv1_3] |
| **tldCategory** | **String**|  | [optional] [enum: CLASSIC, COUNTRY] |
| **format** | **String**|  | [optional] [enum: JSON, CSV] |

### Return type

[**RadarGetEmailSecurityTopTldsByMessages200Response**](RadarGetEmailSecurityTopTldsByMessages200Response.md)

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

