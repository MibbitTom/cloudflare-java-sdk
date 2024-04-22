# StreamWebhookApi

All URIs are relative to *https://api.cloudflare.com/client/v4*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**streamWebhookCreateWebhooks**](StreamWebhookApi.md#streamWebhookCreateWebhooks) | **PUT** /accounts/{account_id}/stream/webhook | Create webhooks |
| [**streamWebhookDeleteWebhooks**](StreamWebhookApi.md#streamWebhookDeleteWebhooks) | **DELETE** /accounts/{account_id}/stream/webhook | Delete webhooks |
| [**streamWebhookViewWebhooks**](StreamWebhookApi.md#streamWebhookViewWebhooks) | **GET** /accounts/{account_id}/stream/webhook | View webhooks |


<a id="streamWebhookCreateWebhooks"></a>
# **streamWebhookCreateWebhooks**
> StreamWebhookResponseSingle streamWebhookCreateWebhooks(accountId, streamWebhookRequest)

Create webhooks

Creates a webhook notification.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.StreamWebhookApi;

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

    StreamWebhookApi apiInstance = new StreamWebhookApi(defaultClient);
    String accountId = "accountId_example"; // String | 
    StreamWebhookRequest streamWebhookRequest = new StreamWebhookRequest(); // StreamWebhookRequest | 
    try {
      StreamWebhookResponseSingle result = apiInstance.streamWebhookCreateWebhooks(accountId, streamWebhookRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling StreamWebhookApi#streamWebhookCreateWebhooks");
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
| **streamWebhookRequest** | [**StreamWebhookRequest**](StreamWebhookRequest.md)|  | |

### Return type

[**StreamWebhookResponseSingle**](StreamWebhookResponseSingle.md)

### Authorization

[api_key](../README.md#api_key), [api_token](../README.md#api_token), [api_email](../README.md#api_email)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Create webhooks response |  -  |
| **4XX** | Create webhooks response failure |  -  |

<a id="streamWebhookDeleteWebhooks"></a>
# **streamWebhookDeleteWebhooks**
> StreamDeletedResponse streamWebhookDeleteWebhooks(accountId)

Delete webhooks

Deletes a webhook.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.StreamWebhookApi;

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

    StreamWebhookApi apiInstance = new StreamWebhookApi(defaultClient);
    String accountId = "accountId_example"; // String | 
    try {
      StreamDeletedResponse result = apiInstance.streamWebhookDeleteWebhooks(accountId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling StreamWebhookApi#streamWebhookDeleteWebhooks");
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

### Return type

[**StreamDeletedResponse**](StreamDeletedResponse.md)

### Authorization

[api_key](../README.md#api_key), [api_token](../README.md#api_token), [api_email](../README.md#api_email)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Delete webhooks response |  -  |
| **4XX** | Delete webhooks response failure |  -  |

<a id="streamWebhookViewWebhooks"></a>
# **streamWebhookViewWebhooks**
> StreamWebhookResponseSingle streamWebhookViewWebhooks(accountId)

View webhooks

Retrieves a list of webhooks.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.StreamWebhookApi;

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

    StreamWebhookApi apiInstance = new StreamWebhookApi(defaultClient);
    String accountId = "accountId_example"; // String | 
    try {
      StreamWebhookResponseSingle result = apiInstance.streamWebhookViewWebhooks(accountId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling StreamWebhookApi#streamWebhookViewWebhooks");
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

### Return type

[**StreamWebhookResponseSingle**](StreamWebhookResponseSingle.md)

### Authorization

[api_key](../README.md#api_key), [api_token](../README.md#api_token), [api_email](../README.md#api_email)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | View webhooks response |  -  |
| **4XX** | View webhooks response failure |  -  |

