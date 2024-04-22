# ZoneAnalyticsDeprecatedApi

All URIs are relative to *https://api.cloudflare.com/client/v4*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**zoneAnalyticsDeprecatedGetAnalyticsByCoLocations**](ZoneAnalyticsDeprecatedApi.md#zoneAnalyticsDeprecatedGetAnalyticsByCoLocations) | **GET** /zones/{zone_identifier}/analytics/colos | Get analytics by Co-locations |
| [**zoneAnalyticsDeprecatedGetDashboard**](ZoneAnalyticsDeprecatedApi.md#zoneAnalyticsDeprecatedGetDashboard) | **GET** /zones/{zone_identifier}/analytics/dashboard | Get dashboard |


<a id="zoneAnalyticsDeprecatedGetAnalyticsByCoLocations"></a>
# **zoneAnalyticsDeprecatedGetAnalyticsByCoLocations**
> DataZoneAnalyticsApiColoResponse zoneAnalyticsDeprecatedGetAnalyticsByCoLocations(zoneIdentifier, until, since, continuous)

Get analytics by Co-locations

This view provides a breakdown of analytics data by datacenter. Note: This is available to Enterprise customers only.

### Example
```java
// Import classes:
import cloudflare.ApiClient;
import cloudflare.ApiException;
import cloudflare.Configuration;
import cloudflare.auth.*;
import cloudflare.models.*;
import cloudflare.sdk.ZoneAnalyticsDeprecatedApi;

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

    ZoneAnalyticsDeprecatedApi apiInstance = new ZoneAnalyticsDeprecatedApi(defaultClient);
    String zoneIdentifier = "zoneIdentifier_example"; // String | 
    DataZoneAnalyticsApiUntil until = new DataZoneAnalyticsApiUntil(); // DataZoneAnalyticsApiUntil | 
    ZoneAnalyticsDeprecatedGetAnalyticsByCoLocationsSinceParameter since = new ZoneAnalyticsDeprecatedGetAnalyticsByCoLocationsSinceParameter(); // ZoneAnalyticsDeprecatedGetAnalyticsByCoLocationsSinceParameter | 
    Boolean continuous = true; // Boolean | 
    try {
      DataZoneAnalyticsApiColoResponse result = apiInstance.zoneAnalyticsDeprecatedGetAnalyticsByCoLocations(zoneIdentifier, until, since, continuous);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ZoneAnalyticsDeprecatedApi#zoneAnalyticsDeprecatedGetAnalyticsByCoLocations");
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
| **zoneIdentifier** | **String**|  | |
| **until** | [**DataZoneAnalyticsApiUntil**](.md)|  | [optional] [default to 0] |
| **since** | [**ZoneAnalyticsDeprecatedGetAnalyticsByCoLocationsSinceParameter**](.md)|  | [optional] [default to -10080] |
| **continuous** | **Boolean**|  | [optional] [default to true] |

### Return type

[**DataZoneAnalyticsApiColoResponse**](DataZoneAnalyticsApiColoResponse.md)

### Authorization

[api_key](../README.md#api_key), [api_token](../README.md#api_token), [api_email](../README.md#api_email)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Get analytics by Co-locations response |  -  |
| **4XX** | Get analytics by Co-locations response failure |  -  |

<a id="zoneAnalyticsDeprecatedGetDashboard"></a>
# **zoneAnalyticsDeprecatedGetDashboard**
> DataZoneAnalyticsApiDashboardResponse zoneAnalyticsDeprecatedGetDashboard(zoneIdentifier, until, since, continuous)

Get dashboard

The dashboard view provides both totals and timeseries data for the given zone and time period across the entire Cloudflare network.

### Example
```java
// Import classes:
import cloudflare.ApiClient;
import cloudflare.ApiException;
import cloudflare.Configuration;
import cloudflare.auth.*;
import cloudflare.models.*;
import cloudflare.sdk.ZoneAnalyticsDeprecatedApi;

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

    ZoneAnalyticsDeprecatedApi apiInstance = new ZoneAnalyticsDeprecatedApi(defaultClient);
    String zoneIdentifier = "zoneIdentifier_example"; // String | 
    DataZoneAnalyticsApiUntil until = new DataZoneAnalyticsApiUntil(); // DataZoneAnalyticsApiUntil | 
    ZoneAnalyticsDeprecatedGetAnalyticsByCoLocationsSinceParameter since = new ZoneAnalyticsDeprecatedGetAnalyticsByCoLocationsSinceParameter(); // ZoneAnalyticsDeprecatedGetAnalyticsByCoLocationsSinceParameter | 
    Boolean continuous = true; // Boolean | 
    try {
      DataZoneAnalyticsApiDashboardResponse result = apiInstance.zoneAnalyticsDeprecatedGetDashboard(zoneIdentifier, until, since, continuous);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ZoneAnalyticsDeprecatedApi#zoneAnalyticsDeprecatedGetDashboard");
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
| **zoneIdentifier** | **String**|  | |
| **until** | [**DataZoneAnalyticsApiUntil**](.md)|  | [optional] [default to 0] |
| **since** | [**ZoneAnalyticsDeprecatedGetAnalyticsByCoLocationsSinceParameter**](.md)|  | [optional] [default to -10080] |
| **continuous** | **Boolean**|  | [optional] [default to true] |

### Return type

[**DataZoneAnalyticsApiDashboardResponse**](DataZoneAnalyticsApiDashboardResponse.md)

### Authorization

[api_key](../README.md#api_key), [api_token](../README.md#api_token), [api_email](../README.md#api_email)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Get dashboard response |  -  |
| **4XX** | Get dashboard response failure |  -  |

