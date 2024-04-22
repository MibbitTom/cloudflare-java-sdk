# DnsFirewallAnalyticsApi

All URIs are relative to *https://api.cloudflare.com/client/v4*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**dnsFirewallAnalyticsByTime**](DnsFirewallAnalyticsApi.md#dnsFirewallAnalyticsByTime) | **GET** /accounts/{account_id}/dns_firewall/{dns_firewall_id}/dns_analytics/report/bytime | By Time |
| [**dnsFirewallAnalyticsTable**](DnsFirewallAnalyticsApi.md#dnsFirewallAnalyticsTable) | **GET** /accounts/{account_id}/dns_firewall/{dns_firewall_id}/dns_analytics/report | Table |


<a id="dnsFirewallAnalyticsByTime"></a>
# **dnsFirewallAnalyticsByTime**
> DnsFirewallAnalyticsByTime200Response dnsFirewallAnalyticsByTime(dnsFirewallId, accountId, metrics, dimensions, since, until, limit, sort, filters, timeDelta)

By Time

Retrieves a list of aggregate metrics grouped by time interval.  See [Analytics API properties](https://developers.cloudflare.com/dns/reference/analytics-api-properties/) for detailed information about the available query parameters.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.DnsFirewallAnalyticsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.cloudflare.com/client/v4");
    
    // Configure API key authorization: api_key
    ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
    api_key.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //api_key.setApiKeyPrefix("Token");

    // Configure API key authorization: api_email
    ApiKeyAuth api_email = (ApiKeyAuth) defaultClient.getAuthentication("api_email");
    api_email.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //api_email.setApiKeyPrefix("Token");

    DnsFirewallAnalyticsApi apiInstance = new DnsFirewallAnalyticsApi(defaultClient);
    String dnsFirewallId = "dnsFirewallId_example"; // String | 
    String accountId = "accountId_example"; // String | 
    String metrics = "metrics_example"; // String | 
    String dimensions = "dimensions_example"; // String | 
    OffsetDateTime since = OffsetDateTime.now(); // OffsetDateTime | 
    OffsetDateTime until = OffsetDateTime.now(); // OffsetDateTime | 
    Integer limit = 100000; // Integer | 
    String sort = "sort_example"; // String | 
    String filters = "filters_example"; // String | 
    DnsAnalyticsTimeDelta timeDelta = DnsAnalyticsTimeDelta.fromValue("all"); // DnsAnalyticsTimeDelta | 
    try {
      DnsFirewallAnalyticsByTime200Response result = apiInstance.dnsFirewallAnalyticsByTime(dnsFirewallId, accountId, metrics, dimensions, since, until, limit, sort, filters, timeDelta);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling DnsFirewallAnalyticsApi#dnsFirewallAnalyticsByTime");
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
| **dnsFirewallId** | **String**|  | |
| **accountId** | **String**|  | |
| **metrics** | **String**|  | [optional] |
| **dimensions** | **String**|  | [optional] |
| **since** | **OffsetDateTime**|  | [optional] |
| **until** | **OffsetDateTime**|  | [optional] |
| **limit** | **Integer**|  | [optional] [default to 100000] |
| **sort** | **String**|  | [optional] |
| **filters** | **String**|  | [optional] |
| **timeDelta** | [**DnsAnalyticsTimeDelta**](.md)|  | [optional] [enum: all, auto, year, quarter, month, week, day, hour, dekaminute, minute] |

### Return type

[**DnsFirewallAnalyticsByTime200Response**](DnsFirewallAnalyticsByTime200Response.md)

### Authorization

[api_key](../README.md#api_key), [api_email](../README.md#api_email)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | By Time response |  -  |
| **4XX** | By Time response failure |  -  |

<a id="dnsFirewallAnalyticsTable"></a>
# **dnsFirewallAnalyticsTable**
> DnsFirewallAnalyticsTable200Response dnsFirewallAnalyticsTable(dnsFirewallId, accountId, metrics, dimensions, since, until, limit, sort, filters)

Table

Retrieves a list of summarised aggregate metrics over a given time period.  See [Analytics API properties](https://developers.cloudflare.com/dns/reference/analytics-api-properties/) for detailed information about the available query parameters.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.DnsFirewallAnalyticsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.cloudflare.com/client/v4");
    
    // Configure API key authorization: api_key
    ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
    api_key.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //api_key.setApiKeyPrefix("Token");

    // Configure API key authorization: api_email
    ApiKeyAuth api_email = (ApiKeyAuth) defaultClient.getAuthentication("api_email");
    api_email.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //api_email.setApiKeyPrefix("Token");

    DnsFirewallAnalyticsApi apiInstance = new DnsFirewallAnalyticsApi(defaultClient);
    String dnsFirewallId = "dnsFirewallId_example"; // String | 
    String accountId = "accountId_example"; // String | 
    String metrics = "metrics_example"; // String | 
    String dimensions = "dimensions_example"; // String | 
    OffsetDateTime since = OffsetDateTime.now(); // OffsetDateTime | 
    OffsetDateTime until = OffsetDateTime.now(); // OffsetDateTime | 
    Integer limit = 100000; // Integer | 
    String sort = "sort_example"; // String | 
    String filters = "filters_example"; // String | 
    try {
      DnsFirewallAnalyticsTable200Response result = apiInstance.dnsFirewallAnalyticsTable(dnsFirewallId, accountId, metrics, dimensions, since, until, limit, sort, filters);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling DnsFirewallAnalyticsApi#dnsFirewallAnalyticsTable");
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
| **dnsFirewallId** | **String**|  | |
| **accountId** | **String**|  | |
| **metrics** | **String**|  | [optional] |
| **dimensions** | **String**|  | [optional] |
| **since** | **OffsetDateTime**|  | [optional] |
| **until** | **OffsetDateTime**|  | [optional] |
| **limit** | **Integer**|  | [optional] [default to 100000] |
| **sort** | **String**|  | [optional] |
| **filters** | **String**|  | [optional] |

### Return type

[**DnsFirewallAnalyticsTable200Response**](DnsFirewallAnalyticsTable200Response.md)

### Authorization

[api_key](../README.md#api_key), [api_email](../README.md#api_email)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Table response |  -  |
| **4XX** | Table response failure |  -  |

