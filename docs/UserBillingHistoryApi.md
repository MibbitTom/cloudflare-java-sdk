# UserBillingHistoryApi

All URIs are relative to *https://api.cloudflare.com/client/v4*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**userBillingHistoryDeprecatedBillingHistoryDetails**](UserBillingHistoryApi.md#userBillingHistoryDeprecatedBillingHistoryDetails) | **GET** /user/billing/history | Billing History Details |


<a id="userBillingHistoryDeprecatedBillingHistoryDetails"></a>
# **userBillingHistoryDeprecatedBillingHistoryDetails**
> BillSubsApiBillingHistoryCollection userBillingHistoryDeprecatedBillingHistoryDetails(page, perPage, order, occuredAt, occurredAt, type, action)

Billing History Details

Accesses your billing history object.

### Example
```java
// Import classes:
import cloudflare.ApiClient;
import cloudflare.ApiException;
import cloudflare.Configuration;
import cloudflare.auth.*;
import cloudflare.models.*;
import cloudflare.sdk.UserBillingHistoryApi;

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

    UserBillingHistoryApi apiInstance = new UserBillingHistoryApi(defaultClient);
    BigDecimal page = new BigDecimal("1"); // BigDecimal | 
    BigDecimal perPage = new BigDecimal("20"); // BigDecimal | 
    String order = "type"; // String | 
    OffsetDateTime occuredAt = OffsetDateTime.now(); // OffsetDateTime | 
    OffsetDateTime occurredAt = OffsetDateTime.now(); // OffsetDateTime | 
    String type = "charge"; // String | 
    String action = "subscription"; // String | 
    try {
      BillSubsApiBillingHistoryCollection result = apiInstance.userBillingHistoryDeprecatedBillingHistoryDetails(page, perPage, order, occuredAt, occurredAt, type, action);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling UserBillingHistoryApi#userBillingHistoryDeprecatedBillingHistoryDetails");
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
| **page** | **BigDecimal**|  | [optional] [default to 1] |
| **perPage** | **BigDecimal**|  | [optional] [default to 20] |
| **order** | **String**|  | [optional] [enum: type, occured_at, action] |
| **occuredAt** | **OffsetDateTime**|  | [optional] |
| **occurredAt** | **OffsetDateTime**|  | [optional] |
| **type** | **String**|  | [optional] |
| **action** | **String**|  | [optional] |

### Return type

[**BillSubsApiBillingHistoryCollection**](BillSubsApiBillingHistoryCollection.md)

### Authorization

[api_key](../README.md#api_key), [api_token](../README.md#api_token), [api_email](../README.md#api_email)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Billing History Details response |  -  |
| **4XX** | Billing History Details response failure |  -  |

