# NotificationAlertTypesApi

All URIs are relative to *https://api.cloudflare.com/client/v4*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**notificationAlertTypesGetAlertTypes**](NotificationAlertTypesApi.md#notificationAlertTypesGetAlertTypes) | **GET** /accounts/{account_id}/alerting/v3/available_alerts | Get Alert Types |


<a id="notificationAlertTypesGetAlertTypes"></a>
# **notificationAlertTypesGetAlertTypes**
> AaaResponseCollection notificationAlertTypesGetAlertTypes(accountId)

Get Alert Types

Gets a list of all alert types for which an account is eligible.

### Example
```java
// Import classes:
import cloudflare.ApiClient;
import cloudflare.ApiException;
import cloudflare.Configuration;
import cloudflare.auth.*;
import cloudflare.models.*;
import cloudflare.sdk.NotificationAlertTypesApi;

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

    NotificationAlertTypesApi apiInstance = new NotificationAlertTypesApi(defaultClient);
    String accountId = "accountId_example"; // String | 
    try {
      AaaResponseCollection result = apiInstance.notificationAlertTypesGetAlertTypes(accountId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling NotificationAlertTypesApi#notificationAlertTypesGetAlertTypes");
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

[**AaaResponseCollection**](AaaResponseCollection.md)

### Authorization

[api_key](../README.md#api_key), [api_token](../README.md#api_token), [api_email](../README.md#api_email)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Get Alert Types response |  -  |
| **4XX** | Get Alert Types response failure |  -  |

