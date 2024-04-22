# RadarRankingApi

All URIs are relative to *https://api.cloudflare.com/client/v4*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**radarGetRankingDomainDetails**](RadarRankingApi.md#radarGetRankingDomainDetails) | **GET** /radar/ranking/domain/{domain} | Get Domains Rank details |
| [**radarGetRankingDomainTimeseries**](RadarRankingApi.md#radarGetRankingDomainTimeseries) | **GET** /radar/ranking/timeseries_groups | Get Domains Rank time series |
| [**radarGetRankingTopDomains**](RadarRankingApi.md#radarGetRankingTopDomains) | **GET** /radar/ranking/top | Get Top or Trending Domains |


<a id="radarGetRankingDomainDetails"></a>
# **radarGetRankingDomainDetails**
> RadarGetRankingDomainDetails200Response radarGetRankingDomainDetails(domain, limit, rankingType, name, date, format)

Get Domains Rank details

Gets Domains Rank details.      Cloudflare provides an ordered rank for the top 100 domains, but for the remainder it only provides ranking buckets     like top 200 thousand, top one million, etc.. These are available through Radar datasets endpoints.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.RadarRankingApi;

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

    RadarRankingApi apiInstance = new RadarRankingApi(defaultClient);
    String domain = "google.com"; // String | 
    Integer limit = 5; // Integer | 
    String rankingType = "POPULAR"; // String | 
    List<String> name = Arrays.asList(); // List<String> | 
    List<String> date = Arrays.asList(); // List<String> | 
    String format = "JSON"; // String | 
    try {
      RadarGetRankingDomainDetails200Response result = apiInstance.radarGetRankingDomainDetails(domain, limit, rankingType, name, date, format);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling RadarRankingApi#radarGetRankingDomainDetails");
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
| **domain** | **String**|  | |
| **limit** | **Integer**|  | [optional] |
| **rankingType** | **String**|  | [optional] [default to POPULAR] [enum: POPULAR, TRENDING_RISE, TRENDING_STEADY] |
| **name** | [**List&lt;String&gt;**](String.md)|  | [optional] |
| **date** | [**List&lt;String&gt;**](String.md)|  | [optional] |
| **format** | **String**|  | [optional] [enum: JSON, CSV] |

### Return type

[**RadarGetRankingDomainDetails200Response**](RadarGetRankingDomainDetails200Response.md)

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

<a id="radarGetRankingDomainTimeseries"></a>
# **radarGetRankingDomainTimeseries**
> RadarGetRankingDomainTimeseries200Response radarGetRankingDomainTimeseries(limit, rankingType, name, location, domains, dateRange, dateStart, dateEnd, format)

Get Domains Rank time series

Gets Domains Rank updates change over time. Raw values are returned.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.RadarRankingApi;

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

    RadarRankingApi apiInstance = new RadarRankingApi(defaultClient);
    Integer limit = 5; // Integer | 
    String rankingType = "POPULAR"; // String | 
    List<String> name = Arrays.asList(); // List<String> | 
    List<String> location = Arrays.asList(); // List<String> | 
    List<String> domains = Arrays.asList(); // List<String> | 
    List<String> dateRange = Arrays.asList(); // List<String> | 
    List<OffsetDateTime> dateStart = Arrays.asList(); // List<OffsetDateTime> | 
    List<OffsetDateTime> dateEnd = Arrays.asList(); // List<OffsetDateTime> | 
    String format = "JSON"; // String | 
    try {
      RadarGetRankingDomainTimeseries200Response result = apiInstance.radarGetRankingDomainTimeseries(limit, rankingType, name, location, domains, dateRange, dateStart, dateEnd, format);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling RadarRankingApi#radarGetRankingDomainTimeseries");
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
| **rankingType** | **String**|  | [optional] [default to POPULAR] [enum: POPULAR, TRENDING_RISE, TRENDING_STEADY] |
| **name** | [**List&lt;String&gt;**](String.md)|  | [optional] |
| **location** | [**List&lt;String&gt;**](String.md)|  | [optional] |
| **domains** | [**List&lt;String&gt;**](String.md)|  | [optional] |
| **dateRange** | [**List&lt;String&gt;**](String.md)|  | [optional] [enum: 1d, 2d, 7d, 14d, 28d, 12w, 24w, 52w, 1dControl, 2dControl, 7dControl, 14dControl, 28dControl, 12wControl, 24wControl] |
| **dateStart** | [**List&lt;OffsetDateTime&gt;**](OffsetDateTime.md)|  | [optional] |
| **dateEnd** | [**List&lt;OffsetDateTime&gt;**](OffsetDateTime.md)|  | [optional] |
| **format** | **String**|  | [optional] [enum: JSON, CSV] |

### Return type

[**RadarGetRankingDomainTimeseries200Response**](RadarGetRankingDomainTimeseries200Response.md)

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

<a id="radarGetRankingTopDomains"></a>
# **radarGetRankingTopDomains**
> RadarGetRankingTopDomains200Response radarGetRankingTopDomains(limit, name, location, date, rankingType, format)

Get Top or Trending Domains

Get top or trending domains based on their rank. Popular domains are domains of broad appeal based on how people use the Internet. Trending domains are domains that are generating a surge in interest. For more information on top domains, see https://blog.cloudflare.com/radar-domain-rankings/.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.RadarRankingApi;

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

    RadarRankingApi apiInstance = new RadarRankingApi(defaultClient);
    Integer limit = 5; // Integer | 
    List<String> name = Arrays.asList(); // List<String> | 
    List<String> location = Arrays.asList(); // List<String> | 
    List<String> date = Arrays.asList(); // List<String> | 
    String rankingType = "POPULAR"; // String | 
    String format = "JSON"; // String | 
    try {
      RadarGetRankingTopDomains200Response result = apiInstance.radarGetRankingTopDomains(limit, name, location, date, rankingType, format);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling RadarRankingApi#radarGetRankingTopDomains");
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
| **location** | [**List&lt;String&gt;**](String.md)|  | [optional] |
| **date** | [**List&lt;String&gt;**](String.md)|  | [optional] |
| **rankingType** | **String**|  | [optional] [default to POPULAR] [enum: POPULAR, TRENDING_RISE, TRENDING_STEADY] |
| **format** | **String**|  | [optional] [enum: JSON, CSV] |

### Return type

[**RadarGetRankingTopDomains200Response**](RadarGetRankingTopDomains200Response.md)

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

