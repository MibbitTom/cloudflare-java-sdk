# R2EventNotificationApi

All URIs are relative to *https://api.cloudflare.com/client/v4*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**eventNotificationCreateQueueConfig**](R2EventNotificationApi.md#eventNotificationCreateQueueConfig) | **PUT** /accounts/{account_id}/event_notifications/r2/{bucket_name}/configuration/queues/{queue_id} | Create Configuration |
| [**eventNotificationDeleteQueueConfig**](R2EventNotificationApi.md#eventNotificationDeleteQueueConfig) | **DELETE** /accounts/{account_id}/event_notifications/r2/{bucket_name}/configuration/queues/{queue_id} | Delete Configuration |
| [**eventNotificationGetR2BucketConfigs**](R2EventNotificationApi.md#eventNotificationGetR2BucketConfigs) | **GET** /accounts/{account_id}/event_notifications/r2/{bucket_name}/configuration | Read Configuration |


<a id="eventNotificationCreateQueueConfig"></a>
# **eventNotificationCreateQueueConfig**
> EventNotificationCreateQueueConfig200Response eventNotificationCreateQueueConfig(queueId, bucketName, accountId, eventNotificationCreateQueueConfigRequest)

Create Configuration

Define the rules for a given queue which will determine event notification production.

### Example
```java
// Import classes:
import cloudflare.ApiClient;
import cloudflare.ApiException;
import cloudflare.Configuration;
import cloudflare.auth.*;
import cloudflare.models.*;
import cloudflare.sdk.R2EventNotificationApi;

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

    R2EventNotificationApi apiInstance = new R2EventNotificationApi(defaultClient);
    String queueId = "queueId_example"; // String | 
    String bucketName = "bucketName_example"; // String | 
    String accountId = "accountId_example"; // String | 
    EventNotificationCreateQueueConfigRequest eventNotificationCreateQueueConfigRequest = new EventNotificationCreateQueueConfigRequest(); // EventNotificationCreateQueueConfigRequest | 
    try {
      EventNotificationCreateQueueConfig200Response result = apiInstance.eventNotificationCreateQueueConfig(queueId, bucketName, accountId, eventNotificationCreateQueueConfigRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling R2EventNotificationApi#eventNotificationCreateQueueConfig");
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
| **queueId** | **String**|  | |
| **bucketName** | **String**|  | |
| **accountId** | **String**|  | |
| **eventNotificationCreateQueueConfigRequest** | [**EventNotificationCreateQueueConfigRequest**](EventNotificationCreateQueueConfigRequest.md)|  | |

### Return type

[**EventNotificationCreateQueueConfig200Response**](EventNotificationCreateQueueConfig200Response.md)

### Authorization

[api_key](../README.md#api_key), [api_token](../README.md#api_token), [api_email](../README.md#api_email)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Create Configuration response |  -  |
| **409** | Duplicate Configuration failure |  -  |
| **4XX** | Create Configuration failure |  -  |

<a id="eventNotificationDeleteQueueConfig"></a>
# **eventNotificationDeleteQueueConfig**
> MqApiResponseCommon eventNotificationDeleteQueueConfig(queueId, bucketName, accountId)

Delete Configuration

Turn off all event notifications configured for delivery to a given queue. No further notifications will be produced for the queue once complete.

### Example
```java
// Import classes:
import cloudflare.ApiClient;
import cloudflare.ApiException;
import cloudflare.Configuration;
import cloudflare.auth.*;
import cloudflare.models.*;
import cloudflare.sdk.R2EventNotificationApi;

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

    R2EventNotificationApi apiInstance = new R2EventNotificationApi(defaultClient);
    String queueId = "queueId_example"; // String | 
    String bucketName = "bucketName_example"; // String | 
    String accountId = "accountId_example"; // String | 
    try {
      MqApiResponseCommon result = apiInstance.eventNotificationDeleteQueueConfig(queueId, bucketName, accountId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling R2EventNotificationApi#eventNotificationDeleteQueueConfig");
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
| **queueId** | **String**|  | |
| **bucketName** | **String**|  | |
| **accountId** | **String**|  | |

### Return type

[**MqApiResponseCommon**](MqApiResponseCommon.md)

### Authorization

[api_key](../README.md#api_key), [api_token](../README.md#api_token), [api_email](../README.md#api_email)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Delete Configuration response |  -  |
| **4XX** | Create Configuration failure |  -  |

<a id="eventNotificationGetR2BucketConfigs"></a>
# **eventNotificationGetR2BucketConfigs**
> EventNotificationGetR2BucketConfigs200Response eventNotificationGetR2BucketConfigs(bucketName, accountId)

Read Configuration

Returns all notification rules for each queue for which bucket notifications are produced.

### Example
```java
// Import classes:
import cloudflare.ApiClient;
import cloudflare.ApiException;
import cloudflare.Configuration;
import cloudflare.auth.*;
import cloudflare.models.*;
import cloudflare.sdk.R2EventNotificationApi;

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

    R2EventNotificationApi apiInstance = new R2EventNotificationApi(defaultClient);
    String bucketName = "bucketName_example"; // String | 
    String accountId = "accountId_example"; // String | 
    try {
      EventNotificationGetR2BucketConfigs200Response result = apiInstance.eventNotificationGetR2BucketConfigs(bucketName, accountId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling R2EventNotificationApi#eventNotificationGetR2BucketConfigs");
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
| **bucketName** | **String**|  | |
| **accountId** | **String**|  | |

### Return type

[**EventNotificationGetR2BucketConfigs200Response**](EventNotificationGetR2BucketConfigs200Response.md)

### Authorization

[api_key](../README.md#api_key), [api_token](../README.md#api_token), [api_email](../README.md#api_email)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Read Configuration response |  -  |
| **404** | No Configuration Found response |  -  |
| **4XX** | Read Configuration failure |  -  |

