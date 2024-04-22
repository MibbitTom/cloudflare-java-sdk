# InstantLogsJobsForAZoneApi

All URIs are relative to *https://api.cloudflare.com/client/v4*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**getZonesZoneIdentifierLogpushEdgeJobs**](InstantLogsJobsForAZoneApi.md#getZonesZoneIdentifierLogpushEdgeJobs) | **GET** /zones/{zone_id}/logpush/edge | List Instant Logs jobs |
| [**postZonesZoneIdentifierLogpushEdgeJobs**](InstantLogsJobsForAZoneApi.md#postZonesZoneIdentifierLogpushEdgeJobs) | **POST** /zones/{zone_id}/logpush/edge | Create Instant Logs job |


<a id="getZonesZoneIdentifierLogpushEdgeJobs"></a>
# **getZonesZoneIdentifierLogpushEdgeJobs**
> LogpushInstantLogsJobResponseCollection getZonesZoneIdentifierLogpushEdgeJobs(zoneId)

List Instant Logs jobs

Lists Instant Logs jobs for a zone.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.InstantLogsJobsForAZoneApi;

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

    InstantLogsJobsForAZoneApi apiInstance = new InstantLogsJobsForAZoneApi(defaultClient);
    String zoneId = "zoneId_example"; // String | 
    try {
      LogpushInstantLogsJobResponseCollection result = apiInstance.getZonesZoneIdentifierLogpushEdgeJobs(zoneId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling InstantLogsJobsForAZoneApi#getZonesZoneIdentifierLogpushEdgeJobs");
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
| **zoneId** | **String**|  | |

### Return type

[**LogpushInstantLogsJobResponseCollection**](LogpushInstantLogsJobResponseCollection.md)

### Authorization

[api_key](../README.md#api_key), [api_email](../README.md#api_email)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | List Instant Logs jobs response |  -  |
| **4XX** | List Instant Logs jobs response failure |  -  |

<a id="postZonesZoneIdentifierLogpushEdgeJobs"></a>
# **postZonesZoneIdentifierLogpushEdgeJobs**
> LogpushInstantLogsJobResponseSingle postZonesZoneIdentifierLogpushEdgeJobs(zoneId, postZonesZoneIdentifierLogpushEdgeJobsRequest)

Create Instant Logs job

Creates a new Instant Logs job for a zone.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.InstantLogsJobsForAZoneApi;

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

    InstantLogsJobsForAZoneApi apiInstance = new InstantLogsJobsForAZoneApi(defaultClient);
    String zoneId = "zoneId_example"; // String | 
    PostZonesZoneIdentifierLogpushEdgeJobsRequest postZonesZoneIdentifierLogpushEdgeJobsRequest = new PostZonesZoneIdentifierLogpushEdgeJobsRequest(); // PostZonesZoneIdentifierLogpushEdgeJobsRequest | 
    try {
      LogpushInstantLogsJobResponseSingle result = apiInstance.postZonesZoneIdentifierLogpushEdgeJobs(zoneId, postZonesZoneIdentifierLogpushEdgeJobsRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling InstantLogsJobsForAZoneApi#postZonesZoneIdentifierLogpushEdgeJobs");
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
| **zoneId** | **String**|  | |
| **postZonesZoneIdentifierLogpushEdgeJobsRequest** | [**PostZonesZoneIdentifierLogpushEdgeJobsRequest**](PostZonesZoneIdentifierLogpushEdgeJobsRequest.md)|  | |

### Return type

[**LogpushInstantLogsJobResponseSingle**](LogpushInstantLogsJobResponseSingle.md)

### Authorization

[api_key](../README.md#api_key), [api_email](../README.md#api_email)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Create Instant Logs job response |  -  |
| **4XX** | Create Instant Logs job response failure |  -  |

