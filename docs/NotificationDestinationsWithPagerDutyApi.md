# NotificationDestinationsWithPagerDutyApi

All URIs are relative to *https://api.cloudflare.com/client/v4*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**notificationDestinationsWithPagerDutyConnectPagerDuty**](NotificationDestinationsWithPagerDutyApi.md#notificationDestinationsWithPagerDutyConnectPagerDuty) | **POST** /accounts/{account_id}/alerting/v3/destinations/pagerduty/connect | Create PagerDuty integration token |
| [**notificationDestinationsWithPagerDutyConnectPagerDutyToken**](NotificationDestinationsWithPagerDutyApi.md#notificationDestinationsWithPagerDutyConnectPagerDutyToken) | **GET** /accounts/{account_id}/alerting/v3/destinations/pagerduty/connect/{token_id} | Connect PagerDuty |
| [**notificationDestinationsWithPagerDutyDeletePagerDutyServices**](NotificationDestinationsWithPagerDutyApi.md#notificationDestinationsWithPagerDutyDeletePagerDutyServices) | **DELETE** /accounts/{account_id}/alerting/v3/destinations/pagerduty | Delete PagerDuty Services |
| [**notificationDestinationsWithPagerDutyListPagerDutyServices**](NotificationDestinationsWithPagerDutyApi.md#notificationDestinationsWithPagerDutyListPagerDutyServices) | **GET** /accounts/{account_id}/alerting/v3/destinations/pagerduty | List PagerDuty services |


<a id="notificationDestinationsWithPagerDutyConnectPagerDuty"></a>
# **notificationDestinationsWithPagerDutyConnectPagerDuty**
> AaaSensitiveIdResponse notificationDestinationsWithPagerDutyConnectPagerDuty(accountId)

Create PagerDuty integration token

Creates a new token for integrating with PagerDuty.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.NotificationDestinationsWithPagerDutyApi;

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

    NotificationDestinationsWithPagerDutyApi apiInstance = new NotificationDestinationsWithPagerDutyApi(defaultClient);
    String accountId = "accountId_example"; // String | 
    try {
      AaaSensitiveIdResponse result = apiInstance.notificationDestinationsWithPagerDutyConnectPagerDuty(accountId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling NotificationDestinationsWithPagerDutyApi#notificationDestinationsWithPagerDutyConnectPagerDuty");
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

[**AaaSensitiveIdResponse**](AaaSensitiveIdResponse.md)

### Authorization

[api_key](../README.md#api_key), [api_token](../README.md#api_token), [api_email](../README.md#api_email)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **201** | Token for PagerDuty integration |  -  |
| **4XX** | Create a token for PagerDuty integration failure |  -  |

<a id="notificationDestinationsWithPagerDutyConnectPagerDutyToken"></a>
# **notificationDestinationsWithPagerDutyConnectPagerDutyToken**
> AaaIdResponse notificationDestinationsWithPagerDutyConnectPagerDutyToken(accountId, tokenId)

Connect PagerDuty

Links PagerDuty with the account using the integration token.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.NotificationDestinationsWithPagerDutyApi;

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

    NotificationDestinationsWithPagerDutyApi apiInstance = new NotificationDestinationsWithPagerDutyApi(defaultClient);
    String accountId = "accountId_example"; // String | 
    String tokenId = "tokenId_example"; // String | 
    try {
      AaaIdResponse result = apiInstance.notificationDestinationsWithPagerDutyConnectPagerDutyToken(accountId, tokenId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling NotificationDestinationsWithPagerDutyApi#notificationDestinationsWithPagerDutyConnectPagerDutyToken");
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
| **tokenId** | **String**|  | |

### Return type

[**AaaIdResponse**](AaaIdResponse.md)

### Authorization

[api_key](../README.md#api_key), [api_token](../README.md#api_token), [api_email](../README.md#api_email)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Create a Notification policy response |  -  |
| **4XX** | Create a Notification policy response failure |  -  |

<a id="notificationDestinationsWithPagerDutyDeletePagerDutyServices"></a>
# **notificationDestinationsWithPagerDutyDeletePagerDutyServices**
> AaaApiResponseCollection notificationDestinationsWithPagerDutyDeletePagerDutyServices(accountId)

Delete PagerDuty Services

Deletes all the PagerDuty Services connected to the account.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.NotificationDestinationsWithPagerDutyApi;

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

    NotificationDestinationsWithPagerDutyApi apiInstance = new NotificationDestinationsWithPagerDutyApi(defaultClient);
    String accountId = "accountId_example"; // String | 
    try {
      AaaApiResponseCollection result = apiInstance.notificationDestinationsWithPagerDutyDeletePagerDutyServices(accountId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling NotificationDestinationsWithPagerDutyApi#notificationDestinationsWithPagerDutyDeletePagerDutyServices");
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

[**AaaApiResponseCollection**](AaaApiResponseCollection.md)

### Authorization

[api_key](../README.md#api_key), [api_token](../README.md#api_token), [api_email](../README.md#api_email)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Delete PagerDuty Services response |  -  |
| **4XX** | Delete PagerDuty Services response failure |  -  |

<a id="notificationDestinationsWithPagerDutyListPagerDutyServices"></a>
# **notificationDestinationsWithPagerDutyListPagerDutyServices**
> AaaComponentsSchemasResponseCollection notificationDestinationsWithPagerDutyListPagerDutyServices(accountId)

List PagerDuty services

Get a list of all configured PagerDuty services.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.NotificationDestinationsWithPagerDutyApi;

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

    NotificationDestinationsWithPagerDutyApi apiInstance = new NotificationDestinationsWithPagerDutyApi(defaultClient);
    String accountId = "accountId_example"; // String | 
    try {
      AaaComponentsSchemasResponseCollection result = apiInstance.notificationDestinationsWithPagerDutyListPagerDutyServices(accountId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling NotificationDestinationsWithPagerDutyApi#notificationDestinationsWithPagerDutyListPagerDutyServices");
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

[**AaaComponentsSchemasResponseCollection**](AaaComponentsSchemasResponseCollection.md)

### Authorization

[api_key](../README.md#api_key), [api_token](../README.md#api_token), [api_email](../README.md#api_email)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | List PagerDuty services response |  -  |
| **4XX** | List PagerDuty services response failure |  -  |

