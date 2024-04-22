# SpectrumAggregateAnalyticsApi

All URIs are relative to *https://api.cloudflare.com/client/v4*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**spectrumAggregateAnalyticsGetCurrentAggregatedAnalytics**](SpectrumAggregateAnalyticsApi.md#spectrumAggregateAnalyticsGetCurrentAggregatedAnalytics) | **GET** /zones/{zone}/spectrum/analytics/aggregate/current | Get current aggregated analytics |


<a id="spectrumAggregateAnalyticsGetCurrentAggregatedAnalytics"></a>
# **spectrumAggregateAnalyticsGetCurrentAggregatedAnalytics**
> LegacyJhsSchemasResponseCollection spectrumAggregateAnalyticsGetCurrentAggregatedAnalytics(zone, appID, appIdParam, coloName)

Get current aggregated analytics

Retrieves analytics aggregated from the last minute of usage on Spectrum applications underneath a given zone.

### Example
```java
// Import classes:
import cloudflare.ApiClient;
import cloudflare.ApiException;
import cloudflare.Configuration;
import cloudflare.auth.*;
import cloudflare.models.*;
import cloudflare.sdk.SpectrumAggregateAnalyticsApi;

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

    SpectrumAggregateAnalyticsApi apiInstance = new SpectrumAggregateAnalyticsApi(defaultClient);
    String zone = "zone_example"; // String | 
    String appID = "appID_example"; // String | 
    String appIdParam = "appIdParam_example"; // String | 
    String coloName = "PDX"; // String | 
    try {
      LegacyJhsSchemasResponseCollection result = apiInstance.spectrumAggregateAnalyticsGetCurrentAggregatedAnalytics(zone, appID, appIdParam, coloName);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling SpectrumAggregateAnalyticsApi#spectrumAggregateAnalyticsGetCurrentAggregatedAnalytics");
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
| **appID** | **String**|  | [optional] |
| **appIdParam** | **String**|  | [optional] |
| **coloName** | **String**|  | [optional] |

### Return type

[**LegacyJhsSchemasResponseCollection**](LegacyJhsSchemasResponseCollection.md)

### Authorization

[api_key](../README.md#api_key), [api_token](../README.md#api_token), [api_email](../README.md#api_email)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Get current aggregated analytics response |  -  |
| **4XX** | Get current aggregated analytics response failure |  -  |

