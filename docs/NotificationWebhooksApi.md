# NotificationWebhooksApi

All URIs are relative to *https://api.cloudflare.com/client/v4*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**notificationWebhooksCreateAWebhook**](NotificationWebhooksApi.md#notificationWebhooksCreateAWebhook) | **POST** /accounts/{account_id}/alerting/v3/destinations/webhooks | Create a webhook |
| [**notificationWebhooksDeleteAWebhook**](NotificationWebhooksApi.md#notificationWebhooksDeleteAWebhook) | **DELETE** /accounts/{account_id}/alerting/v3/destinations/webhooks/{webhook_id} | Delete a webhook |
| [**notificationWebhooksGetAWebhook**](NotificationWebhooksApi.md#notificationWebhooksGetAWebhook) | **GET** /accounts/{account_id}/alerting/v3/destinations/webhooks/{webhook_id} | Get a webhook |
| [**notificationWebhooksListWebhooks**](NotificationWebhooksApi.md#notificationWebhooksListWebhooks) | **GET** /accounts/{account_id}/alerting/v3/destinations/webhooks | List webhooks |
| [**notificationWebhooksUpdateAWebhook**](NotificationWebhooksApi.md#notificationWebhooksUpdateAWebhook) | **PUT** /accounts/{account_id}/alerting/v3/destinations/webhooks/{webhook_id} | Update a webhook |


<a id="notificationWebhooksCreateAWebhook"></a>
# **notificationWebhooksCreateAWebhook**
> AaaIdResponse notificationWebhooksCreateAWebhook(accountId, notificationWebhooksCreateAWebhookRequest)

Create a webhook

Creates a new webhook destination.

### Example
```java
// Import classes:
import cloudflare.ApiClient;
import cloudflare.ApiException;
import cloudflare.Configuration;
import cloudflare.auth.*;
import cloudflare.models.*;
import cloudflare.sdk.NotificationWebhooksApi;

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

    NotificationWebhooksApi apiInstance = new NotificationWebhooksApi(defaultClient);
    String accountId = "accountId_example"; // String | 
    NotificationWebhooksCreateAWebhookRequest notificationWebhooksCreateAWebhookRequest = new NotificationWebhooksCreateAWebhookRequest(); // NotificationWebhooksCreateAWebhookRequest | 
    try {
      AaaIdResponse result = apiInstance.notificationWebhooksCreateAWebhook(accountId, notificationWebhooksCreateAWebhookRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling NotificationWebhooksApi#notificationWebhooksCreateAWebhook");
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
| **notificationWebhooksCreateAWebhookRequest** | [**NotificationWebhooksCreateAWebhookRequest**](NotificationWebhooksCreateAWebhookRequest.md)|  | |

### Return type

[**AaaIdResponse**](AaaIdResponse.md)

### Authorization

[api_key](../README.md#api_key), [api_token](../README.md#api_token), [api_email](../README.md#api_email)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **201** | Create a webhook response |  -  |
| **4XX** | Create a webhook response failure |  -  |

<a id="notificationWebhooksDeleteAWebhook"></a>
# **notificationWebhooksDeleteAWebhook**
> AaaApiResponseCollection notificationWebhooksDeleteAWebhook(webhookId, accountId)

Delete a webhook

Delete a configured webhook destination.

### Example
```java
// Import classes:
import cloudflare.ApiClient;
import cloudflare.ApiException;
import cloudflare.Configuration;
import cloudflare.auth.*;
import cloudflare.models.*;
import cloudflare.sdk.NotificationWebhooksApi;

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

    NotificationWebhooksApi apiInstance = new NotificationWebhooksApi(defaultClient);
    String webhookId = "webhookId_example"; // String | 
    String accountId = "accountId_example"; // String | 
    try {
      AaaApiResponseCollection result = apiInstance.notificationWebhooksDeleteAWebhook(webhookId, accountId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling NotificationWebhooksApi#notificationWebhooksDeleteAWebhook");
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
| **webhookId** | **String**|  | |
| **accountId** | **String**|  | |

### Return type

[**AaaApiResponseCollection**](AaaApiResponseCollection.md)

### Authorization

[api_key](../README.md#api_key), [api_token](../README.md#api_token), [api_email](../README.md#api_email)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Delete a webhook response |  -  |
| **4XX** | Delete a webhook response failure |  -  |

<a id="notificationWebhooksGetAWebhook"></a>
# **notificationWebhooksGetAWebhook**
> AaaSchemasSingleResponse notificationWebhooksGetAWebhook(accountId, webhookId)

Get a webhook

Get details for a single webhooks destination.

### Example
```java
// Import classes:
import cloudflare.ApiClient;
import cloudflare.ApiException;
import cloudflare.Configuration;
import cloudflare.auth.*;
import cloudflare.models.*;
import cloudflare.sdk.NotificationWebhooksApi;

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

    NotificationWebhooksApi apiInstance = new NotificationWebhooksApi(defaultClient);
    String accountId = "accountId_example"; // String | 
    String webhookId = "webhookId_example"; // String | 
    try {
      AaaSchemasSingleResponse result = apiInstance.notificationWebhooksGetAWebhook(accountId, webhookId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling NotificationWebhooksApi#notificationWebhooksGetAWebhook");
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
| **webhookId** | **String**|  | |

### Return type

[**AaaSchemasSingleResponse**](AaaSchemasSingleResponse.md)

### Authorization

[api_key](../README.md#api_key), [api_token](../README.md#api_token), [api_email](../README.md#api_email)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Get a webhook response |  -  |
| **4XX** | Get a webhook response failure |  -  |

<a id="notificationWebhooksListWebhooks"></a>
# **notificationWebhooksListWebhooks**
> AaaWebhooksComponentsSchemasResponseCollection notificationWebhooksListWebhooks(accountId)

List webhooks

Gets a list of all configured webhook destinations.

### Example
```java
// Import classes:
import cloudflare.ApiClient;
import cloudflare.ApiException;
import cloudflare.Configuration;
import cloudflare.auth.*;
import cloudflare.models.*;
import cloudflare.sdk.NotificationWebhooksApi;

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

    NotificationWebhooksApi apiInstance = new NotificationWebhooksApi(defaultClient);
    String accountId = "accountId_example"; // String | 
    try {
      AaaWebhooksComponentsSchemasResponseCollection result = apiInstance.notificationWebhooksListWebhooks(accountId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling NotificationWebhooksApi#notificationWebhooksListWebhooks");
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

[**AaaWebhooksComponentsSchemasResponseCollection**](AaaWebhooksComponentsSchemasResponseCollection.md)

### Authorization

[api_key](../README.md#api_key), [api_token](../README.md#api_token), [api_email](../README.md#api_email)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | List webhooks response |  -  |
| **4XX** | List webhooks response failure |  -  |

<a id="notificationWebhooksUpdateAWebhook"></a>
# **notificationWebhooksUpdateAWebhook**
> AaaIdResponse notificationWebhooksUpdateAWebhook(webhookId, accountId, notificationWebhooksCreateAWebhookRequest)

Update a webhook

Update a webhook destination.

### Example
```java
// Import classes:
import cloudflare.ApiClient;
import cloudflare.ApiException;
import cloudflare.Configuration;
import cloudflare.auth.*;
import cloudflare.models.*;
import cloudflare.sdk.NotificationWebhooksApi;

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

    NotificationWebhooksApi apiInstance = new NotificationWebhooksApi(defaultClient);
    String webhookId = "webhookId_example"; // String | 
    String accountId = "accountId_example"; // String | 
    NotificationWebhooksCreateAWebhookRequest notificationWebhooksCreateAWebhookRequest = new NotificationWebhooksCreateAWebhookRequest(); // NotificationWebhooksCreateAWebhookRequest | 
    try {
      AaaIdResponse result = apiInstance.notificationWebhooksUpdateAWebhook(webhookId, accountId, notificationWebhooksCreateAWebhookRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling NotificationWebhooksApi#notificationWebhooksUpdateAWebhook");
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
| **webhookId** | **String**|  | |
| **accountId** | **String**|  | |
| **notificationWebhooksCreateAWebhookRequest** | [**NotificationWebhooksCreateAWebhookRequest**](NotificationWebhooksCreateAWebhookRequest.md)|  | |

### Return type

[**AaaIdResponse**](AaaIdResponse.md)

### Authorization

[api_key](../README.md#api_key), [api_token](../README.md#api_token), [api_email](../README.md#api_email)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Update a webhook response |  -  |
| **4XX** | Update a webhook response failure |  -  |

