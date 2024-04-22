# WorkersKvStoredDataAnalyticsApi

All URIs are relative to *https://api.cloudflare.com/client/v4*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**workersKvStoredDataAnalyticsQueryStoredDataAnalytics**](WorkersKvStoredDataAnalyticsApi.md#workersKvStoredDataAnalyticsQueryStoredDataAnalytics) | **GET** /accounts/{account_id}/storage/analytics/stored | Query Stored Data Analytics |


<a id="workersKvStoredDataAnalyticsQueryStoredDataAnalytics"></a>
# **workersKvStoredDataAnalyticsQueryStoredDataAnalytics**
> WorkersKvStoredDataAnalyticsQueryStoredDataAnalytics200Response workersKvStoredDataAnalyticsQueryStoredDataAnalytics(accountId, query)

Query Stored Data Analytics

Retrieves Workers KV stored data metrics for the given account.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.WorkersKvStoredDataAnalyticsApi;

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

    WorkersKvStoredDataAnalyticsApi apiInstance = new WorkersKvStoredDataAnalyticsApi(defaultClient);
    String accountId = "accountId_example"; // String | 
    WorkersKvStoredDataAnalyticsQueryStoredDataAnalyticsQueryParameter query = new WorkersKvStoredDataAnalyticsQueryStoredDataAnalyticsQueryParameter(); // WorkersKvStoredDataAnalyticsQueryStoredDataAnalyticsQueryParameter | 
    try {
      WorkersKvStoredDataAnalyticsQueryStoredDataAnalytics200Response result = apiInstance.workersKvStoredDataAnalyticsQueryStoredDataAnalytics(accountId, query);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling WorkersKvStoredDataAnalyticsApi#workersKvStoredDataAnalyticsQueryStoredDataAnalytics");
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
| **accountId** | **String**|  | |
| **query** | [**WorkersKvStoredDataAnalyticsQueryStoredDataAnalyticsQueryParameter**](.md)|  | [optional] |

### Return type

[**WorkersKvStoredDataAnalyticsQueryStoredDataAnalytics200Response**](WorkersKvStoredDataAnalyticsQueryStoredDataAnalytics200Response.md)

### Authorization

[api_key](../README.md#api_key), [api_token](../README.md#api_token), [api_email](../README.md#api_email)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Query Stored Data Analytics response |  -  |
| **4XX** | Query Stored Data Analytics response failure |  -  |

