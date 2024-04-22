# LoadBalancerHealthcheckEventsApi

All URIs are relative to *https://api.cloudflare.com/client/v4*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**loadBalancerHealthcheckEventsListHealthcheckEvents**](LoadBalancerHealthcheckEventsApi.md#loadBalancerHealthcheckEventsListHealthcheckEvents) | **GET** /user/load_balancing_analytics/events | List Healthcheck Events |


<a id="loadBalancerHealthcheckEventsListHealthcheckEvents"></a>
# **loadBalancerHealthcheckEventsListHealthcheckEvents**
> LoadBalancingComponentsSchemasResponseCollection loadBalancerHealthcheckEventsListHealthcheckEvents(until, poolName, originHealthy, poolId, since, originName, poolHealthy)

List Healthcheck Events

List origin health changes.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.LoadBalancerHealthcheckEventsApi;

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

    LoadBalancerHealthcheckEventsApi apiInstance = new LoadBalancerHealthcheckEventsApi(defaultClient);
    OffsetDateTime until = OffsetDateTime.now(); // OffsetDateTime | 
    String poolName = "poolName_example"; // String | 
    Boolean originHealthy = true; // Boolean | 
    String poolId = "poolId_example"; // String | 
    OffsetDateTime since = OffsetDateTime.parse("2016-11-11T12:00Z"); // OffsetDateTime | 
    String originName = "primary-dc-1"; // String | 
    Boolean poolHealthy = true; // Boolean | 
    try {
      LoadBalancingComponentsSchemasResponseCollection result = apiInstance.loadBalancerHealthcheckEventsListHealthcheckEvents(until, poolName, originHealthy, poolId, since, originName, poolHealthy);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling LoadBalancerHealthcheckEventsApi#loadBalancerHealthcheckEventsListHealthcheckEvents");
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
| **until** | **OffsetDateTime**|  | [optional] |
| **poolName** | **String**|  | [optional] |
| **originHealthy** | **Boolean**|  | [optional] [default to true] |
| **poolId** | **String**|  | [optional] |
| **since** | **OffsetDateTime**|  | [optional] |
| **originName** | **String**|  | [optional] |
| **poolHealthy** | **Boolean**|  | [optional] [default to true] |

### Return type

[**LoadBalancingComponentsSchemasResponseCollection**](LoadBalancingComponentsSchemasResponseCollection.md)

### Authorization

[api_key](../README.md#api_key), [api_token](../README.md#api_token), [api_email](../README.md#api_email)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | List Healthcheck Events response |  -  |
| **4XX** | List Healthcheck Events response failure |  -  |

