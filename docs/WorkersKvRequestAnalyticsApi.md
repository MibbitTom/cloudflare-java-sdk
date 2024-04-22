# WorkersKvRequestAnalyticsApi

All URIs are relative to *https://api.cloudflare.com/client/v4*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**workersKvRequestAnalyticsQueryRequestAnalytics**](WorkersKvRequestAnalyticsApi.md#workersKvRequestAnalyticsQueryRequestAnalytics) | **GET** /accounts/{account_id}/storage/analytics | Query Request Analytics |


<a id="workersKvRequestAnalyticsQueryRequestAnalytics"></a>
# **workersKvRequestAnalyticsQueryRequestAnalytics**
> WorkersKvRequestAnalyticsQueryRequestAnalytics200Response workersKvRequestAnalyticsQueryRequestAnalytics(accountId, query)

Query Request Analytics

Retrieves Workers KV request metrics for the given account.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.WorkersKvRequestAnalyticsApi;

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

    WorkersKvRequestAnalyticsApi apiInstance = new WorkersKvRequestAnalyticsApi(defaultClient);
    String accountId = "accountId_example"; // String | 
    WorkersKvRequestAnalyticsQueryRequestAnalyticsQueryParameter query = new WorkersKvRequestAnalyticsQueryRequestAnalyticsQueryParameter(); // WorkersKvRequestAnalyticsQueryRequestAnalyticsQueryParameter | 
    try {
      WorkersKvRequestAnalyticsQueryRequestAnalytics200Response result = apiInstance.workersKvRequestAnalyticsQueryRequestAnalytics(accountId, query);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling WorkersKvRequestAnalyticsApi#workersKvRequestAnalyticsQueryRequestAnalytics");
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
| **query** | [**WorkersKvRequestAnalyticsQueryRequestAnalyticsQueryParameter**](.md)|  | [optional] |

### Return type

[**WorkersKvRequestAnalyticsQueryRequestAnalytics200Response**](WorkersKvRequestAnalyticsQueryRequestAnalytics200Response.md)

### Authorization

[api_key](../README.md#api_key), [api_token](../README.md#api_token), [api_email](../README.md#api_email)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Query Request Analytics response |  -  |
| **4XX** | Query Request Analytics response failure |  -  |

