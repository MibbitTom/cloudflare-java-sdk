# NotificationHistoryApi

All URIs are relative to *https://api.cloudflare.com/client/v4*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**notificationHistoryListHistory**](NotificationHistoryApi.md#notificationHistoryListHistory) | **GET** /accounts/{account_id}/alerting/v3/history | List History |


<a id="notificationHistoryListHistory"></a>
# **notificationHistoryListHistory**
> AaaHistoryComponentsSchemasResponseCollection notificationHistoryListHistory(accountId, perPage, before, page, since)

List History

Gets a list of history records for notifications sent to an account. The records are displayed for last &#x60;x&#x60; number of days based on the zone plan (free &#x3D; 30, pro &#x3D; 30, biz &#x3D; 30, ent &#x3D; 90).

### Example
```java
// Import classes:
import cloudflare.ApiClient;
import cloudflare.ApiException;
import cloudflare.Configuration;
import cloudflare.auth.*;
import cloudflare.models.*;
import cloudflare.sdk.NotificationHistoryApi;

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

    NotificationHistoryApi apiInstance = new NotificationHistoryApi(defaultClient);
    String accountId = "accountId_example"; // String | 
    BigDecimal perPage = new BigDecimal("25"); // BigDecimal | 
    OffsetDateTime before = OffsetDateTime.now(); // OffsetDateTime | 
    BigDecimal page = new BigDecimal("1"); // BigDecimal | 
    OffsetDateTime since = OffsetDateTime.parse("2022-05-19T20:29:58.679897Z"); // OffsetDateTime | 
    try {
      AaaHistoryComponentsSchemasResponseCollection result = apiInstance.notificationHistoryListHistory(accountId, perPage, before, page, since);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling NotificationHistoryApi#notificationHistoryListHistory");
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
| **perPage** | **BigDecimal**|  | [optional] [default to 25] |
| **before** | **OffsetDateTime**|  | [optional] |
| **page** | **BigDecimal**|  | [optional] [default to 1] |
| **since** | **OffsetDateTime**|  | [optional] |

### Return type

[**AaaHistoryComponentsSchemasResponseCollection**](AaaHistoryComponentsSchemasResponseCollection.md)

### Authorization

[api_key](../README.md#api_key), [api_token](../README.md#api_token), [api_email](../README.md#api_email)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | List History response |  -  |
| **4XX** | List History response failure |  -  |

