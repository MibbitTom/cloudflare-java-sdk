# SpectrumAnalyticsByTimeApi

All URIs are relative to *https://api.cloudflare.com/client/v4*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**spectrumAnalyticsByTimeGetAnalyticsByTime**](SpectrumAnalyticsByTimeApi.md#spectrumAnalyticsByTimeGetAnalyticsByTime) | **GET** /zones/{zone}/spectrum/analytics/events/bytime | Get analytics by time |


<a id="spectrumAnalyticsByTimeGetAnalyticsByTime"></a>
# **spectrumAnalyticsByTimeGetAnalyticsByTime**
> LegacyJhsApiResponseSingle spectrumAnalyticsByTimeGetAnalyticsByTime(zone, dimensions, sort, until, metrics, filters, since, timeDelta)

Get analytics by time

Retrieves a list of aggregate metrics grouped by time interval.

### Example
```java
// Import classes:
import cloudflare.ApiClient;
import cloudflare.ApiException;
import cloudflare.Configuration;
import cloudflare.auth.*;
import cloudflare.models.*;
import cloudflare.sdk.SpectrumAnalyticsByTimeApi;

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

    SpectrumAnalyticsByTimeApi apiInstance = new SpectrumAnalyticsByTimeApi(defaultClient);
    String zone = "zone_example"; // String | 
    List<String> dimensions = Arrays.asList(); // List<String> | 
    List<Object> sort = null; // List<Object> | 
    OffsetDateTime until = OffsetDateTime.now(); // OffsetDateTime | 
    List<String> metrics = Arrays.asList(); // List<String> | 
    String filters = "event==disconnect%20AND%20coloName!=SFO"; // String | 
    OffsetDateTime since = OffsetDateTime.parse("2014-01-02T02:20Z"); // OffsetDateTime | 
    String timeDelta = "year"; // String | 
    try {
      LegacyJhsApiResponseSingle result = apiInstance.spectrumAnalyticsByTimeGetAnalyticsByTime(zone, dimensions, sort, until, metrics, filters, since, timeDelta);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling SpectrumAnalyticsByTimeApi#spectrumAnalyticsByTimeGetAnalyticsByTime");
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
| **zone** | **String**|  | |
| **dimensions** | [**List&lt;String&gt;**](String.md)|  | [optional] [enum: event, appID, coloName, ipVersion] |
| **sort** | [**List&lt;Object&gt;**](Object.md)|  | [optional] |
| **until** | **OffsetDateTime**|  | [optional] |
| **metrics** | [**List&lt;String&gt;**](String.md)|  | [optional] [enum: count, bytesIngress, bytesEgress, durationAvg, durationMedian, duration90th, duration99th] |
| **filters** | **String**|  | [optional] |
| **since** | **OffsetDateTime**|  | [optional] |
| **timeDelta** | **String**|  | [optional] [enum: year, quarter, month, week, day, hour, dekaminute, minute] |

### Return type

[**LegacyJhsApiResponseSingle**](LegacyJhsApiResponseSingle.md)

### Authorization

[api_key](../README.md#api_key), [api_token](../README.md#api_token), [api_email](../README.md#api_email)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Get analytics by time response |  -  |
| **4XX** | Get analytics by time response failure |  -  |

